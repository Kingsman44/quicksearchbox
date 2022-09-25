package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.util.Log;
import com.bumptech.glide.load.p293a.C5662ae;
import com.bumptech.glide.load.p293a.p294a.C5640b;
import com.bumptech.glide.load.p293a.p294a.C5642d;
import com.bumptech.glide.load.p293a.p295b.C5695k;
import com.bumptech.glide.load.p299c.p300a.C5826ae;
import com.bumptech.glide.manager.C5974f;
import com.bumptech.glide.manager.C5986r;
import com.bumptech.glide.p285d.C5544a;
import com.bumptech.glide.p287f.p288a.C5567i;
import com.bumptech.glide.p291h.C5630q;
import com.bumptech.glide.p291h.C5632s;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.d */
/* compiled from: PG */
public final class C5543d implements ComponentCallbacks2 {

    /* renamed from: g */
    private static volatile C5543d f16786g;

    /* renamed from: h */
    private static volatile boolean f16787h;

    /* renamed from: a */
    public final C5642d f16788a;

    /* renamed from: b */
    public final C5636l f16789b;

    /* renamed from: c */
    public final C5640b f16790c;

    /* renamed from: d */
    public final C5986r f16791d;

    /* renamed from: e */
    public final List f16792e = new ArrayList();

    /* renamed from: f */
    public final C5974f f16793f;

    /* renamed from: i */
    private final C5662ae f16794i;

    /* renamed from: j */
    private final C5695k f16795j;

    public C5543d(Context context, C5662ae aeVar, C5695k kVar, C5642d dVar, C5640b bVar, C5986r rVar, C5974f fVar, C5522c cVar, Map map, List list, List list2, C5544a aVar, C5996o oVar) {
        this.f16794i = aeVar;
        this.f16788a = dVar;
        this.f16790c = bVar;
        this.f16795j = kVar;
        this.f16791d = rVar;
        this.f16793f = fVar;
        if (((C5633i) ((C5995n) oVar.f17674a.get(C5633i.class))) != null) {
            C5826ae.f17408a = 0;
        }
        this.f16789b = new C5636l(context, bVar, new C6004w(this, list2, aVar), new C5567i(), cVar, map, list, aeVar, oVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x021d A[Catch:{ NameNotFoundException -> 0x02b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x022e A[Catch:{ NameNotFoundException -> 0x02b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0267 A[Catch:{ NameNotFoundException -> 0x02b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x026e A[Catch:{ NameNotFoundException -> 0x02b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0101 A[Catch:{ NameNotFoundException -> 0x02b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0138 A[Catch:{ NameNotFoundException -> 0x02b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0162 A[Catch:{ NameNotFoundException -> 0x02b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0167 A[Catch:{ NameNotFoundException -> 0x02b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0174 A[Catch:{ NameNotFoundException -> 0x02b3 }, LOOP:3: B:63:0x016e->B:65:0x0174, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x017d A[Catch:{ NameNotFoundException -> 0x02b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0184 A[Catch:{ NameNotFoundException -> 0x02b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0192 A[Catch:{ NameNotFoundException -> 0x02b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a9 A[Catch:{ NameNotFoundException -> 0x02b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c9 A[Catch:{ NameNotFoundException -> 0x02b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01d9 A[Catch:{ NameNotFoundException -> 0x02b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01e4 A[Catch:{ NameNotFoundException -> 0x02b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01fe A[Catch:{ NameNotFoundException -> 0x02b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x020d A[Catch:{ NameNotFoundException -> 0x02b3 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bumptech.glide.C5543d m14321a(android.content.Context r25) {
        /*
            java.lang.String r0 = "Got app info metadata: "
            com.bumptech.glide.d r1 = f16786g
            if (r1 != 0) goto L_0x02c9
            android.content.Context r1 = r25.getApplicationContext()
            com.bumptech.glide.GeneratedAppGlideModule r14 = m14324g(r1)
            java.lang.Class<com.bumptech.glide.d> r1 = com.bumptech.glide.C5543d.class
            monitor-enter(r1)
            com.bumptech.glide.d r2 = f16786g     // Catch:{ all -> 0x02c6 }
            if (r2 != 0) goto L_0x02c4
            boolean r2 = f16787h     // Catch:{ all -> 0x02c6 }
            if (r2 != 0) goto L_0x02bc
            r2 = 1
            f16787h = r2     // Catch:{ all -> 0x02c6 }
            com.bumptech.glide.k r3 = new com.bumptech.glide.k     // Catch:{ all -> 0x02c6 }
            r3.<init>()     // Catch:{ all -> 0x02c6 }
            android.content.Context r15 = r25.getApplicationContext()     // Catch:{ all -> 0x02c6 }
            java.util.List r4 = java.util.Collections.emptyList()     // Catch:{ all -> 0x02c6 }
            r5 = 2
            r6 = 3
            if (r14 == 0) goto L_0x0037
            boolean r7 = r14.mo11838e()     // Catch:{ all -> 0x02c6 }
            if (r7 == 0) goto L_0x0034
            goto L_0x0037
        L_0x0034:
            r13 = r4
            goto L_0x00e7
        L_0x0037:
            java.lang.String r4 = "ManifestParser"
            boolean r4 = android.util.Log.isLoggable(r4, r6)     // Catch:{ all -> 0x02c6 }
            if (r4 == 0) goto L_0x0046
            java.lang.String r4 = "ManifestParser"
            java.lang.String r7 = "Loading Glide modules"
            android.util.Log.d(r4, r7)     // Catch:{ all -> 0x02c6 }
        L_0x0046:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x02c6 }
            r4.<init>()     // Catch:{ all -> 0x02c6 }
            android.content.pm.PackageManager r7 = r15.getPackageManager()     // Catch:{ NameNotFoundException -> 0x02b3 }
            java.lang.String r8 = r15.getPackageName()     // Catch:{ NameNotFoundException -> 0x02b3 }
            r9 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r7 = r7.getApplicationInfo(r8, r9)     // Catch:{ NameNotFoundException -> 0x02b3 }
            android.os.Bundle r8 = r7.metaData     // Catch:{ NameNotFoundException -> 0x02b3 }
            if (r8 != 0) goto L_0x006d
            java.lang.String r0 = "ManifestParser"
            boolean r0 = android.util.Log.isLoggable(r0, r6)     // Catch:{ NameNotFoundException -> 0x02b3 }
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "ManifestParser"
            java.lang.String r7 = "Got null app info metadata"
            android.util.Log.d(r0, r7)     // Catch:{ NameNotFoundException -> 0x02b3 }
            goto L_0x0034
        L_0x006d:
            java.lang.String r8 = "ManifestParser"
            boolean r8 = android.util.Log.isLoggable(r8, r5)     // Catch:{ NameNotFoundException -> 0x02b3 }
            if (r8 == 0) goto L_0x008c
            android.os.Bundle r8 = r7.metaData     // Catch:{ NameNotFoundException -> 0x02b3 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ NameNotFoundException -> 0x02b3 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x02b3 }
            r9.<init>(r0)     // Catch:{ NameNotFoundException -> 0x02b3 }
            r9.append(r8)     // Catch:{ NameNotFoundException -> 0x02b3 }
            java.lang.String r0 = "ManifestParser"
            java.lang.String r8 = r9.toString()     // Catch:{ NameNotFoundException -> 0x02b3 }
            android.util.Log.v(r0, r8)     // Catch:{ NameNotFoundException -> 0x02b3 }
        L_0x008c:
            android.os.Bundle r0 = r7.metaData     // Catch:{ NameNotFoundException -> 0x02b3 }
            java.util.Set r0 = r0.keySet()     // Catch:{ NameNotFoundException -> 0x02b3 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ NameNotFoundException -> 0x02b3 }
        L_0x0096:
            boolean r8 = r0.hasNext()     // Catch:{ NameNotFoundException -> 0x02b3 }
            if (r8 == 0) goto L_0x00d6
            java.lang.Object r8 = r0.next()     // Catch:{ NameNotFoundException -> 0x02b3 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ NameNotFoundException -> 0x02b3 }
            java.lang.String r9 = "GlideModule"
            android.os.Bundle r10 = r7.metaData     // Catch:{ NameNotFoundException -> 0x02b3 }
            java.lang.Object r10 = r10.get(r8)     // Catch:{ NameNotFoundException -> 0x02b3 }
            boolean r9 = r9.equals(r10)     // Catch:{ NameNotFoundException -> 0x02b3 }
            if (r9 == 0) goto L_0x0096
            com.google.apps.tiktok.media.contrib.cronet.TikTokCronetGlideModule r9 = com.bumptech.glide.p285d.C5546c.m14332a(r8)     // Catch:{ NameNotFoundException -> 0x02b3 }
            r4.add(r9)     // Catch:{ NameNotFoundException -> 0x02b3 }
            java.lang.String r9 = "ManifestParser"
            boolean r9 = android.util.Log.isLoggable(r9, r6)     // Catch:{ NameNotFoundException -> 0x02b3 }
            if (r9 == 0) goto L_0x0096
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x02b3 }
            r9.<init>()     // Catch:{ NameNotFoundException -> 0x02b3 }
            java.lang.String r10 = "Loaded Glide module: "
            r9.append(r10)     // Catch:{ NameNotFoundException -> 0x02b3 }
            r9.append(r8)     // Catch:{ NameNotFoundException -> 0x02b3 }
            java.lang.String r8 = "ManifestParser"
            java.lang.String r9 = r9.toString()     // Catch:{ NameNotFoundException -> 0x02b3 }
            android.util.Log.d(r8, r9)     // Catch:{ NameNotFoundException -> 0x02b3 }
            goto L_0x0096
        L_0x00d6:
            java.lang.String r0 = "ManifestParser"
            boolean r0 = android.util.Log.isLoggable(r0, r6)     // Catch:{ all -> 0x02c6 }
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "ManifestParser"
            java.lang.String r7 = "Finished loading Glide modules"
            android.util.Log.d(r0, r7)     // Catch:{ all -> 0x02c6 }
            goto L_0x0034
        L_0x00e7:
            if (r14 == 0) goto L_0x0130
            java.util.Set r0 = r14.mo11835b()     // Catch:{ all -> 0x02c6 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x02c6 }
            if (r0 != 0) goto L_0x0130
            java.util.Set r0 = r14.mo11835b()     // Catch:{ all -> 0x02c6 }
            java.util.Iterator r4 = r13.iterator()     // Catch:{ all -> 0x02c6 }
        L_0x00fb:
            boolean r7 = r4.hasNext()     // Catch:{ all -> 0x02c6 }
            if (r7 == 0) goto L_0x0130
            java.lang.Object r7 = r4.next()     // Catch:{ all -> 0x02c6 }
            com.google.apps.tiktok.media.contrib.cronet.TikTokCronetGlideModule r7 = (com.google.apps.tiktok.media.contrib.cronet.TikTokCronetGlideModule) r7     // Catch:{ all -> 0x02c6 }
            java.lang.Class r8 = r7.getClass()     // Catch:{ all -> 0x02c6 }
            boolean r8 = r0.contains(r8)     // Catch:{ all -> 0x02c6 }
            if (r8 == 0) goto L_0x00fb
            java.lang.String r8 = "Glide"
            boolean r8 = android.util.Log.isLoggable(r8, r6)     // Catch:{ all -> 0x02c6 }
            if (r8 == 0) goto L_0x012c
            java.lang.String r8 = "Glide"
            java.lang.String r9 = "AppGlideModule excludes manifest GlideModule: "
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x02c6 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x02c6 }
            java.lang.String r7 = r9.concat(r7)     // Catch:{ all -> 0x02c6 }
            android.util.Log.d(r8, r7)     // Catch:{ all -> 0x02c6 }
        L_0x012c:
            r4.remove()     // Catch:{ all -> 0x02c6 }
            goto L_0x00fb
        L_0x0130:
            java.lang.String r0 = "Glide"
            boolean r0 = android.util.Log.isLoggable(r0, r6)     // Catch:{ all -> 0x02c6 }
            if (r0 == 0) goto L_0x0160
            java.util.Iterator r0 = r13.iterator()     // Catch:{ all -> 0x02c6 }
        L_0x013c:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x02c6 }
            if (r4 == 0) goto L_0x0160
            java.lang.String r4 = "Glide"
            java.lang.String r6 = "Discovered GlideModule from manifest: "
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x02c6 }
            com.google.apps.tiktok.media.contrib.cronet.TikTokCronetGlideModule r7 = (com.google.apps.tiktok.media.contrib.cronet.TikTokCronetGlideModule) r7     // Catch:{ all -> 0x02c6 }
            java.lang.Class r7 = r7.getClass()     // Catch:{ all -> 0x02c6 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x02c6 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x02c6 }
            java.lang.String r6 = r6.concat(r7)     // Catch:{ all -> 0x02c6 }
            android.util.Log.d(r4, r6)     // Catch:{ all -> 0x02c6 }
            goto L_0x013c
        L_0x0160:
            if (r14 == 0) goto L_0x0167
            com.bumptech.glide.manager.q r0 = r14.mo11834a()     // Catch:{ all -> 0x02c6 }
            goto L_0x0168
        L_0x0167:
            r0 = 0
        L_0x0168:
            r3.f16986j = r0     // Catch:{ all -> 0x02c6 }
            java.util.Iterator r0 = r13.iterator()     // Catch:{ all -> 0x02c6 }
        L_0x016e:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x02c6 }
            if (r4 == 0) goto L_0x017b
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x02c6 }
            com.google.apps.tiktok.media.contrib.cronet.TikTokCronetGlideModule r4 = (com.google.apps.tiktok.media.contrib.cronet.TikTokCronetGlideModule) r4     // Catch:{ all -> 0x02c6 }
            goto L_0x016e
        L_0x017b:
            if (r14 == 0) goto L_0x0180
            r14.mo11836c(r15, r3)     // Catch:{ all -> 0x02c6 }
        L_0x0180:
            com.bumptech.glide.load.a.c.e r0 = r3.f16982f     // Catch:{ all -> 0x02c6 }
            if (r0 != 0) goto L_0x018e
            com.bumptech.glide.load.a.c.a r0 = com.bumptech.glide.load.p293a.p296c.C5710e.m14791b()     // Catch:{ all -> 0x02c6 }
            com.bumptech.glide.load.a.c.e r0 = r0.mo12203a()     // Catch:{ all -> 0x02c6 }
            r3.f16982f = r0     // Catch:{ all -> 0x02c6 }
        L_0x018e:
            com.bumptech.glide.load.a.c.e r0 = r3.f16983g     // Catch:{ all -> 0x02c6 }
            if (r0 != 0) goto L_0x01a5
            com.bumptech.glide.load.a.c.a r0 = new com.bumptech.glide.load.a.c.a     // Catch:{ all -> 0x02c6 }
            r0.<init>(r2)     // Catch:{ all -> 0x02c6 }
            r0.f17189a = r2     // Catch:{ all -> 0x02c6 }
            r0.f17190b = r2     // Catch:{ all -> 0x02c6 }
            java.lang.String r4 = "disk-cache"
            r0.f17191c = r4     // Catch:{ all -> 0x02c6 }
            com.bumptech.glide.load.a.c.e r0 = r0.mo12203a()     // Catch:{ all -> 0x02c6 }
            r3.f16983g = r0     // Catch:{ all -> 0x02c6 }
        L_0x01a5:
            com.bumptech.glide.load.a.c.e r0 = r3.f16987k     // Catch:{ all -> 0x02c6 }
            if (r0 != 0) goto L_0x01c5
            int r0 = com.bumptech.glide.load.p293a.p296c.C5710e.m14790a()     // Catch:{ all -> 0x02c6 }
            r4 = 4
            if (r0 < r4) goto L_0x01b1
            goto L_0x01b2
        L_0x01b1:
            r5 = 1
        L_0x01b2:
            com.bumptech.glide.load.a.c.a r0 = new com.bumptech.glide.load.a.c.a     // Catch:{ all -> 0x02c6 }
            r0.<init>(r2)     // Catch:{ all -> 0x02c6 }
            r0.f17189a = r5     // Catch:{ all -> 0x02c6 }
            r0.f17190b = r5     // Catch:{ all -> 0x02c6 }
            java.lang.String r2 = "animation"
            r0.f17191c = r2     // Catch:{ all -> 0x02c6 }
            com.bumptech.glide.load.a.c.e r0 = r0.mo12203a()     // Catch:{ all -> 0x02c6 }
            r3.f16987k = r0     // Catch:{ all -> 0x02c6 }
        L_0x01c5:
            com.bumptech.glide.load.a.b.o r0 = r3.f16984h     // Catch:{ all -> 0x02c6 }
            if (r0 != 0) goto L_0x01d5
            com.bumptech.glide.load.a.b.m r0 = new com.bumptech.glide.load.a.b.m     // Catch:{ all -> 0x02c6 }
            r0.<init>(r15)     // Catch:{ all -> 0x02c6 }
            com.bumptech.glide.load.a.b.o r2 = new com.bumptech.glide.load.a.b.o     // Catch:{ all -> 0x02c6 }
            r2.<init>(r0)     // Catch:{ all -> 0x02c6 }
            r3.f16984h = r2     // Catch:{ all -> 0x02c6 }
        L_0x01d5:
            com.bumptech.glide.manager.f r0 = r3.f16991o     // Catch:{ all -> 0x02c6 }
            if (r0 != 0) goto L_0x01e0
            com.bumptech.glide.manager.f r0 = new com.bumptech.glide.manager.f     // Catch:{ all -> 0x02c6 }
            r0.<init>()     // Catch:{ all -> 0x02c6 }
            r3.f16991o = r0     // Catch:{ all -> 0x02c6 }
        L_0x01e0:
            com.bumptech.glide.load.a.a.d r0 = r3.f16980d     // Catch:{ all -> 0x02c6 }
            if (r0 != 0) goto L_0x01fa
            com.bumptech.glide.load.a.b.o r0 = r3.f16984h     // Catch:{ all -> 0x02c6 }
            int r0 = r0.f17171a     // Catch:{ all -> 0x02c6 }
            if (r0 <= 0) goto L_0x01f3
            com.bumptech.glide.load.a.a.m r2 = new com.bumptech.glide.load.a.a.m     // Catch:{ all -> 0x02c6 }
            long r4 = (long) r0     // Catch:{ all -> 0x02c6 }
            r2.<init>(r4)     // Catch:{ all -> 0x02c6 }
            r3.f16980d = r2     // Catch:{ all -> 0x02c6 }
            goto L_0x01fa
        L_0x01f3:
            com.bumptech.glide.load.a.a.e r0 = new com.bumptech.glide.load.a.a.e     // Catch:{ all -> 0x02c6 }
            r0.<init>()     // Catch:{ all -> 0x02c6 }
            r3.f16980d = r0     // Catch:{ all -> 0x02c6 }
        L_0x01fa:
            com.bumptech.glide.load.a.a.b r0 = r3.f16981e     // Catch:{ all -> 0x02c6 }
            if (r0 != 0) goto L_0x0209
            com.bumptech.glide.load.a.a.l r0 = new com.bumptech.glide.load.a.a.l     // Catch:{ all -> 0x02c6 }
            com.bumptech.glide.load.a.b.o r2 = r3.f16984h     // Catch:{ all -> 0x02c6 }
            int r2 = r2.f17173c     // Catch:{ all -> 0x02c6 }
            r0.<init>(r2)     // Catch:{ all -> 0x02c6 }
            r3.f16981e = r0     // Catch:{ all -> 0x02c6 }
        L_0x0209:
            com.bumptech.glide.load.a.b.k r0 = r3.f16989m     // Catch:{ all -> 0x02c6 }
            if (r0 != 0) goto L_0x0219
            com.bumptech.glide.load.a.b.k r0 = new com.bumptech.glide.load.a.b.k     // Catch:{ all -> 0x02c6 }
            com.bumptech.glide.load.a.b.o r2 = r3.f16984h     // Catch:{ all -> 0x02c6 }
            int r2 = r2.f17172b     // Catch:{ all -> 0x02c6 }
            long r4 = (long) r2     // Catch:{ all -> 0x02c6 }
            r0.<init>(r4)     // Catch:{ all -> 0x02c6 }
            r3.f16989m = r0     // Catch:{ all -> 0x02c6 }
        L_0x0219:
            com.bumptech.glide.load.a.b.g r0 = r3.f16990n     // Catch:{ all -> 0x02c6 }
            if (r0 != 0) goto L_0x0229
            com.bumptech.glide.load.a.b.j r0 = new com.bumptech.glide.load.a.b.j     // Catch:{ all -> 0x02c6 }
            java.lang.String r2 = "image_manager_disk_cache"
            r4 = 262144000(0xfa00000, double:1.295163447E-315)
            r0.<init>(r15, r2, r4)     // Catch:{ all -> 0x02c6 }
            r3.f16990n = r0     // Catch:{ all -> 0x02c6 }
        L_0x0229:
            com.bumptech.glide.load.a.ae r0 = r3.f16979c     // Catch:{ all -> 0x02c6 }
            r12 = 0
            if (r0 != 0) goto L_0x0263
            com.bumptech.glide.load.a.ae r0 = new com.bumptech.glide.load.a.ae     // Catch:{ all -> 0x02c6 }
            com.bumptech.glide.load.a.b.k r5 = r3.f16989m     // Catch:{ all -> 0x02c6 }
            com.bumptech.glide.load.a.b.g r6 = r3.f16990n     // Catch:{ all -> 0x02c6 }
            com.bumptech.glide.load.a.c.e r7 = r3.f16983g     // Catch:{ all -> 0x02c6 }
            com.bumptech.glide.load.a.c.e r8 = r3.f16982f     // Catch:{ all -> 0x02c6 }
            com.bumptech.glide.load.a.c.e r9 = new com.bumptech.glide.load.a.c.e     // Catch:{ all -> 0x02c6 }
            java.util.concurrent.ThreadPoolExecutor r2 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x02c6 }
            long r19 = com.bumptech.glide.load.p293a.p296c.C5710e.f17198a     // Catch:{ all -> 0x02c6 }
            java.util.concurrent.TimeUnit r21 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x02c6 }
            java.util.concurrent.SynchronousQueue r22 = new java.util.concurrent.SynchronousQueue     // Catch:{ all -> 0x02c6 }
            r22.<init>()     // Catch:{ all -> 0x02c6 }
            com.bumptech.glide.load.a.c.d r4 = new com.bumptech.glide.load.a.c.d     // Catch:{ all -> 0x02c6 }
            java.lang.String r10 = "source-unlimited"
            r4.<init>(r10, r12)     // Catch:{ all -> 0x02c6 }
            r17 = 0
            r18 = 2147483647(0x7fffffff, float:NaN)
            r16 = r2
            r23 = r4
            r16.<init>(r17, r18, r19, r21, r22, r23)     // Catch:{ all -> 0x02c6 }
            r9.<init>(r2)     // Catch:{ all -> 0x02c6 }
            com.bumptech.glide.load.a.c.e r10 = r3.f16987k     // Catch:{ all -> 0x02c6 }
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x02c6 }
            r3.f16979c = r0     // Catch:{ all -> 0x02c6 }
        L_0x0263:
            java.util.List r0 = r3.f16988l     // Catch:{ all -> 0x02c6 }
            if (r0 != 0) goto L_0x026e
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x02c6 }
            r3.f16988l = r0     // Catch:{ all -> 0x02c6 }
            goto L_0x0274
        L_0x026e:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x02c6 }
            r3.f16988l = r0     // Catch:{ all -> 0x02c6 }
        L_0x0274:
            com.bumptech.glide.m r0 = r3.f16978b     // Catch:{ all -> 0x02c6 }
            com.bumptech.glide.o r11 = new com.bumptech.glide.o     // Catch:{ all -> 0x02c6 }
            r11.<init>(r0)     // Catch:{ all -> 0x02c6 }
            com.bumptech.glide.manager.r r8 = new com.bumptech.glide.manager.r     // Catch:{ all -> 0x02c6 }
            com.bumptech.glide.manager.q r0 = r3.f16986j     // Catch:{ all -> 0x02c6 }
            r8.<init>(r0, r11)     // Catch:{ all -> 0x02c6 }
            com.bumptech.glide.d r0 = new com.bumptech.glide.d     // Catch:{ all -> 0x02c6 }
            com.bumptech.glide.load.a.ae r4 = r3.f16979c     // Catch:{ all -> 0x02c6 }
            com.bumptech.glide.load.a.b.k r5 = r3.f16989m     // Catch:{ all -> 0x02c6 }
            com.bumptech.glide.load.a.a.d r6 = r3.f16980d     // Catch:{ all -> 0x02c6 }
            com.bumptech.glide.load.a.a.b r7 = r3.f16981e     // Catch:{ all -> 0x02c6 }
            com.bumptech.glide.manager.f r9 = r3.f16991o     // Catch:{ all -> 0x02c6 }
            com.bumptech.glide.c r10 = r3.f16985i     // Catch:{ all -> 0x02c6 }
            java.util.Map r2 = r3.f16977a     // Catch:{ all -> 0x02c6 }
            java.util.List r3 = r3.f16988l     // Catch:{ all -> 0x02c6 }
            r16 = r2
            r2 = r0
            r17 = r3
            r3 = r15
            r18 = r11
            r11 = r16
            r16 = 0
            r12 = r17
            r24 = r15
            r15 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x02c6 }
            r2 = r24
            r2.registerComponentCallbacks(r0)     // Catch:{ all -> 0x02c6 }
            f16786g = r0     // Catch:{ all -> 0x02c6 }
            f16787h = r16     // Catch:{ all -> 0x02c6 }
            goto L_0x02c4
        L_0x02b3:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x02c6 }
            java.lang.String r3 = "Unable to find metadata to parse GlideModules"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x02c6 }
            throw r2     // Catch:{ all -> 0x02c6 }
        L_0x02bc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02c6 }
            java.lang.String r2 = "You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead"
            r0.<init>(r2)     // Catch:{ all -> 0x02c6 }
            throw r0     // Catch:{ all -> 0x02c6 }
        L_0x02c4:
            monitor-exit(r1)     // Catch:{ all -> 0x02c6 }
            goto L_0x02c9
        L_0x02c6:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02c6 }
            throw r0
        L_0x02c9:
            com.bumptech.glide.d r0 = f16786g
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C5543d.m14321a(android.content.Context):com.bumptech.glide.d");
    }

    /* renamed from: b */
    public static C5514ad m14322b(Fragment fragment) {
        C5986r c = m14323c(fragment.getContext());
        C5630q.m14607d(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (C5632s.m14620m()) {
            return c.mo12423b(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            fragment.getActivity();
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        if (!c.mo12427f()) {
            return c.mo12425d(context, childFragmentManager, fragment, fragment.isVisible());
        }
        return c.f17653c.mo12414a(context, m14321a(context.getApplicationContext()), fragment.getLifecycle(), fragment.isVisible());
    }

    /* renamed from: c */
    public static C5986r m14323c(Context context) {
        C5630q.m14607d(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m14321a(context).f16791d;
    }

    /* renamed from: g */
    private static GeneratedAppGlideModule m14324g(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context.getApplicationContext()});
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (InstantiationException e) {
            m14325h(e);
            return null;
        } catch (IllegalAccessException e2) {
            m14325h(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            m14325h(e3);
            return null;
        } catch (InvocationTargetException e4) {
            m14325h(e4);
            return null;
        }
    }

    /* renamed from: h */
    private static void m14325h(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: d */
    public final void mo11930d() {
        C5632s.m14616i();
        this.f16794i.f17064e.mo12137a().mo12191b();
    }

    /* renamed from: e */
    public final void mo11931e() {
        C5632s.m14617j();
        this.f16795j.mo12081i(0);
        this.f16788a.mo12115c();
        this.f16790c.mo12106b();
    }

    /* renamed from: f */
    public final void mo11932f(int i) {
        long j;
        C5632s.m14617j();
        synchronized (this.f16792e) {
            for (C5514ad adVar : this.f16792e) {
            }
        }
        C5695k kVar = this.f16795j;
        if (i >= 40) {
            j = 0;
        } else {
            if (i < 20) {
                if (i == 15) {
                    i = 15;
                }
                this.f16788a.mo12117e(i);
                this.f16790c.mo12108d(i);
            }
            j = kVar.mo12077e() / 2;
        }
        kVar.mo12081i(j);
        this.f16788a.mo12117e(i);
        this.f16790c.mo12108d(i);
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
        mo11931e();
    }

    public final void onTrimMemory(int i) {
        mo11932f(i);
    }
}
