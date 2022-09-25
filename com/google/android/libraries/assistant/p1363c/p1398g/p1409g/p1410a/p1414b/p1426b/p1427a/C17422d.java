package com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1414b.p1426b.p1427a;

import com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1414b.p1415a.C17404a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1414b.p1429d.C17426a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17485au;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66555al;
import com.google.speech.p5208h.C66599by;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66615cm;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.c.g.g.a.b.b.a.d */
/* compiled from: PG */
public final class C17422d extends C68247h {

    /* renamed from: a */
    private final C68283d f50325a;

    /* renamed from: c */
    private final C68283d f50326c;

    /* renamed from: d */
    private final C68283d f50327d;

    /* renamed from: e */
    private final C68283d f50328e;

    /* renamed from: f */
    private final C68283d f50329f;

    /* renamed from: g */
    private final C68283d f50330g;

    public C17422d(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6) {
        super(aVar2, new C68277d(C17422d.class), aVar);
        this.f50325a = C68236af.m98549d(dVar);
        this.f50326c = C68236af.m98549d(dVar2);
        this.f50327d = C68236af.m98549d(dVar3);
        this.f50328e = C68236af.m98549d(dVar4);
        this.f50329f = C68236af.m98549d(dVar5);
        this.f50330g = C68236af.m98549d(dVar6);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C66606cd cdVar;
        List list = (List) obj;
        C17485au auVar = (C17485au) list.get(0);
        String str = (String) list.get(1);
        C68282c cVar = (C68282c) list.get(2);
        C17404a aVar = (C17404a) list.get(3);
        C68283d dVar = this.f50329f;
        Executor executor = (Executor) list.get(4);
        C58976aa aaVar = C58975e.f156826a;
        if ((auVar.f50483a & 64) != 0) {
            C66607ce ceVar = auVar.f50489g;
            if (ceVar == null) {
                ceVar = C66607ce.f181191f;
            }
            cdVar = (C66606cd) ceVar.toBuilder();
        } else {
            cdVar = C17426a.m34712a();
        }
        cdVar.copyOnWrite();
        C66607ce ceVar2 = (C66607ce) cdVar.instance;
        C66607ce ceVar3 = C66607ce.f181191f;
        str.getClass();
        ceVar2.f181193a = 1 | ceVar2.f181193a;
        ceVar2.f181194b = str;
        C66607ce ceVar4 = (C66607ce) cdVar.build();
        C62940bt r2 = C62942bv.checkIsLite(C66599by.f181160q);
        ceVar4.mo58887l(r2);
        if (!ceVar4.f169962ag.mo58857o(r2.f169971d)) {
            aVar.mo23346a(cdVar);
        }
        C66607ce ceVar5 = (C66607ce) cdVar.build();
        C62940bt r22 = C62942bv.checkIsLite(C66555al.f181030h);
        ceVar5.mo58887l(r22);
        if (!ceVar5.f169962ag.mo58857o(r22.f169971d)) {
            try {
                ((C17404a) cVar.mo60292a()).mo23346a(cdVar);
            } catch (Exception e) {
                C59104x d = C17421c.f50324a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "TTS.Server");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(42722)).mo56386p("Failed to create MobileUserInfo");
            }
        }
        C66607ce ceVar6 = (C66607ce) cdVar.build();
        C62940bt r23 = C62942bv.checkIsLite(C66615cm.f181221k);
        ceVar6.mo58887l(r23);
        if (!ceVar6.f169962ag.mo58857o(r23.f169971d)) {
            return C60922j.m93044g(dVar.mo60297gq(), C47810es.m84963c(new C17420b(cdVar)), executor);
        }
        return C60856cj.m92900i((C66607ce) cdVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f50325a.mo60297gq(), this.f50326c.mo60297gq(), C68236af.m98546a(this.f50327d.mo60297gq()), this.f50328e.mo60297gq(), this.f50330g.mo60297gq());
    }
}
