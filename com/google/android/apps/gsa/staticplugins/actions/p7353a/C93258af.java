package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.af */
/* compiled from: PG */
final class C93258af extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C93262aj f260028a;

    /* renamed from: b */
    final /* synthetic */ SettableFuture f260029b;

    /* renamed from: c */
    final /* synthetic */ C93264al f260030c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93258af(C93264al alVar, C93262aj ajVar, SettableFuture settableFuture) {
        super("Send SMS timeout, background", 2, 0);
        this.f260030c = alVar;
        this.f260028a = ajVar;
        this.f260029b = settableFuture;
    }

    public final void run() {
        ((C59052c) ((C59052c) C93264al.f260043a.mo56225c()).mo56372aa(13542)).mo56386p("Sending SMS timed out whilst sending.");
        ((C89911f) this.f260030c.f260047e.mo27525b()).mo83755a((Throwable) null, 18116355, 29).mo83721a();
        this.f260028a.mo87591b();
        this.f260029b.mo57356n(C87421i.m141588a(26));
    }
}
