package com.google.android.apps.search.googleapp.search.voicesearch.p10467a;

import com.google.android.gms.search.queries.C145948p;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.a.i */
/* compiled from: PG */
public final class C138695i implements C138693g {

    /* renamed from: a */
    private final C145948p f377226a;

    public C138695i(C145948p pVar) {
        this.f377226a = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114468a(java.lang.String r10, p5462h.p5466c.C69577g r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.google.android.apps.search.googleapp.search.voicesearch.p10467a.C138694h
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.apps.search.googleapp.search.voicesearch.a.h r0 = (com.google.android.apps.search.googleapp.search.voicesearch.p10467a.C138694h) r0
            int r1 = r0.f377225c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f377225c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.voicesearch.a.h r0 = new com.google.android.apps.search.googleapp.search.voicesearch.a.h
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f377223a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f377225c
            r3 = 3
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0031
            if (r2 != r4) goto L_0x0029
            p5462h.C69714l.m101134b(r11)
            goto L_0x007d
        L_0x0029:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0031:
            p5462h.C69714l.m101134b(r11)
            com.google.common.b.gu r11 = com.google.android.gms.search.queries.p10874b.C145929a.f394530a
            com.google.common.b.gu r11 = com.google.android.gms.search.queries.p10874b.C145929a.f394530a
            java.lang.String r2 = "QR"
            boolean r11 = r11.contains(r2)
            if (r11 == 0) goto L_0x00ec
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            com.google.android.gms.search.queries.p10874b.C145929a.m237739b(r10, r11)
            com.google.android.gms.search.queries.b.e r10 = com.google.android.gms.search.queries.p10874b.C145929a.m237738a(r2, r11)
            java.lang.String r10 = r10.toString()
            com.google.android.gms.search.queries.p r11 = r9.f377226a
            com.google.android.gms.appdatasearch.w r2 = new com.google.android.gms.appdatasearch.w
            r2.<init>()
            java.lang.String r6 = "tng_voice_action"
            r2.f387614g = r6
            com.google.android.gms.appdatasearch.CorpusId r6 = new com.google.android.gms.appdatasearch.CorpusId
            java.lang.String r7 = "com.google.android.gms"
            java.lang.String r8 = "apps"
            r6.<init>(r7, r8, r5)
            r2.mo117756b(r6)
            r2.f387610c = r3
            com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification r2 = r2.mo117755a()
            com.google.android.gms.tasks.ab r10 = r11.mo122338b(r10, r4, r2)
            com.google.common.util.concurrent.cx r10 = com.google.android.libraries.p3339v.C43205e.m76192b(r10)
            r0.f377225c = r4
            java.lang.Object r11 = kotlinx.coroutines.p5578d.C71663i.m104690c(r10, r0)
            if (r11 == r1) goto L_0x00eb
        L_0x007d:
            com.google.android.gms.appdatasearch.SearchResults r11 = (com.google.android.gms.appdatasearch.SearchResults) r11
            java.lang.String r10 = "searchResults"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r10)
            java.lang.Object r10 = p5462h.p5463a.C69540x.m100820B(r11)
            com.google.android.gms.appdatasearch.al r10 = (com.google.android.gms.appdatasearch.C142796al) r10
            if (r10 == 0) goto L_0x00ea
            java.lang.String r11 = "intent_data"
            java.lang.String r10 = r10.mo117712h(r11)
            if (r10 == 0) goto L_0x00ea
            android.net.Uri r10 = android.net.Uri.parse(r10)
            java.lang.String r11 = "parse(uriString)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r11)
            java.util.List r11 = r10.getPathSegments()
            java.lang.String r0 = "content"
            java.lang.String r1 = r10.getScheme()
            boolean r0 = p5462h.p5473f.p5475b.C69664n.m101066l(r0, r1)
            if (r0 == 0) goto L_0x00de
            java.lang.String r10 = r10.getAuthority()
            java.lang.String r0 = "applications"
            boolean r10 = p5462h.p5473f.p5475b.C69664n.m101066l(r0, r10)
            if (r10 == 0) goto L_0x00de
            int r10 = r11.size()
            if (r10 != r3) goto L_0x00de
            r10 = 0
            java.lang.Object r10 = r11.get(r10)
            boolean r10 = p5462h.p5473f.p5475b.C69664n.m101066l(r0, r10)
            if (r10 != 0) goto L_0x00cb
            goto L_0x00de
        L_0x00cb:
            android.content.ComponentName r10 = new android.content.ComponentName
            java.lang.Object r0 = r11.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 2
            java.lang.Object r11 = r11.get(r1)
            java.lang.String r11 = (java.lang.String) r11
            r10.<init>(r0, r11)
            goto L_0x00df
        L_0x00de:
            r10 = r5
        L_0x00df:
            if (r10 == 0) goto L_0x00ea
            android.content.Intent r11 = new android.content.Intent
            r11.<init>()
            android.content.Intent r5 = r11.setComponent(r10)
        L_0x00ea:
            return r5
        L_0x00eb:
            return r1
        L_0x00ec:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Unexpected operator %sQR"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.voicesearch.p10467a.C138695i.mo114468a(java.lang.String, h.c.g):java.lang.Object");
    }
}
