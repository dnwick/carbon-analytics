/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.streaming.integrator.core.siddhi.error.handler.dto;

/**
 * Class that maps individual database entries from resources/error-store-queries.yaml.
 */
public class RDBMSQueryConfigurationEntry {
    private String databaseName;
    private String isTableExistQuery;
    private String createTableQuery;
    private String insertTableQuery;
    private String selectTableQuery;
    private String minimalSelectTableQuery;
    private String singleSelectTableQuery;
    private String selectWithLimitOffsetQuery;
    private String minimalSelectWithLimitOffsetQuery;
    private String selectCountQuery;
    private String selectCountBySiddhiAppNameQuery;
    private String deleteQuery;
    private String purgeQuery;
    private String deleteBySiddhiAppNameQuery;

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getCreateTableQuery() {
        return createTableQuery;
    }

    public void setCreateTableQuery(String createTableQuery) {
        this.createTableQuery = createTableQuery;
    }

    public String getInsertTableQuery() {
        return insertTableQuery;
    }

    public void setInsertTableQuery(String insertTableQuery) {
        this.insertTableQuery = insertTableQuery;
    }

    public String getIsTableExistQuery() {
        return isTableExistQuery;
    }

    public void setIsTableExistQuery(String isTableExistQuery) {
        this.isTableExistQuery = isTableExistQuery;
    }

    public String getSelectTableQuery() {
        return selectTableQuery;
    }

    public void setSelectTableQuery(String selectTableQuery) {
        this.selectTableQuery = selectTableQuery;
    }

    public String getMinimalSelectTableQuery() {
        return minimalSelectTableQuery;
    }

    public void setMinimalSelectTableQuery(String minimalSelectTableQuery) {
        this.minimalSelectTableQuery = minimalSelectTableQuery;
    }

    public String getSingleSelectTableQuery() {
        return singleSelectTableQuery;
    }

    public void setSingleSelectTableQuery(String singleSelectTableQuery) {
        this.singleSelectTableQuery = singleSelectTableQuery;
    }

    public String getSelectCountQuery() {
        return selectCountQuery;
    }

    public void setSelectCountQuery(String selectCountQuery) {
        this.selectCountQuery = selectCountQuery;
    }

    public String getSelectWithLimitOffsetQuery() {
        return selectWithLimitOffsetQuery;
    }

    public void setSelectWithLimitOffsetQuery(String selectWithLimitOffsetQuery) {
        this.selectWithLimitOffsetQuery = selectWithLimitOffsetQuery;
    }

    public String getMinimalSelectWithLimitOffsetQuery() {
        return minimalSelectWithLimitOffsetQuery;
    }

    public void setMinimalSelectWithLimitOffsetQuery(String minimalSelectWithLimitOffsetQuery) {
        this.minimalSelectWithLimitOffsetQuery = minimalSelectWithLimitOffsetQuery;
    }

    public String getSelectCountBySiddhiAppNameQuery() {
        return selectCountBySiddhiAppNameQuery;
    }

    public void setSelectCountBySiddhiAppNameQuery(String selectCountBySiddhiAppNameQuery) {
        this.selectCountBySiddhiAppNameQuery = selectCountBySiddhiAppNameQuery;
    }

    public String getDeleteQuery() {
        return deleteQuery;
    }

    public void setDeleteQuery(String deleteQuery) {
        this.deleteQuery = deleteQuery;
    }

    public String getPurgeQuery() {
        return purgeQuery;
    }

    public void setPurgeQuery(String purgeQuery) {
        this.purgeQuery = purgeQuery;
    }

    public String getDeleteBySiddhiAppNameQuery() {
        return deleteBySiddhiAppNameQuery;
    }

    public void setDeleteBySiddhiAppNameQuery(String deleteBySiddhiAppNameQuery) {
        this.deleteBySiddhiAppNameQuery = deleteBySiddhiAppNameQuery;
    }
}
