package com.google.android.libraries.logging.p2185ve;

import android.util.Log;
import android.view.View;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28317d;

/* renamed from: com.google.android.libraries.logging.ve.af */
/* compiled from: PG */
public final class C28310af {

    /* renamed from: a */
    public final C28317d f76996a;

    /* renamed from: b */
    public final C28306ab f76997b;

    public C28310af(C28317d dVar) {
        this.f76996a = dVar;
        this.f76997b = new C28306ab(this, dVar);
    }

    /* renamed from: c */
    public static final void m52938c(C28439i iVar) {
        if (Log.isLoggable("GIL", 3)) {
            Log.d("GIL", "Resetting impression for: ".concat(iVar.toString()));
        }
        new C28309ae(iVar.f77219e.mo33835c()).mo33799b(iVar);
    }

    /* renamed from: a */
    public final C28313c mo33805a(C28427h hVar) {
        return new C28313c(hVar, C28307ac.f76992a, this.f76996a, (C28306ab) null);
    }

    @Deprecated
    /* renamed from: b */
    public final C28313c mo33806b(View view, int i) {
        return new C28313c(C28427h.m53115a(i), new C28308ad(this, view), this.f76996a, (C28306ab) null);
    }
}
