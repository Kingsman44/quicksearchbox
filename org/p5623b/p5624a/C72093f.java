package org.p5623b.p5624a;

/* renamed from: org.b.a.f */
/* compiled from: PG */
public final class C72093f {

    /* renamed from: a */
    static final C72092e[] f191911a = new C72092e[0];

    /* renamed from: b */
    public int f191912b;

    /* renamed from: c */
    private C72092e[] f191913c;

    /* renamed from: d */
    private boolean f191914d;

    public C72093f() {
        this(10);
    }

    /* renamed from: c */
    static C72092e[] m105548c(C72092e[] eVarArr) {
        return eVarArr.length <= 0 ? f191911a : (C72092e[]) eVarArr.clone();
    }

    /* renamed from: a */
    public final C72092e mo63278a(int i) {
        int i2 = this.f191912b;
        if (i < i2) {
            return this.f191913c[i];
        }
        throw new ArrayIndexOutOfBoundsException(i + " >= " + i2);
    }

    /* renamed from: b */
    public final void mo63279b(C72092e eVar) {
        if (eVar != null) {
            int length = this.f191913c.length;
            boolean z = true;
            int i = this.f191912b + 1;
            if (i <= length) {
                z = false;
            }
            if (z || this.f191914d) {
                C72092e[] eVarArr = new C72092e[Math.max(length, (i >> 1) + i)];
                System.arraycopy(this.f191913c, 0, eVarArr, 0, this.f191912b);
                this.f191913c = eVarArr;
                this.f191914d = false;
            }
            this.f191913c[this.f191912b] = eVar;
            this.f191912b = i;
            return;
        }
        throw new NullPointerException("'element' cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C72092e[] mo63280d() {
        int i = this.f191912b;
        if (i == 0) {
            return f191911a;
        }
        C72092e[] eVarArr = this.f191913c;
        if (eVarArr.length == i) {
            this.f191914d = true;
            return eVarArr;
        }
        C72092e[] eVarArr2 = new C72092e[i];
        System.arraycopy(eVarArr, 0, eVarArr2, 0, i);
        return eVarArr2;
    }

    public C72093f(int i) {
        if (i >= 0) {
            this.f191913c = i == 0 ? f191911a : new C72092e[i];
            this.f191912b = 0;
            this.f191914d = false;
            return;
        }
        throw new IllegalArgumentException("'initialCapacity' must not be negative");
    }
}
