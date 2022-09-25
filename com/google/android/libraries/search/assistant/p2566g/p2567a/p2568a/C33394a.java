package com.google.android.libraries.search.assistant.p2566g.p2567a.p2568a;

import com.google.android.libraries.search.assistant.p2566g.C33430y;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50544l;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62963cj;
import p3186j$.util.Collection;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.search.assistant.g.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C33394a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C33403j f89452a;

    /* renamed from: b */
    public final /* synthetic */ C33430y f89453b;

    public /* synthetic */ C33394a(C33403j jVar, C33430y yVar) {
        this.f89452a = jVar;
        this.f89453b = yVar;
    }

    public final C60870cx apply(Object obj) {
        Stream stream;
        C33403j jVar = this.f89452a;
        C33430y yVar = this.f89453b;
        AccountId accountId = (AccountId) obj;
        C50544l lVar = yVar.f89533c;
        if (lVar == null) {
            lVar = C50544l.f131546d;
        }
        C58528ij F = C58528ij.m90006F(new C62963cj(lVar.f131548a, C50544l.f131545b));
        if (F.isEmpty()) {
            stream = Collection.EL.stream(((C58495hd) jVar.f89464a).values()).map(C33397d.f89456a);
        } else {
            stream = Collection.EL.stream(((C58495hd) jVar.f89464a).entrySet()).filter(new C33398e(F)).map(C33399f.f89458a);
        }
        C60870cx e = C60856cj.m92896e((C58485gu) stream.map(new C33400g(jVar, accountId, yVar)).collect(C58370cn.f155946a));
        C33401h hVar = C33401h.f89462a;
        return C60922j.m93044g(e, C47810es.m84963c(hVar), jVar.f89465b);
    }
}
