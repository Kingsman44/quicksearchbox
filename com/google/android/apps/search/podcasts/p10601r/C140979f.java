package com.google.android.apps.search.podcasts.p10601r;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.r.f */
/* compiled from: PG */
public final class C140979f {
    /* renamed from: a */
    public static final int m228935a(long j, long j2) {
        return (int) Duration.ofMillis(Math.max(j2 - j, 0)).getSeconds();
    }

    /* renamed from: b */
    public static final String m228936b(Resources resources, long j, C140963c cVar) {
        C69664n.m101061g(resources, "resources");
        C69664n.m101061g(cVar, "formatType");
        Duration ofMillis = Duration.ofMillis(j);
        if (ofMillis.toMinutes() > 0) {
            int minutes = (int) ofMillis.toMinutes();
            if (ofMillis.toMillis() % 60000 != 0) {
                minutes++;
            }
            int i = minutes / 60;
            int i2 = minutes % 60;
            if (i > 0) {
                String quantityString = resources.getQuantityString(R.plurals.podcasts_hours_abbreviated, i, new Object[]{Integer.valueOf(i)});
                C69664n.m101060f(quantityString, "resources.getQuantityStr…bbreviated, hours, hours)");
                String quantityString2 = resources.getQuantityString(R.plurals.podcasts_minutes_abbreviated, i2, new Object[]{Integer.valueOf(i2)});
                C69664n.m101060f(quantityString2, "resources.getQuantityStr…viated, minutes, minutes)");
                C140963c cVar2 = C140963c.TIME_REMAINING_ABBREVIATED;
                int ordinal = cVar.ordinal();
                if (ordinal == 0) {
                    String string = resources.getString(R.string.podcasts_hours_and_minutes_remaining_abbreviated, new Object[]{quantityString, quantityString2});
                    C69664n.m101060f(string, "resources.getString(\n   …    abbreviatedMins\n    )");
                    return string;
                } else if (ordinal == 1) {
                    String string2 = resources.getString(R.string.podcasts_hours_and_minutes, new Object[]{quantityString, quantityString2});
                    C69664n.m101060f(string2, "resources.getString(\n   …    abbreviatedMins\n    )");
                    return string2;
                } else {
                    throw new C69677g();
                }
            } else {
                String quantityString3 = resources.getQuantityString(R.plurals.podcasts_minutes_abbreviated, i2, new Object[]{Integer.valueOf(i2)});
                C69664n.m101060f(quantityString3, "resources.getQuantityStr…viated, minutes, minutes)");
                C140963c cVar3 = C140963c.TIME_REMAINING_ABBREVIATED;
                int ordinal2 = cVar.ordinal();
                if (ordinal2 == 0) {
                    String string3 = resources.getString(R.string.podcasts_minutes_remaining_abbreviated, new Object[]{quantityString3});
                    C69664n.m101060f(string3, "resources.getString(\n   …    abbreviatedMins\n    )");
                    return string3;
                } else if (ordinal2 == 1) {
                    return quantityString3;
                } else {
                    throw new C69677g();
                }
            }
        } else {
            C140963c cVar4 = C140963c.TIME_REMAINING_ABBREVIATED;
            int ordinal3 = cVar.ordinal();
            if (ordinal3 == 0) {
                String string4 = resources.getString(R.string.podcasts_less_than_one_minute_remaining, new Object[]{1});
                C69664n.m101060f(string4, "resources.getString(\n   …aining,\n        1\n      )");
                return string4;
            } else if (ordinal3 == 1) {
                String quantityString4 = resources.getQuantityString(R.plurals.podcasts_minutes_abbreviated, 1, new Object[]{1});
                C69664n.m101060f(quantityString4, "resources.getQuantityStr…     1,\n        1\n      )");
                return quantityString4;
            } else {
                throw new C69677g();
            }
        }
    }

    /* renamed from: c */
    public static final String m228937c(Resources resources, long j) {
        C69664n.m101061g(resources, "resources");
        if (j >= Duration.ofMinutes(10).getSeconds()) {
            String formatElapsedTime = DateUtils.formatElapsedTime(j);
            C69664n.m101060f(formatElapsedTime, "{\n    DateUtils.formatElapsedTime(seconds)\n  }");
            return formatElapsedTime;
        }
        long seconds = Duration.ofMinutes(1).getSeconds();
        String string = resources.getString(R.string.podcasts_elapsed_time_short_format_mm_ss, new Object[]{Long.valueOf(j / seconds), Long.valueOf(j % seconds)});
        C69664n.m101060f(string, "resources.getString(R.st…_mm_ss, minutes, seconds)");
        return string;
    }

    /* renamed from: d */
    public static final String m228938d(Context context, long j, long j2) {
        C69664n.m101061g(context, "context");
        if (j == 0) {
            return BuildConfig.FLAVOR;
        }
        long j3 = j2 - j;
        if (j3 <= 0 || j3 > 604800000) {
            String formatDateTime = DateUtils.formatDateTime(context, j, 65552);
            C69664n.m101060f(formatDateTime, "formatDateTime(\n      co…FORMAT_ABBREV_MONTH\n    )");
            return formatDateTime;
        } else if (j3 <= Duration.ofSeconds(30).toMillis()) {
            String string = context.getResources().getString(R.string.podcasts_just_now);
            C69664n.m101060f(string, "context.resources.getStr…string.podcasts_just_now)");
            return string;
        } else {
            int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(j3);
            if (minutes < 60) {
                String quantityString = context.getResources().getQuantityString(R.plurals.podcasts_minutes_ago, minutes, new Object[]{Integer.valueOf(minutes)});
                C69664n.m101060f(quantityString, "context.resources.getQua…es_ago, minsAgo, minsAgo)");
                return quantityString;
            }
            float f = ((float) minutes) / 60.0f;
            int round = Math.round(f);
            if (round < 24) {
                String quantityString2 = context.getResources().getQuantityString(R.plurals.podcasts_hours_ago, round, new Object[]{Integer.valueOf(round)});
                C69664n.m101060f(quantityString2, "context.resources.getQua…_ago, hoursAgo, hoursAgo)");
                return quantityString2;
            }
            int round2 = Math.round(f / 24.0f);
            String quantityString3 = context.getResources().getQuantityString(R.plurals.podcasts_days_ago, round2, new Object[]{Integer.valueOf(round2)});
            C69664n.m101060f(quantityString3, "context.resources.getQua…ys_ago, daysAgo, daysAgo)");
            return quantityString3;
        }
    }
}
