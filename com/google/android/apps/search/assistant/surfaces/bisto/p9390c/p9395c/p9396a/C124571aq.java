package com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9395c.p9396a;

import android.content.Intent;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124519a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.p9387a.C124520a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124550f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124551g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9401e.C124604a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124660bz;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124675cn;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124677cp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124679cr;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124687cz;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124692dd;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124694df;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124696dh;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124704dp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124706dr;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s;
import com.google.android.libraries.search.integrations.p3013a.p3014a.C38487e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.c.c.a.aq */
/* compiled from: PG */
final class C124571aq extends C124660bz {

    /* renamed from: a */
    public static final C59071e f343658a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.bisto.c.c.a.aq");

    /* renamed from: b */
    static final Duration f343659b;

    /* renamed from: c */
    static final Duration f343660c;

    /* renamed from: d */
    static final Duration f343661d = Duration.ofSeconds(15);

    /* renamed from: e */
    static final Duration f343662e = Duration.ofSeconds(40);

    /* renamed from: m */
    private static final Duration f343663m = Duration.ofSeconds(30);

    /* renamed from: f */
    final Duration f343664f;

    /* renamed from: g */
    public final C124550f f343665g;

    /* renamed from: h */
    public final Executor f343666h;

    /* renamed from: i */
    public final AccountId f343667i;

    /* renamed from: j */
    public final C46128f f343668j;

    /* renamed from: k */
    public final C124520a f343669k;

    /* renamed from: l */
    public final C38487e f343670l;

    /* renamed from: n */
    private final Executor f343671n;

    /* renamed from: o */
    private final C124604a f343672o;

    static {
        Duration ofSeconds = Duration.ofSeconds(10);
        f343659b = ofSeconds;
        f343660c = ofSeconds;
    }

    public C124571aq(C124550f fVar, Executor executor, Executor executor2, C124520a aVar, AccountId accountId, C46128f fVar2, C38487e eVar, long j, C124604a aVar2) {
        this.f343665g = fVar;
        this.f343671n = executor;
        this.f343666h = executor2;
        this.f343669k = aVar;
        this.f343667i = accountId;
        this.f343668j = fVar2;
        this.f343670l = eVar;
        this.f343664f = Duration.ofMillis(j);
        this.f343672o = aVar2;
    }

    /* renamed from: i */
    public static void m204232i(C124570ap apVar, C70862aj ajVar) {
        C124679cr w = apVar.mo106534a().mo106525w(apVar.mo106535b());
        C58976aa aaVar = C58975e.f156826a;
        w.getSerializedSize();
        ajVar.mo20123c(w);
        ajVar.mo20121a();
    }

    /* renamed from: b */
    public final C60870cx mo106539b(String str) {
        return C47633f.m84733g(this.f343665g.mo83408n(str)).mo51516i(new C124591s(this), this.f343666h);
    }

    /* renamed from: c */
    public final C60870cx mo106540c(String str) {
        C124520a aVar = this.f343669k;
        C124519a.m203974a(aVar.f343589a, new Intent().setAction("bisto.QUERY_DEVICE_INFO").putExtra("extra_device", aVar.f343590b.getAdapter().getRemoteDevice(str)));
        return this.f343665g.mo83411q(str, C124563ai.f343645a, f343660c);
    }

    /* renamed from: d */
    public final void mo106541d(C124677cp cpVar, C70862aj ajVar) {
        String str = cpVar.f343955b;
        C59104x b = f343658a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoDeviceService");
        ((C59052c) ((C59052c) b).mo56372aa(36249)).mo56389s("Disable Assistant %s", str);
        if (str.isEmpty()) {
            ajVar.mo20122b(Status.f186906d.withDescription("deviceId cannot be empty.").asException());
            return;
        }
        C47633f i = C47633f.m84733g(this.f343665g.mo83408n(str)).mo51515h(new C124577e(this, str), this.f343666h).mo51516i(new C124578f(this, str), this.f343666h).mo51516i(new C124579g(this, str), this.f343666h);
        C124569ao aoVar = new C124569ao(new C124580h(ajVar), ajVar);
        C60856cj.m92911t(i.f164926b, C47810es.m84974n(aoVar), this.f343666h);
    }

    /* renamed from: e */
    public final void mo106542e(C124687cz czVar, C70862aj ajVar) {
        String str = czVar.f343989b;
        C59104x b = f343658a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoDeviceService");
        ((C59052c) ((C59052c) b).mo56372aa(36250)).mo56389s("Enable Assistant %s", str);
        C60870cx b2 = mo106539b(str);
        C47633f i = C47633f.m84733g(b2).mo51516i(new C124558ad(this, str), this.f343666h).mo51516i(new C124559ae(this, str, b2), this.f343666h);
        C124569ao aoVar = new C124569ao(new C124560af(this, czVar, str, ajVar), ajVar);
        C60856cj.m92911t(i.f164926b, C47810es.m84974n(aoVar), this.f343666h);
    }

    /* renamed from: f */
    public final void mo106543f(C124675cn cnVar, C70862aj ajVar) {
        C60870cx cxVar;
        String str = cnVar.f343949b;
        String str2 = cnVar.f343950c;
        C58976aa aaVar = C58975e.f156826a;
        if (cnVar.f343951d) {
            cxVar = this.f343665g.mo83411q(cnVar.f343949b, C124567am.f343652a, f343663m);
        } else {
            cxVar = C60866ct.f164955a;
        }
        C47633f i = C47633f.m84733g(cxVar).mo51516i(new C124568an(this, str, str2), this.f343666h);
        C124569ao aoVar = new C124569ao(new C124575c(ajVar), ajVar);
        C60856cj.m92911t(i.f164926b, C47810es.m84974n(aoVar), this.f343666h);
    }

    /* renamed from: g */
    public final void mo106544g(C124677cp cpVar, C70862aj ajVar) {
        String str = cpVar.f343955b;
        C58976aa aaVar = C58975e.f156826a;
        mo106546j(str, ajVar);
    }

    /* renamed from: j */
    public final void mo106546j(String str, C70862aj ajVar) {
        C60870cx b = mo106539b(str);
        C124586n nVar = new C124586n(ajVar);
        C60856cj.m92911t(b, C47810es.m84974n(new C124569ao(nVar, ajVar)), this.f343666h);
    }

    /* renamed from: k */
    public final void mo106547k(C124694df dfVar, C70862aj ajVar) {
        String str = dfVar.f344007b;
        C59104x b = f343658a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoDeviceService");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(36258);
        C124633az a = C124633az.m204299a(dfVar.f344008c);
        if (a == null) {
            a = C124633az.OOBE_STATE_UNKNOWN;
        }
        cVar.mo56354G("setOobeState for %s to %s", str, a);
        if (str.isEmpty()) {
            ajVar.mo20122b(Status.f186906d.withDescription("deviceId cannot be empty.").asException());
            return;
        }
        C124550f fVar = this.f343665g;
        C124633az a2 = C124633az.m204299a(dfVar.f344008c);
        if (a2 == null) {
            a2 = C124633az.OOBE_STATE_UNKNOWN;
        }
        fVar.mo83394aj(str, (C124636bb) null, a2);
        mo106546j(str, ajVar);
    }

    /* renamed from: l */
    public final void mo106548l(C124696dh dhVar, C70862aj ajVar) {
        String str = dhVar.f344012b;
        C59104x b = f343658a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoDeviceService");
        ((C59052c) ((C59052c) b).mo56372aa(36259)).mo56355H("setPersonalResult for %s to %s", str, dhVar.f344013c);
        if (str.isEmpty()) {
            ajVar.mo20122b(Status.f186906d.withDescription("deviceId cannot be empty.").asException());
            return;
        }
        C47633f i = C47633f.m84733g(mo106539b(dhVar.f344012b)).mo51516i(new C124564aj(this, dhVar), this.f343666h);
        C124569ao aoVar = new C124569ao(new C124565ak(this, str, ajVar), ajVar);
        C60856cj.m92911t(i.f164926b, C47810es.m84974n(aoVar), this.f343666h);
    }

    /* renamed from: m */
    public final void mo106549m(C124706dr drVar, C70862aj ajVar) {
        String str = drVar.f344042b;
        C59104x b = f343658a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoDeviceService");
        ((C59052c) ((C59052c) b).mo56372aa(36260)).mo56355H("setVoiceMatchEnabled for %s to %s", str, drVar.f344043c);
        if (str.isEmpty()) {
            ajVar.mo20122b(Status.f186906d.withDescription("deviceId cannot be empty.").asException());
            return;
        }
        C47633f h = C47633f.m84733g(mo106539b(drVar.f344042b)).mo51515h(new C124585m(this, drVar), this.f343666h).mo51515h(new C124596x(this, str, drVar), this.f343666h);
        C124569ao aoVar = new C124569ao(new C124562ah(this, str, ajVar), ajVar);
        C60856cj.m92911t(h.f164926b, C47810es.m84974n(aoVar), this.f343666h);
    }

    /* renamed from: n */
    public final void mo106550n(C124704dp dpVar, C70862aj ajVar) {
        C124719q qVar;
        byte[] c;
        String str = dpVar.f344032b;
        if (str.isEmpty()) {
            ajVar.mo20122b(Status.f186906d.withDescription("deviceId cannot be empty.").asException());
            return;
        }
        C124550f fVar = this.f343665g;
        String e = C58837ba.m90856e(dpVar.f344034d);
        if ((dpVar.f344031a & 8) != 0) {
            qVar = C124719q.m204380a(dpVar.f344035e);
            if (qVar == null) {
                qVar = C124719q.UNKNOWN_DEVICE_CATEGORY;
            }
        } else {
            qVar = null;
        }
        fVar.mo83383Y(str, e, (String) null, (C124721s) null, qVar, (String) null, (Integer) null, (Boolean) null, (Integer) null, C58837ba.m90856e(dpVar.f344033c), (Integer) null);
        if ((dpVar.f344031a & 32) != 0) {
            this.f343665g.mo83373O(str, dpVar.f344037g);
        }
        if (!((dpVar.f344031a & 64) == 0 || (c = this.f343672o.mo106555c(str, dpVar.f344038h.mo59174N())) == null)) {
            this.f343665g.mo83372N(str, C63088z.m96139A(c));
        }
        if (dpVar.f344036f) {
            C60870cx b = this.f343668j.mo50215b(this.f343667i);
            C47633f a = this.f343670l.mo41441a();
            C47633f i = C47633f.m84733g(C60856cj.m92897f(b, a)).mo51516i(new C124589q(this, a, str, b), this.f343666h);
            C124569ao aoVar = new C124569ao(new C124590r(this, str, ajVar), ajVar);
            C60856cj.m92911t(i.f164926b, C47810es.m84974n(aoVar), this.f343666h);
            return;
        }
        mo106546j(str, ajVar);
    }

    /* renamed from: o */
    public final void mo106551o(C70862aj ajVar) {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx j = this.f343665g.mo83404j();
        C124574b bVar = new C124574b(ajVar);
        C60856cj.m92911t(j, C47810es.m84974n(new C124569ao(bVar, ajVar)), this.f343671n);
    }

    /* renamed from: h */
    public final void mo106545h(C124692dd ddVar, C70862aj ajVar) {
        if (ddVar.f344000c) {
            String str = ddVar.f343999b;
            if (str.isEmpty()) {
                ajVar.mo20122b(Status.f186906d.withDescription("deviceId cannot be empty.").asException());
                return;
            }
            C47633f i = C47633f.m84733g(mo106539b(str)).mo51516i(new C124595w(this, ddVar, str), this.f343666h);
            C124569ao aoVar = new C124569ao(new C124597y(ajVar), ajVar);
            C60856cj.m92911t(i.f164926b, C47810es.m84974n(aoVar), this.f343666h);
            return;
        }
        String str2 = ddVar.f343999b;
        if (str2.isEmpty()) {
            ajVar.mo20122b(Status.f186906d.withDescription("deviceId cannot be empty.").asException());
            return;
        }
        C47633f f = C47633f.m84733g(this.f343665g.mo83408n(str2)).mo51516i(new C124582j(this, str2), this.f343666h).mo51514f(C124551g.class, new C124583k(this, str2), this.f343666h);
        C124569ao aoVar2 = new C124569ao(new C124584l(ajVar), ajVar);
        C60856cj.m92911t(f.f164926b, C47810es.m84974n(aoVar2), this.f343666h);
    }
}
