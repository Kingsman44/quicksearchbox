package com.google.android.apps.gsa.search.core.p6513aj;

import android.app.AlarmManager;
import android.app.PendingIntent;
import androidx.core.p094f.C1888a;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.preferences.C86341u;
import com.google.android.apps.gsa.search.core.preferences.C86346z;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.Random;

@Deprecated
/* renamed from: com.google.android.apps.gsa.search.core.aj.b */
/* compiled from: PG */
public final class C84539b {

    /* renamed from: d */
    private static final C59071e f230065d = C59071e.m91332i("com.google.android.apps.gsa.search.core.aj.b");

    /* renamed from: a */
    public final C21370a f230066a;

    /* renamed from: b */
    public final C86127w f230067b;

    /* renamed from: c */
    public final Random f230068c;

    /* renamed from: e */
    private final C68214a f230069e;

    public C84539b(C21370a aVar, C86127w wVar, C68214a aVar2) {
        Random random = new Random();
        this.f230069e = aVar2;
        this.f230066a = aVar;
        this.f230067b = wVar;
        this.f230068c = random;
    }

    /* renamed from: f */
    private final boolean m135198f() {
        try {
            return !C1888a.m5149c() || ((AlarmManager) this.f230069e.mo27525b()).canScheduleExactAlarms();
        } catch (NoSuchMethodError e) {
            ((C59052c) ((C59052c) ((C59052c) f230065d.mo56226d()).mo56382g(e)).mo56372aa(9410)).mo56386p("isAtLeastS but canScheduleExactAlarms not available");
            return false;
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo78251a(PendingIntent pendingIntent) {
        try {
            ((AlarmManager) this.f230069e.mo27525b()).cancel(pendingIntent);
        } catch (IllegalStateException | SecurityException unused) {
        }
    }

    @Deprecated
    /* renamed from: b */
    public final void mo78252b(int i, long j, PendingIntent pendingIntent) {
        if (m135198f()) {
            try {
                ((AlarmManager) this.f230069e.mo27525b()).setExact(i, j, pendingIntent);
            } catch (IllegalStateException | SecurityException unused) {
            }
        } else {
            ((C59052c) ((C59052c) f230065d.mo56226d()).mo56372aa(9402)).mo56386p("Unable to set exact timing alarm as SCHEDULE_EXACT_ALARM permission is not granted. Setting inexact alarm instead.");
            mo78253c(i, j, pendingIntent);
        }
    }

    @Deprecated
    /* renamed from: c */
    public final void mo78253c(int i, long j, PendingIntent pendingIntent) {
        try {
            ((AlarmManager) this.f230069e.mo27525b()).set(i, j, pendingIntent);
        } catch (IllegalStateException | SecurityException unused) {
        }
    }

    @Deprecated
    /* renamed from: d */
    public final void mo78254d(long j, PendingIntent pendingIntent) {
        if (m135198f()) {
            try {
                ((AlarmManager) this.f230069e.mo27525b()).setExactAndAllowWhileIdle(0, j, pendingIntent);
            } catch (IllegalStateException | SecurityException unused) {
            }
        } else {
            ((C59052c) ((C59052c) f230065d.mo56226d()).mo56372aa(9405)).mo56386p("Unable to set exact timing alarm as SCHEDULE_EXACT_ALARM permission is not granted. Setting inexact alarm instead.");
            mo78253c(0, j, pendingIntent);
        }
    }

    /* renamed from: e */
    public final void mo78255e(long j) {
        C86341u uVar = new C86341u((C86346z) this.f230067b.f232790a.mo79722a());
        uVar.mo80085k("AlarmStartTimeMillis_refresh_alarm", Long.valueOf(j));
        uVar.mo80086l(false);
    }
}
