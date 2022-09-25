package com.google.android.apps.gsa.opa.p6435c;

/* renamed from: com.google.android.apps.gsa.opa.c.b */
/* compiled from: PG */
public abstract class C83590b implements Comparable {
    /* renamed from: a */
    public abstract Integer mo76946a();

    /* renamed from: b */
    public abstract Integer mo76947b();

    /* renamed from: c */
    public final Integer mo76951c() {
        return Integer.valueOf(mo76947b().intValue() + mo76946a().intValue());
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return mo76947b().compareTo(((C83590b) obj).mo76947b());
    }
}
