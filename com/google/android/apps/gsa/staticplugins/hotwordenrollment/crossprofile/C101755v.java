package com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142557aq;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile.v */
/* compiled from: PG */
public final class C101755v implements C101756w {

    /* renamed from: a */
    private final C142557aq f283849a;

    public C101755v(C142557aq aqVar) {
        aqVar.getClass();
        this.f283849a = aqVar;
    }

    /* renamed from: a */
    public final C60870cx mo92538a(Intent intent) {
        C101754u uVar = C101754u.f283846a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C101754u.f283847b.mo86971c(bundle, "intent", intent, BundlerType.m231188a("android.content.Intent"));
        C101754u.f283847b.mo86971c(bundle, "receiverPermission", "android.permission.MANAGE_VOICE_KEYPHRASES", BundlerType.m231188a("java.lang.String"));
        C142568e eVar = new C142568e(C101754u.f283847b, BundlerType.m231188a("java.lang.Void"));
        this.f283849a.mo117175b().mo117153e(-1360510311192262685L, 1, bundle, eVar, eVar.f386859a);
        return eVar.f386859a;
    }
}
