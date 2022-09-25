package com.google.apps.tiktok.tracing.contrib.p3708i.p3713d;

import androidx.preference.C4023s;
import androidx.preference.Preference;
import com.google.apps.tiktok.tracing.C47573bx;

/* renamed from: com.google.apps.tiktok.tracing.contrib.i.d.b */
/* compiled from: PG */
public final /* synthetic */ class C47711b implements C4023s {

    /* renamed from: a */
    public final /* synthetic */ C47713d f123670a;

    /* renamed from: b */
    public final /* synthetic */ String f123671b;

    /* renamed from: c */
    public final /* synthetic */ C4023s f123672c;

    public /* synthetic */ C47711b(C47713d dVar, String str, C4023s sVar) {
        this.f123670a = dVar;
        this.f123671b = str;
        this.f123672c = sVar;
    }

    /* renamed from: a */
    public final boolean mo8472a(Preference preference, Object obj) {
        C47713d dVar = this.f123670a;
        String str = this.f123671b;
        C4023s sVar = this.f123672c;
        C47573bx a = dVar.f123676a.mo51699a("OnPreferenceChangeListener", str);
        try {
            boolean a2 = sVar.mo8472a(preference, obj);
            a.close();
            return a2;
        } catch (Throwable th) {
            C47710a.m84863a(th, th);
        }
        throw th;
    }
}
