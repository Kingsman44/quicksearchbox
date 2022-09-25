package com.google.android.libraries.search.video.players;

import com.google.android.youtube.player.C45507c;

/* renamed from: com.google.android.libraries.search.video.players.ag */
/* compiled from: PG */
public final /* synthetic */ class C41555ag implements C45507c {

    /* renamed from: a */
    public final /* synthetic */ YouTubeWrapper f108642a;

    public /* synthetic */ C41555ag(YouTubeWrapper youTubeWrapper) {
        this.f108642a = youTubeWrapper;
    }

    /* renamed from: a */
    public final String mo44101a(String str) {
        YouTubeWrapper youTubeWrapper = this.f108642a;
        C41560al alVar = new C41560al();
        for (C41560al alVar2 : youTubeWrapper.f108599g.values()) {
            if (true == ((C41568c) alVar2.f108649a).f108672a.equals(str)) {
                alVar = alVar2;
            }
        }
        StringBuilder sb = new StringBuilder("{\"hideControlsOnStart\": true");
        if (!alVar.f108652d || alVar.f108653e) {
            sb.append(", \"enableInlineMutedAutoCaptions\": true");
        }
        if (youTubeWrapper.f108600h.mo43981a().mo43968d()) {
            sb.append(", \"disablePreview\": true");
        }
        sb.append("}");
        return sb.toString();
    }
}
