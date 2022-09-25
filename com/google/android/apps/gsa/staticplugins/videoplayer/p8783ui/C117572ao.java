package com.google.android.apps.gsa.staticplugins.videoplayer.p8783ui;

import android.support.p031v4.app.C0154a;
import android.support.p033v7.app.C0395p;
import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117556j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.youtube.player.YouTubeEmbedSupportFragment;
import com.google.android.youtube.player.p3561b.C45463av;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.ui.ao */
/* compiled from: PG */
public final /* synthetic */ class C117572ao implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C117578au f326354a;

    public /* synthetic */ C117572ao(C117578au auVar) {
        this.f326354a = auVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C117578au auVar = this.f326354a;
        C117556j jVar = (C117556j) obj;
        if (jVar.isInitialized()) {
            int i = jVar.f326310a;
            if ((i & 2) != 0 && (i & 1) != 0) {
                auVar.f326363a = jVar;
                auVar.f326368f = new YouTubeEmbedSupportFragment();
                YouTubeEmbedSupportFragment youTubeEmbedSupportFragment = auVar.f326368f;
                youTubeEmbedSupportFragment.f118840a.mo49646k(C117564ag.f326344a);
                auVar.f326373k = new C117576as(auVar);
                auVar.f326372j = new C117577at(auVar);
                auVar.f326368f.mo49575f(auVar.f326372j);
                auVar.f326381s = auVar.f326368f.mo49583n();
                C45463av avVar = auVar.f326381s;
                C117576as asVar = auVar.f326373k;
                C0395p pVar = auVar.f326365c;
                Objects.requireNonNull(pVar);
                avVar.mo49607c(asVar, new C117565ah(pVar));
                auVar.f326380r.mo44079a(auVar.f326368f, jVar.f326316g);
                auVar.mo103386h();
                auVar.f326374l = new C117566ai(auVar);
                auVar.f326368f.mo49574e(auVar.f326374l);
                YouTubeEmbedSupportFragment youTubeEmbedSupportFragment2 = auVar.f326368f;
                C0154a aVar = new C0154a(auVar.f326365c.mo545jw());
                aVar.mo511h(R.id.video_frame, youTubeEmbedSupportFragment2, "YOUTUBE_PLAYER", 1);
                aVar.mo505b(false);
                auVar.f326368f.mo49572c();
                C117578au.m195430l(jVar.f326314e, auVar.f326382t);
                C117578au.m195430l(jVar.f326315f, auVar.f326383u);
                auVar.mo103388k(auVar.f326365c.getResources().getConfiguration());
            }
        }
    }
}
