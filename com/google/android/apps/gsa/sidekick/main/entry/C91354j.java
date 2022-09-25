package com.google.android.apps.gsa.sidekick.main.entry;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.proactive.p6475b.C84160c;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.core.p6513aj.C84539b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.gsa.sidekick.main.entry.j */
/* compiled from: PG */
public final class C91354j {

    /* renamed from: a */
    public final C84539b f254909a;

    /* renamed from: b */
    public final C21370a f254910b;

    /* renamed from: c */
    public final C84160c f254911c;

    /* renamed from: d */
    public final C91329bg f254912d;

    /* renamed from: e */
    public final C58881cr f254913e;

    /* renamed from: f */
    public final C84486a f254914f;

    /* renamed from: g */
    private final Context f254915g;

    public C91354j(Context context, C84539b bVar, C21370a aVar, C84160c cVar, C91329bg bgVar, C58881cr crVar, C84486a aVar2) {
        this.f254909a = bVar;
        this.f254915g = context;
        this.f254910b = aVar;
        this.f254911c = cVar;
        this.f254912d = bgVar;
        this.f254913e = crVar;
        this.f254914f = aVar2;
    }

    /* renamed from: a */
    public final PendingIntent mo85662a(boolean z) {
        Intent intent = new Intent("com.google.android.apps.gsa.broadcastreceiver.ACTION_PROACTIVE_REFRESH_WATCHDOG");
        intent.setComponent(new ComponentName(this.f254915g, "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver"));
        return PendingIntent.getBroadcast(this.f254915g, 0, intent, (true != z ? 536870912 : 134217728) | 67108864);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0065, code lost:
        if (r10 < (r6 + r1)) goto L_0x0069;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85663b(boolean r17) {
        /*
            r16 = this;
            r0 = r16
            com.google.android.apps.gsa.search.core.ag.b.a r1 = r0.f254914f
            boolean r1 = r1.mo78202i()
            if (r1 == 0) goto L_0x000b
            return
        L_0x000b:
            com.google.common.base.cr r1 = r0.f254913e
            java.lang.Object r1 = r1.mo6453a()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r2 = r1.intValue()
            if (r2 > 0) goto L_0x001f
            r1 = 1560(0x618, float:2.186E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x001f:
            int r1 = r1.intValue()
            long r1 = (long) r1
            r3 = 60000(0xea60, double:2.9644E-319)
            long r1 = r1 * r3
            com.google.android.apps.gsa.search.core.aj.b r3 = r0.f254909a
            r4 = 1
            android.app.PendingIntent r4 = r0.mo85662a(r4)
            com.google.android.apps.gsa.search.core.i.w r5 = r3.f230067b
            com.google.android.apps.gsa.search.core.i.aa r5 = r5.f232790a
            com.google.android.apps.gsa.search.core.preferences.r r5 = r5.mo79722a()
            com.google.android.libraries.f.a r6 = r3.f230066a
            long r6 = r6.mo26871c()
            r8 = 0
            if (r17 != 0) goto L_0x0068
            java.lang.String r10 = "AlarmStartTimeMillis_refresh_alarm"
            long r11 = r5.getLong(r10, r8)
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 <= 0) goto L_0x0068
            long r10 = r5.getLong(r10, r8)
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0061
            long r12 = r6 - r10
            long r12 = r12 / r1
            r14 = 1
            long r12 = r12 + r14
            long r12 = r12 * r1
            long r10 = r10 + r12
            r3.mo78255e(r10)
            goto L_0x0069
        L_0x0061:
            long r12 = r6 + r1
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 >= 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r10 = r8
        L_0x0069:
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x0084
            long r6 = r6 + r1
            java.util.Random r5 = r3.f230068c
            r8 = 15
            long r1 = r1 / r8
            int r2 = (int) r1
            r1 = 30000(0x7530, float:4.2039E-41)
            int r1 = java.lang.Math.max(r2, r1)
            int r1 = r5.nextInt(r1)
            long r1 = (long) r1
            long r10 = r6 + r1
            r3.mo78255e(r10)
        L_0x0084:
            r1 = 2
            r3.mo78252b(r1, r10, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.main.entry.C91354j.mo85663b(boolean):void");
    }
}
