package com.google.android.libraries.web.profile.p3431a.p3437d.p3438a;

import com.google.android.libraries.web.base.C43234b;
import com.google.android.libraries.web.profile.Profile;
import com.google.android.libraries.web.profile.p3439b.C44065d;
import java.util.Map;
import kotlinx.coroutines.C71422aw;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.profile.a.d.a.c */
/* compiled from: PG */
public final class C44056c {

    /* renamed from: a */
    private final Profile f114715a;

    /* renamed from: b */
    private final C44065d f114716b;

    /* renamed from: c */
    private final C43234b f114717c;

    /* renamed from: d */
    private final Map f114718d;

    /* renamed from: e */
    private final C69585o f114719e;

    public C44056c(Profile profile, C44065d dVar, C43234b bVar, Map map, C71422aw awVar, C69585o oVar) {
        C69664n.m101061g(profile, "profile");
        C69664n.m101061g(map, "userAgentApis");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(oVar, "mainImmediateContext");
        this.f114715a = profile;
        this.f114716b = dVar;
        this.f114717c = bVar;
        this.f114718d = map;
        this.f114719e = oVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ee A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo47020a(p5462h.p5466c.C69577g r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.google.android.libraries.web.profile.p3431a.p3437d.p3438a.C44054a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.libraries.web.profile.a.d.a.a r0 = (com.google.android.libraries.web.profile.p3431a.p3437d.p3438a.C44054a) r0
            int r1 = r0.f114713d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f114713d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.web.profile.a.d.a.a r0 = new com.google.android.libraries.web.profile.a.d.a.a
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f114711b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f114713d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r5) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            p5462h.C69714l.m101134b(r9)
            goto L_0x00ef
        L_0x002c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0034:
            java.lang.Object r2 = r0.f114710a
            p5462h.C69714l.m101134b(r9)
            goto L_0x00aa
        L_0x003a:
            p5462h.C69714l.m101134b(r9)
            java.util.Map r9 = r8.f114718d
            com.google.android.libraries.web.profile.Profile r2 = r8.f114715a
            com.google.android.libraries.web.base.v r2 = r2.f114484b
            java.lang.Object r9 = r9.get(r2)
            if (r9 != 0) goto L_0x0090
            com.google.android.libraries.web.base.v r9 = com.google.android.libraries.web.base.C43271v.WEB_LAYER
            if (r2 != r9) goto L_0x0050
            java.lang.String r9 = "weblayer"
            goto L_0x0052
        L_0x0050:
            java.lang.String r9 = "webview"
        L_0x0052:
            int r0 = p5462h.p5473f.p5475b.C69649af.f186028a
            h.f.b.g r0 = new h.f.b.g
            java.lang.Class<com.google.android.libraries.web.a.c> r1 = com.google.android.libraries.web.p3343a.C43227c.class
            r0.<init>(r1)
            java.lang.String r0 = r0.mo61379b()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "No "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = " found for "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ". If this is a test, make sure you include java/com/google/android/libraries/web/"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = "/testing:emulator_module or robolectric_module. If this is not a test, make sure you include java/com/google/android/libraries/web/"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r9 = ":prod_module"
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r9)
            throw r0
        L_0x0090:
            g.a.a r9 = (p5460g.p5461a.C69464a) r9
            java.lang.Object r9 = r9.mo17428b()
            com.google.android.libraries.web.a.c r9 = (com.google.android.libraries.web.p3343a.C43227c) r9
            h.c.o r2 = r8.f114719e
            com.google.android.libraries.web.profile.a.d.a.b r6 = new com.google.android.libraries.web.profile.a.d.a.b
            r6.<init>(r9, r3)
            r0.f114710a = r8
            r0.f114713d = r5
            java.lang.Object r9 = kotlinx.coroutines.C71803m.m105040a(r2, r6, r0)
            if (r9 == r1) goto L_0x00f2
            r2 = r8
        L_0x00aa:
            java.lang.String r9 = (java.lang.String) r9
            com.google.android.libraries.web.profile.a.d.a.c r2 = (com.google.android.libraries.web.profile.p3431a.p3437d.p3438a.C44056c) r2
            com.google.android.libraries.web.base.b r6 = r2.f114717c
            boolean r6 = r6.f112983b
            if (r6 == 0) goto L_0x00c8
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r7 = 0
            r6[r7] = r9
            java.lang.String r9 = "%s GSA/1.2.3.4.arm64"
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r6, r5)
            java.lang.String r9 = java.lang.String.format(r9, r5)
            java.lang.String r5 = "format(format, *args)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r5)
        L_0x00c8:
            com.google.frameworks.client.data.android.ae r5 = new com.google.frameworks.client.data.android.ae
            r5.<init>()
            java.lang.String r6 = "User-Agent"
            com.google.frameworks.client.data.android.ad r6 = com.google.frameworks.client.data.android.C61362ad.m93870b(r6)
            r5.mo57932a(r6, r9)
            com.google.android.libraries.web.profile.b.d r9 = r2.f114716b
            com.google.android.libraries.web.profile.Profile r2 = r2.f114715a
            com.google.android.libraries.web.profile.b.c r9 = r9.mo47024a(r2)
            java.lang.String r2 = "https://www.google.com/gen_204"
            com.google.common.util.concurrent.cx r9 = r9.mo47023a(r2, r5)
            r0.f114710a = r3
            r0.f114713d = r4
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r9, r0)
            if (r9 != r1) goto L_0x00ef
            return r1
        L_0x00ef:
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        L_0x00f2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.profile.p3431a.p3437d.p3438a.C44056c.mo47020a(h.c.g):java.lang.Object");
    }
}
