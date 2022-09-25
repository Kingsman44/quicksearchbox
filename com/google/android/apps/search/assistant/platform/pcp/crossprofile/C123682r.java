package com.google.android.apps.search.assistant.platform.pcp.crossprofile;

import android.content.Context;
import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.internal.C142582g;
import com.google.android.enterprise.connectedapps.internal.C142587l;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.crossprofile.r */
/* compiled from: PG */
public final /* synthetic */ class C123682r implements C142587l {
    /* renamed from: a */
    public final Bundle mo86984a(Context context, Bundle bundle, C142549ai aiVar) {
        Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
        Bundler bundler = C123684t.f341651b;
        BundlerType[] bundlerTypeArr = {BundlerType.m231188a("java.lang.Integer")};
        C142568e.m231170f(C123684t.m203055a(context).mo106095c((List) bundler.mo86969a(bundle, "clientTypes", BundlerType.m231189b("java.util.List", bundlerTypeArr))), new C142582g(aiVar, C123684t.f341651b, BundlerType.m231188a("java.lang.Void")));
        return bundle2;
    }
}
