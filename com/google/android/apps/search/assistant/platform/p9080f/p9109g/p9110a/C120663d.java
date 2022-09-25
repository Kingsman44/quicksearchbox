package com.google.android.apps.search.assistant.platform.p9080f.p9109g.p9110a;

import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120695j;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.p9110a.C120672m;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33461o;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.C68286a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.f.g.a.d */
/* compiled from: PG */
public final /* synthetic */ class C120663d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C120672m f335624a;

    /* renamed from: b */
    public final /* synthetic */ C120678r f335625b;

    /* renamed from: c */
    public final /* synthetic */ C33461o f335626c;

    public /* synthetic */ C120663d(C120672m mVar, C120678r rVar, C33461o oVar) {
        this.f335624a = mVar;
        this.f335625b = rVar;
        this.f335626c = oVar;
    }

    public final void run() {
        C120672m mVar = this.f335624a;
        C120678r rVar = this.f335625b;
        C33461o oVar = this.f335626c;
        if (((Optional) mVar.f335638b.f332586a.get()).orElse(null) == rVar) {
            C47558bi a = C47831fm.m85006a("InteractionController.onUtteranceEnd");
            try {
                Optional a2 = ((C120672m.C120673a) C68286a.m98629a(rVar.f335645b.f89543a, C120672m.C120673a.class)).mo104879g().mo104806a();
                if (oVar.mo38842a() != 1 || !a2.isPresent()) {
                    mVar.f335638b.mo104263a(Optional.empty());
                } else {
                    mVar.mo104878c((C120695j) a2.get());
                }
                a.close();
                return;
            } catch (Throwable th) {
                C120662c.m199813a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }
}
