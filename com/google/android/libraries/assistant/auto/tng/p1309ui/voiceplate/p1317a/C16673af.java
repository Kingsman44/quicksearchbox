package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a;

import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.af */
/* compiled from: PG */
public final /* synthetic */ class C16673af implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ AtomicInteger f48827a;

    /* renamed from: b */
    public final /* synthetic */ AtomicInteger f48828b;

    /* renamed from: c */
    public final /* synthetic */ AtomicInteger f48829c;

    public /* synthetic */ C16673af(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, AtomicInteger atomicInteger3) {
        this.f48827a = atomicInteger;
        this.f48828b = atomicInteger2;
        this.f48829c = atomicInteger3;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean test(java.lang.Object r8) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r7.f48827a
            java.util.concurrent.atomic.AtomicInteger r1 = r7.f48828b
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f48829c
            com.google.assistant.e.j.e.eu r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r8
            int r3 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16683ap.f48835a
            r0.getAndIncrement()
            java.lang.String r8 = r8.f136279g
            int r0 = r8.hashCode()
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r0) {
                case -1129697858: goto L_0x0039;
                case -1065052621: goto L_0x002f;
                case 264336741: goto L_0x0025;
                case 1283970937: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0043
        L_0x001b:
            java.lang.String r0 = "change_button_id"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0043
            r8 = 1
            goto L_0x0044
        L_0x0025:
            java.lang.String r0 = "custom_reply_button_id"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0043
            r8 = 3
            goto L_0x0044
        L_0x002f:
            java.lang.String r0 = "reply_button_id"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0043
            r8 = 2
            goto L_0x0044
        L_0x0039:
            java.lang.String r0 = "confirmation_button_id"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0043
            r8 = 0
            goto L_0x0044
        L_0x0043:
            r8 = -1
        L_0x0044:
            if (r8 == 0) goto L_0x0051
            if (r8 == r6) goto L_0x0051
            if (r8 == r5) goto L_0x004d
            if (r8 == r4) goto L_0x004d
            return r3
        L_0x004d:
            r2.getAndIncrement()
            return r6
        L_0x0051:
            r1.getAndIncrement()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16673af.test(java.lang.Object):boolean");
    }
}
