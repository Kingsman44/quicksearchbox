package com.google.android.apps.gsa.staticplugins.opa.appintegration.p8294b;

import android.content.Context;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.shared.az;
import com.google.android.apps.gsa.assistant.shared.bd;
import com.google.android.apps.gsa.assistant.shared.d;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.staticplugins.opa.p8363f.C109029a;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1073a.C14638a;
import com.google.android.libraries.assistant.p1467d.p1471b.C17825k;
import com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17845h;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17902d;
import com.google.android.libraries.gcoreclient.p1763h.p1769c.C21560e;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.Iterator;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.b.c */
/* compiled from: PG */
public final class C107332c extends C17845h {

    /* renamed from: a */
    private static final C59071e f298683a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.appintegration.b.c");

    /* renamed from: b */
    private final C58833ax f298684b;

    /* renamed from: c */
    private final Context f298685c;

    /* renamed from: d */
    private final C68214a f298686d;

    /* renamed from: e */
    private final C68214a f298687e;

    /* renamed from: f */
    private final C68214a f298688f;

    /* renamed from: g */
    private final bd f298689g;

    /* renamed from: h */
    private final d f298690h;

    /* renamed from: i */
    private final C68214a f298691i;

    /* renamed from: j */
    private final C69464a f298692j;

    /* renamed from: k */
    private final az f298693k;

    /* renamed from: l */
    private final C86054o f298694l;

    /* renamed from: m */
    private final C58833ax f298695m;

    /* renamed from: n */
    private final C58833ax f298696n;

    /* renamed from: o */
    private final C68214a f298697o;

    /* renamed from: p */
    private final C14638a f298698p;

    /* renamed from: q */
    private final C109029a f298699q;

    public C107332c(C58833ax axVar, Context context, C68214a aVar, C68214a aVar2, bd bdVar, d dVar, C68214a aVar3, C69464a aVar4, az azVar, C86054o oVar, C109029a aVar5, C58833ax axVar2, C58833ax axVar3, C68214a aVar6, C68214a aVar7, C14638a aVar8) {
        this.f298684b = axVar;
        this.f298685c = context;
        this.f298686d = aVar;
        this.f298688f = aVar2;
        this.f298689g = bdVar;
        this.f298690h = dVar;
        this.f298691i = aVar3;
        this.f298692j = aVar4;
        this.f298693k = azVar;
        this.f298694l = oVar;
        this.f298699q = aVar5;
        this.f298695m = axVar2;
        this.f298696n = axVar3;
        this.f298687e = aVar6;
        this.f298697o = aVar7;
        this.f298698p = aVar8;
    }

    /* renamed from: d */
    private final void m178172d(String str) {
        if (!TextUtils.isEmpty(str) && this.f298690h.a().mo3842a() == null) {
            C58976aa aaVar = C58975e.f156826a;
            this.f298690h.e(str);
        }
    }

    /* renamed from: e */
    private final void m178173e(C17825k kVar) {
        C58976aa aaVar = C58975e.f156826a;
        kVar.name();
        if (kVar != this.f298690h.d().mo3842a()) {
            this.f298690h.h(kVar);
        }
    }

    /* renamed from: f */
    private final boolean m178174f(String str) {
        this.f298685c.getPackageManager();
        return ((C21560e) this.f298692j.mo17428b()).f59951a.mo119084c(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x032a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23480a(byte[] r21) {
        /*
            r20 = this;
            r1 = r20
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r0 = getCallingUid()
            int r2 = android.os.Process.myUid()
            java.lang.String r3 = "IAppIntegrationService"
            if (r0 != r2) goto L_0x068e
            com.google.protobuf.ba r0 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x067b }
            com.google.android.libraries.assistant.d.c.c.am r2 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17883am.f51242f     // Catch:{ ct -> 0x067b }
            r4 = r21
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r2, (byte[]) r4, (com.google.protobuf.C62921ba) r0)     // Catch:{ ct -> 0x067b }
            r2 = r0
            com.google.android.libraries.assistant.d.c.c.am r2 = (com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17883am) r2     // Catch:{ ct -> 0x067b }
            com.google.protobuf.cq r0 = r2.f51248e
            int r0 = r0.size()
            if (r0 == 0) goto L_0x002c
            com.google.protobuf.cq r0 = r2.f51248e
            r1.mo95912c(r0)
        L_0x002c:
            int r0 = r2.f51244a
            r4 = 1
            r0 = r0 & r4
            if (r0 == 0) goto L_0x0668
            java.lang.String r5 = r2.f51247d
            int r0 = r2.f51245b
            r10 = 3
            if (r0 != r10) goto L_0x05a3
            java.lang.Object r0 = r2.f51246c
            r13 = r0
            com.google.android.libraries.assistant.d.c.c.ak r13 = (com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17881ak) r13
            int r0 = r13.f51233a
            r0 = r0 & r4
            r14 = 2
            if (r0 == 0) goto L_0x0295
            com.google.android.libraries.assistant.d.c.c.v r0 = r13.f51234b
            if (r0 != 0) goto L_0x004a
            com.google.android.libraries.assistant.d.c.c.v r0 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17920v.f51335j
        L_0x004a:
            com.google.android.libraries.assistant.d.c.c.v r0 = r13.f51234b
            if (r0 != 0) goto L_0x0050
            com.google.android.libraries.assistant.d.c.c.v r0 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17920v.f51335j
        L_0x0050:
            r15 = r0
            com.google.android.libraries.assistant.d.c.c.aj r0 = r13.f51235c
            if (r0 != 0) goto L_0x0057
            com.google.android.libraries.assistant.d.c.c.aj r0 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17880aj.f51221i
        L_0x0057:
            java.lang.String r11 = r2.f51247d
            com.google.protobuf.cq r8 = r13.f51237e
            int r8 = r8.size()
            com.google.android.apps.gsa.staticplugins.opa.f.a r9 = r1.f298699q
            com.google.android.apps.gsa.search.core.google.gaia.o r12 = r1.f298694l
            android.accounts.Account r12 = r12.mo79668a()
            boolean r9 = r9.mo97396a(r12)
            if (r9 != 0) goto L_0x0081
            com.google.common.f.e r0 = f298683a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r8, r3)
            java.lang.String r8 = "Cannot open voice plate because OPA is not available on this phone."
            r9 = 23822(0x5d0e, float:3.3382E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r9)).mo56386p(r8)
            goto L_0x0295
        L_0x0081:
            com.google.android.apps.gsa.assistant.shared.bd r9 = r1.f298689g
            boolean r9 = r9.t(r11, r0)
            if (r9 == 0) goto L_0x0295
            com.google.android.apps.gsa.search.shared.h.h r9 = new com.google.android.apps.gsa.search.shared.h.h
            r9.<init>()
            r9.f236560f = r14
            java.lang.String r12 = "com.google.android.apps.chromecast.app"
            boolean r16 = r12.equals(r11)
            if (r16 == 0) goto L_0x00a2
            java.lang.String r14 = "and.opa.appinteg.gha.mic"
            r9.f236523a = r14
            com.google.android.apps.gsa.assistant.shared.l.e r14 = com.google.android.apps.gsa.assistant.shared.l.e.aF
            r9.f236556b = r14
            goto L_0x011c
        L_0x00a2:
            com.google.common.b.gu r14 = com.google.android.apps.gsa.shared.util.C90721ae.f253797f
            boolean r14 = r14.contains(r11)
            if (r14 == 0) goto L_0x00b3
            java.lang.String r14 = "and.opa.screenless.proxyvoice"
            r9.f236523a = r14
            com.google.android.apps.gsa.assistant.shared.l.e r14 = com.google.android.apps.gsa.assistant.shared.l.e.aG
            r9.f236556b = r14
            goto L_0x011c
        L_0x00b3:
            java.lang.String r14 = "com.google.android.apps.messaging"
            boolean r14 = r14.equals(r11)
            if (r14 == 0) goto L_0x00be
            java.lang.String r14 = "and.opa.appinteg.am"
            goto L_0x00d6
        L_0x00be:
            com.google.common.b.gu r14 = com.google.android.apps.gsa.shared.util.C90721ae.f253794c
            boolean r14 = r14.contains(r11)
            if (r14 == 0) goto L_0x00c9
            java.lang.String r14 = "and.opa.appinteg.waze"
            goto L_0x00d6
        L_0x00c9:
            java.lang.String r14 = "com.google.android.youtube"
            boolean r14 = r14.equals(r11)
            if (r14 == 0) goto L_0x00d4
            java.lang.String r14 = "and.opa.appinteg.youtube"
            goto L_0x00d6
        L_0x00d4:
            java.lang.String r14 = "and.opa.appinteg"
        L_0x00d6:
            java.lang.String r4 = r15.f51343g
            boolean r17 = r4.isEmpty()
            java.lang.String r10 = "mic"
            if (r17 != 0) goto L_0x0101
            boolean r17 = r1.m178174f(r11)
            if (r17 != 0) goto L_0x00e7
            goto L_0x0101
        L_0x00e7:
            java.lang.String r6 = "[a-z]+([.]?[a-z]+)*"
            boolean r6 = r4.matches(r6)
            if (r6 != 0) goto L_0x0102
            com.google.common.f.e r4 = f298683a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r6, r3)
            java.lang.String r6 = "source_suffix (%s) is invalid and thus ignored."
            r7 = 23820(0x5d0c, float:3.3379E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r7)).mo56389s(r6, r10)
        L_0x0101:
            r4 = r10
        L_0x0102:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r14)
            java.lang.String r7 = "."
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r9.f236523a = r4
            com.google.android.apps.gsa.assistant.shared.l.e r4 = com.google.android.apps.gsa.assistant.shared.l.e.aH
            r9.f236556b = r4
        L_0x011c:
            com.google.android.apps.gsa.assistant.shared.bd r4 = r1.f298689g
            r4.m(r11, r0, r9)
            r6 = 1
            r9.f236563i = r6
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r4 = "android.intent.extra.ASSIST_PACKAGE"
            r0.putString(r4, r11)
            r9.f236573s = r0
            java.lang.String r4 = r15.f51338b
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0155
            r9.f236568n = r4
            r6 = 3
            r9.f236560f = r6
            boolean r0 = r15.f51342f
            r6 = 1
            if (r0 == 0) goto L_0x0145
            r9.f236506J = r6
        L_0x0145:
            boolean r0 = r15.f51344h
            if (r0 == 0) goto L_0x014b
            r9.f236543an = r6
        L_0x014b:
            int r0 = r15.f51337a
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0155
            int r0 = r15.f51345i
            r9.f236544ao = r0
        L_0x0155:
            boolean r0 = r1.m178174f(r11)
            if (r0 == 0) goto L_0x01a4
            int r0 = r15.f51337a
            r6 = 4
            r0 = r0 & r6
            if (r0 == 0) goto L_0x01a4
            com.google.protobuf.z r0 = r15.f51340d     // Catch:{ ct -> 0x018f }
            com.google.assistant.e.j.du r6 = com.google.assistant.p3897e.p3921j.C51805du.f135924e     // Catch:{ ct -> 0x018f }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r6, (com.google.protobuf.C63088z) r0)     // Catch:{ ct -> 0x018f }
            com.google.assistant.e.j.du r0 = (com.google.assistant.p3897e.p3921j.C51805du) r0     // Catch:{ ct -> 0x018f }
            int r6 = r0.f135926a     // Catch:{ ct -> 0x018f }
            r7 = 1
            r6 = r6 & r7
            if (r6 == 0) goto L_0x017e
            byte[] r0 = r0.toByteArray()     // Catch:{ ct -> 0x018f }
            r9.f236517U = r0     // Catch:{ ct -> 0x018f }
            r6 = 3
            r9.f236560f = r6     // Catch:{ ct -> 0x018f }
            r9.f236508L = r7     // Catch:{ ct -> 0x018f }
            r6 = 1
            goto L_0x017f
        L_0x017e:
            r6 = 0
        L_0x017f:
            int r0 = r15.f51337a     // Catch:{ ct -> 0x018d }
            r0 = r0 & 16
            if (r0 == 0) goto L_0x01a5
            boolean r0 = r15.f51341e     // Catch:{ ct -> 0x018d }
            if (r0 == 0) goto L_0x01a5
            r7 = 1
            r9.f236539aj = r7     // Catch:{ ct -> 0x018d }
            goto L_0x01a5
        L_0x018d:
            r0 = move-exception
            goto L_0x0191
        L_0x018f:
            r0 = move-exception
            r6 = 0
        L_0x0191:
            com.google.common.f.e r7 = f298683a
            com.google.common.f.x r7 = r7.mo56225c()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r10, r3)
            java.lang.String r10 = "Failed to parse ClientInput protobuf"
            r14 = 23819(0x5d0b, float:3.3378E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56382g(r0)).mo56372aa(r14)).mo56386p(r10)
            goto L_0x01a5
        L_0x01a4:
            r6 = 0
        L_0x01a5:
            if (r8 != 0) goto L_0x01be
            long r7 = r15.f51339c
            r18 = 0
            int r0 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x01be
            dagger.a r0 = r1.f298691i
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r0 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r0
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_INTEGRATION_MIC_TAP
            long r14 = r15.f51339c
            r0.mo83703p(r7, r14)
        L_0x01be:
            dagger.a r0 = r1.f298686d
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247449hP
            boolean r0 = r0.mo79746e(r7)
            if (r0 == 0) goto L_0x0269
            com.google.common.base.ax r0 = r1.f298695m
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0269
            com.google.common.base.ax r0 = r1.f298695m
            java.lang.Object r0 = r0.mo56107c()
            dagger.a r0 = (dagger.C68214a) r0
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.nga.api.bp r0 = (com.google.android.apps.gsa.nga.api.C74715bp) r0
            boolean r0 = r0.mo71084e()
            if (r0 == 0) goto L_0x0269
            com.google.common.base.ax r0 = r1.f298696n
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0269
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0269
            if (r6 == 0) goto L_0x0201
            boolean r0 = r12.equals(r11)
            if (r0 == 0) goto L_0x0201
            goto L_0x0269
        L_0x0201:
            boolean r0 = r12.equals(r11)
            if (r0 == 0) goto L_0x020a
            com.google.android.apps.gsa.assistant.shared.l.e r0 = com.google.android.apps.gsa.assistant.shared.l.e.aF
            goto L_0x020c
        L_0x020a:
            com.google.android.apps.gsa.assistant.shared.l.e r0 = com.google.android.apps.gsa.assistant.shared.l.e.aH
        L_0x020c:
            com.google.android.apps.gsa.opa.f.a.y r4 = com.google.android.apps.gsa.opa.p6441f.p6442a.C83673y.f228080e
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.gsa.opa.f.a.w r4 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83671w) r4
            com.google.android.apps.gsa.opa.f.a.ac r6 = com.google.android.apps.gsa.opa.p6441f.p6442a.C83614ac.f227951e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.gsa.opa.f.a.ab r6 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83613ab) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.apps.gsa.opa.f.a.ac r7 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83614ac) r7
            int r0 = r0.ca
            r7.f227955c = r0
            int r0 = r7.f227953a
            r8 = 2
            r0 = r0 | r8
            r7.f227953a = r0
            r6.copyOnWrite()
            com.google.protobuf.bv r0 = r6.instance
            com.google.android.apps.gsa.opa.f.a.ac r0 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83614ac) r0
            r7 = 1
            r0.f227954b = r7
            int r8 = r0.f227953a
            r8 = r8 | r7
            r0.f227953a = r8
            com.google.protobuf.bv r0 = r6.build()
            com.google.android.apps.gsa.opa.f.a.ac r0 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83614ac) r0
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.android.apps.gsa.opa.f.a.y r6 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83673y) r6
            r0.getClass()
            r6.f228084c = r0
            r7 = 5
            r6.f228083b = r7
            com.google.protobuf.bv r0 = r4.build()
            com.google.android.apps.gsa.opa.f.a.y r0 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83673y) r0
            com.google.common.base.ax r4 = r1.f298696n
            java.lang.Object r4 = r4.mo56107c()
            dagger.a r4 = (dagger.C68214a) r4
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.staticplugins.nga.a.b.c r4 = (com.google.android.apps.gsa.staticplugins.nga.p8044a.p8046b.C103000c) r4
            r4.mo93557a(r0)
            goto L_0x0295
        L_0x0269:
            com.google.common.base.ax r0 = r1.f298684b
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0283
            com.google.common.base.ax r0 = r1.f298684b
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.search.shared.h.k r0 = (com.google.android.apps.gsa.search.shared.p6930h.C87568k) r0
            android.content.Context r4 = r1.f298685c
            android.os.Bundle r6 = r9.mo81685a()
            r0.mo81688b(r4, r6)
            goto L_0x0295
        L_0x0283:
            com.google.common.f.e r0 = f298683a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r3)
            java.lang.String r4 = "opaStarterOptional cannot be empty"
            r6 = 23817(0x5d09, float:3.3375E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r6)).mo56386p(r4)
        L_0x0295:
            int r0 = r13.f51233a
            r4 = 2
            r0 = r0 & r4
            if (r0 == 0) goto L_0x0309
            com.google.android.libraries.assistant.d.c.c.aj r0 = r13.f51235c
            if (r0 != 0) goto L_0x02a1
            com.google.android.libraries.assistant.d.c.c.aj r0 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17880aj.f51221i
        L_0x02a1:
            java.lang.String r4 = r2.f51247d
            boolean r4 = r1.m178174f(r4)
            if (r4 != 0) goto L_0x02da
            com.google.android.libraries.assistant.d.c.c.aj r4 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17880aj.f51221i
            com.google.protobuf.bn r0 = r4.createBuilder(r0)
            com.google.android.libraries.assistant.d.c.c.ac r0 = (com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17873ac) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.libraries.assistant.d.c.c.aj r4 = (com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17880aj) r4
            int r6 = r4.f51223a
            r6 = r6 & -17
            r4.f51223a = r6
            com.google.android.libraries.assistant.d.c.c.aj r6 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17880aj.f51221i
            java.lang.String r6 = r6.f51228f
            r4.f51228f = r6
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.libraries.assistant.d.c.c.aj r4 = (com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17880aj) r4
            r6 = 0
            r4.f51230h = r6
            int r6 = r4.f51223a
            r6 = r6 & -65
            r4.f51223a = r6
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.assistant.d.c.c.aj r0 = (com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17880aj) r0
        L_0x02da:
            com.google.android.libraries.assistant.d.c.c.aj r4 = r13.f51235c
            dagger.a r4 = r1.f298688f
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.appintegration.r r4 = (com.google.android.apps.gsa.staticplugins.opa.appintegration.C107348r) r4
            com.google.android.apps.gsa.assistant.shared.l.b r6 = r4.mo6453a()
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.android.apps.gsa.assistant.shared.l.a r6 = (com.google.android.apps.gsa.assistant.shared.l.a) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.apps.gsa.assistant.shared.l.b r7 = (com.google.android.apps.gsa.assistant.shared.l.b) r7
            r0.getClass()
            r7.c = r0
            int r0 = r7.a
            r8 = 2
            r0 = r0 | r8
            r7.a = r0
            com.google.protobuf.bv r0 = r6.build()
            com.google.android.apps.gsa.assistant.shared.l.b r0 = (com.google.android.apps.gsa.assistant.shared.l.b) r0
            r4.mo95949g(r0)
        L_0x0309:
            int r0 = r13.f51233a
            r4 = r0 & 4
            if (r4 == 0) goto L_0x032a
            com.google.android.libraries.assistant.d.c.c.r r0 = r13.f51236d
            if (r0 != 0) goto L_0x0315
            com.google.android.libraries.assistant.d.c.c.r r0 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17916r.f51325b
        L_0x0315:
            java.lang.String r0 = r0.f51327a
            com.google.common.f.e r0 = f298683a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r3)
            java.lang.String r2 = "playTts is obsolete and removed"
            r3 = 23804(0x5cfc, float:3.3357E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x032a:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0341
            com.google.common.f.e r0 = f298683a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r3)
            java.lang.String r2 = "stop is obsolete and removed"
            r3 = 23823(0x5d0f, float:3.3383E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x0341:
            r0 = r0 & 16
            if (r0 == 0) goto L_0x059e
            com.google.android.libraries.assistant.d.c.c.o r0 = r13.f51238f
            if (r0 != 0) goto L_0x034b
            com.google.android.libraries.assistant.d.c.c.o r0 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17913o.f51320c
        L_0x034b:
            int r4 = r0.f51323b
            int r4 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17912n.m35110b(r4)
            if (r4 != 0) goto L_0x0354
            r4 = 1
        L_0x0354:
            int r4 = r4 + -1
            r6 = 1
            if (r4 == r6) goto L_0x04f1
            r6 = 2
            if (r4 == r6) goto L_0x048f
            r6 = 3
            if (r4 == r6) goto L_0x0473
            r6 = 4
            if (r4 == r6) goto L_0x0400
            r6 = 5
            if (r4 == r6) goto L_0x038e
            com.google.common.f.e r4 = f298683a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r6, r3)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            r3 = 23789(0x5ced, float:3.3335E-41)
            com.google.common.f.x r3 = r4.mo56372aa(r3)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            int r0 = r0.f51323b
            int r6 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17912n.m35110b(r0)
            if (r6 != 0) goto L_0x0383
            r6 = 1
        L_0x0383:
            java.lang.String r0 = "#handleAppIntegrationClientEvent(): unsupported client event %s."
            java.lang.String r4 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17912n.m35109a(r6)
            r3.mo56389s(r0, r4)
            goto L_0x059e
        L_0x038e:
            com.google.android.apps.gsa.assistant.shared.bd r4 = r1.f298689g
            boolean r4 = r4.p(r5)
            if (r4 != 0) goto L_0x03aa
            com.google.common.f.e r0 = f298683a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r3)
            java.lang.String r3 = "#handleAppIntegrationClientEvent(): failed to handle KEYGUARD_DISMISS_STATUS_CHANGED because driving voice plate is not supported for %s"
            r4 = 23801(0x5cf9, float:3.3352E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56389s(r3, r5)
            goto L_0x059e
        L_0x03aa:
            com.google.protobuf.bt r4 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17887aq.f51255a
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r0.mo58887l(r4)
            com.google.protobuf.bf r6 = r0.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r4 = r6.mo58857o(r4)
            if (r4 == 0) goto L_0x03ec
            com.google.protobuf.bt r3 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17887aq.f51255a
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r0.mo58887l(r3)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r4 = r3.f169971d
            java.lang.Object r0 = r0.mo58854l(r4)
            if (r0 != 0) goto L_0x03d3
            java.lang.Object r0 = r3.f169969b
            goto L_0x03d7
        L_0x03d3:
            java.lang.Object r0 = r3.mo58889c(r0)
        L_0x03d7:
            com.google.android.libraries.assistant.d.c.c.as r0 = (com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17889as) r0
            r1.m178172d(r5)
            com.google.android.apps.gsa.assistant.shared.az r3 = r1.f298693k
            int r0 = r0.f51259b
            int r6 = com.google.android.libraries.assistant.p1467d.p1471b.C17817c.m35066a(r0)
            if (r6 != 0) goto L_0x03e7
            r6 = 1
        L_0x03e7:
            r3.r(r6)
            goto L_0x059e
        L_0x03ec:
            com.google.common.f.e r0 = f298683a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r3)
            java.lang.String r3 = "#handleAppIntegrationClientEvent(): KeyguardDismissStatusChangedEvent extension not set."
            r4 = 23799(0x5cf7, float:3.335E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r3)
            goto L_0x059e
        L_0x0400:
            com.google.android.apps.gsa.assistant.shared.bd r4 = r1.f298689g
            boolean r4 = r4.p(r5)
            if (r4 != 0) goto L_0x041c
            com.google.common.f.e r0 = f298683a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r3)
            java.lang.String r3 = "#handleAppIntegrationClientEvent(): failed to handle UI_SUPPRESSION_LEVEL_CHANGED because driving voice plate is not supported for %s"
            r4 = 23798(0x5cf6, float:3.3348E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56389s(r3, r5)
            goto L_0x059e
        L_0x041c:
            com.google.protobuf.bt r4 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17896az.f51273a
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r0.mo58887l(r4)
            com.google.protobuf.bf r6 = r0.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r4 = r6.mo58857o(r4)
            if (r4 == 0) goto L_0x045f
            com.google.protobuf.bt r3 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17896az.f51273a
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r0.mo58887l(r3)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r4 = r3.f169971d
            java.lang.Object r0 = r0.mo58854l(r4)
            if (r0 != 0) goto L_0x0445
            java.lang.Object r0 = r3.f169969b
            goto L_0x0449
        L_0x0445:
            java.lang.Object r0 = r3.mo58889c(r0)
        L_0x0449:
            com.google.android.libraries.assistant.d.c.c.bb r0 = (com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17899bb) r0
            r1.m178172d(r5)
            com.google.android.apps.gsa.assistant.shared.az r3 = r1.f298693k
            int r0 = r0.f51287a
            com.google.android.libraries.assistant.d.b.o r0 = com.google.android.libraries.assistant.p1467d.p1471b.C17829o.m35073a(r0)
            if (r0 != 0) goto L_0x045a
            com.google.android.libraries.assistant.d.b.o r0 = com.google.android.libraries.assistant.p1467d.p1471b.C17829o.UI_SUPPRESSION_LEVEL_UNKNOWN
        L_0x045a:
            r3.i(r0)
            goto L_0x059e
        L_0x045f:
            com.google.common.f.e r0 = f298683a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r3)
            java.lang.String r3 = "#handleAppIntegrationClientEvent(): UiSuppressionLevelChangedEvent extension not set."
            r4 = 23796(0x5cf4, float:3.3345E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r3)
            goto L_0x059e
        L_0x0473:
            com.google.android.apps.gsa.assistant.shared.bd r0 = r1.f298689g
            boolean r0 = r0.p(r5)
            if (r0 != 0) goto L_0x059e
            com.google.common.f.e r0 = f298683a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r3)
            java.lang.String r3 = "#handleAppIntegrationClientEvent(): failed to handle SEND_CLIENT_INPUT because driving voice plate is not supported for %s"
            r4 = 23802(0x5cfa, float:3.3354E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56389s(r3, r5)
            goto L_0x059e
        L_0x048f:
            com.google.protobuf.bt r4 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17893aw.f51268a
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r0.mo58887l(r4)
            com.google.protobuf.bf r6 = r0.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r4 = r6.mo58857o(r4)
            if (r4 == 0) goto L_0x04dd
            com.google.protobuf.bt r3 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17893aw.f51268a
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r0.mo58887l(r3)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r4 = r3.f169971d
            java.lang.Object r0 = r0.mo58854l(r4)
            if (r0 != 0) goto L_0x04b8
            java.lang.Object r0 = r3.f169969b
            goto L_0x04bc
        L_0x04b8:
            java.lang.Object r0 = r3.mo58889c(r0)
        L_0x04bc:
            com.google.android.libraries.assistant.d.c.c.ay r0 = (com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17895ay) r0
            int r0 = r0.f51271a
            com.google.android.libraries.assistant.d.b.k r0 = com.google.android.libraries.assistant.p1467d.p1471b.C17825k.m35071a(r0)
            if (r0 != 0) goto L_0x04c8
            com.google.android.libraries.assistant.d.b.k r0 = com.google.android.libraries.assistant.p1467d.p1471b.C17825k.NIGHT_MODE_STATUS_UNKNOWN
        L_0x04c8:
            r0.name()
            r1.m178173e(r0)
            com.google.android.apps.gsa.assistant.shared.az r0 = r1.f298693k
            boolean r0 = r0.n()
            if (r0 == 0) goto L_0x059e
            com.google.android.apps.gsa.assistant.shared.az r0 = r1.f298693k
            r0.g()
            goto L_0x059e
        L_0x04dd:
            com.google.common.f.e r0 = f298683a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r3)
            java.lang.String r3 = "#handleAppIntegrationClientEvent(): NightModeStatusChangedEvent extension not set."
            r4 = 23794(0x5cf2, float:3.3342E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r3)
            goto L_0x059e
        L_0x04f1:
            com.google.android.apps.gsa.assistant.shared.bd r4 = r1.f298689g
            boolean r4 = r4.p(r5)
            if (r4 != 0) goto L_0x050d
            com.google.common.f.e r0 = f298683a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r3)
            java.lang.String r3 = "#handleAppIntegrationClientEvent(): failed to handle NAVIGATION_STATE_CHANGED because driving voice plate is not supported for %s"
            r4 = 23793(0x5cf1, float:3.3341E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56389s(r3, r5)
            goto L_0x059e
        L_0x050d:
            com.google.protobuf.bt r4 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17890at.f51260a
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r0.mo58887l(r4)
            com.google.protobuf.bf r6 = r0.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r4 = r6.mo58857o(r4)
            if (r4 == 0) goto L_0x058c
            com.google.protobuf.bt r3 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17890at.f51260a
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r0.mo58887l(r3)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r4 = r3.f169971d
            java.lang.Object r0 = r0.mo58854l(r4)
            if (r0 != 0) goto L_0x0536
            java.lang.Object r0 = r3.f169969b
            goto L_0x053a
        L_0x0536:
            java.lang.Object r0 = r3.mo58889c(r0)
        L_0x053a:
            com.google.android.libraries.assistant.d.c.c.av r0 = (com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17892av) r0
            int r3 = r0.f51263a
            r4 = 2
            r3 = r3 & r4
            if (r3 == 0) goto L_0x054f
            int r3 = r0.f51265c
            com.google.android.libraries.assistant.d.b.k r3 = com.google.android.libraries.assistant.p1467d.p1471b.C17825k.m35071a(r3)
            if (r3 != 0) goto L_0x054c
            com.google.android.libraries.assistant.d.b.k r3 = com.google.android.libraries.assistant.p1467d.p1471b.C17825k.NIGHT_MODE_STATUS_UNKNOWN
        L_0x054c:
            r1.m178173e(r3)
        L_0x054f:
            r1.m178172d(r5)
            com.google.android.apps.gsa.assistant.shared.az r3 = r1.f298693k
            int r4 = r0.f51264b
            com.google.android.libraries.assistant.d.b.i r4 = com.google.android.libraries.assistant.p1467d.p1471b.C17823i.m35069a(r4)
            if (r4 != 0) goto L_0x055e
            com.google.android.libraries.assistant.d.b.i r4 = com.google.android.libraries.assistant.p1467d.p1471b.C17823i.UNKNOWN
        L_0x055e:
            int r6 = r0.f51263a
            r7 = 4
            r6 = r6 & r7
            if (r6 == 0) goto L_0x056f
            boolean r6 = r0.f51266d
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            j$.util.Optional r6 = p3186j$.util.Optional.m71637of(r6)
            goto L_0x0573
        L_0x056f:
            j$.util.Optional r6 = p3186j$.util.Optional.empty()
        L_0x0573:
            int r7 = r0.f51263a
            r7 = r7 & 8
            if (r7 == 0) goto L_0x0584
            boolean r0 = r0.f51267e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x0588
        L_0x0584:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x0588:
            r3.f(r4, r5, r6, r0)
            goto L_0x059e
        L_0x058c:
            com.google.common.f.e r0 = f298683a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r3)
            java.lang.String r3 = "#handleAppIntegrationClientEvent(): NavigationStateChangedEvent extension not set."
            r4 = 23790(0x5cee, float:3.3337E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r3)
        L_0x059e:
            com.google.protobuf.cq r0 = r13.f51237e
            r1.mo95912c(r0)
        L_0x05a3:
            int r0 = r2.f51245b
            r3 = 6
            if (r0 != r3) goto L_0x05cf
            com.google.android.apps.gsa.assistant.shared.az r0 = r1.f298693k
            boolean r0 = r0.k()
            if (r0 == 0) goto L_0x05cf
            dagger.a r0 = r1.f298686d
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248794aB
            boolean r0 = r0.mo79746e(r3)
            if (r0 == 0) goto L_0x05cf
            dagger.a r0 = r1.f298697o
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.morris2.c.a r0 = (com.google.android.apps.gsa.staticplugins.opa.morris2.p8381c.C109489a) r0
            com.google.android.apps.gsa.y.a.d r0 = r0.f304953a
            r3 = 1
            r0.mo104025g(r3)
        L_0x05cf:
            int r0 = r2.f51245b
            r3 = 4
            if (r0 != r3) goto L_0x0612
            com.google.android.apps.gsa.assistant.shared.bd r0 = r1.f298689g
            boolean r0 = r0.s()
            if (r0 == 0) goto L_0x05e1
            com.google.android.libraries.assistant.auto.tng.morris.f.a.a r0 = r1.f298698p
            r0.mo21582p()
        L_0x05e1:
            dagger.a r0 = r1.f298688f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.appintegration.r r0 = (com.google.android.apps.gsa.staticplugins.opa.appintegration.C107348r) r0
            r0.mo95948f(r5)
            com.google.android.apps.gsa.assistant.shared.d r0 = r1.f298690h
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            r4 = 1
            if (r4 == r3) goto L_0x05f7
            r6 = r5
            goto L_0x05f8
        L_0x05f7:
            r6 = 0
        L_0x05f8:
            r0.e(r6)
            com.google.android.apps.gsa.assistant.shared.bd r0 = r1.f298689g
            boolean r0 = r0.u(r5)
            if (r0 == 0) goto L_0x0612
            dagger.a r0 = r1.f298687e
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.appintegration.o r0 = (com.google.android.apps.gsa.staticplugins.opa.appintegration.C107345o) r0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            r0.mo95922b(r3)
        L_0x0612:
            int r0 = r2.f51245b
            r3 = 5
            if (r0 != r3) goto L_0x064b
            dagger.a r0 = r1.f298688f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.appintegration.r r0 = (com.google.android.apps.gsa.staticplugins.opa.appintegration.C107348r) r0
            r0.mo95946c()
            com.google.android.apps.gsa.assistant.shared.d r0 = r1.f298690h
            r3 = 0
            r0.e(r3)
            dagger.a r0 = r1.f298688f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.appintegration.r r0 = (com.google.android.apps.gsa.staticplugins.opa.appintegration.C107348r) r0
            r0.mo95947e()
            com.google.android.apps.gsa.assistant.shared.bd r0 = r1.f298689g
            boolean r0 = r0.u(r5)
            if (r0 == 0) goto L_0x064b
            dagger.a r0 = r1.f298687e
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.appintegration.o r0 = (com.google.android.apps.gsa.staticplugins.opa.appintegration.C107345o) r0
            r3 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0.mo95922b(r3)
        L_0x064b:
            int r0 = r2.f51245b
            r2 = 4
            if (r0 != r2) goto L_0x0651
            goto L_0x0655
        L_0x0651:
            r2 = 5
            if (r0 == r2) goto L_0x0655
            return
        L_0x0655:
            com.google.android.apps.gsa.assistant.shared.d r0 = r1.f298690h
            com.google.android.apps.gsa.assistant.shared.bd r2 = r1.f298689g
            boolean r2 = r2.s()
            if (r2 == 0) goto L_0x0662
            com.google.android.apps.gsa.assistant.shared.c r2 = com.google.android.apps.gsa.assistant.shared.c.b
            goto L_0x0664
        L_0x0662:
            com.google.android.apps.gsa.assistant.shared.c r2 = com.google.android.apps.gsa.assistant.shared.c.a
        L_0x0664:
            r0.g(r2)
            return
        L_0x0668:
            com.google.common.f.e r0 = f298683a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r3)
            java.lang.String r2 = "Package name should exist"
            r3 = 23812(0x5d04, float:3.3368E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x067b:
            com.google.common.f.e r0 = f298683a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r3)
            java.lang.String r2 = "Failed to parse bytes to AppIntegrationServiceProto"
            r3 = 23813(0x5d05, float:3.3369E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x068e:
            com.google.common.f.e r0 = f298683a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r3)
            java.lang.String r2 = "Must be called from AGSA only"
            r3 = 23824(0x5d10, float:3.3385E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            android.os.RemoteException r0 = new android.os.RemoteException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.appintegration.p8294b.C107332c.mo23480a(byte[]):void");
    }

    /* renamed from: b */
    public final void mo23481b(IBinder iBinder) {
        C58976aa aaVar = C58975e.f156826a;
        this.f298693k.h(iBinder);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo95912c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17902d dVar = (C17902d) it.next();
            C89859i iVar = (C89859i) this.f298691i.mo27525b();
            C89849ae a = C89849ae.m146281a(dVar.f51293b);
            if (a == null) {
                a = C89849ae.UNKNOWN_EVENT;
            }
            iVar.mo83703p(a, dVar.f51294c);
        }
    }
}
