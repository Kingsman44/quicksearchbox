package com.google.android.apps.search.googleapp.customtabs.p10149a;

import com.google.android.apps.search.googleapp.customtabs.p10152d.C133756q;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.a.e */
/* compiled from: PG */
public final class C133672e {

    /* renamed from: a */
    private final C133756q f364094a;

    /* renamed from: b */
    private final C71422aw f364095b;

    /* renamed from: c */
    private final C69585o f364096c;

    public C133672e(C133756q qVar, C71422aw awVar, C69585o oVar) {
        C69664n.m101061g(qVar, "internalCustomTabsConnectionManager");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(oVar, "backgroundContext");
        this.f364094a = qVar;
        this.f364095b = awVar;
        this.f364096c = oVar;
    }

    /* renamed from: a */
    public final C60870cx mo111330a() {
        return C71663i.m104692e(this.f364095b, (C71424ay) null, new C133671d(this, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111331b(p5462h.p5466c.C69577g r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.googleapp.customtabs.p10149a.C133669b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.googleapp.customtabs.a.b r0 = (com.google.android.apps.search.googleapp.customtabs.p10149a.C133669b) r0
            int r1 = r0.f364090d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f364090d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.customtabs.a.b r0 = new com.google.android.apps.search.googleapp.customtabs.a.b
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f364088b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f364090d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0068
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0032:
            java.lang.Object r2 = r0.f364087a
            p5462h.C69714l.m101134b(r7)     // Catch:{ a -> 0x0074 }
            goto L_0x0052
        L_0x0038:
            p5462h.C69714l.m101134b(r7)
            com.google.android.apps.search.googleapp.customtabs.d.q r7 = r6.f364094a     // Catch:{ a -> 0x0074 }
            com.google.common.util.concurrent.cx r7 = r7.mo111386a()     // Catch:{ a -> 0x0074 }
            java.lang.String r2 = "internalCustomTabsConnec…onnectionHandleIfNeeded()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r2)     // Catch:{ a -> 0x0074 }
            r0.f364087a = r6     // Catch:{ a -> 0x0074 }
            r0.f364090d = r4     // Catch:{ a -> 0x0074 }
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)     // Catch:{ a -> 0x0074 }
            if (r7 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r2 = r6
        L_0x0052:
            com.google.android.apps.search.googleapp.customtabs.d.g r7 = (com.google.android.apps.search.googleapp.customtabs.p10152d.C133746g) r7     // Catch:{ a -> 0x0074 }
            com.google.android.apps.search.googleapp.customtabs.a.e r2 = (com.google.android.apps.search.googleapp.customtabs.p10149a.C133672e) r2
            h.c.o r2 = r2.f364096c
            com.google.android.apps.search.googleapp.customtabs.a.c r4 = new com.google.android.apps.search.googleapp.customtabs.a.c
            r5 = 0
            r4.<init>(r7, r5)
            r0.f364087a = r5
            r0.f364090d = r3
            java.lang.Object r7 = kotlinx.coroutines.C71803m.m105040a(r2, r4, r0)
            if (r7 == r1) goto L_0x0073
        L_0x0068:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x006d
            return r7
        L_0x006d:
            com.google.android.apps.search.googleapp.customtabs.a.a r7 = new com.google.android.apps.search.googleapp.customtabs.a.a
            r7.<init>()
            throw r7
        L_0x0073:
            return r1
        L_0x0074:
            r7 = move-exception
            com.google.android.apps.search.googleapp.customtabs.a.a r0 = new com.google.android.apps.search.googleapp.customtabs.a.a
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.customtabs.p10149a.C133672e.mo111331b(h.c.g):java.lang.Object");
    }
}
