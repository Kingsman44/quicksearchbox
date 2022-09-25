package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.binaries.satin.app.C74084iv;
import com.google.android.apps.gsa.binaries.satin.app.C74086iy;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.bisto.C89605ac;
import com.google.android.apps.gsa.shared.bisto.C89606ad;
import com.google.android.apps.gsa.shared.bisto.C89651f;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.gsa.staticplugins.bisto.C95458i;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95346ax;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95358bi;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95373bx;
import com.google.android.apps.gsa.staticplugins.bisto.p7494l.C95482c;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96019bo;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96020bp;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96022br;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import dagger.C68214a;
import dagger.p5294a.C68225k;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.g */
/* compiled from: PG */
public final class C95937g implements C96020bp, C96022br, C89495cg, C89605ac {

    /* renamed from: a */
    public static final C59071e f268622a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.a.g");

    /* renamed from: b */
    public final Executor f268623b;

    /* renamed from: c */
    public final C95358bi f268624c;

    /* renamed from: d */
    public final C89492cd f268625d;

    /* renamed from: e */
    public final C89606ad f268626e;

    /* renamed from: f */
    public final Context f268627f;

    /* renamed from: g */
    public final C68214a f268628g;

    /* renamed from: h */
    BroadcastReceiver f268629h;

    /* renamed from: i */
    public final Map f268630i = new HashMap();

    /* renamed from: j */
    public final Map f268631j = new HashMap();

    /* renamed from: k */
    private final C60888db f268632k;

    /* renamed from: l */
    private final C68214a f268633l;

    /* renamed from: m */
    private final C68214a f268634m;

    /* renamed from: n */
    private final C88483e f268635n;

    /* renamed from: o */
    private final C95373bx f268636o;

    /* renamed from: p */
    private boolean f268637p;

    /* renamed from: q */
    private final C74084iv f268638q;

    public C95937g(Context context, C95358bi biVar, C89492cd cdVar, C74084iv ivVar, C68214a aVar, C95850a aVar2, C68214a aVar3, C68214a aVar4, C95458i iVar, C95373bx bxVar, C88483e eVar, C60888db dbVar, Executor executor) {
        C58976aa aaVar = C58975e.f156826a;
        this.f268627f = context;
        this.f268624c = biVar;
        this.f268625d = cdVar;
        this.f268638q = ivVar;
        this.f268633l = aVar3;
        this.f268628g = aVar4;
        this.f268634m = aVar;
        this.f268626e = iVar;
        this.f268636o = bxVar;
        this.f268635n = eVar;
        this.f268632k = dbVar;
        this.f268623b = executor;
        aVar2.f268408a.add(this);
    }

    /* renamed from: f */
    private final C60870cx m159096f() {
        return this.f268632k.mo19399b(new C95932b(this));
    }

    /* renamed from: g */
    private final Collection m159097g() {
        return new HashSet(this.f268630i.values());
    }

    /* renamed from: i */
    private final synchronized void m159098i(long j) {
        C60856cj.m92911t(this.f268625d.mo83402i(), new C95935e(this, j), this.f268623b);
    }

    /* renamed from: a */
    public final void mo83453a() {
        for (C95950t tVar : this.f268630i.values()) {
            C95482c cVar = tVar.f268661e;
            C58976aa aaVar = C58975e.f156826a;
            cVar.f267190a.mo83364F(cVar.f267191b.mo89270k());
            C95482c cVar2 = tVar.f268661e;
            cVar2.f267194e = false;
            cVar2.mo89386a();
            tVar.f268858b.mo89853k();
        }
    }

    /* renamed from: b */
    public final void mo89859b(String str) {
        C59071e eVar = f268622a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoClassicManager");
        ((C59052c) ((C59052c) b).mo56372aa(15749)).mo56389s("isInInactiveState %s", str);
        if (!this.f268637p) {
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "BistoClassicManager");
            ((C59052c) ((C59052c) b2).mo56372aa(15750)).mo56389s("Moving deviceManager for %s into inactive", str);
            this.f268630i.remove(str);
            mo89863e();
        }
    }

    /* renamed from: c */
    public final void mo89860c(C95346ax axVar) {
        if (!this.f268631j.containsKey(axVar.mo89270k())) {
            C59104x b = f268622a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoClassicManager");
            ((C59052c) ((C59052c) b).mo56372aa(15756)).mo56386p("Requesting up-to-date settings information");
            C89651f.m145940a(this.f268635n, new C88489j(C87739bu.BISTO_REFRESH_ASSISTANT_SETTINGS).mo82013a());
            C74084iv ivVar = this.f268638q;
            axVar.getClass();
            ivVar.f206390d = axVar;
            ivVar.f206389c = this;
            C68225k.m98529a(ivVar.f206389c, C96022br.class);
            C68225k.m98529a(ivVar.f206390d, C95346ax.class);
            C95950t tVar = (C95950t) new C74086iy(ivVar.f206387a, ivVar.f206388b, ivVar.f206389c, ivVar.f206390d).f206405O.mo17428b();
            this.f268631j.put(axVar.mo89270k(), tVar);
            this.f268630i.put(axVar.mo89270k(), tVar);
            return;
        }
        C59104x d = f268622a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BistoClassicManager");
        ((C59052c) ((C59052c) d).mo56372aa(15728)).mo56386p("Manager already exists");
    }

    public final void close() {
        C59071e eVar = f268622a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoClassicManager");
        ((C59052c) ((C59052c) b).mo56372aa(15731)).mo56386p("close");
        if (this.f268637p) {
            C59104x d = eVar.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoClassicManager");
            ((C59052c) ((C59052c) d).mo56372aa(15733)).mo56386p("Already destroyed");
            return;
        }
        this.f268637p = true;
        this.f268630i.clear();
        this.f268631j.clear();
        this.f268625d.mo83379U(this);
        BroadcastReceiver broadcastReceiver = this.f268629h;
        if (broadcastReceiver != null) {
            this.f268629h = null;
            this.f268627f.unregisterReceiver(broadcastReceiver);
        }
        this.f268626e.mo83475u(this);
    }

    /* renamed from: d */
    public final void mo89862d(Intent intent, String str) {
        C124548d b;
        if (str == null) {
            C59104x c = f268622a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoClassicManager");
            ((C59052c) ((C59052c) c).mo56372aa(15737)).mo56389s("Null device ID in intent with action: %s", intent.getAction());
            return;
        }
        C59071e eVar = f268622a;
        C59104x b2 = eVar.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "BistoClassicManager");
        ((C59052c) ((C59052c) b2).mo56372aa(15734)).mo56354G("forwardIntentToDeviceManager %s %s", intent, str);
        if (this.f268630i.containsKey(str)) {
            C95950t tVar = (C95950t) this.f268630i.get(str);
            tVar.getClass();
            tVar.mo89892p(intent);
        } else if (this.f268631j.containsKey(str)) {
            C95950t tVar2 = (C95950t) this.f268631j.get(str);
            tVar2.getClass();
            this.f268630i.put(str, tVar2);
            tVar2.mo89892p(intent);
        } else {
            C95355bf a = this.f268624c.mo89297a(str);
            if (a == null) {
                C59104x c2 = eVar.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "BistoClassicManager");
                ((C59052c) ((C59052c) c2).mo56372aa(15736)).mo56389s("bistoDevice not found for %s", str);
            } else if (!(a instanceof C95346ax)) {
                C59104x b3 = eVar.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "BistoClassicManager");
                ((C59052c) ((C59052c) b3).mo56372aa(15735)).mo56386p("forwardIntentToDeviceManager: Not a BistoClassicDevice; ignoring");
            } else {
                if (!"ACTION_OOBE_STATUS_UPDATED".equals(intent.getAction()) && (b = this.f268625d.mo83401b(str)) != null && b.mo106520r().equals(C124633az.OOBE_IN_PROGRESS)) {
                    this.f268625d.mo83394aj(str, (C124636bb) null, C124633az.OOBE_NOT_FINISHED);
                }
                mo89860c((C95346ax) a);
                C95950t tVar3 = (C95950t) this.f268630i.get(str);
                tVar3.getClass();
                tVar3.mo89892p(intent);
            }
        }
    }

    /* renamed from: e */
    public final void mo89863e() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268630i.keySet();
        this.f268631j.keySet();
        ((C96019bo) this.f268633l.mo27525b()).mo88558f(this, !this.f268630i.isEmpty());
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        C95950t tVar = (C95950t) this.f268630i.get(str);
        if (tVar != null) {
            tVar.mo17874fW(str, set, j, dVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e5, code lost:
        r2 = r9.f268636o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01e9, code lost:
        if (r2.f266874d == null) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01eb, code lost:
        r3 = r10.getAction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01ef, code lost:
        if (r3 == null) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01f1, code lost:
        r2 = r2.f266874d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01f3, code lost:
        if (r2 == null) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01f5, code lost:
        r2.copyOnWrite();
        r2 = (com.google.common.p4552o.C60290nc) r2.instance;
        r6 = com.google.common.p4552o.C60290nc.f163102j;
        r6 = r2.f163111h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0204, code lost:
        if (r6.mo58948c() != false) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0206, code lost:
        r2.f163111h = com.google.protobuf.C62942bv.mutableCopy(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x020c, code lost:
        r2.f163111h.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0211, code lost:
        r2 = f268622a;
        r3 = r2.mo56224b();
        r3.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "BistoClassicManager");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(15742)).mo56389s("Intent with Bluetooth Device: %s", r10.getAction());
        r1 = (android.bluetooth.BluetoothDevice) r10.getParcelableExtra("extra_device");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x022d, code lost:
        if (r1 != null) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x022f, code lost:
        r10 = r2.mo56225c();
        r10.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "BistoClassicManager");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(15743)).mo56389s("Null bluetooth device. Action: %s", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0241, code lost:
        r3 = new com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124539a(r1);
        r9.f268624c.mo89302e(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x024f, code lost:
        if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(r0) == false) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0251, code lost:
        r0 = r9.f268625d.mo83401b(r3.f343619a.getAddress());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x025d, code lost:
        if (r0 == null) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0269, code lost:
        if (r0.mo106513k().equals(com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q.CAR_ACCESSORY) == false) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0275, code lost:
        if (r0.mo106508g().equals(com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124707e.INPUT_ONLY_MODE) != false) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0278, code lost:
        r0 = r2.mo56224b();
        r0.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "BistoClassicManager");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(15730)).mo56386p("Not canceling OOBE notification");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0289, code lost:
        r0 = r2.mo56224b();
        r0.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "BistoClassicManager");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(15729)).mo56386p("Cancel OOBE notification");
        ((com.google.android.apps.gsa.staticplugins.bisto.p7530v.C96511d) r9.f268634m.mo27525b()).mo90198a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02a4, code lost:
        mo89862d(r10, r3.f343619a.getAddress());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x034a, code lost:
        mo89863e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89864h(android.content.Intent r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.getAction()
            java.lang.String r1 = "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED"
            boolean r2 = r1.equals(r0)
            r3 = -1
            java.lang.String r4 = "BistoClassicManager"
            if (r2 == 0) goto L_0x0030
            com.google.common.f.e r2 = f268622a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r5, r4)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            r5 = 15747(0x3d83, float:2.2066E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r5)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            java.lang.String r5 = "android.bluetooth.profile.extra.STATE"
            int r5 = r10.getIntExtra(r5, r3)
            java.lang.String r6 = "handleIntent. Action: %s; state: %d"
            r2.mo56352E(r6, r0, r5)
            goto L_0x0042
        L_0x0030:
            com.google.common.f.e r2 = f268622a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r5, r4)
            java.lang.String r5 = "handleIntent. Action: %s"
            r6 = 15738(0x3d7a, float:2.2054E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r6)).mo56389s(r5, r0)
        L_0x0042:
            boolean r2 = r9.f268637p
            if (r2 == 0) goto L_0x0059
            com.google.common.f.e r10 = f268622a
            com.google.common.f.x r10 = r10.mo56224b()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r0, r4)
            java.lang.String r0 = "Already destroyed"
            r1 = 15746(0x3d82, float:2.2065E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x0059:
            boolean r2 = com.google.android.apps.gsa.shared.bisto.p7029b.C89636g.m145898d(r10)
            if (r2 != 0) goto L_0x034d
            boolean r2 = com.google.android.apps.gsa.shared.bisto.p7029b.C89636g.m145899e(r10)
            if (r2 == 0) goto L_0x0067
            goto L_0x034d
        L_0x0067:
            if (r0 != 0) goto L_0x007c
            com.google.common.f.e r10 = f268622a
            com.google.common.f.x r10 = r10.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r0, r4)
            java.lang.String r0 = "Null action"
            r1 = 15745(0x3d81, float:2.2063E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x007c:
            int r2 = r0.hashCode()
            java.lang.String r5 = "android.bluetooth.device.action.ACL_DISCONNECTED"
            switch(r2) {
                case -2113195485: goto L_0x01b6;
                case -2065884028: goto L_0x01ab;
                case -1712754119: goto L_0x01a0;
                case -1530327060: goto L_0x0196;
                case -1500049779: goto L_0x018b;
                case -809239175: goto L_0x0180;
                case -535726315: goto L_0x0176;
                case -431663615: goto L_0x016b;
                case -377527494: goto L_0x0160;
                case -301431627: goto L_0x0155;
                case 94921639: goto L_0x014a;
                case 96950450: goto L_0x013e;
                case 116758212: goto L_0x0133;
                case 503336736: goto L_0x0127;
                case 823930323: goto L_0x011b;
                case 885046164: goto L_0x010f;
                case 938251674: goto L_0x0103;
                case 1153536495: goto L_0x00f7;
                case 1244161670: goto L_0x00ed;
                case 1248865515: goto L_0x00e2;
                case 1383482656: goto L_0x00d7;
                case 1542040334: goto L_0x00cb;
                case 1711845651: goto L_0x00bf;
                case 1821585647: goto L_0x00b5;
                case 1852199315: goto L_0x00aa;
                case 1854535521: goto L_0x009e;
                case 1931599820: goto L_0x0093;
                case 2116862345: goto L_0x0087;
                default: goto L_0x0085;
            }
        L_0x0085:
            goto L_0x01c0
        L_0x0087:
            java.lang.String r1 = "android.bluetooth.device.action.BOND_STATE_CHANGED"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 27
            goto L_0x01c0
        L_0x0093:
            java.lang.String r1 = "com.google.android.apps.gsa.shared.bisto.ACTION_DEVICE_BOOT_OR_APP_INSTALL"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 5
            goto L_0x01c0
        L_0x009e:
            java.lang.String r1 = "ACTION_OOBE_STATUS_UPDATED"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 21
            goto L_0x01c0
        L_0x00aa:
            java.lang.String r1 = "action_ota"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 7
            goto L_0x01c0
        L_0x00b5:
            boolean r1 = r0.equals(r5)
            if (r1 == 0) goto L_0x01c0
            r3 = 23
            goto L_0x01c0
        L_0x00bf:
            java.lang.String r1 = "bisto_apply_ota"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 12
            goto L_0x01c0
        L_0x00cb:
            java.lang.String r1 = "bisto_enable_audio_output"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 8
            goto L_0x01c0
        L_0x00d7:
            java.lang.String r1 = "enable_mini_dump"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 1
            goto L_0x01c0
        L_0x00e2:
            java.lang.String r1 = "android.intent.action.DOWNLOAD_COMPLETE"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 4
            goto L_0x01c0
        L_0x00ed:
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 26
            goto L_0x01c0
        L_0x00f7:
            java.lang.String r1 = "com.google.android.apps.gsa.bisto.ART_CLOSE_MIC"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 19
            goto L_0x01c0
        L_0x0103:
            java.lang.String r1 = "bisto_set_headphones_enable_state"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 10
            goto L_0x01c0
        L_0x010f:
            java.lang.String r1 = "action_set_hotword_setting_state"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 15
            goto L_0x01c0
        L_0x011b:
            java.lang.String r1 = "action_stop_audio_testing"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 17
            goto L_0x01c0
        L_0x0127:
            java.lang.String r1 = "action_activate_dsp_hotword_model"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 13
            goto L_0x01c0
        L_0x0133:
            java.lang.String r1 = "action_abort_ota"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 6
            goto L_0x01c0
        L_0x013e:
            java.lang.String r1 = "com.google.android.apps.gsa.shared.bisto.ACTION_RECONNECT_INPUT_ONLY_MODE"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 25
            goto L_0x01c0
        L_0x014a:
            java.lang.String r1 = "crash"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 3
            goto L_0x01c0
        L_0x0155:
            java.lang.String r1 = "android.bluetooth.device.action.ACL_CONNECTED"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 22
            goto L_0x01c0
        L_0x0160:
            java.lang.String r1 = "android.bluetooth.device.action.UUID"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 24
            goto L_0x01c0
        L_0x016b:
            java.lang.String r1 = "action_start_audio_testing"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 16
            goto L_0x01c0
        L_0x0176:
            java.lang.String r1 = "trigger_mini_dump"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 2
            goto L_0x01c0
        L_0x0180:
            java.lang.String r1 = "bisto_enter_pairing_mode"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 9
            goto L_0x01c0
        L_0x018b:
            java.lang.String r1 = "bisto_force_role_change"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 11
            goto L_0x01c0
        L_0x0196:
            java.lang.String r1 = "android.bluetooth.adapter.action.STATE_CHANGED"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 0
            goto L_0x01c0
        L_0x01a0:
            java.lang.String r1 = "bisto.QUERY_DEVICE_INFO"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 20
            goto L_0x01c0
        L_0x01ab:
            java.lang.String r1 = "proxy_hotword_notification"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 14
            goto L_0x01c0
        L_0x01b6:
            java.lang.String r1 = "com.google.android.apps.gsa.bisto.ART_OPEN_MIC"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c0
            r3 = 18
        L_0x01c0:
            java.lang.String r1 = "extra_device"
            java.lang.String r2 = "key_device_id"
            switch(r3) {
                case 0: goto L_0x0332;
                case 1: goto L_0x0332;
                case 2: goto L_0x0332;
                case 3: goto L_0x0332;
                case 4: goto L_0x02f8;
                case 5: goto L_0x02e9;
                case 6: goto L_0x02c3;
                case 7: goto L_0x02c3;
                case 8: goto L_0x02ba;
                case 9: goto L_0x02ba;
                case 10: goto L_0x02ba;
                case 11: goto L_0x02ba;
                case 12: goto L_0x02ba;
                case 13: goto L_0x02ba;
                case 14: goto L_0x02ba;
                case 15: goto L_0x02ba;
                case 16: goto L_0x02af;
                case 17: goto L_0x02af;
                case 18: goto L_0x02af;
                case 19: goto L_0x02af;
                case 20: goto L_0x01c9;
                case 21: goto L_0x01c9;
                case 22: goto L_0x01e5;
                case 23: goto L_0x01e5;
                case 24: goto L_0x0211;
                case 25: goto L_0x0211;
                case 26: goto L_0x0211;
                case 27: goto L_0x0211;
                default: goto L_0x01c7;
            }
        L_0x01c7:
            goto L_0x034a
        L_0x01c9:
            android.os.Parcelable r2 = r10.getParcelableExtra(r1)
            android.bluetooth.BluetoothDevice r2 = (android.bluetooth.BluetoothDevice) r2
            if (r2 != 0) goto L_0x01e5
            com.google.common.f.e r10 = f268622a
            com.google.common.f.x r10 = r10.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r1, r4)
            java.lang.String r1 = "Null BluetoothDevice. Action: %s"
            r2 = 15744(0x3d80, float:2.2062E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r2)).mo56389s(r1, r0)
            goto L_0x034a
        L_0x01e5:
            com.google.android.apps.gsa.staticplugins.bisto.g.bx r2 = r9.f268636o
            com.google.common.o.mz r3 = r2.f266874d
            if (r3 == 0) goto L_0x0211
            java.lang.String r3 = r10.getAction()
            if (r3 == 0) goto L_0x0211
            com.google.common.o.mz r2 = r2.f266874d
            if (r2 == 0) goto L_0x0211
            r2.copyOnWrite()
            com.google.protobuf.bv r2 = r2.instance
            com.google.common.o.nc r2 = (com.google.common.p4552o.C60290nc) r2
            com.google.common.o.nc r6 = com.google.common.p4552o.C60290nc.f163102j
            com.google.protobuf.cq r6 = r2.f163111h
            boolean r7 = r6.mo58948c()
            if (r7 != 0) goto L_0x020c
            com.google.protobuf.cq r6 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r6)
            r2.f163111h = r6
        L_0x020c:
            com.google.protobuf.cq r2 = r2.f163111h
            r2.add(r3)
        L_0x0211:
            com.google.common.f.e r2 = f268622a
            com.google.common.f.x r3 = r2.mo56224b()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r6, r4)
            java.lang.String r6 = r10.getAction()
            r7 = 15742(0x3d7e, float:2.2059E-41)
            java.lang.String r8 = "Intent with Bluetooth Device: %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r7)).mo56389s(r8, r6)
            android.os.Parcelable r1 = r10.getParcelableExtra(r1)
            android.bluetooth.BluetoothDevice r1 = (android.bluetooth.BluetoothDevice) r1
            if (r1 != 0) goto L_0x0241
            com.google.common.f.x r10 = r2.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r1, r4)
            java.lang.String r1 = "Null bluetooth device. Action: %s"
            r2 = 15743(0x3d7f, float:2.206E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r2)).mo56389s(r1, r0)
            goto L_0x034a
        L_0x0241:
            com.google.android.apps.search.assistant.surfaces.bisto.c.a.a r3 = new com.google.android.apps.search.assistant.surfaces.bisto.c.a.a
            r3.<init>(r1)
            com.google.android.apps.gsa.staticplugins.bisto.g.bi r1 = r9.f268624c
            r1.mo89302e(r3)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x02a4
            android.bluetooth.BluetoothDevice r0 = r3.f343619a
            java.lang.String r0 = r0.getAddress()
            com.google.android.apps.gsa.shared.bisto.a.cd r1 = r9.f268625d
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r0 = r1.mo83401b(r0)
            if (r0 == 0) goto L_0x0289
            com.google.android.apps.search.assistant.surfaces.bisto.d.q r1 = r0.mo106513k()
            com.google.android.apps.search.assistant.surfaces.bisto.d.q r5 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q.CAR_ACCESSORY
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0289
            com.google.android.apps.search.assistant.surfaces.bisto.d.e r0 = r0.mo106508g()
            com.google.android.apps.search.assistant.surfaces.bisto.d.e r1 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124707e.INPUT_ONLY_MODE
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0278
            goto L_0x0289
        L_0x0278:
            com.google.common.f.x r0 = r2.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r4)
            java.lang.String r1 = "Not canceling OOBE notification"
            r2 = 15730(0x3d72, float:2.2042E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            goto L_0x02a4
        L_0x0289:
            com.google.common.f.x r0 = r2.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r4)
            java.lang.String r1 = "Cancel OOBE notification"
            r2 = 15729(0x3d71, float:2.2041E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            dagger.a r0 = r9.f268634m
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.bisto.v.d r0 = (com.google.android.apps.gsa.staticplugins.bisto.p7530v.C96511d) r0
            r0.mo90198a()
        L_0x02a4:
            android.bluetooth.BluetoothDevice r0 = r3.f343619a
            java.lang.String r0 = r0.getAddress()
            r9.mo89862d(r10, r0)
            goto L_0x034a
        L_0x02af:
            java.lang.String r0 = "extra_device_id"
            java.lang.String r0 = r10.getStringExtra(r0)
            r9.mo89862d(r10, r0)
            goto L_0x034a
        L_0x02ba:
            java.lang.String r0 = r10.getStringExtra(r2)
            r9.mo89862d(r10, r0)
            goto L_0x034a
        L_0x02c3:
            boolean r0 = r10.hasExtra(r2)
            if (r0 != 0) goto L_0x02e1
            java.util.Collection r0 = r9.m159097g()
            java.util.Iterator r0 = r0.iterator()
        L_0x02d1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x034a
            java.lang.Object r1 = r0.next()
            com.google.android.apps.gsa.staticplugins.bisto.u.b.bq r1 = (com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96021bq) r1
            r1.mo89892p(r10)
            goto L_0x02d1
        L_0x02e1:
            java.lang.String r0 = r10.getStringExtra(r2)
            r9.mo89862d(r10, r0)
            goto L_0x034a
        L_0x02e9:
            com.google.common.util.concurrent.cx r0 = r9.m159096f()
            com.google.android.apps.gsa.staticplugins.bisto.u.b.a.c r1 = new com.google.android.apps.gsa.staticplugins.bisto.u.b.a.c
            r1.<init>(r9, r10)
            java.util.concurrent.Executor r10 = r9.f268623b
            com.google.common.util.concurrent.C60856cj.m92911t(r0, r1, r10)
            goto L_0x034a
        L_0x02f8:
            java.lang.String r0 = "extra_download_id"
            boolean r1 = r10.hasExtra(r0)
            java.lang.String r2 = "No download ID"
            if (r1 != 0) goto L_0x0313
            com.google.common.f.e r10 = f268622a
            com.google.common.f.x r10 = r10.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r0, r4)
            r0 = 15741(0x3d7d, float:2.2058E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r0)).mo56386p(r2)
            goto L_0x034a
        L_0x0313:
            r5 = -1
            long r0 = r10.getLongExtra(r0, r5)
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x032e
            com.google.common.f.e r10 = f268622a
            com.google.common.f.x r10 = r10.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r0, r4)
            r0 = 15740(0x3d7c, float:2.2056E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r0)).mo56386p(r2)
            goto L_0x034a
        L_0x032e:
            r9.m159098i(r0)
            goto L_0x034a
        L_0x0332:
            java.util.Collection r0 = r9.m159097g()
            java.util.Iterator r0 = r0.iterator()
        L_0x033a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x034a
            java.lang.Object r1 = r0.next()
            com.google.android.apps.gsa.staticplugins.bisto.u.b.bq r1 = (com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96021bq) r1
            r1.mo89892p(r10)
            goto L_0x033a
        L_0x034a:
            r9.mo89863e()
        L_0x034d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.C95937g.mo89864h(android.content.Intent):void");
    }

    /* renamed from: m */
    public final void mo89865m() {
        C59104x b = f268622a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoClassicManager");
        ((C59052c) ((C59052c) b).mo56372aa(15753)).mo56386p("reInitAfterCrash");
        if (!this.f268637p) {
            C60856cj.m92911t(m159096f(), new C95934d(this), this.f268623b);
        }
    }
}
