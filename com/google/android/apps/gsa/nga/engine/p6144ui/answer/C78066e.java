package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import android.text.TextUtils;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.e */
/* compiled from: PG */
public final /* synthetic */ class C78066e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C78069h f215034a;

    /* renamed from: b */
    public final /* synthetic */ C78043ap f215035b;

    public /* synthetic */ C78066e(C78069h hVar, C78043ap apVar) {
        this.f215034a = hVar;
        this.f215035b = apVar;
    }

    public final void run() {
        C78069h hVar = this.f215034a;
        C78043ap apVar = this.f215035b;
        hVar.mo73051c();
        C78042ao aoVar = (C78042ao) apVar;
        aoVar.f214994c.run();
        String str = aoVar.f214992a.f220644h;
        if (!TextUtils.isEmpty(str)) {
            C78070i d = C78071j.m125368d();
            ((C78038ak) d).f214959d = str;
            hVar.mo73054f(d.mo73005a());
        }
    }
}
