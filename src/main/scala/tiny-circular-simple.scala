// Generated by aps2scala version 0.3.6
import basic_implicit._;
object tiny_circular_simple_implicit {
  val tiny_circular_simple_loaded = true;
  import basic_implicit._;
  import tiny_implicit._;
  type T_TINY_CIRCULAR_SIMPLE[T_T] = T_T;
}
import tiny_circular_simple_implicit._;

import basic_implicit._;
import tiny_implicit._;
trait C_TINY_CIRCULAR_SIMPLE[T_Result, T_T] extends C_TYPE[T_Result] with C_TINY[T_Result] {
  type T_Integers;
  val t_Integers : C_TYPE[T_Integers]with C_INTEGER[T_Integers];
  type T_IntegerLattice;
  val t_IntegerLattice : C_TYPE[T_IntegerLattice]with C_MAX_LATTICE[T_IntegerLattice,T_Integer];
  val v_s_bag1 : (T_Wood) => T_IntegerLattice;
  val v_s_bag2 : (T_Wood) => T_IntegerLattice;
  val v_s : (T_Wood) => T_Integer;
  val v_result : (T_Root) => T_Integers;
}

class M_TINY_CIRCULAR_SIMPLE[T_T](name : String,val t_T : C_TYPE[T_T] with C_TINY[T_T])
  extends Module(name)
    with C_TINY_CIRCULAR_SIMPLE[T_T,T_T]
{
  type T_Result = T_T;
  val v_equal = t_T.v_equal;
  val v_string = t_T.v_string;
  val v_assert = t_T.v_assert;
  val v_node_equivalent = t_T.v_node_equivalent;
  type T_Root = t_T.T_Root;
  val t_Root = t_T.t_Root;
  type T_Wood = t_T.T_Wood;
  val t_Wood = t_T.t_Wood;
  val p_root = t_T.p_root;
  val v_root = t_T.v_root;
  val p_branch = t_T.p_branch;
  val v_branch = t_T.v_branch;
  val p_leaf = t_T.p_leaf;
  val v_leaf = t_T.v_leaf;

  val t_Result : this.type = this;
  type T_Integers = T_Integer;
  val t_Integers = t_Integer;
  val t_IntegerLattice = new M_MAX_LATTICE[T_Integer]("IntegerLattice",t_Integer,0);
  type T_IntegerLattice = /*TI*/T_MAX_LATTICE[T_Integer];
  private class E_s_bag1(anchor : T_Wood) extends Evaluation[T_Wood,T_IntegerLattice](anchor,anchor.toString()+"."+"s_bag1") with CircularEvaluation[T_Wood,T_IntegerLattice] {
    def lattice() : C_LATTICE[T_IntegerLattice] = t_IntegerLattice;

    override def compute : ValueType = c_s_bag1(anchor);
  }
  private object a_s_bag1 extends Attribute[T_Wood,T_IntegerLattice](t_Wood,t_IntegerLattice,"s_bag1") {
    override def createEvaluation(anchor : T_Wood) : Evaluation[T_Wood,T_IntegerLattice] = new E_s_bag1(anchor);
  }
  val v_s_bag1 : T_Wood => T_IntegerLattice = a_s_bag1.get _;

  private class E_s_bag2(anchor : T_Wood) extends Evaluation[T_Wood,T_IntegerLattice](anchor,anchor.toString()+"."+"s_bag2") with CircularEvaluation[T_Wood,T_IntegerLattice] {
    def lattice() : C_LATTICE[T_IntegerLattice] = t_IntegerLattice;

    override def compute : ValueType = c_s_bag2(anchor);
  }
  private object a_s_bag2 extends Attribute[T_Wood,T_IntegerLattice](t_Wood,t_IntegerLattice,"s_bag2") {
    override def createEvaluation(anchor : T_Wood) : Evaluation[T_Wood,T_IntegerLattice] = new E_s_bag2(anchor);
  }
  val v_s_bag2 : T_Wood => T_IntegerLattice = a_s_bag2.get _;

  private class E_s(anchor : T_Wood) extends Evaluation[T_Wood,T_Integer](anchor,anchor.toString()+"."+"s") {
    override def compute : ValueType = c_s(anchor);
  }
  private object a_s extends Attribute[T_Wood,T_Integer](t_Wood,t_Integer,"s") {
    override def createEvaluation(anchor : T_Wood) : Evaluation[T_Wood,T_Integer] = new E_s(anchor);
  }
  val v_s : T_Wood => T_Integer = a_s.get _;

  private class E_result(anchor : T_Root) extends Evaluation[T_Root,T_Integers](anchor,anchor.toString()+"."+"result") {
    override def compute : ValueType = c_result(anchor);
  }
  private object a_result extends Attribute[T_Root,T_Integers](t_Root,t_Integers,"result") {
    override def createEvaluation(anchor : T_Root) : Evaluation[T_Root,T_Integers] = new E_result(anchor);
  }
  val v_result : T_Root => T_Integers = a_result.get _;

  private class E1_i(anchor : t_Result.T_Wood) extends Evaluation[t_Result.T_Wood,T_IntegerLattice](anchor,anchor.toString()+"."+"i") with CircularEvaluation[t_Result.T_Wood,T_IntegerLattice] {
    def lattice() : C_LATTICE[T_IntegerLattice] = t_IntegerLattice;

    override def compute : ValueType = c1_i(anchor);
  }
  private object a1_i extends Attribute[t_Result.T_Wood,T_IntegerLattice](t_Result.t_Wood,t_IntegerLattice,"i") {
    override def createEvaluation(anchor : t_Result.T_Wood) : Evaluation[t_Result.T_Wood,T_IntegerLattice] = new E1_i(anchor);
  }
  private class E2_i(anchor : t_Result.T_Root) extends Evaluation[t_Result.T_Root,T_IntegerLattice](anchor,anchor.toString()+"."+"i") with CircularEvaluation[t_Result.T_Root,T_IntegerLattice] {
    def lattice() : C_LATTICE[T_IntegerLattice] = t_IntegerLattice;

    override def compute : ValueType = c2_i(anchor);
  }
  private object a2_i extends Attribute[t_Result.T_Root,T_IntegerLattice](t_Result.t_Root,t_IntegerLattice,"i") {
    override def createEvaluation(anchor : t_Result.T_Root) : Evaluation[t_Result.T_Root,T_IntegerLattice] = new E2_i(anchor);
  }
  def c1_i(anchor : Any) : T_IntegerLattice = {
    anchor match {
      case p_branch(v_b,v_x,v_y) => {
        return v_s_bag2(v_b);
      }
    }
  }
  def c2_i(anchor : Any) : T_IntegerLattice = {
    anchor match {
      case p_root(v_p,v_b) => {
        return v_s_bag1(v_b);
      }
    }
  }
  def c_s_bag1(anode : T_Wood) : T_IntegerLattice = {
    val anchor = anode;
    anchor match {
      case p_leaf(v_l,v_x) => {
        if (anode eq v_l) return v_x;
      }
      case _ => {}
    }
    anchor match {
      case p_branch(v_b,v_x,v_y) => {
        val amir: C_NUMERIC[T_Integer] = t_IntegerLattice
        if (anode eq v_b) return new M__basic_4[ T_IntegerLattice](amir).v__op_s(v_s_bag1(v_x),v_s_bag1(v_y));
      }
      case _ => {}
    }
    throw Evaluation.UndefinedAttributeException(anode.toString()+".s_bag1");
  }
  def c_s_bag2(anode : T_Wood) : T_IntegerLattice = {
    val anchor = anode.parent;
    if (!(anchor eq null)) {
      val anchorNodes = anchor.myType.nodes;
      if (anchorNodes == t_Result.t_Wood.nodes) anchor match {
        case p_branch(v_b,v_x,v_y) => {
          if (anode eq v_x) return a1_i.get(anchor);
          if (anode eq v_y) return a1_i.get(anchor);
        }
        case _ => {}
      }
      if (anchorNodes == t_Result.t_Root.nodes) anchor match {
        case p_root(v_p,v_b) => {
          if (anode eq v_b) return new M__basic_13[ T_IntegerLattice](t_IntegerLattice).v_max(a2_i.get(anchor),5);
        }
        case _ => {}
      }
    }
    throw Evaluation.UndefinedAttributeException(anode.toString()+".s_bag2");
  }
  def c_s(anode : T_Wood) : T_Integer = {
    val anchor = anode;
    anchor match {
      case p_leaf(v_l,v_x) => {
        if (anode eq v_l) return v_s_bag2(v_l);
      }
      case _ => {}
    }
    anchor match {
      case p_branch(v_b,v_x,v_y) => {
        if (anode eq v_b) return new M__basic_4[ T_Integer](t_Integer).v__op_s(v_s(v_x),v_s(v_y));
      }
      case _ => {}
    }
    throw Evaluation.UndefinedAttributeException(anode.toString()+".s");
  }
  def c_result(anode : T_Root) : T_Integers = {
    val anchor = anode;
    anchor match {
      case p_root(v_p,v_b) => {
        if (anode eq v_p) return v_s(v_b);
      }
      case _ => {}
    }
    throw Evaluation.UndefinedAttributeException(anode.toString()+".result");
  }
  override def finish() : Unit = {
    a_s_bag1.finish;
    a_s_bag2.finish;
    a_s.finish;
    a_result.finish;
    super.finish();
  }

}

