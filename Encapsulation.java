class Employee {
    // we made our fields private
    private int empid;
    private String ename;

    // and gave access to them through public methods
    public int getEmpid() {
        return empid;
    }
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
}
