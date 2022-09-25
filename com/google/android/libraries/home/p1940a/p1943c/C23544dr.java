package com.google.android.libraries.home.p1940a.p1943c;

import com.google.assistant.p3897e.p3921j.p3926e.C52021ht;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.dr */
/* compiled from: PG */
public abstract class C23544dr {
    /* renamed from: a */
    public abstract C23542dp mo28874a();

    /* renamed from: b */
    public abstract Object mo28888b();

    /* renamed from: c */
    public abstract String mo28875c();

    /* renamed from: d */
    public abstract String mo28876d();

    /* renamed from: e */
    public abstract void mo28889e(C52021ht htVar);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23544dr)) {
            return false;
        }
        C23544dr drVar = (C23544dr) obj;
        return Objects.equals(mo28888b(), drVar.mo28888b()) && Objects.equals(mo28874a(), drVar.mo28874a()) && mo28878f() == drVar.mo28878f() && mo28879g() == drVar.mo28879g() && Objects.equals(mo28876d(), drVar.mo28876d()) && Objects.equals(mo28875c(), drVar.mo28875c());
    }

    /* renamed from: f */
    public abstract boolean mo28878f();

    /* renamed from: g */
    public abstract boolean mo28879g();

    public int hashCode() {
        return Objects.hash(mo28888b(), mo28874a(), Boolean.valueOf(mo28878f()), Boolean.valueOf(mo28879g()), mo28876d(), mo28875c());
    }

    /* renamed from: i */
    public final Optional mo28913i() {
        Optional ofNullable = Optional.ofNullable(mo28875c());
        C69664n.m101060f(ofNullable, "ofNullable(executionParameterNameString)");
        return ofNullable;
    }

    /* renamed from: j */
    public final Optional mo28914j() {
        Optional ofNullable = Optional.ofNullable(mo28874a());
        C69664n.m101060f(ofNullable, "ofNullable(paramType)");
        return ofNullable;
    }

    public String toString() {
        C23542dp a = mo28874a();
        Object b = mo28888b();
        return "HomeAutomationParameter<" + a + ">(" + b + ")";
    }
}
