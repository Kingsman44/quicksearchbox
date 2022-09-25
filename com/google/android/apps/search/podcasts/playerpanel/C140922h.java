package com.google.android.apps.search.podcasts.playerpanel;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.search.podcasts.widgets.thumbnail.ThumbnailView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.h */
/* compiled from: PG */
public final class C140922h {
    /* renamed from: a */
    public static final ImageView m228870a(View view) {
        return (ImageView) view.findViewById(R.id.podcasts_toggle_button);
    }

    /* renamed from: b */
    public static final ProgressBar m228871b(View view) {
        return (ProgressBar) view.findViewById(R.id.podcasts_progress_bar);
    }

    /* renamed from: c */
    public static final TextView m228872c(View view) {
        return (TextView) view.findViewById(R.id.podcasts_episode_title);
    }

    /* renamed from: d */
    public static final ThumbnailView m228873d(View view) {
        return (ThumbnailView) view.findViewById(R.id.podcasts_thumbnail);
    }
}
