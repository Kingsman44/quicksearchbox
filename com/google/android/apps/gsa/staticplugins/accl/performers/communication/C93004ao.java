package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import com.google.android.apps.gsa.search.core.google.p6790a.C85806ay;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.assistant.p3897e.p3921j.C51809dy;
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
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4184bj.p4189b.p4190a.C55872d;
import com.google.p4184bj.p4189b.p4190a.C55873e;
import com.google.p4184bj.p4189b.p4190a.C55876h;
import com.google.p4184bj.p4189b.p4190a.C55879k;
import com.google.p4184bj.p4189b.p4190a.C55880l;
import com.google.p4479cg.C58079k;
import com.google.protobuf.C63088z;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.ao */
/* compiled from: PG */
public final class C93004ao extends C22538o {

    /* renamed from: a */
    private final C68214a f259452a;

    public C93004ao(C68214a aVar) {
        this.f259452a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C52554wa waVar;
        C52070ec ecVar;
        C55873e eVar2;
        C55873e eVar3;
        if ("navigate.FETCH_CURRENT_STATUS".equals(dyVar.f135936b)) {
            C55876h b = ((C85806ay) this.f259452a.mo27525b()).mo79451b();
            if (b == null) {
                waVar = null;
            } else {
                try {
                    if (b.f148689a == 2) {
                        C52547vu vuVar = (C52547vu) C52550vx.f137926b.createBuilder();
                        int i = 0;
                        while (true) {
                            if (b.f148689a == 2) {
                                eVar2 = (C55873e) b.f148690b;
                            } else {
                                eVar2 = C55873e.f148682b;
                            }
                            if (i >= eVar2.f148684a.size()) {
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
                            if (b.f148689a == 2) {
                                eVar3 = (C55873e) b.f148690b;
                            } else {
                                eVar3 = C55873e.f148682b;
                            }
                            C55872d dVar = (C55872d) eVar3.f148684a.get(i);
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
                                long j = dVar.f148681c;
                                C52548vv vvVar = (C52548vv) C52549vw.f137922c.createBuilder();
                                vvVar.copyOnWrite();
                                wcVar.getClass();
                                ((C52549vw) vvVar.instance).f137924a = wcVar;
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
                } catch (IllegalArgumentException e) {
                    return C60856cj.m92899h(e);
                }
            }
            if (waVar == null) {
                C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
                C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
                C52235kf kfVar = C52235kf.NOT_FOUND;
                kdVar.copyOnWrite();
                C52236kg kgVar = (C52236kg) kdVar.instance;
                kgVar.f137092b = kfVar.f137088t;
                kgVar.f137091a |= 1;
                kdVar.copyOnWrite();
                C52236kg kgVar2 = (C52236kg) kdVar.instance;
                kgVar2.f137091a = 2 | kgVar2.f137091a;
                kgVar2.f137093c = "Could not retrieve MapsNavigationStateResult. MapsNavigationStateResult is null.";
                dzVar.copyOnWrite();
                C52070ec ecVar2 = (C52070ec) dzVar.instance;
                C52236kg kgVar3 = (C52236kg) kdVar.build();
                kgVar3.getClass();
                ecVar2.f136654b = kgVar3;
                ecVar2.f136653a = 1 | ecVar2.f136653a;
                ecVar = (C52070ec) dzVar.build();
            } else {
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
                C51810dz dzVar2 = (C51810dz) C52070ec.f136651d.createBuilder();
                C52233kd kdVar2 = (C52233kd) C52236kg.f137089d.createBuilder();
                C52235kf kfVar2 = C52235kf.OK;
                kdVar2.copyOnWrite();
                C52236kg kgVar4 = (C52236kg) kdVar2.instance;
                kgVar4.f137092b = kfVar2.f137088t;
                kgVar4.f137091a |= 1;
                dzVar2.copyOnWrite();
                C52070ec ecVar3 = (C52070ec) dzVar2.instance;
                C52236kg kgVar5 = (C52236kg) kdVar2.build();
                kgVar5.getClass();
                ecVar3.f136654b = kgVar5;
                ecVar3.f136653a = 1 | ecVar3.f136653a;
                C52068ea eaVar = (C52068ea) C52069eb.f136648b.createBuilder();
                eaVar.mo53780b((C52232kc) kbVar.build());
                C52069eb ebVar = (C52069eb) eaVar.build();
                dzVar2.copyOnWrite();
                C52070ec ecVar4 = (C52070ec) dzVar2.instance;
                ebVar.getClass();
                ecVar4.f136655c = ebVar;
                ecVar4.f136653a |= 2;
                ecVar = (C52070ec) dzVar2.build();
            }
            return C60856cj.m92900i(ecVar);
        }
        throw new C22428d(dyVar);
    }
}
