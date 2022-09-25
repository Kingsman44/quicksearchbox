package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.C90730an;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C50121li;
import com.google.common.base.C58831av;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ar */
/* compiled from: PG */
public final class C108556ar {

    /* renamed from: a */
    public static final C59071e f301993a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ar");

    /* renamed from: b */
    final Set f301994b = new HashSet();

    /* renamed from: c */
    public final Set f301995c = new HashSet();

    /* renamed from: d */
    public final C22871g f301996d;

    /* renamed from: e */
    public final C22871g f301997e;

    /* renamed from: f */
    public final C86124t f301998f;

    /* renamed from: g */
    public final AtomicReference f301999g = new AtomicReference((Object) null);

    /* renamed from: h */
    public final C69464a f302000h;

    /* renamed from: i */
    public final Context f302001i;

    /* renamed from: j */
    public final String f302002j;

    /* renamed from: k */
    public boolean f302003k = false;

    /* renamed from: l */
    public C108741i f302004l;

    /* renamed from: m */
    public List f302005m;

    /* renamed from: n */
    public C50121li f302006n;

    public C108556ar(Context context, C22871g gVar, C22871g gVar2, C86124t tVar, String str, C69464a aVar) {
        this.f301996d = gVar;
        this.f301997e = gVar2;
        this.f301998f = tVar;
        this.f302002j = str;
        this.f302001i = context;
        C59104x b = f301993a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "DeviceDiscoveryCtrl");
        ((C59052c) ((C59052c) b).mo56372aa(24130)).mo56386p("Using GmsCore mDNS");
        this.f302000h = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x023a A[SYNTHETIC, Splitter:B:97:0x023a] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Set m180496d(java.util.List r17, java.lang.String r18, java.lang.Iterable r19, boolean r20) {
        /*
            r1 = r17
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Iterator r3 = r19.iterator()
        L_0x000b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02a8
            java.lang.Object r0 = r3.next()
            com.google.android.gms.mdns.MdnsServiceInfo r0 = (com.google.android.gms.mdns.MdnsServiceInfo) r0
            java.util.Map r4 = r0.mo120610a()
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.j r5 = new com.google.android.apps.gsa.staticplugins.opa.deviceregistration.j
            r5.<init>()
            r6 = 0
            r5.mo97095g(r6)
            java.lang.String r7 = "su"
            boolean r8 = r4.containsKey(r7)
            r9 = 0
            if (r8 == 0) goto L_0x003f
            java.lang.Object r7 = r4.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            int r7 = java.lang.Integer.parseInt(r7)
            if (r20 != 0) goto L_0x003f
            if (r7 <= 0) goto L_0x003f
            r7 = r18
            goto L_0x0222
        L_0x003f:
            java.lang.String r7 = "gi"
            boolean r8 = r4.containsKey(r7)
            if (r8 == 0) goto L_0x0050
            java.lang.Object r7 = r4.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            r5.f302389a = r7
            goto L_0x0051
        L_0x0050:
            r7 = r9
        L_0x0051:
            java.lang.String r8 = "3i"
            boolean r10 = r4.containsKey(r8)
            if (r10 == 0) goto L_0x0062
            java.lang.Object r8 = r4.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            r5.f302390b = r8
            goto L_0x0070
        L_0x0062:
            com.google.common.f.e r8 = com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108741i.f302388a
            com.google.common.f.x r8 = r8.mo56225c()
            java.lang.String r10 = "Can't find device id"
            r11 = 24098(0x5e22, float:3.3768E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r11)).mo56386p(r10)
            r8 = r9
        L_0x0070:
            java.lang.String r10 = "up"
            boolean r11 = r4.containsKey(r10)
            if (r11 == 0) goto L_0x0080
            java.lang.Object r10 = r4.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r5.f302392d = r10
        L_0x0080:
            java.lang.String r10 = "3n"
            boolean r11 = r4.containsKey(r10)
            if (r11 == 0) goto L_0x0090
            java.lang.Object r10 = r4.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r5.f302393e = r10
        L_0x0090:
            java.lang.String r10 = "ci"
            boolean r11 = r4.containsKey(r10)
            if (r11 == 0) goto L_0x0213
            java.lang.Object r10 = r4.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x020b
            r5.f302396h = r10
            java.lang.String r10 = "3m"
            boolean r11 = r4.containsKey(r10)
            if (r11 == 0) goto L_0x01fb
            java.lang.Object r10 = r4.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x01f3
            r5.f302397i = r10
            java.lang.String r10 = "cf"
            boolean r11 = r4.containsKey(r10)
            if (r11 == 0) goto L_0x01e3
            java.lang.Object r10 = r4.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x01db
            r5.f302398j = r10
            java.lang.String r10 = "mu"
            boolean r11 = r4.containsKey(r10)
            if (r11 == 0) goto L_0x00dd
            java.lang.Object r4 = r4.get(r10)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r10 = "1"
            boolean r4 = r4.equals(r10)
            r5.mo97095g(r4)
        L_0x00dd:
            boolean r4 = com.google.common.base.C58837ba.m90859h(r18)
            if (r4 != 0) goto L_0x01d4
            boolean r4 = com.google.common.base.C58837ba.m90859h(r8)
            if (r4 != 0) goto L_0x01d4
            if (r7 == 0) goto L_0x01c4
            if (r1 != 0) goto L_0x00f2
            r7 = r18
        L_0x00ef:
            r13 = r9
            goto L_0x0180
        L_0x00f2:
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.g r4 = new com.google.android.apps.gsa.staticplugins.opa.deviceregistration.g
            r7 = r18
            r4.<init>(r7)
            java.lang.Iterable r4 = com.google.common.p4522b.C58557jl.m90124e(r1, r4)
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89841i(r4)
            int r10 = r4.size()
            r11 = 0
        L_0x0106:
            java.lang.String r12 = "_dev"
            if (r11 >= r10) goto L_0x0130
            java.lang.Object r13 = r4.get(r11)
            com.google.assistant.at.ng r13 = (com.google.assistant.p3861at.C50173ng) r13
            int r11 = r11 + 1
            java.lang.String r14 = r13.f130423c
            boolean r14 = android.text.TextUtils.equals(r14, r8)
            if (r14 == 0) goto L_0x0106
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108741i.f302388a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            r10 = 24111(0x5e2f, float:3.3787E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r10)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            java.lang.String r10 = "Found foreign ID match %s %s"
            r4.mo56354G(r10, r12, r8)
            goto L_0x0180
        L_0x0130:
            int r10 = r4.size()
            r11 = 0
        L_0x0135:
            if (r11 >= r10) goto L_0x016f
            java.lang.Object r13 = r4.get(r11)
            com.google.assistant.at.ng r13 = (com.google.assistant.p3861at.C50173ng) r13
            com.google.protobuf.cq r14 = r13.f130430j
            java.util.Iterator r14 = r14.iterator()
        L_0x0143:
            int r15 = r11 + 1
            boolean r16 = r14.hasNext()
            if (r16 == 0) goto L_0x016d
            java.lang.Object r15 = r14.next()
            java.lang.String r15 = (java.lang.String) r15
            boolean r15 = android.text.TextUtils.equals(r15, r8)
            if (r15 == 0) goto L_0x0143
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108741i.f302388a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            r10 = 24110(0x5e2e, float:3.3785E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r10)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            java.lang.String r10 = "Found other_device_id match %s %s"
            r4.mo56354G(r10, r12, r8)
            goto L_0x0180
        L_0x016d:
            r11 = r15
            goto L_0x0135
        L_0x016f:
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x00ef
            r4 = 12
            com.google.common.o.uf r4 = com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108607cg.m180627a(r4)
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r4, r9, r9, r9)
            goto L_0x00ef
        L_0x0180:
            if (r13 == 0) goto L_0x01c0
            int r4 = r13.f130421a
            r4 = r4 & 1
            if (r4 == 0) goto L_0x018c
            java.lang.String r4 = r13.f130422b
            r5.f302391c = r4
        L_0x018c:
            com.google.protobuf.cq r4 = r13.f130424d
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x019f
            com.google.protobuf.cq r4 = r13.f130424d
            java.lang.Object r4 = r4.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            r5.f302393e = r4
            goto L_0x01a9
        L_0x019f:
            int r4 = r13.f130421a
            r4 = r4 & 8
            if (r4 == 0) goto L_0x01a9
            java.lang.String r4 = r13.f130425e
            r5.f302393e = r4
        L_0x01a9:
            int r4 = r13.f130421a
            r6 = r4 & 8
            if (r6 == 0) goto L_0x01b3
            java.lang.String r6 = r13.f130425e
            r5.f302394f = r6
        L_0x01b3:
            r4 = r4 & 16
            if (r4 == 0) goto L_0x01bb
            java.lang.String r4 = r13.f130426f
            r5.f302395g = r4
        L_0x01bb:
            java.lang.String r4 = r13.f130423c
            r5.f302390b = r4
            goto L_0x01d6
        L_0x01c0:
            r5.mo97089a()
            goto L_0x0222
        L_0x01c4:
            r7 = r18
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108741i.f302388a
            com.google.common.f.x r4 = r4.mo56224b()
            java.lang.String r5 = "Skip gRPC device since it's not a HA device."
            r6 = 24108(0x5e2c, float:3.3783E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r6)).mo56386p(r5)
            goto L_0x0222
        L_0x01d4:
            r7 = r18
        L_0x01d6:
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.i r9 = r5.mo97089a()
            goto L_0x0222
        L_0x01db:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null certificate"
            r0.<init>(r1)
            throw r0
        L_0x01e3:
            r7 = r18
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108741i.f302388a
            com.google.common.f.x r4 = r4.mo56225c()
            java.lang.String r5 = "Can't find certificate"
            r6 = 24103(0x5e27, float:3.3775E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r6)).mo56386p(r5)
            goto L_0x0222
        L_0x01f3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null deviceModelId"
            r0.<init>(r1)
            throw r0
        L_0x01fb:
            r7 = r18
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108741i.f302388a
            com.google.common.f.x r4 = r4.mo56225c()
            java.lang.String r5 = "Can't find device model id"
            r6 = 24102(0x5e26, float:3.3774E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r6)).mo56386p(r5)
            goto L_0x0222
        L_0x020b:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null clientId"
            r0.<init>(r1)
            throw r0
        L_0x0213:
            r7 = r18
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108741i.f302388a
            com.google.common.f.x r4 = r4.mo56225c()
            java.lang.String r5 = "Can't find client id"
            r6 = 24101(0x5e25, float:3.3773E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r6)).mo56386p(r5)
        L_0x0222:
            java.lang.String r4 = "DeviceDiscoveryCtrl"
            if (r9 != 0) goto L_0x023a
            com.google.common.f.e r0 = f301993a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r5, r4)
            java.lang.String r4 = "Device info invalid"
            r5 = 24129(0x5e41, float:3.3812E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r4)
            goto L_0x000b
        L_0x023a:
            boolean r5 = r9.mo97113q()     // Catch:{ UnknownHostException -> 0x028f }
            if (r5 == 0) goto L_0x026c
            java.lang.String r5 = r0.f392173h     // Catch:{ UnknownHostException -> 0x028f }
            if (r5 == 0) goto L_0x026c
            java.net.InetAddress r5 = java.net.InetAddress.getByName(r5)     // Catch:{ UnknownHostException -> 0x028f }
            boolean r5 = r5.isLinkLocalAddress()     // Catch:{ UnknownHostException -> 0x028f }
            if (r5 == 0) goto L_0x026c
            com.google.common.f.e r5 = f301993a     // Catch:{ UnknownHostException -> 0x028f }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ UnknownHostException -> 0x028f }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ UnknownHostException -> 0x028f }
            r5.mo56378ag(r6, r4)     // Catch:{ UnknownHostException -> 0x028f }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ UnknownHostException -> 0x028f }
            r6 = 24128(0x5e40, float:3.381E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r6)     // Catch:{ UnknownHostException -> 0x028f }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ UnknownHostException -> 0x028f }
            java.lang.String r6 = "Ignoring link-local IPv6 address: %s"
            java.lang.String r0 = r0.f392173h     // Catch:{ UnknownHostException -> 0x028f }
            r5.mo56389s(r6, r0)     // Catch:{ UnknownHostException -> 0x028f }
            goto L_0x000b
        L_0x026c:
            java.lang.String r5 = r0.f392172g     // Catch:{ UnknownHostException -> 0x028f }
            if (r5 != 0) goto L_0x0272
            java.lang.String r5 = r0.f392173h     // Catch:{ UnknownHostException -> 0x028f }
        L_0x0272:
            java.net.InetAddress r5 = java.net.InetAddress.getByName(r5)     // Catch:{ UnknownHostException -> 0x028f }
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.h r6 = r9.mo97098a()     // Catch:{ UnknownHostException -> 0x028f }
            r6.mo97093e(r5)     // Catch:{ UnknownHostException -> 0x028f }
            int r0 = r0.f392171f     // Catch:{ UnknownHostException -> 0x028f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ UnknownHostException -> 0x028f }
            r6.mo97094f(r0)     // Catch:{ UnknownHostException -> 0x028f }
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.i r9 = r6.mo97089a()     // Catch:{ UnknownHostException -> 0x028f }
            r2.add(r9)     // Catch:{ UnknownHostException -> 0x028f }
            goto L_0x000b
        L_0x028f:
            r0 = move-exception
            com.google.common.f.e r5 = f301993a
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r6, r4)
            java.lang.String r4 = r9.mo97105h()
            r6 = 24127(0x5e3f, float:3.3809E-41)
            java.lang.String r8 = "Invalid IP address from mDNS skip device %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r0)).mo56372aa(r6)).mo56389s(r8, r4)
            goto L_0x000b
        L_0x02a8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108556ar.m180496d(java.util.List, java.lang.String, java.lang.Iterable, boolean):java.util.Set");
    }

    /* renamed from: a */
    public final int mo96982a() {
        return this.f301994b.size();
    }

    /* renamed from: b */
    public final C49875cf mo96983b() {
        C108741i iVar = this.f302004l;
        if (iVar == null) {
            return C49875cf.UNKNOWN;
        }
        return (C49875cf) C58831av.m90830c(iVar.mo97099b(), C49875cf.UNKNOWN);
    }

    /* renamed from: c */
    public final C58833ax mo96984c() {
        C108741i iVar = this.f302004l;
        if (iVar == null) {
            return C58836b.f156633a;
        }
        return C90730an.m148189b(C58833ax.m90833j(iVar.mo97101d()), C58833ax.m90833j(iVar.mo97109m()));
    }
}
