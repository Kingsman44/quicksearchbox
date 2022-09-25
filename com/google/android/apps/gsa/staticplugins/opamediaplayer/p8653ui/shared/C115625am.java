package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared;

import android.content.Context;
import android.text.format.DateUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.am */
/* compiled from: PG */
public final class C115625am {
    /* renamed from: a */
    public static String m191766a(long j, long j2, Context context) {
        if (j <= 0) {
            return BuildConfig.FLAVOR;
        }
        long j3 = j2 - j;
        if (j3 <= 0 || j3 > 604800000) {
            return DateUtils.formatDateTime(context, j, 65552);
        }
        int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(j3);
        if (minutes <= 0) {
            return context.getResources().getString(R.string.omp_just_now);
        }
        if (minutes < 60) {
            return context.getResources().getQuantityString(R.plurals.omp_minutes_ago, minutes, new Object[]{Integer.valueOf(minutes)});
        }
        float f = ((float) minutes) / 60.0f;
        int round = Math.round(f);
        if (round < 24) {
            return context.getResources().getQuantityString(R.plurals.omp_hours_ago, round, new Object[]{Integer.valueOf(round)});
        }
        int round2 = Math.round(f / 24.0f);
        return context.getResources().getQuantityString(R.plurals.omp_days_ago, round2, new Object[]{Integer.valueOf(round2)});
    }
}
