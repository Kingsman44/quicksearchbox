package com.google.android.libraries.componentview.components.elements;

import android.graphics.Rect;

/* renamed from: com.google.android.libraries.componentview.components.elements.o */
/* compiled from: PG */
final class C20452o extends C20423ax {

    /* renamed from: a */
    private final String f57519a;

    /* renamed from: b */
    private final int f57520b;

    /* renamed from: c */
    private final String f57521c;

    /* renamed from: d */
    private final Rect f57522d;

    public C20452o(String str, int i, String str2, Rect rect) {
        if (str != null) {
            this.f57519a = str;
            this.f57520b = i;
            if (str2 != null) {
                this.f57521c = str2;
                this.f57522d = rect;
                return;
            }
            throw new NullPointerException("Null fallbackUrl");
        }
        throw new NullPointerException("Null selectedID");
    }

    /* renamed from: a */
    public final int mo25387a() {
        return this.f57520b;
    }

    /* renamed from: b */
    public final Rect mo25388b() {
        return this.f57522d;
    }

    /* renamed from: c */
    public final String mo25389c() {
        return this.f57521c;
    }

    /* renamed from: d */
    public final String mo25390d() {
        return this.f57519a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        r1 = r4.f57522d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.componentview.components.elements.C20423ax
            r2 = 0
            if (r1 == 0) goto L_0x0042
            com.google.android.libraries.componentview.components.elements.ax r5 = (com.google.android.libraries.componentview.components.elements.C20423ax) r5
            java.lang.String r1 = r4.f57519a
            java.lang.String r3 = r5.mo25390d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0042
            int r1 = r4.f57520b
            int r3 = r5.mo25387a()
            if (r1 != r3) goto L_0x0042
            java.lang.String r1 = r4.f57521c
            java.lang.String r3 = r5.mo25389c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0042
            android.graphics.Rect r1 = r4.f57522d
            if (r1 != 0) goto L_0x0036
            android.graphics.Rect r5 = r5.mo25388b()
            if (r5 != 0) goto L_0x0042
            goto L_0x0041
        L_0x0036:
            android.graphics.Rect r5 = r5.mo25388b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            return r0
        L_0x0042:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.componentview.components.elements.C20452o.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.f57519a.hashCode() ^ 1000003) * 1000003) ^ this.f57520b) * 1000003) ^ this.f57521c.hashCode()) * 1000003;
        Rect rect = this.f57522d;
        if (rect == null) {
            i = 0;
        } else {
            i = rect.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f57519a;
        int i = this.f57520b;
        String str2 = this.f57521c;
        String valueOf = String.valueOf(this.f57522d);
        return "ImageClickEventData{selectedID=" + str + ", index=" + i + ", fallbackUrl=" + str2 + ", measuredBounds=" + valueOf + "}";
    }
}
