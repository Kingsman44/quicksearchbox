package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import com.google.android.libraries.assistant.p1467d.p1471b.C17834t;
import com.google.android.libraries.assistant.p1467d.p1471b.C17835u;
import com.google.android.libraries.assistant.p1467d.p1472c.p1474b.p1475a.C17859i;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17900bc;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17908j;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17909k;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p3186j$.util.Optional;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.a */
/* compiled from: PG */
final class C119576a implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C119607b f333272a;

    public C119576a(C119607b bVar) {
        this.f333272a = bVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f333272a.f333352b.mo104454a();
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C119607b.f333351a.mo56226d()).mo56382g(th)).mo56372aa(34444)).mo56386p("error");
        C119587ag agVar = this.f333272a.f333352b;
        agVar.mo104454a();
        agVar.f333296a.mo104460c();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        Object obj2;
        int a;
        C119587ag agVar = this.f333272a.f333352b;
        C17909k kVar = ((C17859i) obj).f51189b;
        if (kVar == null) {
            kVar = C17909k.f51314c;
        }
        C17908j a2 = C17908j.m35107a(kVar.f51317b);
        if (a2 == null) {
            a2 = C17908j.UNKNOWN;
        }
        a2.name();
        C17908j a3 = C17908j.m35107a(kVar.f51317b);
        if (a3 == null) {
            a3 = C17908j.UNKNOWN;
        }
        if (a3.ordinal() == 3) {
            C62940bt r1 = C62942bv.checkIsLite(C17900bc.f51289a);
            kVar.mo58887l(r1);
            if (kVar.f169962ag.mo58857o(r1.f169971d)) {
                C62940bt r12 = C62942bv.checkIsLite(C17900bc.f51289a);
                kVar.mo58887l(r12);
                Object l = kVar.f169962ag.mo58854l(r12.f169971d);
                if (l == null) {
                    obj2 = r12.f169969b;
                } else {
                    obj2 = r12.mo58889c(l);
                }
                int i = ((C17835u) obj2).f51171b;
                int a4 = C17834t.m35075a(i);
                if (a4 == 0 || a4 == 1 || ((a = C17834t.m35075a(i)) != 0 && a == 4)) {
                    agVar.f333297b = Optional.empty();
                } else {
                    agVar.f333297b = Optional.m71637of(kVar);
                }
                agVar.mo104455b();
            }
        }
        agVar.f333296a.mo104459b(kVar);
    }
}
