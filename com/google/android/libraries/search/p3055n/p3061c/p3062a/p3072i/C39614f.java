package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3072i;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.n.c.a.i.f */
/* compiled from: PG */
public final /* synthetic */ class C39614f implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C39615g f104282a;

    /* renamed from: b */
    public final /* synthetic */ C39618j f104283b;

    /* renamed from: c */
    public final /* synthetic */ C70862aj f104284c;

    public /* synthetic */ C39614f(C39615g gVar, C39618j jVar, C70862aj ajVar) {
        this.f104282a = gVar;
        this.f104283b = jVar;
        this.f104284c = ajVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        Object obj;
        C39615g gVar = this.f104282a;
        C39618j jVar = this.f104283b;
        C70862aj ajVar = this.f104284c;
        C62940bt r3 = C62942bv.checkIsLite(C39625q.f104304d);
        jVar.mo58887l(r3);
        if (jVar.f169962ag.mo58857o(r3.f169971d)) {
            C62940bt r32 = C62942bv.checkIsLite(C39625q.f104304d);
            jVar.mo58887l(r32);
            Object l = jVar.f169962ag.mo58854l(r32.f169971d);
            if (l == null) {
                obj = r32.f169969b;
            } else {
                obj = r32.mo58889c(l);
            }
            C39624p a = C39624p.m69074a(((C39625q) obj).f104307b);
            if (a == null) {
                a = C39624p.UNSPECIFIED;
            }
            C59104x b = C39615g.f104285a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SodaHotwordFEService");
            ((C59052c) ((C59052c) b).mo56372aa(53786)).mo56389s("Got VoiceMatchEnrollmentStateUpdateRequest, state: %s", a.name());
            gVar.f104286b.f104296a.getAndSet(a);
        }
        C58976aa aaVar = C58975e.f156826a;
        C60870cx a2 = gVar.f104287c.mo41797a(jVar);
        ajVar.mo20123c(C39620l.f104294a);
        ajVar.mo20121a();
        return a2;
    }
}
