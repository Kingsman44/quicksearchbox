package com.google.android.libraries.micore.learning.training.nativeshared;

import com.google.android.libraries.micore.learning.training.C29725a;

/* renamed from: com.google.android.libraries.micore.learning.training.nativeshared.a */
/* compiled from: PG */
public final /* synthetic */ class C29729a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C29734f f80490a;

    public /* synthetic */ C29729a(C29734f fVar) {
        this.f80490a = fVar;
    }

    public final void run() {
        C29734f fVar = this.f80490a;
        synchronized (fVar.f80504b) {
            for (C29725a close : fVar.f80505c) {
                close.close();
            }
        }
    }
}
