package com.google.android.libraries.gsa.monet.tools.children.shared;

/* renamed from: com.google.android.libraries.gsa.monet.tools.children.shared.g */
/* compiled from: PG */
final class C23238g {

    /* renamed from: a */
    public final ChildData f63691a;

    /* renamed from: b */
    public final int f63692b;

    /* renamed from: c */
    public final int f63693c;

    /* renamed from: d */
    public final int f63694d;

    public C23238g(int i, ChildData childData, int i2, int i3) {
        this.f63694d = i;
        this.f63691a = childData;
        this.f63692b = i2;
        this.f63693c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C23238g gVar = (C23238g) obj;
        if (this.f63692b != gVar.f63692b || this.f63693c != gVar.f63693c || this.f63694d != gVar.f63694d) {
            return false;
        }
        ChildData childData = this.f63691a;
        if (childData != null) {
            return childData.equals(gVar.f63691a);
        }
        return gVar.f63691a == null;
    }

    public final int hashCode() {
        int i = this.f63694d * 31;
        ChildData childData = this.f63691a;
        return ((((i + (childData != null ? childData.hashCode() : 0)) * 31) + this.f63692b) * 31) + this.f63693c;
    }
}
