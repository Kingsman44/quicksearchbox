package com.google.android.apps.gsa.p8867w.p8868a.p8869a;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.w.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C118728a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C118729b f331190a;

    /* renamed from: b */
    public final /* synthetic */ String f331191b;

    public /* synthetic */ C118728a(C118729b bVar, String str) {
        this.f331190a = bVar;
        this.f331191b = str;
    }

    public final Object call() {
        C118729b bVar = this.f331190a;
        ((SharedPreferences) bVar.f331192a.mo17428b()).edit().putString("opa_android_sticky_media_app", this.f331191b).apply();
        return null;
    }
}
