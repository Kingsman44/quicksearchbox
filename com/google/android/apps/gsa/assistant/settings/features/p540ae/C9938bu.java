package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import com.google.apps.tiktok.dataservice.p3638c.C46748e;
import com.google.apps.tiktok.dataservice.p3638c.C46751h;
import com.google.common.base.C58838bb;
import p3186j$.util.function.IntFunction;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.bu */
/* compiled from: PG */
public final /* synthetic */ class C9938bu implements IntFunction {

    /* renamed from: a */
    public final /* synthetic */ C46751h f34063a;

    public /* synthetic */ C9938bu(C46751h hVar) {
        this.f34063a = hVar;
    }

    public final Object apply(int i) {
        C46751h hVar = this.f34063a;
        boolean z = false;
        if (i >= 0 && i < hVar.f122099e) {
            z = true;
        }
        C58838bb.m90875j(z, "Requested section %s, but only %s sections were initialized.", i + 1, hVar.f122099e);
        return new C46748e(hVar, i);
    }
}
