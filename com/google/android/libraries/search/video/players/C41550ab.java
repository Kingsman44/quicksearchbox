package com.google.android.libraries.search.video.players;

import com.google.android.youtube.player.YouTubeEmbedSupportFragment;
import com.google.android.youtube.player.p3561b.C45493m;
import com.google.android.youtube.player.p3561b.C45494n;
import com.google.android.youtube.player.p3561b.C45503w;
import com.google.common.base.C58837ba;

/* renamed from: com.google.android.libraries.search.video.players.ab */
/* compiled from: PG */
public final class C41550ab {

    /* renamed from: a */
    private String f108626a;

    /* renamed from: a */
    public final void mo44079a(YouTubeEmbedSupportFragment youTubeEmbedSupportFragment, String str) {
        if (!C58837ba.m90859h(this.f108626a) && !this.f108626a.equals(str)) {
            C45503w wVar = youTubeEmbedSupportFragment.f118840a.f118896h;
            wVar.f118935b.add(new C45494n(wVar));
            wVar.mo49668h();
        }
        this.f108626a = str;
        if (!C58837ba.m90859h(str)) {
            C45503w wVar2 = youTubeEmbedSupportFragment.f118840a.f118896h;
            wVar2.f118935b.add(new C45493m(wVar2, str));
            wVar2.mo49668h();
        }
    }
}
