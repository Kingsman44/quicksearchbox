package com.google.android.apps.search.googleapp.p10253e;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.googleapp.e.b */
/* compiled from: PG */
public final /* synthetic */ class C135371b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C135372c f368837a;

    /* renamed from: b */
    public final /* synthetic */ SharedPreferences f368838b;

    public /* synthetic */ C135371b(C135372c cVar, SharedPreferences sharedPreferences) {
        this.f368837a = cVar;
        this.f368838b = sharedPreferences;
    }

    public final Object call() {
        C135372c cVar = this.f368837a;
        SharedPreferences sharedPreferences = this.f368838b;
        Stream stream = Collection.EL.stream(cVar.f368839a);
        Objects.requireNonNull(sharedPreferences);
        return Boolean.valueOf(stream.anyMatch(new C135370a(sharedPreferences)));
    }
}
