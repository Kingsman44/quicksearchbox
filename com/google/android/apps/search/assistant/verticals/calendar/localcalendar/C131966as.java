package com.google.android.apps.search.assistant.verticals.calendar.localcalendar;

import com.google.android.apps.search.assistant.platform.p8988a.C119500b;
import com.google.apps.tiktok.p3663j.C47352j;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.as */
/* compiled from: PG */
final class C131966as implements C47352j {

    /* renamed from: a */
    private final boolean f360306a;

    /* renamed from: b */
    private final C119500b f360307b;

    /* renamed from: c */
    private final Executor f360308c;

    /* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.as$a */
    /* compiled from: PG */
    public interface C131967a {
        /* renamed from: bq */
        C131959al mo110360bq();
    }

    public C131966as(boolean z, C119500b bVar, Executor executor) {
        this.f360306a = z;
        this.f360307b = bVar;
        this.f360308c = executor;
    }

    /* renamed from: b */
    public final C60870cx mo19293b() {
        if (!this.f360306a) {
            return C60856cj.m92900i(false);
        }
        return C47633f.m84733g(this.f360307b.mo104411a(C131967a.class)).mo51515h(C131964aq.f360304a, this.f360308c).mo51516i(C131965ar.f360305a, this.f360308c);
    }
}
