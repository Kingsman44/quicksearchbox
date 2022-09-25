package com.google.android.apps.search.googleapp.discover.p10166a.p10168b.p10170b;

import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57246ba;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.a.b.b.n */
/* compiled from: PG */
public final class C133966n {

    /* renamed from: a */
    public final int f364886a;

    /* renamed from: b */
    public final C57246ba f364887b;

    /* renamed from: c */
    private final int f364888c;

    public C133966n(int i, C57246ba baVar, int i2) {
        C69664n.m101061g(baVar, "feedAction");
        this.f364886a = i;
        this.f364887b = baVar;
        this.f364888c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C133966n)) {
            return false;
        }
        C133966n nVar = (C133966n) obj;
        return this.f364886a == nVar.f364886a && C69664n.m101066l(this.f364887b, nVar.f364887b) && this.f364888c == nVar.f364888c;
    }

    public final int hashCode() {
        return (((this.f364886a * 31) + this.f364887b.hashCode()) * 31) + this.f364888c;
    }

    public final String toString() {
        int i = this.f364886a;
        C57246ba baVar = this.f364887b;
        int i2 = this.f364888c;
        return "StoredAction(id=" + i + ", feedAction=" + baVar + ", uploadAttemptCount=" + i2 + ")";
    }
}
