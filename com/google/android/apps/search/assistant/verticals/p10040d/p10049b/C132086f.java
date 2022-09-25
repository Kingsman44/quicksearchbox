package com.google.android.apps.search.assistant.verticals.p10040d.p10049b;

import android.content.Context;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.p3648i.p3653d.C47181e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.d.b.f */
/* compiled from: PG */
public final class C132086f implements C47181e {

    /* renamed from: a */
    private final boolean f360467a;

    /* renamed from: b */
    private final C46175b f360468b;

    /* renamed from: c */
    private final Context f360469c;

    /* renamed from: d */
    private final C71422aw f360470d;

    public C132086f(boolean z, C46175b bVar, Context context, C71422aw awVar) {
        C69664n.m101061g(bVar, "accountDataService");
        C69664n.m101061g(context, "context");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f360467a = z;
        this.f360468b = bVar;
        this.f360469c = context;
        this.f360470d = awVar;
    }

    /* renamed from: a */
    public final C60870cx mo47105a() {
        if (!this.f360467a) {
            return C60856cj.m92900i(C69788q.f186170a);
        }
        return C71663i.m104692e(this.f360470d, (C71424ay) null, new C132084d(this, (C69577g) null), 3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.util.Iterator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo110403b(p5462h.p5466c.C69577g r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.google.android.apps.search.assistant.verticals.p10040d.p10049b.C132085e
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.apps.search.assistant.verticals.d.b.e r0 = (com.google.android.apps.search.assistant.verticals.p10040d.p10049b.C132085e) r0
            int r1 = r0.f360466e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f360466e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.verticals.d.b.e r0 = new com.google.android.apps.search.assistant.verticals.d.b.e
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f360464c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f360466e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r2 = r0.f360463b
            java.lang.Object r4 = r0.f360462a
            p5462h.C69714l.m101134b(r9)
            goto L_0x005d
        L_0x002e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0036:
            java.lang.Object r2 = r0.f360462a
            p5462h.C69714l.m101134b(r9)
            goto L_0x0055
        L_0x003c:
            p5462h.C69714l.m101134b(r9)
            com.google.apps.tiktok.account.data.b r9 = r8.f360468b
            com.google.common.util.concurrent.cx r9 = r9.mo50247d()
            java.lang.String r2 = "accountDataService.enabledAccountIds"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)
            r0.f360462a = r8
            r0.f360466e = r4
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r9, r0)
            if (r9 == r1) goto L_0x0099
            r2 = r8
        L_0x0055:
            java.util.Set r9 = (java.util.Set) r9
            java.util.Iterator r9 = r9.iterator()
            r4 = r2
            r2 = r9
        L_0x005d:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x0096
            java.lang.Object r9 = r2.next()
            com.google.apps.tiktok.account.AccountId r9 = (com.google.apps.tiktok.account.AccountId) r9
            r5 = r4
            com.google.android.apps.search.assistant.verticals.d.b.f r5 = (com.google.android.apps.search.assistant.verticals.p10040d.p10049b.C132086f) r5
            android.content.Context r5 = r5.f360469c
            java.lang.Class<com.google.android.apps.search.assistant.verticals.d.b.a> r6 = com.google.android.apps.search.assistant.verticals.p10040d.p10049b.C132081a.class
            java.lang.Object r9 = com.google.apps.tiktok.inject.C47245e.m84045a(r5, r6, r9)
            com.google.android.apps.search.assistant.verticals.d.b.a r9 = (com.google.android.apps.search.assistant.verticals.p10040d.p10049b.C132081a) r9
            com.google.android.apps.search.assistant.verticals.d.b.c r9 = r9.mo110402by()
            r0.f360462a = r4
            r0.f360463b = r2
            r0.f360466e = r3
            h.c.o r5 = r9.f360459d
            com.google.android.apps.search.assistant.verticals.d.b.b r6 = new com.google.android.apps.search.assistant.verticals.d.b.b
            r7 = 0
            r6.<init>(r9, r7)
            java.lang.Object r9 = kotlinx.coroutines.C71803m.m105040a(r5, r6, r0)
            h.c.a.a r5 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            if (r9 == r5) goto L_0x0092
            h.q r9 = p5462h.C69788q.f186170a
        L_0x0092:
            if (r9 == r1) goto L_0x0095
            goto L_0x005d
        L_0x0095:
            return r1
        L_0x0096:
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        L_0x0099:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.p10040d.p10049b.C132086f.mo110403b(h.c.g):java.lang.Object");
    }
}
