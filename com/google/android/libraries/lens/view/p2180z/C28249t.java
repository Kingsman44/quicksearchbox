package com.google.android.libraries.lens.view.p2180z;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.lens.view.z.t */
/* compiled from: PG */
public final /* synthetic */ class C28249t implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C28229ad f76900a;

    public /* synthetic */ C28249t(C28229ad adVar) {
        this.f76900a = adVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r9) {
        /*
            r8 = this;
            com.google.android.libraries.lens.view.z.ad r0 = r8.f76900a
            com.google.android.libraries.surveys.l r9 = (com.google.android.libraries.surveys.C43171l) r9
            com.google.android.libraries.surveys.SurveyMetadata r9 = r0.f76859b
            r9.getClass()
            android.app.Activity r5 = r0.f76858a
            r5.getClass()
            com.google.android.libraries.surveys.internal.b.b r0 = com.google.android.libraries.surveys.internal.p3322b.C43035b.f112558a
            com.google.android.libraries.surveys.internal.e.i r1 = new com.google.android.libraries.surveys.internal.e.i
            r1.<init>()
            java.util.concurrent.atomic.AtomicBoolean r7 = com.google.android.libraries.surveys.internal.p3322b.C43035b.f112559b
            monitor-enter(r7)
            com.google.android.libraries.surveys.internal.model.SurveyDataImpl r2 = r0.f112561d     // Catch:{ all -> 0x011f }
            if (r2 != 0) goto L_0x0025
            java.lang.String r9 = "SurveyController"
            java.lang.String r0 = "surveyData was null, bailing out."
            android.util.Log.w(r9, r0)     // Catch:{ all -> 0x011f }
            monitor-exit(r7)     // Catch:{ all -> 0x011f }
            return
        L_0x0025:
            java.lang.String r3 = r9.f112515a     // Catch:{ all -> 0x011f }
            java.lang.String r2 = r2.f112638a     // Catch:{ all -> 0x011f }
            boolean r2 = android.text.TextUtils.equals(r3, r2)     // Catch:{ all -> 0x011f }
            if (r2 != 0) goto L_0x0038
            java.lang.String r9 = "SurveyController"
            java.lang.String r0 = "Trigger IDs didn't match, bailing out."
            android.util.Log.w(r9, r0)     // Catch:{ all -> 0x011f }
            monitor-exit(r7)     // Catch:{ all -> 0x011f }
            return
        L_0x0038:
            java.lang.String r2 = r9.f112517c     // Catch:{ all -> 0x011f }
            com.google.android.libraries.surveys.internal.model.SurveyDataImpl r3 = r0.f112561d     // Catch:{ all -> 0x011f }
            java.lang.String r3 = r3.mo46094b()     // Catch:{ all -> 0x011f }
            boolean r2 = android.text.TextUtils.equals(r2, r3)     // Catch:{ all -> 0x011f }
            if (r2 != 0) goto L_0x004f
            java.lang.String r9 = "SurveyController"
            java.lang.String r0 = "Session IDs didn't match, bailing out."
            android.util.Log.w(r9, r0)     // Catch:{ all -> 0x011f }
            monitor-exit(r7)     // Catch:{ all -> 0x011f }
            return
        L_0x004f:
            java.lang.String r9 = r9.f112516b     // Catch:{ all -> 0x011f }
            com.google.android.libraries.surveys.internal.model.SurveyDataImpl r2 = r0.f112561d     // Catch:{ all -> 0x011f }
            java.lang.String r2 = r2.f112639b     // Catch:{ all -> 0x011f }
            boolean r9 = android.text.TextUtils.equals(r9, r2)     // Catch:{ all -> 0x011f }
            if (r9 != 0) goto L_0x0064
            java.lang.String r9 = "SurveyController"
            java.lang.String r0 = "Survey IDs didn't match, bailing out."
            android.util.Log.w(r9, r0)     // Catch:{ all -> 0x011f }
            monitor-exit(r7)     // Catch:{ all -> 0x011f }
            return
        L_0x0064:
            boolean r9 = r5 instanceof android.support.p031v4.app.C0167am     // Catch:{ all -> 0x011f }
            if (r9 == 0) goto L_0x00a1
            r9 = r5
            android.support.v4.app.am r9 = (android.support.p031v4.app.C0167am) r9     // Catch:{ all -> 0x011f }
            android.support.v4.app.FragmentManager r9 = r9.mo545jw()     // Catch:{ all -> 0x011f }
            java.lang.String r2 = com.google.android.libraries.surveys.internal.view.C43139cn.f112824a     // Catch:{ all -> 0x011f }
            android.support.v4.app.cc r3 = r9.f634a     // Catch:{ all -> 0x011f }
            android.support.v4.app.Fragment r2 = r3.mo671c(r2)     // Catch:{ all -> 0x011f }
            r3 = 1
            if (r2 == 0) goto L_0x0085
            android.support.v4.app.a r4 = new android.support.v4.app.a     // Catch:{ all -> 0x011f }
            r4.<init>((android.support.p031v4.app.FragmentManager) r9)     // Catch:{ all -> 0x011f }
            r4.mo516m(r2)     // Catch:{ all -> 0x011f }
            r4.mo505b(r3)     // Catch:{ all -> 0x011f }
        L_0x0085:
            java.lang.String r2 = "com.google.android.libraries.surveys.internal.PromptDialogFragment"
            android.support.v4.app.cc r4 = r9.f634a     // Catch:{ all -> 0x011f }
            android.support.v4.app.Fragment r2 = r4.mo671c(r2)     // Catch:{ all -> 0x011f }
            if (r2 == 0) goto L_0x009b
            android.support.v4.app.a r4 = new android.support.v4.app.a     // Catch:{ all -> 0x011f }
            r4.<init>((android.support.p031v4.app.FragmentManager) r9)     // Catch:{ all -> 0x011f }
            r4.mo516m(r2)     // Catch:{ all -> 0x011f }
            r4.mo505b(r3)     // Catch:{ all -> 0x011f }
            goto L_0x00d1
        L_0x009b:
            java.lang.String r9 = r0.f112568k     // Catch:{ all -> 0x011f }
            com.google.android.libraries.surveys.internal.view.C43129cd.m76092l(r5)     // Catch:{ all -> 0x011f }
            goto L_0x00d1
        L_0x00a1:
            android.app.FragmentManager r9 = r5.getFragmentManager()     // Catch:{ all -> 0x011f }
            java.lang.String r2 = com.google.android.libraries.surveys.internal.view.C43168z.f112865a     // Catch:{ all -> 0x011f }
            android.app.Fragment r2 = r9.findFragmentByTag(r2)     // Catch:{ all -> 0x011f }
            if (r2 == 0) goto L_0x00b8
            android.app.FragmentTransaction r3 = r9.beginTransaction()     // Catch:{ all -> 0x011f }
            android.app.FragmentTransaction r2 = r3.remove(r2)     // Catch:{ all -> 0x011f }
            r2.commitAllowingStateLoss()     // Catch:{ all -> 0x011f }
        L_0x00b8:
            java.lang.String r2 = "com.google.android.libraries.surveys.internal.PromptDialogFragment"
            android.app.Fragment r2 = r9.findFragmentByTag(r2)     // Catch:{ all -> 0x011f }
            if (r2 == 0) goto L_0x00cc
            android.app.FragmentTransaction r9 = r9.beginTransaction()     // Catch:{ all -> 0x011f }
            android.app.FragmentTransaction r9 = r9.remove(r2)     // Catch:{ all -> 0x011f }
            r9.commitAllowingStateLoss()     // Catch:{ all -> 0x011f }
            goto L_0x00d1
        L_0x00cc:
            java.lang.String r9 = r0.f112568k     // Catch:{ all -> 0x011f }
            com.google.android.libraries.surveys.internal.view.C43129cd.m76092l(r5)     // Catch:{ all -> 0x011f }
        L_0x00d1:
            java.lang.String r9 = r0.f112562e     // Catch:{ all -> 0x011f }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x011f }
            if (r9 == 0) goto L_0x00dc
            r9 = 0
        L_0x00da:
            r6 = r9
            goto L_0x00df
        L_0x00dc:
            java.lang.String r9 = r0.f112562e     // Catch:{ all -> 0x011f }
            goto L_0x00da
        L_0x00df:
            android.content.Context r9 = com.google.android.libraries.surveys.internal.p3328e.C43054c.f112610b     // Catch:{ all -> 0x011f }
            boolean r9 = p5304e.p5305a.p5306a.p5333ag.p5334a.C68351a.m98703c(r9)     // Catch:{ all -> 0x011f }
            boolean r9 = com.google.android.libraries.surveys.internal.p3328e.C43054c.m75960c(r9)     // Catch:{ all -> 0x011f }
            if (r9 == 0) goto L_0x011d
            com.google.android.libraries.surveys.internal.e.g r9 = com.google.android.libraries.surveys.internal.p3328e.C43058g.m75965a()     // Catch:{ all -> 0x011f }
            com.google.protos.be.a.a.a.bh r0 = com.google.protos.p4959be.p4960a.p4961a.p4962a.C64474bh.f174880c     // Catch:{ all -> 0x011f }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ all -> 0x011f }
            com.google.protos.be.a.a.a.au r0 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64460au) r0     // Catch:{ all -> 0x011f }
            com.google.protos.be.a.a.a.ay r2 = com.google.protos.p4959be.p4960a.p4961a.p4962a.C64464ay.f174856a     // Catch:{ all -> 0x011f }
            r0.copyOnWrite()     // Catch:{ all -> 0x011f }
            com.google.protobuf.bv r3 = r0.instance     // Catch:{ all -> 0x011f }
            com.google.protos.be.a.a.a.bh r3 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64474bh) r3     // Catch:{ all -> 0x011f }
            r2.getClass()     // Catch:{ all -> 0x011f }
            r3.f174883b = r2     // Catch:{ all -> 0x011f }
            r2 = 5
            r3.f174882a = r2     // Catch:{ all -> 0x011f }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x011f }
            r2 = r0
            com.google.protos.be.a.a.a.bh r2 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64474bh) r2     // Catch:{ all -> 0x011f }
            long r3 = r1.f112619a     // Catch:{ all -> 0x011f }
            com.google.protobuf.fg r3 = com.google.android.libraries.surveys.internal.p3328e.C43060i.m75976b(r3)     // Catch:{ all -> 0x011f }
            com.google.protobuf.ar r4 = r1.mo46080a()     // Catch:{ all -> 0x011f }
            r1 = r9
            r1.mo46078c(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x011f }
        L_0x011d:
            monitor-exit(r7)     // Catch:{ all -> 0x011f }
            return
        L_0x011f:
            r9 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x011f }
            goto L_0x0123
        L_0x0122:
            throw r9
        L_0x0123:
            goto L_0x0122
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2180z.C28249t.accept(java.lang.Object):void");
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
