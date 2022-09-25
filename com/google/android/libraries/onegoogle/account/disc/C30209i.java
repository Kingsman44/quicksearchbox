package com.google.android.libraries.onegoogle.account.disc;

import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.i */
/* compiled from: PG */
public final class C30209i extends C30226z {

    /* renamed from: a */
    private final Drawable f81668a;

    /* renamed from: b */
    private final String f81669b;

    /* renamed from: c */
    private final C30173aa f81670c;

    public C30209i(Drawable drawable, String str, C30173aa aaVar) {
        if (drawable != null) {
            this.f81668a = drawable;
            this.f81669b = str;
            if (aaVar != null) {
                this.f81670c = aaVar;
                return;
            }
            throw new NullPointerException("Null badgeType");
        }
        throw new NullPointerException("Null data");
    }

    /* renamed from: a */
    public final Drawable mo35668a() {
        return this.f81668a;
    }

    /* renamed from: b */
    public final C30173aa mo35669b() {
        return this.f81670c;
    }

    /* renamed from: c */
    public final String mo35670c() {
        return this.f81669b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f81669b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.onegoogle.account.disc.C30226z
            r2 = 0
            if (r1 == 0) goto L_0x003a
            com.google.android.libraries.onegoogle.account.disc.z r5 = (com.google.android.libraries.onegoogle.account.disc.C30226z) r5
            android.graphics.drawable.Drawable r1 = r4.f81668a
            android.graphics.drawable.Drawable r3 = r5.mo35668a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003a
            java.lang.String r1 = r4.f81669b
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = r5.mo35670c()
            if (r1 != 0) goto L_0x003a
            goto L_0x002d
        L_0x0022:
            java.lang.String r3 = r5.mo35670c()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x002d
            goto L_0x003a
        L_0x002d:
            com.google.android.libraries.onegoogle.account.disc.aa r1 = r4.f81670c
            com.google.android.libraries.onegoogle.account.disc.aa r5 = r5.mo35669b()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x003a
            return r0
        L_0x003a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.account.disc.C30209i.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f81668a.hashCode() ^ 1000003) * 1000003;
        String str = this.f81669b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.f81670c.hashCode();
    }

    public final String toString() {
        String obj = this.f81668a.toString();
        String str = this.f81669b;
        String obj2 = this.f81670c.toString();
        return "BadgeContent{data=" + obj + ", contentDescription=" + str + ", badgeType=" + obj2 + "}";
    }
}
