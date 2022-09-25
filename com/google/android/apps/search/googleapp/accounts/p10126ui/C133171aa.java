package com.google.android.apps.search.googleapp.accounts.p10126ui;

import com.google.android.material.snackbar.C44887r;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.concurrent.C46459k;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.aa */
/* compiled from: PG */
public final class C133171aa extends C44887r {

    /* renamed from: a */
    final /* synthetic */ DeleteHistoryCallbacks f363003a;

    public C133171aa(DeleteHistoryCallbacks deleteHistoryCallbacks) {
        this.f363003a = deleteHistoryCallbacks;
    }

    /* renamed from: a */
    public final void mo33567d(Snackbar snackbar) {
        C46459k.m82829b(this.f363003a.f362989c.mo111021a(false), "Failed to clear delete history request failure marker", new Object[0]);
        Snackbar snackbar2 = this.f363003a.f362994h;
        if (snackbar2 != null) {
            snackbar2.mo48340e(3);
        }
        this.f363003a.f362994h = snackbar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo33565b(Object obj, int i) {
        mo111009c((Snackbar) obj);
    }

    /* renamed from: c */
    public final void mo111009c(Snackbar snackbar) {
        DeleteHistoryCallbacks deleteHistoryCallbacks = this.f363003a;
        if (deleteHistoryCallbacks.f362994h == snackbar) {
            deleteHistoryCallbacks.f362994h = null;
        }
    }
}
