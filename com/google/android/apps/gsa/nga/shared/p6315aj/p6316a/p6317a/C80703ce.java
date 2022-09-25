package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import android.os.Bundle;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.ce */
/* compiled from: PG */
public abstract class C80703ce {
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80703ce m128490d(android.os.Bundle r5) {
        /*
            java.lang.String r0 = "is_active"
            java.lang.String r0 = r5.getString(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            if (r1 != 0) goto L_0x0050
            int r1 = r0.hashCode()
            r3 = -1764642777(0xffffffff96d1b027, float:-3.387694E-25)
            r4 = 2
            if (r1 == r3) goto L_0x0036
            r3 = 706188910(0x2a17966e, float:1.3463685E-13)
            if (r1 == r3) goto L_0x002c
            r3 = 1502863890(0x5993e212, float:5.2031736E15)
            if (r1 == r3) goto L_0x0022
            goto L_0x0040
        L_0x0022:
            java.lang.String r1 = "NOT_ACTIVE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 0
            goto L_0x0041
        L_0x002c:
            java.lang.String r1 = "ACTIVE_SMALL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 1
            goto L_0x0041
        L_0x0036:
            java.lang.String r1 = "ACTIVE_BIG"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 2
            goto L_0x0041
        L_0x0040:
            r0 = -1
        L_0x0041:
            if (r0 == 0) goto L_0x0050
            if (r0 == r2) goto L_0x004f
            if (r0 != r4) goto L_0x0049
            r2 = 3
            goto L_0x0050
        L_0x0049:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
        L_0x004f:
            r2 = 2
        L_0x0050:
            java.lang.String r0 = "show_animation"
            boolean r5 = r5.getBoolean(r0)
            com.google.android.apps.gsa.nga.shared.aj.a.a.ap r0 = new com.google.android.apps.gsa.nga.shared.aj.a.a.ap
            r0.<init>(r5, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80703ce.m128490d(android.os.Bundle):com.google.android.apps.gsa.nga.shared.aj.a.a.ce");
    }

    /* renamed from: f */
    public static C80703ce m128491f() {
        return new C80660ap(false, 1);
    }

    /* renamed from: a */
    public abstract boolean mo74445a();

    /* renamed from: b */
    public abstract int mo74446b();

    /* renamed from: c */
    public final Bundle mo74631c() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_animation", mo74445a());
        int b = mo74446b();
        String a = C80702cd.m128489a(b);
        if (b != 0) {
            bundle.putString("is_active", a);
            return bundle;
        }
        throw null;
    }

    /* renamed from: e */
    public final boolean mo74632e() {
        int b = mo74446b();
        if (b != 0) {
            return b != 1;
        }
        throw null;
    }
}
