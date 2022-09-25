package com.google.android.apps.search.assistant.libraries.p8972f.p8973a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4671b.C61819l;
import com.google.knowledge.p4671b.C61820m;
import com.google.knowledge.p4671b.C61822o;
import com.google.knowledge.p4671b.C61824q;
import com.google.knowledge.p4671b.C61828u;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.search.assistant.libraries.f.a.n */
/* compiled from: PG */
public final /* synthetic */ class C119377n implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Map f332812a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f332813b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f332814c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f332815d;

    public /* synthetic */ C119377n(Map map, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f332812a = map;
        this.f332813b = cxVar;
        this.f332814c = cxVar2;
        this.f332815d = cxVar3;
    }

    public final Object call() {
        Map map = this.f332812a;
        C60870cx cxVar = this.f332813b;
        C60870cx cxVar2 = this.f332814c;
        C60870cx cxVar3 = this.f332815d;
        C61819l lVar = (C61819l) C61820m.f167020J.createBuilder();
        Map.EL.forEach(map, new C119372i(lVar));
        try {
            lVar.copyOnWrite();
            C61820m mVar = (C61820m) lVar.instance;
            mVar.f167044n = ((C61822o) C60856cj.m92909r(cxVar)).f167065g;
            mVar.f167031a |= 4096;
        } catch (ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) C119380q.f332830a.mo56226d()).mo56382g(e)).mo56372aa(34404)).mo56386p("Failed to fetch opt-in setting");
        }
        try {
            lVar.copyOnWrite();
            C61820m mVar2 = (C61820m) lVar.instance;
            mVar2.f167049s = ((C61828u) C60856cj.m92909r(cxVar2)).f167085d;
            mVar2.f167031a |= C89885b.S3REQUEST_VALUE;
        } catch (ExecutionException e2) {
            ((C59052c) ((C59052c) ((C59052c) C119380q.f332830a.mo56226d()).mo56382g(e2)).mo56372aa(34403)).mo56386p("Failed to fetch opt-in setting");
        }
        try {
            lVar.copyOnWrite();
            C61820m mVar3 = (C61820m) lVar.instance;
            mVar3.f167050t = ((C61824q) C60856cj.m92909r(cxVar3)).f167073f;
            mVar3.f167031a |= C89885b.HTTP_VALUE;
        } catch (ExecutionException e3) {
            ((C59052c) ((C59052c) ((C59052c) C119380q.f332830a.mo56226d()).mo56382g(e3)).mo56372aa(34402)).mo56386p("Failed to fetch opt-in setting");
        }
        return (C61820m) lVar.build();
    }
}
