package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.app.Activity;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C113973bs;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C113974bt;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C113975bu;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.ej */
/* compiled from: PG */
public final class C108321ej {

    /* renamed from: a */
    public static final C59071e f301321a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.chatui.ej");

    /* renamed from: b */
    public final C22871g f301322b;

    /* renamed from: c */
    public boolean f301323c = true;

    /* renamed from: d */
    public boolean f301324d = false;

    /* renamed from: e */
    C108317eg f301325e;

    /* renamed from: f */
    public C113973bs f301326f;

    /* renamed from: g */
    public C113975bu f301327g;

    /* renamed from: h */
    public C113974bt f301328h;

    /* renamed from: i */
    private final C86124t f301329i;

    /* renamed from: j */
    private final Activity f301330j;

    public C108321ej(C86124t tVar, Activity activity, C22871g gVar) {
        this.f301329i = tVar;
        this.f301330j = activity;
        this.f301322b = gVar;
    }

    /* renamed from: a */
    public final void mo96779a(C108320ei eiVar) {
        if (!TextUtils.isEmpty(eiVar.mo96696i()) && this.f301327g != null) {
            this.f301322b.mo28213m("Handle edit query", this.f301329i.mo79743a(C90014bt.f247215cu), new C108311ea(this, eiVar));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r0.intValue() == 0) goto L_0x0025;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96780b(com.google.android.apps.gsa.staticplugins.opa.chatui.C108320ei r4) {
        /*
            r3 = this;
            boolean r0 = r3.f301324d
            r1 = 1
            if (r0 == 0) goto L_0x0034
            java.lang.Integer r0 = r4.mo96777g()
            if (r0 == 0) goto L_0x0034
            java.lang.Integer r0 = r4.mo96777g()
            r0.getClass()
            int r0 = r0.intValue()
            if (r0 == r1) goto L_0x0025
            java.lang.Integer r0 = r4.mo96777g()
            r0.getClass()
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0034
        L_0x0025:
            java.lang.String r0 = r4.mo96696i()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0030
            return
        L_0x0030:
            r3.mo96779a(r4)
            return
        L_0x0034:
            java.lang.String r0 = r4.mo96778h()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x003f
            return
        L_0x003f:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.bt r2 = r3.f301328h
            if (r2 == 0) goto L_0x005c
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r2 = r2.f315609a
            java.lang.String r1 = r2.mo101007bi(r1, r0)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x005c
            com.google.android.apps.gsa.staticplugins.opa.chatui.w r4 = new com.google.android.apps.gsa.staticplugins.opa.chatui.w
            r4.<init>()
            r4.f301855a = r0
            r4.f301856b = r1
            com.google.android.apps.gsa.staticplugins.opa.chatui.ei r4 = r4.mo96774a()
        L_0x005c:
            com.google.android.apps.gsa.staticplugins.opa.chatui.eg r0 = new com.google.android.apps.gsa.staticplugins.opa.chatui.eg
            r0.<init>()
            r0.f301317a = r3
            r0.f301318b = r4
            r3.f301325e = r0
            android.app.Activity r4 = r3.f301330j
            android.app.FragmentManager r4 = r4.getFragmentManager()
            android.app.FragmentTransaction r4 = r4.beginTransaction()
            com.google.android.apps.gsa.staticplugins.opa.chatui.eg r0 = r3.f301325e
            r0.getClass()
            java.lang.String r1 = "popup"
            android.app.FragmentTransaction r4 = r4.add(r0, r1)
            r4.commitAllowingStateLoss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.chatui.C108321ej.mo96780b(com.google.android.apps.gsa.staticplugins.opa.chatui.ei):void");
    }
}
