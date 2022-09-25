package com.google.android.apps.search.assistant.platform.pcp.crossprofile;

import android.os.Bundle;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.enterprise.connectedapps.C142557aq;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.crossprofile.u */
/* compiled from: PG */
public final class C123685u implements C123686v {

    /* renamed from: a */
    private final C142557aq f341653a;

    public C123685u(C142557aq aqVar) {
        aqVar.getClass();
        this.f341653a = aqVar;
    }

    /* renamed from: a */
    public final C60870cx mo106100a(int i, Set set, boolean z, C123755bv bvVar, C123777f fVar, boolean z2) {
        C123684t tVar = C123684t.f341650a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        BundlerType.m231188a("int");
        bundle.putInt("clientType", i);
        C123684t.f341651b.mo86971c(bundle, "dataTypes", set, BundlerType.m231189b("java.util.Set", BundlerType.m231188a("java.lang.Integer")));
        BundlerType.m231188a("boolean");
        bundle.putBoolean("blockOnMissingValidCache", z);
        C123684t.f341651b.mo86971c(bundle, "syncRequestContext", bvVar, BundlerType.m231188a("com.google.android.apps.search.assistant.platform.pcp.proto.SyncRequestContext"));
        C123684t.f341651b.mo86971c(bundle, "clientState", fVar, BundlerType.m231188a("com.google.android.apps.search.assistant.platform.pcp.f.f"));
        BundlerType.m231188a("boolean");
        bundle.putBoolean("getCachedData", z2);
        C142568e eVar = new C142568e(C123684t.f341651b, BundlerType.m231188a("com.google.android.apps.search.assistant.platform.pcp.proto.ProactiveDataList"));
        this.f341653a.mo117175b().mo117153e(6283638987313294435L, 0, bundle, eVar, eVar.f386859a);
        return eVar.f386859a;
    }

    /* renamed from: b */
    public final C60870cx mo106101b(List list) {
        C123684t tVar = C123684t.f341650a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C123684t.f341651b.mo86971c(bundle, "clientTypes", list, BundlerType.m231189b("java.util.List", BundlerType.m231188a("java.lang.Integer")));
        C142568e eVar = new C142568e(C123684t.f341651b, BundlerType.m231188a("java.lang.Void"));
        this.f341653a.mo117175b().mo117153e(6283638987313294435L, 2, bundle, eVar, eVar.f386859a);
        return eVar.f386859a;
    }

    /* renamed from: c */
    public final C60870cx mo106102c(List list) {
        C123684t tVar = C123684t.f341650a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C123684t.f341651b.mo86971c(bundle, "proactiveLocalDataTypes", list, BundlerType.m231189b("java.util.List", BundlerType.m231188a("java.lang.Integer")));
        C142568e eVar = new C142568e(C123684t.f341651b, BundlerType.m231188a("java.lang.Void"));
        this.f341653a.mo117175b().mo117153e(6283638987313294435L, 3, bundle, eVar, eVar.f386859a);
        return eVar.f386859a;
    }
}
