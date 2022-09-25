package com.google.android.libraries.search.assistant.p2828y.p2848i;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.requestcontext.devicecapabilities.DeviceCapabilitiesFetcher$buildDeviceCapabilities$2", mo61344c = "DeviceCapabilitiesFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {85})
/* renamed from: com.google.android.libraries.search.assistant.y.i.d */
/* compiled from: PG */
final class C36976d extends C69572j implements C69630p {

    /* renamed from: a */
    Object f96263a;

    /* renamed from: b */
    Object f96264b;

    /* renamed from: c */
    Object f96265c;

    /* renamed from: d */
    Object f96266d;

    /* renamed from: e */
    int f96267e;

    /* renamed from: f */
    final /* synthetic */ C36974b f96268f;

    /* renamed from: g */
    final /* synthetic */ C36979g f96269g;

    /* renamed from: h */
    private /* synthetic */ Object f96270h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36976d(C36974b bVar, C36979g gVar, C69577g gVar2) {
        super(2, gVar2);
        this.f96268f = bVar;
        this.f96269g = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C36976d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.assistant.e.j.qv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.google.assistant.e.j.qv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: com.google.assistant.e.j.qv} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x00ec A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0250 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x026e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f96267e
            r3 = 3
            r4 = 16
            r5 = 0
            java.lang.String r6 = "newBuilder()"
            java.lang.String r8 = "value"
            if (r2 == 0) goto L_0x0025
            java.lang.Object r1 = r0.f96266d
            java.lang.Object r2 = r0.f96265c
            java.lang.Object r9 = r0.f96264b
            java.lang.Object r10 = r0.f96263a
            java.lang.Object r11 = r0.f96270h
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            p5462h.C69714l.m101134b(r24)
            r3 = r24
            r4 = r10
            r10 = 0
            goto L_0x0356
        L_0x0025:
            p5462h.C69714l.m101134b(r24)
            java.lang.Object r2 = r0.f96270h
            kotlinx.coroutines.aw r2 = (kotlinx.coroutines.C71422aw) r2
            com.google.android.libraries.search.assistant.y.i.c r9 = new com.google.android.libraries.search.assistant.y.i.c
            com.google.android.libraries.search.assistant.y.i.g r10 = r0.f96269g
            r11 = 0
            r9.<init>(r10, r11)
            kotlinx.coroutines.be r2 = kotlinx.coroutines.C71803m.m105042c(r2, r11, r11, r9, r3)
            com.google.android.libraries.search.assistant.y.i.b r9 = r0.f96268f
            java.util.List r10 = r9.f96256c
            java.util.List r12 = r9.f96257d
            boolean r13 = r9.f96259f
            boolean r9 = r9.f96258e
            java.lang.String r14 = "packageInfo"
            java.lang.String r15 = "mediaFulfillmentDeniedAppList"
            r3 = 10
            if (r9 == 0) goto L_0x0234
            com.google.android.libraries.search.assistant.y.i.g r9 = r0.f96269g
            com.google.android.libraries.search.assistant.y.r.b r9 = r9.f96278b
            java.lang.String r7 = "appsListWithLaunchIntent"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r7)
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r15)
            android.content.Intent r7 = new android.content.Intent
            java.lang.String r15 = "android.intent.action.MAIN"
            r7.<init>(r15, r11)
            java.lang.String r15 = "android.intent.category.LAUNCHER"
            r7.addCategory(r15)
            android.content.pm.PackageManager r15 = r9.f96569c
            java.util.List r7 = r15.queryIntentActivities(r7, r5)
            java.lang.String r15 = "packageManager.queryInte…Activities(mainIntent, 0)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r15)
            android.content.Context r15 = r9.f96568b
            java.lang.String r15 = android.provider.Telephony.Sms.getDefaultSmsPackage(r15)
            java.lang.Iterable r11 = p5462h.p5463a.C69540x.m100855y(r10)
            int r17 = p5462h.p5463a.C69540x.m100804k(r11, r3)
            int r3 = p5462h.p5463a.C69505av.m100860b(r17)
            if (r3 >= r4) goto L_0x0083
            r3 = 16
        L_0x0083:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r3)
            java.util.Iterator r3 = r11.iterator()
        L_0x008c:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x00b2
            java.lang.Object r11 = r3.next()
            h.a.ap r11 = (p5462h.p5463a.C69499ap) r11
            java.lang.Object r5 = r11.f185922b
            int r11 = r11.f185921a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r19 = r3
            h.i r3 = new h.i
            r3.<init>(r5, r11)
            java.lang.Object r5 = r3.f186052a
            java.lang.Object r3 = r3.f186053b
            r4.put(r5, r3)
            r3 = r19
            r5 = 0
            goto L_0x008c
        L_0x00b2:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r5 = r7.iterator()
        L_0x00bb:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00f1
            java.lang.Object r7 = r5.next()
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            android.content.pm.ActivityInfo r7 = r7.activityInfo     // Catch:{ NameNotFoundException -> 0x00e1 }
            android.content.pm.ApplicationInfo r7 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x00e1 }
            java.lang.String r7 = r7.packageName     // Catch:{ NameNotFoundException -> 0x00e1 }
            h.i r11 = new h.i     // Catch:{ NameNotFoundException -> 0x00e1 }
            r19 = r5
            android.content.pm.PackageManager r5 = r9.f96569c     // Catch:{ NameNotFoundException -> 0x00de }
            r20 = r1
            r1 = 0
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r7, r1)     // Catch:{ NameNotFoundException -> 0x00e5 }
            r11.<init>(r7, r5)     // Catch:{ NameNotFoundException -> 0x00e5 }
            goto L_0x00e7
        L_0x00de:
            r20 = r1
            goto L_0x00e5
        L_0x00e1:
            r20 = r1
            r19 = r5
        L_0x00e5:
            r11 = 0
        L_0x00e7:
            if (r11 == 0) goto L_0x00ec
            r3.add(r11)
        L_0x00ec:
            r5 = r19
            r1 = r20
            goto L_0x00bb
        L_0x00f1:
            r20 = r1
            h.b.g r1 = p5462h.p5465b.C69550g.f185954a
            h.b.c r5 = new h.b.c
            r5.<init>(r1)
            com.google.android.libraries.search.assistant.y.r.a r1 = new com.google.android.libraries.search.assistant.y.r.a
            r1.<init>(r5, r4)
            java.util.List r1 = p5462h.p5463a.C69540x.m100837S(r3, r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = p5462h.p5463a.C69540x.m100804k(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x0112:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x022e
            java.lang.Object r4 = r1.next()
            h.i r4 = (p5462h.C69685i) r4
            java.lang.Object r5 = r4.f186052a
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.f186053b
            android.content.pm.PackageInfo r4 = (android.content.pm.PackageInfo) r4
            com.google.assistant.e.j.as r7 = com.google.assistant.p3897e.p3921j.C51691as.f135610d
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.e.j.ar r7 = (com.google.assistant.p3897e.p3921j.C51690ar) r7
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r6)
            com.google.assistant.e.j.ae r7 = p5462h.p5473f.p5475b.C69664n.m101061g(r7, "builder")
            java.lang.String r11 = "packageName"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r11)
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r14)
            boolean r11 = p5462h.p5463a.C69540x.m100848ad(r10, r5)
            com.google.assistant.e.c.c.gh r11 = r9.mo40608a(r5, r4, r11, r13)
            com.google.protobuf.bn r11 = r11.toBuilder()
            r24 = r1
            java.lang.String r1 = "this.toBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r1)
            com.google.assistant.e.c.c.gg r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51097gg) r11
            com.google.assistant.e.c.c.er r11 = p5462h.p5473f.p5475b.C69664n.m101061g(r11, "builder")
            r18 = r9
            com.google.assistant.e.c.c.gg r9 = r11.f132939a
            com.google.protobuf.bv r9 = r9.instance
            com.google.assistant.e.c.c.gh r9 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r9
            r19 = r2
            int r2 = r9.f133012b
            r21 = r13
            r13 = 1
            if (r2 != r13) goto L_0x016c
            java.lang.Object r2 = r9.f133013c
            com.google.assistant.e.c.c.ev r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r2
            goto L_0x016e
        L_0x016c:
            com.google.assistant.e.c.c.ev r2 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x016e:
            java.lang.String r9 = "_builder.getAndroidAppInfo()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r9)
            com.google.protobuf.bn r2 = r2.toBuilder()
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r1)
            com.google.assistant.e.c.c.es r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51055es) r2
            com.google.assistant.e.c.c.f r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            r1.mo53516c(r5)
            if (r15 == 0) goto L_0x019b
            r2 = 1
            boolean r9 = p5462h.p5483m.C69764m.m101228g(r15, r5, r2)
            com.google.assistant.e.c.c.es r2 = r1.f132964a
            r2.copyOnWrite()
            com.google.protobuf.bv r2 = r2.instance
            com.google.assistant.e.c.c.ev r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r2
            int r13 = r2.f132943a
            r13 = r13 | 4096(0x1000, float:5.74E-42)
            r2.f132943a = r13
            r2.f132955m = r9
        L_0x019b:
            int r2 = r4.versionCode
            com.google.assistant.e.c.c.es r9 = r1.f132964a
            r9.copyOnWrite()
            com.google.protobuf.bv r9 = r9.instance
            com.google.assistant.e.c.c.ev r9 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r9
            int r13 = r9.f132943a
            r13 = r13 | 2
            r9.f132943a = r13
            r9.f132945c = r2
            r2 = r14
            long r13 = androidx.core.content.p090a.C1846a.m5060a(r4)
            com.google.assistant.e.c.c.es r9 = r1.f132964a
            r9.copyOnWrite()
            com.google.protobuf.bv r9 = r9.instance
            com.google.assistant.e.c.c.ev r9 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r9
            r22 = r15
            int r15 = r9.f132943a
            r15 = r15 | 4
            r9.f132943a = r15
            r9.f132946d = r13
            java.util.Set r9 = com.google.android.libraries.search.assistant.p2828y.p2859r.C37074b.f96567a
            boolean r9 = r9.contains(r5)
            if (r9 == 0) goto L_0x01ec
            java.lang.String r4 = r4.versionName
            java.lang.String r9 = "packageInfo.versionName"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r9)
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r8)
            com.google.assistant.e.c.c.es r9 = r1.f132964a
            r9.copyOnWrite()
            com.google.protobuf.bv r9 = r9.instance
            com.google.assistant.e.c.c.ev r9 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r9
            r4.getClass()
            int r13 = r9.f132943a
            r13 = r13 | 8
            r9.f132943a = r13
            r9.f132947e = r4
        L_0x01ec:
            com.google.assistant.e.c.c.ev r1 = r1.mo53514a()
            r11.mo53512b(r1)
            com.google.assistant.e.c.c.gh r1 = r11.mo53511a()
            r7.mo53683b(r1)
            boolean r1 = p5462h.p5463a.C69540x.m100848ad(r12, r5)
            if (r1 != 0) goto L_0x0208
            boolean r1 = p5462h.p5463a.C69540x.m100848ad(r10, r5)
            if (r1 == 0) goto L_0x0208
            r1 = 1
            goto L_0x0209
        L_0x0208:
            r1 = 0
        L_0x0209:
            com.google.assistant.e.j.ar r4 = r7.f134920a
            r4.copyOnWrite()
            com.google.protobuf.bv r4 = r4.instance
            com.google.assistant.e.j.as r4 = (com.google.assistant.p3897e.p3921j.C51691as) r4
            int r5 = r4.f135612a
            r5 = r5 | 128(0x80, float:1.794E-43)
            r4.f135612a = r5
            r4.f135614c = r1
            com.google.assistant.e.j.as r1 = r7.mo53682a()
            r3.add(r1)
            r1 = r24
            r14 = r2
            r9 = r18
            r2 = r19
            r13 = r21
            r15 = r22
            goto L_0x0112
        L_0x022e:
            r19 = r2
            r11 = r3
            r10 = 0
            goto L_0x0305
        L_0x0234:
            r20 = r1
            r19 = r2
            r21 = r13
            r2 = r14
            com.google.android.libraries.search.assistant.y.i.g r1 = r0.f96269g
            com.google.android.libraries.search.assistant.y.r.b r1 = r1.f96278b
            java.lang.String r3 = "appsWhitelist"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r3)
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r15)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r10.iterator()
        L_0x0250:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0272
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            h.i r7 = new h.i     // Catch:{ NameNotFoundException -> 0x0269 }
            android.content.pm.PackageManager r9 = r1.f96569c     // Catch:{ NameNotFoundException -> 0x0269 }
            r10 = 0
            android.content.pm.PackageInfo r9 = r9.getPackageInfo(r5, r10)     // Catch:{ NameNotFoundException -> 0x026a }
            r7.<init>(r5, r9)     // Catch:{ NameNotFoundException -> 0x026a }
            goto L_0x026c
        L_0x0269:
            r10 = 0
        L_0x026a:
            r7 = 0
        L_0x026c:
            if (r7 == 0) goto L_0x0250
            r3.add(r7)
            goto L_0x0250
        L_0x0272:
            r10 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x027c:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x02a7
            java.lang.Object r5 = r3.next()
            r7 = r5
            h.i r7 = (p5462h.C69685i) r7
            java.lang.Object r9 = r7.f186052a
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r7 = r7.f186053b
            android.content.pm.PackageInfo r7 = (android.content.pm.PackageInfo) r7
            if (r9 == 0) goto L_0x027c
            int r9 = r9.length()
            if (r9 == 0) goto L_0x027c
            android.content.pm.ApplicationInfo r9 = r7.applicationInfo
            if (r9 == 0) goto L_0x027c
            android.content.pm.ApplicationInfo r7 = r7.applicationInfo
            boolean r7 = r7.enabled
            if (r7 == 0) goto L_0x027c
            r4.add(r5)
            goto L_0x027c
        L_0x02a7:
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r5 = p5462h.p5463a.C69540x.m100804k(r4, r5)
            r3.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x02b6:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0304
            java.lang.Object r5 = r4.next()
            h.i r5 = (p5462h.C69685i) r5
            java.lang.Object r7 = r5.f186052a
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r5.f186053b
            android.content.pm.PackageInfo r5 = (android.content.pm.PackageInfo) r5
            com.google.assistant.e.j.as r9 = com.google.assistant.p3897e.p3921j.C51691as.f135610d
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.e.j.ar r9 = (com.google.assistant.p3897e.p3921j.C51690ar) r9
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r6)
            com.google.assistant.e.j.ae r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            r11 = r21
            r13 = 1
            com.google.assistant.e.c.c.gh r5 = r1.mo40608a(r7, r5, r13, r11)
            r9.mo53683b(r5)
            boolean r5 = p5462h.p5463a.C69540x.m100848ad(r12, r7)
            com.google.assistant.e.j.ar r7 = r9.f134920a
            r7.copyOnWrite()
            com.google.protobuf.bv r7 = r7.instance
            com.google.assistant.e.j.as r7 = (com.google.assistant.p3897e.p3921j.C51691as) r7
            int r14 = r7.f135612a
            r14 = r14 | 128(0x80, float:1.794E-43)
            r7.f135612a = r14
            r5 = r5 ^ r13
            r7.f135614c = r5
            com.google.assistant.e.j.as r5 = r9.mo53682a()
            r3.add(r5)
            goto L_0x02b6
        L_0x0304:
            r11 = r3
        L_0x0305:
            com.google.android.libraries.search.assistant.y.i.b r1 = r0.f96268f
            com.google.android.libraries.search.assistant.y.i.g r9 = r0.f96269g
            com.google.assistant.e.j.bm r2 = com.google.assistant.p3897e.p3921j.C51715bm.f135662t
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.bl r2 = (com.google.assistant.p3897e.p3921j.C51714bl) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r6)
            com.google.assistant.e.j.qv r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            com.google.assistant.e.j.amf r3 = r1.f96254a
            java.lang.String r3 = r3.f135369c
            java.lang.String r4 = "configuration.surfaceIdentity.surfaceTypeString"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)
            r2.mo53863e(r3)
            com.google.assistant.e.j.amf r3 = r1.f96254a
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r8)
            com.google.assistant.e.j.bl r4 = r2.f137536a
            r4.copyOnWrite()
            com.google.protobuf.bv r4 = r4.instance
            com.google.assistant.e.j.bm r4 = (com.google.assistant.p3897e.p3921j.C51715bm) r4
            r3.getClass()
            r4.f135667d = r3
            int r3 = r4.f135664a
            r3 = r3 | 4
            r4.f135664a = r3
            r0.f96270h = r11
            r0.f96263a = r1
            r0.f96264b = r9
            r0.f96265c = r2
            r0.f96266d = r2
            r3 = 1
            r0.f96267e = r3
            r3 = r19
            java.lang.Object r3 = r3.mo62825a(r0)
            r4 = r20
            if (r3 == r4) goto L_0x0770
            r4 = r1
            r1 = r2
        L_0x0356:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0384
            com.google.assistant.e.j.rj r5 = com.google.assistant.p3897e.p3921j.C52428rj.f137558m
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.e.j.ri r5 = (com.google.assistant.p3897e.p3921j.C52427ri) r5
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            com.google.assistant.e.j.rf r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")
            com.google.assistant.e.j.ri r7 = r5.f137552a
            r7.copyOnWrite()
            com.google.protobuf.bv r7 = r7.instance
            com.google.assistant.e.j.rj r7 = (com.google.assistant.p3897e.p3921j.C52428rj) r7
            int r12 = r7.f137560a
            r12 = r12 | 8
            r7.f137560a = r12
            r7.f137563d = r3
            com.google.assistant.e.j.rj r3 = r5.mo53866a()
            r5 = r1
            com.google.assistant.e.j.qv r5 = (com.google.assistant.p3897e.p3921j.C52413qv) r5
            r5.mo53861c(r3)
        L_0x0384:
            com.google.android.libraries.search.assistant.y.i.g r9 = (com.google.android.libraries.search.assistant.p2828y.p2848i.C36979g) r9
            com.google.android.libraries.search.assistant.y.r.c r3 = r9.f96279c
            com.google.assistant.e.j.bc r5 = com.google.assistant.p3897e.p3921j.C51705bc.f135639e
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.e.j.bb r5 = (com.google.assistant.p3897e.p3921j.C51704bb) r5
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            java.lang.String r7 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r7)
            com.google.assistant.e.j.be r12 = com.google.assistant.p3897e.p3921j.C51707be.MUSIC_QUALITY
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r8)
            r5.copyOnWrite()
            com.google.protobuf.bv r13 = r5.instance
            com.google.assistant.e.j.bc r13 = (com.google.assistant.p3897e.p3921j.C51705bc) r13
            int r12 = r12.f135649c
            r13.f135642b = r12
            int r12 = r13.f135641a
            r14 = 1
            r12 = r12 | r14
            r13.f135641a = r12
            com.google.assistant.e.j.ay r12 = com.google.assistant.p3897e.p3921j.C51697ay.SURROUNDING_USERS
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r8)
            r5.copyOnWrite()
            com.google.protobuf.bv r13 = r5.instance
            com.google.assistant.e.j.bc r13 = (com.google.assistant.p3897e.p3921j.C51705bc) r13
            int r12 = r12.f135627c
            r13.f135643c = r12
            int r12 = r13.f135641a
            r12 = r12 | 2
            r13.f135641a = r12
            com.google.assistant.e.j.dp r12 = com.google.assistant.p3897e.p3921j.C51800dp.f135913d
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.assistant.e.j.do r12 = (com.google.assistant.p3897e.p3921j.C51799do) r12
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r6)
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r7)
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.assistant.e.j.dp r13 = (com.google.assistant.p3897e.p3921j.C51800dp) r13
            int r14 = r13.f135915a
            r14 = r14 | 2
            r13.f135915a = r14
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r13.f135917c = r14
            android.media.AudioManager r3 = r3.f96570a
            r13 = 3
            int r3 = r3.getStreamMaxVolume(r13)
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.assistant.e.j.dp r13 = (com.google.assistant.p3897e.p3921j.C51800dp) r13
            int r14 = r13.f135915a
            r15 = 1
            r14 = r14 | r15
            r13.f135915a = r14
            r13.f135916b = r3
            com.google.protobuf.bv r3 = r12.build()
            java.lang.String r12 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r12)
            com.google.assistant.e.j.dp r3 = (com.google.assistant.p3897e.p3921j.C51800dp) r3
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r8)
            r5.copyOnWrite()
            com.google.protobuf.bv r13 = r5.instance
            com.google.assistant.e.j.bc r13 = (com.google.assistant.p3897e.p3921j.C51705bc) r13
            r3.getClass()
            r13.f135644d = r3
            int r3 = r13.f135641a
            r3 = r3 | 4
            r13.f135641a = r3
            com.google.protobuf.bv r3 = r5.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r12)
            com.google.assistant.e.j.bc r3 = (com.google.assistant.p3897e.p3921j.C51705bc) r3
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r8)
            com.google.assistant.e.j.qv r1 = (com.google.assistant.p3897e.p3921j.C52413qv) r1
            com.google.assistant.e.j.bl r5 = r1.f137536a
            r5.copyOnWrite()
            com.google.protobuf.bv r5 = r5.instance
            com.google.assistant.e.j.bm r5 = (com.google.assistant.p3897e.p3921j.C51715bm) r5
            com.google.assistant.e.j.bm r13 = com.google.assistant.p3897e.p3921j.C51715bm.f135662t
            r3.getClass()
            r5.f135668e = r3
            int r3 = r5.f135664a
            r3 = r3 | 8
            r5.f135664a = r3
            com.google.android.libraries.search.assistant.y.r.c r3 = r9.f96279c
            com.google.assistant.e.j.ba r3 = com.google.assistant.p3897e.p3921j.C51703ba.f135634d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.e.j.az r3 = (com.google.assistant.p3897e.p3921j.C51698az) r3
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r6)
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r7)
            com.google.assistant.e.j.be r5 = com.google.assistant.p3897e.p3921j.C51707be.VOICE_QUALITY
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r8)
            r3.copyOnWrite()
            com.google.protobuf.bv r13 = r3.instance
            com.google.assistant.e.j.ba r13 = (com.google.assistant.p3897e.p3921j.C51703ba) r13
            int r5 = r5.f135649c
            r13.f135637b = r5
            int r5 = r13.f135636a
            r14 = 1
            r5 = r5 | r14
            r13.f135636a = r5
            com.google.assistant.e.j.ay r5 = com.google.assistant.p3897e.p3921j.C51697ay.AUTHENTICATED_USER_ONLY
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r8)
            r3.copyOnWrite()
            com.google.protobuf.bv r13 = r3.instance
            com.google.assistant.e.j.ba r13 = (com.google.assistant.p3897e.p3921j.C51703ba) r13
            int r5 = r5.f135627c
            r13.f135638c = r5
            int r5 = r13.f135636a
            r5 = r5 | 2
            r13.f135636a = r5
            com.google.protobuf.bv r3 = r3.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r12)
            com.google.assistant.e.j.ba r3 = (com.google.assistant.p3897e.p3921j.C51703ba) r3
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r8)
            com.google.assistant.e.j.bl r5 = r1.f137536a
            r5.copyOnWrite()
            com.google.protobuf.bv r5 = r5.instance
            com.google.assistant.e.j.bm r5 = (com.google.assistant.p3897e.p3921j.C51715bm) r5
            r3.getClass()
            r5.f135669f = r3
            int r3 = r5.f135664a
            r13 = 16
            r3 = r3 | r13
            r5.f135664a = r3
            com.google.android.libraries.search.assistant.y.r.k r3 = r9.f96280d
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            android.content.Context r13 = r3.f96586a
            android.content.res.Resources r13 = r13.getResources()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            android.content.Context r3 = r3.f96586a
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            java.lang.String r14 = "android.hardware.touchscreen"
            boolean r3 = r3.hasSystemFeature(r14)
            int r14 = r13.widthPixels
            int r14 = r13.heightPixels
            com.google.assistant.e.j.cs r14 = com.google.assistant.p3897e.p3921j.C51766cs.f135811e
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.assistant.e.j.cn r14 = (com.google.assistant.p3897e.p3921j.C51761cn) r14
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r6)
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r7)
            if (r3 == 0) goto L_0x04e5
            com.google.protobuf.a.b r3 = new com.google.protobuf.a.b
            com.google.protobuf.bv r15 = r14.instance
            com.google.assistant.e.j.cs r15 = (com.google.assistant.p3897e.p3921j.C51766cs) r15
            com.google.protobuf.cj r10 = new com.google.protobuf.cj
            com.google.protobuf.ch r15 = r15.f135814b
            com.google.protobuf.ci r0 = com.google.assistant.p3897e.p3921j.C51766cs.f135810c
            r10.<init>(r15, r0)
            r3.<init>(r10)
            com.google.assistant.e.j.cp r0 = com.google.assistant.p3897e.p3921j.C51763cp.f135799a
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r8)
            r14.mo53720a(r0)
        L_0x04e5:
            com.google.assistant.e.j.cr r0 = com.google.assistant.p3897e.p3921j.C51765cr.f135802g
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.cq r0 = (com.google.assistant.p3897e.p3921j.C51764cq) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r6)
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r7)
            int r3 = r13.widthPixels
            r0.copyOnWrite()
            com.google.protobuf.bv r10 = r0.instance
            com.google.assistant.e.j.cr r10 = (com.google.assistant.p3897e.p3921j.C51765cr) r10
            int r15 = r10.f135804a
            r16 = 1
            r15 = r15 | 1
            r10.f135804a = r15
            r10.f135805b = r3
            int r3 = r13.heightPixels
            r0.copyOnWrite()
            com.google.protobuf.bv r10 = r0.instance
            com.google.assistant.e.j.cr r10 = (com.google.assistant.p3897e.p3921j.C51765cr) r10
            int r15 = r10.f135804a
            r15 = r15 | 2
            r10.f135804a = r15
            r10.f135806c = r3
            int r3 = r13.densityDpi
            r0.copyOnWrite()
            com.google.protobuf.bv r10 = r0.instance
            com.google.assistant.e.j.cr r10 = (com.google.assistant.p3897e.p3921j.C51765cr) r10
            int r13 = r10.f135804a
            r15 = 16
            r13 = r13 | r15
            r10.f135804a = r13
            r10.f135809f = r3
            java.lang.String r3 = "M"
            int r3 = com.google.android.libraries.search.assistant.p2828y.p2859r.C37083k.m65850a(r5, r3)
            r0.copyOnWrite()
            com.google.protobuf.bv r10 = r0.instance
            com.google.assistant.e.j.cr r10 = (com.google.assistant.p3897e.p3921j.C51765cr) r10
            int r13 = r10.f135804a
            r13 = r13 | 4
            r10.f135804a = r13
            r10.f135807d = r3
            java.lang.String r3 = "螚"
            int r3 = com.google.android.libraries.search.assistant.p2828y.p2859r.C37083k.m65850a(r5, r3)
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.assistant.e.j.cr r5 = (com.google.assistant.p3897e.p3921j.C51765cr) r5
            int r10 = r5.f135804a
            r10 = r10 | 8
            r5.f135804a = r10
            r5.f135808e = r3
            com.google.protobuf.bv r0 = r0.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r12)
            com.google.assistant.e.j.cr r0 = (com.google.assistant.p3897e.p3921j.C51765cr) r0
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r8)
            r14.copyOnWrite()
            com.google.protobuf.bv r3 = r14.instance
            com.google.assistant.e.j.cs r3 = (com.google.assistant.p3897e.p3921j.C51766cs) r3
            r0.getClass()
            r3.f135815d = r0
            int r0 = r3.f135813a
            r5 = 1
            r0 = r0 | r5
            r3.f135813a = r0
            com.google.protobuf.bv r0 = r14.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r12)
            com.google.assistant.e.j.cs r0 = (com.google.assistant.p3897e.p3921j.C51766cs) r0
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r8)
            com.google.assistant.e.j.bl r3 = r1.f137536a
            r3.copyOnWrite()
            com.google.protobuf.bv r3 = r3.instance
            com.google.assistant.e.j.bm r3 = (com.google.assistant.p3897e.p3921j.C51715bm) r3
            r0.getClass()
            r3.f135670g = r0
            int r0 = r3.f135664a
            r0 = r0 | 32
            r3.f135664a = r0
            com.google.android.libraries.search.assistant.y.r.i r0 = r9.f96281e
            androidx.core.app.aq r3 = r0.f96582b
            android.app.NotificationManager r3 = r3.f5622a
            boolean r3 = androidx.core.app.C1793aj.m4937b(r3)
            if (r3 == 0) goto L_0x05a0
            com.google.assistant.e.j.by r3 = com.google.assistant.p3897e.p3921j.C51727by.NOTIFICATIONS_ENABLED
            goto L_0x05a2
        L_0x05a0:
            com.google.assistant.e.j.by r3 = com.google.assistant.p3897e.p3921j.C51727by.NOTIFICATIONS_DISABLED
        L_0x05a2:
            com.google.assistant.e.j.dn r5 = com.google.assistant.p3897e.p3921j.C51798dn.f135907e
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.e.j.dh r5 = (com.google.assistant.p3897e.p3921j.C51792dh) r5
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r7)
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r8)
            r5.copyOnWrite()
            com.google.protobuf.bv r10 = r5.instance
            com.google.assistant.e.j.dn r10 = (com.google.assistant.p3897e.p3921j.C51798dn) r10
            int r3 = r3.f135712d
            r10.f135910b = r3
            int r3 = r10.f135909a
            r13 = 1
            r3 = r3 | r13
            r10.f135909a = r3
            com.google.protobuf.a.b r3 = new com.google.protobuf.a.b
            com.google.protobuf.cq r10 = r10.f135911c
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            java.lang.String r13 = "_builder.getChannelStateList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r13)
            r3.<init>(r10)
            java.util.Map r3 = com.google.android.libraries.search.assistant.p2828y.p2859r.C37081i.f96581a
            java.util.ArrayList r10 = new java.util.ArrayList
            int r13 = r3.size()
            r10.<init>(r13)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x05e7:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto L_0x0664
            java.lang.Object r13 = r3.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r14 = r13.getKey()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r13 = r13.getValue()
            com.google.assistant.ag.c.c r13 = (com.google.assistant.p3803ag.p3809c.C48980c) r13
            com.google.assistant.e.j.dm r14 = com.google.assistant.p3897e.p3921j.C51797dm.f135902d
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.assistant.e.j.dl r14 = (com.google.assistant.p3897e.p3921j.C51796dl) r14
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r6)
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r7)
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r8)
            r14.copyOnWrite()
            com.google.protobuf.bv r15 = r14.instance
            com.google.assistant.e.j.dm r15 = (com.google.assistant.p3897e.p3921j.C51797dm) r15
            int r13 = r13.getNumber()
            r15.f135905b = r13
            int r13 = r15.f135904a
            r16 = 1
            r13 = r13 | 1
            r15.f135904a = r13
            androidx.core.app.aq r13 = r0.f96582b
            android.app.NotificationManager r13 = r13.f5622a
            boolean r13 = androidx.core.app.C1793aj.m4937b(r13)
            if (r13 != 0) goto L_0x0631
        L_0x062f:
            r13 = 0
            goto L_0x0644
        L_0x0631:
            androidx.core.app.aq r13 = r0.f96582b
            android.app.NotificationManager r13 = r13.f5622a
            java.lang.String r15 = "assistant_notification_channels"
            android.app.NotificationChannelGroup r13 = androidx.core.app.C1795al.m4949a(r13, r15)
            if (r13 == 0) goto L_0x0643
            boolean r13 = r13.isBlocked()
            if (r13 != 0) goto L_0x062f
        L_0x0643:
            r13 = 1
        L_0x0644:
            r14.copyOnWrite()
            com.google.protobuf.bv r15 = r14.instance
            com.google.assistant.e.j.dm r15 = (com.google.assistant.p3897e.p3921j.C51797dm) r15
            r16 = r0
            int r0 = r15.f135904a
            r0 = r0 | 2
            r15.f135904a = r0
            r15.f135906c = r13
            com.google.protobuf.bv r0 = r14.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r12)
            com.google.assistant.e.j.dm r0 = (com.google.assistant.p3897e.p3921j.C51797dm) r0
            r10.add(r0)
            r0 = r16
            goto L_0x05e7
        L_0x0664:
            r5.mo53727a(r10)
            com.google.protobuf.bv r0 = r5.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r12)
            com.google.assistant.e.j.dn r0 = (com.google.assistant.p3897e.p3921j.C51798dn) r0
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r8)
            com.google.assistant.e.j.bl r3 = r1.f137536a
            r3.copyOnWrite()
            com.google.protobuf.bv r3 = r3.instance
            com.google.assistant.e.j.bm r3 = (com.google.assistant.p3897e.p3921j.C51715bm) r3
            r0.getClass()
            r3.f135675l = r0
            int r0 = r3.f135664a
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r3.f135664a = r0
            com.google.assistant.e.j.cy r0 = com.google.assistant.p3897e.p3921j.C51772cy.f135824p
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.cx r0 = (com.google.assistant.p3897e.p3921j.C51771cx) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r6)
            com.google.assistant.e.j.akn r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            com.google.android.libraries.search.assistant.y.i.b r4 = (com.google.android.libraries.search.assistant.p2828y.p2848i.C36974b) r4
            com.google.assistant.e.j.li r3 = r4.f96255b
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r8)
            com.google.assistant.e.j.cx r5 = r0.f135278a
            r5.copyOnWrite()
            com.google.protobuf.bv r5 = r5.instance
            com.google.assistant.e.j.cy r5 = (com.google.assistant.p3897e.p3921j.C51772cy) r5
            r3.getClass()
            r5.f135828c = r3
            int r3 = r5.f135826a
            r10 = 1
            r3 = r3 | r10
            r5.f135826a = r3
            com.google.assistant.e.j.dc r3 = com.google.assistant.p3897e.p3921j.C51787dc.f135881c
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.e.j.db r3 = (com.google.assistant.p3897e.p3921j.C51786db) r3
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r6)
            com.google.assistant.e.j.amb r3 = p5462h.p5473f.p5475b.C69664n.m101061g(r3, "builder")
            r3.mo53702b()
            com.google.assistant.e.j.dc r3 = r3.mo53701a()
            r0.mo53693c(r3)
            com.google.protobuf.a.b r3 = new com.google.protobuf.a.b
            com.google.assistant.e.j.cx r5 = r0.f135278a
            com.google.protobuf.bv r5 = r5.instance
            com.google.assistant.e.j.cy r5 = (com.google.assistant.p3897e.p3921j.C51772cy) r5
            com.google.protobuf.cq r5 = r5.f135829d
            java.util.List r5 = java.util.Collections.unmodifiableList(r5)
            java.lang.String r10 = "_builder.getAppCapabilitiesList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r10)
            r3.<init>(r5)
            java.lang.String r3 = "values"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r3)
            com.google.assistant.e.j.cx r3 = r0.f135278a
            r3.mo53722a(r11)
            com.google.assistant.e.j.cy r0 = r0.mo53691a()
            r1.mo53862d(r0)
            com.google.assistant.e.j.bw r0 = com.google.assistant.p3897e.p3921j.C51725bw.f135701e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.bv r0 = (com.google.assistant.p3897e.p3921j.C51724bv) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r6)
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r7)
            java.lang.String r3 = android.os.Build.VERSION.RELEASE
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.assistant.e.j.bw r5 = (com.google.assistant.p3897e.p3921j.C51725bw) r5
            int r6 = r5.f135703a
            r7 = 1
            r6 = r6 | r7
            r5.f135703a = r6
            java.lang.String r6 = "Android "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r6.concat(r3)
            r5.f135704b = r3
            java.lang.String r3 = android.os.Build.MODEL
            java.lang.String r5 = "MODEL"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r5)
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r8)
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.assistant.e.j.bw r5 = (com.google.assistant.p3897e.p3921j.C51725bw) r5
            r3.getClass()
            int r6 = r5.f135703a
            r6 = r6 | 2
            r5.f135703a = r6
            r5.f135705c = r3
            java.lang.String r3 = r9.f96277a
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.assistant.e.j.bw r5 = (com.google.assistant.p3897e.p3921j.C51725bw) r5
            int r6 = r5.f135703a
            r6 = r6 | 4
            r5.f135703a = r6
            r5.f135706d = r3
            com.google.protobuf.bv r0 = r0.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r12)
            com.google.assistant.e.j.bw r0 = (com.google.assistant.p3897e.p3921j.C51725bw) r0
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r8)
            com.google.assistant.e.j.bl r1 = r1.f137536a
            r1.copyOnWrite()
            com.google.protobuf.bv r1 = r1.instance
            com.google.assistant.e.j.bm r1 = (com.google.assistant.p3897e.p3921j.C51715bm) r1
            r0.getClass()
            r1.f135673j = r0
            int r0 = r1.f135664a
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.f135664a = r0
            java.util.List r0 = r4.f96260g
            com.google.assistant.e.j.qv r2 = (com.google.assistant.p3897e.p3921j.C52413qv) r2
            com.google.assistant.e.j.bm r0 = r2.mo53859a()
            return r0
        L_0x0770:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2828y.p2848i.C36976d.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C36976d dVar = new C36976d(this.f96268f, this.f96269g, gVar);
        dVar.f96270h = obj;
        return dVar;
    }
}
