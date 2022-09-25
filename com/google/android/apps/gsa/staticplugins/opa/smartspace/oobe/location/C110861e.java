package com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.location;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.smartspace.p7259c.C92094j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.location.e */
/* compiled from: PG */
public final /* synthetic */ class C110861e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C110866j f308861a;

    /* renamed from: b */
    public final /* synthetic */ TextView f308862b;

    public /* synthetic */ C110861e(C110866j jVar, TextView textView) {
        this.f308861a = jVar;
        this.f308862b = textView;
    }

    public final void onClick(View view) {
        C110866j jVar = this.f308861a;
        jVar.f308873g.mo86704i(this.f308862b);
        C60870cx h = jVar.f308870d.h(C92094j.LOCATION, true);
        C110864h hVar = new C110864h(jVar);
        C60856cj.m92911t(h, C47810es.m84974n(hVar), C60826bg.f164896a);
        jVar.f308868b.finish();
    }
}
