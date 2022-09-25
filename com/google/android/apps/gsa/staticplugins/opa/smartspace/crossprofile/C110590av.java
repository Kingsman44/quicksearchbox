package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142557aq;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4552o.aky;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.av */
/* compiled from: PG */
public final class C110590av implements C110591aw {

    /* renamed from: a */
    private final C142557aq f308259a;

    public C110590av(C142557aq aqVar) {
        aqVar.getClass();
        this.f308259a = aqVar;
    }

    /* renamed from: a */
    public final C60870cx mo98787a(C50794cr crVar, boolean z, boolean z2) {
        C110589au auVar = C110589au.f308256a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C110589au.f308257b.mo86971c(bundle, "cardType", crVar, BundlerType.m231188a("com.google.assistant.ambient.SmartspaceProto.SmartspaceUpdate.SmartspaceCard.CardType"));
        BundlerType.m231188a("boolean");
        bundle.putBoolean("isOpaEligible", z);
        BundlerType.m231188a("boolean");
        bundle.putBoolean("isThirdPartyData", z2);
        C142568e eVar = new C142568e(C110589au.f308257b, BundlerType.m231188a("java.lang.Void"));
        this.f308259a.mo117175b().mo117153e(-3686767252661019653L, 0, bundle, eVar, eVar.f386859a);
        return eVar.f386859a;
    }

    /* renamed from: b */
    public final C60870cx mo98788b(C50794cr crVar, aky aky, boolean z, boolean z2) {
        C110589au auVar = C110589au.f308256a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C110589au.f308257b.mo86971c(bundle, "cardType", crVar, BundlerType.m231188a("com.google.assistant.ambient.SmartspaceProto.SmartspaceUpdate.SmartspaceCard.CardType"));
        C110589au.f308257b.mo86971c(bundle, "smartspaceUpdateSource", aky, BundlerType.m231188a("com.google.common.logging.OpaSmartspaceProto.SmartspaceEvent.SmartspaceUpdateSource"));
        BundlerType.m231188a("boolean");
        bundle.putBoolean("isOpaEligible", z);
        BundlerType.m231188a("boolean");
        bundle.putBoolean("isThirdPartyData", z2);
        C142568e eVar = new C142568e(C110589au.f308257b, BundlerType.m231188a("java.lang.Void"));
        this.f308259a.mo117175b().mo117153e(-3686767252661019653L, 1, bundle, eVar, eVar.f386859a);
        return eVar.f386859a;
    }
}
