package com.google.android.gms.droidguard.internal;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.gms.droidguard.internal.c */
/* compiled from: PG */
public final class C144123c extends C144121a {

    /* renamed from: b */
    final /* synthetic */ C144128h f390408b;

    public C144123c(C144128h hVar) {
        this.f390408b = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119672a(String str, Throwable th) {
        C144135o oVar = this.f390408b.f390425a;
        String str2 = true != oVar.f390442b.getLooper().getThread().isAlive() ? "(service thread not alive) " : BuildConfig.FLAVOR;
        return new C144132l(oVar, "init " + str2 + str, this.f390438f, th);
    }
}
