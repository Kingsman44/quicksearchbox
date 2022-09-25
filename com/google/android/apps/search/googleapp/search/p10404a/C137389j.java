package com.google.android.apps.search.googleapp.search.p10404a;

import android.content.Context;
import com.google.android.gms.p10725a.p10730b.p10731a.C142672a;
import com.google.android.libraries.storage.protostore.C42876ab;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.a.j */
/* compiled from: PG */
public final class C137389j {

    /* renamed from: a */
    public final Context f373704a;

    /* renamed from: b */
    public final C42876ab f373705b;

    /* renamed from: c */
    public final Executor f373706c;

    /* renamed from: d */
    public final C71422aw f373707d;

    /* renamed from: e */
    private final C69585o f373708e;

    public C137389j(Context context, C42876ab abVar, C69585o oVar, Executor executor, C71422aw awVar, C142672a aVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(abVar, "advertisingInfoDataStore");
        C69664n.m101061g(oVar, "backgroundContext");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(aVar, "advertisingIdInfoProvider");
        this.f373704a = context;
        this.f373705b = abVar;
        this.f373708e = oVar;
        this.f373706c = executor;
        this.f373707d = awVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo113698a(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.googleapp.search.p10404a.C137383d
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.googleapp.search.a.d r0 = (com.google.android.apps.search.googleapp.search.p10404a.C137383d) r0
            int r1 = r0.f373691c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f373691c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.a.d r0 = new com.google.android.apps.search.googleapp.search.a.d
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f373689a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f373691c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r6)
            goto L_0x0043
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x002f:
            p5462h.C69714l.m101134b(r6)
            h.c.o r6 = r5.f373708e
            com.google.android.apps.search.googleapp.search.a.f r2 = new com.google.android.apps.search.googleapp.search.a.f
            r4 = 0
            r2.<init>(r5, r4)
            r0.f373691c = r3
            java.lang.Object r6 = kotlinx.coroutines.C71803m.m105040a(r6, r2, r0)
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            java.lang.String r0 = "suspend fun fetchAdverti…await()\n      }\n    }\n  }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.p10404a.C137389j.mo113698a(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo113699b(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.googleapp.search.p10404a.C137387h
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.googleapp.search.a.h r0 = (com.google.android.apps.search.googleapp.search.p10404a.C137387h) r0
            int r1 = r0.f373700c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f373700c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.a.h r0 = new com.google.android.apps.search.googleapp.search.a.h
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f373698a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f373700c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r5)
            goto L_0x0046
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r5)
            com.google.android.libraries.storage.protostore.ab r5 = r4.f373705b
            com.google.common.util.concurrent.cx r5 = r5.mo46042d()
            java.lang.String r2 = "advertisingInfoDataStore.data"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            r0.f373700c = r3
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r5 != r1) goto L_0x0046
            return r1
        L_0x0046:
            com.google.android.apps.search.googleapp.search.a.c r5 = (com.google.android.apps.search.googleapp.search.p10404a.C137382c) r5
            java.lang.String r5 = r5.f373687b
            java.lang.String r0 = "advertisingInfoDataStore.data.await().adId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.p10404a.C137389j.mo113699b(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo113700c(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.googleapp.search.p10404a.C137388i
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.googleapp.search.a.i r0 = (com.google.android.apps.search.googleapp.search.p10404a.C137388i) r0
            int r1 = r0.f373703c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f373703c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.a.i r0 = new com.google.android.apps.search.googleapp.search.a.i
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f373701a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f373703c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r5)
            goto L_0x0046
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r5)
            com.google.android.libraries.storage.protostore.ab r5 = r4.f373705b
            com.google.common.util.concurrent.cx r5 = r5.mo46042d()
            java.lang.String r2 = "advertisingInfoDataStore.data"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            r0.f373703c = r3
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r5 != r1) goto L_0x0046
            return r1
        L_0x0046:
            com.google.android.apps.search.googleapp.search.a.c r5 = (com.google.android.apps.search.googleapp.search.p10404a.C137382c) r5
            boolean r5 = r5.f373688c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.p10404a.C137389j.mo113700c(h.c.g):java.lang.Object");
    }
}
