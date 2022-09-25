package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.view.View;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.n */
/* compiled from: PG */
public final /* synthetic */ class C9704n implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9711u f33534a;

    public /* synthetic */ C9704n(C9711u uVar) {
        this.f33534a = uVar;
    }

    public final void onClick(View view) {
        C9711u uVar = this.f33534a;
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = "entry_point";
        uVar.startActivityForResult(c.mo24020b().mo24031a(), 100);
    }
}
