package com.google.android.apps.gsa.searchbox.client.gsa.p6951a;

import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.a.i */
/* compiled from: PG */
public final class C88636i {

    /* renamed from: a */
    public static final C59071e f239620a = C59071e.m91332i("com.google.android.apps.gsa.searchbox.client.gsa.a.i");

    /* renamed from: b */
    public final C86338r f239621b;

    /* renamed from: c */
    public final C21370a f239622c;

    public C88636i(C86338r rVar, C21370a aVar) {
        this.f239621b = rVar;
        this.f239622c = aVar;
    }

    /* renamed from: a */
    public static long m143290a(long j, int i, int i2) {
        if (i == 6) {
            return m143290a(j * 7, 5, i2);
        }
        int i3 = i2 - 1;
        if (i3 == 1) {
            TimeUnit b = m143291b(i);
            b.getClass();
            return b.toSeconds(j);
        } else if (i3 == 2) {
            TimeUnit b2 = m143291b(i);
            b2.getClass();
            return b2.toMinutes(j);
        } else if (i3 == 3) {
            TimeUnit b3 = m143291b(i);
            b3.getClass();
            return b3.toHours(j);
        } else if (i3 == 4) {
            TimeUnit b4 = m143291b(i);
            b4.getClass();
            return b4.toDays(j);
        } else if (i3 != 5) {
            return 0;
        } else {
            TimeUnit b5 = m143291b(i);
            b5.getClass();
            return b5.toDays(j) / 7;
        }
    }

    /* renamed from: b */
    private static TimeUnit m143291b(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return TimeUnit.SECONDS;
        }
        if (i2 == 2) {
            return TimeUnit.MINUTES;
        }
        if (i2 == 3) {
            return TimeUnit.HOURS;
        }
        if (i2 != 4) {
            return null;
        }
        return TimeUnit.DAYS;
    }
}
