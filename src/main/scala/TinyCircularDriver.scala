import tiny_circular_simple_implicit._

object TinyCircularDriver extends App
{
    val m = new M_TINY("Tiny");
    type T_Tiny = m.T_Result;
    val t_Tiny = m.t_Result;

    val b = t_Tiny.v_branch(t_Tiny.v_leaf(3),t_Tiny.v_leaf(4));
    val r = t_Tiny.v_root(b);

    Debug.activate();

    m.finish();

    val classDef = new M_TINY_CIRCULAR_SIMPLE("Test Simple Cycle",m);
    // val instance = w.asInstanceOf[classDef.T_Root];

    // println("leaves is " + m2);

    println("Hello world!")
}
