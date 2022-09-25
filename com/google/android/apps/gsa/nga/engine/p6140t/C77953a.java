package com.google.android.apps.gsa.nga.engine.p6140t;

import com.google.android.apps.gsa.nga.engine.understanding.p6241h.p6242a.C79149g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.t.a */
/* compiled from: PG */
final class C77953a extends C77982v {

    /* renamed from: a */
    public final int f214702a;

    /* renamed from: b */
    public final int f214703b;

    /* renamed from: d */
    private final C79149g f214704d;

    /* renamed from: e */
    private final C58485gu f214705e;

    /* renamed from: f */
    private final Locale f214706f;

    public C77953a(C79149g gVar, C58485gu guVar, Locale locale, int i, int i2) {
        this.f214704d = gVar;
        this.f214705e = guVar;
        this.f214706f = locale;
        this.f214702a = i;
        this.f214703b = i2;
    }

    /* renamed from: a */
    public final int mo72913a() {
        return this.f214703b;
    }

    /* renamed from: b */
    public final int mo72914b() {
        return this.f214702a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C79149g mo72915c() {
        return this.f214704d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C58485gu mo72916d() {
        return this.f214705e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final Locale mo72917e() {
        return this.f214706f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C77982v) {
            C77982v vVar = (C77982v) obj;
            C79149g gVar = this.f214704d;
            if (gVar != null ? gVar.equals(vVar.mo72915c()) : vVar.mo72915c() == null) {
                C58485gu guVar = this.f214705e;
                if (guVar != null ? C58597ky.m90218i(guVar, vVar.mo72916d()) : vVar.mo72916d() == null) {
                    Locale locale = this.f214706f;
                    if (locale != null ? locale.equals(vVar.mo72917e()) : vVar.mo72917e() == null) {
                        return this.f214702a == vVar.mo72914b() && this.f214703b == vVar.mo72913a();
                    }
                }
            }
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f214704d);
        String valueOf2 = String.valueOf(this.f214705e);
        String valueOf3 = String.valueOf(this.f214706f);
        int i = this.f214702a;
        int i2 = this.f214703b;
        return "SearchableEmailsImpl{keywordsExtractor=" + valueOf + ", emailThreads=" + valueOf2 + ", locale=" + valueOf3 + ", storedKeywordsCount=" + i + ", originalKeywordsCount=" + i2 + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        C79149g gVar = this.f214704d;
        int i3 = 0;
        if (gVar == null) {
            i = 0;
        } else {
            i = gVar.hashCode();
        }
        int i4 = (i ^ 1000003) * 1000003;
        C58485gu guVar = this.f214705e;
        if (guVar == null) {
            i2 = 0;
        } else {
            i2 = guVar.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        Locale locale = this.f214706f;
        if (locale != null) {
            i3 = locale.hashCode();
        }
        return ((((i5 ^ i3) * 1000003) ^ this.f214702a) * 1000003) ^ this.f214703b;
    }
}
