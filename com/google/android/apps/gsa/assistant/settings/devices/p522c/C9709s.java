package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.view.View;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.s */
/* compiled from: PG */
public final /* synthetic */ class C9709s implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9711u f33539a;

    public /* synthetic */ C9709s(C9711u uVar) {
        this.f33539a = uVar;
    }

    public final void onClick(View view) {
        C9711u uVar = this.f33539a;
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = "notification";
        uVar.startActivityForResult(c.mo24020b().mo24031a(), 100);
    }
}
