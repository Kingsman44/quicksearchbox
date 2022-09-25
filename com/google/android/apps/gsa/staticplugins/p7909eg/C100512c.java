package com.google.android.apps.gsa.staticplugins.p7909eg;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.eg.c */
/* compiled from: PG */
public final /* synthetic */ class C100512c implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f281014a;

    public /* synthetic */ C100512c(SettableFuture settableFuture) {
        this.f281014a = settableFuture;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C59104x c = C100518i.f281027a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "TtsManager");
        ((C59052c) ((C59052c) c).mo56372aa(33464)).mo56386p("ttsPlayingStarted failed");
        this.f281014a.mo57357o((Exception) obj);
    }
}
