package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.view.View;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.cx */
/* compiled from: PG */
public final /* synthetic */ class C10305cx implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C10312da f34910a;

    public /* synthetic */ C10305cx(C10312da daVar) {
        this.f34910a = daVar;
    }

    public final void onClick(View view) {
        C10304cw cwVar = this.f34910a.f34933a;
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = "routines";
        cwVar.startActivityForResult(c.mo24020b().mo24031a(), 0);
    }
}
