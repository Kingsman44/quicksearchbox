package com.google.android.gms.learning.internal.p10827a;

import android.content.Context;

/* renamed from: com.google.android.gms.learning.internal.a.a */
/* compiled from: PG */
public final class C144761a implements C144762b {

    /* renamed from: a */
    private final Context f391609a;

    public C144761a(Context context) {
        this.f391609a = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004e, code lost:
        if (r7 == Long.MIN_VALUE) goto L_0x0050;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.learning.internal.p10827a.C144763c mo120196a() {
        /*
            r11 = this;
            android.content.Context r0 = r11.f391609a
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r2 = "android.intent.action.BATTERY_CHANGED"
            r1.<init>(r2)
            r2 = 0
            android.content.Intent r0 = com.google.android.gms.libs.p10835c.C144854b.m235443a(r0, r2, r1)
            java.lang.String r1 = "status"
            r2 = 0
            int r4 = r0.getIntExtra(r1, r2)
            java.lang.String r1 = "plugged"
            int r5 = r0.getIntExtra(r1, r2)
            java.lang.String r1 = "level"
            r2 = -1
            int r1 = r0.getIntExtra(r1, r2)
            java.lang.String r3 = "scale"
            int r0 = r0.getIntExtra(r3, r2)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == r2) goto L_0x0035
            if (r0 == r2) goto L_0x0035
            if (r0 <= 0) goto L_0x0035
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            r6 = r1
            goto L_0x0037
        L_0x0035:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0037:
            android.content.Context r0 = r11.f391609a
            java.lang.String r1 = "batterymanager"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.os.BatteryManager r0 = (android.os.BatteryManager) r0
            r1 = 0
            if (r0 == 0) goto L_0x0050
            r3 = 5
            long r7 = r0.getLongProperty(r3)
            r9 = -9223372036854775808
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0051
        L_0x0050:
            r7 = r1
        L_0x0051:
            com.google.android.gms.learning.internal.a.c r0 = new com.google.android.gms.learning.internal.a.c
            r3 = r0
            r3.<init>(r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.internal.p10827a.C144761a.mo120196a():com.google.android.gms.learning.internal.a.c");
    }
}
