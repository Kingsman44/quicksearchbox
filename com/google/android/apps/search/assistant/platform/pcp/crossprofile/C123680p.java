package com.google.android.apps.search.assistant.platform.pcp.crossprofile;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.internal.C142582g;
import com.google.android.enterprise.connectedapps.internal.C142587l;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;
import java.util.Set;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.crossprofile.p */
/* compiled from: PG */
public final /* synthetic */ class C123680p implements C142587l {
    /* renamed from: a */
    public final Bundle mo86984a(Context context, Bundle bundle, C142549ai aiVar) {
        Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
        int intValue = ((Integer) C123684t.f341651b.mo86969a(bundle, "clientType", BundlerType.m231188a("int"))).intValue();
        Bundler bundler = C123684t.f341651b;
        BundlerType[] bundlerTypeArr = {BundlerType.m231188a("java.lang.Integer")};
        boolean booleanValue = ((Boolean) C123684t.f341651b.mo86969a(bundle, "getCachedData", BundlerType.m231188a("boolean"))).booleanValue();
        C142568e.m231170f(C123684t.m203055a(context).mo106093a(intValue, (Set) bundler.mo86969a(bundle, "dataTypes", BundlerType.m231189b("java.util.Set", bundlerTypeArr)), ((Boolean) C123684t.f341651b.mo86969a(bundle, "blockOnMissingValidCache", BundlerType.m231188a("boolean"))).booleanValue(), (C123755bv) C123684t.f341651b.mo86969a(bundle, "syncRequestContext", BundlerType.m231188a("com.google.android.apps.search.assistant.platform.pcp.proto.SyncRequestContext")), (C123777f) C123684t.f341651b.mo86969a(bundle, "clientState", BundlerType.m231188a("com.google.android.apps.search.assistant.platform.pcp.f.f")), booleanValue), new C142582g(aiVar, C123684t.f341651b, BundlerType.m231188a("com.google.android.apps.search.assistant.platform.pcp.proto.ProactiveDataList")));
        return bundle2;
    }
}
