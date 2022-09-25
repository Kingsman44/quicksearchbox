package com.google.android.apps.gsa.staticplugins.opa.util.calendar;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142557aq;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.calendar.u */
/* compiled from: PG */
public final class C113841u implements C113842v {

    /* renamed from: a */
    private final C142557aq f315248a;

    public C113841u(C142557aq aqVar) {
        aqVar.getClass();
        this.f315248a = aqVar;
    }

    /* renamed from: a */
    public final C60870cx mo100691a(Intent intent) {
        C113840t tVar = C113840t.f315245a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C113840t.f315246b.mo86971c(bundle, "intent", intent, BundlerType.m231188a("android.content.Intent"));
        C142568e eVar = new C142568e(C113840t.f315246b, BundlerType.m231188a("com.google.android.apps.gsa.taskgraph.Done"));
        this.f315248a.mo117175b().mo117153e(-7446043385737290294L, 0, bundle, eVar, eVar.f386859a);
        return eVar.f386859a;
    }
}
