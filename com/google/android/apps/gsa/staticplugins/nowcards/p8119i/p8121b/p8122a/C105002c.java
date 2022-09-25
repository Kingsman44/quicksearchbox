package com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.p8122a;

import android.view.View;
import com.google.android.youtube.player.YouTubeEmbedSupportFragment;
import com.google.android.youtube.player.p3560a.C45439a;
import com.google.android.youtube.player.p3561b.C45463av;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.i.b.a.c */
/* compiled from: PG */
final class C105002c extends C105017r {

    /* renamed from: a */
    public C45439a f292550a;

    /* renamed from: b */
    public YouTubeEmbedSupportFragment f292551b;

    /* renamed from: c */
    public String f292552c;

    /* renamed from: d */
    public C45463av f292553d;

    /* renamed from: e */
    private View f292554e;

    public C105002c() {
    }

    public C105002c(C105018s sVar) {
        C105003d dVar = (C105003d) sVar;
        this.f292553d = dVar.f292559e;
        this.f292550a = dVar.f292555a;
        this.f292551b = dVar.f292556b;
        this.f292552c = dVar.f292557c;
        this.f292554e = dVar.f292558d;
    }

    /* renamed from: a */
    public final C105018s mo94458a() {
        C45439a aVar;
        YouTubeEmbedSupportFragment youTubeEmbedSupportFragment;
        String str;
        C45463av avVar = this.f292553d;
        if (avVar != null && (aVar = this.f292550a) != null && (youTubeEmbedSupportFragment = this.f292551b) != null && (str = this.f292552c) != null) {
            return new C105003d(avVar, aVar, youTubeEmbedSupportFragment, str, this.f292554e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f292553d == null) {
            sb.append(" youTubeInitializationResult");
        }
        if (this.f292550a == null) {
            sb.append(" youTubeInitializationResultListener");
        }
        if (this.f292551b == null) {
            sb.append(" youTubeEmbedFragment");
        }
        if (this.f292552c == null) {
            sb.append(" youtubeFragmentTag");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo94459b(View view) {
        this.f292554e = view;
    }
}
