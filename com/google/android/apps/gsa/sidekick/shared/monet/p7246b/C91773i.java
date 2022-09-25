package com.google.android.apps.gsa.sidekick.shared.monet.p7246b;

import android.view.View;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.b.i */
/* compiled from: PG */
public final class C91773i implements C91770f {

    /* renamed from: a */
    public static final C58485gu f255918a = C58485gu.m89846n(0);

    /* renamed from: b */
    public int f255919b = -2147483647;

    /* renamed from: c */
    public int f255920c = -2147483647;

    /* renamed from: d */
    public View.OnLayoutChangeListener f255921d;

    /* renamed from: e */
    private C91771g f255922e;

    /* renamed from: f */
    private View f255923f;

    /* renamed from: g */
    private final C22945j f255924g;

    /* renamed from: h */
    private boolean f255925h = false;

    public C91773i(C22945j jVar) {
        this.f255924g = jVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x000c  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m150368k() {
        /*
            r4 = this;
            android.view.View r0 = r4.f255923f
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.view.View r2 = r0.getRootView()
        L_0x000a:
            if (r0 == r2) goto L_0x0025
            int r3 = r0.getVisibility()
            if (r3 == 0) goto L_0x0013
            return r1
        L_0x0013:
            android.view.ViewParent r3 = r0.getParent()
            boolean r3 = r3 instanceof android.view.View
            if (r3 != 0) goto L_0x001c
            return r1
        L_0x001c:
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x0025:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91773i.m150368k():boolean");
    }

    /* renamed from: a */
    public final void mo86282a() {
        this.f255925h = true;
        this.f255919b = -2147483647;
        this.f255920c = -2147483647;
    }

    /* renamed from: b */
    public final void mo86283b(View view) {
        if (!view.isLayoutRequested() && this.f255925h) {
            mo86284c(view.getMeasuredHeight(), view.getMeasuredWidth());
        }
        C91772h hVar = new C91772h(this);
        this.f255921d = hVar;
        view.addOnLayoutChangeListener(hVar);
        this.f255923f = view;
    }

    /* renamed from: c */
    public final void mo86284c(int i, int i2) {
        if (this.f255919b != i || this.f255920c != i2) {
            this.f255919b = i;
            this.f255920c = i2;
            this.f255925h = false;
            C91771g gVar = this.f255922e;
            if (gVar != null) {
                gVar.mo86271k(this.f255924g.mo28342l(), i, i2);
            }
        }
    }

    /* renamed from: e */
    public final int mo86264e() {
        return this.f255919b;
    }

    /* renamed from: f */
    public final int mo86265f() {
        return this.f255920c;
    }

    /* renamed from: g */
    public final int mo86266g(int i, List list, int i2) {
        return mo86267h();
    }

    /* renamed from: h */
    public final int mo86267h() {
        View view = this.f255923f;
        if (view == null || !m150368k()) {
            return -2147483647;
        }
        int[] iArr = {-2147483647, -2147483647};
        view.getLocationInWindow(iArr);
        return iArr[1];
    }

    /* renamed from: iH */
    public final String mo86268iH() {
        return this.f255924g.mo28342l();
    }

    /* renamed from: iZ */
    public final int mo86269iZ() {
        View view = this.f255923f;
        if (view == null || !m150368k()) {
            return -2147483647;
        }
        int[] iArr = {-2147483647, -2147483647};
        view.getLocationInWindow(iArr);
        return iArr[0];
    }

    /* renamed from: j */
    public final List mo86270j() {
        return f255918a;
    }

    /* renamed from: r */
    public final void mo86278r(C91771g gVar) {
        this.f255922e = gVar;
        if (gVar != null && this.f255919b != -2147483647 && this.f255920c != -2147483647) {
            gVar.mo86271k(this.f255924g.mo28342l(), this.f255919b, this.f255920c);
        }
    }
}
