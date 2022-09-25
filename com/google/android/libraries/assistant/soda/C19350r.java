package com.google.android.libraries.assistant.soda;

import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.assistant.soda.r */
/* compiled from: PG */
public final /* synthetic */ class C19350r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C19389y f54149a;

    public /* synthetic */ C19350r(C19389y yVar) {
        this.f54149a = yVar;
    }

    public final void run() {
        C19389y yVar = this.f54149a;
        if (yVar.mo24536i()) {
            try {
                ((C19241ad) yVar.f54240f.mo56107c()).mo24349p();
            } catch (IllegalStateException e) {
                ((C59052c) ((C59052c) ((C59052c) C19389y.f54228a.mo56225c()).mo56382g(e)).mo56372aa(47661)).mo56386p("SODA failed to stop capturing.");
            }
        }
    }
}
