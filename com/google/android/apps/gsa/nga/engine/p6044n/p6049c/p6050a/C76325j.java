package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import android.media.session.MediaController;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.j */
/* compiled from: PG */
public final /* synthetic */ class C76325j implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C76327l f211395a;

    /* renamed from: b */
    public final /* synthetic */ MediaController.Callback f211396b;

    public /* synthetic */ C76325j(C76327l lVar, MediaController.Callback callback) {
        this.f211395a = lVar;
        this.f211396b = callback;
    }

    public final void run() {
        C76327l lVar = this.f211395a;
        MediaController.Callback callback = this.f211396b;
        int i = C76330o.f211402a;
        lVar.f211399a.unregisterCallback(callback);
    }
}
