package com.google.android.libraries.logging.p2185ve;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28317d;
import com.google.android.libraries.logging.p2185ve.p2193e.p2197d.p2198a.C28409a;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.logging.ve.ab */
/* compiled from: PG */
public final class C28306ab {

    /* renamed from: a */
    public final C28310af f76990a;

    /* renamed from: b */
    private final C28317d f76991b;

    public C28306ab(C28310af afVar, C28317d dVar) {
        this.f76990a = afVar;
        this.f76991b = dVar;
    }

    /* renamed from: e */
    public static final void m52929e(View view) {
        C19559g.m37304c();
        C28439i a = C28485y.m53234a(view);
        C58838bb.m90866a(a, "View does not have an associated CVE.");
        a.mo33886c();
    }

    /* renamed from: f */
    public static final void m52930f(Activity activity) {
        C19559g.m37304c();
        int i = C28485y.f77298f;
        C28439i a = C28485y.m53234a(activity.findViewById(16908290));
        if (a != null) {
            new C28305aa().mo33799b(a);
        } else if (Log.isLoggable("GIL", 3)) {
            Log.d("GIL", "Not resetting VE state (no root CVE)");
        }
    }

    /* renamed from: g */
    public static final void m52931g(View view) {
        C19559g.m37304c();
        C28439i a = C28485y.m53234a(view);
        a.getClass();
        C28310af.m52938c(a);
    }

    @Deprecated
    /* renamed from: a */
    public final C28313c mo33800a(C28427h hVar) {
        return new C28313c(hVar, C28486z.f77316a, this.f76991b, this);
    }

    /* renamed from: b */
    public final C28439i mo33801b(View view, C28313c cVar) {
        C19559g.m37304c();
        C28439i e = cVar.mo33857e(this.f76991b);
        C28439i a = C28485y.m53234a(view);
        if (a == null) {
            C28485y.m53236q(view, e);
            return e;
        } else if (a.mo33888e()) {
            if (a.mo33889f()) {
                C28317d dVar = this.f76991b;
                IllegalStateException illegalStateException = new IllegalStateException("CVE is already impressed and cannot be replaced.");
                C28409a aVar = dVar.f77003b;
                C28409a.m53084a(illegalStateException);
            } else {
                C28317d dVar2 = this.f76991b;
                IllegalStateException illegalStateException2 = new IllegalStateException("CVE is already attached and cannot be replaced.");
                C28409a aVar2 = dVar2.f77003b;
                C28409a.m53084a(illegalStateException2);
            }
            return a;
        } else {
            a.mo33887d(e);
            return a;
        }
    }

    /* renamed from: c */
    public final C28439i mo33802c(View view, C28313c cVar) {
        C28439i a = C28485y.m53234a(view);
        return a == null ? mo33801b(view, cVar) : a;
    }

    /* renamed from: d */
    public final void mo33803d(View view, C28313c cVar) {
        C28439i a = C28485y.m53234a(view);
        if (a == null) {
            mo33801b(view, cVar);
        } else if (a.mo33884a().f77294g != ((C28481u) cVar.f77062a.instance).f77294g) {
            throw new IllegalArgumentException("Disallowed Difference in CVE");
        } else if (a.mo33884a().f77293f != ((C28481u) cVar.f77062a.instance).f77293f) {
            C28310af.m52938c(a);
            a.mo33885b();
            a.mo33887d(cVar.mo33857e(this.f76991b));
        }
    }
}
