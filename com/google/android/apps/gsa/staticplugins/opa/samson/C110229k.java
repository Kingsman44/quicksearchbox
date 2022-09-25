package com.google.android.apps.gsa.staticplugins.opa.samson;

import android.accounts.Account;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.C2333ah;
import com.google.android.apps.gsa.assistant.shared.C73798aa;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.assistant.shared.z;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87694ac;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87695ad;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.staticplugins.opa.p8174ab.p8177c.C105988a;
import com.google.android.apps.gsa.staticplugins.opa.p8409r.C109953a;
import com.google.android.apps.gsa.staticplugins.opa.p8409r.C109955c;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8446q.C110398b;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110418e;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110420g;
import com.google.android.libraries.gcoreclient.p1763h.p1769c.C21560e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28294l;
import com.google.assistant.p3994s.p3995a.C53268hp;
import com.google.assistant.p3994s.p3995a.C53271hs;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.protobuf.C62940bt;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64279a;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64308b;
import com.google.protos.p4985f.p5048z.p5053c.p5055b.p5056a.C65410a;
import com.google.protos.p4985f.p5048z.p5053c.p5055b.p5056a.C65421b;
import com.google.protos.p4985f.p5048z.p5053c.p5055b.p5056a.p5057a.C65411a;
import com.google.protos.p4985f.p5048z.p5053c.p5055b.p5056a.p5057a.C65412b;
import com.google.protos.p4985f.p5048z.p5053c.p5055b.p5056a.p5057a.C65415e;
import com.google.protos.p4985f.p5048z.p5053c.p5055b.p5056a.p5057a.C65416f;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.k */
/* compiled from: PG */
public final class C110229k extends C109953a {

    /* renamed from: a */
    public static final C59071e f307144a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.k");

    /* renamed from: A */
    private int f307145A = 1;

    /* renamed from: B */
    private final C21560e f307146B;

    /* renamed from: b */
    String[] f307147b;

    /* renamed from: c */
    List f307148c;

    /* renamed from: d */
    String[] f307149d;

    /* renamed from: e */
    final AlarmManager f307150e;

    /* renamed from: f */
    public final C58833ax f307151f;

    /* renamed from: g */
    BroadcastReceiver f307152g = null;

    /* renamed from: h */
    public final C2333ah f307153h;

    /* renamed from: i */
    public final C2333ah f307154i;

    /* renamed from: j */
    public final C87677ae f307155j;

    /* renamed from: k */
    public final C110187j f307156k;

    /* renamed from: l */
    public final C110042b f307157l;

    /* renamed from: m */
    public C87673aa f307158m;

    /* renamed from: n */
    public boolean f307159n = false;

    /* renamed from: o */
    public C109955c f307160o;

    /* renamed from: p */
    private final Context f307161p;

    /* renamed from: q */
    private final C86124t f307162q;

    /* renamed from: r */
    private final IntentFilter f307163r;

    /* renamed from: s */
    private final Map f307164s;

    /* renamed from: t */
    private PendingIntent f307165t;

    /* renamed from: u */
    private final C22871g f307166u;

    /* renamed from: v */
    private final C68214a f307167v;

    /* renamed from: w */
    private final C68214a f307168w;

    /* renamed from: x */
    private final C110398b f307169x;

    /* renamed from: y */
    private final C58833ax f307170y;

    /* renamed from: z */
    private final boolean f307171z;

    public C110229k(C21560e eVar, Context context, C86124t tVar, Map map, C58833ax axVar, C22871g gVar, C68214a aVar, C87677ae aeVar, C68214a aVar2, C110187j jVar, C110398b bVar, C110042b bVar2, C58833ax axVar2, C58881cr crVar) {
        this.f307146B = eVar;
        this.f307161p = context;
        this.f307162q = tVar;
        this.f307164s = map;
        this.f307150e = (AlarmManager) context.getSystemService("alarm");
        this.f307151f = axVar;
        this.f307166u = gVar;
        this.f307167v = aVar;
        this.f307155j = aeVar;
        this.f307168w = aVar2;
        this.f307156k = jVar;
        this.f307169x = bVar;
        this.f307157l = bVar2;
        this.f307170y = axVar2;
        this.f307171z = ((Boolean) crVar.mo6453a()).booleanValue();
        IntentFilter intentFilter = new IntentFilter();
        this.f307163r = intentFilter;
        intentFilter.addAction("com.google.android.apps.gsa.staticplugins.opa.device.ACTION_UPDATE_SUGGESTION");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_SET");
        this.f307153h = new C110133g(this, axVar, jVar);
        this.f307154i = new C110136h(this);
        this.f307147b = new String[0];
        this.f307148c = new ArrayList();
    }

    /* renamed from: h */
    private final PendingIntent m183537h(String str) {
        C69464a aVar = (C69464a) this.f307164s.get(str);
        Intent b = aVar != null ? ((C110420g) aVar.mo17428b()).mo98440b() : null;
        if (b != null) {
            return PendingIntent.getActivity(this.f307161p, 0, b, 335544320);
        }
        return null;
    }

    /* renamed from: i */
    private final void m183538i() {
        if (((C73798aa) this.f307151f.mo56107c()).mo65278b().mo3842a() == z.a) {
            C59104x d = f307144a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "IDModeServ");
            ((C59052c) ((C59052c) d).mo56372aa(25536)).mo56386p("Called an API method even though disconnected! In a weird state. Just assume connection happened.");
            ((C73798aa) this.f307151f.mo56107c()).mo65281e();
        }
    }

    /* renamed from: j */
    private final void m183539j() {
        C21560e eVar = this.f307146B;
        eVar.f59951a.mo119083b(getCallingUid());
    }

    /* renamed from: a */
    public final Bundle mo98271a(int i, Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        C90748e.m148224b();
        m183539j();
        m183538i();
        if (i == 1) {
            Bundle bundle2 = new Bundle();
            PendingIntent h = m183537h("m-ip");
            if (h != null && !this.f307159n) {
                bundle2.putParcelable("response_ambient_intent", h);
                bundle2.putInt("response_ambient_type", 1);
                this.f307159n = true;
            }
            return bundle2;
        }
        Bundle bundle3 = new Bundle();
        int i2 = 0;
        if (bundle != null) {
            i2 = bundle.getInt("immersive_mode_type_key", 0);
        }
        PendingIntent h2 = m183537h("m-ip");
        if (h2 == null || !(i2 == 1 || i2 == 0)) {
            PendingIntent h3 = m183537h("pf-ip");
            if (h3 != null && (i2 == 2 || i2 == 0)) {
                bundle3.putParcelable("response_ambient_intent", h3);
                bundle3.putInt("response_ambient_type", 2);
            }
        } else {
            bundle3.putParcelable("response_ambient_intent", h2);
            bundle3.putInt("response_ambient_type", 1);
        }
        return bundle3;
    }

    /* renamed from: b */
    public final boolean mo98272b(String str, String str2) {
        C90748e.m148224b();
        m183539j();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("empty device id or name");
        }
        m183538i();
        C64279a aVar = (C64279a) C64308b.f173874c.createBuilder();
        C65410a aVar2 = (C65410a) C65421b.f177850c.createBuilder();
        aVar2.copyOnWrite();
        C65421b bVar = (C65421b) aVar2.instance;
        bVar.f177852a |= 1;
        bVar.f177853b = "DREAMLINER_CLIENT_ADAPTER";
        C62940bt btVar = C65412b.f177831d;
        C65411a aVar3 = (C65411a) C65412b.f177830c.createBuilder();
        C65415e eVar = (C65415e) C65416f.f177840d.createBuilder();
        eVar.copyOnWrite();
        C65416f fVar = (C65416f) eVar.instance;
        str.getClass();
        fVar.f177842a |= 1;
        fVar.f177843b = str;
        eVar.copyOnWrite();
        C65416f fVar2 = (C65416f) eVar.instance;
        str2.getClass();
        fVar2.f177842a |= 2;
        fVar2.f177844c = str2;
        aVar3.copyOnWrite();
        C65412b bVar2 = (C65412b) aVar3.instance;
        C65416f fVar3 = (C65416f) eVar.build();
        fVar3.getClass();
        bVar2.f177834b = fVar3;
        bVar2.f177833a = 1;
        aVar2.mo58885m(btVar, (C65412b) aVar3.build());
        aVar.copyOnWrite();
        C64308b bVar3 = (C64308b) aVar.instance;
        C65421b bVar4 = (C65421b) aVar2.build();
        bVar4.getClass();
        bVar3.f173877b = bVar4;
        bVar3.f173876a = 5;
        C64308b bVar5 = (C64308b) aVar.build();
        C110131f fVar4 = C110131f.f306897a;
        if (!this.f307162q.mo79746e(C90014bt.f247122bG) || !this.f307170y.mo56113h()) {
            return false;
        }
        ((C105988a) ((C68214a) this.f307170y.mo56107c()).mo27525b()).mo95204a(bVar5, fVar4).mo95206a();
        return true;
    }

    /* renamed from: c */
    public final void mo98273c(int i, C109955c cVar) {
        C90748e.m148224b();
        m183539j();
        if (cVar != null) {
            m183538i();
            if (this.f307160o != null) {
                C59104x c = f307144a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "IDModeServ");
                ((C59052c) ((C59052c) c).mo56372aa(25538)).mo56386p("Overriding existing suggestion observer.");
            }
            this.f307145A = i;
            this.f307160o = cVar;
            this.f307166u.mo28212l("idmsi -- observe", new C110122d(this));
            if (this.f307152g == null) {
                C110178i iVar = new C110178i(this);
                this.f307152g = iVar;
                this.f307161p.registerReceiver(iVar, this.f307163r);
            }
            mo98490f();
            C59104x b = f307144a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "IDModeServ");
            ((C59052c) ((C59052c) b).mo56372aa(25537)).mo56386p("osc called and done");
            return;
        }
        throw new IllegalArgumentException("null callback");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Bundle mo98488d(String str, C28292j jVar) {
        C60214n g;
        C58976aa aaVar = C58975e.f156826a;
        C87565h hVar = new C87565h();
        hVar.f236570p = true;
        hVar.f236572r = QueryTriggerType.OPA_SUGGESTION_CHIP;
        hVar.f236556b = e.af;
        hVar.f236523a = "and.opa.aod.chip";
        hVar.f236500D = true ^ this.f307171z;
        if (!(jVar == null || (g = C28285c.m52880g(jVar)) == null)) {
            hVar.f236571q = C28294l.m52913c(g);
        }
        return this.f307169x.mo98626b(str, str, hVar, false, (Intent) null);
    }

    /* renamed from: e */
    public final void mo98489e() {
        if (this.f307158m == null) {
            C59104x c = f307144a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "IDModeServ");
            ((C59052c) ((C59052c) c).mo56372aa(25542)).mo56386p("not connected for ssc");
            return;
        }
        C88489j jVar = new C88489j(C87739bu.ASSISTANT_CLIENT_SYNC_START);
        C87695ad adVar = (C87695ad) C87696ae.f237132p.createBuilder();
        adVar.copyOnWrite();
        C87696ae aeVar = (C87696ae) adVar.instance;
        aeVar.f237134a |= 1024;
        aeVar.f237144k = true;
        C53268hp hpVar = (C53268hp) C53271hs.f139650u.createBuilder();
        C53306j jVar2 = C53306j.DOCK;
        hpVar.copyOnWrite();
        C53271hs hsVar = (C53271hs) hpVar.instance;
        hsVar.f139663l = jVar2.f139793X;
        hsVar.f139652a |= 512;
        adVar.copyOnWrite();
        C87696ae aeVar2 = (C87696ae) adVar.instance;
        C53271hs hsVar2 = (C53271hs) hpVar.build();
        hsVar2.getClass();
        aeVar2.f237136c = hsVar2;
        aeVar2.f237134a |= 2;
        jVar.mo82014b(C87694ac.f237131a, (C87696ae) adVar.build());
        C87673aa aaVar = this.f307158m;
        aaVar.getClass();
        aaVar.mo81937i(jVar.mo82013a());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|4|5|6|(3:8|9|10)(2:11|(7:13|(3:15|(1:24)(4:19|(2:22|20)|98|23)|25)|26|(2:28|(4:30|(2:33|31)|99|34)(2:35|36))|37|(2:39|(2:40|(3:42|(2:44|102)(2:45|101)|46)(1:100)))(0)|47)(1:48))|49|(5:51|(1:53)|54|(3:60|(1:62)(1:63)|64)|65)|66|(1:68)(3:69|(2:70|(1:103)(2:72|(2:104|74)(1:75)))|76)|77|78|79|80|81|(1:83)|84|(1:86)|87|88|89) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0304 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98490f() {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = "and.opa.aod.logo"
            com.google.android.apps.gsa.staticplugins.opa.r.c r2 = r1.f307160o     // Catch:{ RemoteException -> 0x0359 }
            r2.getClass()
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ RemoteException -> 0x0359 }
            r3.<init>()     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.apps.gsa.search.core.i.t r4 = r1.f307162q     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247612kT     // Catch:{ RemoteException -> 0x0359 }
            boolean r4 = r4.mo79746e(r5)     // Catch:{ RemoteException -> 0x0359 }
            java.lang.String r5 = "ui_element_type"
            java.lang.String r6 = "IDModeServ"
            r7 = 0
            r8 = 2
            r9 = 0
            r10 = 1
            if (r4 == 0) goto L_0x002b
            java.lang.String r4 = "ERROR: account not whitelisted"
            android.os.Bundle r4 = r1.mo98488d(r4, r7)     // Catch:{ RemoteException -> 0x0359 }
            r3.add(r4)     // Catch:{ RemoteException -> 0x0359 }
            goto L_0x013d
        L_0x002b:
            com.google.common.base.ax r4 = r1.f307151f     // Catch:{ RemoteException -> 0x0359 }
            java.lang.Object r4 = r4.mo56107c()     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.apps.gsa.assistant.shared.aa r4 = (com.google.android.apps.gsa.assistant.shared.C73798aa) r4     // Catch:{ RemoteException -> 0x0359 }
            androidx.lifecycle.LiveData r4 = r4.mo65278b()     // Catch:{ RemoteException -> 0x0359 }
            java.lang.Object r4 = r4.mo3842a()     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.apps.gsa.assistant.shared.z r11 = com.google.android.apps.gsa.assistant.shared.z.d     // Catch:{ RemoteException -> 0x0359 }
            if (r4 != r11) goto L_0x012b
            java.lang.String[] r4 = r1.f307149d     // Catch:{ RemoteException -> 0x0359 }
            if (r4 != 0) goto L_0x0083
            boolean r4 = r16.mo98491g()     // Catch:{ RemoteException -> 0x0359 }
            if (r4 == 0) goto L_0x007b
            com.google.android.apps.gsa.staticplugins.opa.samson.j r4 = r1.f307156k     // Catch:{ RemoteException -> 0x0359 }
            androidx.lifecycle.ag r4 = r4.f307024a     // Catch:{ RemoteException -> 0x0359 }
            java.lang.Object r4 = r4.mo3842a()     // Catch:{ RemoteException -> 0x0359 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ RemoteException -> 0x0359 }
            if (r4 == 0) goto L_0x007b
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ RemoteException -> 0x0359 }
            r11.<init>()     // Catch:{ RemoteException -> 0x0359 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ RemoteException -> 0x0359 }
        L_0x005e:
            boolean r12 = r4.hasNext()     // Catch:{ RemoteException -> 0x0359 }
            if (r12 == 0) goto L_0x0070
            java.lang.Object r12 = r4.next()     // Catch:{ RemoteException -> 0x0359 }
            com.google.assistant.e.j.e.gr r12 = (com.google.assistant.p3897e.p3921j.p3926e.C51992gr) r12     // Catch:{ RemoteException -> 0x0359 }
            java.lang.String r12 = r12.f136451e     // Catch:{ RemoteException -> 0x0359 }
            r11.add(r12)     // Catch:{ RemoteException -> 0x0359 }
            goto L_0x005e
        L_0x0070:
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RemoteException -> 0x0359 }
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch:{ RemoteException -> 0x0359 }
            java.lang.Object[] r4 = r11.toArray(r4)     // Catch:{ RemoteException -> 0x0359 }
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ RemoteException -> 0x0359 }
            goto L_0x0081
        L_0x007b:
            com.google.android.apps.gsa.staticplugins.opa.samson.b r4 = r1.f307157l     // Catch:{ RemoteException -> 0x0359 }
            java.lang.String[] r4 = r4.mo98331a()     // Catch:{ RemoteException -> 0x0359 }
        L_0x0081:
            r1.f307149d = r4     // Catch:{ RemoteException -> 0x0359 }
        L_0x0083:
            java.lang.String[] r4 = r1.f307149d     // Catch:{ RemoteException -> 0x0359 }
            java.lang.String[] r11 = r1.f307147b     // Catch:{ RemoteException -> 0x0359 }
            if (r4 == r11) goto L_0x00da
            r1.f307147b = r4     // Catch:{ RemoteException -> 0x0359 }
            if (r4 == 0) goto L_0x00d4
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ RemoteException -> 0x0359 }
            r11.<init>()     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.libraries.logging.j r12 = new com.google.android.libraries.logging.j     // Catch:{ RemoteException -> 0x0359 }
            r13 = 57867(0xe20b, float:8.1089E-41)
            r12.<init>(r13)     // Catch:{ RemoteException -> 0x0359 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ RemoteException -> 0x0359 }
            r13.<init>()     // Catch:{ RemoteException -> 0x0359 }
            r14 = 0
        L_0x00a0:
            int r15 = r4.length     // Catch:{ RemoteException -> 0x0359 }
            if (r14 >= r15) goto L_0x00c1
            com.google.android.libraries.logging.j r15 = new com.google.android.libraries.logging.j     // Catch:{ RemoteException -> 0x0359 }
            r7 = 57868(0xe20c, float:8.109E-41)
            r15.<init>(r7)     // Catch:{ RemoteException -> 0x0359 }
            r7 = 5
            r15.mo33795i(r7)     // Catch:{ RemoteException -> 0x0359 }
            r15.f76976d = r10     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.libraries.logging.k[] r7 = new com.google.android.libraries.logging.C28293k[r9]     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.libraries.logging.k r7 = com.google.android.libraries.logging.C28293k.m52908e(r15, r7)     // Catch:{ RemoteException -> 0x0359 }
            r13.add(r7)     // Catch:{ RemoteException -> 0x0359 }
            r11.add(r15)     // Catch:{ RemoteException -> 0x0359 }
            int r14 = r14 + 1
            r7 = 0
            goto L_0x00a0
        L_0x00c1:
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.libraries.logging.k r4 = com.google.android.libraries.logging.C28293k.m52907d(r12, r13)     // Catch:{ RemoteException -> 0x0359 }
            r7 = 60139(0xeaeb, float:8.4273E-41)
            com.google.common.o.oe r4 = com.google.android.libraries.logging.C28285c.m52875b(r4, r7)     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.apps.gsa.shared.logger.C89949q.m146521e(r4, r9)     // Catch:{ RemoteException -> 0x0359 }
            r1.f307148c = r11     // Catch:{ RemoteException -> 0x0359 }
            goto L_0x00da
        L_0x00d4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ RemoteException -> 0x0359 }
            r0.<init>()     // Catch:{ RemoteException -> 0x0359 }
            throw r0     // Catch:{ RemoteException -> 0x0359 }
        L_0x00da:
            java.util.List r4 = r1.f307148c     // Catch:{ RemoteException -> 0x0359 }
            int r4 = r4.size()     // Catch:{ RemoteException -> 0x0359 }
            java.lang.String[] r7 = r1.f307147b     // Catch:{ RemoteException -> 0x0359 }
            int r7 = r7.length     // Catch:{ RemoteException -> 0x0359 }
            if (r4 != r7) goto L_0x0118
            r4 = 0
        L_0x00e6:
            java.lang.String[] r7 = r1.f307147b     // Catch:{ RemoteException -> 0x0359 }
            int r11 = r7.length     // Catch:{ RemoteException -> 0x0359 }
            if (r4 >= r11) goto L_0x0118
            int r11 = r1.f307145A     // Catch:{ RemoteException -> 0x0359 }
            if (r11 < r8) goto L_0x0104
            r7 = r7[r4]     // Catch:{ RemoteException -> 0x0359 }
            java.util.List r11 = r1.f307148c     // Catch:{ RemoteException -> 0x0359 }
            java.lang.Object r11 = r11.get(r4)     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.libraries.logging.j r11 = (com.google.android.libraries.logging.C28292j) r11     // Catch:{ RemoteException -> 0x0359 }
            android.os.Bundle r7 = r1.mo98488d(r7, r11)     // Catch:{ RemoteException -> 0x0359 }
            r7.putInt(r5, r9)     // Catch:{ RemoteException -> 0x0359 }
            r3.add(r7)     // Catch:{ RemoteException -> 0x0359 }
            goto L_0x0115
        L_0x0104:
            r7 = r7[r4]     // Catch:{ RemoteException -> 0x0359 }
            java.util.List r11 = r1.f307148c     // Catch:{ RemoteException -> 0x0359 }
            java.lang.Object r11 = r11.get(r4)     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.libraries.logging.j r11 = (com.google.android.libraries.logging.C28292j) r11     // Catch:{ RemoteException -> 0x0359 }
            android.os.Bundle r7 = r1.mo98488d(r7, r11)     // Catch:{ RemoteException -> 0x0359 }
            r3.add(r7)     // Catch:{ RemoteException -> 0x0359 }
        L_0x0115:
            int r4 = r4 + 1
            goto L_0x00e6
        L_0x0118:
            com.google.common.f.e r4 = f307144a     // Catch:{ RemoteException -> 0x0359 }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ RemoteException -> 0x0359 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RemoteException -> 0x0359 }
            r4.mo56378ag(r7, r6)     // Catch:{ RemoteException -> 0x0359 }
            java.lang.String r7 = "cs ct, returning list."
            r11 = 25530(0x63ba, float:3.5775E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r11)).mo56386p(r7)     // Catch:{ RemoteException -> 0x0359 }
            goto L_0x013d
        L_0x012b:
            com.google.common.f.e r4 = f307144a     // Catch:{ RemoteException -> 0x0359 }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ RemoteException -> 0x0359 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RemoteException -> 0x0359 }
            r4.mo56378ag(r7, r6)     // Catch:{ RemoteException -> 0x0359 }
            java.lang.String r7 = "not cs ct, returning empty."
            r11 = 25529(0x63b9, float:3.5774E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r11)).mo56386p(r7)     // Catch:{ RemoteException -> 0x0359 }
        L_0x013d:
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ RemoteException -> 0x0359 }
            r4.<init>()     // Catch:{ RemoteException -> 0x0359 }
            java.lang.String r7 = "suggestion_chips"
            r4.putParcelableArrayList(r7, r3)     // Catch:{ RemoteException -> 0x0359 }
            int r3 = r1.f307145A     // Catch:{ RemoteException -> 0x0359 }
            r7 = 335544320(0x14000000, float:6.4623485E-27)
            if (r3 < r8) goto L_0x02b3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ RemoteException -> 0x0359 }
            r3.<init>()     // Catch:{ RemoteException -> 0x0359 }
            android.os.Bundle r11 = new android.os.Bundle     // Catch:{ RemoteException -> 0x0359 }
            r11.<init>()     // Catch:{ RemoteException -> 0x0359 }
            r11.putInt(r5, r10)     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.apps.gsa.search.shared.h.h r11 = new com.google.android.apps.gsa.search.shared.h.h     // Catch:{ RemoteException -> 0x0359 }
            r11.<init>()     // Catch:{ RemoteException -> 0x0359 }
            boolean r12 = r1.f307171z     // Catch:{ RemoteException -> 0x0359 }
            if (r12 != 0) goto L_0x0165
            r11.f236560f = r8     // Catch:{ RemoteException -> 0x0359 }
        L_0x0165:
            r11.f236523a = r0     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.apps.gsa.assistant.shared.l.e r12 = com.google.android.apps.gsa.assistant.shared.l.e.ae     // Catch:{ RemoteException -> 0x0359 }
            r11.f236556b = r12     // Catch:{ RemoteException -> 0x0359 }
            r11.f236507K = r10     // Catch:{ RemoteException -> 0x0359 }
            boolean r12 = r1.f307171z     // Catch:{ RemoteException -> 0x0359 }
            r13 = r12 ^ 1
            r11.f236503G = r13     // Catch:{ RemoteException -> 0x0359 }
            r11.f236540ak = r12     // Catch:{ RemoteException -> 0x0359 }
            r11.f236500D = r13     // Catch:{ RemoteException -> 0x0359 }
            android.os.Bundle r12 = new android.os.Bundle     // Catch:{ RemoteException -> 0x0359 }
            r12.<init>()     // Catch:{ RemoteException -> 0x0359 }
            java.lang.String r13 = "dreamliner_seq_args"
            com.google.common.base.ax r14 = r1.f307151f     // Catch:{ RemoteException -> 0x0359 }
            java.lang.Object r14 = r14.mo56107c()     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.apps.gsa.assistant.shared.aa r14 = (com.google.android.apps.gsa.assistant.shared.C73798aa) r14     // Catch:{ RemoteException -> 0x0359 }
            java.lang.String r14 = r14.mo65279c()     // Catch:{ RemoteException -> 0x0359 }
            r12.putString(r13, r14)     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.apps.gsa.opaonboarding.am r13 = com.google.android.apps.gsa.opaonboarding.C83880an.m133553o()     // Catch:{ RemoteException -> 0x0359 }
            java.lang.String r14 = "dreamliner_seq"
            r15 = r13
            com.google.android.apps.gsa.opaonboarding.g r15 = (com.google.android.apps.gsa.opaonboarding.C83940g) r15     // Catch:{ RemoteException -> 0x0359 }
            r15.f228605a = r14     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.apps.gsa.opaonboarding.e r14 = new com.google.android.apps.gsa.opaonboarding.e     // Catch:{ RemoteException -> 0x0359 }
            r15 = 0
            r14.<init>(r9, r15, r15)     // Catch:{ RemoteException -> 0x0359 }
            r15 = r13
            com.google.android.apps.gsa.opaonboarding.g r15 = (com.google.android.apps.gsa.opaonboarding.C83940g) r15     // Catch:{ RemoteException -> 0x0359 }
            r15.f228607c = r14     // Catch:{ RemoteException -> 0x0359 }
            r14 = r13
            com.google.android.apps.gsa.opaonboarding.g r14 = (com.google.android.apps.gsa.opaonboarding.C83940g) r14     // Catch:{ RemoteException -> 0x0359 }
            r14.f228606b = r12     // Catch:{ RemoteException -> 0x0359 }
            com.google.common.o.a.w r12 = com.google.common.p4552o.p4553a.C59567w.f158058g     // Catch:{ RemoteException -> 0x0359 }
            com.google.protobuf.bn r12 = r12.createBuilder()     // Catch:{ RemoteException -> 0x0359 }
            com.google.common.o.a.v r12 = (com.google.common.p4552o.p4553a.C59566v) r12     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.apps.gsa.assistant.b.a.b r14 = com.google.android.apps.gsa.assistant.p510b.p511a.C9439b.OPA_DREAMLINER_ONBOARDING     // Catch:{ RemoteException -> 0x0359 }
            r12.copyOnWrite()     // Catch:{ RemoteException -> 0x0359 }
            com.google.protobuf.bv r15 = r12.instance     // Catch:{ RemoteException -> 0x0359 }
            com.google.common.o.a.w r15 = (com.google.common.p4552o.p4553a.C59567w) r15     // Catch:{ RemoteException -> 0x0359 }
            int r14 = r14.f32835aq     // Catch:{ RemoteException -> 0x0359 }
            r15.f158062c = r14     // Catch:{ RemoteException -> 0x0359 }
            int r14 = r15.f158060a     // Catch:{ RemoteException -> 0x0359 }
            r14 = r14 | r8
            r15.f158060a = r14     // Catch:{ RemoteException -> 0x0359 }
            com.google.protobuf.bv r12 = r12.build()     // Catch:{ RemoteException -> 0x0359 }
            com.google.common.o.a.w r12 = (com.google.common.p4552o.p4553a.C59567w) r12     // Catch:{ RemoteException -> 0x0359 }
            r13.mo77222b(r12)     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.apps.gsa.opaonboarding.an r12 = r13.mo77221a()     // Catch:{ RemoteException -> 0x0359 }
            android.content.Intent r12 = r12.mo77240n()     // Catch:{ RemoteException -> 0x0359 }
            r11.f236567m = r12     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.apps.gsa.staticplugins.opa.samson.q.b r12 = r1.f307169x     // Catch:{ RemoteException -> 0x0359 }
            r13 = 2131233688(0x7f080b98, float:1.808352E38)
            android.os.Bundle r11 = r12.mo98627c(r11, r13)     // Catch:{ RemoteException -> 0x0359 }
            r3.add(r11)     // Catch:{ RemoteException -> 0x0359 }
            com.google.common.base.ax r11 = r1.f307151f     // Catch:{ RemoteException -> 0x0359 }
            boolean r11 = r11.mo56113h()     // Catch:{ RemoteException -> 0x0359 }
            if (r11 == 0) goto L_0x01fd
            com.google.common.base.ax r11 = r1.f307151f     // Catch:{ RemoteException -> 0x0359 }
            java.lang.Object r11 = r11.mo56107c()     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.apps.gsa.assistant.shared.aa r11 = (com.google.android.apps.gsa.assistant.shared.C73798aa) r11     // Catch:{ RemoteException -> 0x0359 }
            androidx.lifecycle.LiveData r11 = r11.mo65278b()     // Catch:{ RemoteException -> 0x0359 }
            java.lang.Object r11 = r11.mo3842a()     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.apps.gsa.assistant.shared.z r12 = com.google.android.apps.gsa.assistant.shared.z.d     // Catch:{ RemoteException -> 0x0359 }
            if (r11 == r12) goto L_0x0207
        L_0x01fd:
            com.google.android.apps.gsa.search.core.i.t r11 = r1.f307162q     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.apps.gsa.shared.m.d r12 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247116bA     // Catch:{ RemoteException -> 0x0359 }
            boolean r11 = r11.mo79746e(r12)     // Catch:{ RemoteException -> 0x0359 }
            if (r11 == 0) goto L_0x02ae
        L_0x0207:
            com.google.assistant.s.a.ih r11 = com.google.assistant.p3994s.p3995a.C53287ih.f139693l     // Catch:{ RemoteException -> 0x0359 }
            com.google.protobuf.bn r11 = r11.createBuilder()     // Catch:{ RemoteException -> 0x0359 }
            com.google.assistant.s.a.hw r11 = (com.google.assistant.p3994s.p3995a.C53275hw) r11     // Catch:{ RemoteException -> 0x0359 }
            r11.copyOnWrite()     // Catch:{ RemoteException -> 0x0359 }
            com.google.protobuf.bv r12 = r11.instance     // Catch:{ RemoteException -> 0x0359 }
            com.google.assistant.s.a.ih r12 = (com.google.assistant.p3994s.p3995a.C53287ih) r12     // Catch:{ RemoteException -> 0x0359 }
            r12.f139698d = r10     // Catch:{ RemoteException -> 0x0359 }
            int r13 = r12.f139695a     // Catch:{ RemoteException -> 0x0359 }
            r13 = r13 | r10
            r12.f139695a = r13     // Catch:{ RemoteException -> 0x0359 }
            r11.copyOnWrite()     // Catch:{ RemoteException -> 0x0359 }
            com.google.protobuf.bv r12 = r11.instance     // Catch:{ RemoteException -> 0x0359 }
            com.google.assistant.s.a.ih r12 = (com.google.assistant.p3994s.p3995a.C53287ih) r12     // Catch:{ RemoteException -> 0x0359 }
            r13 = 11
            r12.f139702h = r13     // Catch:{ RemoteException -> 0x0359 }
            int r13 = r12.f139695a     // Catch:{ RemoteException -> 0x0359 }
            r13 = r13 | 64
            r12.f139695a = r13     // Catch:{ RemoteException -> 0x0359 }
            r11.copyOnWrite()     // Catch:{ RemoteException -> 0x0359 }
            com.google.protobuf.bv r12 = r11.instance     // Catch:{ RemoteException -> 0x0359 }
            com.google.assistant.s.a.ih r12 = (com.google.assistant.p3994s.p3995a.C53287ih) r12     // Catch:{ RemoteException -> 0x0359 }
            r13 = 23
            r12.f139703i = r13     // Catch:{ RemoteException -> 0x0359 }
            int r13 = r12.f139695a     // Catch:{ RemoteException -> 0x0359 }
            r13 = r13 | 128(0x80, float:1.794E-43)
            r12.f139695a = r13     // Catch:{ RemoteException -> 0x0359 }
            com.google.protobuf.bv r11 = r11.build()     // Catch:{ RemoteException -> 0x0359 }
            com.google.assistant.s.a.ih r11 = (com.google.assistant.p3994s.p3995a.C53287ih) r11     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.apps.gsa.search.shared.h.h r12 = new com.google.android.apps.gsa.search.shared.h.h     // Catch:{ RemoteException -> 0x0359 }
            r12.<init>()     // Catch:{ RemoteException -> 0x0359 }
            r13 = 4
            r12.f236560f = r13     // Catch:{ RemoteException -> 0x0359 }
            r12.f236507K = r10     // Catch:{ RemoteException -> 0x0359 }
            r12.f236499C = r10     // Catch:{ RemoteException -> 0x0359 }
            boolean r14 = r1.f307171z     // Catch:{ RemoteException -> 0x0359 }
            r14 = r14 ^ r10
            r12.f236500D = r14     // Catch:{ RemoteException -> 0x0359 }
            r12.f236523a = r0     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.apps.gsa.assistant.shared.l.e r0 = com.google.android.apps.gsa.assistant.shared.l.e.ae     // Catch:{ RemoteException -> 0x0359 }
            r12.f236556b = r0     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.apps.gsa.staticplugins.opa.samson.q.b r0 = r1.f307169x     // Catch:{ RemoteException -> 0x0359 }
            android.os.Bundle r14 = new android.os.Bundle     // Catch:{ RemoteException -> 0x0359 }
            r14.<init>()     // Catch:{ RemoteException -> 0x0359 }
            r14.putInt(r5, r8)     // Catch:{ RemoteException -> 0x0359 }
            r12.f236560f = r13     // Catch:{ RemoteException -> 0x0359 }
            r12.f236507K = r10     // Catch:{ RemoteException -> 0x0359 }
            r12.f236499C = r10     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.apps.gsa.search.core.i.t r5 = r0.f307684d     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.apps.gsa.shared.m.d r13 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247287eM     // Catch:{ RemoteException -> 0x0359 }
            boolean r5 = r5.mo79746e(r13)     // Catch:{ RemoteException -> 0x0359 }
            if (r5 == 0) goto L_0x027f
            com.google.android.apps.gsa.search.shared.h.n r5 = r0.f307683c     // Catch:{ RemoteException -> 0x0359 }
            android.content.Context r12 = r0.f307681a     // Catch:{ RemoteException -> 0x0359 }
            android.content.Intent r5 = r5.mo81694a(r12, r11)     // Catch:{ RemoteException -> 0x0359 }
            goto L_0x028e
        L_0x027f:
            com.google.android.apps.gsa.search.shared.h.k r5 = r0.f307682b     // Catch:{ RemoteException -> 0x0359 }
            android.content.Context r11 = r0.f307681a     // Catch:{ RemoteException -> 0x0359 }
            android.os.Bundle r12 = r12.mo81685a()     // Catch:{ RemoteException -> 0x0359 }
            r13 = 268468224(0x10008000, float:2.5342157E-29)
            android.content.Intent r5 = r5.mo81687a(r11, r12, r13)     // Catch:{ RemoteException -> 0x0359 }
        L_0x028e:
            java.lang.String r11 = "entry_point_intent"
            android.content.Context r12 = r0.f307681a     // Catch:{ RemoteException -> 0x0359 }
            int r13 = com.google.android.apps.gsa.staticplugins.opa.samson.p8446q.C110398b.m183812a()     // Catch:{ RemoteException -> 0x0359 }
            android.app.PendingIntent r5 = android.app.PendingIntent.getActivity(r12, r13, r5, r7)     // Catch:{ RemoteException -> 0x0359 }
            r14.putParcelable(r11, r5)     // Catch:{ RemoteException -> 0x0359 }
            java.lang.String r5 = "entry_point_icon"
            android.content.Context r0 = r0.f307681a     // Catch:{ RemoteException -> 0x0359 }
            r11 = 2131235835(0x7f0813fb, float:1.8087875E38)
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithResource(r0, r11)     // Catch:{ RemoteException -> 0x0359 }
            r14.putParcelable(r5, r0)     // Catch:{ RemoteException -> 0x0359 }
            r3.add(r14)     // Catch:{ RemoteException -> 0x0359 }
        L_0x02ae:
            java.lang.String r0 = "entry_points"
            r4.putParcelableArrayList(r0, r3)     // Catch:{ RemoteException -> 0x0359 }
        L_0x02b3:
            android.os.Parcel r0 = r2.mo17260gA()     // Catch:{ RemoteException -> 0x0359 }
            com.google.android.p445a.C8850c.m23497f(r0, r4)     // Catch:{ RemoteException -> 0x0359 }
            r2.mo17263hf(r10, r0)     // Catch:{ RemoteException -> 0x0359 }
            org.c.a.d r0 = new org.c.a.d     // Catch:{ RemoteException -> 0x0359 }
            r0.<init>()     // Catch:{ RemoteException -> 0x0359 }
            boolean r2 = r16.mo98491g()     // Catch:{ RemoteException -> 0x0359 }
            if (r2 == 0) goto L_0x02d6
            org.c.a.d r2 = new org.c.a.d     // Catch:{ RemoteException -> 0x0359 }
            r2.<init>()     // Catch:{ RemoteException -> 0x0359 }
            org.c.a.d r2 = r2.mo63545c(r8)     // Catch:{ RemoteException -> 0x0359 }
            int r2 = r2.mo63372k()     // Catch:{ RemoteException -> 0x0359 }
            goto L_0x02f2
        L_0x02d6:
            com.google.android.apps.gsa.staticplugins.opa.samson.b r2 = r1.f307157l     // Catch:{ RemoteException -> 0x0359 }
            org.c.a.d r3 = new org.c.a.d     // Catch:{ RemoteException -> 0x0359 }
            r3.<init>()     // Catch:{ RemoteException -> 0x0359 }
            int r3 = r3.mo63372k()     // Catch:{ RemoteException -> 0x0359 }
            r4 = 0
        L_0x02e2:
            int[] r5 = r2.f306603j     // Catch:{ RemoteException -> 0x0359 }
            int r8 = r5.length     // Catch:{ RemoteException -> 0x0359 }
            if (r4 >= r8) goto L_0x02ef
            r11 = r5[r4]     // Catch:{ RemoteException -> 0x0359 }
            if (r3 >= r11) goto L_0x02ec
            goto L_0x02ef
        L_0x02ec:
            int r4 = r4 + 1
            goto L_0x02e2
        L_0x02ef:
            int r4 = r4 % r8
            r2 = r5[r4]     // Catch:{ RemoteException -> 0x0359 }
        L_0x02f2:
            org.c.a.d r3 = new org.c.a.d     // Catch:{ s -> 0x0304 }
            int r4 = r0.mo63375n()     // Catch:{ s -> 0x0304 }
            int r5 = r0.mo63374m()     // Catch:{ s -> 0x0304 }
            int r8 = r0.mo63371j()     // Catch:{ s -> 0x0304 }
            r3.<init>(r4, r5, r8, r2)     // Catch:{ s -> 0x0304 }
            goto L_0x0316
        L_0x0304:
            org.c.a.d r3 = new org.c.a.d     // Catch:{ RemoteException -> 0x0359 }
            int r4 = r0.mo63375n()     // Catch:{ RemoteException -> 0x0359 }
            int r5 = r0.mo63374m()     // Catch:{ RemoteException -> 0x0359 }
            int r8 = r0.mo63371j()     // Catch:{ RemoteException -> 0x0359 }
            int r2 = r2 + r10
            r3.<init>(r4, r5, r8, r2)     // Catch:{ RemoteException -> 0x0359 }
        L_0x0316:
            long r4 = org.p5633c.p5634a.C72285i.m106773a(r0)     // Catch:{ RemoteException -> 0x0359 }
            boolean r0 = r3.mo63389t(r4)     // Catch:{ RemoteException -> 0x0359 }
            if (r0 == 0) goto L_0x0324
            org.c.a.d r3 = r3.mo63550h()     // Catch:{ RemoteException -> 0x0359 }
        L_0x0324:
            android.app.PendingIntent r0 = r1.f307165t     // Catch:{ RemoteException -> 0x0359 }
            if (r0 != 0) goto L_0x0337
            android.content.Context r0 = r1.f307161p     // Catch:{ RemoteException -> 0x0359 }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ RemoteException -> 0x0359 }
            java.lang.String r4 = "com.google.android.apps.gsa.staticplugins.opa.device.ACTION_UPDATE_SUGGESTION"
            r2.<init>(r4)     // Catch:{ RemoteException -> 0x0359 }
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r0, r9, r2, r7)     // Catch:{ RemoteException -> 0x0359 }
            r1.f307165t = r0     // Catch:{ RemoteException -> 0x0359 }
        L_0x0337:
            android.app.AlarmManager r7 = r1.f307150e     // Catch:{ IllegalStateException -> 0x0345 }
            long r9 = r3.f191962a     // Catch:{ IllegalStateException -> 0x0345 }
            r8 = 1
            r11 = 1800000(0x1b7740, double:8.89318E-318)
            android.app.PendingIntent r13 = r1.f307165t     // Catch:{ IllegalStateException -> 0x0345 }
            r7.setWindow(r8, r9, r11, r13)     // Catch:{ IllegalStateException -> 0x0345 }
            return
        L_0x0345:
            r0 = move-exception
            com.google.common.f.e r2 = f307144a     // Catch:{ RemoteException -> 0x0359 }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ RemoteException -> 0x0359 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RemoteException -> 0x0359 }
            r2.mo56378ag(r3, r6)     // Catch:{ RemoteException -> 0x0359 }
            java.lang.String r3 = "Exception while setting alarm window"
            r4 = 25541(0x63c5, float:3.579E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r4)).mo56386p(r3)     // Catch:{ RemoteException -> 0x0359 }
            return
        L_0x0359:
            r0 = move-exception
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.getMessage()
            android.app.PendingIntent r0 = r1.f307165t
            if (r0 == 0) goto L_0x0368
            android.app.AlarmManager r2 = r1.f307150e
            r2.cancel(r0)
        L_0x0368:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.samson.C110229k.mo98490f():void");
    }

    /* renamed from: g */
    public final boolean mo98491g() {
        if (!this.f307162q.mo79746e(C90014bt.f247130bO) || ((C73798aa) this.f307151f.mo56107c()).mo65278b().mo3842a() != z.d) {
            return false;
        }
        Account a = ((C86054o) this.f307167v.mo27525b()).mo79668a();
        String c = ((C73798aa) this.f307151f.mo56107c()).mo65279c();
        if (!(a == null || c == null)) {
            if (((SharedPreferences) ((C110418e) this.f307168w.mo27525b()).f307771a.mo27525b()).getBoolean(C110418e.m183882a(a.name, c), false)) {
                return true;
            }
        }
        return false;
    }
}
