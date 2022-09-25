package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138235n;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import java.util.Map;
import kotlinx.coroutines.C71422aw;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.s */
/* compiled from: PG */
public final class C138309s {

    /* renamed from: b */
    private static final C59071e f376291b = C59071e.m91331h();

    /* renamed from: a */
    public final C71422aw f376292a;

    /* renamed from: c */
    private final Context f376293c;

    /* renamed from: d */
    private final C138235n f376294d;

    /* renamed from: e */
    private final C138165m f376295e;

    public C138309s(Context context, C71422aw awVar, C138235n nVar, C138165m mVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f376293c = context;
        this.f376292a = awVar;
        this.f376294d = nVar;
        this.f376295e = mVar;
    }

    /* renamed from: e */
    private final Intent m224657e(Uri uri) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(uri);
        intent.setFlags(268468224);
        return intent;
    }

    /* renamed from: f */
    private final Intent m224658f(String str, String str2, Map map, long j) {
        C137416e eVar = (C137416e) C137418g.f373767r.createBuilder();
        eVar.copyOnWrite();
        C137418g gVar = (C137418g) eVar.instance;
        str.getClass();
        gVar.f373769a |= 1;
        gVar.f373770b = str;
        eVar.mo113713a(map);
        eVar.copyOnWrite();
        C137418g gVar2 = (C137418g) eVar.instance;
        gVar2.f373769a |= 4;
        gVar2.f373772d = j;
        C62942bv build = eVar.build();
        C69664n.m101060f(build, "newBuilder()\n        .se…ionTime)\n        .build()");
        C136128i l = C136129j.m221208l();
        l.mo112776k(C139779t.SEARCH);
        l.mo112775j(Optional.m71637of((C137418g) build));
        C136129j a = l.mo112766a();
        Intent intent = new Intent();
        C136127h.m221196a(intent, a);
        intent.putExtra("source", str2);
        intent.setFlags(268533760);
        return intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114235a(com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138246cb r5, p5462h.p5466c.C69577g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138303m
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.m r0 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138303m) r0
            int r1 = r0.f376265c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f376265c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.m r0 = new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.m
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f376263a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f376265c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r6)
            goto L_0x0067
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r6)
            int r6 = r5.f376129a
            r6 = r6 & 4
            if (r6 == 0) goto L_0x0048
            int r5 = r5.f376135g
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.af r5 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138171af.m224536a(r5)
            if (r5 != 0) goto L_0x0042
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.af r5 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138171af.ENTRY_POINT_UNKNOWN
        L_0x0042:
            java.lang.String r6 = "sessionSummaryLog.entryPoint"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            goto L_0x007b
        L_0x0048:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.n r6 = r4.f376294d
            com.google.protobuf.cq r5 = r5.f376130b
            java.lang.String r2 = "sessionSummaryLog.suggestionsList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            java.lang.Object r5 = p5462h.p5463a.C69540x.m100824F(r5)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bp r5 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138208bp) r5
            if (r5 == 0) goto L_0x005d
            java.lang.String r5 = r5.f376042c
            if (r5 != 0) goto L_0x005f
        L_0x005d:
            java.lang.String r5 = ""
        L_0x005f:
            r0.f376265c = r3
            java.lang.Object r6 = r6.mo114207a(r5, r0)
            if (r6 == r1) goto L_0x008d
        L_0x0067:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.n r6 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138263n) r6
            if (r6 == 0) goto L_0x0076
            int r5 = r6.f376176f
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.af r5 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138171af.m224536a(r5)
            if (r5 != 0) goto L_0x0077
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.af r5 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138171af.ENTRY_POINT_UNKNOWN
            goto L_0x0077
        L_0x0076:
            r5 = 0
        L_0x0077:
            if (r5 != 0) goto L_0x007b
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.af r5 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138171af.ENTRY_POINT_UNKNOWN
        L_0x007b:
            int r5 = r5.ordinal()
            if (r5 == r3) goto L_0x008a
            r6 = 2
            if (r5 == r6) goto L_0x0087
            java.lang.String r5 = "and.gsa.launcher.onesearch.unknown"
            goto L_0x008c
        L_0x0087:
            java.lang.String r5 = "and.gsa.launcher.onesearch.allapps"
            goto L_0x008c
        L_0x008a:
            java.lang.String r5 = "and.gsa.launcher.onesearch.psb"
        L_0x008c:
            return r5
        L_0x008d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138309s.mo114235a(com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cb, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114236b(java.lang.String r9, com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138246cb r10, p3186j$.time.Duration r11, p5462h.p5466c.C69577g r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138304n
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.n r0 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138304n) r0
            int r1 = r0.f376268c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f376268c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.n r0 = new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.n
            r0.<init>(r8, r12)
        L_0x0018:
            r7 = r0
            java.lang.Object r12 = r7.f376266a
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r7.f376268c
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x002a
            p5462h.C69714l.m101134b(r12)     // Catch:{ Exception -> 0x0028 }
            goto L_0x004c
        L_0x0028:
            r9 = move-exception
            goto L_0x004f
        L_0x002a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0032:
            p5462h.C69714l.m101134b(r12)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.m r1 = r8.f376295e     // Catch:{ Exception -> 0x0028 }
            if (r9 == 0) goto L_0x003c
            com.google.common.o.aod r12 = com.google.common.p4552o.aod.CLICKED_SUGGESTION     // Catch:{ Exception -> 0x0028 }
            goto L_0x003e
        L_0x003c:
            com.google.common.o.aod r12 = com.google.common.p4552o.aod.ENTER_KEY     // Catch:{ Exception -> 0x0028 }
        L_0x003e:
            r5 = r12
            r7.f376268c = r2     // Catch:{ Exception -> 0x0028 }
            r3 = 0
            r2 = r9
            r4 = r10
            r6 = r11
            java.lang.Object r12 = r1.mo114174e(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0028 }
            if (r12 != r0) goto L_0x004c
            return r0
        L_0x004c:
            com.google.common.o.apd r12 = (com.google.common.p4552o.apd) r12     // Catch:{ Exception -> 0x0028 }
            goto L_0x006e
        L_0x004f:
            com.google.common.f.e r10 = f376291b
            com.google.common.f.x r10 = r10.mo56226d()
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            com.google.common.f.x r9 = r10.mo56382g(r9)
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            com.google.common.f.n r10 = new com.google.common.f.n
            r11 = 41137(0xa0b1, float:5.7645E-41)
            r10.<init>(r11)
            r9.mo56379ah(r10)
            java.lang.String r10 = "Failed to log Suggest session"
            r9.mo56386p(r10)
            r12 = 0
        L_0x006e:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138309s.mo114236b(java.lang.String, com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cb, j$.time.Duration, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bx} */
    /* JADX WARNING: type inference failed for: r5v10, types: [java.util.Map] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114237c(com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138216bx r10, p5462h.p5466c.C69577g r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138306p
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.p r0 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138306p) r0
            int r1 = r0.f376279h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f376279h = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.p r0 = new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.p
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f376277f
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f376279h
            java.lang.String r3 = "request.sessionSummaryLog"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004e
            if (r2 == r5) goto L_0x0040
            if (r2 != r4) goto L_0x0038
            java.lang.Object r10 = r0.f376276e
            java.lang.Object r1 = r0.f376275d
            java.lang.Object r2 = r0.f376274c
            java.lang.Object r3 = r0.f376273b
            java.lang.Object r0 = r0.f376272a
            p5462h.C69714l.m101134b(r11)
        L_0x0035:
            r5 = r2
            goto L_0x00ec
        L_0x0038:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0040:
            java.lang.Object r10 = r0.f376274c
            java.lang.Object r2 = r0.f376273b
            java.lang.Object r5 = r0.f376272a
            p5462h.C69714l.m101134b(r11)
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r8
            goto L_0x0080
        L_0x004e:
            p5462h.C69714l.m101134b(r11)
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            int r2 = r10.f376060a
            r2 = r2 & 4
            if (r2 == 0) goto L_0x0094
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cb r2 = r10.f376063d
            if (r2 != 0) goto L_0x0062
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cb r2 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138246cb.f376127h
        L_0x0062:
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            long r6 = r10.f376062c
            j$.time.Duration r6 = p3186j$.time.Duration.ofMillis(r6)
            java.lang.String r7 = "ofMillis(request.submissionTimeMs)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            r0.f376272a = r9
            r0.f376273b = r10
            r0.f376274c = r11
            r0.f376279h = r5
            r5 = 0
            java.lang.Object r2 = r9.mo114236b(r5, r2, r6, r0)
            if (r2 == r1) goto L_0x0093
            r5 = r9
        L_0x0080:
            com.google.common.o.apd r2 = (com.google.common.p4552o.apd) r2
            if (r2 == 0) goto L_0x00ad
            r6 = r5
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.s r6 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138309s) r6
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.m r6 = r6.f376295e
            java.lang.String r6 = "gs_lp"
            java.lang.String r2 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m.m224528g(r2)
            r11.put(r6, r2)
            goto L_0x00ad
        L_0x0093:
            return r1
        L_0x0094:
            com.google.common.f.e r2 = f376291b
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.n r5 = new com.google.common.f.n
            r6 = 41138(0xa0b2, float:5.7647E-41)
            r5.<init>(r6)
            r2.mo56379ah(r5)
            java.lang.String r5 = "No suggest session sent with SearchGoogle request"
            r2.mo56386p(r5)
            r5 = r9
        L_0x00ad:
            r2 = r11
            r11 = r10
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bx r11 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138216bx) r11
            java.lang.String r6 = r11.f376061b
            android.net.Uri r6 = com.google.android.libraries.search.p3096r.C39905a.m69320a(r6)
            if (r6 == 0) goto L_0x00c1
            r10 = r5
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.s r10 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138309s) r10
            android.content.Intent r10 = r10.m224657e(r6)
            goto L_0x00fe
        L_0x00c1:
            java.lang.String r6 = r11.f376061b
            java.lang.String r7 = "request.query"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cb r11 = r11.f376063d
            if (r11 != 0) goto L_0x00ce
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cb r11 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138246cb.f376127h
        L_0x00ce:
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r3)
            r0.f376272a = r5
            r0.f376273b = r10
            r0.f376274c = r2
            r0.f376275d = r5
            r0.f376276e = r6
            r0.f376279h = r4
            r3 = r5
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.s r3 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138309s) r3
            java.lang.Object r11 = r3.mo114235a(r11, r0)
            if (r11 == r1) goto L_0x010d
            r3 = r10
            r0 = r5
            r1 = r0
            r10 = r6
            goto L_0x0035
        L_0x00ec:
            r4 = r11
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bx r3 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138216bx) r3
            long r6 = r3.f376062c
            r2 = r1
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.s r2 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138309s) r2
            r3 = r10
            java.lang.String r3 = (java.lang.String) r3
            android.content.Intent r10 = r2.m224658f(r3, r4, r5, r6)
            r5 = r0
        L_0x00fe:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.s r5 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138309s) r5
            android.content.Context r11 = r5.f376293c
            com.google.apps.tiktok.tracing.C47810es.m84979s(r11, r10)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bz r10 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138218bz.f376064a
            java.lang.String r11 = "getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r11)
            return r10
        L_0x010d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138309s.mo114237c(com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bx, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v44, resolved type: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cd} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0100, code lost:
        r2 = ((java.lang.Number) r2).intValue();
        r6.mo56379ah(new com.google.common.p4526f.C59094n(41139));
        r6.mo56352E(r5, r1, r2);
        r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138215bw) com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138216bx.f376058e.createBuilder();
        p5462h.p5473f.p5475b.C69664n.m101060f(r1, "newBuilder()");
        p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder");
        r12 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138248cd) r12;
        r2 = r12.f376139b;
        p5462h.p5473f.p5475b.C69664n.m101060f(r2, "request.searchQuery");
        p5462h.p5473f.p5475b.C69664n.m101061g(r2, "value");
        r1.copyOnWrite();
        r5 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138216bx) r1.instance;
        r2.getClass();
        r5.f376060a |= 1;
        r5.f376061b = r2;
        r5 = r12.f376140c;
        r1.copyOnWrite();
        r2 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138216bx) r1.instance;
        r2.f376060a = 2 | r2.f376060a;
        r2.f376062c = r5;
        r1 = r1.build();
        p5462h.p5473f.p5475b.C69664n.m101060f(r1, "_builder.build()");
        r3.f376283a = null;
        r3.f376284b = null;
        r3.f376285c = null;
        r3.f376286d = null;
        r3.f376287e = null;
        r3.f376290h = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x016f, code lost:
        if (r13.mo114237c((com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138216bx) r1, r3) != r4) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0171, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0172, code lost:
        r1 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138250cf.f376143a;
        p5462h.p5473f.p5475b.C69664n.m101060f(r1, "getDefaultInstance()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0177, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01ab, code lost:
        throw new java.lang.IllegalArgumentException("Suggestion [" + r1 + "] not found in cache (size: " + r2 + ")");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x021d, code lost:
        r2 = (com.google.common.p4552o.apd) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x021f, code lost:
        if (r2 == null) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0221, code lost:
        r10 = r13.f376295e;
        r5.put("gs_lp", com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m.m224528g(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x022c, code lost:
        r2 = com.google.android.apps.search.googleapp.search.suggest.C138029au.m224331a(r8.f375541d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0232, code lost:
        if (r2 != null) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0234, code lost:
        r2 = com.google.android.apps.search.googleapp.search.suggest.C138029au.QUERY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0238, code lost:
        if (r2 == com.google.android.apps.search.googleapp.search.suggest.C138029au.NAVIGATION) goto L_0x028c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x023a, code lost:
        r2 = com.google.android.apps.search.googleapp.search.suggest.C138029au.m224331a(r8.f375541d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0240, code lost:
        if (r2 != null) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0242, code lost:
        r2 = com.google.android.apps.search.googleapp.search.suggest.C138029au.QUERY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0246, code lost:
        if (r2 != com.google.android.apps.search.googleapp.search.suggest.C138029au.PERSONALIZED_NAVIGATION) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0249, code lost:
        r2 = com.google.android.libraries.search.p3096r.C39905a.m69320a(r8.f375539b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x024f, code lost:
        if (r2 == null) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0251, code lost:
        r1 = r13.m224657e(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0256, code lost:
        r2 = ((com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138248cd) r9).f376141d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x025b, code lost:
        if (r2 != null) goto L_0x025f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x025d, code lost:
        r2 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138246cb.f376127h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x025f, code lost:
        p5462h.p5473f.p5475b.C69664n.m101060f(r2, "request.sessionSummaryLog");
        r3.f376283a = r13;
        r3.f376284b = r9;
        r3.f376285c = r5;
        r3.f376286d = r13;
        r3.f376287e = r1;
        r3.f376290h = 6;
        r2 = r13.mo114235a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0273, code lost:
        if (r2 == r4) goto L_0x028b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0275, code lost:
        r15 = r1;
        r17 = r5;
        r6 = r9;
        r3 = r13;
        r14 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x027b, code lost:
        r1 = r14.m224658f(r15, (java.lang.String) r2, r17, ((com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138248cd) r6).f376140c);
        r13 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x028b, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x028c, code lost:
        r1 = r8.f375543g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x028e, code lost:
        if (r1 != null) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0290, code lost:
        r1 = com.google.p4017at.p4060h.p4073d.p4074a.C54228aq.f142328w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0292, code lost:
        r1 = r1.f142337i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0294, code lost:
        if (r1 != null) goto L_0x0298;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0296, code lost:
        r1 = com.google.p4017at.p4060h.p4073d.p4074a.C54250n.f142445d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0298, code lost:
        r1 = android.net.Uri.parse(r1.f142448b);
        p5462h.p5473f.p5475b.C69664n.m101060f(r1, "parse(suggestion.serverS…SuggestionParameters.url)");
        r1 = r13.m224657e(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02a7, code lost:
        com.google.apps.tiktok.tracing.C47810es.m84979s(r13.f376293c, r1);
        r1 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138250cf.f376143a;
        p5462h.p5473f.p5475b.C69664n.m101060f(r1, "getDefaultInstance()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02b1, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02b2, code lost:
        return r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114238d(com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138248cd r22, p5462h.p5466c.C69577g r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            boolean r3 = r2 instanceof com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138308r
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.r r3 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138308r) r3
            int r4 = r3.f376290h
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f376290h = r4
            goto L_0x001e
        L_0x0019:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.r r3 = new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.r
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f376288f
            h.c.a.a r4 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r5 = r3.f376290h
            java.lang.String r6 = "request.sessionSummaryLog"
            java.lang.String r7 = "getDefaultInstance()"
            r8 = 2
            java.lang.String r9 = "request.searchQuery"
            r10 = 1
            r11 = 0
            switch(r5) {
                case 0: goto L_0x00a0;
                case 1: goto L_0x0095;
                case 2: goto L_0x007e;
                case 3: goto L_0x0079;
                case 4: goto L_0x0070;
                case 5: goto L_0x0053;
                case 6: goto L_0x0038;
                default: goto L_0x0030;
            }
        L_0x0030:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0038:
            java.lang.Object r1 = r3.f376287e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r4 = r3.f376286d
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.s r4 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138309s) r4
            java.lang.Object r5 = r3.f376285c
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r3.f376284b
            java.lang.Object r3 = r3.f376283a
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.s r3 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138309s) r3
            p5462h.C69714l.m101134b(r2)
            r15 = r1
            r14 = r4
            r17 = r5
            goto L_0x027b
        L_0x0053:
            java.lang.Object r1 = r3.f376287e
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r5 = r3.f376286d
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r8 = r3.f376285c
            com.google.android.apps.search.googleapp.search.suggest.av r8 = (com.google.android.apps.search.googleapp.search.suggest.C138030av) r8
            java.lang.Object r9 = r3.f376284b
            java.lang.Object r10 = r3.f376283a
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.s r10 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138309s) r10
            p5462h.C69714l.m101134b(r2)
            r13 = r10
            r20 = r5
            r5 = r1
            r1 = r20
            goto L_0x021d
        L_0x0070:
            java.lang.Object r1 = r3.f376283a
            java.lang.String r1 = (java.lang.String) r1
            p5462h.C69714l.m101134b(r2)
            goto L_0x018b
        L_0x0079:
            p5462h.C69714l.m101134b(r2)
            goto L_0x0172
        L_0x007e:
            java.lang.Object r1 = r3.f376287e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r5 = r3.f376286d
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r3.f376285c
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            java.lang.Object r12 = r3.f376284b
            java.lang.Object r13 = r3.f376283a
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.s r13 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138309s) r13
            p5462h.C69714l.m101134b(r2)
            goto L_0x0100
        L_0x0095:
            java.lang.Object r1 = r3.f376284b
            java.lang.Object r5 = r3.f376283a
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.s r5 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138309s) r5
            p5462h.C69714l.m101134b(r2)
            r13 = r5
            goto L_0x00b9
        L_0x00a0:
            p5462h.C69714l.m101134b(r2)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.n r2 = r0.f376294d
            java.lang.String r5 = r1.f376138a
            java.lang.String r12 = "request.suggestionId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r12)
            r3.f376283a = r0
            r3.f376284b = r1
            r3.f376290h = r10
            java.lang.Object r2 = r2.mo114208b(r5, r3)
            if (r2 == r4) goto L_0x02b2
            r13 = r0
        L_0x00b9:
            com.google.android.apps.search.googleapp.search.suggest.av r2 = (com.google.android.apps.search.googleapp.search.suggest.C138030av) r2
            if (r2 != 0) goto L_0x01ac
            r2 = r1
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cd r2 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138248cd) r2
            java.lang.String r5 = r2.f376139b
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r9)
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x0179
            com.google.common.f.e r5 = f376291b
            com.google.common.f.x r5 = r5.mo56226d()
            r6 = r5
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.aa r5 = com.google.android.libraries.search.integrations.p3018c.C38505d.f101864b
            java.lang.Integer r12 = new java.lang.Integer
            r14 = 245540117(0xea2a515, float:4.009505E-30)
            r12.<init>(r14)
            r6.mo56378ag(r5, r12)
            java.lang.String r2 = r2.f376138a
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.n r5 = r13.f376294d
            r3.f376283a = r13
            r3.f376284b = r1
            r3.f376285c = r6
            java.lang.String r12 = "Suggestion [%s] not found in cache (size: %d); will use query string instead"
            r3.f376286d = r12
            r3.f376287e = r2
            r3.f376290h = r8
            java.lang.Object r5 = r5.mo114209c(r3)
            if (r5 == r4) goto L_0x0178
            r20 = r12
            r12 = r1
            r1 = r2
            r2 = r5
            r5 = r20
        L_0x0100:
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            com.google.common.f.n r14 = new com.google.common.f.n
            r15 = 41139(0xa0b3, float:5.7648E-41)
            r14.<init>(r15)
            r6.mo56379ah(r14)
            r6.mo56352E(r5, r1, r2)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bx r1 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138216bx.f376058e
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bw r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138215bw) r1
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            java.lang.String r2 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r2)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cd r12 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138248cd) r12
            java.lang.String r2 = r12.f376139b
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r9)
            java.lang.String r5 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r5)
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bx r5 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138216bx) r5
            r2.getClass()
            int r6 = r5.f376060a
            r6 = r6 | r10
            r5.f376060a = r6
            r5.f376061b = r2
            long r5 = r12.f376140c
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bx r2 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138216bx) r2
            int r9 = r2.f376060a
            r8 = r8 | r9
            r2.f376060a = r8
            r2.f376062c = r5
            com.google.protobuf.bv r1 = r1.build()
            java.lang.String r2 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bx r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138216bx) r1
            r3.f376283a = r11
            r3.f376284b = r11
            r3.f376285c = r11
            r3.f376286d = r11
            r3.f376287e = r11
            r2 = 3
            r3.f376290h = r2
            java.lang.Object r1 = r13.mo114237c(r1, r3)
            if (r1 != r4) goto L_0x0172
            return r4
        L_0x0172:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cf r1 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138250cf.f376143a
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r7)
            return r1
        L_0x0178:
            return r4
        L_0x0179:
            java.lang.String r1 = r2.f376138a
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.n r2 = r13.f376294d
            r3.f376283a = r1
            r3.f376284b = r11
            r5 = 4
            r3.f376290h = r5
            java.lang.Object r2 = r2.mo114209c(r3)
            if (r2 != r4) goto L_0x018b
            return r4
        L_0x018b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Suggestion ["
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = "] not found in cache (size: "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = ")"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
        L_0x01ac:
            com.google.at.h.d.a.aq r5 = r2.f375543g
            if (r5 != 0) goto L_0x01b2
            com.google.at.h.d.a.aq r5 = com.google.p4017at.p4060h.p4073d.p4074a.C54228aq.f142328w
        L_0x01b2:
            int r5 = r5.f142330a
            r5 = r5 & 64
            if (r5 == 0) goto L_0x01c7
            com.google.at.h.d.a.aq r5 = r2.f375543g
            if (r5 != 0) goto L_0x01be
            com.google.at.h.d.a.aq r5 = com.google.p4017at.p4060h.p4073d.p4074a.C54228aq.f142328w
        L_0x01be:
            com.google.at.h.d.a.l r5 = r5.f142338j
            if (r5 != 0) goto L_0x01c4
            com.google.at.h.d.a.l r5 = com.google.p4017at.p4060h.p4073d.p4074a.C54248l.f142431m
        L_0x01c4:
            java.lang.String r5 = r5.f142436d
            goto L_0x01c9
        L_0x01c7:
            java.lang.String r5 = r2.f375539b
        L_0x01c9:
            java.lang.String r8 = "if (suggestion.serverSug…  suggestion.text\n      }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r8)
            com.google.at.h.d.a.aq r8 = r2.f375543g
            if (r8 != 0) goto L_0x01d4
            com.google.at.h.d.a.aq r8 = com.google.p4017at.p4060h.p4073d.p4074a.C54228aq.f142328w
        L_0x01d4:
            com.google.at.h.d.a.ae r8 = r8.f142334f
            if (r8 != 0) goto L_0x01da
            com.google.at.h.d.a.ae r8 = com.google.p4017at.p4060h.p4073d.p4074a.C54216ae.f142285C
        L_0x01da:
            com.google.protobuf.dn r8 = r8.f142297h
            java.util.Map r8 = java.util.Collections.unmodifiableMap(r8)
            java.lang.String r9 = "suggestion.serverSuggest…s.extraSearchParameterMap"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)
            java.util.Map r8 = p5462h.p5463a.C69505av.m100876r(r8)
            r9 = r1
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cd r9 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138248cd) r9
            java.lang.String r10 = r9.f376138a
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cb r11 = r9.f376141d
            if (r11 != 0) goto L_0x01f4
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cb r11 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138246cb.f376127h
        L_0x01f4:
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r6)
            long r14 = r9.f376140c
            j$.time.Duration r9 = p3186j$.time.Duration.ofMillis(r14)
            java.lang.String r12 = "ofMillis(request.selectionTimeMs)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r12)
            r3.f376283a = r13
            r3.f376284b = r1
            r3.f376285c = r2
            r3.f376286d = r5
            r3.f376287e = r8
            r12 = 5
            r3.f376290h = r12
            java.lang.Object r9 = r13.mo114236b(r10, r11, r9, r3)
            if (r9 == r4) goto L_0x02b2
            r20 = r9
            r9 = r1
            r1 = r5
            r5 = r8
            r8 = r2
            r2 = r20
        L_0x021d:
            com.google.common.o.apd r2 = (com.google.common.p4552o.apd) r2
            if (r2 == 0) goto L_0x022c
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.m r10 = r13.f376295e
            java.lang.String r10 = "gs_lp"
            java.lang.String r2 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m.m224528g(r2)
            r5.put(r10, r2)
        L_0x022c:
            int r2 = r8.f375541d
            com.google.android.apps.search.googleapp.search.suggest.au r2 = com.google.android.apps.search.googleapp.search.suggest.C138029au.m224331a(r2)
            if (r2 != 0) goto L_0x0236
            com.google.android.apps.search.googleapp.search.suggest.au r2 = com.google.android.apps.search.googleapp.search.suggest.C138029au.QUERY
        L_0x0236:
            com.google.android.apps.search.googleapp.search.suggest.au r10 = com.google.android.apps.search.googleapp.search.suggest.C138029au.NAVIGATION
            if (r2 == r10) goto L_0x028c
            int r2 = r8.f375541d
            com.google.android.apps.search.googleapp.search.suggest.au r2 = com.google.android.apps.search.googleapp.search.suggest.C138029au.m224331a(r2)
            if (r2 != 0) goto L_0x0244
            com.google.android.apps.search.googleapp.search.suggest.au r2 = com.google.android.apps.search.googleapp.search.suggest.C138029au.QUERY
        L_0x0244:
            com.google.android.apps.search.googleapp.search.suggest.au r10 = com.google.android.apps.search.googleapp.search.suggest.C138029au.PERSONALIZED_NAVIGATION
            if (r2 != r10) goto L_0x0249
            goto L_0x028c
        L_0x0249:
            java.lang.String r2 = r8.f375539b
            android.net.Uri r2 = com.google.android.libraries.search.p3096r.C39905a.m69320a(r2)
            if (r2 == 0) goto L_0x0256
            android.content.Intent r1 = r13.m224657e(r2)
            goto L_0x02a7
        L_0x0256:
            r2 = r9
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cd r2 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138248cd) r2
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cb r2 = r2.f376141d
            if (r2 != 0) goto L_0x025f
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cb r2 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138246cb.f376127h
        L_0x025f:
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r6)
            r3.f376283a = r13
            r3.f376284b = r9
            r3.f376285c = r5
            r3.f376286d = r13
            r3.f376287e = r1
            r6 = 6
            r3.f376290h = r6
            java.lang.Object r2 = r13.mo114235a(r2, r3)
            if (r2 == r4) goto L_0x028b
            r15 = r1
            r17 = r5
            r6 = r9
            r3 = r13
            r14 = r3
        L_0x027b:
            r16 = r2
            java.lang.String r16 = (java.lang.String) r16
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cd r6 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138248cd) r6
            long r1 = r6.f376140c
            r18 = r1
            android.content.Intent r1 = r14.m224658f(r15, r16, r17, r18)
            r13 = r3
            goto L_0x02a7
        L_0x028b:
            return r4
        L_0x028c:
            com.google.at.h.d.a.aq r1 = r8.f375543g
            if (r1 != 0) goto L_0x0292
            com.google.at.h.d.a.aq r1 = com.google.p4017at.p4060h.p4073d.p4074a.C54228aq.f142328w
        L_0x0292:
            com.google.at.h.d.a.n r1 = r1.f142337i
            if (r1 != 0) goto L_0x0298
            com.google.at.h.d.a.n r1 = com.google.p4017at.p4060h.p4073d.p4074a.C54250n.f142445d
        L_0x0298:
            java.lang.String r1 = r1.f142448b
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r2 = "parse(suggestion.serverS…SuggestionParameters.url)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            android.content.Intent r1 = r13.m224657e(r1)
        L_0x02a7:
            android.content.Context r2 = r13.f376293c
            com.google.apps.tiktok.tracing.C47810es.m84979s(r2, r1)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cf r1 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138250cf.f376143a
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r7)
            return r1
        L_0x02b2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138309s.mo114238d(com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cd, h.c.g):java.lang.Object");
    }
}
