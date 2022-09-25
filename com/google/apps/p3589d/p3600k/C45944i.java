package com.google.apps.p3589d.p3600k;

import com.google.common.p4535g.C59203do;

/* renamed from: com.google.apps.d.k.i */
/* compiled from: PG */
public abstract class C45944i {

    /* renamed from: c */
    public static final C45944i f120734c = new C45937b(C59203do.f157270a, C59203do.f157270a);

    /* renamed from: a */
    public abstract double mo50042a();

    /* renamed from: b */
    public abstract double mo50043b();

    /* renamed from: c */
    public final C45944i mo50055c(double d, double d2) {
        return new C45937b(mo50042a() + d, mo50043b() + d2);
    }

    /* renamed from: d */
    public final C45944i mo50056d(C45944i iVar) {
        C45937b bVar = (C45937b) iVar;
        return mo50055c(bVar.f120725a, bVar.f120726b);
    }

    /* renamed from: e */
    public final C45944i mo50057e(double d) {
        return new C45937b(mo50042a() + d, mo50043b());
    }

    /* renamed from: f */
    public final C45944i mo50058f(double d) {
        return new C45937b(mo50042a(), mo50043b() + d);
    }

    /* renamed from: g */
    public final C45944i mo50059g(C45944i iVar) {
        C45937b bVar = (C45937b) iVar;
        return new C45937b(mo50042a() - bVar.f120725a, mo50043b() - bVar.f120726b);
    }
}
