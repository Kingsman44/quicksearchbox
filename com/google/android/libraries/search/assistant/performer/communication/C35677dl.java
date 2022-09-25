package com.google.android.libraries.search.assistant.performer.communication;

import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52068ea;
import com.google.assistant.p3897e.p3921j.C52069eb;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.assistant.p3897e.p3921j.C52534vh;
import com.google.assistant.p3897e.p3921j.C52535vi;
import com.google.assistant.p3897e.p3921j.C52546vt;
import com.google.assistant.p3897e.p3921j.C52547vu;
import com.google.assistant.p3897e.p3921j.C52548vv;
import com.google.assistant.p3897e.p3921j.C52549vw;
import com.google.assistant.p3897e.p3921j.C52550vx;
import com.google.assistant.p3897e.p3921j.C52552vz;
import com.google.assistant.p3897e.p3921j.C52554wa;
import com.google.assistant.p3897e.p3921j.C52555wb;
import com.google.assistant.p3897e.p3921j.C52556wc;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p4184bj.p4189b.p4190a.C55872d;
import com.google.p4184bj.p4189b.p4190a.C55873e;
import com.google.p4184bj.p4189b.p4190a.C55876h;
import com.google.p4184bj.p4189b.p4190a.C55879k;
import com.google.p4184bj.p4189b.p4190a.C55880l;
import com.google.p4479cg.C58079k;
import com.google.protobuf.C63088z;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.dl */
/* compiled from: PG */
public final /* synthetic */ class C35677dl implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C35677dl f93565a = new C35677dl();

    private /* synthetic */ C35677dl() {
    }

    public final Object apply(Object obj) {
        C52554wa waVar;
        C55873e eVar;
        C55873e eVar2;
        C58833ax axVar = (C58833ax) obj;
        if (Objects.equals(axVar, C58836b.f156633a)) {
            return C36180b.m64579c(C52235kf.NOT_FOUND, "Could not find corresponding Navigation State");
        }
        C55876h hVar = (C55876h) axVar.mo56107c();
        if (hVar == null) {
            waVar = null;
        } else if (hVar.f148689a == 2) {
            C52547vu vuVar = (C52547vu) C52550vx.f137926b.createBuilder();
            int i = 0;
            while (true) {
                if (hVar.f148689a == 2) {
                    eVar = (C55873e) hVar.f148690b;
                } else {
                    eVar = C55873e.f148682b;
                }
                if (i >= eVar.f148684a.size()) {
                    C52546vt vtVar = (C52546vt) C52554wa.f137931c.createBuilder();
                    C52550vx vxVar = (C52550vx) vuVar.build();
                    vtVar.copyOnWrite();
                    C52554wa waVar2 = (C52554wa) vtVar.instance;
                    vxVar.getClass();
                    waVar2.f137934b = vxVar;
                    waVar2.f137933a = 2;
                    waVar = (C52554wa) vtVar.build();
                    break;
                }
                if (hVar.f148689a == 2) {
                    eVar2 = (C55873e) hVar.f148690b;
                } else {
                    eVar2 = C55873e.f148682b;
                }
                C55872d dVar = (C55872d) eVar2.f148684a.get(i);
                C55880l lVar = dVar.f148680b;
                if (lVar == null) {
                    lVar = C55880l.f148692f;
                }
                C58079k kVar = lVar.f148696c;
                if (kVar == null) {
                    kVar = C58079k.f155250c;
                }
                double d = kVar.f155252a;
                C55880l lVar2 = dVar.f148680b;
                if (lVar2 == null) {
                    lVar2 = C55880l.f148692f;
                }
                C58079k kVar2 = lVar2.f148696c;
                if (kVar2 == null) {
                    kVar2 = C58079k.f155250c;
                }
                double d2 = kVar2.f155253b;
                C52534vh vhVar = (C52534vh) C52535vi.f137898d.createBuilder();
                vhVar.copyOnWrite();
                C52535vi viVar = (C52535vi) vhVar.instance;
                viVar.f137900a |= 1;
                viVar.f137901b = d;
                vhVar.copyOnWrite();
                C52535vi viVar2 = (C52535vi) vhVar.instance;
                viVar2.f137900a |= 2;
                viVar2.f137902c = d2;
                C52535vi viVar3 = (C52535vi) vhVar.build();
                if ((dVar.f148679a & 1) != 0) {
                    C55880l lVar3 = dVar.f148680b;
                    if (lVar3 == null) {
                        lVar3 = C55880l.f148692f;
                    }
                    C52555wb wbVar = (C52555wb) C52556wc.f137935f.createBuilder();
                    String str = lVar3.f148694a;
                    wbVar.copyOnWrite();
                    str.getClass();
                    ((C52556wc) wbVar.instance).f137937a = str;
                    String str2 = lVar3.f148695b;
                    wbVar.copyOnWrite();
                    str2.getClass();
                    ((C52556wc) wbVar.instance).f137938b = str2;
                    wbVar.copyOnWrite();
                    viVar3.getClass();
                    ((C52556wc) wbVar.instance).f137939c = viVar3;
                    String str3 = lVar3.f148697d;
                    wbVar.copyOnWrite();
                    str3.getClass();
                    ((C52556wc) wbVar.instance).f137940d = str3;
                    int a = C55879k.m87797a(lVar3.f148698e);
                    if (a == 0) {
                        a = 1;
                    }
                    wbVar.copyOnWrite();
                    ((C52556wc) wbVar.instance).f137941e = a - 1;
                    C52556wc wcVar = (C52556wc) wbVar.build();
                    String str4 = wcVar.f137940d;
                    C52548vv vvVar = (C52548vv) C52549vw.f137922c.createBuilder();
                    vvVar.copyOnWrite();
                    wcVar.getClass();
                    ((C52549vw) vvVar.instance).f137924a = wcVar;
                    long j = dVar.f148681c;
                    vvVar.copyOnWrite();
                    ((C52549vw) vvVar.instance).f137925b = j;
                    vuVar.mo53879a((C52549vw) vvVar.build());
                    i++;
                } else {
                    throw new IllegalArgumentException("Failed to convert MapsNavigationState to MapsNavigationStateResult. WaypointQuery is null.");
                }
            }
        } else {
            C52546vt vtVar2 = (C52546vt) C52554wa.f137931c.createBuilder();
            C52552vz vzVar = C52552vz.f137929a;
            vtVar2.copyOnWrite();
            C52554wa waVar3 = (C52554wa) vtVar2.instance;
            vzVar.getClass();
            waVar3.f137934b = vzVar;
            waVar3.f137933a = 1;
            waVar = (C52554wa) vtVar2.build();
        }
        if (waVar == null) {
            return C36180b.m64579c(C52235kf.NOT_FOUND, "Could not convert Navigation State to Result");
        }
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "maps_navigation_state_result_key";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        C63088z byteString = waVar.toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar.f137059a |= 2;
        kaVar.f137061c = byteString;
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        kaVar2.f137059a |= 1;
        kaVar2.f137060b = "assistant.api.client_op.MapsNavigationStateResult";
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
        C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
        C52235kf kfVar = C52235kf.OK;
        kdVar.copyOnWrite();
        C52236kg kgVar = (C52236kg) kdVar.instance;
        kgVar.f137092b = kfVar.f137088t;
        kgVar.f137091a |= 1;
        dzVar.copyOnWrite();
        C52070ec ecVar = (C52070ec) dzVar.instance;
        C52236kg kgVar2 = (C52236kg) kdVar.build();
        kgVar2.getClass();
        ecVar.f136654b = kgVar2;
        ecVar.f136653a = 1 | ecVar.f136653a;
        C52068ea eaVar = (C52068ea) C52069eb.f136648b.createBuilder();
        eaVar.mo53780b((C52232kc) kbVar.build());
        C52069eb ebVar = (C52069eb) eaVar.build();
        dzVar.copyOnWrite();
        C52070ec ecVar2 = (C52070ec) dzVar.instance;
        ebVar.getClass();
        ecVar2.f136655c = ebVar;
        ecVar2.f136653a |= 2;
        return (C52070ec) dzVar.build();
    }
}
