package com.google.android.apps.gsa.nowoverlayservice.p6424c;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90138q;
import com.google.android.libraries.p1730f.C21370a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.c.a */
/* compiled from: PG */
public final class C83484a {

    /* renamed from: a */
    private final C86124t f227623a;

    /* renamed from: b */
    private final SharedPreferences f227624b;

    /* renamed from: c */
    private final C21370a f227625c;

    public C83484a(C86124t tVar, SharedPreferences sharedPreferences, C21370a aVar) {
        this.f227623a = tVar;
        this.f227624b = sharedPreferences;
        this.f227625c = aVar;
    }

    /* renamed from: a */
    public final boolean mo76822a() {
        return this.f227625c.mo26870b() - this.f227624b.getLong("acetone_last_active_timestamp", 0) <= TimeUnit.HOURS.toMillis(this.f227623a.mo79743a(C90138q.f251840n));
    }
}
