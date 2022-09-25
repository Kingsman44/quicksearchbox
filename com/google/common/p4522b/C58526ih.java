package com.google.common.p4522b;

import p3186j$.util.Objects;

/* renamed from: com.google.common.b.ih */
/* compiled from: PG */
public class C58526ih extends C58469ge {

    /* renamed from: d */
    Object[] f156175d;

    /* renamed from: e */
    private int f156176e;

    public C58526ih() {
        super(4);
    }

    /* renamed from: j */
    public final void mo55490j(C58526ih ihVar) {
        if (this.f156175d != null) {
            for (int i = 0; i < ihVar.f156095b; i++) {
                mo55373c(Objects.requireNonNull(ihVar.f156094a[i]));
            }
            return;
        }
        mo55371a(ihVar.f156094a, ihVar.f156095b);
    }

    public C58526ih(int i) {
        super(i);
        this.f156175d = new Object[C58528ij.m90002A(i)];
    }

    /* renamed from: h */
    public final void mo55488h(Object... objArr) {
        if (this.f156175d != null) {
            for (Object g : objArr) {
                mo55373c(g);
            }
            return;
        }
        mo55371a(objArr, objArr.length);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.common.b.pz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.google.common.b.ij} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.common.b.pz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.google.common.b.pz} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.common.p4522b.C58528ij mo55486f() {
        /*
            r9 = this;
            int r0 = r9.f156095b
            if (r0 == 0) goto L_0x0057
            r1 = 1
            if (r0 == r1) goto L_0x0048
            java.lang.Object[] r2 = r9.f156175d
            if (r2 == 0) goto L_0x0034
            int r0 = com.google.common.p4522b.C58528ij.m90002A(r0)
            java.lang.Object[] r2 = r9.f156175d
            int r2 = r2.length
            if (r0 != r2) goto L_0x0034
            int r0 = r9.f156095b
            java.lang.Object[] r2 = r9.f156094a
            int r3 = r2.length
            boolean r3 = com.google.common.p4522b.C58528ij.m90016P(r0, r3)
            if (r3 == 0) goto L_0x0023
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
        L_0x0023:
            r4 = r2
            com.google.common.b.pz r0 = new com.google.common.b.pz
            int r5 = r9.f156176e
            java.lang.Object[] r6 = r9.f156175d
            int r2 = r6.length
            int r7 = r2 + -1
            int r8 = r9.f156095b
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x0042
        L_0x0034:
            int r0 = r9.f156095b
            java.lang.Object[] r2 = r9.f156094a
            com.google.common.b.ij r0 = com.google.common.p4522b.C58528ij.m90004D(r0, r2)
            int r2 = r0.size()
            r9.f156095b = r2
        L_0x0042:
            r9.f156096c = r1
            r1 = 0
            r9.f156175d = r1
            return r0
        L_0x0048:
            java.lang.Object[] r0 = r9.f156094a
            r1 = 0
            r0 = r0[r1]
            java.lang.Object r0 = p3186j$.util.Objects.requireNonNull(r0)
            com.google.common.b.qy r1 = new com.google.common.b.qy
            r1.<init>(r0)
            return r1
        L_0x0057:
            com.google.common.b.pz r0 = com.google.common.p4522b.C58733pz.f156496a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4522b.C58526ih.mo55486f():com.google.common.b.ij");
    }

    /* renamed from: i */
    public final void mo55489i(Iterable iterable) {
        iterable.getClass();
        if (this.f156175d != null) {
            for (Object g : iterable) {
                mo55373c(g);
            }
            return;
        }
        super.mo55374d(iterable);
    }

    /* renamed from: g */
    public final void mo55373c(Object obj) {
        obj.getClass();
        if (this.f156175d != null) {
            int A = C58528ij.m90002A(this.f156095b);
            Object[] objArr = this.f156175d;
            if (A <= objArr.length) {
                Objects.requireNonNull(objArr);
                int length = this.f156175d.length - 1;
                int hashCode = obj.hashCode();
                int a = C58462fy.m89757a(hashCode);
                while (true) {
                    int i = a & length;
                    Object[] objArr2 = this.f156175d;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.f156176e += hashCode;
                        super.mo55372b(obj);
                        return;
                    } else if (!obj2.equals(obj)) {
                        a = i + 1;
                    } else {
                        return;
                    }
                }
            }
        }
        this.f156175d = null;
        super.mo55372b(obj);
    }
}
