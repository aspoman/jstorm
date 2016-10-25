/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package backtype.storm.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-12-22")
public class TopologyInfo implements org.apache.thrift.TBase<TopologyInfo, TopologyInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TopologyInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TopologyInfo");

  private static final org.apache.thrift.protocol.TField TOPOLOGY_FIELD_DESC = new org.apache.thrift.protocol.TField("topology", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField COMPONENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("components", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField TASKS_FIELD_DESC = new org.apache.thrift.protocol.TField("tasks", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField METRICS_FIELD_DESC = new org.apache.thrift.protocol.TField("metrics", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TopologyInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TopologyInfoTupleSchemeFactory());
  }

  private TopologySummary topology; // required
  private List<ComponentSummary> components; // required
  private List<TaskSummary> tasks; // required
  private TopologyMetric metrics; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOPOLOGY((short)1, "topology"),
    COMPONENTS((short)2, "components"),
    TASKS((short)3, "tasks"),
    METRICS((short)4, "metrics");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TOPOLOGY
          return TOPOLOGY;
        case 2: // COMPONENTS
          return COMPONENTS;
        case 3: // TASKS
          return TASKS;
        case 4: // METRICS
          return METRICS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOPOLOGY, new org.apache.thrift.meta_data.FieldMetaData("topology", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TopologySummary.class)));
    tmpMap.put(_Fields.COMPONENTS, new org.apache.thrift.meta_data.FieldMetaData("components", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ComponentSummary.class))));
    tmpMap.put(_Fields.TASKS, new org.apache.thrift.meta_data.FieldMetaData("tasks", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TaskSummary.class))));
    tmpMap.put(_Fields.METRICS, new org.apache.thrift.meta_data.FieldMetaData("metrics", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TopologyMetric.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TopologyInfo.class, metaDataMap);
  }

  public TopologyInfo() {
  }

  public TopologyInfo(
    TopologySummary topology,
    List<ComponentSummary> components,
    List<TaskSummary> tasks,
    TopologyMetric metrics)
  {
    this();
    this.topology = topology;
    this.components = components;
    this.tasks = tasks;
    this.metrics = metrics;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TopologyInfo(TopologyInfo other) {
    if (other.is_set_topology()) {
      this.topology = new TopologySummary(other.topology);
    }
    if (other.is_set_components()) {
      List<ComponentSummary> __this__components = new ArrayList<ComponentSummary>(other.components.size());
      for (ComponentSummary other_element : other.components) {
        __this__components.add(new ComponentSummary(other_element));
      }
      this.components = __this__components;
    }
    if (other.is_set_tasks()) {
      List<TaskSummary> __this__tasks = new ArrayList<TaskSummary>(other.tasks.size());
      for (TaskSummary other_element : other.tasks) {
        __this__tasks.add(new TaskSummary(other_element));
      }
      this.tasks = __this__tasks;
    }
    if (other.is_set_metrics()) {
      this.metrics = new TopologyMetric(other.metrics);
    }
  }

  public TopologyInfo deepCopy() {
    return new TopologyInfo(this);
  }

  @Override
  public void clear() {
    this.topology = null;
    this.components = null;
    this.tasks = null;
    this.metrics = null;
  }

  public TopologySummary get_topology() {
    return this.topology;
  }

  public void set_topology(TopologySummary topology) {
    this.topology = topology;
  }

  public void unset_topology() {
    this.topology = null;
  }

  /** Returns true if field topology is set (has been assigned a value) and false otherwise */
  public boolean is_set_topology() {
    return this.topology != null;
  }

  public void set_topology_isSet(boolean value) {
    if (!value) {
      this.topology = null;
    }
  }

  public int get_components_size() {
    return (this.components == null) ? 0 : this.components.size();
  }

  public java.util.Iterator<ComponentSummary> get_components_iterator() {
    return (this.components == null) ? null : this.components.iterator();
  }

  public void add_to_components(ComponentSummary elem) {
    if (this.components == null) {
      this.components = new ArrayList<ComponentSummary>();
    }
    this.components.add(elem);
  }

  public List<ComponentSummary> get_components() {
    return this.components;
  }

  public void set_components(List<ComponentSummary> components) {
    this.components = components;
  }

  public void unset_components() {
    this.components = null;
  }

  /** Returns true if field components is set (has been assigned a value) and false otherwise */
  public boolean is_set_components() {
    return this.components != null;
  }

  public void set_components_isSet(boolean value) {
    if (!value) {
      this.components = null;
    }
  }

  public int get_tasks_size() {
    return (this.tasks == null) ? 0 : this.tasks.size();
  }

  public java.util.Iterator<TaskSummary> get_tasks_iterator() {
    return (this.tasks == null) ? null : this.tasks.iterator();
  }

  public void add_to_tasks(TaskSummary elem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<TaskSummary>();
    }
    this.tasks.add(elem);
  }

  public List<TaskSummary> get_tasks() {
    return this.tasks;
  }

  public void set_tasks(List<TaskSummary> tasks) {
    this.tasks = tasks;
  }

  public void unset_tasks() {
    this.tasks = null;
  }

  /** Returns true if field tasks is set (has been assigned a value) and false otherwise */
  public boolean is_set_tasks() {
    return this.tasks != null;
  }

  public void set_tasks_isSet(boolean value) {
    if (!value) {
      this.tasks = null;
    }
  }

  public TopologyMetric get_metrics() {
    return this.metrics;
  }

  public void set_metrics(TopologyMetric metrics) {
    this.metrics = metrics;
  }

  public void unset_metrics() {
    this.metrics = null;
  }

  /** Returns true if field metrics is set (has been assigned a value) and false otherwise */
  public boolean is_set_metrics() {
    return this.metrics != null;
  }

  public void set_metrics_isSet(boolean value) {
    if (!value) {
      this.metrics = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPOLOGY:
      if (value == null) {
        unset_topology();
      } else {
        set_topology((TopologySummary)value);
      }
      break;

    case COMPONENTS:
      if (value == null) {
        unset_components();
      } else {
        set_components((List<ComponentSummary>)value);
      }
      break;

    case TASKS:
      if (value == null) {
        unset_tasks();
      } else {
        set_tasks((List<TaskSummary>)value);
      }
      break;

    case METRICS:
      if (value == null) {
        unset_metrics();
      } else {
        set_metrics((TopologyMetric)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPOLOGY:
      return get_topology();

    case COMPONENTS:
      return get_components();

    case TASKS:
      return get_tasks();

    case METRICS:
      return get_metrics();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPOLOGY:
      return is_set_topology();
    case COMPONENTS:
      return is_set_components();
    case TASKS:
      return is_set_tasks();
    case METRICS:
      return is_set_metrics();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TopologyInfo)
      return this.equals((TopologyInfo)that);
    return false;
  }

  public boolean equals(TopologyInfo that) {
    if (that == null)
      return false;

    boolean this_present_topology = true && this.is_set_topology();
    boolean that_present_topology = true && that.is_set_topology();
    if (this_present_topology || that_present_topology) {
      if (!(this_present_topology && that_present_topology))
        return false;
      if (!this.topology.equals(that.topology))
        return false;
    }

    boolean this_present_components = true && this.is_set_components();
    boolean that_present_components = true && that.is_set_components();
    if (this_present_components || that_present_components) {
      if (!(this_present_components && that_present_components))
        return false;
      if (!this.components.equals(that.components))
        return false;
    }

    boolean this_present_tasks = true && this.is_set_tasks();
    boolean that_present_tasks = true && that.is_set_tasks();
    if (this_present_tasks || that_present_tasks) {
      if (!(this_present_tasks && that_present_tasks))
        return false;
      if (!this.tasks.equals(that.tasks))
        return false;
    }

    boolean this_present_metrics = true && this.is_set_metrics();
    boolean that_present_metrics = true && that.is_set_metrics();
    if (this_present_metrics || that_present_metrics) {
      if (!(this_present_metrics && that_present_metrics))
        return false;
      if (!this.metrics.equals(that.metrics))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_topology = true && (is_set_topology());
    list.add(present_topology);
    if (present_topology)
      list.add(topology);

    boolean present_components = true && (is_set_components());
    list.add(present_components);
    if (present_components)
      list.add(components);

    boolean present_tasks = true && (is_set_tasks());
    list.add(present_tasks);
    if (present_tasks)
      list.add(tasks);

    boolean present_metrics = true && (is_set_metrics());
    list.add(present_metrics);
    if (present_metrics)
      list.add(metrics);

    return list.hashCode();
  }

  @Override
  public int compareTo(TopologyInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_topology()).compareTo(other.is_set_topology());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_topology()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.topology, other.topology);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_components()).compareTo(other.is_set_components());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_components()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.components, other.components);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_tasks()).compareTo(other.is_set_tasks());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_tasks()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tasks, other.tasks);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_metrics()).compareTo(other.is_set_metrics());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_metrics()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metrics, other.metrics);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TopologyInfo(");
    boolean first = true;

    sb.append("topology:");
    if (this.topology == null) {
      sb.append("null");
    } else {
      sb.append(this.topology);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("components:");
    if (this.components == null) {
      sb.append("null");
    } else {
      sb.append(this.components);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tasks:");
    if (this.tasks == null) {
      sb.append("null");
    } else {
      sb.append(this.tasks);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("metrics:");
    if (this.metrics == null) {
      sb.append("null");
    } else {
      sb.append(this.metrics);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_topology()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'topology' is unset! Struct:" + toString());
    }

    if (!is_set_components()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'components' is unset! Struct:" + toString());
    }

    if (!is_set_tasks()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tasks' is unset! Struct:" + toString());
    }

    if (!is_set_metrics()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'metrics' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (topology != null) {
      topology.validate();
    }
    if (metrics != null) {
      metrics.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TopologyInfoStandardSchemeFactory implements SchemeFactory {
    public TopologyInfoStandardScheme getScheme() {
      return new TopologyInfoStandardScheme();
    }
  }

  private static class TopologyInfoStandardScheme extends StandardScheme<TopologyInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TopologyInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPOLOGY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.topology = new TopologySummary();
              struct.topology.read(iprot);
              struct.set_topology_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COMPONENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list178 = iprot.readListBegin();
                struct.components = new ArrayList<ComponentSummary>(_list178.size);
                ComponentSummary _elem179;
                for (int _i180 = 0; _i180 < _list178.size; ++_i180)
                {
                  _elem179 = new ComponentSummary();
                  _elem179.read(iprot);
                  struct.components.add(_elem179);
                }
                iprot.readListEnd();
              }
              struct.set_components_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TASKS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list181 = iprot.readListBegin();
                struct.tasks = new ArrayList<TaskSummary>(_list181.size);
                TaskSummary _elem182;
                for (int _i183 = 0; _i183 < _list181.size; ++_i183)
                {
                  _elem182 = new TaskSummary();
                  _elem182.read(iprot);
                  struct.tasks.add(_elem182);
                }
                iprot.readListEnd();
              }
              struct.set_tasks_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // METRICS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.metrics = new TopologyMetric();
              struct.metrics.read(iprot);
              struct.set_metrics_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TopologyInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topology != null) {
        oprot.writeFieldBegin(TOPOLOGY_FIELD_DESC);
        struct.topology.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.components != null) {
        oprot.writeFieldBegin(COMPONENTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.components.size()));
          for (ComponentSummary _iter184 : struct.components)
          {
            _iter184.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.tasks != null) {
        oprot.writeFieldBegin(TASKS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.tasks.size()));
          for (TaskSummary _iter185 : struct.tasks)
          {
            _iter185.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.metrics != null) {
        oprot.writeFieldBegin(METRICS_FIELD_DESC);
        struct.metrics.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TopologyInfoTupleSchemeFactory implements SchemeFactory {
    public TopologyInfoTupleScheme getScheme() {
      return new TopologyInfoTupleScheme();
    }
  }

  private static class TopologyInfoTupleScheme extends TupleScheme<TopologyInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TopologyInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.topology.write(oprot);
      {
        oprot.writeI32(struct.components.size());
        for (ComponentSummary _iter186 : struct.components)
        {
          _iter186.write(oprot);
        }
      }
      {
        oprot.writeI32(struct.tasks.size());
        for (TaskSummary _iter187 : struct.tasks)
        {
          _iter187.write(oprot);
        }
      }
      struct.metrics.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TopologyInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.topology = new TopologySummary();
      struct.topology.read(iprot);
      struct.set_topology_isSet(true);
      {
        org.apache.thrift.protocol.TList _list188 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.components = new ArrayList<ComponentSummary>(_list188.size);
        ComponentSummary _elem189;
        for (int _i190 = 0; _i190 < _list188.size; ++_i190)
        {
          _elem189 = new ComponentSummary();
          _elem189.read(iprot);
          struct.components.add(_elem189);
        }
      }
      struct.set_components_isSet(true);
      {
        org.apache.thrift.protocol.TList _list191 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.tasks = new ArrayList<TaskSummary>(_list191.size);
        TaskSummary _elem192;
        for (int _i193 = 0; _i193 < _list191.size; ++_i193)
        {
          _elem192 = new TaskSummary();
          _elem192.read(iprot);
          struct.tasks.add(_elem192);
        }
      }
      struct.set_tasks_isSet(true);
      struct.metrics = new TopologyMetric();
      struct.metrics.read(iprot);
      struct.set_metrics_isSet(true);
    }
  }

}

