package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import android.media.session.MediaController;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.be */
/* compiled from: PG */
public final /* synthetic */ class C79436be implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ MediaController f218103a;

    /* renamed from: b */
    public final /* synthetic */ C79438bg f218104b;

    public /* synthetic */ C79436be(MediaController mediaController, C79438bg bgVar) {
        this.f218103a = mediaController;
        this.f218104b = bgVar;
    }

    public final void run() {
        MediaController mediaController = this.f218103a;
        C79438bg bgVar = this.f218104b;
        int i = C79441bj.f218111c;
        mediaController.registerCallback(bgVar);
    }
}
