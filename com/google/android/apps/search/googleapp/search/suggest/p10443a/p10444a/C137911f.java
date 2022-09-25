package com.google.android.apps.search.googleapp.search.suggest.p10443a.p10444a;

import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.a.f */
/* compiled from: PG */
public final class C137911f implements C137907b {

    /* renamed from: a */
    private final C42876ab f375231a;

    /* renamed from: b */
    private final Executor f375232b;

    /* renamed from: c */
    private final C71422aw f375233c;

    public C137911f(C42876ab abVar, Executor executor, C71422aw awVar) {
        C69664n.m101061g(abVar, "suggestInContextControlDataStore");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f375231a = abVar;
        this.f375232b = executor;
        this.f375233c = awVar;
    }

    /* renamed from: a */
    public final C60870cx mo114041a() {
        return C71663i.m104688a(C71803m.m105042c(this.f375233c, (C69585o) null, (C71424ay) null, new C137908c(this, (C69577g) null), 3));
    }

    /* renamed from: b */
    public final C60870cx mo114042b() {
        C60870cx a = this.f375231a.mo46039a(C137910e.f375230a, this.f375232b);
        C69664n.m101060f(a, "suggestInContextControlD…lightweightExecutor\n    )");
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114043c(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.googleapp.search.suggest.p10443a.p10444a.C137909d
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.googleapp.search.suggest.a.a.d r0 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10444a.C137909d) r0
            int r1 = r0.f375229c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f375229c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.a.a.d r0 = new com.google.android.apps.search.googleapp.search.suggest.a.a.d
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f375227a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f375229c
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
            com.google.android.libraries.storage.protostore.ab r5 = r4.f375231a
            com.google.common.util.concurrent.cx r5 = r5.mo46042d()
            java.lang.String r2 = "suggestInContextControlDataStore.data"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            r0.f375229c = r3
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r5 != r1) goto L_0x0046
            return r1
        L_0x0046:
            java.lang.String r0 = "suggestInContextControlDataStore.data.await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.p10443a.p10444a.C137911f.mo114043c(h.c.g):java.lang.Object");
    }
}
