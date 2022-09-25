package com.google.p4583d.p4584a.p4588d;

import com.google.p4583d.p4584a.C61012g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.d.a.d.g */
/* compiled from: PG */
public abstract class C60980g implements C60987n, C60983j {

    /* renamed from: d */
    public final String f165107d;

    /* renamed from: e */
    protected final Map f165108e = new HashMap();

    public C60980g(String str) {
        this.f165107d = str;
    }

    /* renamed from: a */
    public abstract C60987n mo57451a(C61012g gVar, List list);

    /* renamed from: d */
    public C60987n mo57468d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60980g)) {
            return false;
        }
        C60980g gVar = (C60980g) obj;
        String str = this.f165107d;
        if (str != null) {
            return str.equals(gVar.f165107d);
        }
        return false;
    }

    /* renamed from: f */
    public final C60987n mo57471f(String str) {
        return this.f165108e.containsKey(str) ? (C60987n) this.f165108e.get(str) : f165114f;
    }

    /* renamed from: fK */
    public final C60987n mo57452fK(String str, C61012g gVar, List list) {
        if ("toString".equals(str)) {
            return new C60991r(this.f165107d);
        }
        return C60981h.m93180a(this, new C60991r(str), gVar, list);
    }

    /* renamed from: g */
    public final Boolean mo57472g() {
        return true;
    }

    /* renamed from: h */
    public final Double mo57473h() {
        return Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        String str = this.f165107d;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* renamed from: i */
    public final String mo57475i() {
        return this.f165107d;
    }

    /* renamed from: l */
    public final Iterator mo57479l() {
        return C60981h.m93181b(this.f165108e);
    }

    /* renamed from: q */
    public final void mo57484q(String str, C60987n nVar) {
        if (nVar == null) {
            this.f165108e.remove(str);
        } else {
            this.f165108e.put(str, nVar);
        }
    }

    /* renamed from: s */
    public final boolean mo57486s(String str) {
        return this.f165108e.containsKey(str);
    }
}
