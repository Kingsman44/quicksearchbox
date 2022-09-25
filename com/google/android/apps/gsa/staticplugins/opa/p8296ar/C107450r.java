package com.google.android.apps.gsa.staticplugins.opa.p8296ar;

import android.content.Intent;
import com.google.android.apps.gsa.broadcastreceiver.C74445c;
import com.google.android.apps.gsa.opa.p6443g.C83679a;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90055dg;
import com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c.C107431k;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3803ag.p3804a.C48857bx;
import com.google.assistant.p3803ag.p3804a.C48859bz;
import com.google.assistant.p3803ag.p3804a.C48871n;
import com.google.assistant.p3803ag.p3804a.C48877t;
import com.google.assistant.p3897e.p3921j.aaj;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.abe;
import com.google.assistant.p3897e.p3921j.abf;
import com.google.assistant.p3897e.p3921j.abu;
import com.google.assistant.p3994s.p3995a.C53119cb;
import com.google.assistant.p3994s.p3995a.C53121cd;
import com.google.assistant.p3994s.p3995a.C53122ce;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.r */
/* compiled from: PG */
public final /* synthetic */ class C107450r implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C107458z f299005a;

    /* renamed from: b */
    public final /* synthetic */ C48871n f299006b;

    public /* synthetic */ C107450r(C107458z zVar, C48871n nVar) {
        this.f299005a = zVar;
        this.f299006b = nVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        C107458z zVar = this.f299005a;
        C48871n nVar = this.f299006b;
        C118826c cVar = (C118826c) obj;
        C59104x b = C107458z.f299018a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "actionPayloadHandler");
        ((C59052c) ((C59052c) b).mo56372aa(25363)).mo56386p("storeActiveContent sendContentToSurface...");
        C107431k kVar = zVar.f299025h;
        C48877t tVar = nVar.f126474c;
        if (tVar == null) {
            tVar = C48877t.f126483b;
        }
        C62940bt r1 = C62942bv.checkIsLite(C48857bx.f126428c);
        tVar.mo58887l(r1);
        if (tVar.f169962ag.mo58857o(r1.f169971d)) {
            C62940bt r12 = C62942bv.checkIsLite(C48857bx.f126428c);
            tVar.mo58887l(r12);
            Object l = tVar.f169962ag.mo58854l(r12.f169971d);
            if (l == null) {
                obj3 = r12.f169969b;
            } else {
                obj3 = r12.mo58889c(l);
            }
            aas aas = ((C48857bx) obj3).f126430a;
            if (aas == null) {
                aas = aas.f134661u;
            }
            C83679a aVar = kVar.f298966a;
            C59104x b2 = C83679a.f228102a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "ProactiveapiIntUtils");
            ((C59052c) ((C59052c) b2).mo56372aa(6795)).mo56386p("#sendShowNotificationIntent");
            C62940bt r13 = C62942bv.checkIsLite(abu.f134764l);
            aas.mo58887l(r13);
            if (aas.f169962ag.mo58857o(r13.f169971d)) {
                C62940bt r14 = C62942bv.checkIsLite(abu.f134764l);
                aas.mo58887l(r14);
                Object l2 = aas.f169962ag.mo58854l(r14.f169971d);
                if (l2 == null) {
                    obj4 = r14.f169969b;
                } else {
                    obj4 = r14.mo58889c(l2);
                }
                abf abf = (abf) ((abu) obj4).toBuilder();
                abe abe = abe.UPDATE;
                abf.copyOnWrite();
                abu abu = (abu) abf.instance;
                abu.f134775j = abe.f134714d;
                abu.f134766a |= 512;
                aaj aaj = (aaj) aas.toBuilder();
                aaj.mo58885m(abu.f134764l, (abu) abf.build());
                aas = (aas) aaj.build();
            }
            Intent intent = new Intent();
            intent.setAction("ACTION_SHOW_NOTIFICATION");
            intent.setPackage("com.google.android.googlequicksearchbox");
            intent.putExtra("SHOW_NOTIFICATION_EXTRA", aas.toByteArray());
            C74445c.m120396c(aVar.f228104c, intent);
        } else {
            C62940bt r15 = C62942bv.checkIsLite(C48859bz.f126434c);
            tVar.mo58887l(r15);
            if (tVar.f169962ag.mo58857o(r15.f169971d)) {
                C62940bt r16 = C62942bv.checkIsLite(C48859bz.f126434c);
                tVar.mo58887l(r16);
                Object l3 = tVar.f169962ag.mo58854l(r16.f169971d);
                if (l3 == null) {
                    obj2 = r16.f169969b;
                } else {
                    obj2 = r16.mo58889c(l3);
                }
                C53121cd a = C53121cd.m86778a(((C48859bz) obj2).f126436a);
                if (a == null) {
                    a = C53121cd.UNKNOWN;
                }
                if (kVar.f298967b.mo79746e(C90055dg.f248999d)) {
                    C83679a aVar2 = kVar.f298966a;
                    C59104x b3 = C83679a.f228102a.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "ProactiveapiIntUtils");
                    ((C59052c) ((C59052c) b3).mo56372aa(6797)).mo56386p("#sendStartZsPartialRequest");
                    Intent intent2 = new Intent();
                    intent2.setAction("ACTION_START_ZS_PARTIAL_REQUEST");
                    intent2.setPackage("com.google.android.googlequicksearchbox");
                    C53119cb cbVar = (C53119cb) C53122ce.f139215b.createBuilder();
                    cbVar.mo53961a(a);
                    intent2.putExtra("ZS_PARTIAL_REQUEST_SPEC", ((C53122ce) cbVar.build()).toByteArray());
                    C74445c.m120396c(aVar2.f228104c, intent2);
                }
            }
        }
        return C118826c.f331423b;
    }
}
