package com.google.android.libraries.assistant.soda.p1611f;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5218j.C66762ac;
import com.google.speech.p5218j.C66891dh;
import com.google.speech.p5218j.C66938fa;
import com.google.speech.p5218j.C66999hh;
import com.google.speech.p5218j.C67087ko;
import com.google.speech.p5218j.C67105lf;
import com.google.speech.p5218j.C67141mo;
import com.google.speech.p5218j.C67143mq;
import com.google.speech.p5218j.C67161nh;
import com.google.speech.p5218j.C67167nn;
import com.google.speech.p5218j.p5219a.C66722az;
import com.google.speech.p5218j.p5219a.C66752s;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.soda.f.o */
/* compiled from: PG */
final class C19335o implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C19336p f54105a;

    /* renamed from: b */
    private final C70862aj f54106b;

    /* renamed from: c */
    private final C19329i f54107c;

    public C19335o(C19336p pVar, C70862aj ajVar) {
        this.f54105a = pVar;
        this.f54106b = ajVar;
        this.f54107c = new C19329i(pVar.f54110c);
    }

    /* renamed from: a */
    public final void mo20121a() {
        C58976aa aaVar = C58975e.f156826a;
        this.f54107c.mo24465a();
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C59104x c = C19336p.f54108a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SodaService");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(47784)).mo56386p("Error in SodaService client");
        this.f54107c.mo24465a();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20123c(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        C67105lf lfVar = (C67105lf) obj;
        C58976aa aaVar = C58975e.f156826a;
        C62940bt r0 = C62942bv.checkIsLite(C66891dh.f181853d);
        lfVar.mo58887l(r0);
        if (lfVar.f169962ag.mo58857o(r0.f169971d)) {
            C70862aj ajVar = this.f54106b;
            C19332l lVar = new C19332l(this, ajVar);
            C19329i iVar = this.f54107c;
            C62940bt r1 = C62942bv.checkIsLite(C66891dh.f181853d);
            lfVar.mo58887l(r1);
            Object l = lfVar.f169962ag.mo58854l(r1.f169971d);
            if (l == null) {
                obj6 = r1.f169969b;
            } else {
                obj6 = r1.mo58889c(l);
            }
            C66999hh hhVar = ((C66891dh) obj6).f181856b;
            if (hhVar == null) {
                hhVar = C66999hh.f182127p;
            }
            C66999hh hhVar2 = hhVar;
            C19336p pVar = this.f54105a;
            C19320a aVar = new C19320a(iVar, pVar.f54109b, lVar, hhVar2, pVar.f54112e);
            C60870cx m = C60856cj.m92904m(C47810es.m84978r(aVar), iVar.f54088c);
            C19333m mVar = new C19333m(this, ajVar);
            C60856cj.m92911t(m, C47810es.m84974n(mVar), this.f54105a.f54110c);
            return;
        }
        C62940bt r02 = C62942bv.checkIsLite(C67143mq.f182509d);
        lfVar.mo58887l(r02);
        if (lfVar.f169962ag.mo58857o(r02.f169971d)) {
            C70862aj ajVar2 = this.f54106b;
            C19329i iVar2 = this.f54107c;
            C62940bt r2 = C62942bv.checkIsLite(C67143mq.f182509d);
            lfVar.mo58887l(r2);
            Object l2 = lfVar.f169962ag.mo58854l(r2.f169971d);
            if (l2 == null) {
                obj5 = r2.f169969b;
            } else {
                obj5 = r2.mo58889c(l2);
            }
            C66752s sVar = ((C67143mq) obj5).f182512b;
            if (sVar == null) {
                sVar = C66752s.f181544q;
            }
            C19325e eVar = new C19325e(iVar2, sVar);
            C60870cx m2 = C60856cj.m92904m(C47810es.m84978r(eVar), iVar2.f54088c);
            C19331k kVar = new C19331k(this, ajVar2);
            C60856cj.m92911t(m2, C47810es.m84974n(kVar), this.f54105a.f54110c);
            return;
        }
        C62940bt r03 = C62942bv.checkIsLite(C66938fa.f181944f);
        lfVar.mo58887l(r03);
        if (lfVar.f169962ag.mo58857o(r03.f169971d)) {
            C70862aj ajVar3 = this.f54106b;
            C62940bt r12 = C62942bv.checkIsLite(C66938fa.f181944f);
            lfVar.mo58887l(r12);
            Object l3 = lfVar.f169962ag.mo58854l(r12.f169971d);
            if (l3 == null) {
                obj4 = r12.f169969b;
            } else {
                obj4 = r12.mo58889c(l3);
            }
            C19329i iVar3 = this.f54107c;
            C19327g gVar = new C19327g(iVar3, (C66938fa) obj4);
            C60870cx m3 = C60856cj.m92904m(C47810es.m84978r(gVar), iVar3.f54088c);
            C19334n nVar = new C19334n(ajVar3);
            C60856cj.m92911t(m3, C47810es.m84974n(nVar), this.f54105a.f54110c);
            return;
        }
        C62940bt r04 = C62942bv.checkIsLite(C67167nn.f182565d);
        lfVar.mo58887l(r04);
        if (lfVar.f169962ag.mo58857o(r04.f169971d)) {
            C62940bt r05 = C62942bv.checkIsLite(C67167nn.f182565d);
            lfVar.mo58887l(r05);
            Object l4 = lfVar.f169962ag.mo58854l(r05.f169971d);
            if (l4 == null) {
                obj3 = r05.f169969b;
            } else {
                obj3 = r05.mo58889c(l4);
            }
            C19329i iVar4 = this.f54107c;
            C66722az azVar = ((C67167nn) obj3).f182568b;
            if (azVar == null) {
                azVar = C66722az.f181493f;
            }
            C19322b bVar = new C19322b(iVar4, azVar);
            C60856cj.m92904m(C47810es.m84978r(bVar), iVar4.f54088c);
            return;
        }
        C62940bt r06 = C62942bv.checkIsLite(C67141mo.f182504c);
        lfVar.mo58887l(r06);
        if (lfVar.f169962ag.mo58857o(r06.f169971d)) {
            C62940bt r07 = C62942bv.checkIsLite(C67141mo.f182504c);
            lfVar.mo58887l(r07);
            Object l5 = lfVar.f169962ag.mo58854l(r07.f169971d);
            if (l5 == null) {
                obj2 = r07.f169969b;
            } else {
                obj2 = r07.mo58889c(l5);
            }
            C19329i iVar5 = this.f54107c;
            int a = C67161nh.m97429a(((C67141mo) obj2).f182506a);
            if (a == 0) {
                a = 1;
            }
            C19324d dVar = new C19324d(iVar5, a);
            C60856cj.m92904m(C47810es.m84978r(dVar), iVar5.f54088c);
            return;
        }
        C62940bt r08 = C62942bv.checkIsLite(C66762ac.f181575b);
        lfVar.mo58887l(r08);
        if (lfVar.f169962ag.mo58857o(r08.f169971d)) {
            C19329i iVar6 = this.f54107c;
            C19326f fVar = new C19326f(iVar6);
            C60856cj.m92904m(C47810es.m84978r(fVar), iVar6.f54088c);
            return;
        }
        C59104x c = C19336p.f54108a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SodaService");
        ((C59052c) ((C59052c) c).mo56372aa(47786)).mo56386p("SodaRequest not handled!");
    }

    /* renamed from: d */
    public final void mo24467d(C70862aj ajVar, C67087ko koVar) {
        C19330j jVar = new C19330j(ajVar, koVar);
        C60856cj.m92903l(C47810es.m84977q(jVar), this.f54105a.f54111d);
    }
}
