package com.google.p4583d.p4584a.p4588d;

import com.google.p4583d.p4584a.C61012g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.d.a.d.o */
/* compiled from: PG */
public final class C60988o implements C60987n {

    /* renamed from: a */
    public final String f165122a;

    /* renamed from: b */
    public final ArrayList f165123b;

    public C60988o(String str, List list) {
        this.f165122a = str;
        ArrayList arrayList = new ArrayList();
        this.f165123b = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: d */
    public final C60987n mo57468d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60988o)) {
            return false;
        }
        C60988o oVar = (C60988o) obj;
        String str = this.f165122a;
        if (str == null ? oVar.f165122a == null : str.equals(oVar.f165122a)) {
            return this.f165123b.equals(oVar.f165123b);
        }
        return false;
    }

    /* renamed from: fK */
    public final C60987n mo57452fK(String str, C61012g gVar, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    /* renamed from: g */
    public final Boolean mo57472g() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    /* renamed from: h */
    public final Double mo57473h() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final int hashCode() {
        String str = this.f165122a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f165123b.hashCode();
    }

    /* renamed from: i */
    public final String mo57475i() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    /* renamed from: l */
    public final Iterator mo57479l() {
        return null;
    }
}
