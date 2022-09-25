package com.google.common.p4522b;

/* renamed from: com.google.common.b.pp */
/* compiled from: PG */
public final class C58723pp extends C58468gd {

    /* renamed from: a */
    static final C58723pp f156466a = new C58723pp();

    /* renamed from: b */
    final transient Object[] f156467b;

    /* renamed from: c */
    public final transient C58723pp f156468c;

    /* renamed from: d */
    private final transient Object f156469d;

    /* renamed from: e */
    private final transient int f156470e;

    /* renamed from: f */
    private final transient int f156471f;

    private C58723pp() {
        this.f156469d = null;
        this.f156467b = new Object[0];
        this.f156470e = 0;
        this.f156471f = 0;
        this.f156468c = this;
    }

    private C58723pp(Object obj, Object[] objArr, int i, C58723pp ppVar) {
        this.f156469d = obj;
        this.f156467b = objArr;
        this.f156470e = 1;
        this.f156471f = i;
        this.f156468c = ppVar;
    }

    public C58723pp(Object[] objArr, int i) {
        this.f156467b = objArr;
        this.f156471f = i;
        this.f156470e = 0;
        int A = i >= 2 ? C58528ij.m90002A(i) : 0;
        this.f156469d = C58729pv.m90560e(objArr, i, A, 0);
        this.f156468c = new C58723pp(C58729pv.m90560e(objArr, i, A, 1), objArr, i, this);
    }

    /* renamed from: b */
    public final C58468gd mo55367b() {
        return this.f156468c;
    }

    /* renamed from: c */
    public final boolean mo55193c() {
        return false;
    }

    /* renamed from: d */
    public final C58528ij mo55194d() {
        return new C58727pt(this, new C58728pu(this.f156467b, this.f156470e, this.f156471f));
    }

    public final Object get(Object obj) {
        Object x = C58729pv.m90561x(this.f156469d, this.f156467b, this.f156471f, this.f156470e, obj);
        if (x == null) {
            return null;
        }
        return x;
    }

    /* renamed from: lE */
    public final C58528ij mo55439lE() {
        return new C58726ps(this, this.f156467b, this.f156470e, this.f156471f);
    }

    public final int size() {
        return this.f156471f;
    }
}
