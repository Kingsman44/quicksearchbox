package com.google.android.apps.search.assistant.verticals.newsplayer.p10069ui;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.C47591co;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.ui.al */
/* compiled from: PG */
final class C132465al extends C0673gh {

    /* renamed from: a */
    final TextView f361553a;

    /* renamed from: b */
    final ImageView f361554b;

    /* renamed from: c */
    final TextView f361555c;

    /* renamed from: d */
    final View f361556d;

    /* renamed from: e */
    final C132506x f361557e;

    /* renamed from: f */
    final PlayingIndicatorView f361558f;

    /* renamed from: g */
    final C132480b f361559g;

    /* renamed from: h */
    final /* synthetic */ C132466am f361560h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C132465al(C132466am amVar, View view) {
        super(view);
        this.f361560h = amVar;
        this.f361553a = (TextView) view.findViewById(R.id.assistant_news_player_playlist_item_name);
        this.f361554b = (ImageView) view.findViewById(R.id.assistant_news_player_playlist_item_logo);
        this.f361555c = (TextView) view.findViewById(R.id.assistant_news_player_playlist_item_publication_time);
        View findViewById = view.findViewById(R.id.assistant_news_player_playlist_item_info);
        this.f361556d = findViewById;
        PlayingIndicatorView playingIndicatorView = (PlayingIndicatorView) view.findViewById(R.id.assistant_news_player_playlist_playing_indicator_view);
        this.f361558f = playingIndicatorView;
        playingIndicatorView.f361527c = true;
        this.f361559g = new C132480b(playingIndicatorView);
        this.f361557e = new C132506x(amVar.f361561a.f361564c, findViewById);
        view.setOnClickListener(new C47591co(amVar.f361561a.f361564c.f361593h, "select item from playlist clicked", new C132464ak(this)));
    }
}
