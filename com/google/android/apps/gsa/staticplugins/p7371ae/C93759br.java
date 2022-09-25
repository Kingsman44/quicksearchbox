package com.google.android.apps.gsa.staticplugins.p7371ae;

import android.content.SharedPreferences;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.p395al.p417d.p418a.C8588o;

/* renamed from: com.google.android.apps.gsa.staticplugins.ae.br */
/* compiled from: PG */
public final /* synthetic */ class C93759br implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ SharedPreferences f261656a;

    /* renamed from: b */
    public final /* synthetic */ C93742ba f261657b;

    /* renamed from: c */
    public final /* synthetic */ C21370a f261658c;

    public /* synthetic */ C93759br(SharedPreferences sharedPreferences, C93742ba baVar, C21370a aVar) {
        this.f261656a = sharedPreferences;
        this.f261657b = baVar;
        this.f261658c = aVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        SharedPreferences sharedPreferences = this.f261656a;
        C93742ba baVar = this.f261657b;
        C21370a aVar = this.f261658c;
        if (!sharedPreferences.contains("last_prompt_display_time_millis")) {
            return false;
        }
        C8588o c = baVar.f261615b.mo70990c();
        long j = sharedPreferences.getLong("backoff_period_millis", 0);
        long min = (c.f29721a & 1) != 0 ? Math.min(j, c.f29722b) : j;
        long b = aVar.mo26870b();
        long j2 = sharedPreferences.getLong("last_prompt_display_time_millis", 0);
        if (sharedPreferences.getBoolean("last_prompt_was_accepted", true) || j <= 0 || Math.abs(b - j2) >= min) {
            return false;
        }
        return true;
    }
}
