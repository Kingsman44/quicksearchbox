package com.google.android.apps.gsa.sidekick.shared.util;

import android.content.Context;
import android.text.format.DateUtils;
import com.google.android.apps.gsa.shared.p7019bc.C89407a;
import com.google.android.apps.gsa.shared.util.C90769bm;
import com.google.android.googlequicksearchbox.R;
import com.google.p375ai.p378b.C7946pv;
import com.google.p375ai.p378b.C7947pw;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.az */
/* compiled from: PG */
public final class C91975az {
    /* renamed from: a */
    public static CharSequence m150931a(Context context, C7947pw pwVar, long j) {
        int a;
        int i = pwVar.f27898a;
        int i2 = i & 8;
        String str = null;
        if (i2 != 0) {
            if (i2 != 0) {
                long j2 = pwVar.f27902e * 1000;
                int i3 = 1;
                if (!((i & 16) == 0 || (a = C7946pv.m22895a(pwVar.f27903f)) == 0)) {
                    i3 = a;
                }
                if (i3 == 3) {
                    str = DateUtils.isToday(j2) ? context.getString(R.string.today) : C90769bm.m148271c(j2, j) ? context.getString(R.string.tomorrow) : C90769bm.m148271c(j, j2) ? context.getString(R.string.yesterday) : DateUtils.formatDateTime(context, j2, 18);
                } else if (i3 == 4) {
                    str = context.getString(R.string.this_weekend);
                }
            }
            if (str == null) {
                return C89407a.m145418a(context, pwVar.f27902e * 1000, 19, false);
            }
        }
        return str;
    }
}
