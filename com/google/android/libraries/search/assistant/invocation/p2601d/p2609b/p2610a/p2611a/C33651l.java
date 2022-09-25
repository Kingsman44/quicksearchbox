package com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a;

import com.google.android.apps.gsa.binaries.satin.app.asl;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.C33660c;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.C33662e;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.p2904c.C37452ca;
import com.google.android.libraries.search.p2904c.C37677hx;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.util.Optional;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.b.a.a.l */
/* compiled from: PG */
public final class C33651l implements C33660c {

    /* renamed from: a */
    public static final C59071e f89922a = C59071e.m91331h();

    /* renamed from: b */
    public final C34053bp f89923b;

    /* renamed from: c */
    public final Executor f89924c;

    /* renamed from: d */
    public C37677hx f89925d;

    /* renamed from: e */
    public C33653n f89926e;

    /* renamed from: f */
    public final asl f89927f;

    /* renamed from: g */
    private final C37452ca f89928g;

    /* renamed from: h */
    private final C71422aw f89929h;

    /* renamed from: i */
    private final C71422aw f89930i;

    /* renamed from: j */
    private Optional f89931j;

    /* renamed from: k */
    private C33662e f89932k;

    /* renamed from: l */
    private Optional f89933l;

    /* renamed from: m */
    private final C69613f f89934m = new C69747m(new C33650k(this));

    public C33651l(C34053bp bpVar, asl asl, C37452ca caVar, C71422aw awVar, Executor executor, C71422aw awVar2) {
        C69664n.m101061g(bpVar, "invocationToken");
        C69664n.m101061g(asl, "streamingGrpcDelegateFactory");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(awVar2, "blockingScope");
        this.f89923b = bpVar;
        this.f89927f = asl;
        this.f89928g = caVar;
        this.f89929h = awVar;
        this.f89924c = executor;
        this.f89930i = awVar2;
    }

    /* renamed from: a */
    public final C33662e mo39012a() {
        C33662e eVar = this.f89932k;
        if (eVar != null) {
            return eVar;
        }
        C69664n.m101065k("audioInputConfig");
        return null;
    }

    /* renamed from: b */
    public final C60870cx mo39013b() {
        return C71663i.m104692e(this.f89929h, (C71424ay) null, new C33645f(this, (C69577g) null), 3);
    }

    /* renamed from: c */
    public final Optional mo39014c() {
        Optional optional = this.f89933l;
        if (optional != null) {
            return optional;
        }
        C69664n.m101065k("hotwordEvent");
        return null;
    }

    public final void close() {
        C71803m.m105043d(this.f89930i, (C69585o) null, (C71424ay) null, new C33644e(this, (C69577g) null), 3);
    }

    /* renamed from: d */
    public final Optional mo39016d() {
        Optional optional = this.f89931j;
        if (optional != null) {
            return optional;
        }
        C69664n.m101065k("micOpenElapsedRealtime");
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39017e(com.google.android.libraries.search.p2904c.C37400be r5, p5462h.p5466c.C69577g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33646g
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.libraries.search.assistant.invocation.d.b.a.a.g r0 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33646g) r0
            int r1 = r0.f89907c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f89907c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.d.b.a.a.g r0 = new com.google.android.libraries.search.assistant.invocation.d.b.a.a.g
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f89905a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f89907c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r6)
            goto L_0x0053
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r6)
            com.google.common.base.ax r6 = r5.mo40932d()
            boolean r6 = r6.mo56113h()
            if (r6 == 0) goto L_0x006b
            com.google.common.base.ax r5 = r5.mo40932d()
            java.lang.Object r5 = r5.mo56107c()
            java.lang.String r6 = "firstByteReadResult.get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            com.google.common.util.concurrent.cx r5 = (com.google.common.util.concurrent.C60870cx) r5
            r0.f89907c = r3
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r6 == r1) goto L_0x006a
        L_0x0053:
            com.google.android.libraries.search.c.bb r6 = (com.google.android.libraries.search.p2904c.C37397bb) r6
            int r5 = r6.f99322a
            r5 = r5 & r3
            if (r5 == 0) goto L_0x006b
            long r5 = r6.f99323b
            j$.time.Duration r5 = p3186j$.time.Duration.ofMillis(r5)
            j$.util.Optional r5 = p3186j$.util.Optional.m71637of(r5)
            java.lang.String r6 = "of(Duration.ofMillis(res…teReadElapsedRealtimeMs))"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            return r5
        L_0x006a:
            return r1
        L_0x006b:
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            java.lang.String r6 = "empty()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33651l.mo39017e(com.google.android.libraries.search.c.be, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: j$.util.function.Consumer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: j$.util.function.Consumer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: j$.util.function.Consumer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39018f(p3186j$.util.function.Consumer r18, p5462h.p5466c.C69577g r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33647h
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.google.android.libraries.search.assistant.invocation.d.b.a.a.h r2 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33647h) r2
            int r3 = r2.f89914g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f89914g = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.libraries.search.assistant.invocation.d.b.a.a.h r2 = new com.google.android.libraries.search.assistant.invocation.d.b.a.a.h
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f89912e
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f89914g
            java.lang.String r5 = "readOnlyListeningSession"
            r6 = 5
            java.lang.String r7 = "grpcSession"
            r8 = 3
            r9 = 4
            r10 = 0
            r11 = 1
            r12 = 2
            if (r4 == 0) goto L_0x007e
            if (r4 == r11) goto L_0x0072
            if (r4 == r12) goto L_0x0064
            if (r4 == r8) goto L_0x0055
            if (r4 == r9) goto L_0x0047
            if (r4 != r6) goto L_0x003f
            java.lang.Object r2 = r2.f89908a
            p5462h.C69714l.m101134b(r1)
            goto L_0x0365
        L_0x003f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0047:
            java.lang.Object r4 = r2.f89910c
            com.google.android.libraries.search.c.be r4 = (com.google.android.libraries.search.p2904c.C37400be) r4
            java.lang.Object r5 = r2.f89909b
            java.lang.Object r8 = r2.f89908a
            p5462h.C69714l.m101134b(r1)
            r14 = r8
            goto L_0x027e
        L_0x0055:
            java.lang.Object r4 = r2.f89911d
            java.lang.Object r8 = r2.f89910c
            com.google.android.libraries.search.c.be r8 = (com.google.android.libraries.search.p2904c.C37400be) r8
            java.lang.Object r13 = r2.f89909b
            java.lang.Object r14 = r2.f89908a
            p5462h.C69714l.m101134b(r1)
            goto L_0x0252
        L_0x0064:
            java.lang.Object r4 = r2.f89909b
            java.lang.Object r13 = r2.f89908a
            p5462h.C69714l.m101134b(r1)
            r16 = r13
            r13 = r4
            r4 = r16
            goto L_0x0235
        L_0x0072:
            java.lang.Object r4 = r2.f89910c
            com.google.android.libraries.search.assistant.invocation.d.b.a.a.l r4 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33651l) r4
            java.lang.Object r13 = r2.f89909b
            java.lang.Object r14 = r2.f89908a
            p5462h.C69714l.m101134b(r1)
            goto L_0x00bb
        L_0x007e:
            p5462h.C69714l.m101134b(r1)
            com.google.common.f.e r1 = f89922a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.android.libraries.search.assistant.invocation.o.a.bp r4 = r0.f89923b
            com.google.frameworks.client.a.a.b r4 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r4)
            com.google.common.f.n r13 = new com.google.common.f.n
            r14 = 51253(0xc835, float:7.1821E-41)
            r13.<init>(r14)
            r1.mo56379ah(r13)
            java.lang.String r13 = "Opening the audio input session with invocation token (%s)..."
            r1.mo56389s(r13, r4)
            h.f r1 = r0.f89934m
            java.lang.Object r1 = r1.mo5768a()
            com.google.android.libraries.search.assistant.invocation.d.b.a.a.s r1 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33658s) r1
            com.google.android.libraries.search.assistant.invocation.o.a.bp r4 = r0.f89923b
            r2.f89908a = r0
            r13 = r18
            r2.f89909b = r13
            r2.f89910c = r0
            r2.f89914g = r11
            java.lang.Object r1 = r1.mo39023a(r4, r2)
            if (r1 == r3) goto L_0x0388
            r4 = r0
            r14 = r4
        L_0x00bb:
            com.google.android.libraries.search.assistant.invocation.d.b.a.a.n r1 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33653n) r1
            r4.f89926e = r1
            r1 = r14
            com.google.android.libraries.search.assistant.invocation.d.b.a.a.l r1 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33651l) r1
            com.google.android.libraries.search.assistant.invocation.d.b.a.a.n r4 = r1.f89926e
            if (r4 != 0) goto L_0x00ca
            p5462h.p5473f.p5475b.C69664n.m101065k(r7)
            r4 = r10
        L_0x00ca:
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.m r4 = r4.mo39020a()
            int r15 = r4.f90004a
            if (r15 != r12) goto L_0x0138
            java.lang.Object r2 = r4.f90005b
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.c r2 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33675c) r2
            java.lang.String r2 = r2.f89986b
            java.lang.String r3 = "openSessionResponse.exception.msg"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            int r3 = r4.f90004a
            if (r3 != r12) goto L_0x00e6
            java.lang.Object r3 = r4.f90005b
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.c r3 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33675c) r3
            goto L_0x00e8
        L_0x00e6:
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.c r3 = com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33675c.f89983c
        L_0x00e8:
            int r3 = r3.f89985a
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.b r3 = com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33674b.m62278a(r3)
            if (r3 != 0) goto L_0x00f2
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.b r3 = com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33674b.UNRECOGNIZED
        L_0x00f2:
            int r3 = r3.ordinal()
            if (r3 == r11) goto L_0x010e
            if (r3 == r12) goto L_0x0108
            if (r3 == r8) goto L_0x0102
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            goto L_0x0113
        L_0x0102:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>(r2)
            goto L_0x0113
        L_0x0108:
            com.google.android.libraries.search.assistant.invocation.b.g r3 = new com.google.android.libraries.search.assistant.invocation.b.g
            r3.<init>(r2)
            goto L_0x0113
        L_0x010e:
            com.google.android.libraries.search.assistant.invocation.b.a r3 = new com.google.android.libraries.search.assistant.invocation.b.a
            r3.<init>(r2)
        L_0x0113:
            com.google.common.f.e r2 = f89922a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.x r2 = r2.mo56382g(r3)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.android.libraries.search.assistant.invocation.o.a.bp r1 = r1.f89923b
            com.google.frameworks.client.a.a.b r1 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r1)
            com.google.common.f.n r4 = new com.google.common.f.n
            r5 = 51261(0xc83d, float:7.1832E-41)
            r4.<init>(r5)
            r2.mo56379ah(r4)
            java.lang.String r4 = "A failure happened on the internal audio input service when opening the audio input session with invocation token (%s)."
            r2.mo56389s(r4, r1)
            throw r3
        L_0x0138:
            if (r15 != r11) goto L_0x013f
            java.lang.Object r15 = r4.f90005b
            com.google.android.apps.search.assistant.platform.j.b.b.c.at r15 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121771at) r15
            goto L_0x0141
        L_0x013f:
            com.google.android.apps.search.assistant.platform.j.b.b.c.at r15 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121771at.f337934d
        L_0x0141:
            java.lang.String r6 = "openSessionResponse.startListeningResult"
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r6)
            int r6 = r15.f337936a
            if (r6 != r12) goto L_0x0186
            com.google.common.f.e r2 = f89922a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.android.libraries.search.assistant.invocation.o.a.bp r1 = r1.f89923b
            com.google.frameworks.client.a.a.b r1 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r1)
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 51260(0xc83c, float:7.183E-41)
            r3.<init>(r4)
            r2.mo56379ah(r3)
            java.lang.String r3 = "Fail to start listening with invocation token (%s)."
            r2.mo56389s(r3, r1)
            com.google.android.libraries.search.assistant.invocation.d.b.a.f r1 = new com.google.android.libraries.search.assistant.invocation.d.b.a.f
            com.google.android.libraries.search.c.eb r2 = r15.f337938c
            if (r2 != 0) goto L_0x0170
            com.google.android.libraries.search.c.eb r2 = com.google.android.libraries.search.p2904c.C37561eb.f99800c
        L_0x0170:
            java.lang.String r3 = "listeningResult.audioSourceOpeningStatus"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            int r3 = r15.f337936a
            if (r3 != r12) goto L_0x017e
            java.lang.Object r3 = r15.f337937b
            com.google.android.apps.search.assistant.platform.j.b.b.c.bd r3 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121782bd) r3
            goto L_0x0180
        L_0x017e:
            com.google.android.apps.search.assistant.platform.j.b.b.c.bd r3 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121782bd.f337952c
        L_0x0180:
            java.lang.String r3 = r3.f337955b
            r1.<init>(r2, r3)
            throw r1
        L_0x0186:
            int r6 = r4.f90004a
            if (r6 != r11) goto L_0x018f
            java.lang.Object r4 = r4.f90005b
            com.google.android.apps.search.assistant.platform.j.b.b.c.at r4 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121771at) r4
            goto L_0x0191
        L_0x018f:
            com.google.android.apps.search.assistant.platform.j.b.b.c.at r4 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121771at.f337934d
        L_0x0191:
            int r6 = r4.f337936a
            if (r6 != r11) goto L_0x019a
            java.lang.Object r4 = r4.f337937b
            com.google.android.apps.search.assistant.platform.j.b.b.c.bf r4 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121784bf) r4
            goto L_0x019c
        L_0x019a:
            com.google.android.apps.search.assistant.platform.j.b.b.c.bf r4 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121784bf.f337956e
        L_0x019c:
            java.lang.String r6 = "openSessionResponse.star…artListeningResultSuccess"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r6)
            int r6 = r4.f337958a
            r6 = r6 & r11
            if (r6 == 0) goto L_0x01c7
            com.google.android.libraries.search.n.aj r6 = r4.f337960c
            if (r6 != 0) goto L_0x01ac
            com.google.android.libraries.search.n.aj r6 = com.google.android.libraries.search.p3055n.C39260aj.f103414f
        L_0x01ac:
            int r6 = r6.f103417a
            r6 = r6 & r9
            if (r6 == 0) goto L_0x01c7
            com.google.android.libraries.search.n.aj r4 = r4.f337960c
            if (r4 != 0) goto L_0x01b7
            com.google.android.libraries.search.n.aj r4 = com.google.android.libraries.search.p3055n.C39260aj.f103414f
        L_0x01b7:
            com.google.speech.j.je r4 = r4.f103420d
            if (r4 != 0) goto L_0x01bd
            com.google.speech.j.je r4 = com.google.speech.p5218j.C67050je.f182262f
        L_0x01bd:
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r4)
            java.lang.String r6 = "of(hotwordTriggeredEvent.hotwordEvent)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r6)
            goto L_0x01fc
        L_0x01c7:
            int r6 = r4.f337958a
            r6 = r6 & r12
            if (r6 == 0) goto L_0x01f3
            com.google.android.libraries.assistant.hotword.b.b r6 = r4.f337961d
            if (r6 != 0) goto L_0x01d2
            com.google.android.libraries.assistant.hotword.b.b r6 = com.google.android.libraries.assistant.hotword.p1516b.C18343b.f52029d
        L_0x01d2:
            com.google.speech.j.je r6 = r6.f52033c
            if (r6 != 0) goto L_0x01d8
            com.google.speech.j.je r6 = com.google.speech.p5218j.C67050je.f182262f
        L_0x01d8:
            int r6 = r6.f182264a
            r6 = r6 & r12
            if (r6 == 0) goto L_0x01f3
            com.google.android.libraries.assistant.hotword.b.b r4 = r4.f337961d
            if (r4 != 0) goto L_0x01e3
            com.google.android.libraries.assistant.hotword.b.b r4 = com.google.android.libraries.assistant.hotword.p1516b.C18343b.f52029d
        L_0x01e3:
            com.google.speech.j.je r4 = r4.f52033c
            if (r4 != 0) goto L_0x01e9
            com.google.speech.j.je r4 = com.google.speech.p5218j.C67050je.f182262f
        L_0x01e9:
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r4)
            java.lang.String r6 = "of(legacyHotwordEvent.hotwordEvent)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r6)
            goto L_0x01fc
        L_0x01f3:
            j$.util.Optional r4 = p3186j$.util.Optional.empty()
            java.lang.String r6 = "empty()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r6)
        L_0x01fc:
            r1.f89933l = r4
            com.google.android.libraries.search.c.ca r4 = r1.f89928g
            com.google.android.libraries.search.assistant.invocation.d.b.a.a.n r6 = r1.f89926e
            if (r6 != 0) goto L_0x0208
            p5462h.p5473f.p5475b.C69664n.m101065k(r7)
            r6 = r10
        L_0x0208:
            com.google.android.libraries.search.c.cc r6 = r6.mo39021b()
            com.google.android.libraries.search.c.hx r4 = r4.mo40977a(r6)
            java.lang.String r6 = "audioRequestReadOnlySess…(grpcSession.accessToken)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r6)
            r1.f89925d = r4
            if (r4 != 0) goto L_0x021d
            p5462h.p5473f.p5475b.C69664n.m101065k(r5)
            r4 = r10
        L_0x021d:
            com.google.common.util.concurrent.cx r1 = r4.mo20357d()
            java.lang.String r4 = "readOnlyListeningSession.startListeningResult"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r4)
            r2.f89908a = r14
            r2.f89909b = r13
            r2.f89910c = r10
            r2.f89914g = r12
            java.lang.Object r1 = kotlinx.coroutines.p5578d.C71663i.m104690c(r1, r2)
            if (r1 == r3) goto L_0x0388
            r4 = r14
        L_0x0235:
            com.google.android.libraries.search.c.be r1 = (com.google.android.libraries.search.p2904c.C37400be) r1
            java.lang.String r6 = "startListeningResult"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r6)
            r2.f89908a = r4
            r2.f89909b = r13
            r2.f89910c = r1
            r2.f89911d = r4
            r2.f89914g = r8
            r6 = r4
            com.google.android.libraries.search.assistant.invocation.d.b.a.a.l r6 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33651l) r6
            java.lang.Object r6 = r6.mo39017e(r1, r2)
            if (r6 == r3) goto L_0x0388
            r8 = r1
            r14 = r4
            r1 = r6
        L_0x0252:
            j$.util.Optional r1 = (p3186j$.util.Optional) r1
            com.google.android.libraries.search.assistant.invocation.d.b.a.a.l r4 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33651l) r4
            r4.f89931j = r1
            r1 = r14
            com.google.android.libraries.search.assistant.invocation.d.b.a.a.l r1 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33651l) r1
            com.google.android.libraries.search.c.hx r1 = r1.f89925d
            if (r1 != 0) goto L_0x0263
            p5462h.p5473f.p5475b.C69664n.m101065k(r5)
            r1 = r10
        L_0x0263:
            com.google.common.util.concurrent.cx r1 = r1.mo20355b()
            java.lang.String r4 = "readOnlyListeningSession.audioParams"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r4)
            r2.f89908a = r14
            r2.f89909b = r13
            r2.f89910c = r8
            r2.f89911d = r10
            r2.f89914g = r9
            java.lang.Object r1 = kotlinx.coroutines.p5578d.C71663i.m104690c(r1, r2)
            if (r1 == r3) goto L_0x0388
            r4 = r8
            r5 = r13
        L_0x027e:
            com.google.android.libraries.search.c.ay r1 = (com.google.android.libraries.search.p2904c.C37360ay) r1
            java.lang.String r6 = "audioLibInputParams"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r6)
            com.google.android.libraries.search.assistant.invocation.d.b.a.e r6 = com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.C33662e.f89956e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.search.assistant.invocation.d.b.a.d r6 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.C33661d) r6
            java.lang.String r8 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r8)
            java.lang.String r8 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r8)
            int r8 = r1.f99228c
            r6.copyOnWrite()
            com.google.protobuf.bv r13 = r6.instance
            com.google.android.libraries.search.assistant.invocation.d.b.a.e r13 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.C33662e) r13
            int r15 = r13.f89958a
            r15 = r15 | r11
            r13.f89958a = r15
            r13.f89959b = r8
            int r8 = r1.f99229d
            r6.copyOnWrite()
            com.google.protobuf.bv r13 = r6.instance
            com.google.android.libraries.search.assistant.invocation.d.b.a.e r13 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.C33662e) r13
            int r15 = r13.f89958a
            r12 = r12 | r15
            r13.f89958a = r12
            r13.f89960c = r8
            int r8 = r1.f99230e
            r6.copyOnWrite()
            com.google.protobuf.bv r12 = r6.instance
            com.google.android.libraries.search.assistant.invocation.d.b.a.e r12 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.C33662e) r12
            int r13 = r12.f89958a
            r9 = r9 | r13
            r12.f89958a = r9
            r12.f89961d = r8
            com.google.protobuf.bv r6 = r6.build()
            java.lang.String r8 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r8)
            com.google.android.libraries.search.assistant.invocation.d.b.a.e r6 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.C33662e) r6
            r8 = r14
            com.google.android.libraries.search.assistant.invocation.d.b.a.a.l r8 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33651l) r8
            r8.f89932k = r6
            com.google.common.base.ax r4 = r4.mo40931c()
            boolean r6 = r4.mo56113h()
            if (r6 != 0) goto L_0x0349
            com.google.common.f.e r2 = f89922a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            int r3 = r1.f99226a
            r3 = r3 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x02f0
            goto L_0x02f1
        L_0x02f0:
            r11 = 0
        L_0x02f1:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r11)
            boolean r1 = r1.f99236k
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.google.android.libraries.search.assistant.invocation.o.a.bp r4 = r8.f89923b
            com.google.frameworks.client.a.a.b r4 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r4)
            com.google.common.f.n r5 = new com.google.common.f.n
            r6 = 51259(0xc83b, float:7.1829E-41)
            r5.<init>(r6)
            r2.mo56379ah(r5)
            java.lang.String r5 = "Unable to get AudioBytesReceiverRegistry. Please check usePushMechanism is set. Current audioLibInputParams.hasUsePushMechanism() = %s, audioLibInputParams.usePushMechanism = %s, invocation token = %s."
            r2.mo56359L(r5, r3, r1, r4)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            com.google.android.libraries.search.assistant.invocation.d.b.a.a.n r2 = r8.f89926e
            if (r2 != 0) goto L_0x031b
            p5462h.p5473f.p5475b.C69664n.m101065k(r7)
            goto L_0x031c
        L_0x031b:
            r10 = r2
        L_0x031c:
            com.google.android.libraries.search.c.cc r2 = r10.mo39021b()
            int r2 = com.google.android.libraries.search.p2904c.p2906aa.C37330e.m66336a(r2)
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = r8.f89923b
            com.google.frameworks.client.a.a.b r3 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to get AudioBytesReceiverRegistry from Audio Library with AudioRequestSessionToken("
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = ") for token("
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = ")."
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            throw r1
        L_0x0349:
            java.lang.Object r1 = r4.mo56107c()
            java.lang.String r4 = "audioBytesReceiverRegistry.get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r4)
            com.google.android.libraries.search.c.c r1 = (com.google.android.libraries.search.p2904c.C37422c) r1
            r2.f89908a = r14
            r2.f89909b = r10
            r2.f89910c = r10
            r4 = 5
            r2.f89914g = r4
            java.lang.Object r1 = r8.mo39019g(r1, r5, r2)
            if (r1 != r3) goto L_0x0364
            return r3
        L_0x0364:
            r2 = r14
        L_0x0365:
            com.google.common.f.e r1 = f89922a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.android.libraries.search.assistant.invocation.d.b.a.a.l r2 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33651l) r2
            com.google.android.libraries.search.assistant.invocation.o.a.bp r2 = r2.f89923b
            com.google.frameworks.client.a.a.b r2 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r2)
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 51256(0xc838, float:7.1825E-41)
            r3.<init>(r4)
            r1.mo56379ah(r3)
            java.lang.String r3 = "Opened the audio input session with invocation token (%s)."
            r1.mo56389s(r3, r2)
            h.q r1 = p5462h.C69788q.f186170a
            return r1
        L_0x0388:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33651l.mo39018f(j$.util.function.Consumer, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39019g(com.google.android.libraries.search.p2904c.C37422c r5, p3186j$.util.function.Consumer r6, p5462h.p5466c.C69577g r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33648i
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.libraries.search.assistant.invocation.d.b.a.a.i r0 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33648i) r0
            int r1 = r0.f89918d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f89918d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.d.b.a.a.i r0 = new com.google.android.libraries.search.assistant.invocation.d.b.a.a.i
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f89916b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f89918d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r5 = r0.f89915a
            p5462h.C69714l.m101134b(r7)
            goto L_0x004d
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r7)
            com.google.android.libraries.search.assistant.invocation.d.b.a.a.j r7 = new com.google.android.libraries.search.assistant.invocation.d.b.a.a.j
            r7.<init>(r6, r4)
            com.google.common.util.concurrent.cx r5 = r5.mo40946j(r7)
            java.lang.String r6 = "private suspend fun Audi…ingId\n        )\n    }\n  }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            r0.f89915a = r4
            r0.f89918d = r3
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r7 == r1) goto L_0x008a
            r5 = r4
        L_0x004d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            if (r6 != 0) goto L_0x0087
            com.google.common.f.e r6 = f89922a
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.android.libraries.search.assistant.invocation.d.b.a.a.l r5 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33651l) r5
            com.google.android.libraries.search.assistant.invocation.d.b.a.a.n r7 = r5.f89926e
            if (r7 != 0) goto L_0x0069
            java.lang.String r7 = "grpcSession"
            p5462h.p5473f.p5475b.C69664n.m101065k(r7)
            r7 = 0
        L_0x0069:
            com.google.android.libraries.search.c.cc r7 = r7.mo39021b()
            int r7 = com.google.android.libraries.search.p2904c.p2906aa.C37330e.m66336a(r7)
            com.google.android.libraries.search.assistant.invocation.o.a.bp r5 = r5.f89923b
            com.google.frameworks.client.a.a.b r5 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r5)
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 51258(0xc83a, float:7.1828E-41)
            r0.<init>(r1)
            r6.mo56379ah(r0)
            java.lang.String r0 = "Some audio bytes are discarded before it registered AudioBytesReceiver to Audio Library with AudioRequestSessionToken(%s) for token(%s)."
            r6.mo56395y(r0, r7, r5)
        L_0x0087:
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        L_0x008a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33651l.mo39019g(com.google.android.libraries.search.c.c, j$.util.function.Consumer, h.c.g):java.lang.Object");
    }
}
