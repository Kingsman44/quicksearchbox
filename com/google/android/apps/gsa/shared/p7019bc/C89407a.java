package com.google.android.apps.gsa.shared.p7019bc;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.C90769bm;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.shared.bc.a */
/* compiled from: PG */
public final class C89407a {

    /* renamed from: a */
    private static final Pattern f242392a = Pattern.compile("\\d{1,2}\\/\\d{1,2}\\/\\d{4}");

    /* renamed from: a */
    public static CharSequence m145418a(Context context, long j, int i, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (DateUtils.isToday(j)) {
            String formatDateTime = DateUtils.formatDateTime(context, j, m145427j(i));
            if (!z) {
                return formatDateTime;
            }
            return context.getResources().getString(R.string.today_time, new Object[]{formatDateTime});
        } else if (C90769bm.m148271c(j, currentTimeMillis)) {
            return context.getResources().getString(R.string.tomorrow_time, new Object[]{DateUtils.formatDateTime(context, j, m145427j(i))});
        } else if (C90769bm.m148271c(currentTimeMillis, j)) {
            return context.getResources().getString(R.string.yesterday_time, new Object[]{DateUtils.formatDateTime(context, j, m145427j(i))});
        } else if (j - System.currentTimeMillis() > 172800000 && (i & 2) != 0) {
            return DateUtils.formatDateTime(context, j, i);
        } else {
            CharSequence relativeDateTimeString = DateUtils.getRelativeDateTimeString(context, j, 86400000, 172800000, i | 16);
            Matcher matcher = f242392a.matcher(relativeDateTimeString);
            return matcher.find() ? matcher.replaceFirst(DateFormat.getDateFormat(context).format(new Date(j))) : relativeDateTimeString;
        }
    }

    /* renamed from: b */
    public static String m145419b(long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j);
        return String.format(Locale.US, "%tm/%td %tk:%tM:%tS", new Object[]{gregorianCalendar, gregorianCalendar, gregorianCalendar, gregorianCalendar, gregorianCalendar});
    }

    /* renamed from: c */
    public static String m145420c(Resources resources, long j, boolean z) {
        C58838bb.m90868c(j >= 0);
        long hours = TimeUnit.SECONDS.toHours(j);
        long minutes = TimeUnit.SECONDS.toMinutes(j) % 60;
        long j2 = j % 60;
        if (z) {
            String str = BuildConfig.FLAVOR;
            String quantityString = hours > 0 ? resources.getQuantityString(R.plurals.time_duration_spoken_hour, (int) hours, new Object[]{Long.valueOf(hours)}) : str;
            String quantityString2 = minutes > 0 ? resources.getQuantityString(R.plurals.time_duration_spoken_minute, (int) minutes, new Object[]{Long.valueOf(minutes)}) : str;
            if (j2 > 0) {
                str = resources.getQuantityString(R.plurals.time_duration_spoken_second, (int) j2, new Object[]{Long.valueOf(j2)});
            }
            return resources.getString(R.string.time_duration_spoken, new Object[]{quantityString, quantityString2, str});
        } else if (hours > 0) {
            return resources.getString(R.string.time_duration_hours_minutes_seconds, new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(j2)});
        } else if (minutes > 0) {
            return resources.getString(R.string.time_duration_minutes_seconds, new Object[]{Long.valueOf(minutes), Long.valueOf(j2)});
        } else {
            return resources.getString(R.string.time_duration_seconds, new Object[]{Long.valueOf(j2)});
        }
    }

    /* renamed from: d */
    public static String m145421d(long j) {
        C58838bb.m90868c(j >= 0);
        long hours = TimeUnit.SECONDS.toHours(j);
        long minutes = TimeUnit.SECONDS.toMinutes(j) % 60;
        long j2 = j % 60;
        if (hours > 0) {
            return String.format("%d:%02d:%02d", new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(j2)});
        }
        return String.format("%d:%02d", new Object[]{Long.valueOf(minutes), Long.valueOf(j2)});
    }

    /* renamed from: e */
    public static String m145422e(Context context, long j, boolean z) {
        if (j < 3600000) {
            int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(j);
            if (minutes <= 0) {
                minutes = 1;
            }
            return context.getResources().getQuantityString(true != z ? R.plurals.duration_in_minutes : R.plurals.duration_in_minutes_short, minutes, new Object[]{Integer.valueOf(minutes)});
        } else if (j < 86400000) {
            int hours = (int) TimeUnit.MILLISECONDS.toHours(j);
            return context.getResources().getQuantityString(true != z ? R.plurals.duration_in_hours : R.plurals.duration_in_hours_short, hours, new Object[]{Integer.valueOf(hours)});
        } else if (j < 2592000000L) {
            int days = (int) TimeUnit.MILLISECONDS.toDays(j);
            return context.getResources().getQuantityString(true != z ? R.plurals.duration_in_days : R.plurals.duration_in_days_short, days, new Object[]{Integer.valueOf(days)});
        } else if (j < 31536000000L) {
            int i = (int) (j / 2592000000L);
            return context.getResources().getQuantityString(true != z ? R.plurals.duration_in_months : R.plurals.duration_in_months_short, i, new Object[]{Integer.valueOf(i)});
        } else {
            int i2 = (int) (j / 31536000000L);
            return context.getResources().getQuantityString(true != z ? R.plurals.duration_in_years : R.plurals.duration_in_years_short, i2, new Object[]{Integer.valueOf(i2)});
        }
    }

    /* renamed from: f */
    public static String m145423f(Context context, long j) {
        return DateUtils.formatDateRange(context, new Formatter(new StringBuilder(50), Locale.getDefault()), j, j, 524306, (String) null).toString();
    }

    /* renamed from: g */
    public static CharSequence m145424g(Context context, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        if (System.currentTimeMillis() - j < 3600000) {
            return DateUtils.getRelativeTimeSpanString(j, currentTimeMillis, 60000);
        }
        if (DateUtils.isToday(j)) {
            return DateUtils.formatDateTime(context, j, m145427j(1));
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(currentTimeMillis);
        if (instance.get(1) == instance2.get(1) && instance.get(3) == instance2.get(3)) {
            return DateUtils.formatDateTime(context, j, 32770);
        }
        return DateUtils.formatDateTime(context, j, C89885b.S3_NEXT_RESPONSE_TIMEOUT_VALUE);
    }

    /* renamed from: h */
    public static String m145425h(Context context, long j) {
        return context.getString(R.string.content_stale_ago, new Object[]{m145422e(context, j, false)});
    }

    /* renamed from: i */
    public static String m145426i(Context context, long j) {
        return context.getString(R.string.ago, new Object[]{m145422e(context, j, true)});
    }

    /* renamed from: j */
    private static int m145427j(int i) {
        return (i & -19) | 1;
    }
}
