package com.google.android.apps.gsa.staticplugins.videoplayer.p8783ui;

import android.net.Uri;
import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117556j;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.youtube.player.C45510f;
import com.google.android.youtube.player.YouTubeEmbedSupportFragment;
import com.google.android.youtube.player.p3560a.C45439a;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.ui.as */
/* compiled from: PG */
final class C117576as implements C45439a {

    /* renamed from: a */
    final /* synthetic */ C117578au f326358a;

    public C117576as(C117578au auVar) {
        this.f326358a = auVar;
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ void mo44104l(Object obj) {
        C45510f fVar = (C45510f) obj;
        C117578au auVar = this.f326358a;
        YouTubeEmbedSupportFragment youTubeEmbedSupportFragment = auVar.f326368f;
        if (youTubeEmbedSupportFragment != null) {
            C117556j jVar = auVar.f326363a;
            if ((jVar.f326310a & 4) != 0) {
                Uri.Builder builder = new Uri.Builder();
                Uri.Builder appendPath = builder.scheme("https").authority("www.youtube.com").appendPath("embed").appendPath(this.f326358a.f326363a.f326311b);
                long j = this.f326358a.f326363a.f326313d;
                StringBuilder sb = new StringBuilder();
                sb.append(j / 1000);
                appendPath.appendQueryParameter(C42181t.f110467a, sb.toString());
                this.f326358a.f326368f.mo49584o(builder.build().toString());
            } else {
                youTubeEmbedSupportFragment.mo49578i(jVar.f326311b);
            }
            C117578au auVar2 = this.f326358a;
            auVar2.f326375m = new C117575ar(this);
            auVar2.f326368f.mo49577h(auVar2.f326375m);
            this.f326358a.f326368f.mo49572c();
        }
    }
}
