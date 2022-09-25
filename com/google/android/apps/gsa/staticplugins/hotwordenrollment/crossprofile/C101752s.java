package com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.internal.C142582g;
import com.google.android.enterprise.connectedapps.internal.C142587l;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;
import com.google.common.util.concurrent.C60866ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile.s */
/* compiled from: PG */
public final /* synthetic */ class C101752s implements C142587l {
    /* renamed from: a */
    public final Bundle mo86984a(Context context, Bundle bundle, C142549ai aiVar) {
        Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
        C101754u.m168366a(context).f283844a.sendBroadcast((Intent) C101754u.f283847b.mo86969a(bundle, "intent", BundlerType.m231188a("android.content.Intent")));
        C142568e.m231170f(C60866ct.f164955a, new C142582g(aiVar, C101754u.f283847b, BundlerType.m231188a("java.lang.Void")));
        return bundle2;
    }
}
