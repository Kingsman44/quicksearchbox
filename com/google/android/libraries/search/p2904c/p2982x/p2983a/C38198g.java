package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37565ef;
import com.google.android.libraries.search.p2904c.C37658he;
import com.google.android.libraries.search.p2904c.C37666hm;
import com.google.android.libraries.search.p2904c.C37670hq;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.android.libraries.search.p2904c.p2982x.C38218aa;
import com.google.android.libraries.search.p2904c.p2982x.C38219ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.c.x.a.g */
/* compiled from: PG */
final class C38198g implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C37658he f101241a;

    /* renamed from: b */
    final /* synthetic */ C70862aj f101242b;

    /* renamed from: c */
    final /* synthetic */ int f101243c;

    /* renamed from: d */
    final /* synthetic */ C38203l f101244d;

    public C38198g(C38203l lVar, C37658he heVar, C70862aj ajVar, int i) {
        this.f101244d = lVar;
        this.f101241a = heVar;
        this.f101242b = ajVar;
        this.f101243c = i;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) C38203l.f101252a.mo56226d()).mo56372aa(52990)).mo56387q("#audio# Failed to get HotwordStopListeningStatus. sessionToken: %d", this.f101243c);
        C70862aj ajVar = this.f101242b;
        C38218aa aaVar = (C38218aa) C38219ab.f101295d.createBuilder();
        C37666hm m = C37846as.m66807m(C37846as.m66801g(C37512ds.FAILED_CLOSING_ERROR_IN_GETTING_AUDIO_SOURCE_CLOSING_STATUS), C37565ef.CLIENT_REQUESTED);
        aaVar.copyOnWrite();
        C38219ab abVar = (C38219ab) aaVar.instance;
        m.getClass();
        abVar.f101298b = m;
        abVar.f101297a |= 1;
        C37670hq hqVar = C37670hq.f100052c;
        aaVar.copyOnWrite();
        C38219ab abVar2 = (C38219ab) aaVar.instance;
        hqVar.getClass();
        abVar2.f101299c = hqVar;
        abVar2.f101297a |= 2;
        ajVar.mo20123c((C38219ab) aaVar.build());
        this.f101242b.mo20122b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C38203l lVar = this.f101244d;
        C60856cj.m92911t(this.f101241a.mo41055b(), C47810es.m84974n(new C38201j(this.f101242b, (C37666hm) obj)), lVar.f101253b);
    }
}
