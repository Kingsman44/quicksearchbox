package com.google.android.apps.gsa.p8867w.p8872c;

import android.content.SharedPreferences;
import com.google.android.libraries.assistant.auto.tng.media.p1053d.p1059d.C14004d;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.w.c.af */
/* compiled from: PG */
public final /* synthetic */ class C118748af implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C118749ag f331234a;

    /* renamed from: b */
    public final /* synthetic */ C14004d f331235b;

    public /* synthetic */ C118748af(C118749ag agVar, C14004d dVar) {
        this.f331234a = agVar;
        this.f331235b = dVar;
    }

    public final Object call() {
        ((SharedPreferences) this.f331234a.f331236a.mo17428b()).edit().putString("opa_on_auto_oem_radio_sticky_app", this.f331235b.f42606b).apply();
        return null;
    }
}
