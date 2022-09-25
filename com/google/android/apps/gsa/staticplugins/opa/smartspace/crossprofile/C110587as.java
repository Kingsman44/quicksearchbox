package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import android.content.Context;
import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.internal.C142582g;
import com.google.android.enterprise.connectedapps.internal.C142587l;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;
import com.google.assistant.p3886c.C50794cr;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.as */
/* compiled from: PG */
public final /* synthetic */ class C110587as implements C142587l {
    /* renamed from: a */
    public final Bundle mo86984a(Context context, Bundle bundle, C142549ai aiVar) {
        Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
        boolean booleanValue = ((Boolean) C110589au.f308257b.mo86969a(bundle, "isOpaEligible", BundlerType.m231188a("boolean"))).booleanValue();
        boolean booleanValue2 = ((Boolean) C110589au.f308257b.mo86969a(bundle, "isThirdPartyData", BundlerType.m231188a("boolean"))).booleanValue();
        C142568e.m231170f(C110589au.m184232a(context).mo98782a((C50794cr) C110589au.f308257b.mo86969a(bundle, "cardType", BundlerType.m231188a("com.google.assistant.ambient.SmartspaceProto.SmartspaceUpdate.SmartspaceCard.CardType")), booleanValue, booleanValue2), new C142582g(aiVar, C110589au.f308257b, BundlerType.m231188a("java.lang.Void")));
        return bundle2;
    }
}
