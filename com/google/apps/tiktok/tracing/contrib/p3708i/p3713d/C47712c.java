package com.google.apps.tiktok.tracing.contrib.p3708i.p3713d;

import androidx.preference.C4024t;
import androidx.preference.Preference;
import com.google.apps.tiktok.tracing.C47573bx;

/* renamed from: com.google.apps.tiktok.tracing.contrib.i.d.c */
/* compiled from: PG */
public final /* synthetic */ class C47712c implements C4024t {

    /* renamed from: a */
    public final /* synthetic */ C47713d f123673a;

    /* renamed from: b */
    public final /* synthetic */ String f123674b;

    /* renamed from: c */
    public final /* synthetic */ C4024t f123675c;

    public /* synthetic */ C47712c(C47713d dVar, String str, C4024t tVar) {
        this.f123673a = dVar;
        this.f123674b = str;
        this.f123675c = tVar;
    }

    /* renamed from: b */
    public final boolean mo8421b(Preference preference) {
        C47713d dVar = this.f123673a;
        String str = this.f123674b;
        C4024t tVar = this.f123675c;
        C47573bx a = dVar.f123676a.mo51699a("OnPreferenceClickListener", str);
        try {
            boolean b = tVar.mo8421b(preference);
            a.close();
            return b;
        } catch (Throwable th) {
            C47710a.m84863a(th, th);
        }
        throw th;
    }
}
