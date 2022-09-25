package com.google.android.apps.gsa.assistant.settings.features.p5776y;

import android.view.View;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.y.n */
/* compiled from: PG */
public final /* synthetic */ class C73548n implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ z f194558a;

    public /* synthetic */ C73548n(z zVar) {
        this.f194558a = zVar;
    }

    public final void onClick(View view) {
        z zVar = this.f194558a;
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = "notification";
        zVar.startActivityForResult(c.mo24020b().mo24031a(), 100);
    }
}
