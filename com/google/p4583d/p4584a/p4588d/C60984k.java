package com.google.p4583d.p4584a.p4588d;

import com.google.p4583d.p4584a.C61012g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.d.a.d.k */
/* compiled from: PG */
public class C60984k implements C60987n, C60983j {

    /* renamed from: a */
    public final Map f165110a = new HashMap();

    /* renamed from: d */
    public final C60987n mo57468d() {
        C60984k kVar = new C60984k();
        for (Map.Entry entry : this.f165110a.entrySet()) {
            if (entry.getValue() instanceof C60983j) {
                kVar.f165110a.put((String) entry.getKey(), (C60987n) entry.getValue());
            } else {
                kVar.f165110a.put((String) entry.getKey(), ((C60987n) entry.getValue()).mo57468d());
            }
        }
        return kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60984k)) {
            return false;
        }
        return this.f165110a.equals(((C60984k) obj).f165110a);
    }

    /* renamed from: f */
    public final C60987n mo57471f(String str) {
        return this.f165110a.containsKey(str) ? (C60987n) this.f165110a.get(str) : f165114f;
    }

    /* renamed from: fK */
    public C60987n mo57452fK(String str, C61012g gVar, List list) {
        if ("toString".equals(str)) {
            return new C60991r(toString());
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
        return this.f165110a.hashCode();
    }

    /* renamed from: i */
    public final String mo57475i() {
        return "[object Object]";
    }

    /* renamed from: l */
    public final Iterator mo57479l() {
        return C60981h.m93181b(this.f165110a);
    }

    /* renamed from: q */
    public final void mo57484q(String str, C60987n nVar) {
        if (nVar == null) {
            this.f165110a.remove(str);
        } else {
            this.f165110a.put(str, nVar);
        }
    }

    /* renamed from: s */
    public final boolean mo57486s(String str) {
        return this.f165110a.containsKey(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f165110a.isEmpty()) {
            for (String str : this.f165110a.keySet()) {
                sb.append(String.format("%s: %s,", new Object[]{str, this.f165110a.get(str)}));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
