package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p6968aa.C89059o;
import com.google.android.apps.gsa.shared.p7066m.C90016bv;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4152bb.p4153a.C55349pb;
import com.google.p4449cd.p4456g.p4457a.C57978d;
import com.google.p4449cd.p4456g.p4458b.C57982a;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.p.p */
/* compiled from: PG */
public final class C86261p extends C86241bx implements C86254i {

    /* renamed from: f */
    public static final /* synthetic */ int f233167f = 0;

    /* renamed from: a */
    public final C86197ag f233168a = this.f233100g.mo79830a("assistant metadata", false);

    /* renamed from: b */
    public final C86197ag f233169b = this.f233100g.mo79830a("assistant response", false);

    /* renamed from: c */
    public final C86197ag f233170c = this.f233100g.mo79830a("offline result", false);

    /* renamed from: d */
    public final C57982a f233171d = new C57982a();

    /* renamed from: e */
    public final C86197ag f233172e = this.f233100g.mo79830a("Assistant event ID", true);

    /* renamed from: k */
    private final C86197ag f233173k = this.f233100g.mo79830a("Assistant response stream", false);

    /* renamed from: l */
    private final C86197ag f233174l = this.f233100g.mo79830a("response type", true);

    /* renamed from: m */
    private final C86124t f233175m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86261p(long j, long j2, C89859i iVar, C68214a aVar, C86124t tVar) {
        super(j, j2, (String) null, iVar, (C89059o) null, aVar);
        this.f233103j = new C86198ah(this.f233100g);
        this.f233175m = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo79949a() {
        return this.f233169b.f232931a;
    }

    /* renamed from: b */
    public final C60870cx mo79950b() {
        return this.f233173k.f232931a;
    }

    /* renamed from: c */
    public final C60870cx mo79951c() {
        return this.f233170c.f232931a;
    }

    /* renamed from: d */
    public final C60870cx mo79952d() {
        return C60922j.m93045h(C60846c.m92878g(this.f233174l.f232931a, Exception.class, C86257l.f233163a, C60826bg.f164896a), new C86260o(C60922j.m93044g(C60846c.m92878g(mo79894r(), Exception.class, C86258m.f233164a, C60826bg.f164896a), C86259n.f233165a, C60826bg.f164896a)), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final C60870cx mo79887e() {
        return this.f233172e.f232931a;
    }

    /* renamed from: f */
    public final void mo79957f(C51195j jVar) {
        if (this.f233173k.f232931a.isDone()) {
            return;
        }
        if (jVar.f133274i || this.f233175m.mo79746e(C90016bv.f247854a)) {
            C57978d dVar = new C57978d();
            this.f233171d.mo20440jJ(dVar);
            this.f233173k.mo79832b(dVar);
            return;
        }
        this.f233173k.mo79833c();
    }

    /* renamed from: g */
    public final void mo79958g(C51195j jVar) {
        this.f233169b.mo79832b(jVar);
        mo79959i(jVar);
        mo79957f(jVar);
    }

    /* renamed from: h */
    public final void mo79936h() {
        super.mo79936h();
        this.f233171d.mo54589f(true);
    }

    /* renamed from: i */
    public final void mo79959i(C51195j jVar) {
        if ((jVar.f133266a & 128) == 0) {
            C55349pb pbVar = jVar.f133267b;
            if (pbVar == null) {
                pbVar = C55349pb.f145830g;
            }
            if (pbVar.f145835d.size() != 0) {
                this.f233174l.mo79832b(C86253h.ACTION_V2);
            } else {
                this.f233174l.mo79832b(C86253h.LEGACY_ASSISTANT_RESPONSE);
            }
        } else {
            this.f233174l.mo79832b(C86253h.CONVERSATION_DELTA);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86261p(Query query, Query query2, long j, C89859i iVar, C68214a aVar, C86124t tVar) {
        super(query, query2, j, (String) null, iVar, (C89059o) null, aVar);
        this.f233103j = new C86198ah(this.f233100g);
        this.f233175m = tVar;
    }
}
