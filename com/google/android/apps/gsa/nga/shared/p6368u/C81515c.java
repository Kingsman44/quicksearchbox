package com.google.android.apps.gsa.nga.shared.p6368u;

import android.content.Context;
import com.google.common.base.C58838bb;
import com.google.common.p4520a.C58254i;
import com.google.common.p4520a.C58259n;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.shared.u.c */
/* compiled from: PG */
public final class C81515c {

    /* renamed from: a */
    private final C58259n f222933a;

    public C81515c(Context context) {
        C58254i iVar = new C58254i();
        iVar.mo54823g(5);
        int i = iVar.f155788e;
        C58838bb.m90885t(i == -1, "initial capacity was already set to %s", i);
        iVar.f155788e = 1;
        this.f222933a = iVar.mo54818b(new C81514b(context));
    }

    /* renamed from: a */
    public final Context mo75121a(Locale locale) {
        return (Context) this.f222933a.mo54699a(locale);
    }

    /* renamed from: b */
    public final C81516d mo75122b(Locale locale, int i, Object... objArr) {
        return new C81513a(mo75121a(locale).getString(i, objArr), locale);
    }

    /* renamed from: c */
    public final String[] mo75123c(Locale locale, int i) {
        return mo75121a(locale).getResources().getStringArray(i);
    }
}
