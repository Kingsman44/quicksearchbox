package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.C129605c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.t */
/* compiled from: PG */
public final class C129604t implements C129605c {

    /* renamed from: a */
    private final C129601q f355719a;

    public C129604t(C129601q qVar) {
        this.f355719a = qVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo109121a(android.view.View r10, com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.NavigatorArgs$Transition.Data r11, p5462h.p5466c.C69577g r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b.C129602r
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.r r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b.C129602r) r0
            int r1 = r0.f355714f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f355714f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.r r0 = new com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.r
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f355712d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f355714f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            p5462h.C69714l.m101134b(r12)
            goto L_0x00d6
        L_0x002b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0033:
            java.lang.Object r10 = r0.f355711c
            java.lang.Object r11 = r0.f355710b
            java.lang.Object r2 = r0.f355709a
            p5462h.C69714l.m101134b(r12)
            r8 = r2
            r2 = r10
            r10 = r11
            r11 = r8
            goto L_0x00c0
        L_0x0042:
            p5462h.C69714l.m101134b(r12)
            java.lang.String r12 = "root"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r12)
            android.view.View r12 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b.C129601q.m211609h(r10)
            android.view.ViewGroup r2 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b.C129601q.m211610i(r10)
            java.util.List r12 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b.C129601q.m211607f(r12, r2)
            h.l.k r2 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b.C129601q.m211608g(r2)
            java.util.List r12 = p5462h.p5463a.C69540x.m100833O(r12, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r5 = 10
            int r5 = p5462h.p5463a.C69540x.m100804k(r12, r5)
            int r5 = p5462h.p5463a.C69505av.m100860b(r5)
            r6 = 16
            if (r5 >= r6) goto L_0x0070
            r5 = 16
        L_0x0070:
            r2.<init>(r5)
            java.util.Iterator r5 = r12.iterator()
        L_0x0077:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0090
            java.lang.Object r6 = r5.next()
            r7 = r6
            android.view.View r7 = (android.view.View) r7
            float r7 = r7.getAlpha()
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r2.put(r6, r7)
            goto L_0x0077
        L_0x0090:
            java.util.Iterator r12 = r12.iterator()
        L_0x0094:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x00a5
            java.lang.Object r5 = r12.next()
            android.view.View r5 = (android.view.View) r5
            r6 = 0
            r5.setAlpha(r6)
            goto L_0x0094
        L_0x00a5:
            boolean r12 = r11 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.NavigatorArgs$Transition.Data.Seamless
            if (r12 == 0) goto L_0x00bf
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.q r12 = r9.f355719a
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.NavigatorArgs$Transition$Data$Seamless r11 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.NavigatorArgs$Transition.Data.Seamless) r11
            int r11 = r11.f355870a
            r0.f355709a = r9
            r0.f355710b = r10
            r0.f355711c = r2
            r0.f355714f = r4
            java.lang.Object r11 = r12.mo109127e(r10, r11, r0)
            if (r11 == r1) goto L_0x00be
            goto L_0x00bf
        L_0x00be:
            return r1
        L_0x00bf:
            r11 = r9
        L_0x00c0:
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.t r11 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b.C129604t) r11
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.q r11 = r11.f355719a
            r12 = 0
            r0.f355709a = r12
            r0.f355710b = r12
            r0.f355711c = r12
            r0.f355714f = r3
            android.view.View r10 = (android.view.View) r10
            java.lang.Object r10 = r11.mo109125c(r10, r2, r0)
            if (r10 != r1) goto L_0x00d6
            return r1
        L_0x00d6:
            h.q r10 = p5462h.C69788q.f186170a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b.C129604t.mo109121a(android.view.View, com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.NavigatorArgs$Transition$Data, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo109122b(android.view.View r5, p5462h.p5466c.C69577g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b.C129603s
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.s r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b.C129603s) r0
            int r1 = r0.f355718d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f355718d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.s r0 = new com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.s
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f355716b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f355718d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r5 = r0.f355715a
            p5462h.C69714l.m101134b(r6)
            goto L_0x0040
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r6)
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.q r6 = r4.f355719a
            r0.f355715a = r5
            r0.f355718d = r3
            java.lang.Object r6 = r6.mo109126d(r5, r0)
            if (r6 == r1) goto L_0x005a
        L_0x0040:
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.NavigatorArgs$Transition$Data$Seamless r6 = new com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.NavigatorArgs$Transition$Data$Seamless
            android.view.View r5 = (android.view.View) r5
            android.view.View r5 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9837d.C129620h.m211640a(r5)
            if (r5 == 0) goto L_0x0052
            int r5 = r5.getHeight()
            r6.<init>(r5)
            return r6
        L_0x0052:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "For seamless transition there should be a shelf view presented in source fragment"
            r5.<init>(r6)
            throw r5
        L_0x005a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b.C129604t.mo109122b(android.view.View, h.c.g):java.lang.Object");
    }
}
