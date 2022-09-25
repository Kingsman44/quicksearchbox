package com.google.android.libraries.social.populous.p3296e.p3301e;

import com.google.android.libraries.social.populous.core.AutoValue_MatchInfo;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.social.populous.e.e.d */
/* compiled from: PG */
final class C42515d {

    /* renamed from: a */
    public int f111491a = -1;

    /* renamed from: b */
    public char f111492b = 0;

    /* renamed from: c */
    public final C58480gp f111493c = C58485gu.m89837e();

    /* renamed from: d */
    public boolean f111494d = false;

    /* renamed from: e */
    public int f111495e = -1;

    /* renamed from: f */
    public int f111496f = -1;

    /* renamed from: g */
    private final String f111497g;

    public C42515d(String str) {
        str.getClass();
        this.f111497g = str;
    }

    /* renamed from: a */
    public final void mo45529a() {
        if (this.f111494d) {
            this.f111493c.mo55395g(new AutoValue_MatchInfo(this.f111495e, this.f111496f));
            this.f111494d = false;
            this.f111495e = -1;
            this.f111496f = -1;
        }
    }

    /* renamed from: b */
    public final void mo45530b() {
        mo45535g(-1);
        mo45537i();
    }

    /* renamed from: c */
    public final void mo45531c() {
        mo45535g(this.f111497g.length());
        mo45536h();
    }

    /* renamed from: d */
    public final boolean mo45532d() {
        return mo45535g(this.f111491a + 1);
    }

    /* renamed from: e */
    public final boolean mo45533e() {
        char c = this.f111492b;
        return c >= '0' && c <= '9';
    }

    /* renamed from: f */
    public final boolean mo45534f() {
        int i = this.f111491a;
        return i >= 0 && i < this.f111497g.length();
    }

    /* renamed from: g */
    public final boolean mo45535g(int i) {
        this.f111491a = i;
        if (mo45534f()) {
            this.f111492b = this.f111497g.charAt(this.f111491a);
            return true;
        }
        this.f111492b = 0;
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000e, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45536h() {
        /*
            r1 = this;
        L_0x0000:
            int r0 = r1.f111491a
            int r0 = r0 + -1
            boolean r0 = r1.mo45535g(r0)
            if (r0 == 0) goto L_0x0010
            boolean r0 = r1.mo45533e()
            if (r0 == 0) goto L_0x0000
        L_0x0010:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.p3296e.p3301e.C42515d.mo45536h():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45537i() {
        /*
            r1 = this;
        L_0x0000:
            boolean r0 = r1.mo45532d()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.mo45533e()
            if (r0 == 0) goto L_0x0000
        L_0x000c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.p3296e.p3301e.C42515d.mo45537i():void");
    }
}
