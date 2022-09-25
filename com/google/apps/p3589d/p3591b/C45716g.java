package com.google.apps.p3589d.p3591b;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.apps.d.b.g */
/* compiled from: PG */
public class C45716g implements Iterable {

    /* renamed from: a */
    public ArrayList f120220a;

    protected C45716g(ArrayList arrayList) {
        this.f120220a = arrayList;
    }

    /* renamed from: a */
    public final C45719j mo49812a(C45713d dVar) {
        return mo49814c(new C45710a(dVar)).mo49829f();
    }

    /* renamed from: b */
    public final C45719j mo49813b(int i, int i2) {
        int max = Math.max(i, 0);
        int min = Math.min(i2, this.f120220a.size());
        C45723n nVar = new C45723n(Math.max(min - max, 0));
        while (max < min) {
            nVar.f120220a.add(mo49815d(max));
            max++;
        }
        return nVar.mo49829f();
    }

    /* renamed from: c */
    public final C45723n mo49814c(C45714e eVar) {
        C45723n nVar = new C45723n(this.f120220a.size());
        for (int i = 0; i < this.f120220a.size(); i++) {
            nVar.f120220a.add(eVar.mo49804a(mo49815d(i), i));
        }
        return nVar;
    }

    /* renamed from: d */
    public final Object mo49815d(int i) {
        Object e = mo49816e(i);
        if (e != null) {
            return e;
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: e */
    public final Object mo49816e(int i) {
        if (i < 0 || i >= this.f120220a.size()) {
            return null;
        }
        return this.f120220a.get(i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && (obj instanceof C45716g) && this.f120220a.equals(((C45716g) obj).f120220a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f120220a.hashCode();
    }

    public final Iterator iterator() {
        return new C45712c(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f120220a.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo49815d(i));
        }
        String sb2 = sb.toString();
        return "[" + sb2 + "]";
    }
}
