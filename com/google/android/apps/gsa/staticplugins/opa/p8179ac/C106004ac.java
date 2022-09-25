package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.p1528m.p1529a.C18430o;
import com.google.android.libraries.assistant.p1528m.p1529a.C18431p;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58837ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.ac */
/* compiled from: PG */
final class C106004ac implements C22868d {

    /* renamed from: a */
    final /* synthetic */ String f295943a;

    /* renamed from: b */
    final /* synthetic */ String f295944b;

    /* renamed from: c */
    final /* synthetic */ C106025ax f295945c;

    public C106004ac(C106025ax axVar, String str, String str2) {
        this.f295945c = axVar;
        this.f295943a = str;
        this.f295944b = str2;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        if (th instanceof Exception) {
            ((C18431p) this.f295945c.f296005c.mo56107c()).mo23961g(this.f295943a, C18430o.ERROR, this.f295944b, C58837ba.m90858g(th.getMessage()));
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        Void voidR = (Void) obj;
        ((C18431p) this.f295945c.f296005c.mo56107c()).mo23961g(this.f295943a, C18430o.OK, this.f295944b, BuildConfig.FLAVOR);
    }
}
