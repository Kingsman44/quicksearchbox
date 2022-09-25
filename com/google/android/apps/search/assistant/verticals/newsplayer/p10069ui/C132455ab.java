package com.google.android.apps.search.assistant.verticals.newsplayer.p10069ui;

import android.support.p033v7.view.menu.C0477q;
import android.support.p033v7.widget.C0632eu;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.core.p098j.C2107v;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.C47579cc;
import com.google.apps.tiktok.tracing.C47591co;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.ui.ab */
/* compiled from: PG */
final class C132455ab {

    /* renamed from: a */
    final /* synthetic */ C132478ay f361540a;

    public C132455ab(C132478ay ayVar, View view) {
        this.f361540a = ayVar;
        C0632eu euVar = new C0632eu(new ContextThemeWrapper(ayVar.f361595j, 2132148327), view, 80);
        euVar.mo2856a().inflate(R.menu.assistant_news_player_overflow_menu, euVar.f2394a);
        C0477q qVar = euVar.f2394a;
        qVar.f1659j = true;
        C2107v.m5811a(qVar.mo1650c(0, 0, 0, ayVar.f361595j.getResources().getString(R.string.assistant_news_player_news_settings)).setIcon(ayVar.f361595j.getResources().getDrawable(R.drawable.quantum_gm_ic_settings_vd_theme_24, ayVar.f361595j.getTheme())).setOnMenuItemClickListener(new C47579cc(ayVar.f361593h, "News Settings onClick", new C132507y(this))), ayVar.f361595j.getResources().getString(R.string.assistant_news_player_news_settings_descriptor));
        C2107v.m5811a(euVar.f2394a.mo1650c(0, 0, 0, ayVar.f361595j.getResources().getString(R.string.assistant_news_player_feedback)).setIcon(ayVar.f361595j.getResources().getDrawable(R.drawable.quantum_gm_ic_feedback_vd_theme_24, ayVar.f361595j.getTheme())).setOnMenuItemClickListener(new C47579cc(ayVar.f361593h, "Feedback started", new C132508z(this))), ayVar.f361595j.getResources().getString(R.string.assistant_news_player_feedback_descriptor));
        view.setOnClickListener(new C47591co(ayVar.f361593h, "overflowButton clicked", new C132454aa(euVar)));
    }
}
