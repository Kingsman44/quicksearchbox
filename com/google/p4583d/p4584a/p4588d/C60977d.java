package com.google.p4583d.p4584a.p4588d;

import com.google.common.p4535g.C59203do;
import com.google.p4583d.p4584a.C61012g;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.d.a.d.d */
/* compiled from: PG */
public final class C60977d implements C60987n {

    /* renamed from: a */
    private final boolean f165103a;

    public C60977d(Boolean bool) {
        this.f165103a = bool == null ? false : bool.booleanValue();
    }

    /* renamed from: d */
    public final C60987n mo57468d() {
        return new C60977d(Boolean.valueOf(this.f165103a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C60977d) && this.f165103a == ((C60977d) obj).f165103a;
    }

    /* renamed from: fK */
    public final C60987n mo57452fK(String str, C61012g gVar, List list) {
        if ("toString".equals(str)) {
            return new C60991r(Boolean.toString(this.f165103a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{Boolean.toString(this.f165103a), str}));
    }

    /* renamed from: g */
    public final Boolean mo57472g() {
        return Boolean.valueOf(this.f165103a);
    }

    /* renamed from: h */
    public final Double mo57473h() {
        return Double.valueOf(true != this.f165103a ? C59203do.f157270a : 1.0d);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f165103a).hashCode();
    }

    /* renamed from: i */
    public final String mo57475i() {
        return Boolean.toString(this.f165103a);
    }

    /* renamed from: l */
    public final Iterator mo57479l() {
        return null;
    }

    public final String toString() {
        return String.valueOf(this.f165103a);
    }
}
