package com.google.android.apps.gsa.staticplugins.recently.p8684g;

import android.content.Context;
import android.text.format.DateUtils;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.g.b */
/* compiled from: PG */
public final class C116091b {
    /* renamed from: a */
    public static long m192481a(long j, int i) {
        return ((long) (((int) ((j + ((long) TimeZone.getDefault().getOffset(j))) / 86400000)) + i)) * 86400000;
    }

    /* renamed from: b */
    public static String m192482b(Context context, long j, long j2) {
        long j3 = j;
        long j4 = j2;
        long j5 = j4 - j3;
        C58976aa aaVar = C58975e.f156826a;
        if (j5 >= 0 && j5 < TimeUnit.MINUTES.toMillis(2)) {
            return context.getResources().getString(R.string.recently_timeline_just_now);
        }
        if (j3 >= m192481a(j4, 0) && j3 < m192481a(j4, 1)) {
            return DateUtils.getRelativeTimeSpanString(j, j2, 60000).toString();
        }
        if (j3 >= m192481a(j4, -1) && j3 < m192481a(j4, 0)) {
            return context.getResources().getString(R.string.recently_timeline_yesterday);
        }
        if ((m192481a(j4, 1) - 1) - j3 < 0) {
            Context context2 = context;
            return DateUtils.formatDateTime(context, j, 0).toString();
        }
        Context context3 = context;
        long days = TimeUnit.MILLISECONDS.toDays((m192481a(j4, 1) - 1) - j3);
        return context.getResources().getString(R.string.recently_timeline_days_ago, new Object[]{Integer.valueOf((int) days)});
    }
}
