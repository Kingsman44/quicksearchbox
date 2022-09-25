package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.content.Context;
import android.text.format.DateUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.dl */
/* compiled from: PG */
public final class C114869dl {

    /* renamed from: a */
    private final Context f318711a;

    /* renamed from: b */
    private final C21370a f318712b;

    public C114869dl(Context context, C21370a aVar) {
        this.f318711a = context;
        this.f318712b = aVar;
    }

    /* renamed from: a */
    public final String mo101668a(long j) {
        if (j <= 0) {
            return BuildConfig.FLAVOR;
        }
        long b = this.f318712b.mo26870b() - j;
        if (b <= 0 || b > 604800000) {
            return DateUtils.formatDateTime(this.f318711a, j, 65552);
        }
        int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(b);
        if (minutes <= 0) {
            return this.f318711a.getResources().getString(R.string.just_now);
        }
        if (minutes < 60) {
            return this.f318711a.getResources().getQuantityString(R.plurals.mins_ago, minutes, new Object[]{Integer.valueOf(minutes)});
        }
        long j2 = (long) minutes;
        int hours = (int) TimeUnit.MINUTES.toHours(j2);
        if (hours < 24) {
            return this.f318711a.getResources().getQuantityString(R.plurals.hours_ago, hours, new Object[]{Integer.valueOf(hours)});
        }
        int days = (int) TimeUnit.MINUTES.toDays(j2);
        return this.f318711a.getResources().getQuantityString(R.plurals.days_ago, days, new Object[]{Integer.valueOf(days)});
    }
}
