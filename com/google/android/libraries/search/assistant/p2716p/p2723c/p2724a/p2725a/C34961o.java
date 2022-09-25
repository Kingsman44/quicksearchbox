package com.google.android.libraries.search.assistant.p2716p.p2723c.p2724a.p2725a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C55082fe;
import com.google.p4152bb.p4153a.C55090fm;
import java.util.concurrent.ExecutionException;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.p.c.a.a.o */
/* compiled from: PG */
public final /* synthetic */ class C34961o implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C55090fm f92645a;

    public /* synthetic */ C34961o(C55090fm fmVar) {
        this.f92645a = fmVar;
    }

    public final void accept(Object obj) {
        C55090fm fmVar = this.f92645a;
        C60870cx cxVar = (C60870cx) obj;
        C59071e eVar = C34942ap.f92610a;
        try {
            fmVar.mo54192c((C55082fe) C60856cj.m92909r(cxVar));
        } catch (ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) C34942ap.f92610a.mo56226d()).mo56382g(e)).mo56372aa(51209)).mo56386p("Failed to get ContactInformation!");
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
