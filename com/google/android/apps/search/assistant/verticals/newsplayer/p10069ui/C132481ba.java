package com.google.android.apps.search.assistant.verticals.newsplayer.p10069ui;

import android.support.p031v4.media.session.C0310l;
import android.support.p031v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.assistant.verticals.newsplayer.p10068e.C132416a;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.ui.ba */
/* compiled from: PG */
final class C132481ba extends C0310l {

    /* renamed from: d */
    final /* synthetic */ View f361605d;

    /* renamed from: e */
    final /* synthetic */ C132416a f361606e;

    public C132481ba(View view, C132416a aVar) {
        this.f361605d = view;
        this.f361606e = aVar;
    }

    /* renamed from: e */
    public final void mo1006e(PlaybackStateCompat playbackStateCompat) {
        ((TextView) this.f361605d.findViewById(R.id.assistant_news_player_output_device_name)).setText(this.f361606e.mo110701c());
    }
}
