package com.google.android.libraries.search.video.players;

import android.os.RemoteException;
import com.google.android.libraries.search.video.p3194d.C41500k;
import com.google.android.youtube.player.C45512h;
import com.google.android.youtube.player.YouTubeEmbedSupportFragment;
import com.google.android.youtube.player.p3561b.C45497q;
import com.google.android.youtube.player.p3561b.C45502v;
import com.google.android.youtube.player.p3561b.C45503w;

/* renamed from: com.google.android.libraries.search.video.players.af */
/* compiled from: PG */
public final /* synthetic */ class C41554af implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ YouTubeWrapper f108639a;

    /* renamed from: b */
    public final /* synthetic */ C45512h f108640b;

    /* renamed from: c */
    public final /* synthetic */ C41500k f108641c;

    public /* synthetic */ C41554af(YouTubeWrapper youTubeWrapper, C45512h hVar, C41500k kVar) {
        this.f108639a = youTubeWrapper;
        this.f108640b = hVar;
        this.f108641c = kVar;
    }

    public final void run() {
        YouTubeWrapper youTubeWrapper = this.f108639a;
        C45512h hVar = this.f108640b;
        C41500k kVar = this.f108641c;
        YouTubeEmbedSupportFragment youTubeEmbedSupportFragment = youTubeWrapper.f108603k;
        youTubeEmbedSupportFragment.getClass();
        C45503w wVar = youTubeEmbedSupportFragment.f118840a.f118896h;
        wVar.f118936c.add(new C45497q(wVar, hVar));
        if (wVar.f118943j != null) {
            for (C45502v a : wVar.f118936c) {
                try {
                    a.mo49661a();
                } catch (RemoteException unused) {
                    C45503w.m81248f();
                }
            }
            wVar.f118936c.clear();
        }
        if (kVar != null) {
            kVar.f108426a.mo44019a(3);
        }
    }
}
