package com.google.android.apps.search.assistant.libraries.dictation.starter.crossprofile;

import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119270af;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119271ag;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119280b;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119291m;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119295q;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119297s;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n;
import p5460g.p5461a.C69464a;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.starter.crossprofile.c */
/* compiled from: PG */
public final class C119323c implements C119321a {

    /* renamed from: a */
    private final C69464a f332715a;

    public C119323c(C69464a aVar) {
        this.f332715a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo104289a() {
        C119291m mVar = (C119291m) this.f332715a.mo17428b();
        return C70876o.m103760a(mVar.f189039a.mo39510a(C119295q.m197985a(), mVar.f189040b), C119280b.f332629a);
    }

    /* renamed from: b */
    public final C60870cx mo104290b(C64735n nVar) {
        C119270af afVar = (C119270af) C119271ag.f332613d.createBuilder();
        afVar.copyOnWrite();
        nVar.getClass();
        ((C119271ag) afVar.instance).f332615a = nVar;
        C119297s sVar = C119297s.REQUESTER_ASSISTANT_CLIENT_OP;
        afVar.copyOnWrite();
        ((C119271ag) afVar.instance).f332616b = sVar.getNumber();
        C119291m mVar = (C119291m) this.f332715a.mo17428b();
        C60870cx a = C70876o.m103760a(mVar.f189039a.mo39510a(C119295q.m197990f(), mVar.f189040b), (C119271ag) afVar.build());
        C119322b bVar = C119322b.f332714a;
        return C60922j.m93044g(a, C47810es.m84963c(bVar), C60826bg.f164896a);
    }
}
