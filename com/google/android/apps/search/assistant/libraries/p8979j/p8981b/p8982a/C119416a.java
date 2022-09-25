package com.google.android.apps.search.assistant.libraries.p8979j.p8981b.p8982a;

import com.google.android.libraries.assistant.p1533o.C18495m;
import com.google.android.libraries.assistant.p1533o.C18496n;
import com.google.android.libraries.assistant.p1533o.C18504v;
import com.google.android.libraries.assistant.p1533o.C18505w;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.libraries.j.b.a.a */
/* compiled from: PG */
public final class C119416a implements C119424i {

    /* renamed from: a */
    private final String f332917a = "X-Agsa-Voice-Search";

    /* renamed from: b */
    private final String f332918b = "apvs";

    /* renamed from: a */
    public final C60870cx mo104340a(C18496n nVar) {
        C69664n.m101061g(nVar, "params");
        C18495m mVar = (C18495m) nVar.toBuilder();
        C18504v vVar = (C18504v) C18505w.f52458d.createBuilder();
        String str = this.f332917a;
        vVar.copyOnWrite();
        ((C18505w) vVar.instance).f52460a = str;
        String str2 = this.f332918b;
        vVar.copyOnWrite();
        ((C18505w) vVar.instance).f52461b = str2;
        mVar.mo24007c(vVar);
        return C60856cj.m92900i(mVar.build());
    }
}
