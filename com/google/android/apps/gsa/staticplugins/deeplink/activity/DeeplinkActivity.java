package com.google.android.apps.gsa.staticplugins.deeplink.activity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.search.shared.service.C87690b;
import com.google.android.apps.gsa.search.shared.service.C88393c;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.deeplink.p7792d.C99499c;
import com.google.android.libraries.search.logging.appflows.startup.p3037a.C38802e;
import com.google.android.libraries.search.p2998g.C38390f;
import com.google.android.libraries.search.p2998g.C38391g;
import com.google.android.libraries.search.p2998g.C38392h;
import com.google.android.libraries.search.p2998g.C38393i;
import com.google.android.libraries.search.p2998g.C38394j;
import com.google.android.libraries.search.p2998g.C38395k;
import com.google.android.libraries.search.p2998g.C38396l;
import com.google.android.libraries.search.p2998g.p2999a.C38370k;
import com.google.android.libraries.search.p2998g.p2999a.C38374o;
import com.google.android.libraries.search.p2998g.p2999a.C38375p;
import com.google.android.libraries.search.p2998g.p2999a.C38377r;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.amo;
import java.util.List;
import java.util.Map;
import p3186j$.util.Optional;

/* compiled from: PG */
public class DeeplinkActivity extends C99473d {

    /* renamed from: a */
    public static final C59071e f278340a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.deeplink.activity.DeeplinkActivity");

    /* renamed from: l */
    private static final ClientConfig f278341l;

    /* renamed from: b */
    public C91097g f278342b;

    /* renamed from: c */
    public C88393c f278343c;

    /* renamed from: d */
    public Optional f278344d;

    /* renamed from: e */
    public C38802e f278345e;

    /* renamed from: f */
    public C38390f f278346f;

    /* renamed from: g */
    public C38396l f278347g;

    /* renamed from: h */
    public Map f278348h;

    /* renamed from: i */
    C87680ah f278349i;

    /* renamed from: j */
    C99470a f278350j;

    /* renamed from: k */
    C87690b f278351k;

    static {
        C88486g gVar = new C88486g();
        gVar.f239199a = 274877906946L;
        gVar.f239201c = amo.DEEPLINK;
        gVar.f239204f = "deeplink";
        f278341l = new ClientConfig(gVar);
    }

    /* renamed from: b */
    private final boolean m164995b(C38393i iVar, C38375p pVar) {
        C38394j jVar = (C38394j) C38395k.f101637d.createBuilder();
        C38370k kVar = pVar.f101609e;
        if (kVar == null) {
            kVar = C38370k.f101593f;
        }
        jVar.copyOnWrite();
        C38395k kVar2 = (C38395k) jVar.instance;
        kVar.getClass();
        kVar2.f101640b = kVar;
        int i = 1;
        kVar2.f101639a |= 1;
        C38377r rVar = pVar.f101610f;
        if (rVar == null) {
            rVar = C38377r.f101613e;
        }
        jVar.copyOnWrite();
        C38395k kVar3 = (C38395k) jVar.instance;
        rVar.getClass();
        kVar3.f101641c = rVar;
        kVar3.f101639a |= 2;
        C38392h a = iVar.mo41409a((C38395k) jVar.build());
        int a2 = a.mo41397a();
        int i2 = a2 - 1;
        if (a2 == 0) {
            throw null;
        } else if (i2 == 0) {
            return false;
        } else {
            if (i2 == 1) {
                List<Intent> b = a.mo41401b();
                C58838bb.m90883r(!b.isEmpty());
                String packageName = getPackageName();
                for (Intent intent : b) {
                    intent.setPackage(packageName);
                }
                Intent intent2 = (Intent) C58557jl.m90131l(b);
                if (b.size() == 1) {
                    intent2.addFlags(33554432);
                } else if (b.size() > 1 && (((Intent) b.get(0)).getFlags() & 268435456) == 0) {
                    finish();
                    throw new IllegalArgumentException("Adding multiple activities requires using a new task.");
                }
                intent2.addFlags(65536);
                try {
                    startActivities((Intent[]) b.toArray(new Intent[0]));
                    int a3 = C38374o.m67655a(pVar.f101611g);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    C38370k kVar4 = pVar.f101609e;
                    if (kVar4 == null) {
                        kVar4 = C38370k.f101593f;
                    }
                    C38377r rVar2 = pVar.f101610f;
                    if (rVar2 == null) {
                        rVar2 = C38377r.f101613e;
                    }
                    C99499c.m165021a(a3, true, kVar4, rVar2, 3);
                } catch (ActivityNotFoundException e) {
                    ((C59052c) ((C59052c) ((C59052c) f278340a.mo56225c()).mo56382g(e)).mo56372aa(19224)).mo56386p("Missing internal activity.");
                    int a4 = C38374o.m67655a(pVar.f101611g);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    C38370k kVar5 = pVar.f101609e;
                    if (kVar5 == null) {
                        kVar5 = C38370k.f101593f;
                    }
                    C38377r rVar3 = pVar.f101610f;
                    if (rVar3 == null) {
                        rVar3 = C38377r.f101613e;
                    }
                    C99499c.m165021a(a4, false, kVar5, rVar3, 3);
                } catch (Throwable th) {
                    int a5 = C38374o.m67655a(pVar.f101611g);
                    if (a5 != 0) {
                        i = a5;
                    }
                    C38370k kVar6 = pVar.f101609e;
                    if (kVar6 == null) {
                        kVar6 = C38370k.f101593f;
                    }
                    C38377r rVar4 = pVar.f101610f;
                    if (rVar4 == null) {
                        rVar4 = C38377r.f101613e;
                    }
                    C99499c.m165021a(i, false, kVar6, rVar4, 3);
                    throw th;
                }
                finish();
                return true;
            } else if (i2 == 2) {
                ((C59052c) ((C59052c) f278340a.mo56225c()).mo56372aa(19225)).mo56389s("The DeeplinkRedirector failed to handle the deeplink: %s", a.mo41405c());
                int a6 = C38374o.m67655a(pVar.f101611g);
                if (a6 == 0) {
                    a6 = 1;
                }
                C38370k kVar7 = pVar.f101609e;
                if (kVar7 == null) {
                    kVar7 = C38370k.f101593f;
                }
                C38377r rVar5 = pVar.f101610f;
                if (rVar5 == null) {
                    rVar5 = C38377r.f101613e;
                }
                C99499c.m165021a(a6, true, kVar7, rVar5, 4);
                finish();
                return true;
            } else {
                throw new AssertionError("Unknown deeplink destination: ".concat(C38391g.m67664a(a.mo41397a())));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0425, code lost:
        if ((r3.f101572a & 1) != 0) goto L_0x04a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04c7, code lost:
        if (r7 < r3.f101591b) goto L_0x04c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04d2  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x05ce  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x030d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            r0 = r20
            com.google.android.apps.gsa.e.f r1 = com.google.android.apps.gsa.e.f.W
            com.google.android.apps.gsa.p5846e.C74504a.m120462a(r1)
            long r1 = com.google.android.libraries.p1730f.p1731a.C21374d.m40426a()
            j$.time.Duration r1 = p3186j$.time.Duration.ofNanos(r1)
            super.onCreate(r21)
            android.view.Window r2 = r20.getWindow()
            r3 = 524288(0x80000, float:7.34684E-40)
            r2.addFlags(r3)
            j$.util.Optional r2 = r0.f278344d
            boolean r2 = r2.isPresent()
            if (r2 == 0) goto L_0x0032
            j$.util.Optional r2 = r0.f278344d
            java.lang.Object r2 = r2.get()
            com.google.android.apps.gsa.shared.logger.i.b r2 = (com.google.android.apps.gsa.shared.logger.p7064i.C89922b) r2
            long r3 = r1.toMillis()
            r2.mo83765i(r3)
        L_0x0032:
            com.google.android.libraries.search.logging.appflows.startup.a.e r2 = r0.f278345e
            r2.mo41631e(r1, r0)
            android.content.Intent r1 = r20.getIntent()
            if (r1 != 0) goto L_0x0041
            r20.finish()
            return
        L_0x0041:
            android.net.Uri r1 = r1.getData()
            if (r1 != 0) goto L_0x004b
            r20.finish()
            return
        L_0x004b:
            java.lang.String r1 = r1.toString()
            com.google.android.libraries.search.g.a.p r2 = com.google.android.libraries.search.p2998g.p2999a.C38375p.f101603h
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.search.g.a.m r2 = (com.google.android.libraries.search.p2998g.p2999a.C38372m) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.libraries.search.g.a.p r3 = (com.google.android.libraries.search.p2998g.p2999a.C38375p) r3
            r1.getClass()
            int r4 = r3.f101605a
            r5 = 1
            r4 = r4 | r5
            r3.f101605a = r4
            r3.f101606b = r1
            java.lang.String r3 = r20.getCallingPackage()
            r4 = 2
            if (r3 == 0) goto L_0x007e
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.android.libraries.search.g.a.p r6 = (com.google.android.libraries.search.p2998g.p2999a.C38375p) r6
            int r7 = r6.f101605a
            r7 = r7 | r4
            r6.f101605a = r7
            r6.f101607c = r3
        L_0x007e:
            android.net.Uri r3 = r20.getReferrer()
            r6 = 4
            if (r3 == 0) goto L_0x009a
            java.lang.String r3 = r3.toString()
            r2.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.android.libraries.search.g.a.p r7 = (com.google.android.libraries.search.p2998g.p2999a.C38375p) r7
            r3.getClass()
            int r8 = r7.f101605a
            r8 = r8 | r6
            r7.f101605a = r8
            r7.f101608d = r3
        L_0x009a:
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r3 = "googleapp"
            java.lang.String r7 = r1.getScheme()
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x0608
            java.lang.String r3 = "deeplink"
            java.lang.String r11 = r1.getHost()
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L_0x0608
            java.lang.String r3 = "/"
            java.lang.String r11 = r1.getPath()
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L_0x00ce
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getPath()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0608
        L_0x00ce:
            com.google.android.libraries.search.g.f r1 = r0.f278346f
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.libraries.search.g.a.p r3 = (com.google.android.libraries.search.p2998g.p2999a.C38375p) r3
            java.lang.String r11 = r3.f101606b
            java.lang.String r3 = r3.f101607c
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.libraries.search.g.a.r r12 = com.google.android.libraries.search.p2998g.p2999a.C38377r.f101613e
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.libraries.search.g.a.q r12 = (com.google.android.libraries.search.p2998g.p2999a.C38376q) r12
            android.net.Uri r13 = android.net.Uri.parse(r11)
            java.lang.String r14 = "data"
            java.lang.String r15 = "Invalid deeplink URI %s"
            java.lang.String r7 = "DeeplinkDecoder"
            if (r13 != 0) goto L_0x0107
            com.google.common.f.e r1 = com.google.android.libraries.search.p2998g.C38390f.f101634a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r3, r7)
            r3 = 53089(0xcf61, float:7.4394E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56389s(r15, r11)
            com.google.protobuf.bv r1 = r12.build()
            com.google.android.libraries.search.g.a.r r1 = (com.google.android.libraries.search.p2998g.p2999a.C38377r) r1
            goto L_0x01f8
        L_0x0107:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Set r16 = r13.getQueryParameterNames()
            java.util.Iterator r16 = r16.iterator()
        L_0x0114:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x017e
            java.lang.Object r17 = r16.next()
            r8 = r17
            java.lang.String r8 = (java.lang.String) r8
            boolean r17 = android.text.TextUtils.isEmpty(r8)
            if (r17 != 0) goto L_0x0114
            boolean r17 = r14.equals(r8)
            if (r17 != 0) goto L_0x0114
            java.util.List r17 = r13.getQueryParameters(r8)
            java.util.Iterator r17 = r17.iterator()
        L_0x0136:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L_0x0114
            java.lang.Object r18 = r17.next()
            r9 = r18
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x0136
            com.google.android.libraries.search.g.a.ab r18 = com.google.android.libraries.search.p2998g.p2999a.C38342ab.f101523d
            com.google.protobuf.bn r18 = r18.createBuilder()
            r10 = r18
            com.google.android.libraries.search.g.a.aa r10 = (com.google.android.libraries.search.p2998g.p2999a.C38341aa) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r6 = r10.instance
            com.google.android.libraries.search.g.a.ab r6 = (com.google.android.libraries.search.p2998g.p2999a.C38342ab) r6
            r8.getClass()
            int r4 = r6.f101525a
            r4 = r4 | r5
            r6.f101525a = r4
            r6.f101526b = r8
            r10.copyOnWrite()
            com.google.protobuf.bv r4 = r10.instance
            com.google.android.libraries.search.g.a.ab r4 = (com.google.android.libraries.search.p2998g.p2999a.C38342ab) r4
            int r6 = r4.f101525a
            r19 = 2
            r6 = r6 | 2
            r4.f101525a = r6
            r4.f101527c = r9
            com.google.protobuf.bv r4 = r10.build()
            com.google.android.libraries.search.g.a.ab r4 = (com.google.android.libraries.search.p2998g.p2999a.C38342ab) r4
            r11.add(r4)
            r4 = 2
            r6 = 4
            goto L_0x0136
        L_0x017e:
            if (r3 == 0) goto L_0x018f
            r12.copyOnWrite()
            com.google.protobuf.bv r4 = r12.instance
            com.google.android.libraries.search.g.a.r r4 = (com.google.android.libraries.search.p2998g.p2999a.C38377r) r4
            int r6 = r4.f101615a
            r8 = 4
            r6 = r6 | r8
            r4.f101615a = r6
            r4.f101618d = r3
        L_0x018f:
            com.google.android.libraries.search.g.a.ac r4 = com.google.android.libraries.search.p2998g.p2999a.C38343ac.f101528b
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.search.g.a.z r4 = (com.google.android.libraries.search.p2998g.p2999a.C38385z) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.android.libraries.search.g.a.ac r6 = (com.google.android.libraries.search.p2998g.p2999a.C38343ac) r6
            com.google.protobuf.cq r8 = r6.f101530a
            boolean r9 = r8.mo58948c()
            if (r9 != 0) goto L_0x01ac
            com.google.protobuf.cq r8 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r8)
            r6.f101530a = r8
        L_0x01ac:
            com.google.protobuf.cq r6 = r6.f101530a
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r11, (java.util.List) r6)
            com.google.protobuf.bv r4 = r4.build()
            com.google.android.libraries.search.g.a.ac r4 = (com.google.android.libraries.search.p2998g.p2999a.C38343ac) r4
            r12.copyOnWrite()
            com.google.protobuf.bv r6 = r12.instance
            com.google.android.libraries.search.g.a.r r6 = (com.google.android.libraries.search.p2998g.p2999a.C38377r) r6
            r4.getClass()
            r6.f101616b = r4
            int r4 = r6.f101615a
            r4 = r4 | r5
            r6.f101615a = r4
            if (r3 != 0) goto L_0x01cc
        L_0x01ca:
            r1 = 0
            goto L_0x01e3
        L_0x01cc:
            com.google.android.apps.gsa.search.core.i.t r4 = r1.f101635b
            com.google.android.apps.gsa.shared.m.h r6 = com.google.android.apps.gsa.shared.p7066m.C89968ag.f246520t
            com.google.common.b.gu r4 = r4.mo79745c(r6)
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L_0x01ca
            com.google.android.gms.common.ac r1 = r1.f101636c
            boolean r1 = r1.mo119084c(r3)
            if (r1 == 0) goto L_0x01ca
            r1 = 1
        L_0x01e3:
            r12.copyOnWrite()
            com.google.protobuf.bv r3 = r12.instance
            com.google.android.libraries.search.g.a.r r3 = (com.google.android.libraries.search.p2998g.p2999a.C38377r) r3
            int r4 = r3.f101615a
            r6 = 2
            r4 = r4 | r6
            r3.f101615a = r4
            r3.f101617c = r1
            com.google.protobuf.bv r1 = r12.build()
            com.google.android.libraries.search.g.a.r r1 = (com.google.android.libraries.search.p2998g.p2999a.C38377r) r1
        L_0x01f8:
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.libraries.search.g.a.p r3 = (com.google.android.libraries.search.p2998g.p2999a.C38375p) r3
            java.lang.String r3 = r3.f101606b
            android.net.Uri r4 = android.net.Uri.parse(r3)
            r6 = 8
            if (r4 != 0) goto L_0x021c
            com.google.common.f.e r4 = com.google.android.libraries.search.p2998g.C38390f.f101634a
            com.google.common.f.x r4 = r4.mo56225c()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r8, r7)
            r7 = 53094(0xcf66, float:7.44E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r7)).mo56389s(r15, r3)
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            goto L_0x027e
        L_0x021c:
            java.lang.String r3 = r4.getQueryParameter(r14)
            if (r3 != 0) goto L_0x023a
            com.google.common.f.e r3 = com.google.android.libraries.search.p2998g.C38390f.f101634a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r7)
            java.lang.String r4 = "Missing &data param in deeplink."
            r7 = 53093(0xcf65, float:7.4399E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r7)).mo56386p(r4)
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            goto L_0x027e
        L_0x023a:
            byte[] r4 = android.util.Base64.decode(r3, r6)     // Catch:{ IllegalArgumentException -> 0x0267, ct -> 0x024f }
            com.google.protobuf.ba r8 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ IllegalArgumentException -> 0x0267, ct -> 0x024f }
            com.google.android.libraries.search.g.a.y r9 = com.google.android.libraries.search.p2998g.p2999a.C38384y.f101627d     // Catch:{ IllegalArgumentException -> 0x0267, ct -> 0x024f }
            com.google.protobuf.bv r4 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r9, (byte[]) r4, (com.google.protobuf.C62921ba) r8)     // Catch:{ IllegalArgumentException -> 0x0267, ct -> 0x024f }
            com.google.android.libraries.search.g.a.y r4 = (com.google.android.libraries.search.p2998g.p2999a.C38384y) r4     // Catch:{ IllegalArgumentException -> 0x0267, ct -> 0x024f }
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r4)     // Catch:{ IllegalArgumentException -> 0x0267, ct -> 0x024f }
            goto L_0x027e
        L_0x024f:
            com.google.common.f.e r4 = com.google.android.libraries.search.p2998g.C38390f.f101634a
            com.google.common.f.x r4 = r4.mo56225c()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r8, r7)
            java.lang.String r7 = "Unable to decode SignedDeeplink proto: %s"
            r8 = 53092(0xcf64, float:7.4398E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r8)).mo56389s(r7, r3)
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            goto L_0x027e
        L_0x0267:
            com.google.common.f.e r4 = com.google.android.libraries.search.p2998g.C38390f.f101634a
            com.google.common.f.x r4 = r4.mo56225c()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r8, r7)
            java.lang.String r7 = "Invalid Base64: %s"
            r8 = 53091(0xcf63, float:7.4396E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r8)).mo56389s(r7, r3)
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
        L_0x027e:
            j$.util.Optional r4 = com.google.android.apps.gsa.staticplugins.deeplink.p7792d.C99498b.m165020a(r3)
            com.google.android.libraries.search.g.l r7 = r0.f278347g
            boolean r8 = r1.f101617c
            j$.util.Optional r9 = com.google.android.apps.gsa.staticplugins.deeplink.p7792d.C99498b.m165020a(r3)
            boolean r10 = r3.isEmpty()
            r11 = 5
            if (r10 != 0) goto L_0x04ce
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L_0x0299
            goto L_0x04ce
        L_0x0299:
            java.lang.Object r10 = r9.get()
            com.google.android.libraries.search.g.a.k r10 = (com.google.android.libraries.search.p2998g.p2999a.C38370k) r10
            com.google.android.libraries.f.a r12 = r7.f101646d
            long r12 = r12.mo26870b()
            j$.time.Duration r12 = p3186j$.time.Duration.ofMillis(r12)
            com.google.android.libraries.search.g.a.j r13 = r10.f101596b
            if (r13 != 0) goto L_0x02af
            com.google.android.libraries.search.g.a.j r13 = com.google.android.libraries.search.p2998g.p2999a.C38369j.f101588d
        L_0x02af:
            int r13 = r13.f101590a
            r14 = 2
            r13 = r13 & r14
            if (r13 == 0) goto L_0x02c9
            com.google.android.libraries.search.g.a.j r13 = r10.f101596b
            if (r13 != 0) goto L_0x02bb
            com.google.android.libraries.search.g.a.j r13 = com.google.android.libraries.search.p2998g.p2999a.C38369j.f101588d
        L_0x02bb:
            long r14 = r13.f101592c
            j$.time.Duration r13 = p3186j$.time.Duration.ofMillis(r14)
            int r12 = r12.compareTo((p3186j$.time.Duration) r13)
            if (r12 <= 0) goto L_0x02c9
            r10 = 4
            goto L_0x0304
        L_0x02c9:
            com.google.android.libraries.search.g.a.h r12 = r10.f101597c
            if (r12 != 0) goto L_0x02cf
            com.google.android.libraries.search.g.a.h r12 = com.google.android.libraries.search.p2998g.p2999a.C38367h.f101583d
        L_0x02cf:
            int r12 = r12.f101585a
            r12 = r12 & r5
            if (r12 == 0) goto L_0x02ed
            com.google.android.libraries.search.g.a.h r10 = r10.f101597c
            if (r10 != 0) goto L_0x02da
            com.google.android.libraries.search.g.a.h r10 = com.google.android.libraries.search.p2998g.p2999a.C38367h.f101583d
        L_0x02da:
            int r10 = r10.f101586b
            com.google.android.apps.gsa.search.core.i.t r12 = r7.f101644b
            com.google.android.apps.gsa.shared.m.h r13 = com.google.android.apps.gsa.shared.p7066m.C89968ag.f246503c
            com.google.common.b.gu r12 = r12.mo79749o(r13)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            boolean r10 = r12.contains(r10)
            goto L_0x02fe
        L_0x02ed:
            com.google.android.apps.gsa.search.core.i.t r10 = r7.f101644b
            com.google.android.apps.gsa.shared.m.h r12 = com.google.android.apps.gsa.shared.p7066m.C89968ag.f246503c
            com.google.common.b.gu r10 = r10.mo79749o(r12)
            r12 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            boolean r10 = r10.contains(r13)
        L_0x02fe:
            if (r10 == 0) goto L_0x0302
            r10 = 3
            goto L_0x0304
        L_0x0302:
            r10 = 9
        L_0x0304:
            boolean r12 = com.google.android.libraries.search.p2998g.C38396l.m67670c(r10)
            if (r12 == 0) goto L_0x030d
            r11 = r10
            goto L_0x04ce
        L_0x030d:
            java.lang.Object r10 = r3.get()
            com.google.android.libraries.search.g.a.y r10 = (com.google.android.libraries.search.p2998g.p2999a.C38384y) r10
            java.lang.Object r12 = r9.get()
            com.google.android.libraries.search.g.a.k r12 = (com.google.android.libraries.search.p2998g.p2999a.C38370k) r12
            int r10 = r10.f101629a
            r10 = r10 & r5
            r13 = 6
            java.lang.String r14 = "DeeplinkVerifier"
            if (r10 == 0) goto L_0x0323
            goto L_0x03fd
        L_0x0323:
            com.google.android.libraries.search.g.a.f r10 = r12.f101598d
            if (r10 != 0) goto L_0x0329
            com.google.android.libraries.search.g.a.f r10 = com.google.android.libraries.search.p2998g.p2999a.C38365f.f101578c
        L_0x0329:
            int r12 = r10.f101580a
            r15 = 2
            if (r12 != r15) goto L_0x0333
            java.lang.Object r10 = r10.f101581b
            com.google.android.libraries.search.g.a.u r10 = (com.google.android.libraries.search.p2998g.p2999a.C38380u) r10
            goto L_0x0335
        L_0x0333:
            com.google.android.libraries.search.g.a.u r10 = com.google.android.libraries.search.p2998g.p2999a.C38380u.f101620d
        L_0x0335:
            com.google.android.apps.gsa.search.shared.service.c.b.bb r10 = r10.f101624c
            if (r10 != 0) goto L_0x033b
            com.google.android.apps.gsa.search.shared.service.c.b.bb r10 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb.f239082a
        L_0x033b:
            com.google.protobuf.bt r12 = com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a.C38346a.f101532a
            com.google.protobuf.bt r12 = com.google.protobuf.C62942bv.checkIsLite(r12)
            r10.mo58887l(r12)
            com.google.protobuf.bf r10 = r10.f169962ag
            com.google.protobuf.bs r12 = r12.f169971d
            boolean r10 = r10.mo58857o(r12)
            if (r10 == 0) goto L_0x03fd
            com.google.android.apps.gsa.search.core.i.t r10 = r7.f101644b
            com.google.android.apps.gsa.shared.m.d r12 = com.google.android.apps.gsa.shared.p7066m.C89968ag.f246518r
            boolean r10 = r10.mo79746e(r12)
            if (r10 == 0) goto L_0x03fd
            java.lang.Object r3 = r9.get()
            com.google.android.libraries.search.g.a.k r3 = (com.google.android.libraries.search.p2998g.p2999a.C38370k) r3
            int r3 = r3.f101595a
            r8 = 4
            r3 = r3 & r8
            if (r3 == 0) goto L_0x04ce
            java.lang.Object r3 = r9.get()
            com.google.android.libraries.search.g.a.k r3 = (com.google.android.libraries.search.p2998g.p2999a.C38370k) r3
            com.google.android.libraries.search.g.a.f r8 = r3.f101598d
            if (r8 != 0) goto L_0x0370
            com.google.android.libraries.search.g.a.f r8 = com.google.android.libraries.search.p2998g.p2999a.C38365f.f101578c
        L_0x0370:
            int r8 = r8.f101580a
            r10 = 2
            if (r8 != r10) goto L_0x03e9
            int r8 = com.google.android.libraries.search.p2998g.C38396l.m67669a(r3)
            boolean r10 = com.google.android.libraries.search.p2998g.C38396l.m67670c(r8)
            if (r10 != 0) goto L_0x04a6
            com.google.android.libraries.search.g.a.e r8 = com.google.android.libraries.search.p2998g.p2999a.C38364e.SESSION_DEEPLINK
            com.google.android.libraries.search.g.a.f r10 = r3.f101598d
            if (r10 != 0) goto L_0x0387
            com.google.android.libraries.search.g.a.f r10 = com.google.android.libraries.search.p2998g.p2999a.C38365f.f101578c
        L_0x0387:
            int r10 = r10.f101580a
            com.google.android.libraries.search.g.a.e r10 = com.google.android.libraries.search.p2998g.p2999a.C38364e.m67654a(r10)
            boolean r8 = r8.equals(r10)
            com.google.common.base.C58838bb.m90883r(r8)
            com.google.android.libraries.search.g.a.f r8 = r3.f101598d
            if (r8 != 0) goto L_0x039a
            com.google.android.libraries.search.g.a.f r8 = com.google.android.libraries.search.p2998g.p2999a.C38365f.f101578c
        L_0x039a:
            int r10 = r8.f101580a
            r12 = 2
            if (r10 != r12) goto L_0x03a4
            java.lang.Object r8 = r8.f101581b
            com.google.android.libraries.search.g.a.u r8 = (com.google.android.libraries.search.p2998g.p2999a.C38380u) r8
            goto L_0x03a6
        L_0x03a4:
            com.google.android.libraries.search.g.a.u r8 = com.google.android.libraries.search.p2998g.p2999a.C38380u.f101620d
        L_0x03a6:
            java.lang.String r8 = com.google.android.apps.gsa.staticplugins.deeplink.p7792d.C99497a.m165019a(r8)
            if (r8 != 0) goto L_0x03b0
            r8 = 8
            goto L_0x04a6
        L_0x03b0:
            boolean r8 = com.google.android.apps.gsa.search.shared.service.p6936c.C88397b.m142808a(r8)
            if (r8 != 0) goto L_0x03b9
        L_0x03b6:
            r8 = 5
            goto L_0x04a6
        L_0x03b9:
            com.google.android.libraries.search.g.a.f r3 = r3.f101598d
            if (r3 != 0) goto L_0x03bf
            com.google.android.libraries.search.g.a.f r3 = com.google.android.libraries.search.p2998g.p2999a.C38365f.f101578c
        L_0x03bf:
            int r8 = r3.f101580a
            r10 = 2
            if (r8 != r10) goto L_0x03c9
            java.lang.Object r3 = r3.f101581b
            com.google.android.libraries.search.g.a.u r3 = (com.google.android.libraries.search.p2998g.p2999a.C38380u) r3
            goto L_0x03cb
        L_0x03c9:
            com.google.android.libraries.search.g.a.u r3 = com.google.android.libraries.search.p2998g.p2999a.C38380u.f101620d
        L_0x03cb:
            com.google.android.apps.gsa.search.shared.service.c.b.bb r3 = r3.f101624c
            if (r3 != 0) goto L_0x03d1
            com.google.android.apps.gsa.search.shared.service.c.b.bb r3 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb.f239082a
        L_0x03d1:
            com.google.protobuf.bt r8 = com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a.C38346a.f101532a
            com.google.protobuf.bt r8 = com.google.protobuf.C62942bv.checkIsLite(r8)
            r3.mo58887l(r8)
            com.google.protobuf.bf r3 = r3.f169962ag
            com.google.protobuf.bs r8 = r8.f169971d
            boolean r3 = r3.mo58857o(r8)
            if (r3 != 0) goto L_0x03e5
            goto L_0x03b6
        L_0x03e5:
            r8 = 12
            goto L_0x04a6
        L_0x03e9:
            com.google.common.f.e r3 = com.google.android.libraries.search.p2998g.C38396l.f101643a
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r8, r14)
            java.lang.String r8 = "Untrusted Deeplinks must contain a signed session deeplink proto.This is probably a developer error."
            r10 = 53101(0xcf6d, float:7.441E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r10)).mo56386p(r8)
            goto L_0x0450
        L_0x03fd:
            java.lang.Object r3 = r3.get()
            com.google.android.libraries.search.g.a.y r3 = (com.google.android.libraries.search.p2998g.p2999a.C38384y) r3
            java.lang.Object r10 = r9.get()
            com.google.android.libraries.search.g.a.k r10 = (com.google.android.libraries.search.p2998g.p2999a.C38370k) r10
            int r3 = r7.mo41410b(r3, r8)
            boolean r8 = com.google.android.libraries.search.p2998g.C38396l.m67670c(r3)
            if (r8 != 0) goto L_0x04a5
            int r3 = r10.f101595a
            r8 = 4
            r3 = r3 & r8
            r8 = 11
            if (r3 == 0) goto L_0x041c
            goto L_0x0429
        L_0x041c:
            com.google.android.libraries.search.g.a.c r3 = r10.f101599e
            if (r3 != 0) goto L_0x0422
            com.google.android.libraries.search.g.a.c r3 = com.google.android.libraries.search.p2998g.p2999a.C38362c.f101570c
        L_0x0422:
            int r3 = r3.f101572a
            r3 = r3 & r5
            if (r3 == 0) goto L_0x0429
            goto L_0x04a6
        L_0x0429:
            com.google.android.libraries.search.g.a.f r3 = r10.f101598d
            if (r3 != 0) goto L_0x042f
            com.google.android.libraries.search.g.a.f r3 = com.google.android.libraries.search.p2998g.p2999a.C38365f.f101578c
        L_0x042f:
            int r3 = r3.f101580a
            com.google.android.libraries.search.g.a.e r3 = com.google.android.libraries.search.p2998g.p2999a.C38364e.m67654a(r3)
            int r12 = r3.ordinal()
            if (r12 == 0) goto L_0x0487
            if (r12 == r5) goto L_0x0452
            com.google.common.f.e r8 = com.google.android.libraries.search.p2998g.C38396l.f101643a
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r10, r14)
            java.lang.String r10 = "Unrecognized deeplink action. This is probably a developer error. %s"
            r11 = 53096(0xcf68, float:7.4403E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r11)).mo56389s(r10, r3)
        L_0x0450:
            r8 = 6
            goto L_0x04a6
        L_0x0452:
            com.google.android.apps.gsa.search.core.i.t r3 = r7.f101644b
            com.google.android.apps.gsa.shared.m.h r12 = com.google.android.apps.gsa.shared.p7066m.C89968ag.f246519s
            com.google.common.b.gu r3 = r3.mo79749o(r12)
            com.google.android.libraries.search.g.a.f r12 = r10.f101598d
            if (r12 != 0) goto L_0x0460
            com.google.android.libraries.search.g.a.f r12 = com.google.android.libraries.search.p2998g.p2999a.C38365f.f101578c
        L_0x0460:
            int r13 = r12.f101580a
            if (r13 != r5) goto L_0x0469
            java.lang.Object r12 = r12.f101581b
            com.google.android.apps.gsa.search.shared.service.b.bw r12 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw) r12
            goto L_0x046b
        L_0x0469:
            com.google.android.apps.gsa.search.shared.service.b.bw r12 = com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw.f237477c
        L_0x046b:
            int r12 = r12.f237480b
            com.google.android.apps.gsa.search.shared.service.b.bu r12 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.m142761a(r12)
            if (r12 != 0) goto L_0x0475
            com.google.android.apps.gsa.search.shared.service.b.bu r12 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.UNKNOWN
        L_0x0475:
            int r12 = r12.f237476dL
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            boolean r3 = r3.contains(r12)
            if (r5 == r3) goto L_0x0484
            r16 = 5
            goto L_0x048d
        L_0x0484:
            r16 = 9
            goto L_0x048d
        L_0x0487:
            int r3 = com.google.android.libraries.search.p2998g.C38396l.m67669a(r10)
            r16 = r3
        L_0x048d:
            boolean r3 = com.google.android.libraries.search.p2998g.C38396l.m67670c(r16)
            if (r3 == 0) goto L_0x04a2
            com.google.android.libraries.search.g.a.c r3 = r10.f101599e
            if (r3 != 0) goto L_0x0499
            com.google.android.libraries.search.g.a.c r3 = com.google.android.libraries.search.p2998g.p2999a.C38362c.f101570c
        L_0x0499:
            int r3 = r3.f101572a
            r3 = r3 & r5
            if (r3 == 0) goto L_0x049f
            goto L_0x04a6
        L_0x049f:
            r8 = r16
            goto L_0x04a6
        L_0x04a2:
            r8 = 10
            goto L_0x04a6
        L_0x04a5:
            r8 = r3
        L_0x04a6:
            boolean r3 = com.google.android.libraries.search.p2998g.C38396l.m67670c(r8)
            if (r3 != 0) goto L_0x04cd
            java.lang.Object r3 = r9.get()
            com.google.android.libraries.search.g.a.k r3 = (com.google.android.libraries.search.p2998g.p2999a.C38370k) r3
            com.google.android.libraries.search.g.a.j r3 = r3.f101596b
            if (r3 != 0) goto L_0x04b9
            com.google.android.libraries.search.g.a.j r9 = com.google.android.libraries.search.p2998g.p2999a.C38369j.f101588d
            goto L_0x04ba
        L_0x04b9:
            r9 = r3
        L_0x04ba:
            int r9 = r9.f101590a
            r9 = r9 & r5
            if (r9 == 0) goto L_0x04c9
            int r7 = r7.f101645c
            if (r3 != 0) goto L_0x04c5
            com.google.android.libraries.search.g.a.j r3 = com.google.android.libraries.search.p2998g.p2999a.C38369j.f101588d
        L_0x04c5:
            int r3 = r3.f101591b
            if (r7 >= r3) goto L_0x04cd
        L_0x04c9:
            r3 = 12
            r11 = 2
            goto L_0x04d0
        L_0x04cd:
            r11 = r8
        L_0x04ce:
            r3 = 12
        L_0x04d0:
            if (r11 != r3) goto L_0x05c8
            java.lang.Object r3 = r4.get()
            com.google.android.libraries.search.g.a.k r3 = (com.google.android.libraries.search.p2998g.p2999a.C38370k) r3
            com.google.android.libraries.search.g.a.f r4 = r3.f101598d
            if (r4 != 0) goto L_0x04de
            com.google.android.libraries.search.g.a.f r4 = com.google.android.libraries.search.p2998g.p2999a.C38365f.f101578c
        L_0x04de:
            int r7 = r4.f101580a
            r8 = 2
            if (r7 != r8) goto L_0x04e8
            java.lang.Object r4 = r4.f101581b
            com.google.android.libraries.search.g.a.u r4 = (com.google.android.libraries.search.p2998g.p2999a.C38380u) r4
            goto L_0x04ea
        L_0x04e8:
            com.google.android.libraries.search.g.a.u r4 = com.google.android.libraries.search.p2998g.p2999a.C38380u.f101620d
        L_0x04ea:
            com.google.android.apps.gsa.search.shared.service.c.b.bb r4 = r4.f101624c
            if (r4 != 0) goto L_0x04f0
            com.google.android.apps.gsa.search.shared.service.c.b.bb r4 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb.f239082a
        L_0x04f0:
            com.google.protobuf.bt r7 = com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a.C38346a.f101532a
            com.google.protobuf.bt r7 = com.google.protobuf.C62942bv.checkIsLite(r7)
            r4.mo58887l(r7)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r8 = r7.f169971d
            java.lang.Object r4 = r4.mo58854l(r8)
            if (r4 != 0) goto L_0x0506
            java.lang.Object r4 = r7.f169969b
            goto L_0x050a
        L_0x0506:
            java.lang.Object r4 = r7.mo58889c(r4)
        L_0x050a:
            com.google.android.libraries.search.g.a.b.a.c r4 = (com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a.C38348c) r4
            com.google.android.apps.gsa.search.shared.service.c.b.bb r7 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb.f239082a
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.apps.gsa.search.shared.service.c.b.ba r7 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88430ba) r7
            com.google.protobuf.bt r8 = com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a.C38346a.f101532a
            r7.mo58885m(r8, r4)
            com.google.protobuf.bv r4 = r7.build()
            com.google.android.apps.gsa.search.shared.service.c.b.bb r4 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb) r4
            com.google.protobuf.bn r7 = r3.toBuilder()
            com.google.android.libraries.search.g.a.a r7 = (com.google.android.libraries.search.p2998g.p2999a.C38335a) r7
            com.google.android.libraries.search.g.a.h r8 = r3.f101597c
            if (r8 != 0) goto L_0x052b
            com.google.android.libraries.search.g.a.h r8 = com.google.android.libraries.search.p2998g.p2999a.C38367h.f101583d
        L_0x052b:
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.android.libraries.search.g.a.g r8 = (com.google.android.libraries.search.p2998g.p2999a.C38366g) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.libraries.search.g.a.h r9 = (com.google.android.libraries.search.p2998g.p2999a.C38367h) r9
            int r10 = r9.f101585a
            r10 = r10 & -3
            r9.f101585a = r10
            com.google.android.libraries.search.g.a.h r10 = com.google.android.libraries.search.p2998g.p2999a.C38367h.f101583d
            java.lang.String r10 = r10.f101587c
            r9.f101587c = r10
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.android.libraries.search.g.a.k r9 = (com.google.android.libraries.search.p2998g.p2999a.C38370k) r9
            com.google.protobuf.bv r8 = r8.build()
            com.google.android.libraries.search.g.a.h r8 = (com.google.android.libraries.search.p2998g.p2999a.C38367h) r8
            r8.getClass()
            r9.f101597c = r8
            int r8 = r9.f101595a
            r10 = 2
            r8 = r8 | r10
            r9.f101595a = r8
            com.google.android.libraries.search.g.a.f r8 = r3.f101598d
            if (r8 != 0) goto L_0x0562
            com.google.android.libraries.search.g.a.f r8 = com.google.android.libraries.search.p2998g.p2999a.C38365f.f101578c
        L_0x0562:
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.android.libraries.search.g.a.d r8 = (com.google.android.libraries.search.p2998g.p2999a.C38363d) r8
            com.google.android.libraries.search.g.a.f r3 = r3.f101598d
            if (r3 != 0) goto L_0x056e
            com.google.android.libraries.search.g.a.f r3 = com.google.android.libraries.search.p2998g.p2999a.C38365f.f101578c
        L_0x056e:
            int r9 = r3.f101580a
            r10 = 2
            if (r9 != r10) goto L_0x0578
            java.lang.Object r3 = r3.f101581b
            com.google.android.libraries.search.g.a.u r3 = (com.google.android.libraries.search.p2998g.p2999a.C38380u) r3
            goto L_0x057a
        L_0x0578:
            com.google.android.libraries.search.g.a.u r3 = com.google.android.libraries.search.p2998g.p2999a.C38380u.f101620d
        L_0x057a:
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.android.libraries.search.g.a.t r3 = (com.google.android.libraries.search.p2998g.p2999a.C38379t) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r9 = r3.instance
            com.google.android.libraries.search.g.a.u r9 = (com.google.android.libraries.search.p2998g.p2999a.C38380u) r9
            r4.getClass()
            r9.f101624c = r4
            int r4 = r9.f101622a
            r10 = 2
            r4 = r4 | r10
            r9.f101622a = r4
            r8.copyOnWrite()
            com.google.protobuf.bv r4 = r8.instance
            com.google.android.libraries.search.g.a.f r4 = (com.google.android.libraries.search.p2998g.p2999a.C38365f) r4
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.libraries.search.g.a.u r3 = (com.google.android.libraries.search.p2998g.p2999a.C38380u) r3
            r3.getClass()
            r4.f101581b = r3
            r4.f101580a = r10
            r7.copyOnWrite()
            com.google.protobuf.bv r3 = r7.instance
            com.google.android.libraries.search.g.a.k r3 = (com.google.android.libraries.search.p2998g.p2999a.C38370k) r3
            com.google.protobuf.bv r4 = r8.build()
            com.google.android.libraries.search.g.a.f r4 = (com.google.android.libraries.search.p2998g.p2999a.C38365f) r4
            r4.getClass()
            r3.f101598d = r4
            int r4 = r3.f101595a
            r8 = 4
            r4 = r4 | r8
            r3.f101595a = r4
            com.google.protobuf.bv r3 = r7.build()
            com.google.android.libraries.search.g.a.k r3 = (com.google.android.libraries.search.p2998g.p2999a.C38370k) r3
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r3)
        L_0x05c8:
            boolean r3 = r4.isPresent()
            if (r3 == 0) goto L_0x05e5
            java.lang.Object r3 = r4.get()
            com.google.android.libraries.search.g.a.k r3 = (com.google.android.libraries.search.p2998g.p2999a.C38370k) r3
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.libraries.search.g.a.p r4 = (com.google.android.libraries.search.p2998g.p2999a.C38375p) r4
            r3.getClass()
            r4.f101609e = r3
            int r3 = r4.f101605a
            r3 = r3 | r6
            r4.f101605a = r3
        L_0x05e5:
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.libraries.search.g.a.p r3 = (com.google.android.libraries.search.p2998g.p2999a.C38375p) r3
            r1.getClass()
            r3.f101610f = r1
            int r1 = r3.f101605a
            r1 = r1 | 16
            r3.f101605a = r1
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.android.libraries.search.g.a.p r1 = (com.google.android.libraries.search.p2998g.p2999a.C38375p) r1
            int r11 = r11 + -1
            r1.f101611g = r11
            int r3 = r1.f101605a
            r3 = r3 | 32
            r1.f101605a = r3
        L_0x0608:
            com.google.protobuf.bv r1 = r2.instance
            com.google.android.libraries.search.g.a.p r1 = (com.google.android.libraries.search.p2998g.p2999a.C38375p) r1
            int r1 = r1.f101611g
            int r1 = com.google.android.libraries.search.p2998g.p2999a.C38374o.m67655a(r1)
            if (r1 != 0) goto L_0x0615
            goto L_0x0619
        L_0x0615:
            r3 = 10
            if (r1 == r3) goto L_0x062a
        L_0x0619:
            com.google.protobuf.bv r1 = r2.instance
            com.google.android.libraries.search.g.a.p r1 = (com.google.android.libraries.search.p2998g.p2999a.C38375p) r1
            int r1 = r1.f101611g
            int r1 = com.google.android.libraries.search.p2998g.p2999a.C38374o.m67655a(r1)
            if (r1 != 0) goto L_0x0626
            goto L_0x0667
        L_0x0626:
            r3 = 12
            if (r1 != r3) goto L_0x0667
        L_0x062a:
            com.google.protobuf.bv r1 = r2.instance
            com.google.android.libraries.search.g.a.p r1 = (com.google.android.libraries.search.p2998g.p2999a.C38375p) r1
            com.google.android.libraries.search.g.a.k r1 = r1.f101609e
            if (r1 != 0) goto L_0x0634
            com.google.android.libraries.search.g.a.k r1 = com.google.android.libraries.search.p2998g.p2999a.C38370k.f101593f
        L_0x0634:
            com.google.android.libraries.search.g.a.f r1 = r1.f101598d
            if (r1 != 0) goto L_0x063a
            com.google.android.libraries.search.g.a.f r1 = com.google.android.libraries.search.p2998g.p2999a.C38365f.f101578c
        L_0x063a:
            int r3 = r1.f101580a
            r4 = 2
            if (r3 != r4) goto L_0x0644
            java.lang.Object r1 = r1.f101581b
            com.google.android.libraries.search.g.a.u r1 = (com.google.android.libraries.search.p2998g.p2999a.C38380u) r1
            goto L_0x0646
        L_0x0644:
            com.google.android.libraries.search.g.a.u r1 = com.google.android.libraries.search.p2998g.p2999a.C38380u.f101620d
        L_0x0646:
            java.lang.String r1 = com.google.android.apps.gsa.staticplugins.deeplink.p7792d.C99497a.m165019a(r1)
            java.util.Map r3 = r0.f278348h
            java.lang.Object r1 = r3.get(r1)
            g.a.a r1 = (p5460g.p5461a.C69464a) r1
            if (r1 == 0) goto L_0x0667
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.libraries.search.g.i r1 = (com.google.android.libraries.search.p2998g.C38393i) r1
            com.google.protobuf.bv r3 = r2.build()
            com.google.android.libraries.search.g.a.p r3 = (com.google.android.libraries.search.p2998g.p2999a.C38375p) r3
            boolean r1 = r0.m164995b(r1, r3)
            if (r1 == 0) goto L_0x0667
            return
        L_0x0667:
            com.google.protobuf.bv r1 = r2.build()
            com.google.android.libraries.search.g.a.p r1 = (com.google.android.libraries.search.p2998g.p2999a.C38375p) r1
            com.google.android.apps.gsa.search.shared.service.c r2 = r0.f278343c
            com.google.android.apps.gsa.search.shared.service.t r3 = new com.google.android.apps.gsa.search.shared.service.t
            r3.<init>()
            com.google.android.apps.gsa.search.shared.service.ClientConfig r4 = f278341l
            com.google.android.apps.gsa.search.shared.service.b r2 = r2.mo81990a(r3, r4)
            r0.f278351k = r2
            com.google.android.apps.gsa.search.shared.service.ah r2 = new com.google.android.apps.gsa.search.shared.service.ah
            com.google.android.apps.gsa.search.shared.service.b r3 = r0.f278351k
            com.google.android.apps.gsa.search.shared.service.aa r4 = r3.f237037a
            r2.<init>(r4)
            r0.f278349i = r2
            android.content.Intent r2 = r20.getIntent()
            r4 = r21
            r3.mo81784Q(r2, r4)
            com.google.android.apps.gsa.staticplugins.deeplink.activity.a r2 = new com.google.android.apps.gsa.staticplugins.deeplink.activity.a
            r2.<init>(r0)
            r0.f278350j = r2
            com.google.android.apps.gsa.search.shared.service.ah r3 = r0.f278349i
            r4 = 3
            com.google.android.apps.gsa.search.shared.service.b.um[] r4 = new com.google.android.apps.gsa.search.shared.service.p6935b.C88244um[r4]
            com.google.android.apps.gsa.search.shared.service.b.um r6 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.START_ACTIVITY
            r7 = 0
            r4[r7] = r6
            com.google.android.apps.gsa.search.shared.service.b.um r6 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.START_ACTIVITY_FOR_RESULT
            r4[r5] = r6
            com.google.android.apps.gsa.search.shared.service.b.um r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.HANDLE_DEEPLINK_DONE
            r6 = 2
            r4[r6] = r5
            r3.mo81959a(r2, r4)
            com.google.android.apps.gsa.search.shared.service.ah r2 = r0.f278349i
            com.google.android.apps.gsa.search.shared.service.j r3 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.DEEPLINK
            r3.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r4)
            com.google.protobuf.bt r4 = com.google.android.libraries.search.p2998g.p2999a.C38371l.f101601a
            r3.mo82014b(r4, r1)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r1 = r3.mo82013a()
            r2.mo81961c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.deeplink.activity.DeeplinkActivity.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        super.onDestroy();
        C87690b bVar = this.f278351k;
        if (bVar != null) {
            bVar.mo81809ap();
        }
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C87690b bVar = this.f278351k;
        if (bVar != null) {
            bVar.mo81976b(intent);
        }
    }

    public final void onPause() {
        super.onPause();
    }

    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        C87690b bVar = this.f278351k;
        if (bVar != null) {
            bVar.f237039c = null;
            bVar.f237038b = bundle;
        }
    }

    public final void onResume() {
        super.onResume();
        C87690b bVar = this.f278351k;
        if (bVar != null) {
            bVar.mo81788U();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C87690b bVar = this.f278351k;
        if (bVar != null) {
            bVar.f237037a.mo81942n(bundle);
        }
    }

    public final void onStart() {
        super.onStart();
        C87690b bVar = this.f278351k;
        if (bVar != null) {
            bVar.mo81790W();
        }
    }

    public final void onStop() {
        super.onStop();
        C87690b bVar = this.f278351k;
        if (bVar != null) {
            bVar.mo81791X(false);
        }
    }

    public final void onTopResumedActivityChanged(boolean z) {
        C87690b bVar = this.f278351k;
        if (bVar != null) {
            bVar.f237037a.mo81938j(z);
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C87690b bVar = this.f278351k;
        if (bVar != null) {
            bVar.mo81792Y(z);
        }
    }
}
