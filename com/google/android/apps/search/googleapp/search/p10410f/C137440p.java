package com.google.android.apps.search.googleapp.search.p10410f;

import com.google.apps.tiktok.monitoring.feedback.C47477n;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63086x;
import com.google.protobuf.C63088z;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.f.p */
/* compiled from: PG */
public final class C137440p {

    /* renamed from: a */
    public static final C59071e f373822a = C59071e.m91331h();

    /* renamed from: b */
    public final C47477n f373823b;

    /* renamed from: c */
    private final C137447w f373824c;

    /* renamed from: d */
    private final C71422aw f373825d;

    public C137440p(C137447w wVar, C47477n nVar, C71422aw awVar) {
        C69664n.m101061g(wVar, "searchDebugData");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f373824c = wVar;
        this.f373823b = nVar;
        this.f373825d = awVar;
    }

    /* renamed from: d */
    private final C46667e m223303d(C63088z zVar) {
        if (((C63086x) zVar).f170239a.length <= 5120) {
            return C46667e.KEY_VALUE;
        }
        return C46667e.TEXT;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.apps.search.googleapp.search.f.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.google.android.apps.search.googleapp.search.f.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.google.android.apps.search.googleapp.search.f.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo113728a(com.google.android.apps.search.googleapp.search.p10410f.C137441q r8, p5462h.p5466c.C69577g r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.apps.search.googleapp.search.p10410f.C137437m
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.apps.search.googleapp.search.f.m r0 = (com.google.android.apps.search.googleapp.search.p10410f.C137437m) r0
            int r1 = r0.f373816g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f373816g = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.f.m r0 = new com.google.android.apps.search.googleapp.search.f.m
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f373814e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f373816g
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r8 = r0.f373813d
            java.lang.Object r1 = r0.f373812c
            java.lang.Object r2 = r0.f373811b
            java.lang.Object r0 = r0.f373810a
            p5462h.C69714l.m101134b(r9)
            goto L_0x0061
        L_0x002f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0037:
            p5462h.C69714l.m101134b(r9)
            com.google.apps.tiktok.monitoring.feedback.k r9 = com.google.apps.tiktok.monitoring.feedback.C47475l.m84477g()
            r9.mo51310d(r3)
            r2 = r9
            com.google.apps.tiktok.monitoring.feedback.c r2 = (com.google.apps.tiktok.monitoring.feedback.C47465c) r2
            java.lang.String r4 = "com.google.android.googlequicksearchbox.USER_INITIATED_FEEDBACK_REPORT"
            r2.f123249a = r4
            com.google.android.apps.search.googleapp.search.f.w r2 = r7.f373824c
            r0.f373810a = r7
            r0.f373811b = r8
            r0.f373812c = r9
            java.lang.String r4 = "google_app_search"
            r0.f373813d = r4
            r0.f373816g = r3
            java.lang.Object r0 = r2.mo113741b(r0)
            if (r0 == r1) goto L_0x00ea
            r2 = r8
            r1 = r9
            r9 = r0
            r8 = r4
            r0 = r7
        L_0x0061:
            com.google.apps.tiktok.d.a.g r9 = (com.google.apps.tiktok.p3633d.p3634a.C46669g) r9
            com.google.apps.tiktok.monitoring.feedback.k r1 = (com.google.apps.tiktok.monitoring.feedback.C47474k) r1
            java.lang.String r8 = (java.lang.String) r8
            r1.mo51333f(r8, r9)
            com.google.android.apps.search.googleapp.search.f.q r2 = (com.google.android.apps.search.googleapp.search.p10410f.C137441q) r2
            com.google.android.apps.search.googleapp.search.f.l r8 = r2.f373826a
            com.google.android.apps.search.googleapp.search.f.l r9 = com.google.android.apps.search.googleapp.search.p10410f.C137436l.UNKNOWN
            int r8 = r8.ordinal()
            if (r8 == r3) goto L_0x0077
            goto L_0x007c
        L_0x0077:
            java.lang.String r8 = "Silk"
            r1.mo51334g(r8)
        L_0x007c:
            java.util.List r8 = r2.f373827b
            if (r8 == 0) goto L_0x00e0
            java.util.Iterator r8 = r8.iterator()
        L_0x0084:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00e0
            java.lang.Object r9 = r8.next()
            com.google.android.apps.search.googleapp.search.f.t r9 = (com.google.android.apps.search.googleapp.search.p10410f.C137444t) r9
            java.lang.String r2 = r9.f373831a
            boolean r4 = r9.f373833c
            java.lang.String r5 = "builder.build()"
            if (r4 == 0) goto L_0x00ba
            java.lang.String r9 = r9.f373832b
            com.google.protobuf.z r9 = com.google.protobuf.C63088z.m96143E(r9)
            com.google.apps.tiktok.d.a.a r4 = new com.google.apps.tiktok.d.a.a
            r4.<init>()
            r6 = r0
            com.google.android.apps.search.googleapp.search.f.p r6 = (com.google.android.apps.search.googleapp.search.p10410f.C137440p) r6
            com.google.apps.tiktok.d.a.e r6 = r6.m223303d(r9)
            r4.mo50686d(r6)
            r4.f121916a = r9
            r4.mo50684b(r3)
            com.google.apps.tiktok.d.a.g r9 = r4.mo50683a()
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r5)
            goto L_0x00dc
        L_0x00ba:
            java.lang.String r9 = r9.f373832b
            com.google.protobuf.z r9 = com.google.protobuf.C63088z.m96143E(r9)
            com.google.apps.tiktok.d.a.a r4 = new com.google.apps.tiktok.d.a.a
            r4.<init>()
            r6 = r0
            com.google.android.apps.search.googleapp.search.f.p r6 = (com.google.android.apps.search.googleapp.search.p10410f.C137440p) r6
            com.google.apps.tiktok.d.a.e r6 = r6.m223303d(r9)
            r4.mo50686d(r6)
            r4.f121916a = r9
            r9 = 0
            r4.mo50684b(r9)
            com.google.apps.tiktok.d.a.g r9 = r4.mo50683a()
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r5)
        L_0x00dc:
            r1.mo51333f(r2, r9)
            goto L_0x0084
        L_0x00e0:
            com.google.apps.tiktok.monitoring.feedback.l r8 = r1.mo51332e()
            java.lang.String r9 = "feedbackOptionsBuilder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)
            return r8
        L_0x00ea:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.p10410f.C137440p.mo113728a(com.google.android.apps.search.googleapp.search.f.q, h.c.g):java.lang.Object");
    }

    /* renamed from: b */
    public final void mo113729b() {
        mo113730c(new C137441q(C137436l.UNKNOWN, (List) null));
    }

    /* renamed from: c */
    public final void mo113730c(C137441q qVar) {
        C71803m.m105043d(this.f373825d, (C69585o) null, (C71424ay) null, new C137438n(this, qVar, (C69577g) null), 3).mo62873s(C137439o.f373821a);
    }
}
