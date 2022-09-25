package com.facebook.litho.p329g;

import com.facebook.litho.C6348ga;

/* renamed from: com.facebook.litho.g.r */
/* compiled from: PG */
final class C6339r extends C6348ga {

    /* renamed from: a */
    final /* synthetic */ C6346y f18746a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6339r(com.facebook.litho.p329g.C6346y r2, com.facebook.litho.C6348ga r3) {
        /*
            r1 = this;
            r1.f18746a = r2
            r2 = 0
            if (r3 == 0) goto L_0x000b
            java.lang.Throwable r0 = r3.f18788b
            if (r0 == 0) goto L_0x000d
            r2 = 1
            goto L_0x000d
        L_0x000b:
            boolean r0 = com.facebook.litho.p325d.C6180a.f18234a
        L_0x000d:
            r1.<init>(r2)
            java.lang.Throwable r2 = r1.f18788b
            if (r2 == 0) goto L_0x001b
            if (r3 == 0) goto L_0x001b
            java.lang.Throwable r3 = r3.f18788b
            r2.initCause(r3)
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.p329g.C6339r.<init>(com.facebook.litho.g.y, com.facebook.litho.ga):void");
    }

    /* renamed from: a */
    public final void mo12842a(C6348ga gaVar) {
        C6346y yVar = this.f18746a;
        try {
            yVar.mo13369j();
        } catch (IndexOutOfBoundsException e) {
            String c = C6346y.m17026c(yVar);
            String message = e.getMessage();
            throw new RuntimeException("Index out of bounds while applying a new section. This indicates a bad diff was sent to the RecyclerBinder. See https://bit.ly/39Oq0Hs for more information. Debug info: " + c + message, e);
        }
    }
}
