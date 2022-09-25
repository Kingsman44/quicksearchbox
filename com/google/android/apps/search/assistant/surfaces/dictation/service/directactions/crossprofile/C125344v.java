package com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.crossprofile;

import android.app.DirectAction;
import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142557aq;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.crossprofile.v */
/* compiled from: PG */
public final class C125344v implements C125345w {

    /* renamed from: a */
    private final C142557aq f345719a;

    public C125344v(C142557aq aqVar) {
        aqVar.getClass();
        this.f345719a = aqVar;
    }

    /* renamed from: a */
    public final C125338p mo106927a() {
        return new C125338p(this);
    }

    /* renamed from: b */
    public final C60870cx mo106928b() {
        C125343u uVar = C125343u.f345716a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C142568e eVar = new C142568e(C125343u.f345717b, BundlerType.m231188a("java.lang.String"));
        this.f345719a.mo117175b().mo117153e(-5410975862190968627L, 0, bundle, eVar, eVar.f386859a);
        return eVar.f386859a;
    }

    /* renamed from: c */
    public final C60870cx mo106929c(DirectAction directAction, Bundle bundle) {
        C125343u uVar = C125343u.f345716a;
        Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
        C125343u.f345717b.mo86971c(bundle2, "action", directAction, BundlerType.m231188a("android.app.DirectAction"));
        C125343u.f345717b.mo86971c(bundle2, "extras", bundle, BundlerType.m231188a("android.os.Bundle"));
        C142568e eVar = new C142568e(C125343u.f345717b, BundlerType.m231188a("android.os.Bundle"));
        this.f345719a.mo117175b().mo117153e(-5410975862190968627L, 2, bundle2, eVar, eVar.f386859a);
        return eVar.f386859a;
    }

    /* renamed from: d */
    public final C60870cx mo106930d(String str) {
        C125343u uVar = C125343u.f345716a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C125343u.f345717b.mo86971c(bundle, "activityId", str, BundlerType.m231188a("java.lang.String"));
        C142568e eVar = new C142568e(C125343u.f345717b, BundlerType.m231189b("java.util.List", BundlerType.m231188a("android.app.DirectAction")));
        this.f345719a.mo117175b().mo117153e(-5410975862190968627L, 3, bundle, eVar, eVar.f386859a);
        return eVar.f386859a;
    }

    /* renamed from: e */
    public final void mo106931e(C125346x xVar) {
        C125343u uVar = C125343u.f345716a;
        this.f345719a.mo117175b().mo117153e(-5410975862190968627L, 1, new Bundle(Bundler.class.getClassLoader()), new C125321ab(xVar, C125343u.f345717b), xVar);
    }
}
