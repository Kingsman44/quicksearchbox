package com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile;

import android.os.Bundle;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.enterprise.connectedapps.C142557aq;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile.m */
/* compiled from: PG */
public final class C101745m implements C101746n {

    /* renamed from: a */
    private final C142557aq f283843a;

    public C101745m(C142557aq aqVar) {
        aqVar.getClass();
        this.f283843a = aqVar;
    }

    /* renamed from: a */
    public final C60870cx mo92534a(boolean z, EventForDump eventForDump) {
        C101744l lVar = C101744l.f283840a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        BundlerType.m231188a("boolean");
        bundle.putBoolean("enable", z);
        C101744l.f283841b.mo86971c(bundle, "eventForDump", eventForDump, BundlerType.m231188a("com.google.android.apps.gsa.shared.speech.dumper.EventForDump"));
        C142568e eVar = new C142568e(C101744l.f283841b, BundlerType.m231188a("java.lang.Void"));
        this.f283843a.mo117175b().mo117153e(-6028071782175238970L, 2, bundle, eVar, eVar.f386859a);
        return eVar.f386859a;
    }
}
