package com.google.android.apps.gsa.speech.helper.crossprofile;

import android.content.Context;
import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.internal.C142582g;
import com.google.android.enterprise.connectedapps.internal.C142587l;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;

/* renamed from: com.google.android.apps.gsa.speech.helper.crossprofile.d */
/* compiled from: PG */
public final /* synthetic */ class C92319d implements C142587l {
    /* renamed from: a */
    public final Bundle mo86984a(Context context, Bundle bundle, C142549ai aiVar) {
        Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
        long longValue = ((Long) C92326k.f257427b.mo86969a(bundle, "timeoutMs", BundlerType.m231188a("long"))).longValue();
        C142568e.m231170f(C92326k.m151615a(context).mo79691y((String) C92326k.f257427b.mo86969a(bundle, "tokenType", BundlerType.m231188a("java.lang.String")), longValue), new C142582g(aiVar, C92326k.f257427b, BundlerType.m231189b("java.util.Set", BundlerType.m231188a("com.google.android.apps.gsa.speech.helper.proto.AuthToken"))));
        return bundle2;
    }
}
