package com.google.android.apps.search.assistant.platform.appintegration.grpc.p9003b;

import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119627i;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119900s;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119902u;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119903v;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.libraries.assistant.p1467d.p1471b.C17830p;
import com.google.android.libraries.assistant.p1467d.p1471b.C17835u;
import com.google.android.libraries.assistant.p1467d.p1472c.p1474b.C17868h;
import com.google.android.libraries.assistant.p1467d.p1472c.p1474b.C17869i;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17884an;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17885ao;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17886ap;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17900bc;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17906h;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17908j;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17909k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.b.a */
/* compiled from: PG */
final class C119608a implements C70862aj {

    /* renamed from: a */
    private static final C59071e f333353a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.appintegration.grpc.b.a");

    /* renamed from: b */
    private boolean f333354b;

    /* renamed from: c */
    private final C70862aj f333355c;

    public C119608a(C70862aj ajVar) {
        this.f333355c = ajVar;
    }

    /* renamed from: e */
    private final void m198509e() {
        if (this.f333354b) {
            this.f333354b = false;
            m198511g(3);
            m198512h(4);
        }
    }

    /* renamed from: f */
    private final void m198510f() {
        if (!this.f333354b) {
            this.f333354b = true;
            m198511g(2);
            m198512h(2);
        }
    }

    /* renamed from: g */
    private final void m198511g(int i) {
        C17906h hVar = (C17906h) C17909k.f51314c.createBuilder();
        C17908j jVar = C17908j.ASSISTANT_CONVERSATION_STATE_CHANGED;
        hVar.copyOnWrite();
        C17909k kVar = (C17909k) hVar.instance;
        kVar.f51317b = jVar.f51313l;
        kVar.f51316a |= 1;
        C62940bt btVar = C17884an.f51250a;
        C17885ao aoVar = (C17885ao) C17886ap.f51251c.createBuilder();
        aoVar.copyOnWrite();
        C17886ap apVar = (C17886ap) aoVar.instance;
        apVar.f51254b = i - 1;
        apVar.f51253a |= 1;
        hVar.mo58885m(btVar, (C17886ap) aoVar.build());
        mo104468d((C17909k) hVar.build());
    }

    /* renamed from: h */
    private final void m198512h(int i) {
        C17830p pVar = (C17830p) C17835u.f51168i.createBuilder();
        pVar.copyOnWrite();
        C17835u uVar = (C17835u) pVar.instance;
        uVar.f51171b = i - 1;
        uVar.f51170a |= 1;
        C17906h hVar = (C17906h) C17909k.f51314c.createBuilder();
        C17908j jVar = C17908j.VOICE_PLATE_STATE_CHANGED;
        hVar.copyOnWrite();
        C17909k kVar = (C17909k) hVar.instance;
        kVar.f51317b = jVar.f51313l;
        kVar.f51316a |= 1;
        hVar.mo58885m(C17900bc.f51289a, (C17835u) pVar.build());
        mo104468d((C17909k) hVar.build());
    }

    /* renamed from: a */
    public final void mo20121a() {
        C59104x b = f333353a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Mosaic.KarajanGatewayHandler");
        ((C59052c) ((C59052c) b).mo56372aa(34505)).mo56386p("onCompleted");
        this.f333355c.mo20121a();
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C59104x c = f333353a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Mosaic.KarajanGatewayHandler");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(34506)).mo56389s("onError: %s", th.getMessage());
        this.f333355c.mo20122b(th);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C119903v vVar;
        C119627i iVar = (C119627i) obj;
        C59071e eVar = f333353a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Mosaic.KarajanGatewayHandler");
        ((C59052c) ((C59052c) b).mo56372aa(34507)).mo56389s("onNext: %s", iVar);
        int i = iVar.f333386a;
        if ((i & 2) != 0) {
            C119904w wVar = iVar.f333388c;
            if (wVar == null) {
                wVar = C119904w.f333909c;
            }
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "Mosaic.KarajanGatewayHandler");
            ((C59052c) ((C59052c) b2).mo56372aa(34512)).mo56389s("assistantState: %s", wVar);
            int i2 = wVar.f333911a;
            if (C119900s.m198775b(i2) == 2) {
                if (i2 == 2) {
                    vVar = (C119903v) wVar.f333912b;
                } else {
                    vVar = C119903v.f333904d;
                }
                int a = C119902u.m198776a(vVar.f333906a);
                int i3 = a - 1;
                if (a == 0) {
                    throw null;
                } else if (i3 == 1 || i3 == 2) {
                    m198510f();
                }
            } else {
                m198509e();
            }
        } else if ((i & 4) != 0) {
            C59104x b3 = eVar.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "Mosaic.KarajanGatewayHandler");
            ((C59052c) ((C59052c) b3).mo56372aa(34511)).mo56389s("transcription: %s", iVar);
        } else if ((i & 8) != 0) {
            C59104x b4 = eVar.mo56224b();
            b4.mo56378ag(C58975e.f156826a, "Mosaic.KarajanGatewayHandler");
            ((C59052c) ((C59052c) b4).mo56372aa(34510)).mo56389s("prefetch: %s", iVar);
        } else if ((i & 32) != 0) {
            C59104x b5 = eVar.mo56224b();
            b5.mo56378ag(C58975e.f156826a, "Mosaic.KarajanGatewayHandler");
            ((C59052c) ((C59052c) b5).mo56372aa(34509)).mo56389s("interactionResult: %s", iVar);
            m198509e();
        } else if ((i & 16) != 0) {
            C59104x b6 = eVar.mo56224b();
            b6.mo56378ag(C58975e.f156826a, "Mosaic.KarajanGatewayHandler");
            ((C59052c) ((C59052c) b6).mo56372aa(34508)).mo56389s("interactionId: %s", iVar);
            m198510f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo104468d(C17909k kVar) {
        C70862aj ajVar = this.f333355c;
        C17868h hVar = (C17868h) C17869i.f51204c.createBuilder();
        hVar.copyOnWrite();
        C17869i iVar = (C17869i) hVar.instance;
        kVar.getClass();
        iVar.f51207b = kVar;
        iVar.f51206a |= 1;
        ajVar.mo20123c((C17869i) hVar.build());
    }
}
