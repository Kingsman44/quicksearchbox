package com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2623d;

import android.content.Context;
import com.google.android.apps.gsa.binaries.satin.app.aqs;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33725a;
import com.google.android.libraries.search.assistant.p2714o.C34919e;
import com.google.android.libraries.search.assistant.p2828y.p2853n.C37015l;
import com.google.android.libraries.search.assistant.performer.p2757g.p2758a.C36029l;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.b.d.g */
/* compiled from: PG */
public final class C33755g implements C33725a {

    /* renamed from: b */
    private static final C59071e f90143b = C59071e.m91331h();

    /* renamed from: a */
    public final C36029l f90144a;

    /* renamed from: c */
    private final C71422aw f90145c;

    /* renamed from: d */
    private final Context f90146d;

    /* renamed from: e */
    private final C34919e f90147e;

    /* renamed from: f */
    private final C33754f f90148f;

    /* renamed from: g */
    private final aqs f90149g;

    /* renamed from: com.google.android.libraries.search.assistant.invocation.f.b.d.g$a */
    /* compiled from: PG */
    public interface C33756a {
        /* renamed from: fH */
        C37015l mo39063fH();
    }

    public C33755g(C71422aw awVar, Context context, C36029l lVar, C34919e eVar, C33754f fVar, aqs aqs) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(context, "context");
        C69664n.m101061g(lVar, "mediaControllerAccessor");
        C69664n.m101061g(aqs, "appFlowLoggerFactory");
        this.f90145c = awVar;
        this.f90146d = context;
        this.f90144a = lVar;
        this.f90147e = eVar;
        this.f90148f = fVar;
        this.f90149g = aqs;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39041a(com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33729b r5, com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp r6, com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d r7, p5462h.p5466c.C69577g r8) {
        /*
            r4 = this;
            boolean r7 = r8 instanceof com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2623d.C33757h
            if (r7 == 0) goto L_0x0013
            r7 = r8
            com.google.android.libraries.search.assistant.invocation.f.b.d.h r7 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2623d.C33757h) r7
            int r0 = r7.f90154e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r7.f90154e = r0
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.f.b.d.h r7 = new com.google.android.libraries.search.assistant.invocation.f.b.d.h
            r7.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r7.f90152c
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r7.f90154e
            r2 = 1
            if (r1 == 0) goto L_0x0033
            if (r1 != r2) goto L_0x002b
            java.lang.Object r5 = r7.f90151b
            java.lang.Object r6 = r7.f90150a
            p5462h.C69714l.m101134b(r8)
            goto L_0x005f
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            p5462h.C69714l.m101134b(r8)
            com.google.android.apps.gsa.binaries.satin.app.aqs r8 = r4.f90149g
            com.google.android.libraries.search.assistant.invocation.o.c.a r1 = r5.f90080a
            com.google.android.libraries.search.assistant.invocation.k.a.c r8 = r8.mo67207a(r1, r6)
            com.google.android.libraries.search.b.i.g r1 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97109fO
            java.lang.String r3 = "APA_MEDIA_CONTEXT_ACQUISITION_START"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)
            j.a.c.c.a.ew r3 = r8.f90466b
            com.google.android.libraries.search.b.i.a r1 = r1.mo40779c()
            r8.mo39128a(r1, r3)
            com.google.android.libraries.search.assistant.invocation.f.b.d.f r1 = r4.f90148f
            r7.f90150a = r8
            r7.f90151b = r1
            r7.f90154e = r2
            java.lang.Object r5 = r4.mo39062b(r5, r8, r6, r7)
            if (r5 == r0) goto L_0x0089
            r6 = r8
            r8 = r5
            r5 = r1
        L_0x005f:
            com.google.assistant.e.i.a.id r8 = (com.google.assistant.p3897e.p3917i.p3918a.C51450id) r8
            com.google.android.libraries.search.assistant.invocation.f.b.d.e r7 = new com.google.android.libraries.search.assistant.invocation.f.b.d.e
            com.google.android.libraries.search.assistant.invocation.f.b.d.f r5 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2623d.C33754f) r5
            g.a.a r5 = r5.f90142a
            java.lang.Object r5 = r5.mo17428b()
            com.google.android.libraries.f.a r5 = (com.google.android.libraries.p1730f.C21370a) r5
            r5.getClass()
            r8.getClass()
            r7.<init>(r5, r8)
            com.google.android.libraries.search.b.i.g r5 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97112fR
            java.lang.String r8 = "APA_MEDIA_CONTEXT_ACQUISITION_END"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r8)
            com.google.android.libraries.search.assistant.invocation.k.a.c r6 = (com.google.android.libraries.search.assistant.invocation.p2641k.p2642a.C33917c) r6
            j.a.c.c.a.ew r8 = r6.f90466b
            com.google.android.libraries.search.b.i.a r5 = r5.mo40779c()
            r6.mo39128a(r5, r8)
            return r7
        L_0x0089:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2623d.C33755g.mo39041a(com.google.android.libraries.search.assistant.invocation.f.b.b, com.google.android.libraries.search.assistant.invocation.o.a.bp, com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: com.google.android.libraries.search.assistant.invocation.k.a.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: com.google.android.libraries.search.assistant.invocation.k.a.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: com.google.android.libraries.search.assistant.invocation.k.a.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: com.google.android.libraries.search.assistant.invocation.k.a.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: com.google.frameworks.client.a.a.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39062b(com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33729b r19, com.google.android.libraries.search.assistant.invocation.p2641k.p2642a.C33917c r20, com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp r21, p5462h.p5466c.C69577g r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r22
            boolean r2 = r1 instanceof com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2623d.C33758i
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.google.android.libraries.search.assistant.invocation.f.b.d.i r2 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2623d.C33758i) r2
            int r3 = r2.f90162h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f90162h = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.libraries.search.assistant.invocation.f.b.d.i r2 = new com.google.android.libraries.search.assistant.invocation.f.b.d.i
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f90160f
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f90162h
            r5 = 3
            r6 = 2
            java.lang.String r7 = "INV.MediaCxt.Strategy"
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L_0x0068
            if (r4 == r8) goto L_0x0058
            if (r4 == r6) goto L_0x0042
            if (r4 != r5) goto L_0x003a
            java.lang.Object r2 = r2.f90155a
            com.google.frameworks.client.a.a.b r2 = (com.google.frameworks.client.p4624a.p4625a.C61301b) r2
            p5462h.C69714l.m101134b(r1)
            r12 = r2
            goto L_0x01c1
        L_0x003a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0042:
            java.lang.Object r4 = r2.f90159e
            java.lang.Object r10 = r2.f90158d
            java.lang.Object r11 = r2.f90157c
            java.lang.Object r12 = r2.f90156b
            java.lang.Object r13 = r2.f90155a
            com.google.android.libraries.search.assistant.invocation.f.b.d.g r13 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2623d.C33755g) r13
            p5462h.C69714l.m101134b(r1)
            r16 = r10
            r10 = r4
            r4 = r16
            goto L_0x0125
        L_0x0058:
            java.lang.Object r4 = r2.f90158d
            java.lang.Object r10 = r2.f90157c
            java.lang.Object r11 = r2.f90156b
            java.lang.Object r12 = r2.f90155a
            com.google.android.libraries.search.assistant.invocation.f.b.d.g r12 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2623d.C33755g) r12
            p5462h.C69714l.m101134b(r1)
            r13 = r12
            r12 = r10
            goto L_0x00ac
        L_0x0068:
            p5462h.C69714l.m101134b(r1)
            com.google.frameworks.client.a.a.b r4 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r21)
            com.google.common.f.e r1 = f90143b
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r10, r7)
            com.google.common.f.n r10 = new com.google.common.f.n
            r11 = 51279(0xc84f, float:7.1857E-41)
            r10.<init>(r11)
            r1.mo56379ah(r10)
            java.lang.String r10 = "Getting active media controller for %s."
            r1.mo56389s(r10, r4)
            kotlinx.coroutines.aw r1 = r0.f90145c
            h.c.o r1 = r1.mo5702lZ()
            com.google.android.libraries.search.assistant.invocation.f.b.d.j r10 = new com.google.android.libraries.search.assistant.invocation.f.b.d.j
            r10.<init>(r0, r9)
            r2.f90155a = r0
            r11 = r19
            r2.f90156b = r11
            r12 = r20
            r2.f90157c = r12
            r2.f90158d = r4
            r2.f90162h = r8
            java.lang.Object r1 = kotlinx.coroutines.C71803m.m105040a(r1, r10, r2)
            if (r1 == r3) goto L_0x021e
            r13 = r0
        L_0x00ac:
            j$.util.Optional r1 = (p3186j$.util.Optional) r1
            com.google.android.libraries.search.b.i.g r10 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97110fP
            java.lang.String r14 = "APA_MEDIA_CONTEXT_GET_ACTIVE_CONTROLLER_END"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r14)
            r14 = r12
            com.google.android.libraries.search.assistant.invocation.k.a.c r14 = (com.google.android.libraries.search.assistant.invocation.p2641k.p2642a.C33917c) r14
            j.a.c.c.a.ew r15 = r14.f90466b
            com.google.android.libraries.search.b.i.a r10 = r10.mo40779c()
            r14.mo39128a(r10, r15)
            boolean r10 = r1.isPresent()
            if (r10 != 0) goto L_0x00e4
            com.google.common.f.e r10 = f90143b
            com.google.common.f.x r10 = r10.mo56224b()
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r14, r7)
            com.google.common.f.n r14 = new com.google.common.f.n
            r15 = 51284(0xc854, float:7.1864E-41)
            r14.<init>(r15)
            r10.mo56379ah(r14)
            java.lang.String r14 = "Media controller not found for %s."
            r10.mo56389s(r14, r4)
        L_0x00e4:
            com.google.common.f.e r10 = f90143b
            com.google.common.f.x r10 = r10.mo56224b()
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r14, r7)
            com.google.common.f.n r14 = new com.google.common.f.n
            r15 = 51280(0xc850, float:7.1859E-41)
            r14.<init>(r15)
            r10.mo56379ah(r14)
            java.lang.String r14 = "Getting foreground app for %s."
            r10.mo56389s(r14, r4)
            com.google.android.libraries.search.assistant.o.e r10 = r13.f90147e
            com.google.android.libraries.search.assistant.o.a.n r10 = (com.google.android.libraries.search.assistant.p2714o.p2715a.C34913n) r10
            com.google.common.util.concurrent.cx r10 = r10.mo39623a()
            r2.f90155a = r13
            r2.f90156b = r11
            r2.f90157c = r12
            r2.f90158d = r4
            r2.f90159e = r1
            r2.f90162h = r6
            java.lang.Object r10 = kotlinx.coroutines.p5578d.C71663i.m104690c(r10, r2)
            if (r10 == r3) goto L_0x021e
            r16 = r10
            r10 = r1
            r1 = r16
            r17 = r12
            r12 = r11
            r11 = r17
        L_0x0125:
            com.google.android.libraries.search.assistant.o.c r1 = (com.google.android.libraries.search.assistant.p2714o.C34917c) r1
            j$.util.Optional r1 = r1.mo39613b()
            boolean r14 = r1.isPresent()
            if (r14 == 0) goto L_0x013c
            java.lang.Object r1 = r1.get()
            android.content.ComponentName r1 = (android.content.ComponentName) r1
            java.lang.String r1 = r1.getPackageName()
            goto L_0x015b
        L_0x013c:
            com.google.common.f.e r1 = f90143b
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r14, r7)
            com.google.common.f.n r14 = new com.google.common.f.n
            r15 = 51281(0xc851, float:7.186E-41)
            r14.<init>(r15)
            r1.mo56379ah(r14)
            java.lang.String r14 = "No foreground app returned for %s."
            r1.mo56389s(r14, r4)
            java.lang.String r1 = ""
        L_0x015b:
            java.lang.String r14 = "if (componentName.isPres…ingId)\n        \"\"\n      }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r14)
            com.google.android.libraries.search.b.i.g r14 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97111fQ
            java.lang.String r15 = "APA_MEDIA_CONTEXT_GET_FOREGROUND_APP_END"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r15)
            com.google.android.libraries.search.assistant.invocation.k.a.c r11 = (com.google.android.libraries.search.assistant.invocation.p2641k.p2642a.C33917c) r11
            j.a.c.c.a.ew r15 = r11.f90466b
            com.google.android.libraries.search.b.i.a r14 = r14.mo40779c()
            r11.mo39128a(r14, r15)
            com.google.common.f.e r11 = f90143b
            com.google.common.f.x r11 = r11.mo56224b()
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.mo56378ag(r14, r7)
            com.google.common.f.n r14 = new com.google.common.f.n
            r15 = 51282(0xc852, float:7.1861E-41)
            r14.<init>(r15)
            r11.mo56379ah(r14)
            java.lang.String r14 = "Getting mediaParams for %s."
            r11.mo56389s(r14, r4)
            android.content.Context r11 = r13.f90146d
            com.google.android.libraries.search.assistant.invocation.f.b.b r12 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33729b) r12
            com.google.android.libraries.search.assistant.invocation.o.c.a r12 = r12.f90080a
            com.google.apps.tiktok.account.AccountId r12 = r12.f90870b
            java.lang.Class<com.google.android.libraries.search.assistant.invocation.f.b.d.g$a> r13 = com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2623d.C33755g.C33756a.class
            java.lang.Object r11 = com.google.apps.tiktok.inject.C47245e.m84045a(r11, r13, r12)
            com.google.android.libraries.search.assistant.invocation.f.b.d.g$a r11 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2623d.C33755g.C33756a) r11
            com.google.android.libraries.search.assistant.y.n.l r11 = r11.mo39063fH()
            com.google.android.libraries.search.assistant.y.n.b r12 = new com.google.android.libraries.search.assistant.y.n.b
            r12.<init>(r1, r8)
            j$.util.Optional r10 = (p3186j$.util.Optional) r10
            com.google.common.util.concurrent.cx r1 = r11.mo40535a(r10, r12)
            r2.f90155a = r4
            r2.f90156b = r9
            r2.f90157c = r9
            r2.f90158d = r9
            r2.f90159e = r9
            r2.f90162h = r5
            java.lang.Object r1 = kotlinx.coroutines.p5578d.C71663i.m104690c(r1, r2)
            if (r1 == r3) goto L_0x021e
            r12 = r4
        L_0x01c1:
            j$.util.Optional r1 = (p3186j$.util.Optional) r1
            com.google.assistant.e.i.a.id r2 = com.google.assistant.p3897e.p3917i.p3918a.C51450id.f133992h
            java.lang.Object r1 = r1.orElse(r2)
            com.google.assistant.e.i.a.id r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51450id) r1
            com.google.common.f.e r2 = f90143b
            com.google.common.f.x r2 = r2.mo56224b()
            r10 = r2
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r2, r7)
            if (r1 == 0) goto L_0x01e8
            com.google.protobuf.cq r2 = r1.f133995b
            int r2 = r2.size()
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
            r13 = r3
            goto L_0x01e9
        L_0x01e8:
            r13 = r9
        L_0x01e9:
            r2 = 0
            if (r1 == 0) goto L_0x01fa
            int r3 = r1.f133994a
            r3 = r3 & r6
            if (r3 == 0) goto L_0x01f3
            r3 = 1
            goto L_0x01f4
        L_0x01f3:
            r3 = 0
        L_0x01f4:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r14 = r3
            goto L_0x01fb
        L_0x01fa:
            r14 = r9
        L_0x01fb:
            if (r1 == 0) goto L_0x0207
            int r3 = r1.f133994a
            r3 = r3 & r8
            if (r8 == r3) goto L_0x0203
            r8 = 0
        L_0x0203:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)
        L_0x0207:
            r15 = r9
            com.google.common.f.n r2 = new com.google.common.f.n
            r3 = 51283(0xc853, float:7.1863E-41)
            r2.<init>(r3)
            r10.mo56379ah(r2)
            java.lang.String r11 = "Finished getting mediaParams for %s: mediaSessionCount - %s, hasStickyApp - %s, hasMediaFocus - %s."
            r10.mo56360M(r11, r12, r13, r14, r15)
            java.lang.String r2 = "mediaParams"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            return r1
        L_0x021e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2623d.C33755g.mo39062b(com.google.android.libraries.search.assistant.invocation.f.b.b, com.google.android.libraries.search.assistant.invocation.k.a.c, com.google.android.libraries.search.assistant.invocation.o.a.bp, h.c.g):java.lang.Object");
    }
}
