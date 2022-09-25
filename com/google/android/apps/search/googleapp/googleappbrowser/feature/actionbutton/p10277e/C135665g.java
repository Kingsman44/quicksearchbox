package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10277e;

import com.google.android.libraries.web.contrib.p3375f.p3381c.C43541a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.e.g */
/* compiled from: PG */
public final class C135665g {

    /* renamed from: a */
    public final C43541a f369531a;

    /* renamed from: b */
    public final int f369532b;

    /* renamed from: c */
    public final boolean f369533c;

    public C135665g(C43541a aVar, int i, boolean z) {
        C69664n.m101061g(aVar, "overflowMenuItem");
        this.f369531a = aVar;
        this.f369532b = i;
        this.f369533c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135665g)) {
            return false;
        }
        C135665g gVar = (C135665g) obj;
        return C69664n.m101066l(this.f369531a, gVar.f369531a) && this.f369532b == gVar.f369532b && this.f369533c == gVar.f369533c;
    }

    public final int hashCode() {
        return (((this.f369531a.hashCode() * 31) + this.f369532b) * 31) + (this.f369533c ? 1 : 0);
    }

    public final String toString() {
        C43541a aVar = this.f369531a;
        int i = this.f369532b;
        boolean z = this.f369533c;
        return "IconicOverflowMenuItem(overflowMenuItem=" + aVar + ", icon=" + i + ", closeMenuOnClickImmediately=" + z + ")";
    }
}
