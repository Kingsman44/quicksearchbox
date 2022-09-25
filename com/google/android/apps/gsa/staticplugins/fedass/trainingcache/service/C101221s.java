package com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service;

import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.s */
/* compiled from: PG */
public final /* synthetic */ class C101221s implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C101202ad f282500a;

    /* renamed from: b */
    public final /* synthetic */ String f282501b;

    public /* synthetic */ C101221s(C101202ad adVar, String str) {
        this.f282500a = adVar;
        this.f282501b = str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo18058a() {
        /*
            r6 = this;
            com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.ad r0 = r6.f282500a
            java.lang.String r1 = r6.f282501b
            com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.TrainingCacheService r0 = r0.f282481a
            int r2 = r1.hashCode()
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r2) {
                case 301869162: goto L_0x002f;
                case 433244241: goto L_0x0025;
                case 963135632: goto L_0x001b;
                case 1400187184: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0039
        L_0x0011:
            java.lang.String r2 = "FedAss.SpeechPersonalization"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0039
            r2 = 1
            goto L_0x003a
        L_0x001b:
            java.lang.String r2 = "FedAss.FederatedLearning"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0039
            r2 = 0
            goto L_0x003a
        L_0x0025:
            java.lang.String r2 = "FedAss.TrainingAllowedAccount"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0039
            r2 = 2
            goto L_0x003a
        L_0x002f:
            java.lang.String r2 = "FedAss.PolicyConfigFileUri"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0039
            r2 = 3
            goto L_0x003a
        L_0x0039:
            r2 = -1
        L_0x003a:
            if (r2 == 0) goto L_0x00b0
            if (r2 == r5) goto L_0x00b0
            if (r2 == r4) goto L_0x0081
            if (r2 == r3) goto L_0x0053
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.TrainingCacheService.f282463a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r2 = "Unexpected pref key change : [%s]"
            r3 = 19894(0x4db6, float:2.7877E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56389s(r2, r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x00d2
        L_0x0053:
            com.google.android.apps.gsa.staticplugins.fedass.b.ag r0 = r0.f282464b
            dagger.a r1 = r0.f281665c
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.staticplugins.fedass.b.o r1 = (com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100784o) r1
            com.google.common.util.concurrent.cx r1 = r1.mo92049c()
            com.google.android.apps.gsa.staticplugins.fedass.a.h r1 = com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h.m166944c(r1)
            com.google.android.apps.gsa.staticplugins.fedass.b.u r2 = new com.google.android.apps.gsa.staticplugins.fedass.b.u
            r2.<init>(r0)
            com.google.android.apps.gsa.staticplugins.fedass.a.h r0 = r1.mo92036f(r2)
            com.google.android.apps.gsa.staticplugins.fedass.b.w r1 = com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100792w.f281709a
            r0.mo92038i(r1)
            com.google.common.util.concurrent.bs r0 = r0.f281631a
            com.google.android.apps.gsa.staticplugins.fedass.a.h r0 = com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h.m166944c(r0)
            com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.m r1 = com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.C101215m.f282494a
            r0.mo92038i(r1)
            com.google.common.util.concurrent.bs r0 = r0.f281631a
            goto L_0x00d2
        L_0x0081:
            dagger.a r1 = r0.f282465c
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.staticplugins.fedass.a.ab r1 = (com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100719ab) r1
            com.google.common.util.concurrent.cx r1 = r1.mo92018b()
            com.google.android.apps.gsa.staticplugins.fedass.a.h r1 = com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h.m166944c(r1)
            com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.b r2 = new com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.b
            r2.<init>(r0)
            com.google.android.apps.gsa.staticplugins.fedass.a.h r1 = r1.mo92036f(r2)
            com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.j r2 = com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.C101212j.f282491a
            r1.mo92038i(r2)
            com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.k r2 = new com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.k
            r2.<init>(r0)
            com.google.android.apps.gsa.staticplugins.fedass.a.h r0 = r1.mo92035e(r2)
            com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.l r1 = com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.C101214l.f282493a
            r0.mo92038i(r1)
            com.google.common.util.concurrent.bs r0 = r0.f281631a
            goto L_0x00d2
        L_0x00b0:
            com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.f r1 = new com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.f
            r1.<init>(r0)
            com.google.android.apps.gsa.staticplugins.fedass.a.h r1 = com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h.m166943a(r1)
            com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.g r2 = new com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.g
            r2.<init>(r0)
            com.google.android.apps.gsa.staticplugins.fedass.a.h r1 = r1.mo92035e(r2)
            com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.h r2 = new com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.h
            r2.<init>(r0)
            com.google.android.apps.gsa.staticplugins.fedass.a.h r0 = r1.mo92035e(r2)
            com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.i r1 = com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.C101211i.f282490a
            r0.mo92038i(r1)
            com.google.common.util.concurrent.bs r0 = r0.f281631a
        L_0x00d2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.C101221s.mo18058a():com.google.common.util.concurrent.cx");
    }
}
