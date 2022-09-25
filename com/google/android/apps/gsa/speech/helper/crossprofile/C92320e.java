package com.google.android.apps.gsa.speech.helper.crossprofile;

import android.content.Context;
import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.internal.C142587l;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.speech.helper.crossprofile.e */
/* compiled from: PG */
public final /* synthetic */ class C92320e implements C142587l {
    /* renamed from: a */
    public final Bundle mo86984a(Context context, Bundle bundle, C142549ai aiVar) {
        Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
        long longValue = ((Long) C92326k.f257427b.mo86969a(bundle, "timeoutMs", BundlerType.m231188a("long"))).longValue();
        Set G = C92326k.m151615a(context).mo79660G((String) C92326k.f257427b.mo86969a(bundle, "tokenType", BundlerType.m231188a("java.lang.String")), longValue);
        C92326k.f257427b.mo86971c(bundle2, "return", G, BundlerType.m231189b("java.util.Set", BundlerType.m231188a("com.google.android.apps.gsa.speech.helper.proto.AuthToken")));
        return bundle2;
    }
}
