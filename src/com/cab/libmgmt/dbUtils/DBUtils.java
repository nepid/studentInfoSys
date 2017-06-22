/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cab.libmgmt.dbUtils;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class DBUtils {

    public static DefaultTableModel buildTableModel(ResultSet rs) {
        List<List<Object>> data = null;
        List<String> columnNames = null;
        try {
            ResultSetMetaData metaData = rs.getMetaData();

            // names of columns
            columnNames = new ArrayList<>();
            int columnCount = metaData.getColumnCount();
            for (int column = 1; column <= columnCount; column++) {
                columnNames.add(metaData.getColumnName(column));
            }

            // data of the table
            data = new ArrayList<>();
            while (rs.next()) {
                List<Object> listOfObjects = new ArrayList<>();
                for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                    listOfObjects.add(rs.getObject(columnIndex));
                }
                data.add(listOfObjects);
            }


        } catch (SQLException ex) {
            Logger.getLogger(DBUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return createModel(data,columnNames);
    }

    private static DefaultTableModel createModel(List<List<Object>> list, List<String> columnNames) {
        
        DefaultTableModel model = new DefaultTableModel(columnNames.toArray(), 0);
        for (List<Object> row : list) {
            model.addRow(row.toArray());
        }

        return model;
    }
}
