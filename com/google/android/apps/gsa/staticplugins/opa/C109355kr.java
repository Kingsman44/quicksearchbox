package com.google.android.apps.gsa.staticplugins.opa;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.kr */
/* compiled from: PG */
abstract class C109355kr {
    /* renamed from: e */
    static C109355kr m182051e(String str) {
        C113896v vVar = new C113896v();
        vVar.f315349b = Optional.m71637of(str);
        vVar.mo97792d(str, 123397);
        return vVar.mo97789a();
    }

    /* renamed from: f */
    static C109355kr m182052f(View view) {
        C108212aj h = m182053h(view);
        h.f300978d = 126414;
        C113896v vVar = new C113896v();
        vVar.f315348a = h;
        return vVar.mo97789a();
    }

    /* renamed from: h */
    public static C108212aj m182053h(View view) {
        return new C108212aj(view, 1);
    }

    /* renamed from: a */
    public abstract C109353kp mo97795a();

    /* renamed from: b */
    public abstract C108232bc mo97796b();

    /* renamed from: c */
    public abstract Optional mo97797c();

    /* renamed from: d */
    public abstract Optional mo97798d();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C109355kr mo97799g(C109354kq kqVar) {
        C109353kp a = mo97795a();
        a.mo97790b(kqVar);
        return a.mo97789a();
    }
}
