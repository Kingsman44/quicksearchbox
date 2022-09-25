package com.google.android.libraries.lens.sdk.avs;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Size;
import com.google.android.libraries.lens.ondevice.C24823o;
import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24280f;
import com.google.android.libraries.lens.sdk.avs.data.AppFlowEvent;
import com.google.android.libraries.lens.sdk.avs.data.C24867b;
import com.google.android.libraries.lens.sdk.avs.data.C24868c;
import com.google.android.libraries.lens.sdk.avs.data.C24869d;
import com.google.android.libraries.lens.sdk.avs.data.C24870e;
import com.google.android.libraries.lens.sdk.avs.data.C24873h;
import com.google.android.libraries.lens.sdk.avs.data.C24874i;
import com.google.android.libraries.lens.sdk.avs.data.C24876k;
import com.google.android.libraries.lens.sdk.avs.data.C24881p;
import com.google.android.libraries.lens.sdk.avs.data.C24883r;
import com.google.android.libraries.lens.sdk.avs.data.C24884s;
import com.google.android.libraries.lens.sdk.avs.data.LensAppFlowEventMetadata;
import com.google.android.libraries.lens.sdk.avs.p2039a.C24844b;
import com.google.android.libraries.lens.sdk.avs.p2039a.C24845c;
import com.google.android.libraries.lens.sdk.avs.p2039a.C24848e;
import com.google.android.libraries.lens.sdk.avs.p2039a.C24849f;
import com.google.android.libraries.lens.sdk.avs.p2039a.C24850g;
import com.google.android.libraries.lens.sdk.avs.p2039a.C24852i;
import com.google.android.libraries.lens.sdk.avs.p2042c.C24864c;
import com.google.android.libraries.lens.sdk.p2045c.p2046a.C24915a;
import com.google.android.libraries.lens.view.utils.C28137z;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.common.p4552o.p4563i.C59906bo;
import com.google.common.p4552o.p4563i.C59912bu;
import com.google.common.p4552o.p4563i.C59915bx;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62331d;
import com.google.lens.p4707j.C62505ea;
import java.util.ArrayList;
import java.util.Iterator;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.lens.sdk.avs.g */
/* compiled from: PG */
public final class C24890g {

    /* renamed from: a */
    public static final C58974d f67980a = C58974d.m91135i("OnDeviceSessionManager");

    /* renamed from: b */
    public final C24823o f67981b;

    /* renamed from: c */
    public final C24852i f67982c;

    /* renamed from: d */
    public Optional f67983d = Optional.empty();

    /* renamed from: e */
    private final Context f67984e;

    /* renamed from: f */
    private boolean f67985f = false;

    /* renamed from: g */
    private Optional f67986g = Optional.empty();

    /* renamed from: h */
    private boolean f67987h = false;

    public C24890g(Context context, C24823o oVar, C24852i iVar) {
        this.f67984e = context;
        this.f67981b = oVar;
        this.f67982c = iVar;
    }

    /* renamed from: a */
    public final void mo30115a(C24876k kVar) {
        C58974d dVar = f67980a;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(48864)).mo56386p("processEventTypeQuery");
        if (this.f67983d.isEmpty()) {
            ((C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(48869)).mo56386p("Attempting to call query() before callback has been set.");
        } else if (this.f67986g.isEmpty()) {
            ((C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(48868)).mo56386p("Attempting to call query() before engine has started.");
            C24870e eVar = new C24870e();
            eVar.mo30074b(3);
            ((C24897n) this.f67983d.get()).mo30121a(eVar);
            this.f67982c.f67907e.mo57061a(3);
        } else {
            Optional j = C24864c.m46011j(new C24915a(this.f67984e), kVar);
            if (!j.isPresent()) {
                ((C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(48867)).mo56386p("Cannot perform query without bitmap.");
                return;
            }
            Bitmap bitmap = (Bitmap) j.get();
            C24280f b = C24864c.m46003b(bitmap, kVar);
            Size size = new Size(bitmap.getWidth(), bitmap.getHeight());
            bitmap.getByteCount();
            bitmap.getConfig();
            C47633f i = C47633f.m84733g((C60870cx) this.f67986g.get()).mo51516i(new C24861c(this, b), C60826bg.f164896a);
            C24888e eVar2 = new C24888e(this, kVar, size);
            C60856cj.m92911t(i.f164926b, C47810es.m84974n(eVar2), C60826bg.f164896a);
        }
    }

    /* renamed from: b */
    public final void mo30116b(C24881p pVar) {
        if (this.f67983d.isEmpty()) {
            ((C58970a) ((C58970a) f67980a.mo56226d()).mo56372aa(48874)).mo56386p("Attempting to call start before callback has been set");
        } else if (this.f67985f) {
            ((C58970a) ((C58970a) f67980a.mo56226d()).mo56372aa(48873)).mo56386p("Attempting to call start after session has already started");
            C24870e eVar = new C24870e();
            eVar.mo30074b(2);
            ((C24897n) this.f67983d.get()).mo30121a(eVar);
            this.f67982c.f67907e.mo57061a(2);
        } else {
            boolean z = true;
            this.f67985f = true;
            if (!pVar.mo30105c()) {
                ((C58970a) ((C58970a) f67980a.mo56226d()).mo56372aa(48872)).mo56386p("Start session request does not have client info");
                C24870e eVar2 = new C24870e();
                eVar2.mo30074b(9);
                ((C24897n) this.f67983d.get()).mo30121a(eVar2);
                this.f67982c.f67907e.mo57061a(9);
                return;
            }
            C24869d a = pVar.mo30103a();
            a.getClass();
            C24868c d = C24864c.m46005d(a);
            if (d.f67928a.containsKey("client_capabilities")) {
                C24867b a2 = d.mo30065a();
                a2.getClass();
                if (a2.f67927a.containsKey("supports_shopping_result")) {
                    C24867b a3 = d.mo30065a();
                    a3.getClass();
                    if (a3.f67927a.getBoolean("supports_shopping_result")) {
                        C24873h e = C24864c.m46006e(pVar);
                        C24852i iVar = this.f67982c;
                        C24873h e2 = C24864c.m46006e(pVar);
                        C24823o oVar = this.f67981b;
                        C62505ea h = C24864c.m46009h(pVar);
                        AccountId accountId = (AccountId) C24864c.m46010i(pVar).orElse(null);
                        iVar.f67906d = e2;
                        C24849f fVar = iVar.f67905c;
                        ArrayList arrayList = new ArrayList();
                        if (e2.f67932a.containsKey("appflow_logging_enabled") && e2.f67932a.getBoolean("appflow_logging_enabled") && accountId != null) {
                            C24845c cVar = fVar.f67894a;
                            cVar.f67886b = ((C24845c.C24846a) C47245e.m84045a(cVar.f67893g, C24845c.C24846a.class, accountId)).mo30050eS();
                            arrayList.add(fVar.f67894a);
                        }
                        if (e2.f67932a.containsKey("deidentified_appflow_logging_enabled") && e2.f67932a.getBoolean("deidentified_appflow_logging_enabled")) {
                            arrayList.add(fVar.f67895b);
                        }
                        if (e2.f67932a.containsKey("debug_mode_logging_enabled") && e2.f67932a.getBoolean("debug_mode_logging_enabled")) {
                            arrayList.add(fVar.f67896c);
                        }
                        if (e2.mo30080a() && e2.mo30081b()) {
                            arrayList.add(fVar.f67897d);
                        }
                        iVar.f67904b = arrayList;
                        for (C24848e add : iVar.f67904b) {
                            oVar.f67846c.f67193a.add(add);
                        }
                        Context context = iVar.f67908f;
                        C59906bo boVar = iVar.f67907e;
                        C59912bu f = C24864c.m46007f(context);
                        boVar.copyOnWrite();
                        C59915bx bxVar = (C59915bx) boVar.instance;
                        C59915bx bxVar2 = C59915bx.f161935i;
                        f.getClass();
                        bxVar.f161938b = f;
                        bxVar.f161937a = 2 | bxVar.f161937a;
                        C59906bo boVar2 = iVar.f67907e;
                        int i = C28137z.m52436b(context, false).f158082b;
                        boVar2.copyOnWrite();
                        C59915bx bxVar3 = (C59915bx) boVar2.instance;
                        bxVar3.f161937a |= 32;
                        bxVar3.f161940d = i;
                        C59906bo boVar3 = iVar.f67907e;
                        boVar3.copyOnWrite();
                        C59915bx bxVar4 = (C59915bx) boVar3.instance;
                        bxVar4.f161942f = h.getNumber();
                        bxVar4.f161937a |= 128;
                        if (!e.mo30080a() || !e.mo30081b()) {
                            z = false;
                        }
                        this.f67987h = z;
                        this.f67982c.mo30052b(C24874i.LENS_PRIME_SESSION_REQUEST_TO_CONNECT);
                        C24823o oVar2 = this.f67981b;
                        C24869d a4 = pVar.mo30103a();
                        a4.getClass();
                        C62331d g = C24864c.m46008g(a4);
                        C24869d a5 = pVar.mo30103a();
                        a5.getClass();
                        Optional of = Optional.m71637of(oVar2.mo30021c(g, C24864c.m46004c(a5)));
                        this.f67986g = of;
                        C60856cj.m92911t((C60870cx) of.get(), C47810es.m84974n(new C24865d(this)), C60826bg.f164896a);
                        return;
                    }
                }
            }
            ((C58970a) ((C58970a) f67980a.mo56226d()).mo56372aa(48871)).mo56386p("Client does not support shopping result");
            C24870e eVar3 = new C24870e();
            eVar3.mo30074b(9);
            ((C24897n) this.f67983d.get()).mo30121a(eVar3);
            this.f67982c.f67907e.mo57061a(9);
        }
    }

    /* renamed from: c */
    public final void mo30117c(C24883r rVar) {
        this.f67982c.mo30052b(C24874i.LENS_PRIME_SESSION_STOPPED);
        if (this.f67983d.isEmpty()) {
            ((C58970a) ((C58970a) f67980a.mo56226d()).mo56372aa(48876)).mo56386p("Attempting to call stop() before callback has been set.");
        } else if (!this.f67985f) {
            ((C58970a) ((C58970a) f67980a.mo56226d()).mo56372aa(48875)).mo56386p("Attempting to call stop while session is not started");
            C24870e eVar = new C24870e();
            eVar.mo30074b(3);
            ((C24897n) this.f67983d.get()).mo30121a(eVar);
            this.f67982c.f67907e.mo57061a(3);
        } else {
            this.f67981b.mo30023e();
            this.f67985f = false;
            C24884s sVar = new C24884s();
            String a = rVar.mo30111a();
            a.getClass();
            sVar.mo30114b(a);
            if (this.f67987h) {
                C24852i iVar = this.f67982c;
                C24844b bVar = null;
                if (iVar.f67906d.mo30081b()) {
                    Iterator it = iVar.f67904b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            ((C58970a) ((C58970a) iVar.f67903a.mo56225c()).mo56372aa(48934)).mo56389s("In-Memory Logger %s  is not available", C24850g.class.getSimpleName());
                            break;
                        }
                        C24848e eVar2 = (C24848e) it.next();
                        if (eVar2.getClass().getSimpleName().equals(C24850g.class.getSimpleName())) {
                            C24850g gVar = (C24850g) eVar2;
                            bVar = new C24844b(C58485gu.m89842j(gVar.f67898g), (C59898bg) gVar.f67899h.build());
                            break;
                        }
                    }
                }
                if (bVar != null) {
                    sVar.f67965a.putParcelableArray("app_flow_events", (AppFlowEvent[]) Collection.EL.stream(bVar.f67891a).map(C24842a.f67884a).toArray(C24857b.f67910a));
                    sVar.f67965a.putParcelable("metadata", new LensAppFlowEventMetadata(bVar.f67892b));
                }
            }
            ((C24897n) this.f67983d.get()).mo30124d(sVar);
        }
    }
}
