package com.google.android.apps.search.podcasts.settings.p10612a;

import android.content.Context;
import com.google.android.googlequicksearchbox.R;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.settings.a.d */
/* compiled from: PG */
public enum C141051d {
    MILLIS_NEVER(r1),
    MILLIS_24HOURS(r2),
    MILLIS_7DAYS(r4),
    MILLIS_30DAYS(r6),
    MILLIS_90DAYS(r8);
    

    /* renamed from: f */
    public final Duration f382951f;

    private C141051d(Duration duration) {
        this.f382951f = duration;
    }

    /* renamed from: a */
    public final String mo116112a(Context context) {
        C69664n.m101061g(context, "context");
        if (this.f382951f.isNegative()) {
            String string = context.getResources().getString(R.string.podcasts_never);
            C69664n.m101060f(string, "context.resources.getStr…(R.string.podcasts_never)");
            return string;
        } else if (this.f382951f.compareTo(Duration.ofHours(24)) <= 0) {
            int hours = (int) this.f382951f.toHours();
            String quantityString = context.getResources().getQuantityString(R.plurals.podcasts_hours_left_to_remove_downloads, hours, new Object[]{Integer.valueOf(hours)});
            C69664n.m101060f(quantityString, "{\n          val hours = …urs\n          )\n        }");
            return quantityString;
        } else {
            int days = (int) this.f382951f.toDays();
            String quantityString2 = context.getResources().getQuantityString(R.plurals.podcasts_days_left_to_remove_downloads, days, new Object[]{Integer.valueOf(days)});
            C69664n.m101060f(quantityString2, "{\n          val days = d…ays\n          )\n        }");
            return quantityString2;
        }
    }
}
