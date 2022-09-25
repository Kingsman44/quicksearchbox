package com.google.android.apps.search.googleapp.saves.p10388b;

import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63033ey;

/* renamed from: com.google.android.apps.search.googleapp.saves.b.x */
/* compiled from: PG */
public final class C137229x implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ String f373358a;

    /* renamed from: b */
    final /* synthetic */ C137230y f373359b;

    public C137229x(C137230y yVar, String str) {
        this.f373359b = yVar;
        this.f373358a = str;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        C60870cx e = this.f373359b.f373361b.mo50345e(C63033ey.m95859a(this.f373358a));
        C137227v vVar = new C137227v(this);
        return new C46463o(new C60817ay(C60922j.m93045h(e, C47810es.m84966f(vVar), this.f373359b.f373364e)));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        return this.f373359b.mo113598f();
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo18088c() {
        return "SavedPagesCacheContentKey";
    }
}
