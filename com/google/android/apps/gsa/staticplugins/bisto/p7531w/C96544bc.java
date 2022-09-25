package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.shared.bisto.C89646bc;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124627at;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124640bf;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp;
import com.google.android.p10712d.C142465gi;
import com.google.android.p10712d.C142467gk;
import com.google.android.p10712d.C142468gl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.bc */
/* compiled from: PG */
public final /* synthetic */ class C96544bc implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96546be f270086a;

    public /* synthetic */ C96544bc(C96546be beVar) {
        this.f270086a = beVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96546be beVar = this.f270086a;
        Map map = (Map) obj;
        for (C142468gl glVar : map.values()) {
            C142467gk a = C142467gk.m231089a(glVar.f386623b);
            if (a == null) {
                a = C142467gk.OTA_UNKNOWN;
            }
            if (C142467gk.OTA_ERROR.equals(a)) {
                C59071e eVar = C96547bf.f270092a;
                C58976aa aaVar = C58975e.f156826a;
                beVar.f270091d.mo90226c();
                return;
            }
        }
        for (C142468gl glVar2 : map.values()) {
            C142467gk a2 = C142467gk.m231089a(glVar2.f386623b);
            if (a2 == null) {
                a2 = C142467gk.OTA_UNKNOWN;
            }
            if (!beVar.f270088a && C142467gk.OTA_RECEIVED.equals(a2)) {
                C59071e eVar2 = C96547bf.f270092a;
                C58976aa aaVar2 = C58975e.f156826a;
            } else if (beVar.f270088a && !C142467gk.OTA_IDLE.equals(a2) && !C142467gk.OTA_TEMPORARILY_BUSY.equals(a2)) {
                C59071e eVar3 = C96547bf.f270092a;
                C58976aa aaVar3 = C58975e.f156826a;
            }
            C60870cx cxVar = beVar.f270090c;
            if (cxVar != null) {
                cxVar.cancel(false);
            }
            C89646bc bcVar = beVar.f270089b;
            if (!bcVar.mo83536c()) {
                beVar.f270090c = beVar.f270091d.f270141s.mo28208h("exitStateIfOtaIsFinished", bcVar.mo83534a(), new C96543bb(beVar));
                return;
            } else if (beVar.f270088a) {
                C59104x c = C96547bf.f270092a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "OtaStateApplySent");
                ((C59052c) ((C59052c) c).mo56372aa(16606)).mo56386p("Max retry time exceeded!");
                beVar.f270091d.f270096e.mo90283g();
                beVar.f270091d.mo90240o(C124625ar.UNKNOWN_INTERNAL_OTA_STATE);
                return;
            } else {
                C59104x b = C96547bf.f270092a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "OtaStateApplySent");
                ((C59052c) ((C59052c) b).mo56372aa(16605)).mo56386p("Max retry time exceeded!");
                return;
            }
        }
        C96547bf bfVar = beVar.f270091d;
        C59104x b2 = C96547bf.f270092a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "OtaStateApplySent");
        ((C59052c) ((C59052c) b2).mo56372aa(16610)).mo56389s("exitState %s", bfVar.f270138p.mo89270k());
        for (C124650bp bpVar : bfVar.f270133k.f343828o) {
            if ((bpVar.f343892a & 1) != 0) {
                int i = bpVar.f343893b;
                Integer valueOf = Integer.valueOf(i);
                C142468gl glVar3 = (C142468gl) map.get(valueOf);
                if (glVar3 == null) {
                    C59104x c2 = C96547bf.f270092a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "OtaStateApplySent");
                    ((C59052c) ((C59052c) c2).mo56372aa(16619)).mo56389s("No state for device: %s", bpVar);
                } else {
                    C124627at a3 = C124627at.m204292a(bpVar.f343906o);
                    if (a3 == null) {
                        a3 = C124627at.UNKNOWN_OTA_TYPE;
                    }
                    int ordinal = a3.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                if (!bfVar.f270098g.mo83586c(glVar3).contains(bpVar.f343903l)) {
                                    C59104x c3 = C96547bf.f270092a.mo56225c();
                                    c3.mo56378ag(C58975e.f156826a, "OtaStateApplySent");
                                    ((C59052c) ((C59052c) c3).mo56372aa(16618)).mo56387q("Model upload failed device %d", i);
                                } else {
                                    C59104x b3 = C96547bf.f270092a.mo56224b();
                                    b3.mo56378ag(C58975e.f156826a, "OtaStateApplySent");
                                    ((C59052c) ((C59052c) b3).mo56372aa(16617)).mo56386p("Model upload success");
                                }
                                bfVar.f270096e.mo90283g();
                                C89492cd cdVar = (C89492cd) bfVar.f270136n.mo27525b();
                                String k = bfVar.f270138p.mo89270k();
                                String str = bpVar.f343903l;
                                String str2 = glVar3.f386631j;
                                Collection c4 = bfVar.f270098g.mo83586c(glVar3);
                                String str3 = glVar3.f386629h;
                                String str4 = glVar3.f386630i;
                                C142465gi a4 = C142465gi.m231087a(glVar3.f386628g);
                                if (a4 == null) {
                                    a4 = C142465gi.DEVICE_TYPE_UNKNOWN;
                                }
                                cdVar.mo83389ae(k, str, str2, c4, str3, str4, a4.equals(C142465gi.DEVICE_TYPE_HOTWORD_MODEL));
                                bfVar.f270100i.mo28207g("activateHotword", new C96538ax(bfVar));
                            } else if (ordinal != 4) {
                                C59104x c5 = C96547bf.f270092a.mo56225c();
                                c5.mo56378ag(C58975e.f156826a, "OtaStateApplySent");
                                ((C59052c) ((C59052c) c5).mo56372aa(16611)).mo56352E("unexpected ota type=%s for device=%d", a3, i);
                            }
                        }
                        if ((glVar3.f386622a & 512) != 0) {
                            String str5 = glVar3.f386631j;
                            String str6 = bpVar.f343903l;
                            String str7 = bpVar.f343904m;
                            C89492cd cdVar2 = (C89492cd) bfVar.f270136n.mo27525b();
                            String k2 = bfVar.f270138p.mo89270k();
                            Collection c6 = bfVar.f270098g.mo83586c(glVar3);
                            String str8 = glVar3.f386629h;
                            String str9 = glVar3.f386630i;
                            C142465gi a5 = C142465gi.m231087a(glVar3.f386628g);
                            if (a5 == null) {
                                a5 = C142465gi.DEVICE_TYPE_UNKNOWN;
                            }
                            cdVar2.mo83389ae(k2, str6, str5, c6, str8, str9, a5.equals(C142465gi.DEVICE_TYPE_HOTWORD_MODEL));
                            if (!str5.equals(str6)) {
                                C59104x c7 = C96547bf.f270092a.mo56225c();
                                c7.mo56378ag(C58975e.f156826a, "OtaStateApplySent");
                                ((C59052c) ((C59052c) c7).mo56372aa(16615)).mo56359L("Model update failed for device %d. Old: %s, new %s", valueOf, str7, str5);
                                bfVar.f270096e.mo90283g();
                            } else {
                                C59104x b4 = C96547bf.f270092a.mo56224b();
                                b4.mo56378ag(C58975e.f156826a, "OtaStateApplySent");
                                ((C59052c) ((C59052c) b4).mo56372aa(16614)).mo56359L("Success for device %d. Old: %s, new: %s", valueOf, str7, str5);
                                int a6 = C124640bf.m204304a(bfVar.f270133k.f343818e);
                                if ((a6 == 0 || a6 != 2) && C96547bf.m159963m(bfVar.f270134l)) {
                                    bfVar.f270096e.mo90278c();
                                }
                            }
                        } else {
                            C59104x c8 = C96547bf.f270092a.mo56225c();
                            c8.mo56378ag(C58975e.f156826a, "OtaStateApplySent");
                            ((C59052c) ((C59052c) c8).mo56372aa(16616)).mo56387q("Model update failed for device %d, missing active model id", i);
                        }
                    } else {
                        String str10 = glVar3.f386627f;
                        if (str10.isEmpty() && i == 0) {
                            str10 = bfVar.f270134l.mo106472M();
                            i = 0;
                        }
                        String str11 = bpVar.f343894c;
                        String str12 = bpVar.f343895d;
                        if (C96533as.m159941b(str11, str10, bfVar.f270134l.mo106514l())) {
                            C59104x b5 = C96547bf.f270092a.mo56224b();
                            b5.mo56378ag(C58975e.f156826a, "OtaStateApplySent");
                            ((C59052c) ((C59052c) b5).mo56372aa(16613)).mo56359L("Success for device %d. Old: %s, new: %s", Integer.valueOf(i), str12, str10);
                            int a7 = C124640bf.m204304a(bfVar.f270133k.f343818e);
                            if ((a7 == 0 || a7 != 2) && C96547bf.m159963m(bfVar.f270134l)) {
                                bfVar.f270096e.mo90278c();
                            }
                        } else {
                            C59104x c9 = C96547bf.f270092a.mo56225c();
                            c9.mo56378ag(C58975e.f156826a, "OtaStateApplySent");
                            ((C59052c) ((C59052c) c9).mo56372aa(16612)).mo56359L("Failed for device %d. Expected: %s, new: %s", Integer.valueOf(i), str11, str10);
                            bfVar.f270096e.mo90283g();
                        }
                    }
                }
            } else {
                C59104x c10 = C96547bf.f270092a.mo56225c();
                c10.mo56378ag(C58975e.f156826a, "OtaStateApplySent");
                ((C59052c) ((C59052c) c10).mo56372aa(16620)).mo56389s("No device index: %s", bpVar);
            }
        }
        bfVar.mo90240o(C124625ar.UNKNOWN_INTERNAL_OTA_STATE);
    }
}
