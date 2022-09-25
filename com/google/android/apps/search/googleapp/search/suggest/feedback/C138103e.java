package com.google.android.apps.search.googleapp.search.suggest.feedback;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.suggest.feedback.FeedbackDataService$getAsyncPsds$2", mo61344c = "FeedbackDataService.kt", mo61345d = "invokeSuspend", mo61346e = {81, 83, 85, 88})
/* renamed from: com.google.android.apps.search.googleapp.search.suggest.feedback.e */
/* compiled from: PG */
final class C138103e extends C69572j implements C69630p {

    /* renamed from: a */
    Object f375744a;

    /* renamed from: b */
    Object f375745b;

    /* renamed from: c */
    Object f375746c;

    /* renamed from: d */
    int f375747d;

    /* renamed from: e */
    final /* synthetic */ C138109k f375748e;

    /* renamed from: f */
    private /* synthetic */ Object f375749f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138103e(C138109k kVar, C69577g gVar) {
        super(2, gVar);
        this.f375748e = kVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C138103e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: h.c.a.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: h.c.a.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: h.c.a.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: h.c.a.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: h.c.a.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: java.util.HashMap} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0126  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r13) {
        /*
            r12 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r12.f375747d
            r2 = 2
            r3 = 1
            r4 = 3
            r5 = 0
            if (r1 == 0) goto L_0x0054
            if (r1 == r3) goto L_0x003e
            if (r1 == r2) goto L_0x002d
            if (r1 == r4) goto L_0x0019
            java.lang.Object r0 = r12.f375749f
            java.util.Map r0 = (java.util.Map) r0
            p5462h.C69714l.m101134b(r13)
            goto L_0x011f
        L_0x0019:
            java.lang.Object r1 = r12.f375745b
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r12.f375744a
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r4 = r12.f375749f
            kotlinx.coroutines.be r4 = (kotlinx.coroutines.C71604be) r4
            p5462h.C69714l.m101134b(r13)
            r11 = r2
            r2 = r1
            r1 = r11
            goto L_0x00f3
        L_0x002d:
            java.lang.Object r1 = r12.f375745b
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r2 = r12.f375744a
            kotlinx.coroutines.be r2 = (kotlinx.coroutines.C71604be) r2
            java.lang.Object r6 = r12.f375749f
            kotlinx.coroutines.be r6 = (kotlinx.coroutines.C71604be) r6
            p5462h.C69714l.m101134b(r13)
            goto L_0x00c8
        L_0x003e:
            java.lang.Object r1 = r12.f375746c
            java.lang.Object r6 = r12.f375745b
            kotlinx.coroutines.be r6 = (kotlinx.coroutines.C71604be) r6
            java.lang.Object r7 = r12.f375744a
            kotlinx.coroutines.be r7 = (kotlinx.coroutines.C71604be) r7
            java.lang.Object r8 = r12.f375749f
            kotlinx.coroutines.be r8 = (kotlinx.coroutines.C71604be) r8
            p5462h.C69714l.m101134b(r13)
            r11 = r7
            r7 = r6
            r6 = r8
        L_0x0052:
            r8 = r11
            goto L_0x00a2
        L_0x0054:
            p5462h.C69714l.m101134b(r13)
            java.lang.Object r13 = r12.f375749f
            kotlinx.coroutines.aw r13 = (kotlinx.coroutines.C71422aw) r13
            com.google.android.apps.search.googleapp.search.suggest.feedback.a r1 = new com.google.android.apps.search.googleapp.search.suggest.feedback.a
            com.google.android.apps.search.googleapp.search.suggest.feedback.k r6 = r12.f375748e
            r1.<init>(r6, r5)
            kotlinx.coroutines.be r1 = kotlinx.coroutines.C71803m.m105042c(r13, r5, r5, r1, r4)
            com.google.android.apps.search.googleapp.search.suggest.feedback.d r6 = new com.google.android.apps.search.googleapp.search.suggest.feedback.d
            com.google.android.apps.search.googleapp.search.suggest.feedback.k r7 = r12.f375748e
            r6.<init>(r7, r5)
            kotlinx.coroutines.be r6 = kotlinx.coroutines.C71803m.m105042c(r13, r5, r5, r6, r4)
            com.google.android.apps.search.googleapp.search.suggest.feedback.c r7 = new com.google.android.apps.search.googleapp.search.suggest.feedback.c
            com.google.android.apps.search.googleapp.search.suggest.feedback.k r8 = r12.f375748e
            r7.<init>(r8, r5)
            kotlinx.coroutines.be r7 = kotlinx.coroutines.C71803m.m105042c(r13, r5, r5, r7, r4)
            com.google.android.apps.search.googleapp.search.suggest.feedback.b r8 = new com.google.android.apps.search.googleapp.search.suggest.feedback.b
            com.google.android.apps.search.googleapp.search.suggest.feedback.k r9 = r12.f375748e
            r8.<init>(r9, r5)
            kotlinx.coroutines.be r13 = kotlinx.coroutines.C71803m.m105042c(r13, r5, r5, r8, r4)
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r12.f375749f = r1
            r12.f375744a = r7
            r12.f375745b = r13
            r12.f375746c = r8
            r12.f375747d = r3
            java.lang.Object r6 = r6.mo62825a(r12)
            if (r6 == r0) goto L_0x0139
            r11 = r7
            r7 = r13
            r13 = r6
            r6 = r1
            r1 = r8
            goto L_0x0052
        L_0x00a2:
            com.google.android.apps.search.googleapp.search.b.c r13 = (com.google.android.apps.search.googleapp.search.p10405b.C137398c) r13
            com.google.android.apps.search.googleapp.search.suggest.feedback.t r9 = com.google.android.apps.search.googleapp.search.suggest.feedback.C138118t.LANGUAGE
            java.lang.String r9 = r9.f375795m
            java.lang.String r10 = "LANGUAGE.toString()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)
            java.lang.String r13 = r13.f373720b
            java.lang.String r10 = "querySettings.searchLanguageHl"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r10)
            r1.put(r9, r13)
            r12.f375749f = r6
            r12.f375744a = r8
            r12.f375745b = r1
            r12.f375746c = r5
            r12.f375747d = r2
            java.lang.Object r13 = r7.mo62825a(r12)
            if (r13 == r0) goto L_0x0139
            r2 = r8
        L_0x00c8:
            java.lang.String r13 = (java.lang.String) r13
            com.google.android.apps.search.googleapp.search.suggest.feedback.t r7 = com.google.android.apps.search.googleapp.search.suggest.feedback.C138118t.COUNTRY
            java.lang.String r7 = r7.f375795m
            java.lang.String r8 = "COUNTRY.toString()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            java.lang.String r13 = com.google.common.base.C58890d.m90989d(r13)
            java.lang.String r8 = "toUpperCase(countryCode)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r8)
            r1.put(r7, r13)
            r12.f375749f = r2
            r12.f375744a = r1
            java.lang.String r13 = "google"
            r12.f375745b = r13
            r12.f375747d = r4
            java.lang.Object r4 = r6.mo62825a(r12)
            if (r4 == r0) goto L_0x0139
            r11 = r2
            r2 = r13
            r13 = r4
            r4 = r11
        L_0x00f3:
            com.google.apps.tiktok.account.data.a r13 = (com.google.apps.tiktok.account.data.C46108a) r13
            com.google.apps.tiktok.account.data.j r13 = r13.mo50210b()
            java.lang.String r13 = r13.f121165j
            boolean r13 = p5462h.p5473f.p5475b.C69664n.m101066l(r2, r13)
            if (r13 == 0) goto L_0x010f
            com.google.android.apps.search.googleapp.search.suggest.feedback.t r13 = com.google.android.apps.search.googleapp.search.suggest.feedback.C138118t.SIGNED_IN
            java.lang.String r13 = r13.f375795m
            java.lang.String r2 = "SIGNED_IN.toString()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r2)
            java.lang.String r2 = "true"
            r1.put(r13, r2)
        L_0x010f:
            r12.f375749f = r1
            r12.f375744a = r5
            r12.f375745b = r5
            r13 = 4
            r12.f375747d = r13
            java.lang.Object r13 = r4.mo62825a(r12)
            if (r13 == r0) goto L_0x0139
            r0 = r1
        L_0x011f:
            com.google.android.apps.search.googleapp.search.suggest.a.b.y r13 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137965y) r13
            int r1 = r13.f375354a
            r1 = r1 & r3
            if (r1 == 0) goto L_0x0139
            com.google.android.apps.search.googleapp.search.suggest.feedback.t r1 = com.google.android.apps.search.googleapp.search.suggest.feedback.C138118t.PREVIOUS_QUERY
            java.lang.String r1 = r1.f375795m
            java.lang.String r2 = "PREVIOUS_QUERY.toString()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            java.lang.String r13 = r13.f375355b
            java.lang.String r2 = "previousQueryData.previousQuery"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r2)
            r0.put(r1, r13)
        L_0x0139:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.feedback.C138103e.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C138103e eVar = new C138103e(this.f375748e, gVar);
        eVar.f375749f = obj;
        return eVar;
    }
}
