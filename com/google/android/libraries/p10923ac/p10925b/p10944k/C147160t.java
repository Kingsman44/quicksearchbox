package com.google.android.libraries.p10923ac.p10925b.p10944k;

import android.accounts.Account;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7066m.C89963ab;
import com.google.android.apps.gsa.staticplugins.p7611bv.p7612a.C97246b;
import com.google.android.apps.gsa.staticplugins.p7611bv.p7612a.C97263s;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.p10923ac.p10925b.p10927b.C146770a;
import com.google.android.libraries.p10923ac.p10925b.p10927b.C146772b;
import com.google.android.libraries.p10923ac.p10925b.p10927b.C146790c;
import com.google.android.libraries.p10923ac.p10925b.p10927b.p10928a.C146771a;
import com.google.android.libraries.p10923ac.p10925b.p10933d.C146822a;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147075at;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147112i;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147116m;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147176j;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147179m;
import com.google.android.libraries.p10923ac.p10925b.p10946m.C147198p;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10967h.C147306a;
import com.google.common.base.C58885cv;
import com.google.common.p4552o.p4566l.C60192dc;
import com.google.protos.p4895aw.p4902b.C64054dj;
import com.google.protos.p4895aw.p4902b.C64097o;
import com.google.protos.p4895aw.p4902b.C64098p;
import dagger.C68214a;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.ac.b.k.t */
/* compiled from: PG */
public final class C147160t implements Closeable, C147136ak {

    /* renamed from: a */
    public final C68214a f397310a;

    /* renamed from: b */
    public final C147116m f397311b;

    /* renamed from: c */
    public final Map f397312c;

    /* renamed from: d */
    public final Map f397313d;

    /* renamed from: e */
    public final C68214a f397314e;

    /* renamed from: f */
    public final C147198p f397315f;

    /* renamed from: g */
    public final C68214a f397316g;

    /* renamed from: h */
    public final C68214a f397317h;

    /* renamed from: i */
    public final Object f397318i = new Object();

    /* renamed from: j */
    public final Map f397319j = new HashMap();

    /* renamed from: k */
    public boolean f397320k;

    /* renamed from: l */
    public long f397321l;

    /* renamed from: m */
    public final C68214a f397322m;

    /* renamed from: n */
    public final C147306a f397323n;

    /* renamed from: o */
    public final C147266a f397324o;

    /* renamed from: p */
    private final C146771a f397325p;

    /* renamed from: q */
    private final C147132ag f397326q;

    /* renamed from: r */
    private final Map f397327r;

    /* renamed from: s */
    private final C147179m f397328s;

    public C147160t(C146771a aVar, C68214a aVar2, C147132ag agVar, C147306a aVar3, Map map, Map map2, Map map3, C147116m mVar, C147179m mVar2, C68214a aVar4, C147198p pVar, C68214a aVar5, C68214a aVar6, C147266a aVar7, C68214a aVar8) {
        this.f397325p = aVar;
        this.f397310a = aVar2;
        this.f397326q = agVar;
        this.f397323n = aVar3;
        this.f397311b = mVar;
        this.f397327r = map;
        this.f397312c = map2;
        this.f397313d = map3;
        this.f397328s = mVar2;
        this.f397314e = aVar4;
        this.f397315f = pVar;
        this.f397316g = aVar5;
        this.f397317h = aVar6;
        this.f397324o = aVar7;
        this.f397322m = aVar8;
        this.f397320k = false;
    }

    /* renamed from: j */
    public static final int m239973j() {
        return C147266a.m240137h() ? 1 : 3;
    }

    /* renamed from: a */
    public final C147159s mo123988a(C146770a aVar) {
        C147159s sVar = (C147159s) this.f397319j.get(aVar);
        if (sVar != null) {
            return sVar;
        }
        C147133ah a = this.f397326q.mo123956a(aVar.mo123623a(), aVar.mo123624b());
        try {
            aVar.mo123624b();
            C147159s sVar2 = new C147159s(this, a, (C147141ap) this.f397327r.get(C64097o.m96355a(aVar.mo123624b().f173294a)), aVar.mo123624b(), aVar.mo123623a(), (long) ((Integer) this.f397328s.mo124004a()).intValue());
            this.f397319j.put(aVar, sVar2);
            return sVar2;
        } catch (IOException e) {
            try {
                a.close();
            } catch (IOException e2) {
                ((C147256m) this.f397310a.mo27525b()).mo124063f("Failure cleaning up MdhSyncStateStorage after ChannelSync creation failed", e2, new Object[0]);
            }
            throw C147075at.m239771a(e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: int} */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0296, code lost:
        if (((com.google.android.libraries.p10923ac.p10925b.p10937f.p10938a.C147030e) r8.f397306j.f397317h.mo27525b()).mo123838f(r8.f397300d) != false) goto L_0x02b7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0286 A[SYNTHETIC, Splitter:B:126:0x0286] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02f8 A[Catch:{ Exception -> 0x0384 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0306 A[Catch:{ Exception -> 0x0384 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0366 A[Catch:{ Exception -> 0x0384 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x037a A[Catch:{ Exception -> 0x0384 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0397 A[Catch:{ at -> 0x0260 }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03aa A[Catch:{ at -> 0x0260 }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0089 A[LOOP:2: B:13:0x0089->B:170:0x0089, LOOP_END, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d8 A[Catch:{ all -> 0x014b, all -> 0x0153 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d9 A[Catch:{ all -> 0x014b, all -> 0x0153 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e7 A[Catch:{ all -> 0x014b, all -> 0x0153 }, LOOP:3: B:14:0x008a->B:36:0x00e7, LOOP_END] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo123989b(boolean r27) {
        /*
            r26 = this;
            r1 = r26
            r3 = 2
            r4 = 1
            com.google.android.libraries.ac.b.j.m r0 = r1.f397311b     // Catch:{ j -> 0x0157, at -> 0x0155 }
            java.util.List r0 = r0.mo123934b()     // Catch:{ j -> 0x0157, at -> 0x0155 }
            com.google.common.b.bb r6 = new com.google.common.b.bb     // Catch:{ j -> 0x0157, at -> 0x0155 }
            r6.<init>()     // Catch:{ j -> 0x0157, at -> 0x0155 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ j -> 0x0157, at -> 0x0155 }
        L_0x0013:
            boolean r7 = r0.hasNext()     // Catch:{ j -> 0x0157, at -> 0x0155 }
            if (r7 == 0) goto L_0x0030
            java.lang.Object r7 = r0.next()     // Catch:{ j -> 0x0157, at -> 0x0155 }
            com.google.android.libraries.ac.b.j.i r7 = (com.google.android.libraries.p10923ac.p10925b.p10943j.C147112i) r7     // Catch:{ j -> 0x0157, at -> 0x0155 }
            android.accounts.Account r8 = r7.mo123925d()     // Catch:{ j -> 0x0157, at -> 0x0155 }
            com.google.protos.aw.b.p r9 = r7.mo123928f()     // Catch:{ j -> 0x0157, at -> 0x0155 }
            com.google.android.libraries.ac.b.b.b r10 = new com.google.android.libraries.ac.b.b.b     // Catch:{ j -> 0x0157, at -> 0x0155 }
            r10.<init>(r8, r9)     // Catch:{ j -> 0x0157, at -> 0x0155 }
            r6.mo54920x(r10, r7)     // Catch:{ j -> 0x0157, at -> 0x0155 }
            goto L_0x0013
        L_0x0030:
            java.lang.Object r7 = r1.f397318i     // Catch:{ j -> 0x0157, at -> 0x0155 }
            monitor-enter(r7)     // Catch:{ j -> 0x0157, at -> 0x0155 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x014b }
            java.util.Map r8 = r1.f397319j     // Catch:{ all -> 0x014b }
            java.util.Set r8 = r8.keySet()     // Catch:{ all -> 0x014b }
            r0.<init>(r8)     // Catch:{ all -> 0x014b }
            java.util.Map r6 = r6.mo54950C()     // Catch:{ all -> 0x014b }
            java.util.Set r6 = r6.entrySet()     // Catch:{ all -> 0x014b }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x014b }
        L_0x004a:
            boolean r8 = r6.hasNext()     // Catch:{ all -> 0x014b }
            r9 = 3
            if (r8 == 0) goto L_0x011b
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x014b }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ all -> 0x014b }
            java.lang.Object r10 = r8.getKey()     // Catch:{ all -> 0x014b }
            com.google.android.libraries.ac.b.b.a r10 = (com.google.android.libraries.p10923ac.p10925b.p10927b.C146770a) r10     // Catch:{ all -> 0x014b }
            com.google.protos.aw.b.p r10 = r10.mo123624b()     // Catch:{ all -> 0x014b }
            java.lang.Object r11 = r8.getKey()     // Catch:{ all -> 0x014b }
            com.google.android.libraries.ac.b.b.a r11 = (com.google.android.libraries.p10923ac.p10925b.p10927b.C146770a) r11     // Catch:{ all -> 0x014b }
            android.accounts.Account r11 = r11.mo123623a()     // Catch:{ all -> 0x014b }
            java.util.Map r12 = r1.f397313d     // Catch:{ all -> 0x014b }
            int r13 = r10.f173294a     // Catch:{ all -> 0x014b }
            com.google.protos.aw.b.o r13 = com.google.protos.p4895aw.p4902b.C64097o.m96355a(r13)     // Catch:{ all -> 0x014b }
            java.lang.Object r12 = r12.get(r13)     // Catch:{ all -> 0x014b }
            com.google.android.libraries.ac.b.b.c r12 = (com.google.android.libraries.p10923ac.p10925b.p10927b.C146790c) r12     // Catch:{ all -> 0x014b }
            boolean r10 = r12.mo123634a(r10, r11)     // Catch:{ all -> 0x014b }
            java.lang.Object r11 = r8.getValue()     // Catch:{ all -> 0x014b }
            java.util.Collection r11 = (java.util.Collection) r11     // Catch:{ all -> 0x014b }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x014b }
            r12 = 0
            r13 = 0
        L_0x0089:
            r14 = 0
        L_0x008a:
            boolean r15 = r11.hasNext()     // Catch:{ all -> 0x014b }
            if (r15 == 0) goto L_0x00e9
            java.lang.Object r15 = r11.next()     // Catch:{ all -> 0x014b }
            com.google.android.libraries.ac.b.j.i r15 = (com.google.android.libraries.p10923ac.p10925b.p10943j.C147112i) r15     // Catch:{ all -> 0x014b }
            com.google.protos.aw.b.dj r5 = r15.mo123929g()     // Catch:{ all -> 0x014b }
            if (r12 != 0) goto L_0x00ba
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x014b }
            com.google.common.base.cv r2 = new com.google.common.base.cv     // Catch:{ all -> 0x014b }
            r2.<init>(r12)     // Catch:{ all -> 0x014b }
            java.lang.Object r2 = r2.f156729a     // Catch:{ all -> 0x014b }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x014b }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x014b }
            if (r2 == 0) goto L_0x00ba
            com.google.protobuf.cq r2 = r5.f173191c     // Catch:{ all -> 0x014b }
            boolean r2 = com.google.android.libraries.p10923ac.p10925b.p10944k.C147137al.m239935b(r5, r2, r10)     // Catch:{ all -> 0x014b }
            if (r2 == 0) goto L_0x00b8
            goto L_0x00ba
        L_0x00b8:
            r12 = 0
            goto L_0x00bb
        L_0x00ba:
            r12 = 1
        L_0x00bb:
            if (r13 != 0) goto L_0x00db
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x014b }
            com.google.common.base.cv r13 = new com.google.common.base.cv     // Catch:{ all -> 0x014b }
            r13.<init>(r2)     // Catch:{ all -> 0x014b }
            java.lang.Object r2 = r13.f156729a     // Catch:{ all -> 0x014b }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x014b }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x014b }
            if (r2 == 0) goto L_0x00db
            com.google.protobuf.cq r2 = r5.f173192d     // Catch:{ all -> 0x014b }
            boolean r2 = com.google.android.libraries.p10923ac.p10925b.p10944k.C147137al.m239935b(r5, r2, r10)     // Catch:{ all -> 0x014b }
            if (r2 == 0) goto L_0x00d9
            goto L_0x00db
        L_0x00d9:
            r13 = 0
            goto L_0x00dc
        L_0x00db:
            r13 = 1
        L_0x00dc:
            if (r14 != 0) goto L_0x00e7
            com.google.protos.aw.b.dj r2 = r15.mo123929g()     // Catch:{ all -> 0x014b }
            int r2 = r2.f173189a     // Catch:{ all -> 0x014b }
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0089
        L_0x00e7:
            r14 = 1
            goto L_0x008a
        L_0x00e9:
            if (r12 != 0) goto L_0x00ee
            if (r13 == 0) goto L_0x004a
            r13 = 1
        L_0x00ee:
            java.lang.Object r2 = r8.getKey()     // Catch:{ all -> 0x014b }
            r0.remove(r2)     // Catch:{ all -> 0x014b }
            java.lang.Object r2 = r8.getKey()     // Catch:{ all -> 0x014b }
            com.google.android.libraries.ac.b.b.a r2 = (com.google.android.libraries.p10923ac.p10925b.p10927b.C146770a) r2     // Catch:{ all -> 0x014b }
            com.google.android.libraries.ac.b.k.s r2 = r1.mo123988a(r2)     // Catch:{ all -> 0x014b }
            if (r27 == 0) goto L_0x010c
            boolean r5 = com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a.m240139j()     // Catch:{ all -> 0x014b }
            if (r5 == 0) goto L_0x010c
            com.google.common.o.l.dc r5 = com.google.common.p4552o.p4566l.C60192dc.SYNC_TRIGGER_TIMER     // Catch:{ all -> 0x014b }
            r2.mo123979c(r5)     // Catch:{ all -> 0x014b }
        L_0x010c:
            int r5 = r2.f397307k     // Catch:{ all -> 0x014b }
            if (r5 != r9) goto L_0x0113
            r2.mo123985h(r3)     // Catch:{ all -> 0x014b }
        L_0x0113:
            r2.f397303g = r12     // Catch:{ all -> 0x014b }
            r2.f397304h = r13     // Catch:{ all -> 0x014b }
            r2.f397305i = r14     // Catch:{ all -> 0x014b }
            goto L_0x004a
        L_0x011b:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x014b }
        L_0x011f:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x014b }
            if (r2 == 0) goto L_0x0148
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x014b }
            com.google.android.libraries.ac.b.b.a r2 = (com.google.android.libraries.p10923ac.p10925b.p10927b.C146770a) r2     // Catch:{ all -> 0x014b }
            java.util.Map r5 = r1.f397319j     // Catch:{ all -> 0x014b }
            java.lang.Object r5 = r5.get(r2)     // Catch:{ all -> 0x014b }
            com.google.android.libraries.ac.b.k.s r5 = (com.google.android.libraries.p10923ac.p10925b.p10944k.C147159s) r5     // Catch:{ all -> 0x014b }
            int r6 = r5.f397307k     // Catch:{ all -> 0x014b }
            int r8 = r6 + -1
            if (r6 == 0) goto L_0x0146
            if (r8 == 0) goto L_0x0142
            if (r8 == r4) goto L_0x013e
            goto L_0x011f
        L_0x013e:
            r5.mo123985h(r9)     // Catch:{ all -> 0x014b }
            goto L_0x011f
        L_0x0142:
            r5.mo123983f(r2)     // Catch:{ all -> 0x014b }
            goto L_0x011f
        L_0x0146:
            r2 = 0
            throw r2     // Catch:{ all -> 0x0153 }
        L_0x0148:
            r2 = 0
            monitor-exit(r7)     // Catch:{ all -> 0x0153 }
            goto L_0x019e
        L_0x014b:
            r0 = move-exception
            r2 = 0
        L_0x014d:
            monitor-exit(r7)     // Catch:{ all -> 0x0153 }
            throw r0     // Catch:{ j -> 0x0151, at -> 0x014f }
        L_0x014f:
            r0 = move-exception
            goto L_0x0159
        L_0x0151:
            r0 = move-exception
            goto L_0x0159
        L_0x0153:
            r0 = move-exception
            goto L_0x014d
        L_0x0155:
            r0 = move-exception
            goto L_0x0158
        L_0x0157:
            r0 = move-exception
        L_0x0158:
            r2 = 0
        L_0x0159:
            r5 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            com.google.common.base.cv r5 = new com.google.common.base.cv
            r5.<init>(r6)
            java.lang.Object r5 = r5.f156729a
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0172
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92899h(r0)
            return r0
        L_0x0172:
            dagger.a r5 = r1.f397310a
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.libraries.ac.d.b.b.d.m r5 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r5
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r6 = "Subscribed channels refresh failed"
            boolean r8 = r5.f397497a
            if (r8 == 0) goto L_0x0191
            java.lang.String r8 = r5.f397498b
            java.lang.String r6 = java.lang.String.format(r6, r7)
            java.lang.String r5 = r5.mo124059b(r6)
            android.util.Log.w(r8, r5, r0)
            goto L_0x019e
        L_0x0191:
            java.lang.String r0 = r5.f397498b
            java.lang.String r6 = java.lang.String.format(r6, r7)
            java.lang.String r5 = r5.mo124059b(r6)
            android.util.Log.w(r0, r5)
        L_0x019e:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Object r6 = r1.f397318i
            monitor-enter(r6)
            r7 = 0
            r1.f397320k = r7     // Catch:{ all -> 0x043a }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x043a }
            java.util.Map r7 = r1.f397319j     // Catch:{ all -> 0x043a }
            java.util.Collection r7 = r7.values()     // Catch:{ all -> 0x043a }
            r0.<init>(r7)     // Catch:{ all -> 0x043a }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x043a }
        L_0x01b8:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x043a }
            if (r0 == 0) goto L_0x0429
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x043a }
            r8 = r0
            com.google.android.libraries.ac.b.k.s r8 = (com.google.android.libraries.p10923ac.p10925b.p10944k.C147159s) r8     // Catch:{ all -> 0x043a }
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x043a }
            int r0 = r8.f397307k     // Catch:{ all -> 0x043a }
            if (r0 == r4) goto L_0x01e8
            com.google.android.libraries.ac.b.k.t r0 = r8.f397306j     // Catch:{ all -> 0x043a }
            dagger.a r0 = r0.f397310a     // Catch:{ all -> 0x043a }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x043a }
            com.google.android.libraries.ac.d.b.b.d.m r0 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r0     // Catch:{ all -> 0x043a }
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x043a }
            android.accounts.Account r10 = r8.f397300d     // Catch:{ all -> 0x043a }
            r11 = 0
            r9[r11] = r10     // Catch:{ all -> 0x043a }
            com.google.protos.aw.b.p r8 = r8.f397299c     // Catch:{ all -> 0x043a }
            r9[r4] = r8     // Catch:{ all -> 0x043a }
            java.lang.String r8 = "Sync already started; account=%s, channelId=%s"
            r0.mo124066i(r8, r9)     // Catch:{ all -> 0x043a }
            goto L_0x01b8
        L_0x01e8:
            if (r27 == 0) goto L_0x01fd
            com.google.android.libraries.ac.b.k.t r0 = r8.f397306j     // Catch:{ all -> 0x043a }
            com.google.android.libraries.ac.d.b.b.e.a r0 = r0.f397324o     // Catch:{ all -> 0x043a }
            long r11 = r0.mo124073d()     // Catch:{ all -> 0x043a }
            r13 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r13
            boolean r0 = r8.mo123984g(r9, r11)     // Catch:{ all -> 0x043a }
            if (r0 != 0) goto L_0x0404
            goto L_0x021b
        L_0x01fd:
            boolean r0 = r8.f397303g     // Catch:{ all -> 0x043a }
            if (r0 == 0) goto L_0x020b
            com.google.android.libraries.ac.b.k.af r0 = r8.f397301e     // Catch:{ all -> 0x043a }
            com.google.android.libraries.ac.b.k.af r11 = r8.f397302f     // Catch:{ all -> 0x043a }
            boolean r0 = com.google.android.libraries.p10923ac.p10925b.p10944k.C147131af.m239911h(r0, r11)     // Catch:{ all -> 0x043a }
            if (r0 != 0) goto L_0x021b
        L_0x020b:
            boolean r0 = r8.f397304h     // Catch:{ all -> 0x043a }
            if (r0 == 0) goto L_0x0404
            com.google.android.libraries.ac.b.k.af r0 = r8.f397301e     // Catch:{ all -> 0x043a }
            com.google.android.libraries.ac.b.k.af r11 = r8.f397302f     // Catch:{ all -> 0x043a }
            boolean r0 = com.google.android.libraries.p10923ac.p10925b.p10944k.C147131af.m239912i(r0, r11)     // Catch:{ all -> 0x043a }
            if (r0 != 0) goto L_0x021b
            goto L_0x0404
        L_0x021b:
            boolean r11 = r8.f397305i     // Catch:{ all -> 0x043a }
            com.google.android.libraries.ac.b.k.ae r0 = com.google.android.libraries.p10923ac.p10925b.p10944k.C147131af.m239909f()     // Catch:{ all -> 0x043a }
            boolean r12 = r8.f397303g     // Catch:{ all -> 0x043a }
            if (r12 == 0) goto L_0x022c
            com.google.android.libraries.ac.b.k.af r12 = r8.f397301e     // Catch:{ all -> 0x043a }
        L_0x0227:
            long r12 = r12.mo123951a()     // Catch:{ all -> 0x043a }
            goto L_0x022f
        L_0x022c:
            com.google.android.libraries.ac.b.k.af r12 = r8.f397302f     // Catch:{ all -> 0x043a }
            goto L_0x0227
        L_0x022f:
            r0.mo123948c(r12)     // Catch:{ all -> 0x043a }
            boolean r12 = r8.f397304h     // Catch:{ all -> 0x043a }
            if (r12 == 0) goto L_0x023d
            com.google.android.libraries.ac.b.k.af r12 = r8.f397301e     // Catch:{ all -> 0x043a }
        L_0x0238:
            long r12 = r12.mo123952b()     // Catch:{ all -> 0x043a }
            goto L_0x0240
        L_0x023d:
            com.google.android.libraries.ac.b.k.af r12 = r8.f397302f     // Catch:{ all -> 0x043a }
            goto L_0x0238
        L_0x0240:
            r0.mo123950e(r12)     // Catch:{ all -> 0x043a }
            com.google.android.libraries.ac.b.k.af r12 = r8.f397301e     // Catch:{ all -> 0x043a }
            com.google.common.b.hd r12 = r12.mo123954d()     // Catch:{ all -> 0x043a }
            r0.mo123949d(r12)     // Catch:{ all -> 0x043a }
            com.google.android.libraries.ac.b.k.af r12 = r0.mo123946a()     // Catch:{ all -> 0x043a }
            com.google.android.libraries.ac.b.k.t r0 = r8.f397306j     // Catch:{ all -> 0x043a }
            boolean r0 = com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a.m240139j()     // Catch:{ all -> 0x043a }
            if (r0 == 0) goto L_0x027d
            com.google.android.libraries.ac.b.k.ah r0 = r8.f397297a     // Catch:{ at -> 0x0260 }
            java.lang.Long r0 = r0.mo123960d()     // Catch:{ at -> 0x0260 }
            r2 = r0
            goto L_0x027e
        L_0x0260:
            r0 = move-exception
            com.google.android.libraries.ac.b.k.t r13 = r8.f397306j     // Catch:{ all -> 0x043a }
            dagger.a r13 = r13.f397310a     // Catch:{ all -> 0x043a }
            java.lang.Object r13 = r13.mo27525b()     // Catch:{ all -> 0x043a }
            com.google.android.libraries.ac.d.b.b.d.m r13 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r13     // Catch:{ all -> 0x043a }
            java.lang.String r14 = "Failed to retrieve push notification timestamp!"
            r15 = 0
            java.lang.Object[] r2 = new java.lang.Object[r15]     // Catch:{ all -> 0x043a }
            r13.mo124062e(r14, r0, r2)     // Catch:{ all -> 0x043a }
            com.google.android.libraries.ac.b.k.t r0 = r8.f397306j     // Catch:{ all -> 0x043a }
            dagger.a r0 = r0.f397316g     // Catch:{ all -> 0x043a }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x043a }
            com.google.android.libraries.ac.d.b.b.d.a r0 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147244a) r0     // Catch:{ all -> 0x043a }
        L_0x027d:
            r2 = 0
        L_0x027e:
            com.google.android.libraries.ac.b.k.t r0 = r8.f397306j     // Catch:{ all -> 0x043a }
            boolean r0 = com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a.m240138i()     // Catch:{ all -> 0x043a }
            if (r0 == 0) goto L_0x02b6
            com.google.android.libraries.ac.b.k.t r0 = r8.f397306j     // Catch:{ IOException -> 0x0299 }
            dagger.a r0 = r0.f397317h     // Catch:{ IOException -> 0x0299 }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ IOException -> 0x0299 }
            com.google.android.libraries.ac.b.f.a.e r0 = (com.google.android.libraries.p10923ac.p10925b.p10937f.p10938a.C147030e) r0     // Catch:{ IOException -> 0x0299 }
            android.accounts.Account r13 = r8.f397300d     // Catch:{ IOException -> 0x0299 }
            boolean r0 = r0.mo123838f(r13)     // Catch:{ IOException -> 0x0299 }
            if (r0 == 0) goto L_0x02b6
            goto L_0x02b7
        L_0x0299:
            r0 = move-exception
            com.google.android.libraries.ac.b.k.t r13 = r8.f397306j     // Catch:{ all -> 0x043a }
            dagger.a r13 = r13.f397310a     // Catch:{ all -> 0x043a }
            java.lang.Object r13 = r13.mo27525b()     // Catch:{ all -> 0x043a }
            com.google.android.libraries.ac.d.b.b.d.m r13 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r13     // Catch:{ all -> 0x043a }
            java.lang.String r14 = "Failed to retrieve registration status!"
            r15 = 0
            java.lang.Object[] r4 = new java.lang.Object[r15]     // Catch:{ all -> 0x043a }
            r13.mo124062e(r14, r0, r4)     // Catch:{ all -> 0x043a }
            com.google.android.libraries.ac.b.k.t r0 = r8.f397306j     // Catch:{ all -> 0x043a }
            dagger.a r0 = r0.f397316g     // Catch:{ all -> 0x043a }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x043a }
            com.google.android.libraries.ac.d.b.b.d.a r0 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147244a) r0     // Catch:{ all -> 0x043a }
        L_0x02b6:
            r4 = 0
        L_0x02b7:
            boolean r13 = r8.f397303g     // Catch:{ all -> 0x043a }
            com.google.android.libraries.ac.b.k.t r0 = r8.f397306j     // Catch:{ all -> 0x043a }
            com.google.android.libraries.ac.b.m.p r0 = r0.f397315f     // Catch:{ all -> 0x043a }
            android.accounts.Account r14 = r8.f397300d     // Catch:{ all -> 0x043a }
            com.google.protos.aw.b.p r15 = r8.f397299c     // Catch:{ all -> 0x043a }
            r0.mo124012c(r14, r15)     // Catch:{ all -> 0x043a }
            r8.mo123985h(r3)     // Catch:{ all -> 0x043a }
            com.google.android.libraries.ac.b.k.ap r0 = r8.f397298b     // Catch:{ Exception -> 0x0386 }
            com.google.protos.aw.b.p r14 = r8.f397299c     // Catch:{ Exception -> 0x0386 }
            android.accounts.Account r15 = r8.f397300d     // Catch:{ Exception -> 0x0386 }
            boolean r3 = r8.f397303g     // Catch:{ Exception -> 0x0386 }
            r25 = r7
            boolean r7 = r8.f397304h     // Catch:{ Exception -> 0x0384 }
            com.google.common.util.concurrent.cx r0 = r0.mo123727a(r14, r15, r3, r7)     // Catch:{ Exception -> 0x0384 }
            com.google.android.libraries.ac.b.k.m r3 = new com.google.android.libraries.ac.b.k.m     // Catch:{ Exception -> 0x0384 }
            r3.<init>()     // Catch:{ Exception -> 0x0384 }
            com.google.common.util.concurrent.bg r7 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ Exception -> 0x0384 }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r0, r3, r7)     // Catch:{ Exception -> 0x0384 }
            com.google.android.libraries.ac.b.k.t r3 = r8.f397306j     // Catch:{ Exception -> 0x0384 }
            r3 = 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x0384 }
            com.google.common.base.cv r3 = new com.google.common.base.cv     // Catch:{ Exception -> 0x0384 }
            r3.<init>(r7)     // Catch:{ Exception -> 0x0384 }
            java.lang.Object r3 = r3.f156729a     // Catch:{ Exception -> 0x0384 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Exception -> 0x0384 }
            boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x0384 }
            if (r3 == 0) goto L_0x0306
            java.lang.Class<java.lang.Exception> r3 = java.lang.Exception.class
            com.google.android.libraries.ac.b.k.n r7 = new com.google.android.libraries.ac.b.k.n     // Catch:{ Exception -> 0x0384 }
            r7.<init>()     // Catch:{ Exception -> 0x0384 }
            com.google.common.util.concurrent.bg r14 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ Exception -> 0x0384 }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60846c.m92879h(r0, r3, r7, r14)     // Catch:{ Exception -> 0x0384 }
            goto L_0x031d
        L_0x0306:
            java.lang.Class<com.google.android.libraries.ac.b.b.b.d> r3 = com.google.android.libraries.p10923ac.p10925b.p10927b.p10929b.C146776d.class
            com.google.android.libraries.ac.b.k.o r7 = com.google.android.libraries.p10923ac.p10925b.p10944k.C147155o.f397282a     // Catch:{ Exception -> 0x0384 }
            com.google.common.util.concurrent.bg r14 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ Exception -> 0x0384 }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60846c.m92878g(r0, r3, r7, r14)     // Catch:{ Exception -> 0x0384 }
            java.lang.Class<com.google.android.libraries.ac.b.k.ai> r3 = com.google.android.libraries.p10923ac.p10925b.p10944k.C147134ai.class
            com.google.android.libraries.ac.b.k.p r7 = new com.google.android.libraries.ac.b.k.p     // Catch:{ Exception -> 0x0384 }
            r7.<init>()     // Catch:{ Exception -> 0x0384 }
            com.google.common.util.concurrent.bg r14 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ Exception -> 0x0384 }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60846c.m92878g(r0, r3, r7, r14)     // Catch:{ Exception -> 0x0384 }
        L_0x031d:
            java.lang.Class<java.lang.Exception> r3 = java.lang.Exception.class
            com.google.android.libraries.ac.b.k.q r7 = new com.google.android.libraries.ac.b.k.q     // Catch:{ Exception -> 0x0384 }
            r16 = r7
            r17 = r8
            r18 = r9
            r20 = r11
            r21 = r12
            r22 = r2
            r23 = r4
            r24 = r13
            r16.<init>(r17, r18, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x0384 }
            com.google.common.util.concurrent.bg r14 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ Exception -> 0x0384 }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60846c.m92879h(r0, r3, r7, r14)     // Catch:{ Exception -> 0x0384 }
            com.google.android.libraries.ac.b.k.r r3 = new com.google.android.libraries.ac.b.k.r     // Catch:{ Exception -> 0x0384 }
            r16 = r3
            r17 = r8
            r18 = r9
            r20 = r11
            r21 = r12
            r22 = r2
            r23 = r4
            r24 = r13
            r16.<init>(r17, r18, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x0384 }
            com.google.common.util.concurrent.bg r7 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ Exception -> 0x0384 }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r0, r3, r7)     // Catch:{ Exception -> 0x0384 }
            r5.add(r0)     // Catch:{ Exception -> 0x0384 }
            com.google.android.libraries.ac.b.k.t r0 = r8.f397306j     // Catch:{ Exception -> 0x0384 }
            dagger.a r0 = r0.f397310a     // Catch:{ Exception -> 0x0384 }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ Exception -> 0x0384 }
            com.google.android.libraries.ac.d.b.b.d.m r0 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r0     // Catch:{ Exception -> 0x0384 }
            boolean r3 = r0.f397497a     // Catch:{ Exception -> 0x0384 }
            if (r3 == 0) goto L_0x037a
            r3 = 2
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0384 }
            android.accounts.Account r3 = r8.f397300d     // Catch:{ Exception -> 0x0384 }
            r14 = 0
            r7[r14] = r3     // Catch:{ Exception -> 0x0384 }
            com.google.protos.aw.b.p r3 = r8.f397299c     // Catch:{ Exception -> 0x0384 }
            r14 = 1
            r7[r14] = r3     // Catch:{ Exception -> 0x0384 }
            java.lang.String r3 = "Sync started; account=%s, channelId=%s"
            r0.mo124066i(r3, r7)     // Catch:{ Exception -> 0x0384 }
            goto L_0x0422
        L_0x037a:
            java.lang.String r3 = "Sync started"
            r7 = 0
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0384 }
            r0.mo124065h(r3, r14)     // Catch:{ Exception -> 0x0384 }
            goto L_0x0422
        L_0x0384:
            r0 = move-exception
            goto L_0x0389
        L_0x0386:
            r0 = move-exception
            r25 = r7
        L_0x0389:
            com.google.android.libraries.ac.b.k.t r3 = r8.f397306j     // Catch:{ all -> 0x043a }
            dagger.a r3 = r3.f397310a     // Catch:{ all -> 0x043a }
            java.lang.Object r3 = r3.mo27525b()     // Catch:{ all -> 0x043a }
            com.google.android.libraries.ac.d.b.b.d.m r3 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r3     // Catch:{ all -> 0x043a }
            boolean r7 = r3.f397497a     // Catch:{ all -> 0x043a }
            if (r7 == 0) goto L_0x03aa
            r7 = 2
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x043a }
            android.accounts.Account r7 = r8.f397300d     // Catch:{ all -> 0x043a }
            r15 = 0
            r14[r15] = r7     // Catch:{ all -> 0x043a }
            com.google.protos.aw.b.p r7 = r8.f397299c     // Catch:{ all -> 0x043a }
            r15 = 1
            r14[r15] = r7     // Catch:{ all -> 0x043a }
            java.lang.String r7 = "Sync trigger failed; account=%s, channelId=%s"
            r3.mo124061d(r7, r0, r14)     // Catch:{ all -> 0x043a }
            goto L_0x03b2
        L_0x03aa:
            java.lang.String r7 = "Sync trigger failed"
            r14 = 0
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ all -> 0x043a }
            r3.mo124060c(r7, r15)     // Catch:{ all -> 0x043a }
        L_0x03b2:
            com.google.common.o.l.cp r3 = com.google.common.p4552o.p4566l.C60178cp.f162787o     // Catch:{ all -> 0x043a }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ all -> 0x043a }
            com.google.common.o.l.ck r3 = (com.google.common.p4552o.p4566l.C60173ck) r3     // Catch:{ all -> 0x043a }
            java.lang.Class r7 = r0.getClass()     // Catch:{ all -> 0x043a }
            java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x043a }
            r3.copyOnWrite()     // Catch:{ all -> 0x043a }
            com.google.protobuf.bv r14 = r3.instance     // Catch:{ all -> 0x043a }
            com.google.common.o.l.cp r14 = (com.google.common.p4552o.p4566l.C60178cp) r14     // Catch:{ all -> 0x043a }
            r7.getClass()     // Catch:{ all -> 0x043a }
            int r15 = r14.f162789a     // Catch:{ all -> 0x043a }
            r15 = r15 | 4
            r14.f162789a = r15     // Catch:{ all -> 0x043a }
            r14.f162792d = r7     // Catch:{ all -> 0x043a }
            com.google.common.o.l.de r7 = com.google.common.p4552o.p4566l.C60194de.NOT_STARTED     // Catch:{ all -> 0x043a }
            r3.copyOnWrite()     // Catch:{ all -> 0x043a }
            com.google.protobuf.bv r14 = r3.instance     // Catch:{ all -> 0x043a }
            com.google.common.o.l.cp r14 = (com.google.common.p4552o.p4566l.C60178cp) r14     // Catch:{ all -> 0x043a }
            int r7 = r7.getNumber()     // Catch:{ all -> 0x043a }
            r14.f162791c = r7     // Catch:{ all -> 0x043a }
            int r7 = r14.f162789a     // Catch:{ all -> 0x043a }
            r15 = 2
            r7 = r7 | r15
            r14.f162789a = r7     // Catch:{ all -> 0x043a }
            r16 = r8
            r17 = r9
            r19 = r11
            r20 = r12
            r21 = r2
            r22 = r4
            r23 = r13
            r24 = r3
            r16.mo123981d(r17, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x043a }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92899h(r0)     // Catch:{ all -> 0x043a }
            r5.add(r0)     // Catch:{ all -> 0x043a }
            goto L_0x0422
        L_0x0404:
            r25 = r7
            com.google.android.libraries.ac.b.k.t r0 = r8.f397306j     // Catch:{ all -> 0x043a }
            dagger.a r0 = r0.f397310a     // Catch:{ all -> 0x043a }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x043a }
            com.google.android.libraries.ac.d.b.b.d.m r0 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r0     // Catch:{ all -> 0x043a }
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x043a }
            android.accounts.Account r4 = r8.f397300d     // Catch:{ all -> 0x043a }
            r7 = 0
            r3[r7] = r4     // Catch:{ all -> 0x043a }
            com.google.protos.aw.b.p r4 = r8.f397299c     // Catch:{ all -> 0x043a }
            r8 = 1
            r3[r8] = r4     // Catch:{ all -> 0x043a }
            java.lang.String r4 = "Sync skipped; account=%s, channelId=%s"
            r0.mo124066i(r4, r3)     // Catch:{ all -> 0x043a }
        L_0x0422:
            r7 = r25
            r2 = 0
            r3 = 2
            r4 = 1
            goto L_0x01b8
        L_0x0429:
            monitor-exit(r6)     // Catch:{ all -> 0x043a }
            com.google.common.util.concurrent.cf r0 = com.google.common.util.concurrent.C60856cj.m92892a(r5)
            com.google.android.libraries.ac.b.k.k r2 = new com.google.android.libraries.ac.b.k.k
            r2.<init>(r1, r5)
            com.google.android.libraries.ac.b.b.a.a r3 = r1.f397325p
            com.google.common.util.concurrent.cx r0 = r0.mo57334a(r2, r3)
            return r0
        L_0x043a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x043a }
            goto L_0x043e
        L_0x043d:
            throw r0
        L_0x043e:
            goto L_0x043d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p10923ac.p10925b.p10944k.C147160t.mo123989b(boolean):com.google.common.util.concurrent.cx");
    }

    /* renamed from: c */
    public final void mo123967c(C64098p pVar, Account account) {
        synchronized (this.f397318i) {
            C147159s a = mo123988a(new C146772b(account, pVar));
            if (a.f397307k != 4) {
                try {
                    a.f397297a.mo123962f();
                    if (a.f397307k == 1) {
                        a.mo123982e();
                    } else {
                        a.mo123985h(4);
                    }
                } catch (C147075at e) {
                    C147256m mVar = (C147256m) a.f397306j.f397310a.mo27525b();
                    if (mVar.f397497a) {
                        mVar.mo124061d("Sync state delete failed; account=%s, channelId=%s", e, a.f397300d, a.f397299c);
                    } else {
                        mVar.mo124060c("Sync state delete failed", new Object[0]);
                    }
                }
            }
        }
    }

    public final void close() {
        synchronized (this.f397318i) {
            for (Map.Entry value : this.f397319j.entrySet()) {
                ((C147159s) value.getValue()).close();
            }
            this.f397319j.clear();
        }
    }

    /* renamed from: d */
    public final void mo123968d(String str, C64098p pVar, Account account) {
        Integer num;
        synchronized (this.f397318i) {
            C147159s a = mo123988a(new C146772b(account, pVar));
            C147112i a2 = a.mo123977a(str);
            if (a2 == null) {
                ((C146822a) a.f397306j.f397314e.mo27525b()).mo123718d(10014, C147176j.m240000a(a.f397299c));
                num = Integer.valueOf((int) a.f397306j.f397324o.mo124071b());
            } else {
                C64054dj g = a2.mo123929g();
                num = C147137al.m239934a(g, g.f173191c, ((C146790c) a.f397306j.f397313d.get(C64097o.m96355a(a.f397299c.f173294a))).mo123634a(a.f397299c, a.f397300d), Integer.valueOf((int) a.f397306j.f397324o.mo124071b()));
            }
            if (num != null) {
                m239973j();
                long max = Math.max(((long) num.intValue()) * 1000, C147266a.m240145p());
                if (C147266a.m240139j()) {
                    a.mo123979c(C60192dc.SYNC_TRIGGER_READ);
                }
                a.mo123987k(max);
            }
        }
    }

    /* renamed from: e */
    public final boolean mo123969e(C64098p pVar, Account account) {
        boolean g;
        synchronized (this.f397318i) {
            C147159s a = mo123988a(new C146772b(account, pVar));
            g = C147131af.m239910g(a.f397301e, a.f397302f);
        }
        return g;
    }

    /* renamed from: f */
    public final boolean mo123991f(long j) {
        if (!this.f397320k) {
            return false;
        }
        return j - this.f397321l > ((Long) new C97246b(this.f397324o.f397503b).mo6453a()).longValue() * 1000;
    }

    /* renamed from: g */
    public final boolean mo123992g(long j, long j2) {
        return this.f397320k && this.f397321l - j <= j2 && !mo123991f(j);
    }

    /* renamed from: h */
    public final void mo123970h(C64098p pVar, Account account) {
        Integer num;
        synchronized (this.f397318i) {
            C147159s a = mo123988a(new C146772b(account, pVar));
            C147112i a2 = a.mo123977a(BuildConfig.FLAVOR);
            if (a2 == null) {
                ((C146822a) a.f397306j.f397314e.mo27525b()).mo123718d(10015, C147176j.m240000a(a.f397299c));
                num = Integer.valueOf((int) a.f397306j.f397324o.mo124072c());
            } else {
                C64054dj g = a2.mo123929g();
                num = C147137al.m239934a(g, g.f173192d, ((C146790c) a.f397306j.f397313d.get(C64097o.m96355a(a.f397299c.f173294a))).mo123634a(a.f397299c, a.f397300d), Integer.valueOf((int) a.f397306j.f397324o.mo124072c()));
            }
            if (num != null) {
                int j = m239973j();
                long intValue = ((long) num.intValue()) * 1000;
                double d = (double) intValue;
                double doubleValue = ((Double) new C58885cv(Double.valueOf(0.9d)).f156729a).doubleValue();
                Double.isNaN(d);
                long j2 = (long) (d * doubleValue);
                long max = Math.max(intValue, 1000 + j2);
                if (C147266a.m240139j()) {
                    a.mo123979c(C60192dc.SYNC_TRIGGER_WRITE);
                }
                boolean booleanValue = ((Boolean) new C58885cv(true).f156729a).booleanValue();
                if (a.f397307k != 4) {
                    C147131af afVar = a.f397301e;
                    C147130ae c = afVar.mo123953c();
                    c.mo123950e(afVar.mo123952b() + 1);
                    a.f397301e = c.mo123946a();
                    try {
                        a.f397297a.mo123965i(a.f397301e);
                    } catch (C147075at e) {
                        ((C147256m) a.f397306j.f397310a.mo27525b()).mo124063f("Storing channel state failed", e, new Object[0]);
                    }
                }
                a.mo123986j(booleanValue, j2, max, j);
            }
        }
    }

    /* renamed from: i */
    public final void mo123993i(long j) {
        C97263s sVar;
        C118522by byVar;
        this.f397320k = true;
        this.f397321l = j;
        if (!((Boolean) new C58885cv(false).f156729a).booleanValue()) {
            C147306a aVar = this.f397323n;
            if (((Boolean) aVar.f397594a.mo47371a()).booleanValue() && (byVar = sVar.f271672a) != null) {
                (sVar = aVar.f397595b).f271673b.f271674a.mo103752c(byVar);
                C118561t tVar = sVar.f271673b.f271674a;
                C118522by byVar2 = sVar.f271672a;
                C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
                afVar.copyOnWrite();
                C118472ag agVar = (C118472ag) afVar.instance;
                agVar.f328824d = 1;
                agVar.f328821a |= 4;
                long a = sVar.f271673b.f271675b.mo79743a(C89963ab.f246488e);
                afVar.copyOnWrite();
                C118472ag agVar2 = (C118472ag) afVar.instance;
                agVar2.f328821a |= 2;
                agVar2.f328823c = a;
                tVar.mo103754e(byVar2, (C118472ag) afVar.build());
                return;
            }
            return;
        }
        this.f397325p.mo123625a(new C147152l(this));
    }
}
