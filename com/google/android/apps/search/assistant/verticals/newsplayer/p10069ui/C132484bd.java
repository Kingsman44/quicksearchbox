package com.google.android.apps.search.assistant.verticals.newsplayer.p10069ui;

import android.content.Context;
import android.text.format.DateUtils;
import com.android.p265e.C5114a;
import com.google.android.googlequicksearchbox.R;
import com.google.protobuf.C62910ar;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.ui.bd */
/* compiled from: PG */
public final class C132484bd {

    /* renamed from: a */
    private final Context f361613a;

    public C132484bd(Context context) {
        this.f361613a = context;
    }

    /* renamed from: b */
    public final String mo110771b(Instant instant) {
        Duration between = Duration.between(instant, Instant.now());
        if (between.isNegative() || between.compareTo(Duration.ofDays(7)) > 0) {
            return DateUtils.formatDateTime(this.f361613a, instant.toEpochMilli(), 65552);
        }
        if (between.compareTo(Duration.ofMinutes(1)) < 0) {
            return this.f361613a.getResources().getString(R.string.assistant_news_player_just_now);
        }
        if (between.compareTo(Duration.ofHours(1)) < 0) {
            return C5114a.m13987a(this.f361613a, R.string.assistant_news_player_minutes_ago, "count", Integer.valueOf((int) between.toMinutes()));
        }
        int round = Math.round(((float) between.toMinutes()) / 60.0f);
        if (round < 24) {
            return C5114a.m13987a(this.f361613a, R.string.assistant_news_player_hours_ago, "count", Integer.valueOf(round));
        }
        int round2 = Math.round(((float) between.toHours()) / 24.0f);
        return C5114a.m13987a(this.f361613a, R.string.assistant_news_player_days_ago, "count", Integer.valueOf(round2));
    }

    /* renamed from: a */
    public static String m215391a(Context context, C62910ar arVar) {
        int i = (int) arVar.f169860a;
        int i2 = i / 60;
        int i3 = i % 60;
        if (i2 > 0 && i3 > 0) {
            return String.format("%s %s", new Object[]{C5114a.m13987a(context, R.string.assistant_news_player_accessibility_minutes, "count", Integer.valueOf(i2)), C5114a.m13987a(context, R.string.assistant_news_player_accessibility_seconds, "count", Integer.valueOf(i3))});
        } else if (i2 <= 0 || i3 != 0) {
            return C5114a.m13987a(context, R.string.assistant_news_player_accessibility_seconds, "count", Integer.valueOf(i3));
        } else {
            return C5114a.m13987a(context, R.string.assistant_news_player_accessibility_minutes, "count", Integer.valueOf(i2));
        }
    }
}
