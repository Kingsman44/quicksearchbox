package com.google.android.apps.search.googleapp.search.suggest.feedback;

import android.content.Context;
import com.google.android.apps.gsa.p8867w.p8879i.C118802c;
import com.google.android.apps.search.googleapp.search.p10405b.C137396a;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137940a;
import com.google.android.gms.feedback.C144206k;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.common.p4526f.p4527a.C58974d;
import kotlinx.coroutines.C71422aw;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.feedback.k */
/* compiled from: PG */
public final class C138109k {

    /* renamed from: a */
    public static final C58974d f375761a = C58974d.m91134h("FeedbackDataService");

    /* renamed from: b */
    public static final String f375762b = "com.google.autocomplete.MOBILE_SEARCHBOX_FEEDBACK";

    /* renamed from: c */
    public final AccountId f375763c;

    /* renamed from: d */
    public final C46175b f375764d;

    /* renamed from: e */
    public final C137396a f375765e;

    /* renamed from: f */
    public final C137940a f375766f;

    /* renamed from: g */
    public final Context f375767g;

    /* renamed from: h */
    public final C144206k f375768h;

    /* renamed from: i */
    public final C71422aw f375769i;

    /* renamed from: j */
    public final C118802c f375770j;

    /* renamed from: k */
    private final C69585o f375771k;

    public C138109k(AccountId accountId, C46175b bVar, C137396a aVar, C118802c cVar, C137940a aVar2, Context context, C144206k kVar, C71422aw awVar, C69585o oVar) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(bVar, "accountDataService");
        C69664n.m101061g(aVar, "agsaClassicSearchData");
        C69664n.m101061g(context, "context");
        C69664n.m101061g(kVar, "feedbackClient");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(oVar, "lightweightContext");
        this.f375763c = accountId;
        this.f375764d = bVar;
        this.f375765e = aVar;
        this.f375770j = cVar;
        this.f375766f = aVar2;
        this.f375767g = context;
        this.f375768h = kVar;
        this.f375769i = awVar;
        this.f375771k = oVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114151a(com.google.android.apps.search.googleapp.search.suggest.feedback.C138098ao r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.googleapp.search.suggest.feedback.C138104f
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.googleapp.search.suggest.feedback.f r0 = (com.google.android.apps.search.googleapp.search.suggest.feedback.C138104f) r0
            int r1 = r0.f375752c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f375752c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.feedback.f r0 = new com.google.android.apps.search.googleapp.search.suggest.feedback.f
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f375750a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f375752c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r7)
            goto L_0x0043
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002f:
            p5462h.C69714l.m101134b(r7)
            h.c.o r7 = r5.f375771k
            com.google.android.apps.search.googleapp.search.suggest.feedback.i r2 = new com.google.android.apps.search.googleapp.search.suggest.feedback.i
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f375752c = r3
            java.lang.Object r7 = kotlinx.coroutines.C71803m.m105040a(r7, r2, r0)
            if (r7 != r1) goto L_0x0043
            return r1
        L_0x0043:
            java.lang.String r6 = "@LegacySilentFeedbackCal…ck\"\n        )\n      }\n  }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.feedback.C138109k.mo114151a(com.google.android.apps.search.googleapp.search.suggest.feedback.ao, h.c.g):java.lang.Object");
    }
}
