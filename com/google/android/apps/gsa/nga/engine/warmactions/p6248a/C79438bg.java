package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import android.media.session.MediaController;
import android.media.session.PlaybackState;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.bg */
/* compiled from: PG */
final class C79438bg extends MediaController.Callback {

    /* renamed from: d */
    public static final /* synthetic */ int f218107d = 0;

    /* renamed from: a */
    public final C58485gu f218108a = C58485gu.m89847o(2, 3);

    /* renamed from: b */
    public final MediaController f218109b;

    /* renamed from: c */
    final /* synthetic */ C79441bj f218110c;

    public C79438bg(C79441bj bjVar, MediaController mediaController) {
        this.f218110c = bjVar;
        this.f218109b = mediaController;
    }

    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        int i = C79441bj.f218111c;
        this.f218109b.getPackageName();
        String.valueOf(playbackState);
        this.f218110c.mo74064c();
    }

    public final void onSessionDestroyed() {
        C79441bj bjVar = this.f218110c;
        MediaController mediaController = this.f218109b;
        C79451i iVar = new C79451i();
        iVar.mo74059d(mediaController);
        bjVar.f218113b.remove(iVar.mo74056a());
        bjVar.mo74064c();
    }
}
