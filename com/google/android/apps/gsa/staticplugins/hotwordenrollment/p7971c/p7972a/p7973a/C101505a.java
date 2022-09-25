package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.a */
/* compiled from: PG */
final class C101505a extends C101526h {

    /* renamed from: a */
    public C58833ax f283266a;

    /* renamed from: b */
    private boolean f283267b;

    /* renamed from: c */
    private C58833ax f283268c;

    /* renamed from: d */
    private byte f283269d;

    public C101505a() {
        C58836b bVar = C58836b.f156633a;
        this.f283268c = bVar;
        this.f283266a = bVar;
    }

    /* renamed from: a */
    public final C101527i mo92364a() {
        if (this.f283269d == 1) {
            return new C101520b(this.f283267b, this.f283268c, this.f283266a);
        }
        throw new IllegalStateException("Missing required properties: isSuccessful");
    }

    /* renamed from: b */
    public final void mo92365b(boolean z) {
        this.f283268c = C58833ax.m90834k(Boolean.valueOf(z));
    }

    /* renamed from: c */
    public final void mo92366c(boolean z) {
        this.f283267b = z;
        this.f283269d = 1;
    }
}
