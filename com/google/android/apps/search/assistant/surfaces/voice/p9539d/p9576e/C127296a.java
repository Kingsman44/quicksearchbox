package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e;

import android.app.ActivityManager;
import android.content.Context;
import com.google.android.apps.search.assistant.libraries.p8979j.p8981b.p8982a.C119424i;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g.C127355c;
import com.google.common.p4526f.C59071e;
import java.util.Set;
import p5462h.p5463a.C69531o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.e.a */
/* compiled from: PG */
public final class C127296a implements C119424i {
    @Deprecated

    /* renamed from: a */
    private static final C59071e f350582a = C59071e.m91331h();
    @Deprecated

    /* renamed from: b */
    private static final Set f350583b = C69531o.m100939p(new String[]{"v", "ctf", "gcc", "psm", "ram_mb", "ctzn", "action", "ar", "cds", "cm", "ntyp", "agsad", "inm", "oe", "padb", "padt", "rdid", "source", "fheit", "ttsm"});

    /* renamed from: c */
    private final ActivityManager f350584c;

    /* renamed from: d */
    private final Context f350585d;

    /* renamed from: e */
    private final C127326t f350586e;

    /* renamed from: f */
    private final C127355c f350587f;

    public C127296a(ActivityManager activityManager, Context context, C127326t tVar, C127355c cVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(cVar, "conversationStateStore");
        this.f350584c = activityManager;
        this.f350585d = context;
        this.f350586e = tVar;
        this.f350587f = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02ec  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo104340a(com.google.android.libraries.assistant.p1533o.C18496n r12) {
        /*
            r11 = this;
            java.lang.String r0 = "params"
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r0)
            com.google.protobuf.cq r0 = r12.f52440a
            java.lang.String r1 = "params.cgiParamList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0015:
            boolean r2 = r0.hasNext()
            r3 = 1
            if (r2 == 0) goto L_0x0032
            java.lang.Object r2 = r0.next()
            r4 = r2
            com.google.android.libraries.assistant.o.h r4 = (com.google.android.libraries.assistant.p1533o.C18490h) r4
            java.util.Set r5 = f350583b
            java.lang.String r4 = r4.f52431a
            boolean r4 = r5.contains(r4)
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x0015
            r1.add(r2)
            goto L_0x0015
        L_0x0032:
            r0 = 18
            com.google.android.libraries.assistant.o.h[] r0 = new com.google.android.libraries.assistant.p1533o.C18490h[r0]
            com.google.android.libraries.assistant.o.h r2 = com.google.android.libraries.assistant.p1533o.C18490h.f52429c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.o.g r2 = (com.google.android.libraries.assistant.p1533o.C18489g) r2
            java.lang.String r4 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.libraries.assistant.o.j r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            java.lang.String r5 = "inm"
            r2.mo24003b(r5)
            com.google.android.apps.search.assistant.surfaces.voice.d.e.t r5 = r11.f350586e
            boolean r5 = r5.f350659a
            if (r3 == r5) goto L_0x0055
            java.lang.String r5 = "opa-text-typing"
            goto L_0x0057
        L_0x0055:
            java.lang.String r5 = "vs-opa"
        L_0x0057:
            r2.mo24004c(r5)
            com.google.android.libraries.assistant.o.h r2 = r2.mo24002a()
            r5 = 0
            r0[r5] = r2
            com.google.android.libraries.assistant.o.h r2 = com.google.android.libraries.assistant.p1533o.C18490h.f52429c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.o.g r2 = (com.google.android.libraries.assistant.p1533o.C18489g) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.libraries.assistant.o.j r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            java.lang.String r6 = "action"
            r2.mo24003b(r6)
            java.lang.String r6 = "devloc"
            r2.mo24004c(r6)
            com.google.android.libraries.assistant.o.h r2 = r2.mo24002a()
            r0[r3] = r2
            com.google.android.libraries.assistant.o.h r2 = com.google.android.libraries.assistant.p1533o.C18490h.f52429c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.o.g r2 = (com.google.android.libraries.assistant.p1533o.C18489g) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.libraries.assistant.o.j r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            java.lang.String r6 = "padb"
            r2.mo24003b(r6)
            java.lang.String r6 = "0"
            r2.mo24004c(r6)
            r7 = 2
            com.google.android.libraries.assistant.o.h r2 = r2.mo24002a()
            r0[r7] = r2
            com.google.android.libraries.assistant.o.h r2 = com.google.android.libraries.assistant.p1533o.C18490h.f52429c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.o.g r2 = (com.google.android.libraries.assistant.p1533o.C18489g) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.libraries.assistant.o.j r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            java.lang.String r7 = "ram_mb"
            r2.mo24003b(r7)
            android.app.ActivityManager$MemoryInfo r7 = new android.app.ActivityManager$MemoryInfo
            r7.<init>()
            android.app.ActivityManager r8 = r11.f350584c
            r8.getMemoryInfo(r7)
            long r7 = r7.totalMem
            r9 = 1048576(0x100000, double:5.180654E-318)
            long r7 = r7 / r9
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r2.mo24004c(r7)
            r7 = 3
            com.google.android.libraries.assistant.o.h r2 = r2.mo24002a()
            r0[r7] = r2
            com.google.android.libraries.assistant.o.h r2 = com.google.android.libraries.assistant.p1533o.C18490h.f52429c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.o.g r2 = (com.google.android.libraries.assistant.p1533o.C18489g) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.libraries.assistant.o.j r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            java.lang.String r7 = "psm"
            r2.mo24003b(r7)
            android.content.Context r7 = r11.f350585d
            java.lang.String r8 = "power"
            java.lang.Object r7 = r7.getSystemService(r8)
            java.lang.String r8 = "null cannot be cast to non-null type android.os.PowerManager"
            p5462h.p5473f.p5475b.C69664n.m101059e(r7, r8)
            android.os.PowerManager r7 = (android.os.PowerManager) r7
            boolean r7 = r7.isPowerSaveMode()
            java.lang.String r8 = "1"
            if (r3 == r7) goto L_0x00ff
            r7 = r6
            goto L_0x0100
        L_0x00ff:
            r7 = r8
        L_0x0100:
            r2.mo24004c(r7)
            r7 = 4
            com.google.android.libraries.assistant.o.h r2 = r2.mo24002a()
            r0[r7] = r2
            com.google.android.libraries.assistant.o.h r2 = com.google.android.libraries.assistant.p1533o.C18490h.f52429c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.o.g r2 = (com.google.android.libraries.assistant.p1533o.C18489g) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.libraries.assistant.o.j r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            java.lang.String r7 = "ntyp"
            r2.mo24003b(r7)
            r2.mo24004c(r8)
            r7 = 5
            com.google.android.libraries.assistant.o.h r2 = r2.mo24002a()
            r0[r7] = r2
            com.google.android.libraries.assistant.o.h r2 = com.google.android.libraries.assistant.p1533o.C18490h.f52429c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.o.g r2 = (com.google.android.libraries.assistant.p1533o.C18489g) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.libraries.assistant.o.j r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            java.lang.String r7 = "source"
            r2.mo24003b(r7)
            com.google.android.apps.search.assistant.surfaces.voice.d.g.c r7 = r11.f350587f
            java.util.concurrent.atomic.AtomicInteger r7 = r7.f350716b
            int r7 = r7.get()
            com.google.android.apps.gsa.assistant.shared.l.e r7 = com.google.android.apps.gsa.assistant.shared.l.e.a(r7)
            if (r7 != 0) goto L_0x014b
            goto L_0x0188
        L_0x014b:
            int r7 = r7.ordinal()
            r9 = 60
            if (r7 == r9) goto L_0x01cd
            r9 = 62
            if (r7 == r9) goto L_0x01ca
            r9 = 98
            if (r7 == r9) goto L_0x01c7
            r9 = 108(0x6c, float:1.51E-43)
            if (r7 == r9) goto L_0x01c4
            r9 = 128(0x80, float:1.794E-43)
            if (r7 == r9) goto L_0x01c1
            r9 = 141(0x8d, float:1.98E-43)
            if (r7 == r9) goto L_0x01be
            r9 = 75
            if (r7 == r9) goto L_0x01bb
            r9 = 76
            if (r7 == r9) goto L_0x01b8
            r9 = 117(0x75, float:1.64E-43)
            if (r7 == r9) goto L_0x01b5
            r9 = 118(0x76, float:1.65E-43)
            if (r7 == r9) goto L_0x01b2
            r9 = 124(0x7c, float:1.74E-43)
            if (r7 == r9) goto L_0x01af
            r9 = 125(0x7d, float:1.75E-43)
            if (r7 == r9) goto L_0x01ac
            switch(r7) {
                case 89: goto L_0x01a9;
                case 90: goto L_0x01a6;
                case 91: goto L_0x01a3;
                case 92: goto L_0x01a0;
                case 93: goto L_0x019d;
                case 94: goto L_0x019a;
                case 95: goto L_0x019d;
                case 96: goto L_0x019a;
                default: goto L_0x0182;
            }
        L_0x0182:
            switch(r7) {
                case 101: goto L_0x0197;
                case 102: goto L_0x0194;
                case 103: goto L_0x0191;
                default: goto L_0x0185;
            }
        L_0x0185:
            switch(r7) {
                case 120: goto L_0x01af;
                case 121: goto L_0x018e;
                case 122: goto L_0x018b;
                default: goto L_0x0188;
            }
        L_0x0188:
            java.lang.String r7 = "and.opa"
            goto L_0x01cf
        L_0x018b:
            java.lang.String r7 = "and.opa.lockscreen.hotword"
            goto L_0x01cf
        L_0x018e:
            java.lang.String r7 = "and.opa.lockscreen.longpress.power.button"
            goto L_0x01cf
        L_0x0191:
            java.lang.String r7 = "and.opa.nga.ringing_timer"
            goto L_0x01cf
        L_0x0194:
            java.lang.String r7 = "and.opa.nga.ringing_alarm"
            goto L_0x01cf
        L_0x0197:
            java.lang.String r7 = "and.opa.nga.keyboard_microphone"
            goto L_0x01cf
        L_0x019a:
            java.lang.String r7 = "and.opa.lockscreen.hardware.button.walkie.talkie"
            goto L_0x01cf
        L_0x019d:
            java.lang.String r7 = "and.opa.hardware.button.walkie.talkie"
            goto L_0x01cf
        L_0x01a0:
            java.lang.String r7 = "and.opa.hardware.button.personalupdates"
            goto L_0x01cf
        L_0x01a3:
            java.lang.String r7 = "and.opa.hardware.button.lens"
            goto L_0x01cf
        L_0x01a6:
            java.lang.String r7 = "and.opa.lockscreen.hardware.button"
            goto L_0x01cf
        L_0x01a9:
            java.lang.String r7 = "and.opa.hardware.button"
            goto L_0x01cf
        L_0x01ac:
            java.lang.String r7 = "and.opa.longpress.power.button"
            goto L_0x01cf
        L_0x01af:
            java.lang.String r7 = "and.opa.longpress"
            goto L_0x01cf
        L_0x01b2:
            java.lang.String r7 = "and.opa.lockscreen.elmyra"
            goto L_0x01cf
        L_0x01b5:
            java.lang.String r7 = "and.opa.lockscreen_diag_swipe_gesture"
            goto L_0x01cf
        L_0x01b8:
            java.lang.String r7 = "and.opa.elmyra"
            goto L_0x01cf
        L_0x01bb:
            java.lang.String r7 = "and.opa.diag_swipe_gesture"
            goto L_0x01cf
        L_0x01be:
            java.lang.String r7 = "and.opa.screenless.wired"
            goto L_0x01cf
        L_0x01c1:
            java.lang.String r7 = "and.opa.pixel_launcher.qsb"
            goto L_0x01cf
        L_0x01c4:
            java.lang.String r7 = "and.opa.nga.warm_actions"
            goto L_0x01cf
        L_0x01c7:
            java.lang.String r7 = "and.opa.hotword"
            goto L_0x01cf
        L_0x01ca:
            java.lang.String r7 = "and.opa.screenless.bluetooth"
            goto L_0x01cf
        L_0x01cd:
            java.lang.String r7 = "and.opa.asst_mem_onboarding"
        L_0x01cf:
            r2.mo24004c(r7)
            r7 = 6
            com.google.android.libraries.assistant.o.h r2 = r2.mo24002a()
            r0[r7] = r2
            com.google.android.libraries.assistant.o.h r2 = com.google.android.libraries.assistant.p1533o.C18490h.f52429c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.o.g r2 = (com.google.android.libraries.assistant.p1533o.C18489g) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.libraries.assistant.o.j r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            java.lang.String r7 = "ctf"
            r2.mo24003b(r7)
            android.content.Context r7 = r11.f350585d
            boolean r7 = android.text.format.DateFormat.is24HourFormat(r7)
            if (r3 == r7) goto L_0x01f7
            r7 = r6
            goto L_0x01f8
        L_0x01f7:
            r7 = r8
        L_0x01f8:
            r2.mo24004c(r7)
            r7 = 7
            com.google.android.libraries.assistant.o.h r2 = r2.mo24002a()
            r0[r7] = r2
            com.google.android.libraries.assistant.o.h r2 = com.google.android.libraries.assistant.p1533o.C18490h.f52429c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.o.g r2 = (com.google.android.libraries.assistant.p1533o.C18489g) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.libraries.assistant.o.j r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            java.lang.String r7 = "gcc"
            r2.mo24003b(r7)
            java.util.Locale r7 = java.util.Locale.getDefault()
            java.lang.String r7 = r7.getCountry()
            java.lang.String r9 = "getCountry()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r9)
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r9)
            java.lang.String r9 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r9)
            r2.mo24004c(r7)
            r7 = 8
            com.google.android.libraries.assistant.o.h r2 = r2.mo24002a()
            r0[r7] = r2
            com.google.android.libraries.assistant.o.h r2 = com.google.android.libraries.assistant.p1533o.C18490h.f52429c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.o.g r2 = (com.google.android.libraries.assistant.p1533o.C18489g) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.libraries.assistant.o.j r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            java.lang.String r7 = "v"
            r2.mo24003b(r7)
            android.content.Context r7 = r11.f350585d
            android.content.pm.PackageManager r9 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0263 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0263 }
            android.content.pm.PackageInfo r5 = r9.getPackageInfo(r7, r5)     // Catch:{ NameNotFoundException -> 0x0263 }
            java.lang.String r5 = r5.versionName     // Catch:{ NameNotFoundException -> 0x0263 }
            java.lang.String r7 = "{\n      val pInfo = cont…  pInfo.versionName\n    }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r7)     // Catch:{ NameNotFoundException -> 0x0263 }
            goto L_0x0284
        L_0x0263:
            r5 = move-exception
            com.google.common.f.e r7 = f350582a
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.x r5 = r7.mo56382g(r5)
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.common.f.n r7 = new com.google.common.f.n
            r9 = 37283(0x91a3, float:5.2245E-41)
            r7.<init>(r9)
            r5.mo56379ah(r7)
            java.lang.String r7 = "Cannot find package name."
            r5.mo56386p(r7)
            java.lang.String r5 = ""
        L_0x0284:
            r2.mo24004c(r5)
            r5 = 9
            com.google.android.libraries.assistant.o.h r2 = r2.mo24002a()
            r0[r5] = r2
            com.google.android.libraries.assistant.o.h r2 = com.google.android.libraries.assistant.p1533o.C18490h.f52429c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.o.g r2 = (com.google.android.libraries.assistant.p1533o.C18489g) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.libraries.assistant.o.j r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            java.lang.String r5 = "agsad"
            r2.mo24003b(r5)
            r2.mo24004c(r8)
            r5 = 10
            com.google.android.libraries.assistant.o.h r2 = r2.mo24002a()
            r0[r5] = r2
            com.google.android.libraries.assistant.o.h r2 = com.google.android.libraries.assistant.p1533o.C18490h.f52429c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.o.g r2 = (com.google.android.libraries.assistant.p1533o.C18489g) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.libraries.assistant.o.j r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            java.lang.String r5 = "oe"
            r2.mo24003b(r5)
            java.lang.String r5 = "utf-8"
            r2.mo24004c(r5)
            r5 = 11
            com.google.android.libraries.assistant.o.h r2 = r2.mo24002a()
            r0[r5] = r2
            com.google.android.libraries.assistant.o.h r2 = com.google.android.libraries.assistant.p1533o.C18490h.f52429c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.o.g r2 = (com.google.android.libraries.assistant.p1533o.C18489g) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.libraries.assistant.o.j r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            java.lang.String r5 = "cm"
            r2.mo24003b(r5)
            com.google.android.apps.search.assistant.surfaces.voice.d.e.t r5 = r11.f350586e
            boolean r5 = r5.f350659a
            if (r3 == r5) goto L_0x02ec
            java.lang.String r3 = "typing"
            goto L_0x02ee
        L_0x02ec:
            java.lang.String r3 = "voice"
        L_0x02ee:
            r2.mo24004c(r3)
            r3 = 12
            com.google.android.libraries.assistant.o.h r2 = r2.mo24002a()
            r0[r3] = r2
            com.google.android.libraries.assistant.o.h r2 = com.google.android.libraries.assistant.p1533o.C18490h.f52429c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.o.g r2 = (com.google.android.libraries.assistant.p1533o.C18489g) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.libraries.assistant.o.j r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            java.lang.String r3 = "fheit"
            r2.mo24003b(r3)
            r2.mo24004c(r8)
            r3 = 13
            com.google.android.libraries.assistant.o.h r2 = r2.mo24002a()
            r0[r3] = r2
            com.google.android.libraries.assistant.o.h r2 = com.google.android.libraries.assistant.p1533o.C18490h.f52429c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.o.g r2 = (com.google.android.libraries.assistant.p1533o.C18489g) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.libraries.assistant.o.j r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            java.lang.String r3 = "ctzn"
            r2.mo24003b(r3)
            j$.time.ZoneId r3 = p3186j$.time.ZoneId.systemDefault()
            java.lang.String r3 = r3.getId()
            java.lang.String r5 = "getTimeZone()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r5)
            r2.mo24004c(r3)
            r3 = 14
            com.google.android.libraries.assistant.o.h r2 = r2.mo24002a()
            r0[r3] = r2
            com.google.android.libraries.assistant.o.h r2 = com.google.android.libraries.assistant.p1533o.C18490h.f52429c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.o.g r2 = (com.google.android.libraries.assistant.p1533o.C18489g) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.libraries.assistant.o.j r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            java.lang.String r3 = "cds"
            r2.mo24003b(r3)
            java.lang.String r3 = "2"
            r2.mo24004c(r3)
            r3 = 15
            com.google.android.libraries.assistant.o.h r2 = r2.mo24002a()
            r0[r3] = r2
            com.google.android.libraries.assistant.o.h r2 = com.google.android.libraries.assistant.p1533o.C18490h.f52429c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.o.g r2 = (com.google.android.libraries.assistant.p1533o.C18489g) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.libraries.assistant.o.j r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            java.lang.String r3 = "ar"
            r2.mo24003b(r3)
            r2.mo24004c(r6)
            r3 = 16
            com.google.android.libraries.assistant.o.h r2 = r2.mo24002a()
            r0[r3] = r2
            com.google.android.libraries.assistant.o.h r2 = com.google.android.libraries.assistant.p1533o.C18490h.f52429c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.o.g r2 = (com.google.android.libraries.assistant.p1533o.C18489g) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.libraries.assistant.o.j r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            java.lang.String r3 = "ttsm"
            r2.mo24003b(r3)
            java.lang.String r3 = "default"
            r2.mo24004c(r3)
            r3 = 17
            com.google.android.libraries.assistant.o.h r2 = r2.mo24002a()
            r0[r3] = r2
            java.util.List r0 = p5462h.p5463a.C69540x.m100949g(r0)
            java.util.List r0 = p5462h.p5463a.C69540x.m100831M(r1, r0)
            com.google.protobuf.bn r12 = r12.toBuilder()
            com.google.android.libraries.assistant.o.m r12 = (com.google.android.libraries.assistant.p1533o.C18495m) r12
            r12.copyOnWrite()
            com.google.protobuf.bv r1 = r12.instance
            com.google.android.libraries.assistant.o.n r1 = (com.google.android.libraries.assistant.p1533o.C18496n) r1
            com.google.protobuf.cq r2 = com.google.android.libraries.assistant.p1533o.C18496n.emptyProtobufList()
            r1.f52440a = r2
            r12.mo24005a(r0)
            com.google.protobuf.bv r12 = r12.build()
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60856cj.m92900i(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e.C127296a.mo104340a(com.google.android.libraries.assistant.o.n):com.google.common.util.concurrent.cx");
    }
}
