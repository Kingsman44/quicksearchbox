package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import android.content.Context;
import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.internal.C142582g;
import com.google.android.enterprise.connectedapps.internal.C142587l;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58714pg;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.ad */
/* compiled from: PG */
public final /* synthetic */ class C110571ad implements C142587l {
    /* renamed from: a */
    public final Bundle mo86984a(Context context, Bundle bundle, C142549ai aiVar) {
        Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
        Bundler bundler = C110575ah.f308248b;
        BundlerType[] bundlerTypeArr = {BundlerType.m231188a("java.lang.Long")};
        Bundler bundler2 = C110575ah.f308248b;
        BundlerType[] bundlerTypeArr2 = {BundlerType.m231188a("java.lang.Long")};
        C142568e.m231170f(C110575ah.m184206a(context).mo98800e((C58714pg) bundler.mo86969a(bundle, "startTimeMillisRange", BundlerType.m231189b("com.google.common.collect.Range", bundlerTypeArr)), (C58528ij) bundler2.mo86969a(bundle, "providerIds", BundlerType.m231189b("com.google.common.collect.ImmutableSet", bundlerTypeArr2))), new C142582g(aiVar, C110575ah.f308248b, BundlerType.m231189b("java.util.Map", BundlerType.m231188a("java.lang.Long"), BundlerType.m231189b("com.google.common.collect.ImmutableSet", BundlerType.m231188a("java.lang.String")))));
        return bundle2;
    }
}
