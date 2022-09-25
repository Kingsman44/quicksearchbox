package com.google.android.apps.gsa.staticplugins.chime;

import android.app.Notification;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.chime.p7660e.C97687e;
import com.google.android.apps.gsa.staticplugins.chime.p7665g.C97718a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.notifications.C30007h;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.android.libraries.notifications.p2293h.C30014g;
import com.google.android.libraries.notifications.p2305m.C30054a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7573c;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55568d;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56967c;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56968d;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56973i;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56975k;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56982r;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56984t;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.o */
/* compiled from: PG */
public final class C97733o implements C30014g {

    /* renamed from: a */
    public static final C59071e f272885a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.chime.o");

    /* renamed from: b */
    private final C97669c f272886b;

    /* renamed from: c */
    private final C97687e f272887c;

    /* renamed from: d */
    private final C22871g f272888d;

    /* renamed from: e */
    private final C68214a f272889e;

    /* renamed from: f */
    private final C97718a f272890f;

    public C97733o(C97669c cVar, C97687e eVar, C22871g gVar, C97718a aVar, C68214a aVar2) {
        this.f272886b = cVar;
        this.f272887c = eVar;
        this.f272888d = gVar;
        this.f272890f = aVar;
        this.f272889e = aVar2;
    }

    /* renamed from: h */
    private final void m161991h(C29820k kVar, C29827r rVar, C55568d dVar, boolean z) {
        C7681g gVar;
        C63070h hVar = dVar.f146621i;
        if (hVar == null) {
            hVar = C63070h.f170215c;
        }
        if (!hVar.f170218b.mo59173M()) {
            try {
                C56984t tVar = (C56984t) C62942bv.parseFrom((C62942bv) C56984t.f152114f, hVar.f170218b, C62921ba.m95368a());
                C56975k kVar2 = tVar.f152117b;
                if (kVar2 == null) {
                    kVar2 = C56975k.f152090f;
                }
                this.f272890f.mo90797a(rVar.mo35063j(), "Action Clicked", dVar.f146614b == 4 ? (String) dVar.f146615c : BuildConfig.FLAVOR);
                if ((kVar2.f152092a & 1) != 0) {
                    gVar = C7681g.m22802a(kVar2.f152095d);
                    if (gVar == null) {
                        gVar = C7681g.INVALID;
                    }
                } else {
                    gVar = C7681g.CLICK_NOTIFICATION_ACTION;
                }
                m161993j(gVar, C58485gu.m89846n(rVar));
                C97669c cVar = this.f272886b;
                if (dVar.f146614b == 4) {
                    String str = (String) dVar.f146615c;
                }
                if (cVar.mo90788a(rVar, kVar2, z)) {
                    C62963cj cjVar = new C62963cj(tVar.f152118c, C56984t.f152113d);
                    if (cjVar.contains(C56982r.LOG_DISMISS)) {
                        m161993j(C7681g.DISMISS_NOTIFICATION, C58485gu.m89846n(rVar));
                    }
                    if (cjVar.contains(C56982r.LOG_CLICK_NOTIFICATION)) {
                        m161993j(C7681g.CLICK_NOTIFICATION, C58485gu.m89846n(rVar));
                    }
                    if (cjVar.contains(C56982r.REMOVE_INLINE_CONTROLS)) {
                        String j = rVar.mo35063j();
                        C30007h d = C30007h.m55637d();
                        C63062g gVar2 = (C63062g) C63070h.f170215c.createBuilder();
                        C56967c cVar2 = (C56967c) C97735q.m162005b(rVar).toBuilder();
                        cVar2.copyOnWrite();
                        C56968d dVar2 = (C56968d) cVar2.instance;
                        dVar2.f152038a |= 32768;
                        dVar2.f152053p = true;
                        C63088z byteString = ((C56968d) cVar2.build()).toByteString();
                        gVar2.copyOnWrite();
                        byteString.getClass();
                        ((C63070h) gVar2.instance).f170218b = byteString;
                        ((C30054a) this.f272889e.mo27525b()).mo35394c(kVar, j, d, (C63070h) gVar2.build());
                        return;
                    }
                    return;
                }
                C59104x d2 = f272885a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "ChimeNotiEventHandler");
                ((C59052c) ((C59052c) d2).mo56372aa(18958)).mo56389s("Could not handle action %s", C56973i.m88245a(kVar2.f152093b).name());
                int i = C90755l.f253831a;
            } catch (C62974ct e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            throw new IllegalArgumentException("Payload cannot be null.");
        }
    }

    /* renamed from: i */
    private final void m161992i(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f272890f.mo90797a(((C29827r) it.next()).mo35063j(), str, (String) null);
        }
    }

    /* renamed from: j */
    private final void m161993j(C7681g gVar, List list) {
        C7573c cVar = (C7573c) C7708h.f26894n.createBuilder();
        cVar.copyOnWrite();
        C7708h hVar = (C7708h) cVar.instance;
        hVar.f26897b = gVar.f26835cv;
        hVar.f26896a |= 1;
        C60870cx b = this.f272887c.mo90792b(list, (C7708h) cVar.build());
        String name = gVar.name();
        this.f272888d.mo28211k(b, "record_chime_actions_".concat(String.valueOf(name)), new C97732n(name));
    }

    /* renamed from: k */
    private final void m161994k(List list, boolean z) {
        if (list.size() != 1) {
            C58976aa aaVar = C58975e.f156826a;
            list.size();
            return;
        }
        C29827r rVar = (C29827r) list.get(0);
        C56968d b = C97735q.m162005b(rVar);
        C56975k kVar = b.f152042e;
        if (kVar == null) {
            kVar = C56975k.f152090f;
        }
        this.f272890f.mo90797a(rVar.mo35063j(), "Clicked", (String) null);
        m161993j(C7681g.CLICK_NOTIFICATION, C58485gu.m89846n(rVar));
        this.f272887c.mo90791a(b, kVar);
        if (!this.f272886b.mo90788a((C29827r) list.get(0), kVar, z)) {
            C59104x d = f272885a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ChimeNotiEventHandler");
            ((C59052c) ((C59052c) d).mo56372aa(18959)).mo56389s("Could not handle action %s", C56973i.m88245a(kVar.f152093b).name());
            int i = C90755l.f253831a;
        }
    }

    /* renamed from: a */
    public final void mo35334a(C29820k kVar, C29827r rVar, C55568d dVar) {
        m161991h(kVar, rVar, dVar, true);
    }

    /* renamed from: b */
    public final void mo35335b(C29820k kVar, C29827r rVar, C55568d dVar) {
        m161991h(kVar, rVar, dVar, false);
    }

    /* renamed from: c */
    public final void mo35336c(C29820k kVar, List list) {
        m161994k(list, true);
    }

    /* renamed from: d */
    public final void mo35337d(C29820k kVar, List list) {
        m161994k(list, false);
    }

    /* renamed from: e */
    public final void mo35338e(List list) {
        m161992i("Expired", list);
    }

    /* renamed from: f */
    public final void mo35339f(List list, Notification notification) {
        m161992i("Created", list);
        m161993j(C7681g.DISPLAYED_NOTIFICATION, list);
    }

    /* renamed from: g */
    public final void mo35340g(List list) {
        m161992i("Dismissed", list);
        m161993j(C7681g.DISMISS_NOTIFICATION, list);
    }
}
