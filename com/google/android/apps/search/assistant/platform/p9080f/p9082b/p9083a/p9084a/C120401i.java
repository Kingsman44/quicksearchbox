package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9083a.p9084a;

import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34820a;
import com.google.android.libraries.search.p2904c.C37338ac;
import com.google.android.libraries.search.p2904c.C37341af;
import com.google.protobuf.C62940bt;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5078a.p5085c.p5086a.p5087a.p5088a.p5089a.C65488e;

/* renamed from: com.google.android.apps.search.assistant.platform.f.b.a.a.i */
/* compiled from: PG */
final class C120401i extends RuntimeException implements C34820a {

    /* renamed from: a */
    private final C37338ac f334907a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C120401i(com.google.android.libraries.search.p2904c.C37338ac r4) {
        /*
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r4.f99179b
            com.google.android.libraries.search.c.af r1 = com.google.android.libraries.search.p2904c.C37341af.m66350a(r1)
            if (r1 != 0) goto L_0x000d
            com.google.android.libraries.search.c.af r1 = com.google.android.libraries.search.p2904c.C37341af.UNKNOWN_ACQUIRING_STATUS
        L_0x000d:
            int r1 = r1.f99187f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "Unable to acquire audio focus: %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r3.<init>(r0)
            r3.f334907a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9083a.p9084a.C120401i.<init>(com.google.android.libraries.search.c.ac):void");
    }

    /* renamed from: a */
    public final C34819a mo23265a() {
        C62940bt btVar = C65488e.f178034c;
        C37341af a = C37341af.m66350a(this.f334907a.f99179b);
        if (a == null) {
            a = C37341af.UNKNOWN_ACQUIRING_STATUS;
        }
        return C34819a.m63580c(btVar, a);
    }
}
