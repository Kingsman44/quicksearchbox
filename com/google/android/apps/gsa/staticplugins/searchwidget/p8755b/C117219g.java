package com.google.android.apps.gsa.staticplugins.searchwidget.p8755b;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.b.g */
/* compiled from: PG */
public final class C117219g {

    /* renamed from: a */
    public final Context f325391a;

    /* renamed from: b */
    public final C86124t f325392b;

    /* renamed from: c */
    public final C117230r f325393c;

    /* renamed from: d */
    public final C117232t f325394d;

    /* renamed from: e */
    public final C117223k f325395e;

    /* renamed from: f */
    public final C117229q f325396f;

    /* renamed from: g */
    public final C117227o f325397g;

    /* renamed from: h */
    public final C117228p f325398h;

    /* renamed from: i */
    public final C117224l f325399i;

    /* renamed from: j */
    public final C117231s f325400j;

    /* renamed from: k */
    public final C117216d f325401k;

    /* renamed from: l */
    public final C117215c f325402l;

    /* renamed from: m */
    public final Executor f325403m;

    public C117219g(Context context, C86124t tVar, C117230r rVar, C117232t tVar2, C117223k kVar, C117229q qVar, C117227o oVar, C117228p pVar, C117224l lVar, C117231s sVar, C117216d dVar, C117215c cVar, Executor executor) {
        this.f325391a = context;
        this.f325392b = tVar;
        this.f325393c = rVar;
        this.f325394d = tVar2;
        this.f325395e = kVar;
        this.f325396f = qVar;
        this.f325397g = oVar;
        this.f325398h = pVar;
        this.f325399i = lVar;
        this.f325400j = sVar;
        this.f325401k = dVar;
        this.f325402l = cVar;
        this.f325403m = executor;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|(1:5)|6|7|(2:9|11)(1:13)) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x004c */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0058 A[Catch:{ CancellationException | ExecutionException -> 0x007e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m194785a(com.google.common.util.concurrent.C60870cx r3, com.google.common.util.concurrent.C60870cx r4, com.google.common.p4552o.C60512sq r5, com.google.common.util.concurrent.C60870cx r6) {
        /*
            java.lang.Object r3 = com.google.common.util.concurrent.C60856cj.m92909r(r3)     // Catch:{ CancellationException | ExecutionException -> 0x004c }
            j$.util.Optional r3 = (p3186j$.util.Optional) r3     // Catch:{ CancellationException | ExecutionException -> 0x004c }
            java.lang.Object r4 = com.google.common.util.concurrent.C60856cj.m92909r(r4)     // Catch:{ CancellationException | ExecutionException -> 0x004c }
            j$.util.Optional r4 = (p3186j$.util.Optional) r4     // Catch:{ CancellationException | ExecutionException -> 0x004c }
            boolean r0 = r3.isPresent()     // Catch:{ CancellationException | ExecutionException -> 0x004c }
            if (r0 == 0) goto L_0x004c
            boolean r0 = r4.isPresent()     // Catch:{ CancellationException | ExecutionException -> 0x004c }
            if (r0 == 0) goto L_0x004c
            java.lang.Object r3 = r3.get()     // Catch:{ CancellationException | ExecutionException -> 0x004c }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ CancellationException | ExecutionException -> 0x004c }
            boolean r3 = r3.booleanValue()     // Catch:{ CancellationException | ExecutionException -> 0x004c }
            r5.copyOnWrite()     // Catch:{ CancellationException | ExecutionException -> 0x004c }
            com.google.protobuf.bv r0 = r5.instance     // Catch:{ CancellationException | ExecutionException -> 0x004c }
            com.google.common.o.ta r0 = (com.google.common.p4552o.C60523ta) r0     // Catch:{ CancellationException | ExecutionException -> 0x004c }
            com.google.common.o.ta r1 = com.google.common.p4552o.C60523ta.f163862u     // Catch:{ CancellationException | ExecutionException -> 0x004c }
            int r1 = r0.f163864a     // Catch:{ CancellationException | ExecutionException -> 0x004c }
            r2 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r2
            r0.f163864a = r1     // Catch:{ CancellationException | ExecutionException -> 0x004c }
            r0.f163881r = r3     // Catch:{ CancellationException | ExecutionException -> 0x004c }
            java.lang.Object r3 = r4.get()     // Catch:{ CancellationException | ExecutionException -> 0x004c }
            com.google.android.libraries.search.location.a.aj r3 = (com.google.android.libraries.search.location.p3029a.C38590aj) r3     // Catch:{ CancellationException | ExecutionException -> 0x004c }
            r5.copyOnWrite()     // Catch:{ CancellationException | ExecutionException -> 0x004c }
            com.google.protobuf.bv r4 = r5.instance     // Catch:{ CancellationException | ExecutionException -> 0x004c }
            com.google.common.o.ta r4 = (com.google.common.p4552o.C60523ta) r4     // Catch:{ CancellationException | ExecutionException -> 0x004c }
            int r3 = r3.f102015g     // Catch:{ CancellationException | ExecutionException -> 0x004c }
            r4.f163882s = r3     // Catch:{ CancellationException | ExecutionException -> 0x004c }
            int r3 = r4.f163864a     // Catch:{ CancellationException | ExecutionException -> 0x004c }
            r0 = 131072(0x20000, float:1.83671E-40)
            r3 = r3 | r0
            r4.f163864a = r3     // Catch:{ CancellationException | ExecutionException -> 0x004c }
        L_0x004c:
            java.lang.Object r3 = com.google.common.util.concurrent.C60856cj.m92909r(r6)     // Catch:{ CancellationException | ExecutionException -> 0x007e }
            com.google.android.apps.search.googleapp.compliance.a.ao r3 = (com.google.android.apps.search.googleapp.compliance.p10144a.C133546ao) r3     // Catch:{ CancellationException | ExecutionException -> 0x007e }
            int r4 = r3.f363861a     // Catch:{ CancellationException | ExecutionException -> 0x007e }
            r4 = r4 & 1
            if (r4 == 0) goto L_0x007e
            boolean r4 = r3.f363863c     // Catch:{ CancellationException | ExecutionException -> 0x007e }
            r5.copyOnWrite()     // Catch:{ CancellationException | ExecutionException -> 0x007e }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ CancellationException | ExecutionException -> 0x007e }
            com.google.common.o.ta r6 = (com.google.common.p4552o.C60523ta) r6     // Catch:{ CancellationException | ExecutionException -> 0x007e }
            com.google.common.o.ta r0 = com.google.common.p4552o.C60523ta.f163862u     // Catch:{ CancellationException | ExecutionException -> 0x007e }
            int r0 = r6.f163864a     // Catch:{ CancellationException | ExecutionException -> 0x007e }
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r6.f163864a = r0     // Catch:{ CancellationException | ExecutionException -> 0x007e }
            r6.f163879p = r4     // Catch:{ CancellationException | ExecutionException -> 0x007e }
            boolean r3 = r3.f363864d     // Catch:{ CancellationException | ExecutionException -> 0x007e }
            r5.copyOnWrite()     // Catch:{ CancellationException | ExecutionException -> 0x007e }
            com.google.protobuf.bv r4 = r5.instance     // Catch:{ CancellationException | ExecutionException -> 0x007e }
            com.google.common.o.ta r4 = (com.google.common.p4552o.C60523ta) r4     // Catch:{ CancellationException | ExecutionException -> 0x007e }
            int r5 = r4.f163864a     // Catch:{ CancellationException | ExecutionException -> 0x007e }
            r6 = 32768(0x8000, float:4.5918E-41)
            r5 = r5 | r6
            r4.f163864a = r5     // Catch:{ CancellationException | ExecutionException -> 0x007e }
            r4.f163880q = r3     // Catch:{ CancellationException | ExecutionException -> 0x007e }
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.searchwidget.p8755b.C117219g.m194785a(com.google.common.util.concurrent.cx, com.google.common.util.concurrent.cx, com.google.common.o.sq, com.google.common.util.concurrent.cx):void");
    }
}
