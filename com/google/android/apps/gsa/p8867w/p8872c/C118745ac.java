package com.google.android.apps.gsa.p8867w.p8872c;

import android.content.SharedPreferences;
import com.google.android.libraries.assistant.auto.tng.media.p1053d.p1059d.C14002b;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.w.c.ac */
/* compiled from: PG */
public final /* synthetic */ class C118745ac implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C118747ae f331229a;

    /* renamed from: b */
    public final /* synthetic */ C14002b f331230b;

    public /* synthetic */ C118745ac(C118747ae aeVar, C14002b bVar) {
        this.f331229a = aeVar;
        this.f331230b = bVar;
    }

    public final Object call() {
        ((SharedPreferences) this.f331229a.f331232a.mo17428b()).edit().putString("opa_on_auto_sticky_media_app", this.f331230b.f42602b).apply();
        return null;
    }
}
