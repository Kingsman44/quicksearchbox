package com.google.p5238v.p5239a.p5250f;

import com.google.p5238v.p5239a.p5260n.C67898a;
import p3186j$.util.Objects;

/* renamed from: com.google.v.a.f.y */
/* compiled from: PG */
final class C67618y {

    /* renamed from: a */
    private final Class f183562a;

    /* renamed from: b */
    private final C67898a f183563b;

    public C67618y(Class cls, C67898a aVar) {
        this.f183562a = cls;
        this.f183563b = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C67618y)) {
            return false;
        }
        C67618y yVar = (C67618y) obj;
        if (!yVar.f183562a.equals(this.f183562a) || !yVar.f183563b.equals(this.f183563b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f183562a, this.f183563b);
    }

    public final String toString() {
        String simpleName = this.f183562a.getSimpleName();
        String valueOf = String.valueOf(this.f183563b);
        return simpleName + ", object identifier: " + valueOf;
    }
}
