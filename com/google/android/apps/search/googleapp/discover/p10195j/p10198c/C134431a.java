package com.google.android.apps.search.googleapp.discover.p10195j.p10198c;

import android.content.Context;
import com.google.android.googlequicksearchbox.R;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.c.a */
/* compiled from: PG */
public final class C134431a {

    /* renamed from: a */
    public static final Duration f366144a = Duration.ofDays(30);

    /* renamed from: b */
    public static final Duration f366145b = Duration.ofDays(365);

    /* renamed from: a */
    public static String m218149a(Context context, Duration duration) {
        String str;
        Object[] objArr = new Object[1];
        if (duration.compareTo(Duration.ofHours(1)) < 0) {
            int minutes = (int) duration.toMinutes();
            if (minutes <= 0) {
                minutes = 1;
            }
            str = context.getResources().getQuantityString(R.plurals.gestalt_duration_in_minutes_short, minutes, new Object[]{Integer.valueOf(minutes)});
        } else if (duration.compareTo(Duration.ofDays(1)) < 0) {
            int hours = (int) duration.toHours();
            str = context.getResources().getQuantityString(R.plurals.gestalt_duration_in_hours_short, hours, new Object[]{Integer.valueOf(hours)});
        } else if (duration.compareTo(f366144a) < 0) {
            int days = (int) duration.toDays();
            str = context.getResources().getQuantityString(R.plurals.gestalt_duration_in_days_short, days, new Object[]{Integer.valueOf(days)});
        } else if (duration.compareTo(f366145b) < 0) {
            int days2 = (int) (duration.toDays() / 30);
            str = context.getResources().getQuantityString(R.plurals.gestalt_duration_in_months_short, days2, new Object[]{Integer.valueOf(days2)});
        } else {
            int days3 = (int) (duration.toDays() / 365);
            str = context.getResources().getQuantityString(R.plurals.gestalt_duration_in_years_short, days3, new Object[]{Integer.valueOf(days3)});
        }
        objArr[0] = str;
        return context.getString(R.string.gestalt_ago, objArr);
    }
}
