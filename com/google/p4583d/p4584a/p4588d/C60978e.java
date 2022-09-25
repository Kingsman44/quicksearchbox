package com.google.p4583d.p4584a.p4588d;

import com.google.p4583d.p4584a.C61012g;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.d.a.d.e */
/* compiled from: PG */
public final class C60978e implements C60987n {

    /* renamed from: a */
    public final C60987n f165104a;

    /* renamed from: b */
    public final String f165105b;

    public C60978e() {
        C60987n nVar = f165114f;
        throw null;
    }

    public C60978e(String str) {
        this.f165104a = f165114f;
        this.f165105b = str;
    }

    public C60978e(String str, C60987n nVar) {
        this.f165104a = nVar;
        this.f165105b = str;
    }

    /* renamed from: d */
    public final C60987n mo57468d() {
        return new C60978e(this.f165105b, this.f165104a.mo57468d());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C60978e)) {
            return false;
        }
        C60978e eVar = (C60978e) obj;
        return this.f165105b.equals(eVar.f165105b) && this.f165104a.equals(eVar.f165104a);
    }

    /* renamed from: fK */
    public final C60987n mo57452fK(String str, C61012g gVar, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    /* renamed from: g */
    public final Boolean mo57472g() {
        throw new IllegalStateException("Control is not a boolean");
    }

    /* renamed from: h */
    public final Double mo57473h() {
        throw new IllegalStateException("Control is not a double");
    }

    public final int hashCode() {
        return (this.f165105b.hashCode() * 31) + this.f165104a.hashCode();
    }

    /* renamed from: i */
    public final String mo57475i() {
        throw new IllegalStateException("Control is not a String");
    }

    /* renamed from: l */
    public final Iterator mo57479l() {
        return null;
    }
}
