package com.google.android.apps.search.assistant.verticals.newsplayer.p10069ui;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.bottomsheet.C44555f;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.ui.t */
/* compiled from: PG */
final class C132502t extends C44555f {

    /* renamed from: a */
    final /* synthetic */ C132478ay f361638a;

    public C132502t(C132478ay ayVar) {
        this.f361638a = ayVar;
    }

    /* renamed from: a */
    public final void mo32311a(View view, float f) {
        C132489g gVar = this.f361638a.f361592g;
        gVar.getClass();
        gVar.f361621a.findViewById(R.id.assistant_news_player_mini_player).setVisibility(((double) f) > 0.6d ? 0 : 8);
        gVar.f361621a.findViewById(R.id.assistant_news_player_mini_player).setAlpha(f);
    }

    /* renamed from: b */
    public final void mo32312b(View view, int i) {
    }
}
