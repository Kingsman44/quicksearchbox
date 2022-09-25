package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import android.content.ComponentName;
import android.media.session.MediaSessionManager;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.bf */
/* compiled from: PG */
public final /* synthetic */ class C79437bf implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C79441bj f218105a;

    /* renamed from: b */
    public final /* synthetic */ MediaSessionManager f218106b;

    public /* synthetic */ C79437bf(C79441bj bjVar, MediaSessionManager mediaSessionManager) {
        this.f218105a = bjVar;
        this.f218106b = mediaSessionManager;
    }

    public final void run() {
        this.f218106b.addOnActiveSessionsChangedListener(this.f218105a, (ComponentName) null);
    }
}
