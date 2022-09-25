package com.google.android.libraries.search.p3055n.p3081g.p3082a;

import com.google.android.libraries.assistant.soda.p1606e.C19303c;
import com.google.android.libraries.assistant.soda.p1606e.p1607a.C19299m;
import com.google.android.libraries.p590as.p593b.p596b.C10812ap;
import com.google.android.libraries.p590as.p593b.p596b.p604g.C10879g;
import com.google.android.libraries.search.p3055n.p3086i.C39780b;
import com.google.android.libraries.search.p3055n.p3086i.C39783e;
import com.google.android.libraries.search.p3055n.p3086i.C39785g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62963cj;
import java.util.Locale;
import p3186j$.util.Optional;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.n.g.a.ai */
/* compiled from: PG */
final class C39726ai implements C70862aj {

    /* renamed from: a */
    public final C70862aj f104537a;

    /* renamed from: b */
    final /* synthetic */ C39727aj f104538b;

    public C39726ai(C39727aj ajVar, C70862aj ajVar2) {
        this.f104538b = ajVar;
        this.f104537a = ajVar2;
    }

    /* renamed from: a */
    public final void mo20121a() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C59104x c = C39727aj.f104539a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SodaResourceManager");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(53847)).mo56386p("#onError");
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20123c(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        C60870cx cxVar;
        C60870cx cxVar2;
        C60870cx cxVar3;
        C39785g gVar = (C39785g) obj;
        C58976aa aaVar = C58975e.f156826a;
        C62940bt r0 = C62942bv.checkIsLite(C39780b.f104633d);
        gVar.mo58887l(r0);
        if (!gVar.f169962ag.mo58857o(r0.f169971d)) {
            C59104x b = C39727aj.f104539a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SodaResourceManager");
            ((C59052c) ((C59052c) b).mo56372aa(53851)).mo56386p("#onNext with no locale request. Ignoring.");
            return;
        }
        C62940bt r02 = C62942bv.checkIsLite(C39780b.f104633d);
        gVar.mo58887l(r02);
        Object l = gVar.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj2 = r02.f169969b;
        } else {
            obj2 = r02.mo58889c(l);
        }
        if ((((C39780b) obj2).f104635a & 1) != 0) {
            C62940bt r03 = C62942bv.checkIsLite(C39780b.f104633d);
            gVar.mo58887l(r03);
            Object l2 = gVar.f169962ag.mo58854l(r03.f169971d);
            if (l2 == null) {
                obj3 = r03.f169969b;
            } else {
                obj3 = r03.mo58889c(l2);
            }
            Locale forLanguageTag = Locale.forLanguageTag(((C39780b) obj3).f104636b);
            C62940bt r3 = C62942bv.checkIsLite(C39783e.f104639d);
            gVar.mo58887l(r3);
            Object l3 = gVar.f169962ag.mo58854l(r3.f169971d);
            if (l3 == null) {
                obj4 = r3.f169969b;
            } else {
                obj4 = r3.mo58889c(l3);
            }
            C58485gu j = C58485gu.m89842j(new C62963cj(((C39783e) obj4).f104641a, C39783e.f104637b));
            C59104x b2 = C39727aj.f104539a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SodaResourceManager");
            ((C59052c) ((C59052c) b2).mo56372aa(53849)).mo56389s("Requested resources IDs: %s. Note that this is a noop because we currently return all resource for each request.", j);
            C39751v vVar = this.f104538b.f104542d;
            ((C58970a) ((C58970a) C39751v.f104571a.mo56224b()).mo56372aa(53825)).mo56386p("#getAndUpdateSodaResourceCollection");
            if (vVar.f104573c.isEmpty()) {
                ((C58970a) ((C58970a) C39751v.f104571a.mo56224b()).mo56372aa(53828)).mo56386p("LanguagePack queries skipped because no provider is bound.");
                cxVar = C60856cj.m92900i(C58485gu.m89845m());
            } else {
                cxVar = C47633f.m84733g(((C10812ap) vVar.f104572b.get()).mo19302d(C10879g.f35958g)).mo51516i(new C39741l(vVar), vVar.f104578h).mo51515h(C39742m.f104563a, vVar.f104578h);
            }
            if (vVar.f104574d.isEmpty()) {
                ((C58970a) ((C58970a) C39751v.f104571a.mo56224b()).mo56372aa(53827)).mo56386p("Hotword model queries skipped because no provider is bound.");
                cxVar2 = C60856cj.m92900i(Optional.empty());
            } else {
                cxVar2 = C47633f.m84733g(((C19303c) vVar.f104574d.get()).mo24451b(forLanguageTag.toLanguageTag())).mo51516i(new C39735f(vVar), vVar.f104578h).mo51515h(C39736g.f104553a, vVar.f104578h);
            }
            if (vVar.f104575e.isEmpty()) {
                ((C58970a) ((C58970a) C39751v.f104571a.mo56224b()).mo56372aa(53826)).mo56386p("Hotmatch model queries skipped because no provider is bound");
                cxVar3 = C60856cj.m92900i(Optional.empty());
            } else {
                cxVar3 = ((C19299m) vVar.f104575e.get()).mo24445a();
            }
            C39732c cVar = new C39732c(vVar, forLanguageTag);
            C60870cx h = C60922j.m93045h(cxVar2, C47810es.m84966f(cVar), vVar.f104578h);
            if (vVar.f104572b.isEmpty()) {
                ((C58970a) ((C58970a) C39751v.f104571a.mo56224b()).mo56372aa(53836)).mo56386p("LanguagePack downloads skipped because no provider is bound.");
            } else {
                C47633f i = C47633f.m84733g(cxVar).mo51516i(new C39733d(vVar, forLanguageTag), vVar.f104578h);
                C39750u uVar = new C39750u();
                C60856cj.m92911t(i.f164926b, C47810es.m84974n(uVar), vVar.f104578h);
            }
            C60870cx a = C47638k.m84753d(cxVar, cxVar2, cxVar3, h).mo51520a(new C39740k(cxVar, cxVar2, cxVar3, h), vVar.f104578h);
            C39724ag agVar = new C39724ag(this, forLanguageTag, j);
            C60870cx h2 = C60922j.m93045h(a, C47810es.m84966f(agVar), this.f104538b.f104540b);
            C39725ah ahVar = new C39725ah(this);
            C60856cj.m92911t(h2, C47810es.m84974n(ahVar), this.f104538b.f104540b);
            return;
        }
        C59104x d = C39727aj.f104539a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SodaResourceManager");
        ((C59052c) ((C59052c) d).mo56372aa(53850)).mo56386p("#onNext with a locale request containing no locale. Ignoring.");
    }
}
