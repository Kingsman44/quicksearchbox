package com.google.apps.tiktok.tracing.contrib.androidx.p3697b;

import androidx.preference.C4024t;
import androidx.preference.Preference;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.tracing.contrib.androidx.b.a */
/* compiled from: PG */
public final /* synthetic */ class C47616a implements C4024t {

    /* renamed from: a */
    public final /* synthetic */ C4024t f123541a;

    /* renamed from: b */
    public final /* synthetic */ C47770dh f123542b;

    public /* synthetic */ C47616a(C4024t tVar, C47770dh dhVar) {
        this.f123541a = tVar;
        this.f123542b = dhVar;
    }

    /* renamed from: b */
    public final boolean mo8421b(Preference preference) {
        C4024t tVar = this.f123541a;
        C47770dh dhVar = this.f123542b;
        if (C47831fm.m85027v()) {
            return tVar.mo8421b(preference);
        }
        C47538ax c = dhVar.mo51613c("Settings Page Link Clicked");
        try {
            boolean b = tVar.mo8421b(preference);
            if (c == null) {
                return b;
            }
            c.close();
            return b;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
