package com.google.android.apps.search.googleapp.discover.p10238u;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.ClientInfoBuilder$getClientInfo$2", mo61344c = "ClientInfoBuilder.kt", mo61345d = "invokeSuspend", mo61346e = {147, 148})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.q */
/* compiled from: PG */
final class C135118q extends C69572j implements C69630p {

    /* renamed from: a */
    Object f368005a;

    /* renamed from: b */
    Object f368006b;

    /* renamed from: c */
    Object f368007c;

    /* renamed from: d */
    int f368008d;

    /* renamed from: e */
    final /* synthetic */ C135123v f368009e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135118q(C135123v vVar, C69577g gVar) {
        super(2, gVar);
        this.f368009e = vVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135118q) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x04a9 A[LOOP:2: B:99:0x04a3->B:101:0x04a9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x04ef  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0461 A[LOOP:1: B:95:0x045b->B:97:0x0461, LOOP_END] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r1.f368008d
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0024
            if (r2 == r5) goto L_0x0019
            java.lang.Object r0 = r1.f368007c
            java.lang.Object r2 = r1.f368006b
            java.lang.Object r6 = r1.f368005a
            p5462h.C69714l.m101134b(r18)
            r8 = r18
            goto L_0x0073
        L_0x0019:
            java.lang.Object r2 = r1.f368006b
            java.lang.Object r6 = r1.f368005a
            p5462h.C69714l.m101134b(r18)
            r7 = r6
            r6 = r18
            goto L_0x0051
        L_0x0024:
            p5462h.C69714l.m101134b(r18)
            com.google.android.apps.search.googleapp.discover.u.v r2 = r1.f368009e
            android.content.Context r2 = r2.f368024e
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            com.google.android.apps.search.googleapp.discover.u.v r6 = r1.f368009e
            com.google.bv.e.b.c.a.m r7 = r6.f368025f
            com.google.android.apps.search.googleapp.discover.settings.c.g r6 = r6.f368027h
            r1.f368005a = r2
            r1.f368006b = r7
            r1.f368008d = r5
            h.c.o r8 = r6.f366659c
            com.google.android.apps.search.googleapp.discover.settings.c.b r9 = new com.google.android.apps.search.googleapp.discover.settings.c.b
            r9.<init>(r6, r4)
            java.lang.Object r6 = kotlinx.coroutines.C71803m.m105040a(r8, r9, r1)
            if (r6 == r0) goto L_0x04fe
            r16 = r7
            r7 = r2
            r2 = r16
        L_0x0051:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L_0x005d
            com.google.android.apps.search.googleapp.discover.u.v r6 = r1.f368009e
            android.content.Context r6 = r6.f368024e
            java.lang.String r6 = com.google.android.apps.search.googleapp.discover.p10238u.C135017cs.m218947b(r6)
        L_0x005d:
            com.google.common.base.b r8 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            r1.f368005a = r7
            r1.f368006b = r2
            r1.f368007c = r6
            r1.f368008d = r3
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r1)
            if (r8 == r0) goto L_0x04fe
            r0 = r6
            r6 = r7
        L_0x0073:
            com.google.common.base.ax r8 = (com.google.common.base.C58833ax) r8
            com.google.android.apps.search.googleapp.discover.u.v r7 = r1.f368009e
            com.google.bv.e.b.c.a.u r9 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57338u.f153181p
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.bv.e.b.c.a.n r9 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57331n) r9
            java.lang.String r10 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)
            com.google.bv.e.b.c.a.j r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")
            com.google.bv.e.b.c.a.t r11 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57337t.ANDROID
            java.lang.String r12 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r12)
            com.google.bv.e.b.c.a.n r13 = r9.f153133a
            r13.copyOnWrite()
            com.google.protobuf.bv r13 = r13.instance
            com.google.bv.e.b.c.a.u r13 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57338u) r13
            int r11 = r11.f153179d
            r13.f153184b = r11
            int r11 = r13.f153183a
            r11 = r11 | r5
            r13.f153183a = r11
            com.google.bv.e.b.c.a.dv r11 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57321dv.f153009i
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.bv.e.b.c.a.du r11 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57320du) r11
            java.lang.String r13 = "this"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r13)
            java.lang.String r13 = android.os.Build.VERSION.RELEASE
            java.lang.String r14 = "RELEASE"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r14)
            com.google.android.apps.search.googleapp.discover.p10238u.C135112k.m219116a(r11, r13)
            com.google.bv.e.b.c.a.dr r13 = com.google.android.apps.search.googleapp.discover.p10238u.C135123v.f368021b
            r11.copyOnWrite()
            com.google.protobuf.bv r14 = r11.instance
            com.google.bv.e.b.c.a.dv r14 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57321dv) r14
            int r13 = r13.f153000h
            r14.f153016f = r13
            int r13 = r14.f153011a
            r13 = r13 | 16
            r14.f153011a = r13
            java.lang.String r13 = android.os.Build.TAGS
            r14 = 0
            if (r13 == 0) goto L_0x0100
            java.lang.String r13 = android.os.Build.TAGS
            java.lang.String r15 = "TAGS"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r15)
            java.lang.String r4 = "dev-keys"
            boolean r4 = p5462h.p5483m.C69764m.m101205y(r13, r4, r14)
            if (r4 != 0) goto L_0x00fd
            java.lang.String r4 = android.os.Build.TAGS
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r15)
            java.lang.String r13 = "test-keys"
            boolean r4 = p5462h.p5483m.C69764m.m101205y(r4, r13, r14)
            if (r4 == 0) goto L_0x00ed
            goto L_0x00fd
        L_0x00ed:
            java.lang.String r4 = android.os.Build.TAGS
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r15)
            java.lang.String r13 = "release-keys"
            boolean r4 = p5462h.p5483m.C69764m.m101205y(r4, r13, r14)
            if (r4 == 0) goto L_0x0100
            com.google.bv.e.b.c.a.dt r4 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57319dt.RELEASE
            goto L_0x0102
        L_0x00fd:
            com.google.bv.e.b.c.a.dt r4 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57319dt.DEV
            goto L_0x0102
        L_0x0100:
            com.google.bv.e.b.c.a.dt r4 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57319dt.UNKNOWN_BUILD_TYPE
        L_0x0102:
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.bv.e.b.c.a.dv r13 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57321dv) r13
            int r4 = r4.f153008f
            r13.f153017g = r4
            int r4 = r13.f153011a
            r4 = r4 | 32
            r13.f153011a = r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.bv.e.b.c.a.dv r13 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57321dv) r13
            int r15 = r13.f153011a
            r15 = r15 | 64
            r13.f153011a = r15
            r13.f153018h = r4
            com.google.protobuf.bv r4 = r11.build()
            java.lang.String r11 = "newBuilder()\n        .ap…SDK_INT)\n        .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r11)
            com.google.bv.e.b.c.a.dv r4 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57321dv) r4
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r12)
            com.google.bv.e.b.c.a.n r11 = r9.f153133a
            r11.copyOnWrite()
            com.google.protobuf.bv r11 = r11.instance
            com.google.bv.e.b.c.a.u r11 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57338u) r11
            r4.getClass()
            r11.f153185c = r4
            int r4 = r11.f153183a
            r4 = r4 | r3
            r11.f153183a = r4
            java.lang.Object r0 = r8.mo56109e(r0)
            java.lang.String r4 = "gGoDiscoverOverriddenLocale.or(discoverLanguage)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r4)
            java.lang.String r0 = (java.lang.String) r0
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r12)
            com.google.bv.e.b.c.a.n r4 = r9.f153133a
            r4.copyOnWrite()
            com.google.protobuf.bv r4 = r4.instance
            com.google.bv.e.b.c.a.u r4 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57338u) r4
            r0.getClass()
            int r8 = r4.f153183a
            r8 = r8 | 16
            r4.f153183a = r8
            r4.f153188f = r0
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r12)
            com.google.bv.e.b.c.a.n r0 = r9.f153133a
            r0.copyOnWrite()
            com.google.protobuf.bv r0 = r0.instance
            com.google.bv.e.b.c.a.u r0 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57338u) r0
            com.google.bv.e.b.c.a.m r2 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57330m) r2
            int r2 = r2.f153143h
            r0.f153186d = r2
            int r2 = r0.f153183a
            r2 = r2 | 4
            r0.f153183a = r2
            android.content.Context r0 = r7.f368024e
            com.google.bv.e.b.c.a.dv r2 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57321dv.f153009i
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.bv.e.b.c.a.du r2 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57320du) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r10)
            android.content.pm.PackageManager r4 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x01a2 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x01a2 }
            android.content.pm.PackageInfo r0 = r4.getPackageInfo(r0, r14)     // Catch:{ NameNotFoundException -> 0x01a2 }
            java.lang.String r0 = r0.versionName     // Catch:{ NameNotFoundException -> 0x01a2 }
            java.lang.String r4 = "pInfo.versionName"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r4)     // Catch:{ NameNotFoundException -> 0x01a2 }
            goto L_0x01c3
        L_0x01a0:
            r0 = move-exception
            goto L_0x01c7
        L_0x01a2:
            r0 = move-exception
            com.google.common.f.e r4 = com.google.android.apps.search.googleapp.discover.p10238u.C135123v.f368020a     // Catch:{ NullPointerException -> 0x01a0 }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ NullPointerException -> 0x01a0 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ NullPointerException -> 0x01a0 }
            com.google.common.f.x r0 = r4.mo56382g(r0)     // Catch:{ NullPointerException -> 0x01a0 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ NullPointerException -> 0x01a0 }
            java.lang.String r4 = "Cannot find package name."
            com.google.common.f.n r8 = new com.google.common.f.n     // Catch:{ NullPointerException -> 0x01a0 }
            r11 = 40383(0x9dbf, float:5.6589E-41)
            r8.<init>(r11)     // Catch:{ NullPointerException -> 0x01a0 }
            r0.mo56379ah(r8)     // Catch:{ NullPointerException -> 0x01a0 }
            r0.mo56386p(r4)     // Catch:{ NullPointerException -> 0x01a0 }
            java.lang.String r0 = ""
        L_0x01c3:
            com.google.android.apps.search.googleapp.discover.p10238u.C135112k.m219116a(r2, r0)     // Catch:{ NullPointerException -> 0x01a0 }
            goto L_0x01e5
        L_0x01c7:
            com.google.common.f.e r4 = com.google.android.apps.search.googleapp.discover.p10238u.C135123v.f368020a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            com.google.common.f.x r0 = r4.mo56382g(r0)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r4 = new com.google.common.f.n
            r8 = 40382(0x9dbe, float:5.6587E-41)
            r4.<init>(r8)
            r0.mo56379ah(r4)
            java.lang.String r4 = "Unable to load version string."
            r0.mo56386p(r4)
        L_0x01e5:
            com.google.bv.e.b.c.a.dr r0 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57317dr.UNKNOWN_ARCHITECTURE
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.bv.e.b.c.a.dv r4 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57321dv) r4
            int r0 = r0.f153000h
            r4.f153016f = r0
            int r0 = r4.f153011a
            r0 = r0 | 16
            r4.f153011a = r0
            com.google.bv.e.b.c.a.dt r0 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57319dt.DEV
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.bv.e.b.c.a.dv r4 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57321dv) r4
            int r0 = r0.f153008f
            r4.f153017g = r0
            int r0 = r4.f153011a
            r0 = r0 | 32
            r4.f153011a = r0
            com.google.protobuf.bv r0 = r2.build()
            java.lang.String r2 = "builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            com.google.bv.e.b.c.a.dv r0 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57321dv) r0
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r12)
            com.google.bv.e.b.c.a.n r2 = r9.f153133a
            r2.copyOnWrite()
            com.google.protobuf.bv r2 = r2.instance
            com.google.bv.e.b.c.a.u r2 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57338u) r2
            r0.getClass()
            r2.f153187e = r0
            int r0 = r2.f153183a
            r0 = r0 | 8
            r2.f153183a = r0
            com.google.protobuf.a.b r0 = new com.google.protobuf.a.b
            com.google.bv.e.b.c.a.n r2 = r9.f153133a
            com.google.protobuf.bv r2 = r2.instance
            com.google.bv.e.b.c.a.u r2 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57338u) r2
            com.google.protobuf.cq r2 = r2.f153189g
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            java.lang.String r4 = "_builder.getDisplayInfoList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            r0.<init>(r2)
            com.google.bv.e.b.c.a.ak r0 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57229ak.f152774e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.bv.e.b.c.a.aj r0 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57228aj) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r10)
            java.lang.String r2 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r2)
            android.util.DisplayMetrics r6 = (android.util.DisplayMetrics) r6
            float r4 = r6.density
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.bv.e.b.c.a.ak r8 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57229ak) r8
            int r11 = r8.f152776a
            r11 = r11 | r5
            r8.f152776a = r11
            r8.f152777b = r4
            int r4 = r6.widthPixels
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.bv.e.b.c.a.ak r8 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57229ak) r8
            int r11 = r8.f152776a
            r11 = r11 | r3
            r8.f152776a = r11
            r8.f152778c = r4
            int r4 = r6.heightPixels
            r0.copyOnWrite()
            com.google.protobuf.bv r6 = r0.instance
            com.google.bv.e.b.c.a.ak r6 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57229ak) r6
            int r8 = r6.f152776a
            r8 = r8 | 4
            r6.f152776a = r8
            r6.f152779d = r4
            com.google.protobuf.bv r0 = r0.build()
            java.lang.String r4 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r4)
            com.google.bv.e.b.c.a.ak r0 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57229ak) r0
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r12)
            com.google.bv.e.b.c.a.n r6 = r9.f153133a
            r6.copyOnWrite()
            com.google.protobuf.bv r6 = r6.instance
            com.google.bv.e.b.c.a.u r6 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57338u) r6
            r0.getClass()
            com.google.protobuf.cq r8 = r6.f153189g
            boolean r11 = r8.mo58948c()
            if (r11 != 0) goto L_0x02ae
            com.google.protobuf.cq r8 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r8)
            r6.f153189g = r8
        L_0x02ae:
            com.google.protobuf.cq r6 = r6.f153189g
            r6.add(r0)
            com.google.bv.e.b.c.a.ag r0 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57225ag.f152763d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.bv.e.b.c.a.af r0 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57224af) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r10)
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r2)
            java.lang.String r6 = android.os.Build.MANUFACTURER
            java.lang.String r8 = "MANUFACTURER"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r8)
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r12)
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.bv.e.b.c.a.ag r8 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57225ag) r8
            r6.getClass()
            int r11 = r8.f152765a
            r11 = r11 | r5
            r8.f152765a = r11
            r8.f152766b = r6
            java.lang.String r6 = android.os.Build.MODEL
            java.lang.String r8 = "MODEL"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r8)
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r12)
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.bv.e.b.c.a.ag r8 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57225ag) r8
            r6.getClass()
            int r11 = r8.f152765a
            r11 = r11 | r3
            r8.f152765a = r11
            r8.f152767c = r6
            com.google.protobuf.bv r0 = r0.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r4)
            com.google.bv.e.b.c.a.ag r0 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57225ag) r0
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r12)
            com.google.bv.e.b.c.a.n r6 = r9.f153133a
            r6.copyOnWrite()
            com.google.protobuf.bv r6 = r6.instance
            com.google.bv.e.b.c.a.u r6 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57338u) r6
            r0.getClass()
            r6.f153192j = r0
            int r0 = r6.f153183a
            r0 = r0 | 128(0x80, float:1.794E-43)
            r6.f153183a = r0
            android.content.Context r0 = r7.f368024e
            java.lang.String r6 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r6)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            if (r0 != 0) goto L_0x0326
            com.google.bv.e.b.c.a.p r0 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57333p.DATA_SAVER_STATE_UNKNOWN
            goto L_0x0332
        L_0x0326:
            int r0 = r0.getRestrictBackgroundStatus()
            r8 = 3
            if (r0 != r8) goto L_0x0330
            com.google.bv.e.b.c.a.p r0 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57333p.ENABLED
            goto L_0x0332
        L_0x0330:
            com.google.bv.e.b.c.a.p r0 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57333p.DISABLED
        L_0x0332:
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r12)
            com.google.bv.e.b.c.a.n r8 = r9.f153133a
            r8.copyOnWrite()
            com.google.protobuf.bv r8 = r8.instance
            com.google.bv.e.b.c.a.u r8 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57338u) r8
            int r0 = r0.f153149d
            r8.f153193k = r0
            int r0 = r8.f153183a
            r0 = r0 | 256(0x100, float:3.59E-43)
            r8.f153183a = r0
            com.google.android.apps.gsa.sidekick.main.j.a.a r0 = r7.f368029j
            com.google.android.apps.gsa.search.core.google.gaia.o r8 = r0.f255070b
            android.accounts.Account r8 = r8.mo79668a()
            if (r8 == 0) goto L_0x035f
            com.google.android.apps.gsa.search.core.bd r0 = r0.f255069a
            java.lang.String r8 = r8.name
            boolean r0 = r0.mo79170h(r8)
            if (r0 == 0) goto L_0x035f
            com.google.bv.e.b.c.a.p r0 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57333p.ENABLED
            goto L_0x0361
        L_0x035f:
            com.google.bv.e.b.c.a.p r0 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57333p.DISABLED
        L_0x0361:
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r12)
            com.google.bv.e.b.c.a.n r8 = r9.f153133a
            r8.copyOnWrite()
            com.google.protobuf.bv r8 = r8.instance
            com.google.bv.e.b.c.a.u r8 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57338u) r8
            int r0 = r0.f153149d
            r8.f153194l = r0
            int r0 = r8.f153183a
            r0 = r0 | 512(0x200, float:7.175E-43)
            r8.f153183a = r0
            com.google.protobuf.a.b r0 = new com.google.protobuf.a.b
            com.google.bv.e.b.c.a.n r8 = r9.f153133a
            com.google.protobuf.bv r8 = r8.instance
            com.google.bv.e.b.c.a.u r8 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57338u) r8
            com.google.protobuf.cj r11 = new com.google.protobuf.cj
            com.google.protobuf.ch r8 = r8.f153195m
            com.google.protobuf.ci r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57338u.f153180n
            r11.<init>(r8, r13)
            r0.<init>(r11)
            android.content.Context r0 = r7.f368024e
            java.lang.Object r0 = r0.getSystemService(r6)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            if (r0 != 0) goto L_0x039d
            com.google.bv.e.b.c.a.r r0 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57335r.UNKNOWN
            java.util.List r0 = p5462h.p5463a.C69540x.m100944b(r0)
            goto L_0x043b
        L_0x039d:
            android.net.Network[] r6 = r0.getAllNetworks()
            java.lang.String r7 = "connectivityManager.allNetworks"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r8 = r6.length
            r11 = 0
        L_0x03af:
            if (r11 >= r8) goto L_0x043a
            r13 = r6[r11]
            android.net.Network r13 = (android.net.Network) r13
            android.net.NetworkInfo r13 = r0.getNetworkInfo(r13)
            if (r13 == 0) goto L_0x042f
            int r15 = r13.getType()
            switch(r15) {
                case 0: goto L_0x03ed;
                case 1: goto L_0x03ea;
                case 2: goto L_0x03ed;
                case 3: goto L_0x03ed;
                case 4: goto L_0x03ed;
                case 5: goto L_0x03ed;
                case 6: goto L_0x03e7;
                case 7: goto L_0x03e4;
                case 8: goto L_0x03cb;
                case 9: goto L_0x03c7;
                default: goto L_0x03c2;
            }
        L_0x03c2:
            com.google.android.apps.search.googleapp.discover.p10238u.C135112k.m219119d()
            goto L_0x042f
        L_0x03c7:
            com.google.bv.e.b.c.a.r r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57335r.ETHERNET
            goto L_0x0430
        L_0x03cb:
            com.google.common.f.e r13 = com.google.android.apps.search.googleapp.discover.p10238u.C135123v.f368020a
            com.google.common.f.x r13 = r13.mo56226d()
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            com.google.common.f.n r15 = new com.google.common.f.n
            r5 = 40380(0x9dbc, float:5.6584E-41)
            r15.<init>(r5)
            r13.mo56379ah(r15)
            java.lang.String r5 = "Unknown NetworkInfo: TYPE_DUMMY"
            r13.mo56386p(r5)
            goto L_0x042f
        L_0x03e4:
            com.google.bv.e.b.c.a.r r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57335r.BLUETOOTH
            goto L_0x0430
        L_0x03e7:
            com.google.bv.e.b.c.a.r r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57335r.WIMAX
            goto L_0x0430
        L_0x03ea:
            com.google.bv.e.b.c.a.r r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57335r.WIFI
            goto L_0x0430
        L_0x03ed:
            int r5 = r13.getSubtype()
            switch(r5) {
                case 1: goto L_0x0429;
                case 2: goto L_0x0426;
                case 3: goto L_0x0423;
                case 4: goto L_0x0420;
                case 5: goto L_0x041d;
                case 6: goto L_0x041a;
                case 7: goto L_0x0417;
                case 8: goto L_0x0414;
                case 9: goto L_0x0411;
                case 10: goto L_0x040e;
                case 11: goto L_0x040b;
                case 12: goto L_0x0408;
                case 13: goto L_0x0405;
                case 14: goto L_0x0402;
                case 15: goto L_0x03ff;
                default: goto L_0x03f4;
            }
        L_0x03f4:
            int r5 = r13.getSubtype()
            r13 = 20
            if (r5 != r13) goto L_0x042c
            com.google.bv.e.b.c.a.r r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57335r.MOBILE_NETWORK_TYPE_NR
            goto L_0x0430
        L_0x03ff:
            com.google.bv.e.b.c.a.r r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57335r.MOBILE_NETWORK_TYPE_HSPAP
            goto L_0x0430
        L_0x0402:
            com.google.bv.e.b.c.a.r r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57335r.MOBILE_NETWORK_TYPE_EHRPD
            goto L_0x0430
        L_0x0405:
            com.google.bv.e.b.c.a.r r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57335r.MOBILE_NETWORK_TYPE_LTE
            goto L_0x0430
        L_0x0408:
            com.google.bv.e.b.c.a.r r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57335r.MOBILE_NETWORK_TYPE_EVDO_B
            goto L_0x0430
        L_0x040b:
            com.google.bv.e.b.c.a.r r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57335r.MOBILE_NETWORK_TYPE_IDEN
            goto L_0x0430
        L_0x040e:
            com.google.bv.e.b.c.a.r r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57335r.MOBILE_NETWORK_TYPE_HSPA
            goto L_0x0430
        L_0x0411:
            com.google.bv.e.b.c.a.r r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57335r.MOBILE_NETWORK_TYPE_HSUPA
            goto L_0x0430
        L_0x0414:
            com.google.bv.e.b.c.a.r r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57335r.MOBILE_NETWORK_TYPE_HSDPA
            goto L_0x0430
        L_0x0417:
            com.google.bv.e.b.c.a.r r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57335r.MOBILE_NETWORK_TYPE_1XRTT
            goto L_0x0430
        L_0x041a:
            com.google.bv.e.b.c.a.r r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57335r.MOBILE_NETWORK_TYPE_EVDO_A
            goto L_0x0430
        L_0x041d:
            com.google.bv.e.b.c.a.r r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57335r.MOBILE_NETWORK_TYPE_EVDO_0
            goto L_0x0430
        L_0x0420:
            com.google.bv.e.b.c.a.r r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57335r.MOBILE_NETWORK_TYPE_CDMA
            goto L_0x0430
        L_0x0423:
            com.google.bv.e.b.c.a.r r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57335r.MOBILE_NETWORK_TYPE_UMTS
            goto L_0x0430
        L_0x0426:
            com.google.bv.e.b.c.a.r r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57335r.MOBILE_NETWORK_TYPE_EDGE
            goto L_0x0430
        L_0x0429:
            com.google.bv.e.b.c.a.r r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57335r.MOBILE_NETWORK_TYPE_GPRS
            goto L_0x0430
        L_0x042c:
            com.google.android.apps.search.googleapp.discover.p10238u.C135112k.m219119d()
        L_0x042f:
            r13 = 0
        L_0x0430:
            if (r13 == 0) goto L_0x0435
            r7.add(r13)
        L_0x0435:
            int r11 = r11 + 1
            r5 = 1
            goto L_0x03af
        L_0x043a:
            r0 = r7
        L_0x043b:
            java.lang.String r5 = "values"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r5)
            com.google.bv.e.b.c.a.n r5 = r9.f153133a
            r5.copyOnWrite()
            com.google.protobuf.bv r5 = r5.instance
            com.google.bv.e.b.c.a.u r5 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57338u) r5
            com.google.protobuf.ch r6 = r5.f153195m
            boolean r7 = r6.mo58948c()
            if (r7 != 0) goto L_0x0457
            com.google.protobuf.ch r6 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r6)
            r5.f153195m = r6
        L_0x0457:
            java.util.Iterator r0 = r0.iterator()
        L_0x045b:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x046f
            java.lang.Object r6 = r0.next()
            com.google.bv.e.b.c.a.r r6 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57335r) r6
            com.google.protobuf.ch r7 = r5.f153195m
            int r6 = r6.f153173v
            r7.mo58916g(r6)
            goto L_0x045b
        L_0x046f:
            com.google.protobuf.a.b r0 = new com.google.protobuf.a.b
            com.google.bv.e.b.c.a.n r5 = r9.f153133a
            com.google.protobuf.bv r5 = r5.instance
            com.google.bv.e.b.c.a.u r5 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57338u) r5
            com.google.protobuf.cq r5 = r5.f153196o
            java.util.List r5 = java.util.Collections.unmodifiableList(r5)
            java.lang.String r6 = "_builder.getSupportedRestrictedConditionsList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            r0.<init>(r5)
            com.google.bv.e.b.c.a.cd[] r0 = new com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57276cd[r3]
            com.google.bv.e.b.c.a.cd r3 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57276cd.AGSA_MAIN_APP
            r0[r14] = r3
            com.google.bv.e.b.c.a.cd r3 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57276cd.AGSA_MINUS_ONE
            r5 = 1
            r0[r5] = r3
            java.util.List r0 = p5462h.p5463a.C69540x.m100947e(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r5 = p5462h.p5463a.C69540x.m100804k(r0, r5)
            r3.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x04a3:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x04de
            java.lang.Object r5 = r0.next()
            com.google.bv.e.b.c.a.cd r5 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57276cd) r5
            com.google.bv.e.b.c.a.cf r6 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57278cf.f152908c
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.bv.e.b.c.a.ce r6 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57277ce) r6
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r10)
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r2)
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r12)
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.bv.e.b.c.a.cf r7 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57278cf) r7
            int r5 = r5.f152907d
            r7.f152911b = r5
            int r5 = r7.f152910a
            r8 = 1
            r5 = r5 | r8
            r7.f152910a = r5
            com.google.protobuf.bv r5 = r6.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r4)
            com.google.bv.e.b.c.a.cf r5 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57278cf) r5
            r3.add(r5)
            goto L_0x04a3
        L_0x04de:
            com.google.bv.e.b.c.a.n r0 = r9.f153133a
            r0.copyOnWrite()
            com.google.protobuf.bv r0 = r0.instance
            com.google.bv.e.b.c.a.u r0 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57338u) r0
            com.google.protobuf.cq r2 = r0.f153196o
            boolean r4 = r2.mo58948c()
            if (r4 != 0) goto L_0x04f5
            com.google.protobuf.cq r2 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r2)
            r0.f153196o = r2
        L_0x04f5:
            com.google.protobuf.cq r0 = r0.f153196o
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r3, (java.util.List) r0)
            com.google.bv.e.b.c.a.u r0 = r9.mo54474a()
        L_0x04fe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10238u.C135118q.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135118q(this.f368009e, gVar);
    }
}
