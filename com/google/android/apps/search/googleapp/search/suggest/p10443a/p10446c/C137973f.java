package com.google.android.apps.search.googleapp.search.suggest.p10443a.p10446c;

import com.google.android.apps.search.googleapp.compliance.C133652s;
import com.google.android.apps.search.googleapp.search.p10405b.C137396a;
import com.google.android.apps.search.googleapp.search.suggest.C138081f;
import com.google.android.libraries.search.location.p3029a.C38586af;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.c.f */
/* compiled from: PG */
public final class C137973f implements C137968a {

    /* renamed from: a */
    public final C133652s f375373a;

    /* renamed from: b */
    public final C137396a f375374b;

    /* renamed from: c */
    private final C38586af f375375c;

    /* renamed from: d */
    private final C71422aw f375376d;

    public C137973f(C38586af afVar, C133652s sVar, C137396a aVar, C71422aw awVar) {
        C69664n.m101061g(afVar, "complianceLocationConsentDataService");
        C69664n.m101061g(aVar, "agsaClassicSearchData");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f375375c = afVar;
        this.f375373a = sVar;
        this.f375374b = aVar;
        this.f375376d = awVar;
    }

    /* renamed from: a */
    public final C60870cx mo114061a() {
        return C71663i.m104692e(this.f375376d, (C71424ay) null, new C137970c(this, (C69577g) null), 3);
    }

    /* renamed from: b */
    public final void mo114062b(C138081f fVar) {
        C69664n.m101061g(fVar, "notification");
        C71803m.m105043d(this.f375376d, (C69585o) null, (C71424ay) null, new C137972e(this, fVar, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114063c(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.googleapp.search.suggest.p10443a.p10446c.C137969b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.googleapp.search.suggest.a.c.b r0 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10446c.C137969b) r0
            int r1 = r0.f375363c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f375363c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.a.c.b r0 = new com.google.android.apps.search.googleapp.search.suggest.a.c.b
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f375361a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f375363c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r5)
            goto L_0x0045
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r5)
            com.google.android.apps.search.googleapp.search.b.a r5 = r4.f375374b
            com.google.common.util.concurrent.cx r5 = r5.mo103982b()
            java.lang.String r2 = "agsaClassicSearchData.lo…rmissionNotificationShown"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            r0.f375363c = r3
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r5 == r1) goto L_0x0070
        L_0x0045:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            com.google.android.apps.search.googleapp.search.suggest.f r0 = com.google.android.apps.search.googleapp.search.suggest.C138081f.f375684c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.c r0 = (com.google.android.apps.search.googleapp.search.suggest.C138070c) r0
            java.lang.String r1 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            com.google.android.apps.search.googleapp.search.suggest.b r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            java.lang.String r1 = "alreadyShown"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r1)
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0066
            com.google.android.apps.search.googleapp.search.suggest.e r5 = com.google.android.apps.search.googleapp.search.suggest.C138078e.NONE
            goto L_0x0068
        L_0x0066:
            com.google.android.apps.search.googleapp.search.suggest.e r5 = com.google.android.apps.search.googleapp.search.suggest.C138078e.FIRST_RUN
        L_0x0068:
            r0.mo114085b(r5)
            com.google.android.apps.search.googleapp.search.suggest.f r5 = r0.mo114084a()
            return r5
        L_0x0070:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.p10443a.p10446c.C137973f.mo114063c(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        if (r11 != r1) goto L_0x00a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0081 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0082 A[PHI: r11 
      PHI: (r11v12 java.lang.Object) = (r11v16 java.lang.Object), (r11v1 java.lang.Object) binds: [B:27:0x007f, B:12:0x002e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114064d(p5462h.p5466c.C69577g r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.apps.search.googleapp.search.suggest.p10443a.p10446c.C137971d
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.apps.search.googleapp.search.suggest.a.c.d r0 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10446c.C137971d) r0
            int r1 = r0.f375369d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f375369d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.a.c.d r0 = new com.google.android.apps.search.googleapp.search.suggest.a.c.d
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f375367b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f375369d
            java.lang.String r3 = "newBuilder()"
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r7) goto L_0x004b
            if (r2 == r6) goto L_0x0043
            if (r2 == r5) goto L_0x003a
            if (r2 != r4) goto L_0x0032
            p5462h.C69714l.m101134b(r11)
            goto L_0x0082
        L_0x0032:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x003a:
            java.lang.Object r0 = r0.f375366a
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            p5462h.C69714l.m101134b(r11)
            goto L_0x00c4
        L_0x0043:
            java.lang.Object r2 = r0.f375366a
            com.google.android.apps.search.googleapp.search.suggest.a.c.f r2 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10446c.C137973f) r2
            p5462h.C69714l.m101134b(r11)
            goto L_0x00a1
        L_0x004b:
            java.lang.Object r2 = r0.f375366a
            com.google.android.apps.search.googleapp.search.suggest.a.c.f r2 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10446c.C137973f) r2
            p5462h.C69714l.m101134b(r11)
            goto L_0x0067
        L_0x0053:
            p5462h.C69714l.m101134b(r11)
            com.google.android.libraries.search.location.a.af r11 = r10.f375375c
            com.google.common.util.concurrent.cx r11 = r11.mo41505a()
            r0.f375366a = r10
            r0.f375369d = r7
            java.lang.Object r11 = kotlinx.coroutines.p5578d.C71663i.m104690c(r11, r0)
            if (r11 == r1) goto L_0x0113
            r2 = r10
        L_0x0067:
            com.google.android.libraries.search.location.a.by r11 = (com.google.android.libraries.search.location.p3029a.C38633by) r11
            if (r11 != 0) goto L_0x006c
            goto L_0x0076
        L_0x006c:
            com.google.android.apps.search.googleapp.search.suggest.e r8 = com.google.android.apps.search.googleapp.search.suggest.C138078e.NONE
            int r11 = r11.ordinal()
            if (r11 == r7) goto L_0x00fa
            if (r11 == r6) goto L_0x0083
        L_0x0076:
            r11 = 0
            r0.f375366a = r11
            r0.f375369d = r4
            java.lang.Object r11 = r2.mo114063c(r0)
            if (r11 != r1) goto L_0x0082
            return r1
        L_0x0082:
            return r11
        L_0x0083:
            com.google.android.apps.search.googleapp.compliance.s r11 = r2.f375373a
            com.google.android.libraries.storage.protostore.ab r11 = r11.f364059a
            com.google.common.util.concurrent.cx r11 = r11.mo46042d()
            com.google.apps.tiktok.tracing.contrib.b.f r11 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r11)
            com.google.android.apps.search.googleapp.compliance.q r4 = com.google.android.apps.search.googleapp.compliance.C133650q.f364058a
            com.google.common.util.concurrent.bg r7 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.apps.tiktok.tracing.contrib.b.f r11 = r11.mo51515h(r4, r7)
            r0.f375366a = r2
            r0.f375369d = r6
            java.lang.Object r11 = kotlinx.coroutines.p5578d.C71663i.m104690c(r11, r0)
            if (r11 == r1) goto L_0x00f9
        L_0x00a1:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            com.google.android.libraries.search.location.a.af r2 = r2.f375375c
            com.google.android.libraries.storage.protostore.ab r2 = r2.f101992c
            com.google.common.util.concurrent.cx r2 = r2.mo46042d()
            com.google.apps.tiktok.tracing.contrib.b.f r2 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r2)
            com.google.android.libraries.search.location.a.k r4 = com.google.android.libraries.search.location.p3029a.C38667k.f102128a
            com.google.common.util.concurrent.bg r6 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.apps.tiktok.tracing.contrib.b.f r2 = r2.mo51515h(r4, r6)
            r0.f375366a = r11
            r0.f375369d = r5
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r2, r0)
            if (r0 == r1) goto L_0x00f9
            r9 = r0
            r0 = r11
            r11 = r9
        L_0x00c4:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            com.google.android.apps.search.googleapp.search.suggest.f r1 = com.google.android.apps.search.googleapp.search.suggest.C138081f.f375684c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.c r1 = (com.google.android.apps.search.googleapp.search.suggest.C138070c) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)
            com.google.android.apps.search.googleapp.search.suggest.b r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            java.lang.String r2 = "alreadyShown"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00ef
            java.lang.String r0 = "interactionWithConsent"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r0)
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x00ec
            goto L_0x00ef
        L_0x00ec:
            com.google.android.apps.search.googleapp.search.suggest.e r11 = com.google.android.apps.search.googleapp.search.suggest.C138078e.AADC_SETTINGS_CHANGED
            goto L_0x00f1
        L_0x00ef:
            com.google.android.apps.search.googleapp.search.suggest.e r11 = com.google.android.apps.search.googleapp.search.suggest.C138078e.NONE
        L_0x00f1:
            r1.mo114085b(r11)
            com.google.android.apps.search.googleapp.search.suggest.f r11 = r1.mo114084a()
            goto L_0x0112
        L_0x00f9:
            return r1
        L_0x00fa:
            com.google.android.apps.search.googleapp.search.suggest.f r11 = com.google.android.apps.search.googleapp.search.suggest.C138081f.f375684c
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.c r11 = (com.google.android.apps.search.googleapp.search.suggest.C138070c) r11
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r3)
            com.google.android.apps.search.googleapp.search.suggest.b r11 = p5462h.p5473f.p5475b.C69664n.m101061g(r11, "builder")
            com.google.android.apps.search.googleapp.search.suggest.e r0 = com.google.android.apps.search.googleapp.search.suggest.C138078e.NONE
            r11.mo114085b(r0)
            com.google.android.apps.search.googleapp.search.suggest.f r11 = r11.mo114084a()
        L_0x0112:
            return r11
        L_0x0113:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.p10443a.p10446c.C137973f.mo114064d(h.c.g):java.lang.Object");
    }
}
