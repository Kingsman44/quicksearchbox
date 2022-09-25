package com.google.android.apps.gsa.shared.p7003av;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3994s.p3995a.C53306j;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.shared.av.c */
/* compiled from: PG */
public final class C89295c {

    /* renamed from: a */
    private final C21370a f242105a;

    /* renamed from: b */
    private final C90021c f242106b;

    public C89295c(C21370a aVar, C90021c cVar) {
        this.f242105a = aVar;
        this.f242106b = cVar;
    }

    /* renamed from: a */
    public final boolean mo83233a(SharedPreferences sharedPreferences, String str, String str2) {
        if (!(str == null || str2 == null)) {
            if (!sharedPreferences.contains(String.format("%s%s_%s", new Object[]{"opa_zero_state_last_shown_time_millis_", str, str2}))) {
                if (this.f242105a.mo26870b() - sharedPreferences.getLong(String.format("%s%s_%s_%s", new Object[]{"opa_zero_state_last_updated_time_millis_", str, str2, C53306j.MAIN_APP.name()}), 1) < Duration.ofMinutes(this.f242106b.mo79743a(C90014bt.f247827on)).toMillis()) {
                    return true;
                }
            }
        }
        return false;
    }
}
