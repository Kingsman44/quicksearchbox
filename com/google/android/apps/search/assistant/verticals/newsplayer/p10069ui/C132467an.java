package com.google.android.apps.search.assistant.verticals.newsplayer.p10069ui;

import android.os.Handler;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.search.assistant.verticals.newsplayer.media.C132446a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.p3506c.C44581b;
import com.google.apps.tiktok.tracing.C47591co;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.ui.an */
/* compiled from: PG */
final class C132467an {

    /* renamed from: a */
    public boolean f361562a = false;

    /* renamed from: b */
    public final C132466am f361563b;

    /* renamed from: c */
    final /* synthetic */ C132478ay f361564c;

    public C132467an(C132478ay ayVar, View view) {
        this.f361564c = ayVar;
        C132466am amVar = new C132466am(this);
        this.f361563b = amVar;
        RecyclerView recyclerView = new RecyclerView(ayVar.f361595j);
        recyclerView.setAdapter(amVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(ayVar.f361595j));
        MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.assistant_news_player_playlist);
        if (materialButton != null) {
            C44581b bVar = new C44581b(ayVar.f361595j, 0);
            bVar.mo47604w(R.string.assistant_news_player_playlist_dialog_title);
            bVar.mo47607z(recyclerView);
            bVar.mo47601t(R.string.assistant_news_player_close, C132460ag.f361548a);
            materialButton.setOnClickListener(new C47591co(ayVar.f361593h, "playlistButton clicked", new C132461ah(bVar.create())));
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.assistant_news_player_bottom_sheet_playlist);
        if (linearLayout != null) {
            linearLayout.addView(recyclerView);
        }
        View findViewById = view.findViewById(R.id.assistant_news_player_edit_providers);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C47591co(ayVar.f361593h, "Edit providers onClick", new C132462ai(this)));
        }
        C132446a q = ayVar.f361586a.mo110715q();
        q.f361493a.mo1040h(new C132463aj(this), (Handler) null);
    }
}
