package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

import android.content.Context;
import androidx.slice.C4121t;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.bm */
/* compiled from: PG */
public final /* synthetic */ class C14700bm implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14701bn f44421a;

    public /* synthetic */ C14700bm(C14701bn bnVar) {
        this.f44421a = bnVar;
    }

    public final void run() {
        C14701bn bnVar = this.f44421a;
        C14697bj bjVar = bnVar.f44427f;
        C4121t tVar = new C4121t(bnVar.f44423b);
        Context context = (Context) bjVar.f44409a.mo17428b();
        context.getClass();
        bnVar.f44428g = new C14696bi(context, "content://com.android.settings.slices/action/ring_volume", tVar);
    }
}
