package com.google.android.apps.search.googleapp.search.p10410f;

import com.google.android.apps.search.googleapp.p10516t.p10522f.C139706a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.web.contrib.debug.C43473e;
import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3633d.p3634a.C46669g;
import com.google.protobuf.C63088z;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.f.w */
/* compiled from: PG */
public final class C137447w implements C139706a {

    /* renamed from: a */
    public final C137429e f373841a;

    /* renamed from: b */
    public final C137425ab f373842b;

    /* renamed from: c */
    public final C71422aw f373843c;

    /* renamed from: d */
    private final C43473e f373844d;

    /* renamed from: e */
    private final C137449y f373845e;

    public C137447w(C137429e eVar, C43473e eVar2, C137449y yVar, C137425ab abVar, C71422aw awVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        this.f373841a = eVar;
        this.f373844d = eVar2;
        this.f373845e = yVar;
        this.f373842b = abVar;
        this.f373843c = awVar;
    }

    /* renamed from: a */
    public final void mo113740a(C37252a aVar) {
        C69664n.m101061g(aVar, "record");
        this.f373841a.mo113719a(aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo113741b(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.googleapp.search.p10410f.C137445u
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.googleapp.search.f.u r0 = (com.google.android.apps.search.googleapp.search.p10410f.C137445u) r0
            int r1 = r0.f373838e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f373838e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.f.u r0 = new com.google.android.apps.search.googleapp.search.f.u
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f373836c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f373838e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r1 = r0.f373835b
            java.lang.Object r0 = r0.f373834a
            p5462h.C69714l.m101134b(r6)
            goto L_0x0095
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0033:
            p5462h.C69714l.m101134b(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            com.google.android.apps.search.googleapp.search.f.e r2 = r5.f373841a
            r2.mo113720b(r6)
            com.google.android.libraries.web.contrib.debug.e r2 = r5.f373844d
            com.google.android.libraries.web.contrib.debug.f r4 = com.google.android.libraries.web.contrib.debug.C43474f.GOOGLE_APP_SEARCH
            com.google.apps.tiktok.d.a.g r2 = r2.mo46556a(r4)
            com.google.protobuf.z r2 = r2.mo50688b()
            java.nio.charset.Charset r4 = com.google.protobuf.C62972cr.f170009a
            java.lang.String r2 = r2.mo59170I(r4)
            r6.append(r2)
            com.google.android.apps.search.googleapp.search.f.y r2 = r5.f373845e
            r0.f373834a = r5
            r0.f373835b = r6
            r0.f373838e = r3
            com.google.android.apps.search.googleapp.j.e r0 = r2.f373848a
            boolean r0 = r0.mo112951a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "APVS Enabled: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r6.append(r0)
            r0 = 10
            r6.append(r0)
            boolean r2 = r2.f373849b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "APVS Actions Handover Enabled: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r6.append(r2)
            r6.append(r0)
            h.q r0 = p5462h.C69788q.f186170a
            if (r0 == r1) goto L_0x00c0
            r0 = r5
            r1 = r6
        L_0x0095:
            com.google.android.apps.search.googleapp.search.f.w r0 = (com.google.android.apps.search.googleapp.search.p10410f.C137447w) r0
            com.google.android.apps.search.googleapp.search.f.ab r6 = r0.f373842b
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            r6.mo113718b(r1)
            com.google.apps.tiktok.d.a.a r6 = new com.google.apps.tiktok.d.a.a
            r6.<init>()
            r0 = 0
            r6.mo50684b(r0)
            com.google.apps.tiktok.d.a.e r0 = com.google.apps.tiktok.p3633d.p3634a.C46667e.TEXT
            r6.mo50686d(r0)
            java.lang.String r0 = r1.toString()
            com.google.protobuf.z r0 = com.google.protobuf.C63088z.m96143E(r0)
            r6.f121916a = r0
            com.google.apps.tiktok.d.a.g r6 = r6.mo50683a()
            java.lang.String r0 = "builder()\n      .setCont…String()))\n      .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r0)
            return r6
        L_0x00c0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.p10410f.C137447w.mo113741b(h.c.g):java.lang.Object");
    }

    /* renamed from: c */
    public final C46669g mo113742c() {
        StringBuilder sb = new StringBuilder();
        this.f373841a.mo113720b(sb);
        this.f373842b.mo113718b(sb);
        C46663a aVar = new C46663a();
        aVar.mo50684b(false);
        aVar.mo50686d(C46667e.TEXT);
        aVar.f121916a = C63088z.m96143E(sb.toString());
        C46669g a = aVar.mo50683a();
        C69664n.m101060f(a, "builder()\n      .setCont…String()))\n      .build()");
        return a;
    }
}
