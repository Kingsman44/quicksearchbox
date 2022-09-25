package com.google.p4272br;

import java.util.Map;

/* renamed from: com.google.br.k */
/* compiled from: PG */
public final class C56442k {

    /* renamed from: a */
    public final int f150755a;

    /* renamed from: b */
    public C56444m f150756b;

    /* renamed from: c */
    private final C56449r f150757c;

    /* renamed from: d */
    private final int[] f150758d;

    /* renamed from: e */
    private final Map f150759e;

    /* renamed from: f */
    private int f150760f;

    /* renamed from: g */
    private boolean f150761g;

    /* renamed from: h */
    private boolean f150762h;

    /* renamed from: i */
    private int f150763i;

    public C56442k(C56449r rVar, CharSequence charSequence) {
        this.f150757c = rVar;
        C56453v vVar = rVar.f150777b;
        int i = vVar.f150786d;
        this.f150755a = i;
        this.f150758d = new int[(i + i + 2)];
        this.f150759e = vVar.f150789g;
        this.f150756b = new C56443l(charSequence);
        mo54388i();
    }

    /* renamed from: j */
    private final void m88139j(int i) {
        int i2;
        if (i < 0 || i > (i2 = this.f150755a)) {
            throw new IndexOutOfBoundsException("Group index out of bounds: " + i);
        } else if (!this.f150761g) {
            throw new IllegalStateException("perhaps no match attempted");
        } else if (i != 0 && !this.f150762h) {
            int[] iArr = this.f150758d;
            int i3 = iArr[1] + 1;
            int i4 = this.f150760f;
            if (this.f150757c.f150777b.mo54418a(this.f150756b, iArr[0], i3 > i4 ? i4 : i3, this.f150763i, iArr, i2 + 1)) {
                this.f150762h = true;
                return;
            }
            throw new IllegalStateException("inconsistency in matching group data");
        }
    }

    /* renamed from: k */
    private final boolean m88140k(int i, int i2) {
        if (!this.f150757c.f150777b.mo54418a(this.f150756b, i, this.f150760f, i2, this.f150758d, 1)) {
            return false;
        }
        this.f150761g = true;
        this.f150762h = false;
        this.f150763i = i2;
        return true;
    }

    /* renamed from: a */
    public final int mo54380a(int i) {
        m88139j(i);
        return this.f150758d[i + i + 1];
    }

    /* renamed from: b */
    public final int mo54381b(String str) {
        Integer num = (Integer) this.f150759e.get(str);
        if (num != null) {
            return mo54380a(num.intValue());
        }
        throw new IllegalArgumentException("group '" + str + "' not found");
    }

    /* renamed from: c */
    public final int mo54382c(int i) {
        m88139j(i);
        return this.f150758d[i + i];
    }

    /* renamed from: d */
    public final int mo54383d(String str) {
        Integer num = (Integer) this.f150759e.get(str);
        if (num != null) {
            return mo54382c(num.intValue());
        }
        throw new IllegalArgumentException("group '" + str + "' not found");
    }

    /* renamed from: e */
    public final String mo54384e(int i) {
        int c = mo54382c(i);
        int a = mo54380a(i);
        if (c >= 0 || a >= 0) {
            return ((C56443l) this.f150756b).f150764a.subSequence(c, a).toString();
        }
        return null;
    }

    /* renamed from: f */
    public final String mo54385f(String str) {
        Integer num = (Integer) this.f150759e.get(str);
        if (num != null) {
            return mo54384e(num.intValue());
        }
        throw new IllegalArgumentException("group '" + str + "' not found");
    }

    /* renamed from: g */
    public final boolean mo54386g() {
        int i;
        if (this.f150761g) {
            int[] iArr = this.f150758d;
            i = iArr[1];
            if (iArr[0] == i) {
                i++;
            }
        } else {
            i = 0;
        }
        return m88140k(i, 0);
    }

    /* renamed from: h */
    public final boolean mo54387h() {
        return m88140k(0, 2);
    }

    /* renamed from: i */
    public final void mo54388i() {
        this.f150760f = ((C56443l) this.f150756b).f150764a.length();
        this.f150761g = false;
        this.f150762h = false;
    }
}
