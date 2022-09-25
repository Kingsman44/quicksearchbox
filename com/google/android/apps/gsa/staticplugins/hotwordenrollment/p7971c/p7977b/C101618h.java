package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b;

import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.h */
/* compiled from: PG */
public final /* synthetic */ class C101618h implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C101619i f283557a;

    public /* synthetic */ C101618h(C101619i iVar) {
        this.f283557a = iVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.i r0 = r5.f283557a
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.d r1 = r0.f283564g
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.j r2 = r0.f283561d
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r2 = r2.f283875b
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.k r1 = r1.f283550a
            r2.name()
            int r3 = r2.ordinal()
            r4 = 12
            if (r3 == r4) goto L_0x010d
            r4 = 19
            if (r3 == r4) goto L_0x00ea
            r4 = 20
            if (r3 == r4) goto L_0x00d4
            switch(r3) {
                case 1: goto L_0x00bb;
                case 2: goto L_0x00b4;
                case 3: goto L_0x00ad;
                case 4: goto L_0x00a6;
                case 5: goto L_0x00a6;
                case 6: goto L_0x0078;
                case 7: goto L_0x0078;
                case 8: goto L_0x0053;
                case 9: goto L_0x003d;
                default: goto L_0x0020;
            }
        L_0x0020:
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b.C101626p.f283578a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r2 = r2.name()
            r3 = 20364(0x4f8c, float:2.8536E-41)
            java.lang.String r4 = "Invalid hotword enrollment current screen: %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56389s(r4, r2)
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.e r1 = com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92381e.INVALID_SCREEN
            android.content.Intent r1 = com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92408n.m151739a(r1)
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.o r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101775o.m168406h(r1)
            goto L_0x0111
        L_0x003d:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.p r1 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b.C101626p) r1
            boolean r1 = r1.mo92450e()
            if (r1 == 0) goto L_0x004d
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m.VAA_CONSENT_SCREEN
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.o r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101775o.m168407i(r1)
            goto L_0x0111
        L_0x004d:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.o r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101775o.m168405g()
            goto L_0x0111
        L_0x0053:
            r2 = r1
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.p r2 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b.C101626p) r2
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.a r3 = r2.f283581d
            java.util.concurrent.atomic.AtomicBoolean r3 = r3.f284134a
            boolean r3 = r3.get()
            if (r3 != 0) goto L_0x0068
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m.FRESH_ENROLL_SCREEN
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.o r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101775o.m168407i(r1)
            goto L_0x0111
        L_0x0068:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.r r2 = r2.f283579b
            boolean r2 = r2.mo92432c()
            if (r2 == 0) goto L_0x0078
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m.SUMMARY_SCREEN
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.o r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101775o.m168407i(r1)
            goto L_0x0111
        L_0x0078:
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b.C101626p.f283578a
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "After Progress update screen or Enroll Screen."
            r4 = 20365(0x4f8d, float:2.8537E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            r2 = r1
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.p r2 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b.C101626p) r2
            boolean r3 = r2.mo92449d()
            if (r3 != 0) goto L_0x00ea
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r3 = r2.f283582e
            boolean r3 = r3.mo92337j()
            if (r3 == 0) goto L_0x00ea
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.r r2 = r2.f283579b
            boolean r2 = r2.mo92430a()
            if (r2 == 0) goto L_0x00ea
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m.HANDBACK_TO_PARENT_SCREEN
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.o r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101775o.m168407i(r1)
            goto L_0x0111
        L_0x00a6:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.p r1 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b.C101626p) r1
        L_0x00a8:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.o r1 = r1.mo92447b()
            goto L_0x0111
        L_0x00ad:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.p r1 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b.C101626p) r1
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.o r1 = r1.mo92446a()
            goto L_0x0111
        L_0x00b4:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.p r1 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b.C101626p) r1
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.o r1 = r1.mo92448c()
            goto L_0x0111
        L_0x00bb:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.p r1 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b.C101626p) r1
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r2 = r1.f283582e
            boolean r2 = r2.mo92337j()
            if (r2 == 0) goto L_0x00a8
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.r r2 = r1.f283579b
            boolean r2 = r2.mo92431b()
            if (r2 == 0) goto L_0x00a8
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m.UNICORN_GET_YOUR_PARENT_SCREEN
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.o r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101775o.m168404f(r1)
            goto L_0x0111
        L_0x00d4:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.p r1 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b.C101626p) r1
            com.google.android.apps.gsa.search.core.i.t r1 = r1.f283580c
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90068dt.f249706a
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x00e3
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m.PARENT_REAUTH_PERMISSION
            goto L_0x00e5
        L_0x00e3:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m.PARENT_SELECTOR
        L_0x00e5:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.o r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101775o.m168404f(r1)
            goto L_0x0111
        L_0x00ea:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.p r1 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b.C101626p) r1
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.r r2 = r1.f283579b
            boolean r2 = r2.mo92432c()
            if (r2 == 0) goto L_0x00fb
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m.SUMMARY_SCREEN
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.o r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101775o.m168407i(r1)
            goto L_0x0111
        L_0x00fb:
            boolean r1 = r1.mo92450e()
            if (r1 == 0) goto L_0x0108
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m.VAA_CONSENT_SCREEN
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.o r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101775o.m168407i(r1)
            goto L_0x0111
        L_0x0108:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.o r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101775o.m168405g()
            goto L_0x0111
        L_0x010d:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.o r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101775o.m168405g()
        L_0x0111:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r2 = r1.mo92549b()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r3 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m.NO_SCREEN
            if (r2 != r3) goto L_0x0129
            java.lang.Integer r2 = r1.mo92551d()
            int r2 = r2.intValue()
            android.content.Intent r1 = r1.mo92548a()
            r0.mo92443b(r2, r1)
            return
        L_0x0129:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r2 = r1.mo92549b()
            java.lang.Boolean r1 = r1.mo92550c()
            boolean r1 = r1.booleanValue()
            r0.mo92445d(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b.C101618h.run():void");
    }
}
