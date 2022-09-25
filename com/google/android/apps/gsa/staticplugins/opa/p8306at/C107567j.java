package com.google.android.apps.gsa.staticplugins.opa.p8306at;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.at.j */
/* compiled from: PG */
public final /* synthetic */ class C107567j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C107571n f299235a;

    /* renamed from: b */
    public final /* synthetic */ C107570m f299236b;

    /* renamed from: c */
    public final /* synthetic */ C107572o f299237c;

    /* renamed from: d */
    public final /* synthetic */ int f299238d;

    public /* synthetic */ C107567j(C107571n nVar, C107570m mVar, C107572o oVar, int i) {
        this.f299235a = nVar;
        this.f299236b = mVar;
        this.f299237c = oVar;
        this.f299238d = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
        if (com.google.android.apps.gsa.shared.notificationlistening.collection.C90394ab.m147004b(r0) != false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            com.google.android.apps.gsa.staticplugins.opa.at.n r10 = r9.f299235a
            com.google.android.apps.gsa.staticplugins.opa.at.m r0 = r9.f299236b
            com.google.android.apps.gsa.staticplugins.opa.at.o r1 = r9.f299237c
            int r2 = r9.f299238d
            com.google.android.apps.gsa.staticplugins.opa.az.i r3 = r10.f299272c
            com.google.android.apps.gsa.search.shared.service.j r4 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.STOP_SPEAKING
            r4.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r5)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r4 = r4.mo82013a()
            r3.mo96219b(r4)
            com.google.android.apps.gsa.staticplugins.opa.az.i r3 = r10.f299272c
            com.google.android.apps.gsa.search.shared.service.j r4 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.STOP_LISTENING
            r4.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r5)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r4 = r4.mo82013a()
            r3.mo96219b(r4)
            android.widget.Button r0 = r0.f299254j
            r10.mo96027d(r0)
            com.google.android.apps.gsa.staticplugins.opa.chatui.MessageNotificationCarousel$MessageCarouselLayoutManager r0 = r10.f299279j
            if (r0 == 0) goto L_0x0034
            r3 = 0
            r0.f300894b = r3
        L_0x0034:
            java.lang.String r0 = r1.f299287e
            boolean r3 = r1 instanceof com.google.android.apps.gsa.staticplugins.opa.p8306at.C107558a
            r4 = 4
            if (r3 == 0) goto L_0x00e3
            com.google.android.apps.gsa.search.core.i.t r3 = r10.f299276g
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90025cd.f248140D
            boolean r3 = r3.mo79746e(r5)
            if (r3 == 0) goto L_0x004a
            boolean r3 = r1.f299289g
            if (r3 != 0) goto L_0x0055
            goto L_0x004f
        L_0x004a:
            androidx.core.app.s r3 = r1.f299286d
            if (r3 == 0) goto L_0x004f
            goto L_0x0055
        L_0x004f:
            boolean r3 = com.google.android.apps.gsa.shared.notificationlistening.collection.C90394ab.m147004b(r0)
            if (r3 == 0) goto L_0x00e3
        L_0x0055:
            java.lang.String r3 = r1.mo96010a()
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x00d5
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 == 0) goto L_0x0066
            goto L_0x00d5
        L_0x0066:
            r10.f299278i = r0
            com.google.common.util.concurrent.SettableFuture r4 = new com.google.common.util.concurrent.SettableFuture
            r4.<init>()
            r10.f299277h = r4
            com.google.common.util.concurrent.SettableFuture r4 = r10.f299277h
            com.google.android.apps.gsa.search.core.i.t r5 = r10.f299276g
            com.google.android.apps.gsa.shared.m.f r6 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247505iS
            long r5 = r5.mo79743a(r6)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            com.google.android.libraries.gsa.k.g r8 = r10.f299274e
            com.google.common.util.concurrent.cx r4 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148471e(r4, r5, r7, r8)
            com.google.android.apps.gsa.search.shared.service.b.qg r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C88130qg.f238240d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.qf r5 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88129qf) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.apps.gsa.search.shared.service.b.qg r6 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88130qg) r6
            r0.getClass()
            int r7 = r6.f238242a
            r7 = r7 | 1
            r6.f238242a = r7
            r6.f238243b = r0
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.android.apps.gsa.search.shared.service.b.qg r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88130qg) r0
            r3.getClass()
            int r6 = r0.f238242a
            r6 = r6 | 2
            r0.f238242a = r6
            r0.f238244c = r3
            com.google.protobuf.bv r0 = r5.build()
            com.google.android.apps.gsa.search.shared.service.b.qg r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88130qg) r0
            com.google.android.apps.gsa.search.shared.service.j r3 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.SEND_REPLY_TO_NOTIFICATION
            r3.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r5)
            com.google.protobuf.bt r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C88128qe.f238239a
            r3.mo82014b(r5, r0)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r0 = r3.mo82013a()
            com.google.android.apps.gsa.staticplugins.opa.az.i r3 = r10.f299272c
            r3.mo96219b(r0)
            com.google.android.libraries.gsa.k.g r0 = r10.f299273d
            com.google.android.apps.gsa.staticplugins.opa.at.l r3 = new com.google.android.apps.gsa.staticplugins.opa.at.l
            r3.<init>(r10, r1, r2)
            java.lang.String r10 = "replying message notification"
            r0.mo28211k(r4, r10, r3)
            return
        L_0x00d5:
            int r0 = r1.mo96033g()
            java.lang.String r1 = "Notification key or reply message is null."
            com.google.assistant.e.j.kg r1 = com.google.android.apps.gsa.staticplugins.opa.p8306at.C107571n.m178410c(r1)
            r10.mo96032i(r0, r4, r1, r2)
            return
        L_0x00e3:
            int r0 = r1.mo96033g()
            java.lang.String r1 = "The card is not an EditReplyCard or the replyAction is null."
            com.google.assistant.e.j.kg r1 = com.google.android.apps.gsa.staticplugins.opa.p8306at.C107571n.m178410c(r1)
            r10.mo96032i(r0, r4, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8306at.C107567j.onClick(android.view.View):void");
    }
}
