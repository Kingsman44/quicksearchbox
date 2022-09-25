package com.google.android.apps.search.podcasts.playerpanel;

import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.apps.search.podcasts.widgets.thumbnail.ThumbnailView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.ak */
/* compiled from: PG */
public final class C140880ak {
    /* renamed from: a */
    public static final ImageView m228796a(View view) {
        return (ImageView) view.findViewById(R.id.podcasts_fast_forward_button);
    }

    /* renamed from: b */
    public static final ImageView m228797b(View view) {
        return (ImageView) view.findViewById(R.id.podcasts_player_heart_button);
    }

    /* renamed from: c */
    public static final ImageView m228798c(View view) {
        return (ImageView) view.findViewById(R.id.podcasts_rewind_button);
    }

    /* renamed from: d */
    public static final ImageView m228799d(View view) {
        return (ImageView) view.findViewById(R.id.podcasts_toggle_button);
    }

    /* renamed from: e */
    public static final SeekBar m228800e(View view) {
        return (SeekBar) view.findViewById(R.id.podcasts_progress_seek_bar);
    }

    /* renamed from: f */
    public static final TextView m228801f(View view) {
        return (TextView) view.findViewById(R.id.podcasts_current_speed);
    }

    /* renamed from: g */
    public static final TextView m228802g(View view) {
        return (TextView) view.findViewById(R.id.podcasts_episode_title);
    }

    /* renamed from: h */
    public static final TextView m228803h(View view) {
        return (TextView) view.findViewById(R.id.podcasts_show_title_or_status);
    }

    /* renamed from: i */
    public static final TextView m228804i(View view) {
        return (TextView) view.findViewById(R.id.podcasts_sleep_timer_counter);
    }

    /* renamed from: j */
    public static final ThumbnailView m228805j(View view) {
        return (ThumbnailView) view.findViewById(R.id.podcasts_thumbnail);
    }
}
