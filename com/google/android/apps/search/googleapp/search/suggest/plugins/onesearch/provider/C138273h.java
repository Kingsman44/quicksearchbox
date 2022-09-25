package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider;

import android.content.Context;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138235n;
import com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138445bt;
import com.google.apps.tiktok.account.AccountId;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.h */
/* compiled from: PG */
public final class C138273h {

    /* renamed from: a */
    public final C71422aw f376201a;

    /* renamed from: b */
    private final Context f376202b;

    /* renamed from: c */
    private final C138445bt f376203c;

    /* renamed from: d */
    private final AccountId f376204d;

    /* renamed from: e */
    private final C138235n f376205e;

    public C138273h(Context context, C138445bt btVar, AccountId accountId, C138235n nVar, C71422aw awVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f376202b = context;
        this.f376203c = btVar;
        this.f376204d = accountId;
        this.f376205e = nVar;
        this.f376201a = awVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114226a(com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138255f r8, p5462h.p5466c.C69577g r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138270e
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.e r0 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138270e) r0
            int r1 = r0.f376192e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f376192e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.e r0 = new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.e
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f376190c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f376192e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 == r5) goto L_0x003e
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            p5462h.C69714l.m101134b(r9)
            goto L_0x00ad
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
            java.lang.Object r8 = r0.f376188a
            java.lang.String r8 = (java.lang.String) r8
            p5462h.C69714l.m101134b(r9)
            goto L_0x0079
        L_0x003e:
            java.lang.Object r8 = r0.f376189b
            java.lang.Object r2 = r0.f376188a
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.h r2 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138273h) r2
            p5462h.C69714l.m101134b(r9)
            goto L_0x0061
        L_0x0048:
            p5462h.C69714l.m101134b(r9)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.n r9 = r7.f376205e
            java.lang.String r2 = r8.f376154a
            java.lang.String r6 = "request.suggestionId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r6)
            r0.f376188a = r7
            r0.f376189b = r8
            r0.f376192e = r5
            java.lang.Object r9 = r9.mo114208b(r2, r0)
            if (r9 == r1) goto L_0x00b5
            r2 = r7
        L_0x0061:
            com.google.android.apps.search.googleapp.search.suggest.av r9 = (com.google.android.apps.search.googleapp.search.suggest.C138030av) r9
            r5 = 0
            if (r9 != 0) goto L_0x009a
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.f r8 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138255f) r8
            java.lang.String r8 = r8.f376154a
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.n r9 = r2.f376205e
            r0.f376188a = r8
            r0.f376189b = r5
            r0.f376192e = r4
            java.lang.Object r9 = r9.mo114209c(r0)
            if (r9 != r1) goto L_0x0079
            return r1
        L_0x0079:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Suggestion ["
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = "] not found in cache (size: "
            r0.append(r8)
            r0.append(r9)
            java.lang.String r8 = ")"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r8)
            throw r9
        L_0x009a:
            com.google.android.apps.search.googleapp.search.suggest.sources.a.bt r8 = r2.f376203c
            com.google.common.util.concurrent.cx r8 = r8.mo114251d(r9)
            r0.f376188a = r5
            r0.f376189b = r5
            r0.f376192e = r3
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r0)
            if (r8 != r1) goto L_0x00ad
            return r1
        L_0x00ad:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.h r8 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138257h.f376156a
            java.lang.String r9 = "getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)
            return r8
        L_0x00b5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138273h.mo114226a(com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.f, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114227b(com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138210br r9, p5462h.p5466c.C69577g r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138272g
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.g r0 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138272g) r0
            int r1 = r0.f376200e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f376200e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.g r0 = new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.g
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f376198c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f376200e
            r3 = 3
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L_0x0052
            if (r2 == r4) goto L_0x0046
            if (r2 == r5) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r9 = r0.f376197b
            com.google.android.apps.search.googleapp.search.suggest.av r9 = (com.google.android.apps.search.googleapp.search.suggest.C138030av) r9
            java.lang.Object r0 = r0.f376196a
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.h r0 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138273h) r0
            p5462h.C69714l.m101134b(r10)
            goto L_0x00bb
        L_0x0036:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003e:
            java.lang.Object r9 = r0.f376196a
            java.lang.String r9 = (java.lang.String) r9
            p5462h.C69714l.m101134b(r10)
            goto L_0x0081
        L_0x0046:
            java.lang.Object r9 = r0.f376197b
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.br r9 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138210br) r9
            java.lang.Object r2 = r0.f376196a
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.h r2 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138273h) r2
            p5462h.C69714l.m101134b(r10)
            goto L_0x006b
        L_0x0052:
            p5462h.C69714l.m101134b(r10)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.n r10 = r8.f376205e
            java.lang.String r2 = r9.f376046a
            java.lang.String r6 = "request.suggestionId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r6)
            r0.f376196a = r8
            r0.f376197b = r9
            r0.f376200e = r4
            java.lang.Object r10 = r10.mo114208b(r2, r0)
            if (r10 == r1) goto L_0x0122
            r2 = r8
        L_0x006b:
            com.google.android.apps.search.googleapp.search.suggest.av r10 = (com.google.android.apps.search.googleapp.search.suggest.C138030av) r10
            if (r10 != 0) goto L_0x00a2
            java.lang.String r9 = r9.f376046a
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.n r10 = r2.f376205e
            r0.f376196a = r9
            r2 = 0
            r0.f376197b = r2
            r0.f376200e = r5
            java.lang.Object r10 = r10.mo114209c(r0)
            if (r10 != r1) goto L_0x0081
            return r1
        L_0x0081:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Suggestion ["
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = "] not found in cache (size: "
            r0.append(r9)
            r0.append(r10)
            java.lang.String r9 = ")"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r9)
            throw r10
        L_0x00a2:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.n r4 = r2.f376205e
            java.lang.String r9 = r9.f376047b
            java.lang.String r6 = "request.responseId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r6)
            r0.f376196a = r2
            r0.f376197b = r10
            r0.f376200e = r3
            java.lang.Object r9 = r4.mo114207a(r9, r0)
            if (r9 == r1) goto L_0x0122
            r0 = r2
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x00bb:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.n r10 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138263n) r10
            if (r10 == 0) goto L_0x011a
            java.lang.String r10 = r10.f376172b
            if (r10 == 0) goto L_0x011a
            com.google.android.apps.search.googleapp.search.suggest.feedback.ao r1 = com.google.android.apps.search.googleapp.search.suggest.feedback.C138098ao.f375725f
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.feedback.am r1 = (com.google.android.apps.search.googleapp.search.suggest.feedback.C138096am) r1
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.search.googleapp.search.suggest.feedback.ao r2 = (com.google.android.apps.search.googleapp.search.suggest.feedback.C138098ao) r2
            r9.getClass()
            r2.f375730d = r9
            int r9 = r2.f375727a
            r9 = r9 | r5
            r2.f375727a = r9
            r1.copyOnWrite()
            com.google.protobuf.bv r9 = r1.instance
            com.google.android.apps.search.googleapp.search.suggest.feedback.ao r9 = (com.google.android.apps.search.googleapp.search.suggest.feedback.C138098ao) r9
            int r2 = r9.f375727a
            r2 = r2 | 4
            r9.f375727a = r2
            r9.f375731e = r10
            android.content.Intent r9 = new android.content.Intent
            android.content.Context r10 = r0.f376202b
            java.lang.Class<com.google.android.apps.search.googleapp.search.suggest.feedback.SuggestionFeedbackActivity> r2 = com.google.android.apps.search.googleapp.search.suggest.feedback.SuggestionFeedbackActivity.class
            r9.<init>(r10, r2)
            com.google.apps.tiktok.account.AccountId r10 = r0.f376204d
            com.google.apps.tiktok.account.api.controller.C45963aa.m82131a(r9, r10)
            java.lang.String r10 = "feedback_info"
            com.google.protobuf.bv r1 = r1.build()
            com.google.protobuf.contrib.android.ProtoParsers.m95531n(r9, r10, r1)
            r10 = 268468224(0x10008000, float:2.5342157E-29)
            r9.setFlags(r10)
            android.content.Context r10 = r0.f376202b
            com.google.apps.tiktok.tracing.C47810es.m84979s(r10, r9)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bt r9 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138212bt.f376049a
            java.lang.String r10 = "getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)
            return r9
        L_0x011a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Response not found in cache"
            r9.<init>(r10)
            throw r9
        L_0x0122:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138273h.mo114227b(com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.br, h.c.g):java.lang.Object");
    }
}
