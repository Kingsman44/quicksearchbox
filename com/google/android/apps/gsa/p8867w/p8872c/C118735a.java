package com.google.android.apps.gsa.p8867w.p8872c;

import android.content.SharedPreferences;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1047e.C13975b;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.w.c.a */
/* compiled from: PG */
public final /* synthetic */ class C118735a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C118752c f331202a;

    /* renamed from: b */
    public final /* synthetic */ C13975b f331203b;

    public /* synthetic */ C118735a(C118752c cVar, C13975b bVar) {
        this.f331202a = cVar;
        this.f331203b = bVar;
    }

    public final Object call() {
        ((SharedPreferences) this.f331202a.f331239a.mo17428b()).edit().putString("opa_android_sticky_media_app", this.f331203b.f42553b).apply();
        return null;
    }
}
