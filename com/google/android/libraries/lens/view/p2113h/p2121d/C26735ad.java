package com.google.android.libraries.lens.view.p2113h.p2121d;

import android.util.Size;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.libraries.lens.view.h.d.ad */
/* compiled from: PG */
public final class C26735ad {

    /* renamed from: a */
    public static final /* synthetic */ int f72864a = 0;

    /* renamed from: b */
    private final boolean f72865b;

    static {
        C58974d.m91135i("CaptureSizeHelper");
    }

    public C26735ad(boolean z) {
        this.f72865b = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: android.util.Size} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Size m49424a(java.util.List r12, android.util.Size r13) {
        /*
            int r0 = r13.getWidth()
            double r0 = (double) r0
            int r2 = r13.getHeight()
            double r2 = (double) r2
            java.lang.Double.isNaN(r0)
            java.lang.Double.isNaN(r2)
            double r0 = r0 / r2
            int r2 = r13.getWidth()
            int r13 = r13.getHeight()
            int r2 = r2 * r13
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r3 = r12.iterator()
            r4 = 0
            r5 = 0
        L_0x0027:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0061
            java.lang.Object r7 = r3.next()
            android.util.Size r7 = (android.util.Size) r7
            int r8 = r7.getWidth()
            int r9 = r7.getHeight()
            int r8 = r8 * r9
            if (r8 > r2) goto L_0x0027
            int r8 = r7.getWidth()
            double r8 = (double) r8
            int r10 = r7.getHeight()
            double r10 = (double) r10
            java.lang.Double.isNaN(r8)
            java.lang.Double.isNaN(r10)
            double r8 = r8 / r10
            double r8 = r8 - r0
            double r8 = java.lang.Math.abs(r8)
            if (r4 == 0) goto L_0x005b
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x005d
        L_0x005b:
            r4 = r7
            r5 = r8
        L_0x005d:
            r13.add(r7)
            goto L_0x0027
        L_0x0061:
            r0 = 0
            if (r4 != 0) goto L_0x006b
            java.lang.Object r1 = r12.get(r0)
            r4 = r1
            android.util.Size r4 = (android.util.Size) r4
        L_0x006b:
            r4.getWidth()
            r4.getHeight()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r4.getWidth()
            int r3 = r4.getHeight()
            int r4 = r13.size()
            r5 = 0
        L_0x0083:
            if (r5 >= r4) goto L_0x009f
            java.lang.Object r6 = r13.get(r5)
            android.util.Size r6 = (android.util.Size) r6
            int r7 = r6.getHeight()
            int r7 = r7 * r2
            int r8 = r6.getWidth()
            int r8 = r8 * r3
            if (r7 != r8) goto L_0x009c
            r1.add(r6)
        L_0x009c:
            int r5 = r5 + 1
            goto L_0x0083
        L_0x009f:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x00ae
            com.google.android.libraries.lens.view.h.d.ac r12 = com.google.android.libraries.lens.view.p2113h.p2121d.C26734ac.f72863a
            java.lang.Object r12 = java.util.Collections.max(r1, r12)
            android.util.Size r12 = (android.util.Size) r12
            return r12
        L_0x00ae:
            boolean r1 = r13.isEmpty()
            if (r1 != 0) goto L_0x00bd
            com.google.android.libraries.lens.view.h.d.ac r12 = com.google.android.libraries.lens.view.p2113h.p2121d.C26734ac.f72863a
            java.lang.Object r12 = java.util.Collections.max(r13, r12)
            android.util.Size r12 = (android.util.Size) r12
            return r12
        L_0x00bd:
            java.lang.Object r12 = r12.get(r0)
            android.util.Size r12 = (android.util.Size) r12
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2113h.p2121d.C26735ad.m49424a(java.util.List, android.util.Size):android.util.Size");
    }

    @Deprecated
    /* renamed from: b */
    public final Size mo32057b() {
        return this.f72865b ? new Size(1920, 1080) : new Size(1280, 960);
    }
}
