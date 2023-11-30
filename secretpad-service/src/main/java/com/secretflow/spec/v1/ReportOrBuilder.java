// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: secretflow/spec/v1/report.proto

package com.secretflow.spec.v1;

public interface ReportOrBuilder extends
    // @@protoc_insertion_point(interface_extends:secretflow.spec.v1.Report)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the Report.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the Report.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string desc = 2;</code>
   * @return The desc.
   */
  java.lang.String getDesc();
  /**
   * <code>string desc = 2;</code>
   * @return The bytes for desc.
   */
  com.google.protobuf.ByteString
      getDescBytes();

  /**
   * <code>repeated .secretflow.spec.v1.Tab tabs = 3;</code>
   */
  java.util.List<com.secretflow.spec.v1.Tab> 
      getTabsList();
  /**
   * <code>repeated .secretflow.spec.v1.Tab tabs = 3;</code>
   */
  com.secretflow.spec.v1.Tab getTabs(int index);
  /**
   * <code>repeated .secretflow.spec.v1.Tab tabs = 3;</code>
   */
  int getTabsCount();
  /**
   * <code>repeated .secretflow.spec.v1.Tab tabs = 3;</code>
   */
  java.util.List<? extends com.secretflow.spec.v1.TabOrBuilder> 
      getTabsOrBuilderList();
  /**
   * <code>repeated .secretflow.spec.v1.Tab tabs = 3;</code>
   */
  com.secretflow.spec.v1.TabOrBuilder getTabsOrBuilder(
      int index);

  /**
   * <code>int32 err_code = 4;</code>
   * @return The errCode.
   */
  int getErrCode();

  /**
   * <pre>
   * Structed error detail (JSON encoded message).
   * </pre>
   *
   * <code>string err_detail = 5;</code>
   * @return The errDetail.
   */
  java.lang.String getErrDetail();
  /**
   * <pre>
   * Structed error detail (JSON encoded message).
   * </pre>
   *
   * <code>string err_detail = 5;</code>
   * @return The bytes for errDetail.
   */
  com.google.protobuf.ByteString
      getErrDetailBytes();
}