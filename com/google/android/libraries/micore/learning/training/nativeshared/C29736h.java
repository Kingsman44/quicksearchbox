package com.google.android.libraries.micore.learning.training.nativeshared;

import java.io.File;

/* renamed from: com.google.android.libraries.micore.learning.training.nativeshared.h */
/* compiled from: PG */
public final /* synthetic */ class C29736h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C29737i f80511a;

    public /* synthetic */ C29736h(C29737i iVar) {
        this.f80511a = iVar;
    }

    public final void run() {
        for (File delete : this.f80511a.f80513b) {
            delete.delete();
        }
    }
}
