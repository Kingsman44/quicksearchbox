package com.google.android.gms.cast.framework;

import android.content.Context;
import com.google.android.gms.cast.framework.internal.C143461y;
import com.google.android.gms.cast.internal.C143584j;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.cast.framework.d */
/* compiled from: PG */
public final /* synthetic */ class C143428d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f388943a;

    /* renamed from: b */
    public final /* synthetic */ CastOptions f388944b;

    /* renamed from: c */
    public final /* synthetic */ C143404al f388945c;

    /* renamed from: d */
    public final /* synthetic */ C143461y f388946d;

    /* renamed from: e */
    public final /* synthetic */ C143584j f388947e;

    public /* synthetic */ C143428d(Context context, CastOptions castOptions, C143404al alVar, C143461y yVar, C143584j jVar) {
        this.f388943a = context;
        this.f388944b = castOptions;
        this.f388945c = alVar;
        this.f388946d = yVar;
        this.f388947e = jVar;
    }

    public final Object call() {
        Context context = this.f388943a;
        CastOptions castOptions = this.f388944b;
        C143404al alVar = this.f388945c;
        C143461y yVar = this.f388946d;
        C143584j jVar = this.f388947e;
        synchronized (C143429e.f388949b) {
            if (C143429e.f388950c == null) {
                C143429e.f388950c = new C143429e(context, castOptions, alVar.getAdditionalSessionProviders(context), yVar, jVar);
            }
        }
        return C143429e.f388950c;
    }
}
