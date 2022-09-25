package com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a;

import android.content.Context;
import com.google.apps.tiktok.concurrent.C46423aj;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.e.b.a.o */
/* compiled from: PG */
public final class C32590o {

    /* renamed from: a */
    public final Context f87285a;

    /* renamed from: b */
    private final Executor f87286b;

    /* renamed from: c */
    private final C46423aj f87287c;

    public C32590o(Context context, Executor executor) {
        C69664n.m101061g(context, "applicationContext");
        C69664n.m101061g(executor, "backgroundExecutor");
        this.f87285a = context;
        this.f87286b = executor;
        this.f87287c = new C46423aj(new C32589n(this), executor);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38166a(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32588m
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.libraries.search.assistant.e.b.a.m r0 = (com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32588m) r0
            int r1 = r0.f87283c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f87283c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.e.b.a.m r0 = new com.google.android.libraries.search.assistant.e.b.a.m
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f87281a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f87283c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r5)
            goto L_0x0040
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r5)
            com.google.apps.tiktok.concurrent.aj r5 = r4.f87287c
            com.google.common.util.concurrent.cx r5 = r5.mo50395b()
            r0.f87283c = r3
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r5 == r1) goto L_0x004b
        L_0x0040:
            if (r5 == 0) goto L_0x0043
            return r5
        L_0x0043:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Required value was null."
            r5.<init>(r0)
            throw r5
        L_0x004b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32590o.mo38166a(h.c.g):java.lang.Object");
    }
}
