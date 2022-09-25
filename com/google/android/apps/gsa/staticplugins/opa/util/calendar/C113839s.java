package com.google.android.apps.gsa.staticplugins.opa.util.calendar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.internal.C142582g;
import com.google.android.enterprise.connectedapps.internal.C142587l;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.calendar.s */
/* compiled from: PG */
public final /* synthetic */ class C113839s implements C142587l {
    /* renamed from: a */
    public final Bundle mo86984a(Context context, Bundle bundle, C142549ai aiVar) {
        Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
        C142568e.m231170f(C113840t.m188446a(context).mo100688a((Intent) C113840t.f315246b.mo86969a(bundle, "intent", BundlerType.m231188a("android.content.Intent"))), new C142582g(aiVar, C113840t.f315246b, BundlerType.m231188a("com.google.android.apps.gsa.taskgraph.Done")));
        return bundle2;
    }
}
