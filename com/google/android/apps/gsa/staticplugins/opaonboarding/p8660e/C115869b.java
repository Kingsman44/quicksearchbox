package com.google.android.apps.gsa.staticplugins.opaonboarding.p8660e;

import android.content.pm.ResolveInfo;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opaonboarding.e.b */
/* compiled from: PG */
public final /* synthetic */ class C115869b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C115870c f321304a;

    /* renamed from: b */
    public final /* synthetic */ ResolveInfo f321305b;

    public /* synthetic */ C115869b(C115870c cVar, ResolveInfo resolveInfo) {
        this.f321304a = cVar;
        this.f321305b = resolveInfo;
    }

    public final void onClick(View view) {
        C115870c cVar = this.f321304a;
        cVar.f321306b.edit().putString("opa_android_sticky_media_app", this.f321305b.activityInfo.packageName).apply();
        cVar.mo77318iT().mo77312a();
    }
}
