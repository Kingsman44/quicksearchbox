package com.google.android.libraries.notifications.p2268e.p2287j.p2288a;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.app.C1793aj;
import androidx.core.app.C1800aq;
import androidx.core.app.C1839z;
import com.google.android.libraries.notifications.C30007h;
import com.google.android.libraries.notifications.data.C29793g;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.android.libraries.notifications.data.impl.C29810o;
import com.google.android.libraries.notifications.p2268e.p2271b.C29834a;
import com.google.android.libraries.notifications.p2268e.p2271b.C29839c;
import com.google.android.libraries.notifications.p2268e.p2271b.p2272a.C29835a;
import com.google.android.libraries.notifications.p2268e.p2287j.C29956g;
import com.google.android.libraries.notifications.p2268e.p2287j.C29957h;
import com.google.android.libraries.notifications.p2268e.p2287j.C29959j;
import com.google.android.libraries.notifications.p2289f.C29991b;
import com.google.android.libraries.notifications.p2292g.C30004l;
import com.google.android.libraries.notifications.p2293h.C30013f;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.notifications.platform.p2309c.C30071a;
import com.google.android.libraries.notifications.platform.p2309c.C30075e;
import com.google.android.libraries.notifications.platform.p2309c.C30076f;
import com.google.android.libraries.notifications.platform.p2318f.p2331f.p2334b.C30140a;
import com.google.android.libraries.p11027an.p11028a.C147767c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.p4160bf.p4161a.p4163b.C55489bz;
import com.google.p4160bf.p4164b.p4165a.C55661cq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p5304e.p5305a.p5306a.p5383k.p5384a.C68798g;

/* renamed from: com.google.android.libraries.notifications.e.j.a.k */
/* compiled from: PG */
public final class C29948k implements C29959j {

    /* renamed from: a */
    private final Context f81095a;

    /* renamed from: b */
    private final C58833ax f81096b;

    /* renamed from: c */
    private final C58833ax f81097c;

    /* renamed from: d */
    private final C29957h f81098d;

    /* renamed from: e */
    private final C29956g f81099e;

    /* renamed from: f */
    private final C29945h f81100f;

    /* renamed from: g */
    private final C30076f f81101g;

    /* renamed from: h */
    private final Map f81102h;

    /* renamed from: i */
    private final C21370a f81103i;

    /* renamed from: j */
    private final C29810o f81104j;

    /* renamed from: k */
    private final C29835a f81105k;

    public C29948k(Context context, C58833ax axVar, C58833ax axVar2, C29957h hVar, C29810o oVar, C29956g gVar, C29945h hVar2, C29835a aVar, C30075e eVar, Map map, C21370a aVar2) {
        this.f81095a = context;
        this.f81096b = axVar;
        this.f81097c = axVar2;
        this.f81098d = hVar;
        this.f81104j = oVar;
        this.f81099e = gVar;
        this.f81100f = hVar2;
        this.f81105k = aVar;
        this.f81101g = ((C30071a) eVar).f81358d;
        this.f81102h = map;
        this.f81103i = aVar2;
    }

    /* renamed from: e */
    private static synchronized void m55495e(Context context, String str, Notification notification) {
        synchronized (C29948k.class) {
            new C1800aq(context).mo5003b(str, 0, notification);
            C30058b.m55794f("SystemTrayManagerImpl", "Added to tray: tag = %s", str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0201, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m55496f(com.google.android.libraries.notifications.data.C29820k r22, com.google.android.libraries.notifications.data.C29827r r23, java.lang.String r24, androidx.core.app.C1839z r25, boolean r26, boolean r27, com.google.android.libraries.notifications.p2292g.C30004l r28, com.google.android.libraries.notifications.p2268e.p2271b.C29839c r29) {
        /*
            r21 = this;
            r7 = r21
            r0 = r22
            r8 = r23
            r9 = r25
            r10 = r29
            monitor-enter(r21)
            android.content.Context r1 = r7.f81095a     // Catch:{ all -> 0x0218 }
            java.lang.Class<android.app.NotificationManager> r2 = android.app.NotificationManager.class
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ all -> 0x0218 }
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1     // Catch:{ all -> 0x0218 }
            android.service.notification.StatusBarNotification[] r1 = r1.getActiveNotifications()     // Catch:{ all -> 0x0218 }
            int r1 = r1.length     // Catch:{ all -> 0x0218 }
            r2 = 24
            if (r1 >= r2) goto L_0x0202
            if (r0 == 0) goto L_0x0026
            java.lang.String r1 = r22.mo35009h()     // Catch:{ all -> 0x0218 }
            r12 = r1
            goto L_0x0027
        L_0x0026:
            r12 = 0
        L_0x0027:
            com.google.android.libraries.notifications.data.impl.o r1 = r7.f81104j     // Catch:{ all -> 0x0218 }
            e.a.a.k.a.x r2 = p5304e.p5305a.p5306a.p5383k.p5384a.C68815x.f184891a     // Catch:{ all -> 0x0218 }
            e.a.a.k.a.y r2 = r2.mo6453a()     // Catch:{ all -> 0x0218 }
            boolean r2 = r2.mo60500c()     // Catch:{ all -> 0x0218 }
            r13 = 0
            if (r2 == 0) goto L_0x003a
            if (r26 == 0) goto L_0x003a
            r2 = 1
            goto L_0x003b
        L_0x003a:
            r2 = 0
        L_0x003b:
            com.google.android.libraries.notifications.data.impl.n r1 = r1.f80828a     // Catch:{ all -> 0x0218 }
            android.util.Pair r14 = r1.mo35108c(r0, r8, r2)     // Catch:{ all -> 0x0218 }
            java.lang.Object r1 = r14.first     // Catch:{ all -> 0x0218 }
            r6 = r1
            com.google.android.libraries.notifications.data.t r6 = (com.google.android.libraries.notifications.data.C29829t) r6     // Catch:{ all -> 0x0218 }
            if (r26 != 0) goto L_0x006b
            com.google.android.libraries.notifications.data.t r1 = com.google.android.libraries.notifications.data.C29829t.INSERTED     // Catch:{ all -> 0x0218 }
            if (r6 == r1) goto L_0x006b
            com.google.android.libraries.notifications.data.t r1 = com.google.android.libraries.notifications.data.C29829t.REPLACED     // Catch:{ all -> 0x0218 }
            if (r6 != r1) goto L_0x0051
            goto L_0x006b
        L_0x0051:
            com.google.android.libraries.notifications.data.t r1 = com.google.android.libraries.notifications.data.C29829t.REJECTED_SAME_VERSION     // Catch:{ all -> 0x0218 }
            if (r6 != r1) goto L_0x0200
            com.google.android.libraries.notifications.e.b.a.a r1 = r7.f81105k     // Catch:{ all -> 0x0218 }
            r2 = 42
            com.google.android.libraries.notifications.e.b.a r1 = r1.mo35160b(r2)     // Catch:{ all -> 0x0218 }
            r1.mo35145j(r0)     // Catch:{ all -> 0x0218 }
            r1.mo35139d(r8)     // Catch:{ all -> 0x0218 }
            r1.mo35151p(r10)     // Catch:{ all -> 0x0218 }
            r1.mo35136a()     // Catch:{ all -> 0x0218 }
            monitor-exit(r21)
            return
        L_0x006b:
            java.lang.String r1 = r23.mo35062i()     // Catch:{ all -> 0x0218 }
            java.lang.String r5 = com.google.android.libraries.notifications.p2268e.p2287j.p2288a.C29949l.m55506c(r12, r1)     // Catch:{ all -> 0x0218 }
            if (r27 != 0) goto L_0x0077
            com.google.android.libraries.notifications.data.t r1 = com.google.android.libraries.notifications.data.C29829t.INSERTED     // Catch:{ all -> 0x0218 }
        L_0x0077:
            java.lang.String r3 = r23.mo35062i()     // Catch:{ all -> 0x0218 }
            r1 = r21
            r2 = r5
            r4 = r22
            r11 = r5
            r5 = r23
            r15 = r6
            r6 = r28
            boolean r1 = r1.m55499i(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0218 }
            if (r1 == 0) goto L_0x0090
            r9.f5700t = r13     // Catch:{ all -> 0x0218 }
            r9.f5699s = r11     // Catch:{ all -> 0x0218 }
        L_0x0090:
            e.a.a.o.a.p r1 = p5304e.p5305a.p5306a.p5409o.p5410a.C68952p.f185242a     // Catch:{ all -> 0x0218 }
            e.a.a.o.a.q r1 = r1.mo6453a()     // Catch:{ all -> 0x0218 }
            boolean r1 = r1.mo60812c()     // Catch:{ all -> 0x0218 }
            if (r1 == 0) goto L_0x00cb
            java.lang.Object r1 = r14.second     // Catch:{ all -> 0x0218 }
            com.google.common.base.ax r1 = (com.google.common.base.C58833ax) r1     // Catch:{ all -> 0x0218 }
            java.lang.Object r1 = r1.mo56111f()     // Catch:{ all -> 0x0218 }
            com.google.android.libraries.notifications.data.r r1 = (com.google.android.libraries.notifications.data.C29827r) r1     // Catch:{ all -> 0x0218 }
            com.google.android.libraries.notifications.data.t r2 = com.google.android.libraries.notifications.data.C29829t.REPLACED     // Catch:{ all -> 0x0218 }
            if (r15 != r2) goto L_0x00cb
            if (r1 == 0) goto L_0x00cb
            java.lang.String r2 = r23.mo35062i()     // Catch:{ all -> 0x0218 }
            java.lang.String r3 = r1.mo35062i()     // Catch:{ all -> 0x0218 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0218 }
            if (r2 != 0) goto L_0x00cb
            java.lang.String r3 = r1.mo35062i()     // Catch:{ all -> 0x0218 }
            java.lang.String r2 = com.google.android.libraries.notifications.p2268e.p2287j.p2288a.C29949l.m55506c(r12, r3)     // Catch:{ all -> 0x0218 }
            r5 = 0
            r6 = 0
            r1 = r21
            r4 = r22
            r1.m55499i(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0218 }
        L_0x00cb:
            android.app.Notification r1 = r25.mo5013a()     // Catch:{ all -> 0x0218 }
            android.content.Context r2 = r7.f81095a     // Catch:{ all -> 0x0218 }
            r3 = r24
            m55495e(r2, r3, r1)     // Catch:{ all -> 0x0218 }
            com.google.android.libraries.notifications.e.b.a.a r2 = r7.f81105k     // Catch:{ all -> 0x0218 }
            r4 = 3
            r5 = 2
            if (r26 == 0) goto L_0x00df
            com.google.bf.a.b.bz r6 = com.google.p4160bf.p4161a.p4163b.C55489bz.SHOWN_FORCED     // Catch:{ all -> 0x0218 }
            goto L_0x00f9
        L_0x00df:
            com.google.android.libraries.notifications.data.t r6 = com.google.android.libraries.notifications.data.C29829t.INSERTED     // Catch:{ all -> 0x0218 }
            int r6 = r15.ordinal()     // Catch:{ all -> 0x0218 }
            if (r6 == 0) goto L_0x00f7
            r9 = 1
            if (r6 == r9) goto L_0x00f4
            if (r6 == r5) goto L_0x00f1
            if (r6 == r4) goto L_0x00f1
            com.google.bf.a.b.bz r6 = com.google.p4160bf.p4161a.p4163b.C55489bz.SHOWN     // Catch:{ all -> 0x0218 }
            goto L_0x00f9
        L_0x00f1:
            com.google.bf.a.b.bz r6 = com.google.p4160bf.p4161a.p4163b.C55489bz.SHOWN_FORCED     // Catch:{ all -> 0x0218 }
            goto L_0x00f9
        L_0x00f4:
            com.google.bf.a.b.bz r6 = com.google.p4160bf.p4161a.p4163b.C55489bz.SHOWN_REPLACED     // Catch:{ all -> 0x0218 }
            goto L_0x00f9
        L_0x00f7:
            com.google.bf.a.b.bz r6 = com.google.p4160bf.p4161a.p4163b.C55489bz.SHOWN     // Catch:{ all -> 0x0218 }
        L_0x00f9:
            com.google.android.libraries.notifications.e.b.a r2 = r2.mo35159a(r6)     // Catch:{ all -> 0x0218 }
            r2.mo35145j(r0)     // Catch:{ all -> 0x0218 }
            r2.mo35139d(r8)     // Catch:{ all -> 0x0218 }
            r2.mo35157v()     // Catch:{ all -> 0x0218 }
            r2.mo35151p(r10)     // Catch:{ all -> 0x0218 }
            java.util.List r6 = r23.mo35066m()     // Catch:{ all -> 0x0218 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0218 }
        L_0x0111:
            boolean r9 = r6.hasNext()     // Catch:{ all -> 0x0218 }
            if (r9 == 0) goto L_0x0143
            java.lang.Object r9 = r6.next()     // Catch:{ all -> 0x0218 }
            com.google.android.libraries.notifications.data.o r9 = (com.google.android.libraries.notifications.data.C29824o) r9     // Catch:{ all -> 0x0218 }
            java.lang.String r10 = r9.mo35026f()     // Catch:{ all -> 0x0218 }
            boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x0218 }
            if (r10 != 0) goto L_0x012f
            java.lang.String r9 = r9.mo35026f()     // Catch:{ all -> 0x0218 }
            r2.mo35149n(r9)     // Catch:{ all -> 0x0218 }
            goto L_0x0111
        L_0x012f:
            com.google.android.libraries.notifications.data.t r10 = com.google.android.libraries.notifications.data.C29829t.INSERTED     // Catch:{ all -> 0x0218 }
            int r9 = r9.mo35032k()     // Catch:{ all -> 0x0218 }
            int r10 = r9 + -1
            if (r9 == 0) goto L_0x0141
            r9 = 1
            if (r10 == r9) goto L_0x013d
            goto L_0x0111
        L_0x013d:
            r2.mo35158w()     // Catch:{ all -> 0x0218 }
            goto L_0x0111
        L_0x0141:
            r0 = 0
            throw r0     // Catch:{ all -> 0x0218 }
        L_0x0143:
            android.os.Bundle r6 = r1.extras     // Catch:{ all -> 0x0218 }
            java.lang.String r9 = "chime.extensionView"
            int r9 = r6.getInt(r9)     // Catch:{ all -> 0x0218 }
            int r9 = com.google.p4160bf.p4161a.p4163b.C55487bx.m87697a(r9)     // Catch:{ all -> 0x0218 }
            r2.mo35153r(r9)     // Catch:{ all -> 0x0218 }
            int r9 = com.google.android.libraries.notifications.p2268e.p2271b.C29838b.m55234a(r6)     // Catch:{ all -> 0x0218 }
            r10 = 1
            if (r9 != r10) goto L_0x015a
            goto L_0x015e
        L_0x015a:
            int r4 = com.google.android.libraries.notifications.p2268e.p2271b.C29838b.m55234a(r6)     // Catch:{ all -> 0x0218 }
        L_0x015e:
            r2.mo35155t(r4)     // Catch:{ all -> 0x0218 }
            r2.mo35136a()     // Catch:{ all -> 0x0218 }
            com.google.common.base.ax r2 = r7.f81097c     // Catch:{ all -> 0x0218 }
            com.google.common.base.bk r2 = (com.google.common.base.C58847bk) r2     // Catch:{ all -> 0x0218 }
            java.lang.Object r2 = r2.f156646a     // Catch:{ all -> 0x0218 }
            com.google.android.libraries.notifications.h.g r2 = (com.google.android.libraries.notifications.p2293h.C30014g) r2     // Catch:{ all -> 0x0218 }
            r4 = 1
            com.google.android.libraries.notifications.data.r[] r6 = new com.google.android.libraries.notifications.data.C29827r[r4]     // Catch:{ all -> 0x0218 }
            r6[r13] = r8     // Catch:{ all -> 0x0218 }
            java.util.List r4 = java.util.Arrays.asList(r6)     // Catch:{ all -> 0x0218 }
            r2.mo35339f(r4, r1)     // Catch:{ all -> 0x0218 }
            java.lang.Long r1 = r23.mo35056e()     // Catch:{ all -> 0x0218 }
            long r1 = r1.longValue()     // Catch:{ all -> 0x0218 }
            r9 = 0
            int r4 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x0200
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0218 }
            java.lang.Long r2 = r23.mo35056e()     // Catch:{ all -> 0x0218 }
            long r9 = r2.longValue()     // Catch:{ all -> 0x0218 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0218 }
            long r1 = r1.convert(r9, r2)     // Catch:{ all -> 0x0218 }
            android.content.Context r4 = r7.f81095a     // Catch:{ all -> 0x0218 }
            java.lang.String r6 = "alarm"
            java.lang.Object r4 = r4.getSystemService(r6)     // Catch:{ all -> 0x0218 }
            android.app.AlarmManager r4 = (android.app.AlarmManager) r4     // Catch:{ all -> 0x0218 }
            com.google.android.libraries.notifications.e.j.a.h r6 = r7.f81100f     // Catch:{ all -> 0x0218 }
            com.google.common.base.ax r9 = r6.f81088a     // Catch:{ all -> 0x0218 }
            com.google.common.base.bk r9 = (com.google.common.base.C58847bk) r9     // Catch:{ all -> 0x0218 }
            java.lang.Object r9 = r9.f156646a     // Catch:{ all -> 0x0218 }
            com.google.android.libraries.notifications.h.e r9 = (com.google.android.libraries.notifications.p2293h.C30012e) r9     // Catch:{ all -> 0x0218 }
            com.google.android.libraries.notifications.e.j.a.g r12 = com.google.android.libraries.notifications.p2268e.p2287j.p2288a.C29944g.BROADCAST     // Catch:{ all -> 0x0218 }
            r15 = 1
            com.google.android.libraries.notifications.data.r[] r10 = new com.google.android.libraries.notifications.data.C29827r[r15]     // Catch:{ all -> 0x0218 }
            r10[r13] = r8     // Catch:{ all -> 0x0218 }
            java.util.List r14 = java.util.Arrays.asList(r10)     // Catch:{ all -> 0x0218 }
            com.google.bf.b.a.a.bq r8 = com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq.f146602f     // Catch:{ all -> 0x0218 }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x0218 }
            com.google.bf.b.a.a.bp r8 = (com.google.p4160bf.p4164b.p4165a.p4166a.C55563bp) r8     // Catch:{ all -> 0x0218 }
            r8.copyOnWrite()     // Catch:{ all -> 0x0218 }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ all -> 0x0218 }
            com.google.bf.b.a.a.bq r10 = (com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq) r10     // Catch:{ all -> 0x0218 }
            r10.f146608e = r5     // Catch:{ all -> 0x0218 }
            int r11 = r10.f146604a     // Catch:{ all -> 0x0218 }
            r11 = r11 | 8
            r10.f146604a = r11     // Catch:{ all -> 0x0218 }
            r8.copyOnWrite()     // Catch:{ all -> 0x0218 }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ all -> 0x0218 }
            com.google.bf.b.a.a.bq r10 = (com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq) r10     // Catch:{ all -> 0x0218 }
            r10.f146607d = r5     // Catch:{ all -> 0x0218 }
            int r5 = r10.f146604a     // Catch:{ all -> 0x0218 }
            r5 = r5 | 4
            r10.f146604a = r5     // Catch:{ all -> 0x0218 }
            r10 = 1
            java.lang.String r11 = "com.google.android.libraries.notifications.NOTIFICATION_EXPIRED"
            com.google.protobuf.bv r5 = r8.build()     // Catch:{ all -> 0x0218 }
            com.google.bf.b.a.a.bq r5 = (com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq) r5     // Catch:{ all -> 0x0218 }
            r16 = 0
            r17 = 0
            r18 = 10
            r19 = 0
            android.os.Bundle r20 = r9.mo35329c()     // Catch:{ all -> 0x0218 }
            r8 = r6
            r9 = r24
            r13 = r22
            r0 = 1
            r15 = r5
            android.app.PendingIntent r3 = r8.mo35243e(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0218 }
            r4.set(r0, r1, r3)     // Catch:{ all -> 0x0218 }
            monitor-exit(r21)
            return
        L_0x0200:
            monitor-exit(r21)
            return
        L_0x0202:
            com.google.android.libraries.notifications.e.b.a.a r1 = r7.f81105k     // Catch:{ all -> 0x0218 }
            r2 = 43
            com.google.android.libraries.notifications.e.b.a r1 = r1.mo35160b(r2)     // Catch:{ all -> 0x0218 }
            r1.mo35145j(r0)     // Catch:{ all -> 0x0218 }
            r1.mo35139d(r8)     // Catch:{ all -> 0x0218 }
            r1.mo35151p(r10)     // Catch:{ all -> 0x0218 }
            r1.mo35136a()     // Catch:{ all -> 0x0218 }
            monitor-exit(r21)
            return
        L_0x0218:
            r0 = move-exception
            monitor-exit(r21)
            goto L_0x021c
        L_0x021b:
            throw r0
        L_0x021c:
            goto L_0x021b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.p2268e.p2287j.p2288a.C29948k.m55496f(com.google.android.libraries.notifications.data.k, com.google.android.libraries.notifications.data.r, java.lang.String, androidx.core.app.z, boolean, boolean, com.google.android.libraries.notifications.g.l, com.google.android.libraries.notifications.e.b.c):void");
    }

    /* renamed from: g */
    private static synchronized void m55497g(Context context, String str) {
        synchronized (C29948k.class) {
            new C1800aq(context).f5622a.cancel(str, 0);
            C30058b.m55794f("SystemTrayManagerImpl", "Removed from tray: tag = %s", str);
        }
    }

    /* renamed from: h */
    private final synchronized void m55498h(C29820k kVar, List list, List list2, C29839c cVar, int i) {
        if (list.isEmpty()) {
            C30058b.m55794f("SystemTrayManagerImpl", "Remove notifications skipped due to empty thread list.", new Object[0]);
            return;
        }
        String h = kVar != null ? kVar.mo35009h() : null;
        String[] strArr = (String[]) list.toArray(new String[0]);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m55497g(this.f81095a, C29949l.m55505b(h, (String) it.next()));
        }
        this.f81104j.mo35114d(kVar, strArr);
        HashSet hashSet = new HashSet();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            String i2 = ((C29827r) it2.next()).mo35062i();
            if (hashSet.add(i2)) {
                m55499i(C29949l.m55506c(h, i2), i2, kVar, (C29827r) null, (C30004l) null);
            }
        }
        if (!list2.isEmpty() && C68798g.m99323c() && i != 0) {
            C29834a a = this.f81105k.mo35159a(C55489bz.REMOVED);
            a.mo35145j(kVar);
            a.mo35140e(list2);
            a.mo35157v();
            a.mo35151p(cVar);
            a.mo35154s(i);
            a.mo35136a();
        }
        C30058b.m55794f("SystemTrayManagerImpl", "Remove notifications completed.", new Object[0]);
    }

    /* renamed from: i */
    private final boolean m55499i(String str, String str2, C29820k kVar, C29827r rVar, C30004l lVar) {
        boolean z;
        String str3 = str;
        String str4 = str2;
        C29820k kVar2 = kVar;
        boolean equals = "chime_default_group".equals(str4);
        C58485gu b = this.f81104j.mo35112b(kVar2, str4);
        C58480gp e = C58485gu.m89837e();
        ArrayList arrayList = new ArrayList();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            C29827r rVar2 = (C29827r) b.get(i);
            if (rVar == null || !rVar.mo35063j().equals(rVar2.mo35063j())) {
                String h = kVar2 != null ? kVar.mo35009h() : null;
                NotificationManager notificationManager = (NotificationManager) this.f81095a.getSystemService(NotificationManager.class);
                if (notificationManager != null) {
                    StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
                    int length = activeNotifications.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        StatusBarNotification statusBarNotification = activeNotifications[i2];
                        if (statusBarNotification.getId() == 0 && C29949l.m55505b(h, rVar2.mo35063j()).equals(statusBarNotification.getTag())) {
                            break;
                        }
                        i2++;
                    }
                }
                arrayList.add(rVar2.mo35063j());
            }
            e.mo55395g(rVar2);
        }
        if (!arrayList.isEmpty()) {
            z = false;
            this.f81104j.mo35114d(kVar2, (String[]) arrayList.toArray(new String[0]));
        } else {
            z = false;
        }
        C58485gu f = e.mo55394f();
        if (f.isEmpty()) {
            m55497g(this.f81095a, str3);
            return z;
        }
        if (equals && ((C58724pq) f).f156474d < this.f81101g.mo35440a()) {
            StatusBarNotification[] activeNotifications2 = ((NotificationManager) this.f81095a.getSystemService("notification")).getActiveNotifications();
            int length2 = activeNotifications2.length;
            int i3 = 0;
            while (i3 < length2) {
                StatusBarNotification statusBarNotification2 = activeNotifications2[i3];
                if (!str3.equals(statusBarNotification2.getTag()) || statusBarNotification2.getId() != 0) {
                    i3++;
                }
            }
            C30058b.m55794f("SystemTrayManagerImpl", "Skipped creating default summary.", new Object[0]);
            return true;
        }
        C1839z b2 = this.f81098d.mo35245b(str3, kVar2, f, lVar);
        ((C30013f) ((C58847bk) this.f81096b).f156646a).mo35333c(f, b2);
        b2.f5700t = true;
        b2.f5699s = str3;
        m55495e(this.f81095a, str3, b2.mo5013a());
        return true;
    }

    /* renamed from: a */
    public final void mo35246a(C29820k kVar, C29827r rVar, boolean z, boolean z2, C30007h hVar, C30004l lVar, C29839c cVar) {
        C29820k kVar2 = kVar;
        C29827r rVar2 = rVar;
        C29839c cVar2 = cVar;
        C30058b.m55794f("SystemTrayManagerImpl", "Updating notification", new Object[0]);
        C58838bb.m90866a(this.f81101g, "SystemTrayNotificationConfig must be set in ChimeConfig for showing system tray notifications.");
        if (!this.f81101g.mo35453l() || kVar2 == null || kVar.mo35003c().longValue() < rVar.mo35060h().longValue()) {
            if (!z) {
                C58485gu c = this.f81104j.mo35113c(kVar2, rVar.mo35063j());
                if (!c.isEmpty() && ((C29827r) c.get(0)).mo35060h().longValue() >= rVar.mo35060h().longValue()) {
                    C29834a b = this.f81105k.mo35160b(42);
                    b.mo35145j(kVar2);
                    b.mo35139d(rVar2);
                    b.mo35151p(cVar2);
                    b.mo35136a();
                    C30058b.m55794f("SystemTrayManagerImpl", "Skipping thread [%s]. Already in system tray.", rVar.mo35063j());
                    return;
                }
            }
            if (C30140a.m55989b(this.f81095a)) {
                String a = this.f81099e.mo35234a(rVar2);
                if (TextUtils.isEmpty(a)) {
                    C29834a b2 = this.f81105k.mo35160b(35);
                    b2.mo35145j(kVar2);
                    b2.mo35139d(rVar2);
                    b2.mo35151p(cVar2);
                    b2.mo35136a();
                    C30058b.m55791c("SystemTrayManagerImpl", "Skipping thread [%s]. Channel not found error.", rVar.mo35063j());
                    return;
                } else if (!this.f81099e.mo35238e(a)) {
                    C29834a b3 = this.f81105k.mo35160b(36);
                    b3.mo35145j(kVar2);
                    b3.mo35138c(a);
                    b3.mo35139d(rVar2);
                    b3.mo35151p(cVar2);
                    b3.mo35136a();
                    C30058b.m55794f("SystemTrayManagerImpl", "Skipping thread [%s]. Can't post to channel.", rVar.mo35063j());
                    return;
                }
            }
            if (C1793aj.m4937b(new C1800aq(this.f81095a).f5622a)) {
                long c2 = this.f81103i.mo26871c();
                List b4 = ((C30013f) ((C58847bk) this.f81096b).f156646a).mo35332b(rVar2, rVar.mo35066m());
                if (b4 != null) {
                    C29793g t = rVar.mo35073t();
                    t.f80774l = b4;
                    rVar2 = t.mo35042a();
                }
                C29827r rVar3 = rVar2;
                if (cVar2 != null) {
                    cVar2.f80898f = Long.valueOf(this.f81103i.mo26871c() - c2);
                }
                String b5 = C29949l.m55505b(kVar2 != null ? kVar.mo35009h() : null, rVar3.mo35063j());
                long c3 = this.f81103i.mo26871c();
                Pair a2 = this.f81098d.mo35244a(b5, kVar, rVar3, z2, hVar, lVar);
                if (cVar2 != null) {
                    cVar2.f80899g = Long.valueOf(this.f81103i.mo26871c() - c3);
                }
                if (a2 == null) {
                    C30058b.m55794f("SystemTrayManagerImpl", "Skipping thread [%s]. No notification builder.", rVar3.mo35063j());
                    return;
                }
                C1839z zVar = (C1839z) a2.first;
                long c4 = this.f81103i.mo26871c();
                ((C30013f) ((C58847bk) this.f81096b).f156646a).mo35331a(kVar2, rVar3, zVar);
                if (cVar2 != null) {
                    cVar2.f80900h = Long.valueOf(this.f81103i.mo26871c() - c4);
                }
                C29827r rVar4 = rVar3;
                for (Integer intValue : C29991b.f81201a) {
                    int intValue2 = intValue.intValue();
                    Map map = this.f81102h;
                    Integer valueOf = Integer.valueOf(intValue2);
                    if (map.containsKey(valueOf)) {
                        C58833ax axVar = (C58833ax) a2.second;
                        if (((C29991b) this.f81102h.get(valueOf)).mo35304a()) {
                            C30058b.m55794f("SystemTrayManagerImpl", "Notification customized by customizer with int key: %d", valueOf);
                            rVar4 = ((C29991b) this.f81102h.get(valueOf)).mo35305b();
                        }
                    }
                }
                m55496f(kVar, rVar4, b5, zVar, z, z2, lVar, cVar);
                return;
            }
            C29834a b6 = this.f81105k.mo35160b(7);
            b6.mo35145j(kVar2);
            b6.mo35139d(rVar2);
            b6.mo35151p(cVar2);
            b6.mo35136a();
            C30058b.m55794f("SystemTrayManagerImpl", "Skipping thread [%s]. Notifications from this app are blocked.", rVar.mo35063j());
            return;
        }
        C29834a b7 = this.f81105k.mo35160b(52);
        b7.mo35145j(kVar2);
        b7.mo35139d(rVar2);
        b7.mo35151p(cVar2);
        b7.mo35136a();
        C30058b.m55794f("SystemTrayManagerImpl", "Skipping thread [%s]. Created before first registration.", rVar.mo35063j());
    }

    /* renamed from: b */
    public final synchronized List mo35247b(C29820k kVar, List list, C29839c cVar, int i) {
        C58485gu c;
        c = this.f81104j.mo35113c(kVar, (String[]) list.toArray(new String[0]));
        m55498h(kVar, list, c, cVar, i);
        return c;
    }

    /* renamed from: c */
    public final synchronized List mo35248c(C29820k kVar, int i) {
        String str;
        C58485gu a;
        if (kVar != null) {
            try {
                str = kVar.mo35009h();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            str = null;
        }
        a = this.f81104j.mo35111a(kVar);
        C29810o oVar = this.f81104j;
        C147767c cVar = new C147767c();
        cVar.f398712a.append("1");
        oVar.f80828a.mo35107b(kVar, C58485gu.m89846n(cVar.mo124445a()));
        HashSet<String> hashSet = new HashSet<>();
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            C29827r rVar = (C29827r) a.get(i2);
            hashSet.add(rVar.mo35062i());
            m55497g(this.f81095a, C29949l.m55505b(str, rVar.mo35063j()));
        }
        for (String c : hashSet) {
            m55497g(this.f81095a, C29949l.m55506c(str, c));
        }
        if (!a.isEmpty() && C68798g.m99323c()) {
            C29834a a2 = this.f81105k.mo35159a(C55489bz.REMOVED);
            a2.mo35145j(kVar);
            a2.mo35140e(a);
            a2.mo35157v();
            a2.mo35154s(i);
            a2.mo35136a();
        }
        return a;
    }

    /* renamed from: d */
    public final synchronized List mo35249d(C29820k kVar, List list, int i) {
        ArrayList arrayList;
        String[] strArr = new String[list.size()];
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = ((C55661cq) list.get(i2)).f146871b;
            strArr[i2] = str;
            hashMap.put(str, Long.valueOf(((C55661cq) list.get(i2)).f146872c));
        }
        C58485gu c = this.f81104j.mo35113c(kVar, strArr);
        ArrayList arrayList2 = new ArrayList();
        arrayList = new ArrayList();
        int size = c.size();
        for (int i3 = 0; i3 < size; i3++) {
            C29827r rVar = (C29827r) c.get(i3);
            String j = rVar.mo35063j();
            if (((Long) hashMap.get(j)).longValue() > rVar.mo35060h().longValue()) {
                arrayList2.add(j);
                arrayList.add(rVar);
            }
        }
        m55498h(kVar, arrayList2, arrayList, (C29839c) null, i);
        return arrayList;
    }
}
