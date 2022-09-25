package com.google.android.apps.search.assistant.libraries.dictation.starter.crossprofile;

import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142557aq;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n;

/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.starter.crossprofile.k */
/* compiled from: PG */
public final class C119332k implements C119333l {

    /* renamed from: a */
    private final C142557aq f332721a;

    public C119332k(C142557aq aqVar) {
        aqVar.getClass();
        this.f332721a = aqVar;
    }

    /* renamed from: a */
    public final C119328g mo104294a() {
        return new C119328g(this);
    }

    /* renamed from: b */
    public final C60870cx mo104295b() {
        C119331j jVar = C119331j.f332718a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C142568e eVar = new C142568e(C119331j.f332719b, BundlerType.m231188a("com.google.android.apps.search.assistant.libraries.dictation.proto.CanStartDictationResponse"));
        this.f332721a.mo117175b().mo117153e(4441183631946776897L, 0, bundle, eVar, eVar.f386859a);
        return eVar.f386859a;
    }

    /* renamed from: c */
    public final C60870cx mo104296c(C64735n nVar) {
        C119331j jVar = C119331j.f332718a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C119331j.f332719b.mo86971c(bundle, "args", nVar, BundlerType.m231188a("com.google.protos.assistant.api.client_op.text.StartDictationArgs"));
        C142568e eVar = new C142568e(C119331j.f332719b, BundlerType.m231188a("java.lang.Boolean"));
        this.f332721a.mo117175b().mo117153e(4441183631946776897L, 1, bundle, eVar, eVar.f386859a);
        return eVar.f386859a;
    }
}
