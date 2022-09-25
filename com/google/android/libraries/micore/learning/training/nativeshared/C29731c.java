package com.google.android.libraries.micore.learning.training.nativeshared;

import com.google.android.libraries.micore.learning.training.C29725a;

/* renamed from: com.google.android.libraries.micore.learning.training.nativeshared.c */
/* compiled from: PG */
public final /* synthetic */ class C29731c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C29733e f80497a;

    /* renamed from: b */
    public final /* synthetic */ C29725a f80498b;

    public /* synthetic */ C29731c(C29733e eVar, C29725a aVar) {
        this.f80497a = eVar;
        this.f80498b = aVar;
    }

    public final void run() {
        C29733e eVar = this.f80497a;
        C29725a aVar = this.f80498b;
        synchronized (eVar.f80502c.f80504b) {
            if (eVar.f80502c.f80505c.remove(aVar)) {
                eVar.f80500a.close();
            }
        }
    }
}
