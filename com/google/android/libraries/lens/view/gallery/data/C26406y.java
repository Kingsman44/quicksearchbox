package com.google.android.libraries.lens.view.gallery.data;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;

/* renamed from: com.google.android.libraries.lens.view.gallery.data.y */
/* compiled from: PG */
public abstract class C26406y {

    /* renamed from: c */
    public static final C26406y f71843c = new C26402u(C26405x.LOADING).mo31601a();

    /* renamed from: d */
    public static final C26406y f71844d = new C26402u(C26405x.NO_PERMISSION).mo31601a();

    /* renamed from: e */
    public static C26402u m48693e() {
        return new C26402u(C26405x.LOADED);
    }

    /* renamed from: a */
    public abstract int mo31578a();

    /* renamed from: b */
    public abstract C26405x mo31579b();

    /* renamed from: c */
    public abstract C58485gu mo31580c();

    /* renamed from: d */
    public abstract C58495hd mo31581d();

    /* renamed from: f */
    public final C58485gu mo31606f(C26403v vVar) {
        return (C58485gu) mo31581d().getOrDefault(vVar, C58485gu.m89845m());
    }
}
