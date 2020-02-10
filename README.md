# aps-type-problem
Stuck with type definition of APS `MAX_LATTICE`

Error log

```
Information:2/9/20, 2:30 AM - Build completed with 1 error and 0 warnings in 1 s 371 ms
/home/amir-pc/IdeaProjects/circular-test/src/main/scala/test-coll.scala
    Error:Error:line (42)type mismatch;
 found   : M_MAX_LATTICE[basic_implicit.T_Integer]
    (which expands to)  M_MAX_LATTICE[Int]
 required: C_TYPE[M_TEST_COLL.this.T_IntegerMaxLattice] with C_MAX_LATTICE[M_TEST_COLL.this.T_IntegerMaxLattice,basic_implicit.T_Integer]
    (which expands to)  C_TYPE[Int] with C_MAX_LATTICE[Int,Int]
  val t_IntegerMaxLattice = new M_MAX_LATTICE[T_Integer]("IntegerMaxLattice",t_Integer,0);
  ```

## Update

Solution was to make `M_MAX_LATTICE` and `M_MIN_LATTICE` implement `C_TYPE[T]` trait
