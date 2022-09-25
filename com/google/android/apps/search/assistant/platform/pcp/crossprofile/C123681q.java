package com.google.android.apps.search.assistant.platform.pcp.crossprofile;

import android.content.Context;
import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.internal.C142582g;
import com.google.android.enterprise.connectedapps.internal.C142587l;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.crossprofile.q */
/* compiled from: PG */
public final /* synthetic */ class C123681q implements C142587l {
    /* renamed from: a */
    public final Bundle mo86984a(Context context, Bundle bundle, C142549ai aiVar) {
        Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
        Bundler bundler = C123684t.f341651b;
        BundlerType[] bundlerTypeArr = {BundlerType.m231188a("com.google.apps.tiktok.account.AccountId")};
        long longValue = ((Long) C123684t.f341651b.mo86969a(bundle, "dismissalTTL", BundlerType.m231188a("long"))).longValue();
        C142568e.m231170f(C123684t.m203055a(context).mo106094b((Optional) bundler.mo86969a(bundle, "accountId", BundlerType.m231189b("java.util.Optional", bundlerTypeArr)), ((Integer) C123684t.f341651b.mo86969a(bundle, "clientType", BundlerType.m231188a("int"))).intValue(), ((Integer) C123684t.f341651b.mo86969a(bundle, "proactiveDataType", BundlerType.m231188a("int"))).intValue(), (String) C123684t.f341651b.mo86969a(bundle, "dataId", BundlerType.m231188a("java.lang.String")), longValue), new C142582g(aiVar, C123684t.f341651b, BundlerType.m231188a("java.lang.Void")));
        return bundle2;
    }
}
