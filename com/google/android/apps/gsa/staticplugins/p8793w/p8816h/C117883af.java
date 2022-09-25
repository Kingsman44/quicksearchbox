package com.google.android.apps.gsa.staticplugins.p8793w.p8816h;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.af */
/* compiled from: PG */
final class C117883af extends C90888av {

    /* renamed from: a */
    final /* synthetic */ String f327153a;

    /* renamed from: b */
    final /* synthetic */ C117886ai f327154b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117883af(C117886ai aiVar, String str) {
        super("TTS completes", 2, 0);
        this.f327154b = aiVar;
        this.f327153a = str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:14|15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2 = com.google.android.apps.gsa.staticplugins.p8793w.p8816h.C117886ai.f327159a.mo56225c();
        r2.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "CarAssistantSessCtlr");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(18691)).mo56389s("Trying to open invalid url: %s", r6.f327153a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        r2 = com.google.android.apps.gsa.staticplugins.p8793w.p8816h.C117886ai.f327159a.mo56225c();
        r2.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "CarAssistantSessCtlr");
        r1 = 18692;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        r3 = com.google.android.apps.gsa.staticplugins.p8793w.p8816h.C117886ai.f327159a.mo56225c();
        r3.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "CarAssistantSessCtlr");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(18694)).mo56386p("Android Intent firing failed.");
        r6.f327154b.mo103472q(com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.CAR_ASSISTANT_SUGGESTION_NOT_HANDLED);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008e, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x004c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            java.lang.String r0 = "Android Intent firing failed."
            java.lang.String r1 = "CarAssistantSessCtlr"
            java.lang.String r2 = r6.f327153a     // Catch:{ URISyntaxException -> 0x004c }
            r3 = 1
            android.content.Intent r2 = android.content.Intent.parseUri(r2, r3)     // Catch:{ URISyntaxException -> 0x004c }
            com.google.android.apps.gsa.staticplugins.w.h.ai r3 = r6.f327154b     // Catch:{ URISyntaxException -> 0x004c }
            if (r2 == 0) goto L_0x0028
            java.lang.String r4 = r2.getAction()     // Catch:{ URISyntaxException -> 0x004c }
            if (r4 == 0) goto L_0x0028
            java.lang.String r4 = r2.getAction()     // Catch:{ URISyntaxException -> 0x004c }
            java.lang.String r5 = "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"
            boolean r4 = r4.equals(r5)     // Catch:{ URISyntaxException -> 0x004c }
            if (r4 == 0) goto L_0x0028
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ URISyntaxException -> 0x004c }
            android.content.Context r3 = r3.f327189c     // Catch:{ URISyntaxException -> 0x004c }
            com.google.android.apps.gsa.notificationlistener.C83395k.m132733d(r3)     // Catch:{ URISyntaxException -> 0x004c }
        L_0x0028:
            com.google.android.apps.gsa.staticplugins.w.h.ai r3 = r6.f327154b     // Catch:{ URISyntaxException -> 0x004c }
            com.google.android.apps.gsa.search.core.service.bd r3 = r3.f327197k     // Catch:{ URISyntaxException -> 0x004c }
            boolean r2 = r3.mo65089a(r2)     // Catch:{ URISyntaxException -> 0x004c }
            if (r2 != 0) goto L_0x0049
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.p8793w.p8816h.C117886ai.f327159a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r1)
            r1 = 18689(0x4901, float:2.6189E-41)
        L_0x003f:
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r1)).mo56386p(r0)
            com.google.android.apps.gsa.staticplugins.w.h.ai r0 = r6.f327154b
            com.google.android.apps.gsa.search.shared.service.b.um r1 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.CAR_ASSISTANT_SUGGESTION_NOT_HANDLED
            r0.mo103472q(r1)
        L_0x0049:
            return
        L_0x004a:
            r2 = move-exception
            goto L_0x0076
        L_0x004c:
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.p8793w.p8816h.C117886ai.f327159a     // Catch:{ all -> 0x004a }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x004a }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x004a }
            r2.mo56378ag(r3, r1)     // Catch:{ all -> 0x004a }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x004a }
            r3 = 18691(0x4903, float:2.6192E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ all -> 0x004a }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x004a }
            java.lang.String r3 = "Trying to open invalid url: %s"
            java.lang.String r4 = r6.f327153a     // Catch:{ all -> 0x004a }
            r2.mo56389s(r3, r4)     // Catch:{ all -> 0x004a }
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.p8793w.p8816h.C117886ai.f327159a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r1)
            r1 = 18692(0x4904, float:2.6193E-41)
            goto L_0x003f
        L_0x0076:
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.p8793w.p8816h.C117886ai.f327159a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r1)
            r1 = 18694(0x4906, float:2.6196E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r1)).mo56386p(r0)
            com.google.android.apps.gsa.staticplugins.w.h.ai r0 = r6.f327154b
            com.google.android.apps.gsa.search.shared.service.b.um r1 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.CAR_ASSISTANT_SUGGESTION_NOT_HANDLED
            r0.mo103472q(r1)
            goto L_0x008f
        L_0x008e:
            throw r2
        L_0x008f:
            goto L_0x008e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p8793w.p8816h.C117883af.run():void");
    }
}
