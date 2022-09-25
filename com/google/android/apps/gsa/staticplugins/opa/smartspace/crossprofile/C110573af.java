package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.gsa.opa.smartspace.C83809y;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.internal.C142582g;
import com.google.android.enterprise.connectedapps.internal.C142587l;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.af */
/* compiled from: PG */
public final /* synthetic */ class C110573af implements C142587l {
    /* renamed from: a */
    public final Bundle mo86984a(Context context, Bundle bundle, C142549ai aiVar) {
        Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
        long longValue = ((Long) C110575ah.f308248b.mo86969a(bundle, "ttl", BundlerType.m231188a("long"))).longValue();
        C142568e.m231170f(C110575ah.m184206a(context).mo98802g((String) C110575ah.f308248b.mo86969a(bundle, "id", BundlerType.m231188a("java.lang.String")), (C83809y) C110575ah.f308248b.mo86969a(bundle, "dismissalMetadata", BundlerType.m231188a("com.google.android.apps.gsa.opa.smartspace.SmartspaceUpdateInfoProto.DismissalMetadata")), longValue), new C142582g(aiVar, C110575ah.f308248b, BundlerType.m231188a("com.google.android.apps.gsa.taskgraph.Done")));
        return bundle2;
    }
}
