package com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.internal.C142582g;
import com.google.android.enterprise.connectedapps.internal.C142587l;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile.k */
/* compiled from: PG */
public final /* synthetic */ class C101743k implements C142587l {
    /* renamed from: a */
    public final Bundle mo86984a(Context context, Bundle bundle, C142549ai aiVar) {
        Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
        C142568e.m231170f(C101744l.m168358a(context).mo92524a(((Boolean) C101744l.f283841b.mo86969a(bundle, "enable", BundlerType.m231188a("boolean"))).booleanValue(), (EventForDump) C101744l.f283841b.mo86969a(bundle, "eventForDump", BundlerType.m231188a("com.google.android.apps.gsa.shared.speech.dumper.EventForDump"))), new C142582g(aiVar, C101744l.f283841b, BundlerType.m231188a("java.lang.Void")));
        return bundle2;
    }
}
