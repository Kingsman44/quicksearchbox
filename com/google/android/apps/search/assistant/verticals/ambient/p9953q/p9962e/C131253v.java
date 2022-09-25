package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e;

import android.content.Context;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.text.format.Time;
import com.google.android.googlequicksearchbox.R;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.e.v */
/* compiled from: PG */
public final class C131253v {

    /* renamed from: a */
    private static final Pattern f358903a = Pattern.compile("\\d{1,2}\\/\\d{1,2}\\/\\d{4}");

    /* renamed from: a */
    public static boolean m213754a(long j, long j2) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(j2);
        if (instance.get(1) == instance2.get(1) && instance.get(6) == instance2.get(6)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static CharSequence m213755b(Context context, long j, boolean z) {
        return DateUtils.formatDateTime(context, j, (true != z ? 0 : 16384) | 1);
    }

    /* renamed from: c */
    public static CharSequence m213756c(Context context, long j, long j2, boolean z) {
        if (DateUtils.isToday(j)) {
            return DateUtils.formatDateTime(context, j, m213758e(z));
        }
        if (m213757d(j, j2)) {
            return context.getResources().getString(R.string.assistant_tomorrow_time, new Object[]{DateUtils.formatDateTime(context, j, m213758e(z))});
        } else if (m213757d(j2, j)) {
            return context.getResources().getString(R.string.assistant_yesterday_time, new Object[]{DateUtils.formatDateTime(context, j, m213758e(z))});
        } else {
            CharSequence relativeDateTimeString = DateUtils.getRelativeDateTimeString(context, j, 86400000, 172800000, 16);
            Matcher matcher = f358903a.matcher(relativeDateTimeString);
            return matcher.find() ? matcher.replaceFirst(DateFormat.getDateFormat(context).format(new Date(j))) : relativeDateTimeString;
        }
    }

    /* renamed from: d */
    private static boolean m213757d(long j, long j2) {
        Time time = new Time();
        time.set(j);
        int julianDay = Time.getJulianDay(j, time.gmtoff);
        time.set(j2);
        return julianDay - Time.getJulianDay(j2, time.gmtoff) == 1;
    }

    /* renamed from: e */
    private static int m213758e(boolean z) {
        return (true != z ? 0 : 16384) | 1;
    }
}
