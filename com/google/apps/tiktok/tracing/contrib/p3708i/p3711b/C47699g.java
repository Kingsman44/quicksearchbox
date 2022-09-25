package com.google.apps.tiktok.tracing.contrib.p3708i.p3711b;

import com.google.android.apps.search.googleapp.accounts.p10126ui.C133171aa;
import com.google.android.material.snackbar.C44887r;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.tracing.contrib.i.b.g */
/* compiled from: PG */
public final class C47699g extends C44887r {

    /* renamed from: a */
    final /* synthetic */ C44887r f123655a;

    /* renamed from: b */
    final /* synthetic */ String f123656b = "snackbar callback";

    /* renamed from: c */
    final /* synthetic */ C47700h f123657c;

    public C47699g(C47700h hVar, C44887r rVar) {
        this.f123657c = hVar;
        this.f123655a = rVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo33565b(Object obj, int i) {
        if (C47831fm.m85027v()) {
            ((C133171aa) this.f123655a).mo111009c((Snackbar) obj);
            return;
        }
        C47538ax c = this.f123657c.f123658a.mo51613c(this.f123656b);
        try {
            ((C133171aa) this.f123655a).mo111009c((Snackbar) obj);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47698f.m84837a(th, th);
        }
        throw th;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo33567d(Object obj) {
        if (C47831fm.m85027v()) {
            ((C133171aa) this.f123655a).mo33567d((Snackbar) obj);
            return;
        }
        C47538ax c = this.f123657c.f123658a.mo51613c(this.f123656b);
        try {
            ((C133171aa) this.f123655a).mo33567d((Snackbar) obj);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47698f.m84837a(th, th);
        }
        throw th;
    }
}
