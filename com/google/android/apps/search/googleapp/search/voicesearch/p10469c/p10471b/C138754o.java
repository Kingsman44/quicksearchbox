package com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b;

import android.content.Context;
import android.provider.Settings;
import com.google.android.apps.search.googleapp.p10533v.p10534a.C139853b;
import com.google.android.apps.search.googleapp.search.p10405b.C137396a;
import com.google.android.apps.search.googleapp.search.p10418j.C137531e;
import com.google.android.libraries.kids.p1982a.p1983a.C24030j;
import com.google.android.libraries.web.profile.p3431a.p3432a.p3433a.C43984e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.account.data.p3613b.C46180e;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71422aw;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.c.b.o */
/* compiled from: PG */
public final class C138754o {

    /* renamed from: g */
    public static final /* synthetic */ int f377384g = 0;

    /* renamed from: h */
    private static final C58974d f377385h = C58974d.m91135i("BaselineRequestData");

    /* renamed from: a */
    public final Context f377386a;

    /* renamed from: b */
    public final C139853b f377387b;

    /* renamed from: c */
    public final C69585o f377388c;

    /* renamed from: d */
    public final C137531e f377389d;

    /* renamed from: e */
    public final boolean f377390e;

    /* renamed from: f */
    public final boolean f377391f;

    /* renamed from: i */
    private final AccountId f377392i;

    /* renamed from: j */
    private final C137396a f377393j;

    /* renamed from: k */
    private final C71422aw f377394k;

    /* renamed from: l */
    private final C46128f f377395l;

    /* renamed from: m */
    private final C24030j f377396m;

    /* renamed from: n */
    private final C46180e f377397n;

    /* renamed from: o */
    private final AtomicReference f377398o;

    /* renamed from: p */
    private final AtomicReference f377399p;

    /* renamed from: q */
    private final boolean f377400q;

    /* renamed from: r */
    private final C43984e f377401r;

    /* renamed from: s */
    private final boolean f377402s;

    public C138754o(Context context, AccountId accountId, C137396a aVar, C139853b bVar, C69585o oVar, C71422aw awVar, C46128f fVar, C24030j jVar, C137531e eVar, C46180e eVar2, AtomicReference atomicReference, AtomicReference atomicReference2, boolean z, C43984e eVar3, boolean z2, boolean z3, boolean z4) {
        C71422aw awVar2 = awVar;
        C46128f fVar2 = fVar;
        AtomicReference atomicReference3 = atomicReference;
        AtomicReference atomicReference4 = atomicReference2;
        C69664n.m101061g(context, "context");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(aVar, "agsaClassicSearchData");
        C69664n.m101061g(oVar, "backgroundContext");
        C69664n.m101061g(awVar2, "lightweightScope");
        C69664n.m101061g(fVar2, "gcoreAccountName");
        C69664n.m101061g(atomicReference3, "requestData");
        C69664n.m101061g(atomicReference4, "m5RequestData");
        this.f377386a = context;
        this.f377392i = accountId;
        this.f377393j = aVar;
        this.f377387b = bVar;
        this.f377388c = oVar;
        this.f377394k = awVar2;
        this.f377395l = fVar2;
        this.f377396m = jVar;
        this.f377389d = eVar;
        this.f377397n = eVar2;
        this.f377398o = atomicReference3;
        this.f377399p = atomicReference4;
        this.f377400q = z;
        this.f377401r = eVar3;
        this.f377390e = z2;
        this.f377402s = z3;
        this.f377391f = z4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114507a(boolean r5, p5462h.p5466c.C69577g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138729a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.a r0 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138729a) r0
            int r1 = r0.f377307c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f377307c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.a r0 = new com.google.android.apps.search.googleapp.search.voicesearch.c.b.a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f377305a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f377307c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r6)
            goto L_0x0041
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r6)
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.h r6 = new com.google.android.apps.search.googleapp.search.voicesearch.c.b.h
            r2 = 0
            r6.<init>(r5, r4, r2)
            r0.f377307c = r3
            java.lang.Object r6 = kotlinx.coroutines.C71423ax.m104196a(r6, r0)
            if (r6 != r1) goto L_0x0041
            return r1
        L_0x0041:
            java.lang.String r5 = "private suspend fun base…arams(params).build()\n  }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138754o.mo114507a(boolean, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114508b(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138748i
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.i r0 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138748i) r0
            int r1 = r0.f377362d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f377362d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.i r0 = new com.google.android.apps.search.googleapp.search.voicesearch.c.b.i
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f377360b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f377362d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r6)
            goto L_0x0073
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0032:
            java.lang.Object r2 = r0.f377359a
            p5462h.C69714l.m101134b(r6)
            goto L_0x004c
        L_0x0038:
            p5462h.C69714l.m101134b(r6)
            com.google.apps.tiktok.account.data.b.e r6 = r5.f377397n
            com.google.common.util.concurrent.cx r6 = r6.mo50251a()
            r0.f377359a = r5
            r0.f377362d = r4
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)
            if (r6 == r1) goto L_0x0074
            r2 = r5
        L_0x004c:
            java.lang.String r4 = "incognitoStatusChecker.i…tAccountIncognito.await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r4)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r4 = 0
            if (r6 == 0) goto L_0x005b
            return r4
        L_0x005b:
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.o r2 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138754o) r2
            com.google.android.apps.search.googleapp.search.b.a r6 = r2.f377393j
            com.google.common.util.concurrent.cx r6 = r6.mo103981a()
            java.lang.String r2 = "agsaClassicSearchData.advertisingId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r2)
            r0.f377359a = r4
            r0.f377362d = r3
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)
            if (r6 != r1) goto L_0x0073
            return r1
        L_0x0073:
            return r6
        L_0x0074:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138754o.mo114508b(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114509c(boolean r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138749j
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.j r0 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138749j) r0
            int r1 = r0.f377366d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f377366d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.j r0 = new com.google.android.apps.search.googleapp.search.voicesearch.c.b.j
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f377364b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f377366d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r7 = r0.f377363a
            p5462h.C69714l.m101134b(r8)
            goto L_0x005e
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0031:
            p5462h.C69714l.m101134b(r8)
            if (r7 == 0) goto L_0x0039
            java.util.concurrent.atomic.AtomicReference r8 = r6.f377399p
            goto L_0x003b
        L_0x0039:
            java.util.concurrent.atomic.AtomicReference r8 = r6.f377398o
        L_0x003b:
            java.lang.Object r2 = r8.get()
            com.google.android.apps.search.googleapp.search.srp.e.as r2 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137768as) r2
            com.google.android.apps.search.googleapp.search.srp.e.as r4 = com.google.android.apps.search.googleapp.search.srp.p10435e.C137768as.f374783c
            boolean r4 = p5462h.p5473f.p5475b.C69664n.m101066l(r2, r4)
            if (r4 == 0) goto L_0x0068
            boolean r2 = r6.f377402s
            r4 = 0
            if (r2 == 0) goto L_0x0051
            if (r7 == 0) goto L_0x0051
            r4 = 1
        L_0x0051:
            r0.f377363a = r8
            r0.f377366d = r3
            java.lang.Object r7 = r6.mo114507a(r4, r0)
            if (r7 == r1) goto L_0x0067
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x005e:
            r2 = r8
            com.google.android.apps.search.googleapp.search.srp.e.as r2 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137768as) r2
            java.util.concurrent.atomic.AtomicReference r7 = (java.util.concurrent.atomic.AtomicReference) r7
            r7.set(r2)
            goto L_0x006d
        L_0x0067:
            return r1
        L_0x0068:
            java.lang.String r7 = "result"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r7)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138754o.mo114509c(boolean, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114510d(p5462h.p5466c.C69577g r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138750k
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.k r0 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138750k) r0
            int r1 = r0.f377371e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f377371e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.k r0 = new com.google.android.apps.search.googleapp.search.voicesearch.c.b.k
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f377369c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f377371e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r1 = r0.f377368b
            java.lang.Object r0 = r0.f377367a
            p5462h.C69714l.m101134b(r7)
            goto L_0x007a
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0036:
            java.lang.Object r2 = r0.f377367a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0052
        L_0x003c:
            p5462h.C69714l.m101134b(r7)
            r0.f377367a = r6
            r0.f377371e = r4
            com.google.apps.tiktok.account.data.a.f r7 = r6.f377395l
            com.google.apps.tiktok.account.AccountId r2 = r6.f377392i
            com.google.common.util.concurrent.cx r7 = r7.mo50215b(r2)
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)
            if (r7 == r1) goto L_0x009b
            r2 = r6
        L_0x0052:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x005d
            java.lang.Integer r7 = new java.lang.Integer
            r0 = 0
            r7.<init>(r0)
            return r7
        L_0x005d:
            r4 = r2
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.o r4 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138754o) r4
            com.google.android.apps.search.googleapp.search.b.a r4 = r4.f377393j
            com.google.common.util.concurrent.cx r4 = r4.mo103985e(r7)
            java.lang.String r5 = "agsaClassicSearchData.ge…nicornStatus(accountName)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            r0.f377367a = r2
            r0.f377368b = r7
            r0.f377371e = r3
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r4, r0)
            if (r0 == r1) goto L_0x009b
            r1 = r7
            r7 = r0
            r0 = r2
        L_0x007a:
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 != 0) goto L_0x007f
            goto L_0x0095
        L_0x007f:
            int r2 = r7.intValue()
            if (r2 != 0) goto L_0x0095
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.o r0 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138754o) r0
            kotlinx.coroutines.aw r2 = r0.f377394k
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.l r3 = new com.google.android.apps.search.googleapp.search.voicesearch.c.b.l
            java.lang.String r1 = (java.lang.String) r1
            r4 = 0
            r3.<init>(r0, r1, r4)
            r0 = 3
            kotlinx.coroutines.C71803m.m105043d(r2, r4, r4, r3, r0)
        L_0x0095:
            java.lang.String r0 = "unicornStatus"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r0)
            return r7
        L_0x009b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138754o.mo114510d(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        if (kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0) != r1) goto L_0x008f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114511e(java.lang.String r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138752m
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.m r0 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138752m) r0
            int r1 = r0.f377379e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f377379e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.m r0 = new com.google.android.apps.search.googleapp.search.voicesearch.c.b.m
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f377377c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f377379e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            p5462h.C69714l.m101134b(r7)     // Catch:{ Exception -> 0x002a }
            goto L_0x008f
        L_0x002a:
            r6 = move-exception
            goto L_0x007c
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.f377376b
            java.lang.Object r2 = r0.f377375a
            p5462h.C69714l.m101134b(r7)     // Catch:{ Exception -> 0x002a }
            goto L_0x0059
        L_0x003c:
            p5462h.C69714l.m101134b(r7)
            com.google.android.libraries.kids.a.a.j r7 = r5.f377396m     // Catch:{ Exception -> 0x002a }
            com.google.apps.tiktok.account.AccountId r2 = r5.f377392i     // Catch:{ Exception -> 0x002a }
            com.google.common.util.concurrent.cx r7 = r7.mo29426a(r2, r4)     // Catch:{ Exception -> 0x002a }
            java.lang.String r2 = "supervisedAccounts.getSupervisionInfo(accountId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r2)     // Catch:{ Exception -> 0x002a }
            r0.f377375a = r5     // Catch:{ Exception -> 0x002a }
            r0.f377376b = r6     // Catch:{ Exception -> 0x002a }
            r0.f377379e = r4     // Catch:{ Exception -> 0x002a }
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)     // Catch:{ Exception -> 0x002a }
            if (r7 == r1) goto L_0x007b
            r2 = r5
        L_0x0059:
            com.google.android.libraries.kids.a.a.k r7 = (com.google.android.libraries.kids.p1982a.p1983a.C24031k) r7     // Catch:{ Exception -> 0x002a }
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.o r2 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138754o) r2     // Catch:{ Exception -> 0x002a }
            com.google.android.apps.search.googleapp.search.b.a r2 = r2.f377393j     // Catch:{ Exception -> 0x002a }
            boolean r7 = r7.mo29422c()     // Catch:{ Exception -> 0x002a }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x002a }
            com.google.common.util.concurrent.cx r6 = r2.mo103990j(r7, r6)     // Catch:{ Exception -> 0x002a }
            java.lang.String r7 = "agsaClassicSearchData.up…o.isUnicorn, accountName)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)     // Catch:{ Exception -> 0x002a }
            r7 = 0
            r0.f377375a = r7     // Catch:{ Exception -> 0x002a }
            r0.f377376b = r7     // Catch:{ Exception -> 0x002a }
            r0.f377379e = r3     // Catch:{ Exception -> 0x002a }
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)     // Catch:{ Exception -> 0x002a }
            if (r6 != r1) goto L_0x008f
        L_0x007b:
            return r1
        L_0x007c:
            com.google.common.f.a.d r7 = f377385h
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.a.a r7 = (com.google.common.p4526f.p4527a.C58970a) r7
            com.google.common.f.x r6 = r7.mo56382g(r6)
            com.google.common.f.a.a r6 = (com.google.common.p4526f.p4527a.C58970a) r6
            java.lang.String r7 = "fail to refresh unicorn status"
            r6.mo56386p(r7)
        L_0x008f:
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138754o.mo114511e(java.lang.String, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114512f(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138753n
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.n r0 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138753n) r0
            int r1 = r0.f377383d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f377383d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.n r0 = new com.google.android.apps.search.googleapp.search.voicesearch.c.b.n
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f377381b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f377383d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0088
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0032:
            java.lang.Object r2 = r0.f377380a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0048
        L_0x0038:
            p5462h.C69714l.m101134b(r8)
            com.google.android.libraries.web.profile.a.a.a.e r8 = r7.f377401r
            r0.f377380a = r7
            r0.f377383d = r4
            java.lang.Object r8 = r8.mo46983b(r0)
            if (r8 == r1) goto L_0x008e
            r2 = r7
        L_0x0048:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x008b
            com.google.common.f.a.d r8 = f377385h
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.a.a r8 = (com.google.common.p4526f.p4527a.C58970a) r8
            com.google.common.f.aa r4 = com.google.android.libraries.search.integrations.p3018c.C38505d.f101864b
            java.lang.Integer r5 = new java.lang.Integer
            r6 = 149904833(0x8ef5dc1, float:1.4406331E-33)
            r5.<init>(r6)
            r8.mo56378ag(r4, r5)
            java.lang.String r4 = "Found stale cookie, remove all cookies"
            r8.mo56386p(r4)
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.o r2 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138754o) r2
            boolean r8 = r2.f377400q
            r4 = 0
            if (r8 != 0) goto L_0x007b
            android.webkit.CookieManager r8 = android.webkit.CookieManager.getInstance()
            r8.removeAllCookies(r4)
            r8.flush()
        L_0x007b:
            com.google.android.libraries.web.profile.a.a.a.e r8 = r2.f377401r
            r0.f377380a = r4
            r0.f377383d = r3
            java.lang.Object r8 = r8.mo46982a(r0)
            if (r8 != r1) goto L_0x0088
            return r1
        L_0x0088:
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x008b:
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x008e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138754o.mo114512f(h.c.g):java.lang.Object");
    }

    /* renamed from: g */
    public final String mo114513g() {
        try {
            return String.valueOf(Settings.Global.getInt(this.f377386a.getContentResolver(), "boot_count"));
        } catch (Settings.SettingNotFoundException unused) {
            return null;
        }
    }
}
