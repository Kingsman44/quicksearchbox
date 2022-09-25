package com.google.android.apps.gsa.nga.shared.p6368u;

import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.shared.u.a */
/* compiled from: PG */
public final class C81513a extends C81516d {

    /* renamed from: a */
    public final Locale f222930a;

    /* renamed from: b */
    private final CharSequence f222931b;

    public C81513a(CharSequence charSequence, Locale locale) {
        if (charSequence != null) {
            this.f222931b = charSequence;
            if (locale != null) {
                this.f222930a = locale;
                return;
            }
            throw new NullPointerException("Null locale");
        }
        throw new NullPointerException("Null string");
    }

    /* renamed from: a */
    public final CharSequence mo75117a() {
        return this.f222931b;
    }

    /* renamed from: b */
    public final Locale mo75118b() {
        return this.f222930a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C81516d) {
            C81516d dVar = (C81516d) obj;
            return this.f222931b.equals(dVar.mo75117a()) && this.f222930a.equals(dVar.mo75118b());
        }
    }

    public final int hashCode() {
        return ((this.f222931b.hashCode() ^ 1000003) * 1000003) ^ this.f222930a.hashCode();
    }
}
