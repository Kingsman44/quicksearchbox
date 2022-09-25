package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import android.media.session.MediaController;
import android.media.session.MediaSession;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.bh */
/* compiled from: PG */
public abstract class C79439bh {
    /* renamed from: a */
    public abstract C79440bi mo74056a();

    /* renamed from: b */
    public abstract void mo74057b(MediaSession.Token token);

    /* renamed from: c */
    public abstract void mo74058c(String str);

    /* renamed from: d */
    public final void mo74059d(MediaController mediaController) {
        mo74058c(mediaController.getPackageName());
        mo74057b(mediaController.getSessionToken());
    }
}
