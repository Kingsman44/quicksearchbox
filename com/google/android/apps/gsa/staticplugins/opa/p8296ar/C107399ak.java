package com.google.android.apps.gsa.staticplugins.opa.p8296ar;

import android.content.Intent;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83682a;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83683b;
import com.google.android.apps.gsa.opa.p6443g.p6446c.C83693b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85007j;
import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85492i;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114464db;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.assistant.p3803ag.p3804a.C48873p;
import com.google.assistant.p3803ag.p3804a.C48876s;
import com.google.assistant.p3803ag.p3804a.p3805a.C48790j;
import com.google.assistant.p3803ag.p3804a.p3805a.C48791k;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.ak */
/* compiled from: PG */
public final class C107399ak extends C86734a implements C85007j {

    /* renamed from: a */
    private static final C59071e f298904a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ar.ak");

    /* renamed from: b */
    private final C114464db f298905b;

    /* renamed from: c */
    private final C85005h f298906c;

    /* renamed from: f */
    private final C107397ai f298907f;

    /* renamed from: g */
    private final C83693b f298908g;

    /* renamed from: h */
    private final C107389aa f298909h;

    /* renamed from: i */
    private final C85492i f298910i;

    public C107399ak(C114464db dbVar, C85005h hVar, C107397ai aiVar, C83693b bVar, C107389aa aaVar, C85492i iVar) {
        super(C118575h.WORKER_PROACTIVE_ASSISTANT_API, "proactive_assistant_api");
        this.f298905b = dbVar;
        this.f298906c = hVar;
        this.f298907f = aiVar;
        this.f298908g = bVar;
        this.f298910i = iVar;
        this.f298909h = aaVar;
    }

    /* renamed from: a */
    public final C60870cx mo78646a(Intent intent) {
        byte[] byteArrayExtra;
        C59071e eVar = f298904a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ProactiveApiWorker");
        ((C59052c) ((C59052c) b).mo56372aa(25380)).mo56386p("ProactiveApiWorker#handleProactiveUpdate");
        String g = C58837ba.m90858g(intent.getAction());
        if (g.equals("ACTION_PROACTIVEAPI_SYNC_REQUEST")) {
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "ProactiveApiWorker");
            ((C59052c) ((C59052c) b2).mo56372aa(25388)).mo56386p("ProactiveApiWorker#handleProactiveUpdate ACTION_PROACTIVEAPI_SYNC_REQUEST");
            byte[] byteArrayExtra2 = intent.getByteArrayExtra("PROACTIVEAPI_CLIENT_EVENT_DATA_EXTRA");
            if (byteArrayExtra2 != null) {
                try {
                    C62921ba a = C62921ba.m95368a();
                    C107397ai aiVar = this.f298907f;
                    C59104x b3 = C107397ai.f298901a.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "PAPIclient");
                    ((C59052c) ((C59052c) b3).mo56372aa(25379)).mo56386p("#startRequest");
                    aiVar.f298902b.mo79001f((C87696ae) C62942bv.parseFrom((C62942bv) C87696ae.f237132p, byteArrayExtra2, a), new C107396ah(aiVar.f298903c));
                } catch (C62974ct e) {
                    C59104x c = f298904a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "ProactiveApiWorker");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(25390)).mo56386p("invalid proto AssistantClientSyncEventData");
                }
            } else {
                C59104x d = eVar.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ProactiveApiWorker");
                ((C59052c) ((C59052c) d).mo56372aa(25389)).mo56386p("AssistantClientSyncEventData data for sync request is null");
            }
        } else if (g.equals("ACTION_SHOW_NOTIFICATION")) {
            C59104x b4 = eVar.mo56224b();
            b4.mo56378ag(C58975e.f156826a, "ProactiveApiWorker");
            ((C59052c) ((C59052c) b4).mo56372aa(25386)).mo56386p("ProactiveApiWorker#handleProactiveUpdate ACTION_SHOW_NOTIFICATION");
            byte[] byteArrayExtra3 = intent.getByteArrayExtra("SHOW_NOTIFICATION_EXTRA");
            if (byteArrayExtra3 != null) {
                try {
                    aas aas = (aas) C62942bv.parseFrom((C62942bv) aas.f134661u, byteArrayExtra3, C62921ba.m95368a());
                    C59104x b5 = eVar.mo56224b();
                    b5.mo56378ag(C58975e.f156826a, "ProactiveApiWorker");
                    ((C59052c) ((C59052c) b5).mo56372aa(25394)).mo56389s("#showNotification triggering notification %s ", aas);
                    this.f298906c.mo78613I(aas.toByteArray());
                    return C118826c.f331423b;
                } catch (C62974ct e2) {
                    C59104x c2 = f298904a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "ProactiveApiWorker");
                    ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(25387)).mo56386p("invalid proto NotificationArgs");
                }
            }
        } else if (g.equals("ACTION_DISMISS_NOTIFICATION")) {
            C59104x b6 = eVar.mo56224b();
            b6.mo56378ag(C58975e.f156826a, "ProactiveApiWorker");
            ((C59052c) ((C59052c) b6).mo56372aa(25384)).mo56386p("ProactiveApiWorker#handleProactiveUpdate DISMISS_NOTIFICATION_EXTRA");
            byte[] byteArrayExtra4 = intent.getByteArrayExtra("DISMISS_NOTIFICATION_EXTRA");
            if (byteArrayExtra4 != null) {
                try {
                    this.f298905b.mo101332j((aas) C62942bv.parseFrom((C62942bv) aas.f134661u, byteArrayExtra4, C62921ba.m95368a()));
                    return C118826c.f331423b;
                } catch (C62974ct e3) {
                    C59104x c3 = f298904a.mo56225c();
                    c3.mo56378ag(C58975e.f156826a, "ProactiveApiWorker");
                    ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e3)).mo56372aa(25385)).mo56386p("invalid proto NotificationArgs");
                }
            }
        } else if (g.equals("USER_DISMISSAL_ACTION")) {
            C59104x b7 = eVar.mo56224b();
            b7.mo56378ag(C58975e.f156826a, "ProactiveApiWorker");
            ((C59052c) ((C59052c) b7).mo56372aa(25381)).mo56386p("ProactiveApiWorker#handleProactiveUpdate DISMISS_NOTIFICATION_EXTRA");
            byte[] byteArrayExtra5 = intent.getByteArrayExtra("CONTENT_SELECTOR_EXTRA");
            if (byteArrayExtra5 != null) {
                try {
                    C48851br brVar = (C48851br) C62942bv.parseFrom((C62942bv) C48851br.f126412f, byteArrayExtra5, C62921ba.m95368a());
                    C83693b bVar = this.f298908g;
                    C83682a aVar = (C83682a) C83683b.f228105f.createBuilder();
                    aVar.copyOnWrite();
                    C83683b bVar2 = (C83683b) aVar.instance;
                    brVar.getClass();
                    bVar2.f228110d = brVar;
                    bVar2.f228107a |= 4;
                    int a2 = C48876s.m85289a(intent.getIntExtra("CLIENT_UI_OBJECT_TYPE_EXTRA", 0));
                    aVar.copyOnWrite();
                    C83683b bVar3 = (C83683b) aVar.instance;
                    int i = a2 - 1;
                    if (a2 != 0) {
                        bVar3.f228111e = i;
                        bVar3.f228107a |= 8;
                        return bVar.mo77017c((C83683b) aVar.build());
                    }
                    throw null;
                } catch (C62974ct e4) {
                    C59104x c4 = f298904a.mo56225c();
                    c4.mo56378ag(C58975e.f156826a, "ProactiveApiWorker");
                    ((C59052c) ((C59052c) ((C59052c) c4).mo56382g(e4)).mo56372aa(25383)).mo56386p("invalid proto ContentSelector");
                }
            } else {
                C59104x d2 = eVar.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "ProactiveApiWorker");
                ((C59052c) ((C59052c) d2).mo56372aa(25382)).mo56386p("content selector has null value");
            }
        } else if (g.equals("ACTION_START_ZS_PARTIAL_REQUEST") && (byteArrayExtra = intent.getByteArrayExtra("ZS_PARTIAL_REQUEST_SPEC")) != null) {
            this.f298910i.mo79002g(byteArrayExtra, false, false);
        }
        return C118826c.f331423b;
    }

    /* renamed from: b */
    public final C60870cx mo78647b(C48791k kVar) {
        C59104x b = f298904a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ProactiveApiWorker");
        ((C59052c) ((C59052c) b).mo56372aa(25391)).mo56386p("#handleProactiveApiSyncResponse");
        return this.f298909h.mo96001b(kVar);
    }

    /* renamed from: c */
    public final C60870cx mo78648c(byte[] bArr) {
        C59104x b = f298904a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ProactiveApiWorker");
        ((C59052c) ((C59052c) b).mo56372aa(25392)).mo56386p("#handlePush");
        try {
            C48873p pVar = (C48873p) C62942bv.parseFrom((C62942bv) C48873p.f126478b, bArr, C62921ba.m95368a());
            C107389aa aaVar = this.f298909h;
            C48790j jVar = (C48790j) C48791k.f126248b.createBuilder();
            C62971cq cqVar = pVar.f126480a;
            jVar.copyOnWrite();
            C48791k kVar = (C48791k) jVar.instance;
            C62971cq cqVar2 = kVar.f126250a;
            if (!cqVar2.mo58948c()) {
                kVar.f126250a = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) cqVar, (List) kVar.f126250a);
            return aaVar.mo96001b((C48791k) jVar.build());
        } catch (C62974ct unused) {
            C59104x c = f298904a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ProactiveApiWorker");
            ((C59052c) ((C59052c) c).mo56372aa(25393)).mo56386p("Received malformed push message.");
            return C118826c.f331423b;
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
