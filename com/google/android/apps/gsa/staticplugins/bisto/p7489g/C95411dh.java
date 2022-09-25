package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import android.content.Context;
import android.os.PowerManager;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.dh */
/* compiled from: PG */
public final class C95411dh {

    /* renamed from: a */
    static final long f266944a = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: e */
    private static final C59071e f266945e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.g.dh");

    /* renamed from: b */
    public final C22871g f266946b;

    /* renamed from: c */
    public final AtomicReference f266947c = new AtomicReference();

    /* renamed from: d */
    public C60870cx f266948d;

    /* renamed from: f */
    private final C95415dl f266949f;

    /* renamed from: g */
    private PowerManager.WakeLock f266950g;

    /* renamed from: h */
    private final Context f266951h;

    public C95411dh(Context context, C22871g gVar, C95415dl dlVar) {
        this.f266951h = context;
        this.f266946b = gVar;
        this.f266949f = dlVar;
    }

    /* renamed from: b */
    private final void m157786b() {
        PowerManager.WakeLock wakeLock = this.f266950g;
        if (wakeLock != null && wakeLock.isHeld()) {
            try {
                C58976aa aaVar = C58975e.f156826a;
                this.f266950g.release();
            } catch (RuntimeException e) {
                if (this.f266950g.isHeld()) {
                    C59104x c = f266945e.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "SingleKeyGestureLis");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(15013)).mo56384n();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f8 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89351a(android.view.KeyEvent r12) {
        /*
            r11 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.util.concurrent.cx r0 = r11.f266948d
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r0.cancel(r1)
            r0 = 0
            r11.f266948d = r0
        L_0x000d:
            com.google.android.apps.gsa.staticplugins.bisto.g.dl r0 = r11.f266949f
            com.google.android.apps.gsa.staticplugins.bisto.g.dj r2 = r0.f266976e
            r3 = 1
            if (r12 != 0) goto L_0x001d
        L_0x0014:
            r0.mo89353b()
            com.google.android.apps.gsa.staticplugins.bisto.g.dj r12 = r0.mo89352a()
            goto L_0x00ea
        L_0x001d:
            int r4 = r12.getAction()
            r5 = 2
            if (r4 == r5) goto L_0x0014
            int r4 = r12.getRepeatCount()
            if (r4 <= 0) goto L_0x002b
            goto L_0x0014
        L_0x002b:
            int r4 = r12.getAction()
            if (r4 != 0) goto L_0x0033
            r4 = 1
            goto L_0x0034
        L_0x0033:
            r4 = 0
        L_0x0034:
            int r5 = r12.getAction()
            if (r5 != r3) goto L_0x003c
            r5 = 1
            goto L_0x003d
        L_0x003c:
            r5 = 0
        L_0x003d:
            java.lang.String r6 = "SingleKeyGestureRec"
            if (r4 != 0) goto L_0x005d
            if (r5 != 0) goto L_0x005d
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95415dl.f266972a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r4, r6)
            int r12 = r12.getAction()
            r4 = 15023(0x3aaf, float:2.1052E-41)
            java.lang.String r5 = "Received unknown key action: %d"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r4)).mo56387q(r5, r12)
            com.google.android.apps.gsa.staticplugins.bisto.g.dj r12 = r0.f266976e
            goto L_0x00ea
        L_0x005d:
            java.util.ArrayList r7 = r0.f266974c
            int r7 = r7.size()
            java.util.ArrayList r8 = r0.f266975d
            int r8 = r8.size()
            if (r7 <= r8) goto L_0x006c
            r1 = 1
        L_0x006c:
            com.google.android.libraries.f.a r7 = r0.f266973b
            long r7 = r7.mo26870b()
            com.google.android.libraries.f.a r9 = r0.f266973b
            long r9 = r9.mo26874f()
            long r7 = r7 - r9
            long r9 = r12.getEventTime()
            long r7 = r7 + r9
            if (r4 == 0) goto L_0x009a
            if (r1 == 0) goto L_0x009a
            com.google.common.f.e r12 = com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95415dl.f266972a
            com.google.common.f.x r12 = r12.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r1, r6)
            java.lang.String r1 = "Received multiple key-down's without intervening key-up."
            r4 = 15022(0x3aae, float:2.105E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r4)).mo56386p(r1)
        L_0x0094:
            r0.mo89354c()
            com.google.android.apps.gsa.staticplugins.bisto.g.dj r12 = r0.f266976e
            goto L_0x00ea
        L_0x009a:
            if (r5 == 0) goto L_0x00b1
            if (r1 != 0) goto L_0x00b1
            com.google.common.f.e r12 = com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95415dl.f266972a
            com.google.common.f.x r12 = r12.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r1, r6)
            java.lang.String r1 = "Received key-up without corresponding key-down."
            r4 = 15021(0x3aad, float:2.1049E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r4)).mo56386p(r1)
            goto L_0x0094
        L_0x00b1:
            com.google.common.f.e r12 = com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95415dl.f266972a
            com.google.common.f.x r12 = r12.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r1, r6)
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            r1 = 15020(0x3aac, float:2.1048E-41)
            com.google.common.f.x r12 = r12.mo56372aa(r1)
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            if (r3 == r4) goto L_0x00cb
            java.lang.String r1 = "UP"
            goto L_0x00cd
        L_0x00cb:
            java.lang.String r1 = "DOWN"
        L_0x00cd:
            java.lang.String r5 = "Handling ACTION_%s at %d,"
            r12.mo56353F(r5, r1, r7)
            if (r4 == 0) goto L_0x00df
            java.util.ArrayList r12 = r0.f266974c
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r12.add(r1)
            goto L_0x0014
        L_0x00df:
            java.util.ArrayList r12 = r0.f266975d
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r12.add(r1)
            goto L_0x0014
        L_0x00ea:
            java.util.concurrent.atomic.AtomicReference r0 = r11.f266947c
            java.lang.Object r0 = r0.get()
            com.google.android.apps.gsa.staticplugins.bisto.g.dg r0 = (com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95410dg) r0
            if (r0 != 0) goto L_0x00f8
            r11.m157786b()
            return
        L_0x00f8:
            if (r2 == r12) goto L_0x0130
            com.google.android.apps.gsa.staticplugins.bisto.g.dj r1 = com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95413dj.EMPTY
            if (r12 == r1) goto L_0x0130
            com.google.android.apps.gsa.staticplugins.bisto.g.dj r1 = com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95413dj.LONG_PRESS
            if (r12 != r1) goto L_0x010a
            com.google.android.apps.gsa.staticplugins.bisto.g.dj r1 = com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95413dj.INCOMPLETE_LONG_PRESS
            if (r2 == r1) goto L_0x010a
            r0.mo89350a(r1)
            goto L_0x012d
        L_0x010a:
            com.google.android.apps.gsa.staticplugins.bisto.g.dj r1 = com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95413dj.LONGER_PRESS
            if (r12 != r1) goto L_0x0116
            com.google.android.apps.gsa.staticplugins.bisto.g.dj r1 = com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95413dj.INCOMPLETE_LONGER_PRESS
            if (r2 == r1) goto L_0x0116
            r0.mo89350a(r1)
            goto L_0x012d
        L_0x0116:
            com.google.android.apps.gsa.staticplugins.bisto.g.dj r1 = com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95413dj.SINGLE_TAP
            if (r12 != r1) goto L_0x0122
            com.google.android.apps.gsa.staticplugins.bisto.g.dj r1 = com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95413dj.INCOMPLETE_SINGLE_TAP
            if (r2 == r1) goto L_0x0122
            r0.mo89350a(r1)
            goto L_0x012d
        L_0x0122:
            com.google.android.apps.gsa.staticplugins.bisto.g.dj r1 = com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95413dj.DOUBLE_TAP
            if (r12 != r1) goto L_0x012d
            com.google.android.apps.gsa.staticplugins.bisto.g.dj r1 = com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95413dj.INCOMPLETE_DOUBLE_TAP
            if (r2 == r1) goto L_0x012d
            r0.mo89350a(r1)
        L_0x012d:
            r0.mo89350a(r12)
        L_0x0130:
            com.google.android.apps.gsa.staticplugins.bisto.g.dl r12 = r11.f266949f
            com.google.android.apps.gsa.staticplugins.bisto.g.dj r12 = r12.f266976e
            com.google.android.apps.gsa.staticplugins.bisto.g.dj r0 = com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95413dj.EMPTY
            if (r12 == r0) goto L_0x0184
            android.os.PowerManager$WakeLock r12 = r11.f266950g
            if (r12 != 0) goto L_0x0150
            android.content.Context r12 = r11.f266951h
            java.lang.String r0 = "power"
            java.lang.Object r12 = r12.getSystemService(r0)
            android.os.PowerManager r12 = (android.os.PowerManager) r12
            if (r12 == 0) goto L_0x0150
            java.lang.String r0 = "agsa:bisto-gesture"
            android.os.PowerManager$WakeLock r12 = r12.newWakeLock(r3, r0)
            r11.f266950g = r12
        L_0x0150:
            com.google.android.apps.gsa.staticplugins.bisto.g.dj r12 = com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95413dj.EMPTY
            if (r2 != r12) goto L_0x0172
            android.os.PowerManager$WakeLock r12 = r11.f266950g
            if (r12 == 0) goto L_0x015e
            long r0 = f266944a
            r12.acquire(r0)
            goto L_0x0172
        L_0x015e:
            com.google.common.f.e r12 = f266945e
            com.google.common.f.x r12 = r12.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "SingleKeyGestureLis"
            r12.mo56378ag(r0, r1)
            java.lang.String r0 = "No wake lock"
            r1 = 15016(0x3aa8, float:2.1042E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r1)).mo56386p(r0)
        L_0x0172:
            com.google.android.apps.gsa.staticplugins.bisto.g.df r12 = new com.google.android.apps.gsa.staticplugins.bisto.g.df
            r12.<init>(r11)
            com.google.android.libraries.gsa.k.g r0 = r11.f266946b
            java.lang.String r1 = "update-timeout"
            r2 = 33
            com.google.common.util.concurrent.cx r12 = r0.mo28208h(r1, r2, r12)
            r11.f266948d = r12
            return
        L_0x0184:
            r11.m157786b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95411dh.mo89351a(android.view.KeyEvent):void");
    }
}
