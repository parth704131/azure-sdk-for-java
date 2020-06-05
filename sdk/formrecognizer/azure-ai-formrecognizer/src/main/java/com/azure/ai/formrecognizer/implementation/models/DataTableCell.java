// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DataTableCell model. */
@Fluent
public final class DataTableCell {
    /*
     * Row index of the cell.
     */
    @JsonProperty(value = "rowIndex", required = true)
    private int rowIndex;

    /*
     * Column index of the cell.
     */
    @JsonProperty(value = "columnIndex", required = true)
    private int columnIndex;

    /*
     * Number of rows spanned by this cell.
     */
    @JsonProperty(value = "rowSpan")
    private Integer rowSpan;

    /*
     * Number of columns spanned by this cell.
     */
    @JsonProperty(value = "columnSpan")
    private Integer columnSpan;

    /*
     * Text content of the cell.
     */
    @JsonProperty(value = "text", required = true)
    private String text;

    /*
     * Bounding box of the cell.
     */
    @JsonProperty(value = "boundingBox", required = true)
    private List<Float> boundingBox;

    /*
     * Confidence value.
     */
    @JsonProperty(value = "confidence", required = true)
    private float confidence;

    /*
     * When includeTextDetails is set to true, a list of references to the text
     * elements constituting this table cell.
     */
    @JsonProperty(value = "elements")
    private List<String> elements;

    /*
     * Is the current cell a header cell?
     */
    @JsonProperty(value = "isHeader")
    private Boolean isHeader;

    /*
     * Is the current cell a footer cell?
     */
    @JsonProperty(value = "isFooter")
    private Boolean isFooter;

    /**
     * Get the rowIndex property: Row index of the cell.
     *
     * @return the rowIndex value.
     */
    public int getRowIndex() {
        return this.rowIndex;
    }

    /**
     * Set the rowIndex property: Row index of the cell.
     *
     * @param rowIndex the rowIndex value to set.
     * @return the DataTableCell object itself.
     */
    public DataTableCell setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
        return this;
    }

    /**
     * Get the columnIndex property: Column index of the cell.
     *
     * @return the columnIndex value.
     */
    public int getColumnIndex() {
        return this.columnIndex;
    }

    /**
     * Set the columnIndex property: Column index of the cell.
     *
     * @param columnIndex the columnIndex value to set.
     * @return the DataTableCell object itself.
     */
    public DataTableCell setColumnIndex(int columnIndex) {
        this.columnIndex = columnIndex;
        return this;
    }

    /**
     * Get the rowSpan property: Number of rows spanned by this cell.
     *
     * @return the rowSpan value.
     */
    public Integer getRowSpan() {
        return this.rowSpan;
    }

    /**
     * Set the rowSpan property: Number of rows spanned by this cell.
     *
     * @param rowSpan the rowSpan value to set.
     * @return the DataTableCell object itself.
     */
    public DataTableCell setRowSpan(Integer rowSpan) {
        this.rowSpan = rowSpan;
        return this;
    }

    /**
     * Get the columnSpan property: Number of columns spanned by this cell.
     *
     * @return the columnSpan value.
     */
    public Integer getColumnSpan() {
        return this.columnSpan;
    }

    /**
     * Set the columnSpan property: Number of columns spanned by this cell.
     *
     * @param columnSpan the columnSpan value to set.
     * @return the DataTableCell object itself.
     */
    public DataTableCell setColumnSpan(Integer columnSpan) {
        this.columnSpan = columnSpan;
        return this;
    }

    /**
     * Get the text property: Text content of the cell.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text property: Text content of the cell.
     *
     * @param text the text value to set.
     * @return the DataTableCell object itself.
     */
    public DataTableCell setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the boundingBox property: Bounding box of the cell.
     *
     * @return the boundingBox value.
     */
    public List<Float> getBoundingBox() {
        return this.boundingBox;
    }

    /**
     * Set the boundingBox property: Bounding box of the cell.
     *
     * @param boundingBox the boundingBox value to set.
     * @return the DataTableCell object itself.
     */
    public DataTableCell setBoundingBox(List<Float> boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    /**
     * Get the confidence property: Confidence value.
     *
     * @return the confidence value.
     */
    public float getConfidence() {
        return this.confidence;
    }

    /**
     * Set the confidence property: Confidence value.
     *
     * @param confidence the confidence value to set.
     * @return the DataTableCell object itself.
     */
    public DataTableCell setConfidence(float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * Get the elements property: When includeTextDetails is set to true, a list of references to the text elements
     * constituting this table cell.
     *
     * @return the elements value.
     */
    public List<String> getElements() {
        return this.elements;
    }

    /**
     * Set the elements property: When includeTextDetails is set to true, a list of references to the text elements
     * constituting this table cell.
     *
     * @param elements the elements value to set.
     * @return the DataTableCell object itself.
     */
    public DataTableCell setElements(List<String> elements) {
        this.elements = elements;
        return this;
    }

    /**
     * Get the isHeader property: Is the current cell a header cell?.
     *
     * @return the isHeader value.
     */
    public Boolean isHeader() {
        return this.isHeader;
    }

    /**
     * Set the isHeader property: Is the current cell a header cell?.
     *
     * @param isHeader the isHeader value to set.
     * @return the DataTableCell object itself.
     */
    public DataTableCell setIsHeader(Boolean isHeader) {
        this.isHeader = isHeader;
        return this;
    }

    /**
     * Get the isFooter property: Is the current cell a footer cell?.
     *
     * @return the isFooter value.
     */
    public Boolean isFooter() {
        return this.isFooter;
    }

    /**
     * Set the isFooter property: Is the current cell a footer cell?.
     *
     * @param isFooter the isFooter value to set.
     * @return the DataTableCell object itself.
     */
    public DataTableCell setIsFooter(Boolean isFooter) {
        this.isFooter = isFooter;
        return this;
    }
}
