package com.google.android.apps.gsa.staticplugins.p7686co.p7692f;

import android.accounts.Account;
import android.app.Notification;
import android.app.PendingIntent;
import android.databinding.C0118a;
import com.google.android.apps.gsa.gcm.g;
import com.google.android.apps.gsa.proactive.p6475b.C84160c;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.sidekick.main.notifications.C91520be;
import com.google.android.apps.gsa.sidekick.main.notifications.C91529c;
import com.google.android.apps.gsa.sidekick.main.notifications.C91530d;
import com.google.android.apps.gsa.sidekick.main.notifications.C91533g;
import com.google.android.apps.gsa.sidekick.main.p7201d.C91284a;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91385o;
import com.google.android.apps.gsa.staticplugins.p7686co.p7687a.C98104ce;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7702gu;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7799kj;
import com.google.p375ai.p378b.C8108vv;
import com.google.p4283bv.p4345d.p4346a.p4347a.C56958h;
import com.google.p4283bv.p4345d.p4346a.p4347a.C56961k;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.f.c */
/* compiled from: PG */
public final class C98311c implements g, C90991b {

    /* renamed from: a */
    private static final C59071e f274429a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.co.f.c");

    /* renamed from: b */
    private final C98104ce f274430b;

    /* renamed from: c */
    private final C68214a f274431c;

    /* renamed from: d */
    private final C68214a f274432d;

    /* renamed from: e */
    private final C91520be f274433e;

    /* renamed from: f */
    private final C91385o f274434f;

    /* renamed from: g */
    private final C84160c f274435g;

    /* renamed from: h */
    private final C68214a f274436h;

    /* renamed from: i */
    private final C91533g f274437i;

    /* renamed from: j */
    private final Object f274438j = new Object();

    public C98311c(C98104ce ceVar, C68214a aVar, C68214a aVar2, C91533g gVar, C91520be beVar, C91385o oVar, C84160c cVar, C68214a aVar3) {
        this.f274430b = ceVar;
        this.f274431c = aVar;
        this.f274432d = aVar2;
        this.f274437i = gVar;
        this.f274433e = beVar;
        this.f274434f = oVar;
        this.f274435g = cVar;
        this.f274436h = aVar3;
    }

    /* renamed from: a */
    public final void mo91044a(byte[] bArr, C60220t tVar, String str) {
        C56961k kVar;
        C7702gu guVar;
        C7702gu guVar2;
        C7702gu guVar3;
        C59071e eVar = f274429a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SidekickGcmMsgHandler");
        C0118a.m109q(b, "Step 4: SidekickGcmMessageHandler:handleMessage", 30591, "NotificationFullFlow", C58975e.f156826a);
        try {
            C8108vv vvVar = (C8108vv) C62942bv.parseFrom((C62942bv) C8108vv.f28502f, bArr, C62921ba.m95368a());
            Account a = ((C86054o) this.f274432d.mo27525b()).mo79668a();
            if (a != null) {
                boolean x = ((C85651bb) this.f274431c.mo27525b()).mo79161x(a);
                String a2 = C91284a.m149219a(a);
                if ((vvVar.f28504a & 2) == 0 || a2.equals(vvVar.f28508e)) {
                    try {
                        int i = vvVar.f28504a;
                        if ((i & 16) != 0) {
                            C59104x d = eVar.mo56226d();
                            d.mo56378ag(C58975e.f156826a, "SidekickGcmMsgHandler");
                            ((C59052c) ((C59052c) d).mo56372aa(30595)).mo56386p("Received chime message but Booza is turned down.");
                            int i2 = C90755l.f253831a;
                            return;
                        }
                        int i3 = vvVar.f28505b;
                        if (i3 == 3) {
                            C7702gu guVar4 = (C7702gu) vvVar.f28506c;
                            C59104x b2 = eVar.mo56224b();
                            b2.mo56378ag(C58975e.f156826a, "SidekickGcmMsgHandler");
                            C59052c cVar = (C59052c) b2;
                            cVar.mo56378ag(C58975e.f156826a, "NotificationFullFlow");
                            ((C59052c) cVar.mo56372aa(30600)).mo56386p("Step 5: SidekickGcmMessageHandler:handlePushByValue");
                            if (x) {
                                C98104ce ceVar = this.f274430b;
                                if (vvVar.f28505b == 3) {
                                    guVar3 = (C7702gu) vvVar.f28506c;
                                } else {
                                    guVar3 = C7702gu.f26879c;
                                }
                                C90877ak.m148472f(ceVar.mo90922q(guVar3));
                                return;
                            }
                            if (vvVar.f28505b == 3) {
                                guVar = (C7702gu) vvVar.f28506c;
                            } else {
                                guVar = C7702gu.f26879c;
                            }
                            if (guVar.f26881a.size() > 0) {
                                ArrayList<C91530d> arrayList = new ArrayList<>();
                                synchronized (this.f274438j) {
                                    if (vvVar.f28505b == 3) {
                                        guVar2 = (C7702gu) vvVar.f28506c;
                                    } else {
                                        guVar2 = C7702gu.f26879c;
                                    }
                                    for (C7718hj j : guVar2.f26881a) {
                                        C91530d dVar = (C91530d) this.f274437i.mo85797j(j);
                                        if (dVar != null) {
                                            arrayList.add(dVar);
                                        }
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    for (C91530d dVar2 : arrayList) {
                                        Notification b3 = this.f274433e.mo85860b(C91529c.m149709a(dVar2), dVar2, (PendingIntent) null, false, C58729pv.f156485a);
                                        if (b3 == null) {
                                            C59104x c = f274429a.mo56225c();
                                            c.mo56378ag(C58975e.f156826a, "SidekickGcmMsgHandler");
                                            ((C59052c) ((C59052c) c).mo56372aa(30601)).mo56389s("Unable to create notification for %s", dVar2);
                                        } else {
                                            this.f274434f.mo85703f(C48004n.f124238a, C91529c.m149709a(dVar2), b3);
                                        }
                                    }
                                }
                            }
                        } else if (i3 == 6) {
                            try {
                                C56961k kVar2 = (C56961k) vvVar.f28506c;
                                C84160c cVar2 = this.f274435g;
                                C7642eo eoVar = C7642eo.PUSH_FOR_REQUEST;
                                if (vvVar.f28505b == 6) {
                                    kVar = (C56961k) vvVar.f28506c;
                                } else {
                                    kVar = C56961k.f152007e;
                                }
                                C90877ak.m148472f(cVar2.mo77601b(eoVar, kVar, tVar, str));
                            } catch (ExecutionException e) {
                                e = e;
                                C59104x c2 = f274429a.mo56225c();
                                c2.mo56378ag(C58975e.f156826a, "SidekickGcmMsgHandler");
                                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(30603)).mo56386p("Failed to send request");
                            } catch (InterruptedException e2) {
                                e = e2;
                                C59104x c22 = f274429a.mo56225c();
                                c22.mo56378ag(C58975e.f156826a, "SidekickGcmMsgHandler");
                                ((C59052c) ((C59052c) ((C59052c) c22).mo56382g(e)).mo56372aa(30603)).mo56386p("Failed to send request");
                            }
                        } else if ((i & 1) != 0) {
                            C7799kj kjVar = vvVar.f28507d;
                            if (kjVar == null) {
                                kjVar = C7799kj.f27263h;
                            }
                            if (kjVar.f27268e.size() != 0) {
                                C56958h hVar = (C56958h) C56961k.f152007e.createBuilder();
                                C62971cq cqVar = kjVar.f27268e;
                                hVar.copyOnWrite();
                                C56961k kVar3 = (C56961k) hVar.instance;
                                C62971cq cqVar2 = kVar3.f152011c;
                                if (!cqVar2.mo58948c()) {
                                    kVar3.f152011c = C62942bv.mutableCopy(cqVar2);
                                }
                                C62947c.addAll((Iterable) cqVar, (List) kVar3.f152011c);
                                hVar.copyOnWrite();
                                C56961k kVar4 = (C56961k) hVar.instance;
                                kVar4.f152010b = 1;
                                kVar4.f152009a |= 1;
                                C90877ak.m148472f(this.f274435g.mo77601b(C7642eo.PUSH_FOR_REQUEST, (C56961k) hVar.build(), tVar, str));
                            } else if (kjVar.f27267c.size() != 0) {
                                C59104x d2 = eVar.mo56226d();
                                d2.mo56378ag(C58975e.f156826a, "SidekickGcmMsgHandler");
                                ((C59052c) ((C59052c) d2).mo56372aa(30604)).mo56386p("Should not be using EntryTypeRestrict. Partial responses are no longer supported.");
                                int i4 = C90755l.f253831a;
                            } else {
                                C56958h hVar2 = (C56958h) C56961k.f152007e.createBuilder();
                                hVar2.copyOnWrite();
                                C56961k kVar5 = (C56961k) hVar2.instance;
                                kVar5.f152010b = 1;
                                kVar5.f152009a |= 1;
                                C90877ak.m148472f(this.f274435g.mo77601b(C7642eo.PUSH_FOR_REQUEST, (C56961k) hVar2.build(), tVar, str));
                            }
                        }
                    } catch (ExecutionException e3) {
                        C59104x c3 = f274429a.mo56225c();
                        c3.mo56378ag(C58975e.f156826a, "SidekickGcmMsgHandler");
                        ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e3)).mo56372aa(30593)).mo56386p("Failed to update using push message");
                        ((C89911f) this.f274436h.mo27525b()).mo83755a(e3, 62037912, 29).mo83721a();
                    } catch (InterruptedException e4) {
                        C59104x c4 = f274429a.mo56225c();
                        c4.mo56378ag(C58975e.f156826a, "SidekickGcmMsgHandler");
                        ((C59052c) ((C59052c) ((C59052c) c4).mo56382g(e4)).mo56372aa(30594)).mo56386p("Update using push message interrupted");
                        Thread.currentThread().interrupt();
                    }
                } else {
                    C59104x b4 = eVar.mo56224b();
                    b4.mo56378ag(C58975e.f156826a, "SidekickGcmMsgHandler");
                    ((C59052c) ((C59052c) b4).mo56372aa(30596)).mo56386p("Received a push message for another account on this phone");
                }
            }
        } catch (C62974ct e5) {
            C59104x d3 = f274429a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "SidekickGcmMsgHandler");
            ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e5)).mo56372aa(30598)).mo56386p("Bad push message received over GCM");
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
    }
}
