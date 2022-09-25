package com.google.android.apps.gsa.staticplugins.opa.p8204al;

import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119052h;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.al.as */
/* compiled from: PG */
public final class C106339as extends C68247h {

    /* renamed from: a */
    private final C68283d f296658a;

    /* renamed from: c */
    private final C68283d f296659c;

    /* renamed from: d */
    private final C68283d f296660d;

    /* renamed from: e */
    private final C68283d f296661e;

    /* renamed from: f */
    private final C68283d f296662f;

    /* renamed from: g */
    private final C68283d f296663g;

    /* renamed from: h */
    private final C68283d f296664h;

    public C106339as(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7) {
        super(aVar2, new C68277d(C106339as.class), aVar);
        this.f296658a = C68236af.m98549d(dVar);
        this.f296659c = C68236af.m98549d(dVar2);
        this.f296660d = C68236af.m98549d(dVar3);
        this.f296661e = C68236af.m98549d(dVar4);
        this.f296662f = C68236af.m98549d(dVar5);
        this.f296663g = C68236af.m98549d(dVar6);
        this.f296664h = C68236af.m98549d(dVar7);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(1);
        long longValue = ((Long) list.get(3)).longValue();
        u uVar = (u) list.get(5);
        C22871g gVar = (C22871g) list.get(6);
        C58976aa aaVar = C58975e.f156826a;
        ((C119052h) list.get(0)).mo104091c();
        uVar.h("VoiceResultModule", (C58833ax) list.get(4));
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.SPEECH_END_RECEIVED;
        fVar.mo83701c("rId", Long.toString(longValue));
        ((C89859i) list.get(2)).mo74236a(fVar.mo83699a());
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f296658a.mo60297gq(), this.f296659c.mo60297gq(), this.f296660d.mo60297gq(), this.f296661e.mo60297gq(), this.f296662f.mo60297gq(), this.f296663g.mo60297gq(), this.f296664h.mo60297gq());
    }
}
