package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33108d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33110f;
import com.google.android.libraries.search.assistant.p2828y.p2845h.p2847b.C36972g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.util.Optional;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.n */
/* compiled from: PG */
public final class C33092n implements C33110f {

    /* renamed from: a */
    public static final C59071e f88604a = C59071e.m91331h();

    /* renamed from: b */
    private static final C58528ij f88605b;

    /* renamed from: c */
    private final PackageManager f88606c;

    /* renamed from: d */
    private final C60887da f88607d;

    /* renamed from: e */
    private final C71422aw f88608e;

    /* renamed from: f */
    private final C36972g f88609f;

    static {
        C58528ij K = C58528ij.m90011K("ui.SHOW_TEXT", "ui.SHOW_NATIVE_FORM");
        C69664n.m101060f(K, "of(\"ui.SHOW_TEXT\", \"ui.SHOW_NATIVE_FORM\")");
        f88605b = K;
    }

    public C33092n(C36972g gVar, PackageManager packageManager, C60887da daVar, C71422aw awVar) {
        C69664n.m101061g(gVar, "clockAppSelectionDataService");
        C69664n.m101061g(packageManager, "packageManager");
        C69664n.m101061g(daVar, "executorService");
        C69664n.m101061g(awVar, "lightweightCoroutineScope");
        this.f88609f = gVar;
        this.f88606c = packageManager;
        this.f88607d = daVar;
        this.f88608e = awVar;
    }

    /* renamed from: h */
    public static final C33080b m61386h(C33080b bVar, C52091ex exVar) {
        return new C33080b(bVar.f88559a, bVar.f88560b, bVar.f88561c, bVar.f88562d, exVar);
    }

    /* renamed from: a */
    public final C60870cx mo38501a(Context context, C51953ff ffVar, C52507uh uhVar, Optional optional, C33108d dVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(ffVar, "showNativeFormArgs");
        C69664n.m101061g(uhVar, "showNativeFormContent");
        C69664n.m101061g(optional, "updateFormFieldVisibilityOptional");
        C69664n.m101061g(dVar, "commonRequestParamsHolder");
        return C71663i.m104692e(this.f88608e, (C71424ay) null, new C33084f(this, context, ffVar, uhVar, optional, dVar, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38515b(com.google.assistant.p3897e.p3921j.p3926e.C51953ff r10, com.google.assistant.p3897e.p3921j.p3926e.C51950fc r11, p5462h.p5466c.C69577g r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33081c
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.c r0 = (com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33081c) r0
            int r1 = r0.f88568e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f88568e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.c r0 = new com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.c
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f88566c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f88568e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r11 = r0.f88565b
            java.lang.Object r10 = r0.f88564a
            p5462h.C69714l.m101134b(r12)
            goto L_0x0042
        L_0x002b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0033:
            p5462h.C69714l.m101134b(r12)
            r0.f88564a = r10
            r0.f88565b = r11
            r0.f88568e = r3
            java.lang.Object r12 = r9.mo38517d(r10, r0)
            if (r12 == r1) goto L_0x0192
        L_0x0042:
            java.lang.String r12 = (java.lang.String) r12
            com.google.assistant.e.j.e.ff r10 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r10
            java.lang.String r0 = "datetime"
            j$.util.Optional r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r0, r10)
            java.lang.String r1 = "recurrence"
            j$.util.Optional r1 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r1, r10)
            java.lang.String r2 = "label"
            j$.util.Optional r10 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r2, r10)
            com.google.assistant.e.i.a.j r2 = com.google.assistant.p3897e.p3917i.p3918a.C51473j.f134090i
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.i.a.i r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51446i) r2
            java.lang.String r4 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            java.lang.String r5 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r5)
            r5 = 0
            java.lang.Object r0 = r0.orElse(r5)
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            if (r0 == 0) goto L_0x00a1
            int r6 = r0.f136277e
            r7 = 9
            if (r6 != r7) goto L_0x007e
            java.lang.Object r0 = r0.f136278f
            com.google.assistant.e.c.c.id r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51148id) r0
            goto L_0x0080
        L_0x007e:
            com.google.assistant.e.c.c.id r0 = com.google.assistant.p3897e.p3902c.p3907c.C51148id.f133140f
        L_0x0080:
            if (r0 == 0) goto L_0x00a1
            com.google.assistant.e.c.c.ib r0 = r0.f133144c
            if (r0 != 0) goto L_0x0088
            com.google.assistant.e.c.c.ib r0 = com.google.assistant.p3897e.p3902c.p3907c.C51146ib.f133130h
        L_0x0088:
            if (r0 == 0) goto L_0x00a1
            com.google.assistant.e.j.ql r0 = r0.f133134c
            if (r0 != 0) goto L_0x0090
            com.google.assistant.e.j.ql r0 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
        L_0x0090:
            if (r0 == 0) goto L_0x00a1
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.assistant.e.i.a.j r6 = (com.google.assistant.p3897e.p3917i.p3918a.C51473j) r6
            r6.f134096e = r0
            int r0 = r6.f134092a
            r0 = r0 | 2
            r6.f134092a = r0
        L_0x00a1:
            java.lang.Object r0 = r1.orElse(r5)
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            r1 = 4
            if (r0 == 0) goto L_0x00cb
            int r6 = r0.f136277e
            r7 = 7
            if (r6 != r7) goto L_0x00b4
            java.lang.Object r0 = r0.f136278f
            com.google.assistant.e.c.c.hh r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51125hh) r0
            goto L_0x00b6
        L_0x00b4:
            com.google.assistant.e.c.c.hh r0 = com.google.assistant.p3897e.p3902c.p3907c.C51125hh.f133077g
        L_0x00b6:
            if (r0 == 0) goto L_0x00cb
            com.google.assistant.e.j.qf r0 = r0.f133081c
            if (r0 != 0) goto L_0x00be
            com.google.assistant.e.j.qf r0 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
        L_0x00be:
            if (r0 == 0) goto L_0x00cb
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.assistant.e.i.a.j r6 = (com.google.assistant.p3897e.p3917i.p3918a.C51473j) r6
            r6.f134094c = r0
            r6.f134093b = r1
        L_0x00cb:
            java.lang.Object r10 = r10.orElse(r5)
            com.google.assistant.e.j.e.eu r10 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r10
            if (r10 == 0) goto L_0x00f3
            int r0 = r10.f136277e
            if (r0 != r1) goto L_0x00dc
            java.lang.Object r10 = r10.f136278f
            com.google.assistant.e.c.c.co r10 = (com.google.assistant.p3897e.p3902c.p3907c.C50997co) r10
            goto L_0x00de
        L_0x00dc:
            com.google.assistant.e.c.c.co r10 = com.google.assistant.p3897e.p3902c.p3907c.C50997co.f132759h
        L_0x00de:
            if (r10 == 0) goto L_0x00f3
            java.lang.String r10 = r10.f132764d
            if (r10 == 0) goto L_0x00f3
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.assistant.e.i.a.j r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51473j) r0
            int r1 = r0.f134092a
            r1 = r1 | 64
            r0.f134092a = r1
            r0.f134099h = r10
        L_0x00f3:
            com.google.assistant.e.j.e.fc r10 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY
            java.lang.String r0 = "value"
            if (r11 != r10) goto L_0x0142
            if (r12 == 0) goto L_0x0142
            java.lang.String r10 = "com.google.android.deskclock"
            boolean r10 = p5462h.p5473f.p5475b.C69664n.m101066l(r12, r10)
            if (r10 == 0) goto L_0x0142
            java.util.Random r10 = new java.util.Random
            r10.<init>()
            long r5 = r10.nextLong()
            long r10 = r10.nextLong()
            java.util.UUID r1 = new java.util.UUID
            r7 = -61441(0xffffffffffff0fff, double:NaN)
            long r5 = r5 & r7
            r7 = 16384(0x4000, double:8.0948E-320)
            long r5 = r5 | r7
            r7 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r10 = r10 & r7
            r7 = -9223372036854775808
            long r10 = r10 | r7
            r1.<init>(r5, r10)
            java.lang.String r10 = r1.toString()
            java.lang.String r11 = "generateInsecureUuid().toString()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r11)
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r0)
            r2.copyOnWrite()
            com.google.protobuf.bv r11 = r2.instance
            com.google.assistant.e.i.a.j r11 = (com.google.assistant.p3897e.p3917i.p3918a.C51473j) r11
            r10.getClass()
            int r1 = r11.f134092a
            r1 = r1 | r3
            r11.f134092a = r1
            r11.f134095d = r10
        L_0x0142:
            com.google.protobuf.bv r10 = r2.build()
            java.lang.String r11 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r11)
            com.google.assistant.e.i.a.j r10 = (com.google.assistant.p3897e.p3917i.p3918a.C51473j) r10
            com.google.assistant.e.i.a.l r11 = com.google.assistant.p3897e.p3917i.p3918a.C51527l.f134273f
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.e.i.a.k r11 = (com.google.assistant.p3897e.p3917i.p3918a.C51500k) r11
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r4)
            com.google.assistant.e.i.a.f r11 = p5462h.p5473f.p5475b.C69664n.m101061g(r11, "builder")
            if (r12 == 0) goto L_0x016f
            com.google.assistant.e.i.a.k r1 = r11.f133785a
            r1.copyOnWrite()
            com.google.protobuf.bv r1 = r1.instance
            com.google.assistant.e.i.a.l r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51527l) r1
            int r2 = r1.f134275a
            r2 = r2 | 8
            r1.f134275a = r2
            r1.f134279e = r12
        L_0x016f:
            com.google.protobuf.a.b r12 = new com.google.protobuf.a.b
            com.google.assistant.e.i.a.k r1 = r11.f133785a
            com.google.protobuf.bv r1 = r1.instance
            com.google.assistant.e.i.a.l r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51527l) r1
            com.google.protobuf.cq r1 = r1.f134276b
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            java.lang.String r2 = "_builder.getAlarmList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            r12.<init>(r1)
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r0)
            com.google.assistant.e.i.a.k r12 = r11.f133785a
            r12.mo53629a(r10)
            com.google.assistant.e.i.a.l r10 = r11.mo53595a()
            return r10
        L_0x0192:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33092n.mo38515b(com.google.assistant.e.j.e.ff, com.google.assistant.e.j.e.fc, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v99, resolved type: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x052d  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x072f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x03eb  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38516c(com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33080b r22, p5462h.p5466c.C69577g r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            boolean r3 = r2 instanceof com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33082d
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.d r3 = (com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33082d) r3
            int r4 = r3.f88574f
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f88574f = r4
            goto L_0x001e
        L_0x0019:
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.d r3 = new com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.d
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f88572d
            h.c.a.a r4 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r5 = r3.f88574f
            r6 = 1
            if (r5 == 0) goto L_0x0042
            if (r5 != r6) goto L_0x003a
            java.lang.Object r1 = r3.f88571c
            java.lang.Object r4 = r3.f88570b
            java.lang.Object r3 = r3.f88569a
            p5462h.C69714l.m101134b(r2)
            r20 = r2
            r2 = r1
            r1 = r4
            r4 = r3
            r3 = r20
            goto L_0x005a
        L_0x003a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0042:
            p5462h.C69714l.m101134b(r2)
            android.content.Context r2 = r1.f88562d
            com.google.assistant.e.j.e.ff r5 = r1.f88560b
            com.google.assistant.e.j.e.fc r7 = r1.f88561c
            r3.f88569a = r0
            r3.f88570b = r1
            r3.f88571c = r2
            r3.f88574f = r6
            java.lang.Object r3 = r0.mo38515b(r5, r7, r3)
            if (r3 == r4) goto L_0x0752
            r4 = r0
        L_0x005a:
            com.google.assistant.e.i.a.l r3 = (com.google.assistant.p3897e.p3917i.p3918a.C51527l) r3
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.b r1 = (com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33080b) r1
            com.google.assistant.e.j.e.fc r5 = r1.f88561c
            com.google.protobuf.cq r7 = r3.f134276b
            int r7 = r7.size()
            if (r7 != r6) goto L_0x072f
            int r7 = r3.f134275a
            r7 = r7 & 8
            if (r7 == 0) goto L_0x070c
            java.lang.String r7 = r3.f134279e
            java.lang.String r8 = "alarmParams.androidProviderPackageName"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.n r4 = (com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33092n) r4
            r4.mo38520g(r7)
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r4 = "keyguard"
            java.lang.Object r4 = r2.getSystemService(r4)
            java.lang.String r7 = "null cannot be cast to non-null type android.app.KeyguardManager"
            p5462h.p5473f.p5475b.C69664n.m101059e(r4, r7)
            android.app.KeyguardManager r4 = (android.app.KeyguardManager) r4
            boolean r4 = r4.isDeviceLocked()
            if (r4 == 0) goto L_0x0095
            com.google.assistant.e.j.e.fc r4 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY
            if (r5 != r4) goto L_0x0095
            r4 = 1
            goto L_0x0096
        L_0x0095:
            r4 = 0
        L_0x0096:
            h.a.a.c r9 = new h.a.a.c
            r10 = 10
            r9.<init>(r10)
            java.lang.String r10 = "alarm_params"
            java.lang.String r11 = "assistant.api.params.AlarmParams"
            java.lang.String r12 = "alarm.CREATE_ALARM"
            com.google.assistant.e.j.dy r10 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61446e(r12, r3, r10, r11)
            r9.add(r10)
            com.google.assistant.e.j.e.fc r10 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY
            java.lang.String r11 = "label"
            java.lang.String r13 = "recurrence"
            java.lang.String r14 = "datetime"
            java.lang.String r15 = "value"
            java.lang.String r7 = "newBuilder()"
            if (r5 != r10) goto L_0x03af
            com.google.assistant.e.j.e.ff r5 = r1.f88560b
            com.google.assistant.e.j.e.ff r10 = com.google.assistant.p3897e.p3921j.p3926e.C51953ff.f136315l
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.e.j.e.en r10 = (com.google.assistant.p3897e.p3921j.p3926e.C51934en) r10
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r7)
            com.google.assistant.e.j.e.ec r10 = p5462h.p5473f.p5475b.C69664n.m101061g(r10, "builder")
            r10.mo53744e()
            com.google.assistant.e.j.e.fa r16 = com.google.assistant.p3897e.p3921j.p3926e.C51948fa.f136294i
            com.google.protobuf.bn r16 = r16.createBuilder()
            r6 = r16
            com.google.assistant.e.j.e.ex r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51944ex) r6
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            com.google.assistant.e.j.e.ei r6 = p5462h.p5473f.p5475b.C69664n.m101061g(r6, "builder")
            com.google.assistant.e.j.e.ex r0 = r6.f136208a
            r0.copyOnWrite()
            com.google.protobuf.bv r0 = r0.instance
            com.google.assistant.e.j.e.fa r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51948fa) r0
            r16 = r12
            int r12 = r0.f136296a
            r12 = r12 | 16
            r0.f136296a = r12
            r12 = 1
            r0.f136301f = r12
            r6.mo53753c()
            com.google.assistant.e.j.e.ew r0 = com.google.assistant.p3897e.p3921j.p3926e.C51943ew.f136285f
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.e.ev r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51942ev) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r7)
            com.google.assistant.e.j.e.ee r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            r0.mo53747c()
            com.google.assistant.e.j.e.eu r12 = com.google.assistant.p3897e.p3921j.p3926e.C51941eu.f136271l
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.assistant.e.j.e.eq r12 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r12
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r7)
            com.google.assistant.e.j.e.eg r12 = p5462h.p5473f.p5475b.C69664n.m101061g(r12, "builder")
            j$.util.Optional r14 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r14, r5)
            j$.util.Optional r13 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r13, r5)
            j$.util.Optional r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r11, r5)
            com.google.assistant.e.c.c.d r11 = com.google.assistant.p3897e.p3902c.p3907c.C51009d.f132801i
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.e.c.c.a r11 = (com.google.assistant.p3897e.p3902c.p3907c.C50928a) r11
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r7)
            r17 = r4
            java.lang.String r4 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r4)
            boolean r4 = r14.isPresent()
            if (r4 == 0) goto L_0x0190
            java.lang.Object r4 = r14.get()
            com.google.assistant.e.j.e.eu r4 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r4
            r18 = r2
            int r2 = r4.f136277e
            r19 = r1
            r1 = 9
            if (r2 != r1) goto L_0x014e
            java.lang.Object r1 = r4.f136278f
            com.google.assistant.e.c.c.id r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51148id) r1
            goto L_0x0150
        L_0x014e:
            com.google.assistant.e.c.c.id r1 = com.google.assistant.p3897e.p3902c.p3907c.C51148id.f133140f
        L_0x0150:
            int r1 = r1.f133142a
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0194
            java.lang.Object r1 = r14.get()
            com.google.assistant.e.j.e.eu r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r1
            int r2 = r1.f136277e
            r4 = 9
            if (r2 != r4) goto L_0x0167
            java.lang.Object r1 = r1.f136278f
            com.google.assistant.e.c.c.id r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51148id) r1
            goto L_0x0169
        L_0x0167:
            com.google.assistant.e.c.c.id r1 = com.google.assistant.p3897e.p3902c.p3907c.C51148id.f133140f
        L_0x0169:
            com.google.assistant.e.c.c.ib r1 = r1.f133144c
            if (r1 != 0) goto L_0x016f
            com.google.assistant.e.c.c.ib r1 = com.google.assistant.p3897e.p3902c.p3907c.C51146ib.f133130h
        L_0x016f:
            com.google.assistant.e.j.ql r1 = r1.f133134c
            if (r1 != 0) goto L_0x0175
            com.google.assistant.e.j.ql r1 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
        L_0x0175:
            java.lang.String r2 = "timeSelectionFieldOption…on.selectedTime.timeValue"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r15)
            r11.copyOnWrite()
            com.google.protobuf.bv r2 = r11.instance
            com.google.assistant.e.c.c.d r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51009d) r2
            r1.getClass()
            r2.f132804b = r1
            int r1 = r2.f132803a
            r4 = 1
            r1 = r1 | r4
            r2.f132803a = r1
            goto L_0x0194
        L_0x0190:
            r19 = r1
            r18 = r2
        L_0x0194:
            boolean r1 = r13.isPresent()
            if (r1 == 0) goto L_0x01e4
            java.lang.Object r1 = r13.get()
            com.google.assistant.e.j.e.eu r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r1
            int r2 = r1.f136277e
            r4 = 7
            if (r2 != r4) goto L_0x01aa
            java.lang.Object r1 = r1.f136278f
            com.google.assistant.e.c.c.hh r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51125hh) r1
            goto L_0x01ac
        L_0x01aa:
            com.google.assistant.e.c.c.hh r1 = com.google.assistant.p3897e.p3902c.p3907c.C51125hh.f133077g
        L_0x01ac:
            int r1 = r1.f133079a
            r1 = r1 & 2
            if (r1 == 0) goto L_0x01e4
            java.lang.Object r1 = r13.get()
            com.google.assistant.e.j.e.eu r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r1
            int r2 = r1.f136277e
            r4 = 7
            if (r2 != r4) goto L_0x01c2
            java.lang.Object r1 = r1.f136278f
            com.google.assistant.e.c.c.hh r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51125hh) r1
            goto L_0x01c4
        L_0x01c2:
            com.google.assistant.e.c.c.hh r1 = com.google.assistant.p3897e.p3902c.p3907c.C51125hh.f133077g
        L_0x01c4:
            com.google.assistant.e.j.qf r1 = r1.f133081c
            if (r1 != 0) goto L_0x01ca
            com.google.assistant.e.j.qf r1 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
        L_0x01ca:
            java.lang.String r2 = "recurrenceSelectionField…renceSelection.recurrence"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r15)
            r11.copyOnWrite()
            com.google.protobuf.bv r2 = r11.instance
            com.google.assistant.e.c.c.d r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51009d) r2
            r1.getClass()
            r2.f132808f = r1
            int r1 = r2.f132803a
            r1 = r1 | 16
            r2.f132803a = r1
        L_0x01e4:
            boolean r1 = r5.isPresent()
            if (r1 == 0) goto L_0x0235
            java.lang.Object r1 = r5.get()
            com.google.assistant.e.j.e.eu r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r1
            int r2 = r1.f136277e
            r4 = 4
            if (r2 != r4) goto L_0x01fa
            java.lang.Object r1 = r1.f136278f
            com.google.assistant.e.c.c.co r1 = (com.google.assistant.p3897e.p3902c.p3907c.C50997co) r1
            goto L_0x01fc
        L_0x01fa:
            com.google.assistant.e.c.c.co r1 = com.google.assistant.p3897e.p3902c.p3907c.C50997co.f132759h
        L_0x01fc:
            java.lang.String r1 = r1.f132764d
            java.lang.String r2 = "labelFieldOptional.get().editableText.text"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0235
            java.lang.Object r1 = r5.get()
            com.google.assistant.e.j.e.eu r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r1
            int r4 = r1.f136277e
            r5 = 4
            if (r4 != r5) goto L_0x0219
            java.lang.Object r1 = r1.f136278f
            com.google.assistant.e.c.c.co r1 = (com.google.assistant.p3897e.p3902c.p3907c.C50997co) r1
            goto L_0x021b
        L_0x0219:
            com.google.assistant.e.c.c.co r1 = com.google.assistant.p3897e.p3902c.p3907c.C50997co.f132759h
        L_0x021b:
            java.lang.String r1 = r1.f132764d
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r15)
            r11.copyOnWrite()
            com.google.protobuf.bv r2 = r11.instance
            com.google.assistant.e.c.c.d r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51009d) r2
            r1.getClass()
            int r4 = r2.f132803a
            r4 = r4 | 32
            r2.f132803a = r4
            r2.f132809g = r1
        L_0x0235:
            com.google.assistant.e.c.c.gh r1 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.c.c.gg r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51097gg) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r7)
            com.google.assistant.e.c.c.er r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            com.google.assistant.e.c.c.ev r2 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.c.c.es r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51055es) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r7)
            com.google.assistant.e.c.c.f r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            java.lang.String r4 = r3.f134279e
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r8)
            r2.mo53516c(r4)
            com.google.assistant.e.c.c.ev r2 = r2.mo53514a()
            r1.mo53512b(r2)
            com.google.assistant.e.c.c.gh r1 = r1.mo53511a()
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r15)
            r11.copyOnWrite()
            com.google.protobuf.bv r2 = r11.instance
            com.google.assistant.e.c.c.d r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51009d) r2
            r1.getClass()
            r2.f132810h = r1
            int r1 = r2.f132803a
            r1 = r1 | 64
            r2.f132803a = r1
            com.google.assistant.e.c.c.c r1 = com.google.assistant.p3897e.p3902c.p3907c.C50982c.ON
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r15)
            r11.copyOnWrite()
            com.google.protobuf.bv r2 = r11.instance
            com.google.assistant.e.c.c.d r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51009d) r2
            int r1 = r1.f132731d
            r2.f132805c = r1
            int r1 = r2.f132803a
            r1 = r1 | 2
            r2.f132803a = r1
            com.google.protobuf.cq r1 = r3.f134276b
            java.lang.String r2 = "alarmParams.alarmList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            java.lang.Object r1 = p5462h.p5463a.C69540x.m100821C(r1)
            com.google.assistant.e.i.a.j r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51473j) r1
            if (r1 == 0) goto L_0x02e2
            java.lang.String r2 = r1.f134095d
            r4 = 1
            com.google.assistant.e.c.c.v r2 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33094p.m61394a(r2, r4)
            java.lang.String r4 = "generateAlarmInstanceSwi…ble = */ true\n          )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r15)
            r11.copyOnWrite()
            com.google.protobuf.bv r4 = r11.instance
            com.google.assistant.e.c.c.d r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51009d) r4
            r2.getClass()
            r4.f132806d = r2
            int r2 = r4.f132803a
            r5 = 4
            r2 = r2 | r5
            r4.f132803a = r2
            java.lang.String r1 = r1.f134095d
            r2 = 0
            com.google.assistant.e.c.c.v r1 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33094p.m61394a(r1, r2)
            java.lang.String r2 = "generateAlarmInstanceSwi…le = */ false\n          )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r15)
            r11.copyOnWrite()
            com.google.protobuf.bv r2 = r11.instance
            com.google.assistant.e.c.c.d r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51009d) r2
            r1.getClass()
            r2.f132807e = r1
            int r1 = r2.f132803a
            r1 = r1 | 8
            r2.f132803a = r1
        L_0x02e2:
            com.google.protobuf.bv r1 = r11.build()
            java.lang.String r2 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            com.google.assistant.e.c.c.d r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51009d) r1
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r15)
            com.google.assistant.e.j.e.eq r2 = r12.f136207a
            r2.copyOnWrite()
            com.google.protobuf.bv r2 = r2.instance
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            r1.getClass()
            r2.f136278f = r1
            r1 = 28
            r2.f136277e = r1
            com.google.assistant.e.c.c.gh r1 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.c.c.gg r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51097gg) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r7)
            com.google.assistant.e.c.c.er r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            com.google.assistant.e.c.c.ev r2 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.c.c.es r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51055es) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r7)
            com.google.assistant.e.c.c.f r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            com.google.protobuf.cq r3 = r3.f134276b
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            com.google.assistant.e.i.a.j r3 = (com.google.assistant.p3897e.p3917i.p3918a.C51473j) r3
            java.lang.String r3 = r3.f134095d
            android.net.Uri r4 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33094p.f88611a
            android.net.Uri$Builder r4 = r4.buildUpon()
            android.net.Uri$Builder r3 = r4.appendPath(r3)
            java.lang.String r4 = "view"
            android.net.Uri$Builder r3 = r3.appendPath(r4)
            android.net.Uri r3 = r3.build()
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "generateViewAlarmByIdInt…rams.getAlarm(0).alarmId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)
            r2.mo53515b(r3)
            com.google.assistant.e.c.c.ev r2 = r2.mo53514a()
            r1.mo53512b(r2)
            com.google.assistant.e.c.c.gh r1 = r1.mo53511a()
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r15)
            com.google.assistant.e.j.e.eq r2 = r12.f136207a
            r2.copyOnWrite()
            com.google.protobuf.bv r2 = r2.instance
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            r1.getClass()
            r2.f136276d = r1
            r1 = 22
            r2.f136275c = r1
            com.google.assistant.e.j.e.eu r1 = r12.mo53748a()
            r0.mo53746b(r1)
            com.google.assistant.e.j.e.ew r0 = r0.mo53745a()
            r6.mo53752b(r0)
            com.google.assistant.e.j.e.fa r0 = r6.mo53751a()
            r10.mo53742c(r0)
            r10.mo53743d()
            com.google.assistant.e.j.e.ep r0 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.ALARM
            r10.mo53741b(r0)
            com.google.assistant.e.j.e.fc r0 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r15)
            com.google.assistant.e.j.e.en r1 = r10.f136205a
            r1.copyOnWrite()
            com.google.protobuf.bv r1 = r1.instance
            com.google.assistant.e.j.e.ff r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r1
            int r0 = r0.f136309c
            r1.f136324h = r0
            int r0 = r1.f136317a
            r0 = r0 | 64
            r1.f136317a = r0
            com.google.assistant.e.j.e.ff r0 = r10.mo53740a()
            com.google.assistant.e.j.dy r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61451j(r0)
            r9.add(r0)
            r1 = r19
            goto L_0x06a9
        L_0x03af:
            r18 = r2
            r17 = r4
            r16 = r12
            com.google.assistant.e.j.e.ff r0 = r1.f88560b
            j$.util.Optional r2 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r14, r0)
            r4 = 0
            java.lang.Object r2 = r2.orElse(r4)
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            if (r2 == 0) goto L_0x03de
            int r5 = r2.f136277e
            r6 = 9
            if (r5 != r6) goto L_0x03cf
            java.lang.Object r2 = r2.f136278f
            com.google.assistant.e.c.c.id r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51148id) r2
            goto L_0x03d1
        L_0x03cf:
            com.google.assistant.e.c.c.id r2 = com.google.assistant.p3897e.p3902c.p3907c.C51148id.f133140f
        L_0x03d1:
            if (r2 == 0) goto L_0x03de
            com.google.assistant.e.c.c.ib r2 = r2.f133144c
            if (r2 != 0) goto L_0x03d9
            com.google.assistant.e.c.c.ib r2 = com.google.assistant.p3897e.p3902c.p3907c.C51146ib.f133130h
        L_0x03d9:
            if (r2 == 0) goto L_0x03de
            java.lang.String r2 = r2.f133137f
            goto L_0x03df
        L_0x03de:
            r2 = r4
        L_0x03df:
            j$.util.Optional r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r13, r0)
            java.lang.Object r5 = r5.orElse(r4)
            com.google.assistant.e.j.e.eu r5 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r5
            if (r5 == 0) goto L_0x03fc
            int r6 = r5.f136277e
            r10 = 7
            if (r6 != r10) goto L_0x03f5
            java.lang.Object r5 = r5.f136278f
            com.google.assistant.e.c.c.hh r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51125hh) r5
            goto L_0x03f7
        L_0x03f5:
            com.google.assistant.e.c.c.hh r5 = com.google.assistant.p3897e.p3902c.p3907c.C51125hh.f133077g
        L_0x03f7:
            if (r5 == 0) goto L_0x03fc
            java.lang.String r5 = r5.f133084f
            goto L_0x03fd
        L_0x03fc:
            r5 = r4
        L_0x03fd:
            j$.util.Optional r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r11, r0)
            java.lang.Object r0 = r0.orElse(r4)
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            if (r0 == 0) goto L_0x0419
            int r6 = r0.f136277e
            r10 = 4
            if (r6 != r10) goto L_0x0413
            java.lang.Object r0 = r0.f136278f
            com.google.assistant.e.c.c.co r0 = (com.google.assistant.p3897e.p3902c.p3907c.C50997co) r0
            goto L_0x0415
        L_0x0413:
            com.google.assistant.e.c.c.co r0 = com.google.assistant.p3897e.p3902c.p3907c.C50997co.f132759h
        L_0x0415:
            if (r0 == 0) goto L_0x0419
            java.lang.String r4 = r0.f132764d
        L_0x0419:
            android.content.res.Resources r0 = r18.getResources()
            r6 = 2132085208(0x7f1509d8, float:1.9810608E38)
            java.lang.String r0 = r0.getString(r6)
            java.lang.String r6 = "context.resources.getStr…rmation_card_button_text)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r6)
            com.google.assistant.e.j.e.fa r6 = com.google.assistant.p3897e.p3921j.p3926e.C51948fa.f136294i
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.j.e.ex r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51944ex) r6
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            com.google.assistant.e.j.e.ei r6 = p5462h.p5473f.p5475b.C69664n.m101061g(r6, "builder")
            boolean r10 = android.text.TextUtils.isEmpty(r2)
            if (r10 != 0) goto L_0x04ce
            r6.mo53753c()
            com.google.assistant.e.j.e.ew r10 = com.google.assistant.p3897e.p3921j.p3926e.C51943ew.f136285f
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.e.j.e.ev r10 = (com.google.assistant.p3897e.p3921j.p3926e.C51942ev) r10
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r7)
            com.google.assistant.e.j.e.ee r10 = p5462h.p5473f.p5475b.C69664n.m101061g(r10, "builder")
            r10.mo53747c()
            com.google.assistant.e.j.e.eu r11 = com.google.assistant.p3897e.p3921j.p3926e.C51941eu.f136271l
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.e.j.e.eq r11 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r11
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r7)
            com.google.assistant.e.j.e.eg r11 = p5462h.p5473f.p5475b.C69664n.m101061g(r11, "builder")
            com.google.assistant.e.c.c.hx r12 = com.google.assistant.p3897e.p3902c.p3907c.C51141hx.f133119h
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.assistant.e.c.c.hu r12 = (com.google.assistant.p3897e.p3902c.p3907c.C51138hu) r12
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r7)
            com.google.assistant.e.c.c.ht r12 = p5462h.p5473f.p5475b.C69664n.m101061g(r12, "builder")
            p5462h.p5473f.p5475b.C69664n.m101058d(r2)
            r12.mo53520b(r2)
            com.google.assistant.e.c.c.hw r2 = com.google.assistant.p3897e.p3902c.p3907c.C51140hw.CONFIRMATION_PRIMARY
            r12.mo53521c(r2)
            com.google.assistant.e.c.c.dc r2 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.c.c.db r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51011db) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r7)
            com.google.assistant.e.c.c.da r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            com.google.assistant.e.c.c.db r13 = r2.f132812a
            r13.copyOnWrite()
            com.google.protobuf.bv r13 = r13.instance
            com.google.assistant.e.c.c.dc r13 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r13
            int r14 = r13.f132815a
            r14 = r14 | 2
            r13.f132815a = r14
            java.lang.String r14 = "https://www.gstatic.com/images/icons/material/system/2x/check_circle_googgreen_48dp.png"
            r13.f132817c = r14
            com.google.assistant.e.c.c.dc r2 = r2.mo53499a()
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r15)
            com.google.assistant.e.c.c.hu r13 = r12.f133106a
            r13.copyOnWrite()
            com.google.protobuf.bv r13 = r13.instance
            com.google.assistant.e.c.c.hx r13 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r13
            r2.getClass()
            r13.f133126f = r2
            int r2 = r13.f133121a
            r2 = r2 | 16
            r13.f133121a = r2
            com.google.assistant.e.c.c.hx r2 = r12.mo53519a()
            r11.mo53750c(r2)
            com.google.assistant.e.j.e.eu r2 = r11.mo53748a()
            r10.mo53746b(r2)
            com.google.assistant.e.j.e.ew r2 = r10.mo53745a()
            r6.mo53752b(r2)
        L_0x04ce:
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L_0x0527
            r6.mo53753c()
            com.google.assistant.e.j.e.ew r2 = com.google.assistant.p3897e.p3921j.p3926e.C51943ew.f136285f
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.e.ev r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51942ev) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r7)
            com.google.assistant.e.j.e.ee r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            r2.mo53747c()
            com.google.assistant.e.j.e.eu r10 = com.google.assistant.p3897e.p3921j.p3926e.C51941eu.f136271l
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.e.j.e.eq r10 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r10
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r7)
            com.google.assistant.e.j.e.eg r10 = p5462h.p5473f.p5475b.C69664n.m101061g(r10, "builder")
            com.google.assistant.e.c.c.hx r11 = com.google.assistant.p3897e.p3902c.p3907c.C51141hx.f133119h
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.e.c.c.hu r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51138hu) r11
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r7)
            com.google.assistant.e.c.c.ht r11 = p5462h.p5473f.p5475b.C69664n.m101061g(r11, "builder")
            p5462h.p5473f.p5475b.C69664n.m101058d(r5)
            r11.mo53520b(r5)
            com.google.assistant.e.c.c.hw r5 = com.google.assistant.p3897e.p3902c.p3907c.C51140hw.CONFIRMATION_SECONDARY
            r11.mo53521c(r5)
            com.google.assistant.e.c.c.hx r5 = r11.mo53519a()
            r10.mo53750c(r5)
            com.google.assistant.e.j.e.eu r5 = r10.mo53748a()
            r2.mo53746b(r5)
            com.google.assistant.e.j.e.ew r2 = r2.mo53745a()
            r6.mo53752b(r2)
        L_0x0527:
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L_0x0580
            r6.mo53753c()
            com.google.assistant.e.j.e.ew r2 = com.google.assistant.p3897e.p3921j.p3926e.C51943ew.f136285f
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.e.ev r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51942ev) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r7)
            com.google.assistant.e.j.e.ee r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            r2.mo53747c()
            com.google.assistant.e.j.e.eu r5 = com.google.assistant.p3897e.p3921j.p3926e.C51941eu.f136271l
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.e.j.e.eq r5 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r5
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r7)
            com.google.assistant.e.j.e.eg r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")
            com.google.assistant.e.c.c.hx r10 = com.google.assistant.p3897e.p3902c.p3907c.C51141hx.f133119h
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.e.c.c.hu r10 = (com.google.assistant.p3897e.p3902c.p3907c.C51138hu) r10
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r7)
            com.google.assistant.e.c.c.ht r10 = p5462h.p5473f.p5475b.C69664n.m101061g(r10, "builder")
            p5462h.p5473f.p5475b.C69664n.m101058d(r4)
            r10.mo53520b(r4)
            com.google.assistant.e.c.c.hw r4 = com.google.assistant.p3897e.p3902c.p3907c.C51140hw.CONFIRMATION_SECONDARY
            r10.mo53521c(r4)
            com.google.assistant.e.c.c.hx r4 = r10.mo53519a()
            r5.mo53750c(r4)
            com.google.assistant.e.j.e.eu r4 = r5.mo53748a()
            r2.mo53746b(r4)
            com.google.assistant.e.j.e.ew r2 = r2.mo53745a()
            r6.mo53752b(r2)
        L_0x0580:
            r6.mo53753c()
            com.google.assistant.e.j.e.ew r2 = com.google.assistant.p3897e.p3921j.p3926e.C51943ew.f136285f
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.e.ev r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51942ev) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r7)
            com.google.assistant.e.j.e.ee r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            r2.mo53747c()
            com.google.assistant.e.j.e.eu r4 = com.google.assistant.p3897e.p3921j.p3926e.C51941eu.f136271l
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.j.e.eq r4 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r4
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r7)
            com.google.assistant.e.j.e.eg r4 = p5462h.p5473f.p5475b.C69664n.m101061g(r4, "builder")
            com.google.assistant.e.c.c.ah r5 = com.google.assistant.p3897e.p3902c.p3907c.C50936ah.f132593m
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.e.c.c.aa r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50929aa) r5
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r7)
            com.google.assistant.e.c.c.z r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")
            com.google.assistant.e.c.c.aa r10 = r5.f133202a
            r10.copyOnWrite()
            com.google.protobuf.bv r10 = r10.instance
            com.google.assistant.e.c.c.ah r10 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r10
            int r11 = r10.f132595a
            r12 = 4
            r11 = r11 | r12
            r10.f132595a = r11
            r11 = 1
            r10.f132600f = r11
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r15)
            com.google.assistant.e.c.c.aa r10 = r5.f133202a
            r10.copyOnWrite()
            com.google.protobuf.bv r10 = r10.instance
            com.google.assistant.e.c.c.ah r10 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r10
            r0.getClass()
            r10.f132596b = r11
            r10.f132597c = r0
            com.google.assistant.e.c.c.dc r0 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.c.c.db r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51011db) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r7)
            com.google.assistant.e.c.c.da r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            java.lang.String r10 = r3.f134279e
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r8)
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r15)
            com.google.assistant.e.c.c.db r11 = r0.f132812a
            r11.copyOnWrite()
            com.google.protobuf.bv r11 = r11.instance
            com.google.assistant.e.c.c.dc r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r11
            r10.getClass()
            int r12 = r11.f132815a
            r12 = r12 | 32
            r11.f132815a = r12
            r11.f132821g = r10
            com.google.assistant.e.c.c.dc r0 = r0.mo53499a()
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r15)
            com.google.assistant.e.c.c.aa r10 = r5.f133202a
            r10.copyOnWrite()
            com.google.protobuf.bv r10 = r10.instance
            com.google.assistant.e.c.c.ah r10 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r10
            r0.getClass()
            r10.f132601g = r0
            int r0 = r10.f132595a
            r0 = r0 | 32
            r10.f132595a = r0
            com.google.assistant.e.c.c.gh r0 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.c.c.gg r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51097gg) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r7)
            com.google.assistant.e.c.c.er r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            com.google.assistant.e.c.c.ev r10 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.e.c.c.es r10 = (com.google.assistant.p3897e.p3902c.p3907c.C51055es) r10
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r7)
            com.google.assistant.e.c.c.f r10 = p5462h.p5473f.p5475b.C69664n.m101061g(r10, "builder")
            java.lang.String r3 = r3.f134279e
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r8)
            r10.mo53516c(r3)
            java.lang.String r3 = "intent:#Intent;action=android.intent.action.SHOW_ALARMS;end"
            r10.mo53515b(r3)
            com.google.assistant.e.c.c.ev r3 = r10.mo53514a()
            r0.mo53512b(r3)
            com.google.assistant.e.c.c.gh r0 = r0.mo53511a()
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r15)
            com.google.assistant.e.c.c.aa r3 = r5.f133202a
            r3.copyOnWrite()
            com.google.protobuf.bv r3 = r3.instance
            com.google.assistant.e.c.c.ah r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r3
            r0.getClass()
            r3.f132599e = r0
            r0 = 4
            r3.f132598d = r0
            com.google.assistant.e.c.c.ah r0 = r5.mo53524a()
            r4.mo53749b(r0)
            com.google.assistant.e.j.e.eu r0 = r4.mo53748a()
            r2.mo53746b(r0)
            com.google.assistant.e.j.e.ew r0 = r2.mo53745a()
            r6.mo53752b(r0)
            com.google.assistant.e.j.e.fa r0 = r6.mo53751a()
            com.google.assistant.e.j.e.ff r2 = com.google.assistant.p3897e.p3921j.p3926e.C51953ff.f136315l
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.e.en r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51934en) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r7)
            com.google.assistant.e.j.e.ec r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            r2.mo53744e()
            r2.mo53742c(r0)
            r2.mo53743d()
            com.google.assistant.e.j.e.ep r0 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.ALARM
            r2.mo53741b(r0)
            com.google.assistant.e.j.e.ff r0 = r2.mo53740a()
            com.google.assistant.e.j.dy r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61451j(r0)
            r9.add(r0)
        L_0x06a9:
            com.google.assistant.e.j.e.o r0 = com.google.assistant.p3897e.p3921j.p3926e.C52056o.f136624a
            com.google.assistant.e.j.dy r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61448g(r0)
            r9.add(r0)
            if (r17 == 0) goto L_0x06ef
            java.util.Locale r0 = java.util.Locale.getDefault()
            android.content.res.Resources r2 = r18.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            android.os.LocaleList r2 = r2.getLocales()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x06db
            android.content.res.Resources r0 = r18.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            android.os.LocaleList r0 = r0.getLocales()
            r2 = 0
            java.util.Locale r0 = r0.get(r2)
        L_0x06db:
            r2 = 2132085217(0x7f1509e1, float:1.9810627E38)
            r3 = r18
            java.lang.String r2 = r3.getString(r2)
            java.lang.String r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61459r(r0)
            com.google.assistant.e.j.dy r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61454m(r2, r0)
            r9.add(r0)
        L_0x06ef:
            java.util.List r0 = p5462h.p5463a.C69540x.m100943a(r9)
            if (r17 == 0) goto L_0x0703
            com.google.common.b.qy r2 = new com.google.common.b.qy
            r3 = r16
            r2.<init>(r3)
            com.google.assistant.e.j.ex r1 = r1.f88563e
            com.google.assistant.e.j.en r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f.m61461b(r0, r2, r1)
            goto L_0x070b
        L_0x0703:
            com.google.assistant.e.j.ex r1 = r1.f88563e
            com.google.common.b.pz r2 = com.google.common.p4522b.C58733pz.f156496a
            com.google.assistant.e.j.en r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f.m61461b(r0, r2, r1)
        L_0x070b:
            return r0
        L_0x070c:
            com.google.common.f.e r0 = f88604a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r2 = new com.google.common.f.n
            r3 = 50884(0xc6c4, float:7.1304E-41)
            r2.<init>(r3)
            r0.mo56379ah(r2)
            java.lang.String r2 = "getConfirmResponse: android provider package name is undefined"
            r0.mo56386p(r2)
            h.a.am r0 = p5462h.p5463a.C69496am.f185918a
            com.google.assistant.e.j.ex r1 = r1.f88563e
            com.google.common.b.pz r2 = com.google.common.p4522b.C58733pz.f156496a
            com.google.assistant.e.j.en r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f.m61461b(r0, r2, r1)
            return r0
        L_0x072f:
            com.google.common.f.e r0 = f88604a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r2 = new com.google.common.f.n
            r3 = 50885(0xc6c5, float:7.1305E-41)
            r2.<init>(r3)
            r0.mo56379ah(r2)
            java.lang.String r2 = "getConfirmResponse: There is no alarm instance defined in alarmParams."
            r0.mo56386p(r2)
            h.a.am r0 = p5462h.p5463a.C69496am.f185918a
            com.google.assistant.e.j.ex r1 = r1.f88563e
            com.google.common.b.pz r2 = com.google.common.p4522b.C58733pz.f156496a
            com.google.assistant.e.j.en r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f.m61461b(r0, r2, r1)
            return r0
        L_0x0752:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33092n.mo38516c(com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.b, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38517d(com.google.assistant.p3897e.p3921j.p3926e.C51953ff r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33083e
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.e r0 = (com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33083e) r0
            int r1 = r0.f88577c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f88577c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.e r0 = new com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.e
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f88575a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f88577c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p5462h.C69714l.m101134b(r8)
            goto L_0x00a7
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0031:
            p5462h.C69714l.m101134b(r8)
            java.lang.String r8 = "clock_app_picker_field"
            j$.util.Optional r7 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r8, r7)
            boolean r8 = r7.isPresent()
            if (r8 == 0) goto L_0x0072
            java.lang.Object r8 = r7.get()
            com.google.assistant.e.j.e.eu r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r8
            int r8 = r8.f136277e
            r2 = 17
            if (r8 != r2) goto L_0x0072
            java.lang.Object r7 = r7.get()
            com.google.assistant.e.j.e.eu r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r7
            int r8 = r7.f136277e
            if (r8 != r2) goto L_0x005b
            java.lang.Object r7 = r7.f136278f
            com.google.assistant.e.c.c.ah r7 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r7
            goto L_0x005d
        L_0x005b:
            com.google.assistant.e.c.c.ah r7 = com.google.assistant.p3897e.p3902c.p3907c.C50936ah.f132593m
        L_0x005d:
            com.google.assistant.e.c.c.dc r7 = r7.f132601g
            if (r7 != 0) goto L_0x0063
            com.google.assistant.e.c.c.dc r7 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0063:
            java.lang.String r7 = r7.f132821g
            java.lang.String r8 = "clockAppPickerFieldOptio…n.image.appIconIdentifier"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            int r8 = r7.length()
            if (r8 != 0) goto L_0x0071
            return r4
        L_0x0071:
            return r7
        L_0x0072:
            com.google.common.f.e r7 = f88604a
            com.google.common.f.x r7 = r7.mo56224b()
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.n r8 = new com.google.common.f.n
            r2 = 50886(0xc6c6, float:7.1306E-41)
            r8.<init>(r2)
            r7.mo56379ah(r8)
            java.lang.String r8 = "getSelectedAppIconIdentifier: ClockAppPickerField is absent."
            r7.mo56386p(r8)
            android.content.pm.PackageManager r7 = r6.f88606c
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.SET_ALARM"
            r8.<init>(r2)
            com.google.android.libraries.search.assistant.y.h.b.g r2 = r6.f88609f
            com.google.common.util.concurrent.cx r2 = r2.mo40495a()
            com.google.common.util.concurrent.da r5 = r6.f88607d
            com.google.common.util.concurrent.cx r7 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33094p.m61395b(r7, r8, r2, r5)
            r0.f88577c = r3
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)
            if (r8 == r1) goto L_0x00b3
        L_0x00a7:
            j$.util.Optional r8 = (p3186j$.util.Optional) r8
            if (r8 == 0) goto L_0x00b2
            java.lang.Object r7 = r8.orElse(r4)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L_0x00b2:
            return r4
        L_0x00b3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33092n.mo38517d(com.google.assistant.e.j.e.ff, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38518e(android.content.Context r17, com.google.assistant.p3897e.p3921j.p3926e.C51953ff r18, com.google.assistant.p3897e.p3921j.C52507uh r19, p3186j$.util.Optional r20, com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33108d r21, p5462h.p5466c.C69577g r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r19
            r2 = r22
            boolean r3 = r2 instanceof com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33085g
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.g r3 = (com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33085g) r3
            int r4 = r3.f88589e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f88589e = r4
            goto L_0x001e
        L_0x0019:
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.g r3 = new com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.g
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f88587c
            h.c.a.a r4 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r5 = r3.f88589e
            r6 = 6
            r7 = 0
            r8 = 1
            if (r5 == 0) goto L_0x003f
            if (r5 != r8) goto L_0x0037
            java.lang.Object r1 = r3.f88586b
            java.lang.Object r3 = r3.f88585a
            p5462h.C69714l.m101134b(r2)
            r15 = r2
            r2 = r1
            r1 = r3
            r3 = r15
            goto L_0x009a
        L_0x0037:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003f:
            p5462h.C69714l.m101134b(r2)
            com.google.protobuf.cq r2 = r1.f137840a
            int r2 = r2.size()
            if (r2 == r8) goto L_0x004b
            return r7
        L_0x004b:
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.b r2 = new com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.b
            com.google.protobuf.cq r1 = r1.f137840a
            java.lang.String r5 = "showNativeFormContent.formFieldContentList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r5)
            java.lang.Object r1 = p5462h.p5463a.C69540x.m100825G(r1)
            java.lang.String r5 = "showNativeFormContent.fo…FieldContentList.single()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r5)
            r10 = r1
            com.google.assistant.e.j.tr r10 = (com.google.assistant.p3897e.p3921j.C52490tr) r10
            r1 = r18
            int r5 = r1.f136324h
            com.google.assistant.e.j.e.fc r5 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.m86447a(r5)
            if (r5 != 0) goto L_0x006c
            com.google.assistant.e.j.e.fc r5 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.FORM_UI_THEME_DEFAULT
        L_0x006c:
            r12 = r5
            java.lang.String r5 = "showNativeFormArgs.formUiTheme"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r5)
            com.google.assistant.e.j.ex r14 = r21.mo38534c()
            java.lang.String r5 = "commonRequestParamsHolder.conversationParams()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r5)
            r9 = r2
            r11 = r18
            r13 = r17
            r9.<init>(r10, r11, r12, r13, r14)
            com.google.android.libraries.search.assistant.fluidactions.d.c.e r1 = r21.mo38533b()
            r1.mo38550c(r6)
            r1 = r21
            r3.f88585a = r1
            r3.f88586b = r2
            r3.f88589e = r8
            r5 = r20
            java.lang.Object r3 = r0.mo38519f(r2, r5, r3)
            if (r3 == r4) goto L_0x00ba
        L_0x009a:
            com.google.assistant.e.j.en r3 = (com.google.assistant.p3897e.p3921j.C52081en) r3
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.e.d r1 = (com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33108d) r1
            com.google.android.libraries.search.assistant.fluidactions.d.c.e r1 = r1.mo38533b()
            r1.mo38549b(r6)
            if (r3 == 0) goto L_0x00b9
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.b r2 = (com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33080b) r2
            com.google.assistant.e.j.e.fc r1 = r2.f88561c
            com.google.assistant.e.j.e.fc r4 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY
            if (r1 != r4) goto L_0x00b8
            com.google.assistant.e.j.e.fc r1 = r2.f88561c
            com.google.common.b.ij r2 = f88605b
            com.google.assistant.e.j.en r7 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f.m61462c(r3, r1, r2)
            goto L_0x00b9
        L_0x00b8:
            r7 = r3
        L_0x00b9:
            return r7
        L_0x00ba:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33092n.mo38518e(android.content.Context, com.google.assistant.e.j.e.ff, com.google.assistant.e.j.uh, j$.util.Optional, com.google.android.libraries.search.assistant.fluidactions.d.b.a.e.d, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.util.Iterator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38519f(com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33080b r8, p3186j$.util.Optional r9, p5462h.p5466c.C69577g r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33086h
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.h r0 = (com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33086h) r0
            int r1 = r0.f88593d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f88593d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.h r0 = new com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.h
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f88591b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f88593d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            java.lang.Object r8 = r0.f88590a
            p5462h.C69714l.m101134b(r10)
            goto L_0x0089
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0032:
            p5462h.C69714l.m101134b(r10)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.j r10 = new com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.j
            r10.<init>(r7, r8, r4)
            com.google.common.n.e.a.c r2 = new com.google.common.n.e.a.c
            r2.<init>(r10)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.i r10 = new com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.i
            r10.<init>(r7, r8, r4)
            com.google.common.n.e.a.c r5 = new com.google.common.n.e.a.c
            r5.<init>(r10)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.l r10 = new com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.l
            r10.<init>(r7, r9, r8, r4)
            com.google.common.n.e.a.c r9 = new com.google.common.n.e.a.c
            r9.<init>(r10)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.k r10 = new com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.k
            r10.<init>(r8, r7, r4)
            com.google.common.n.e.a.c r8 = new com.google.common.n.e.a.c
            r8.<init>(r10)
            r10 = 4
            h.f.a.l[] r10 = new p5462h.p5473f.p5474a.C69626l[r10]
            r6 = 0
            r10[r6] = r2
            r10[r3] = r5
            r2 = 2
            r10[r2] = r9
            r9 = 3
            r10[r9] = r8
            java.util.List r8 = p5462h.p5463a.C69540x.m100947e(r10)
            java.util.Iterator r8 = r8.iterator()
        L_0x0073:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0090
            java.lang.Object r9 = r8.next()
            h.f.a.l r9 = (p5462h.p5473f.p5474a.C69626l) r9
            r0.f88590a = r8
            r0.f88593d = r3
            java.lang.Object r10 = r9.mo5761a(r0)
            if (r10 == r1) goto L_0x008f
        L_0x0089:
            com.google.assistant.e.j.en r10 = (com.google.assistant.p3897e.p3921j.C52081en) r10
            if (r10 == 0) goto L_0x0073
            r4 = r10
            goto L_0x0090
        L_0x008f:
            return r1
        L_0x0090:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33092n.mo38519f(com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.b, j$.util.Optional, h.c.g):java.lang.Object");
    }

    /* renamed from: g */
    public final void mo38520g(String str) {
        C60870cx c = this.f88609f.mo40497c(str);
        C33091m mVar = new C33091m();
        C60856cj.m92911t(c, C47810es.m84974n(mVar), this.f88607d);
    }
}
