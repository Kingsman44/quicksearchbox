package com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.internal.C142582g;
import com.google.android.enterprise.connectedapps.internal.C142587l;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.e */
/* compiled from: PG */
public final /* synthetic */ class C138516e implements C142587l {
    /* renamed from: a */
    public final Bundle mo86984a(Context context, Bundle bundle, C142549ai aiVar) {
        Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
        C142568e.m231170f(C138518g.m224953a(context).mo114301a((C138133o) C138518g.f376765b.mo86969a(bundle, "suggestRequest", BundlerType.m231188a("com.google.android.apps.search.googleapp.search.suggest.SuggestRequestProto.SuggestRequest")), (String) C138518g.f376765b.mo86969a(bundle, "stSortingSpec", BundlerType.m231188a("java.lang.String")), (String) C138518g.f376765b.mo86969a(bundle, "icingCorpusOverride", BundlerType.m231188a("java.lang.String"))), new C142582g(aiVar, C138518g.f376765b, BundlerType.m231188a("com.google.android.apps.search.googleapp.search.suggest.SuggestResponseProto.SuggestResponse")));
        return bundle2;
    }
}
