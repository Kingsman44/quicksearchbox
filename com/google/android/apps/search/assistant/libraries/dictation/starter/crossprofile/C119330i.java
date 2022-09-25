package com.google.android.apps.search.assistant.libraries.dictation.starter.crossprofile;

import android.content.Context;
import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.internal.C142582g;
import com.google.android.enterprise.connectedapps.internal.C142587l;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n;

/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.starter.crossprofile.i */
/* compiled from: PG */
public final /* synthetic */ class C119330i implements C142587l {
    /* renamed from: a */
    public final Bundle mo86984a(Context context, Bundle bundle, C142549ai aiVar) {
        Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
        C142568e.m231170f(C119331j.m198040a(context).mo104290b((C64735n) C119331j.f332719b.mo86969a(bundle, "args", BundlerType.m231188a("com.google.protos.assistant.api.client_op.text.StartDictationArgs"))), new C142582g(aiVar, C119331j.f332719b, BundlerType.m231188a("java.lang.Boolean")));
        return bundle2;
    }
}
