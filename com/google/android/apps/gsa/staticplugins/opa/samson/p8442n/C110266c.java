package com.google.android.apps.gsa.staticplugins.opa.samson.p8442n;

import android.graphics.Bitmap;
import com.google.assistant.p3886c.C50818do;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.n.c */
/* compiled from: PG */
final class C110266c extends C110260a {

    /* renamed from: a */
    public final C50818do f307287a;

    /* renamed from: b */
    public final Bitmap f307288b;

    public C110266c(C50818do doVar, Bitmap bitmap) {
        this.f307287a = doVar;
        this.f307288b = bitmap;
    }

    /* renamed from: a */
    public final Bitmap mo98505a() {
        return this.f307288b;
    }

    /* renamed from: b */
    public final C50818do mo98506b() {
        return this.f307287a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f307288b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.staticplugins.opa.samson.p8442n.C110260a
            r2 = 0
            if (r1 == 0) goto L_0x002e
            com.google.android.apps.gsa.staticplugins.opa.samson.n.a r5 = (com.google.android.apps.gsa.staticplugins.opa.samson.p8442n.C110260a) r5
            com.google.assistant.c.do r1 = r4.f307287a
            com.google.assistant.c.do r3 = r5.mo98506b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002e
            android.graphics.Bitmap r1 = r4.f307288b
            if (r1 != 0) goto L_0x0022
            android.graphics.Bitmap r5 = r5.mo98505a()
            if (r5 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0022:
            android.graphics.Bitmap r5 = r5.mo98505a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            return r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.samson.p8442n.C110266c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f307287a.hashCode() ^ 1000003) * 1000003;
        Bitmap bitmap = this.f307288b;
        if (bitmap == null) {
            i = 0;
        } else {
            i = bitmap.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f307287a.toString();
        String valueOf = String.valueOf(this.f307288b);
        return "AmbientSmartSpaceData{card=" + obj + ", icon=" + valueOf + "}";
    }
}
