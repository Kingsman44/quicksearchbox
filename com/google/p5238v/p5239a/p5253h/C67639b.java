package com.google.p5238v.p5239a.p5253h;

import com.google.p5238v.p5239a.C67901q;
import com.google.p5238v.p5239a.C67910z;
import p3186j$.util.Objects;

/* renamed from: com.google.v.a.h.b */
/* compiled from: PG */
public final class C67639b {

    /* renamed from: a */
    public final int f183588a;

    /* renamed from: b */
    private final C67901q f183589b;

    /* renamed from: c */
    private final C67910z f183590c;

    public C67639b(C67901q qVar, int i, C67910z zVar) {
        this.f183589b = qVar;
        this.f183588a = i;
        this.f183590c = zVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C67639b)) {
            return false;
        }
        C67639b bVar = (C67639b) obj;
        if (this.f183589b == bVar.f183589b && this.f183588a == bVar.f183588a && this.f183590c.equals(bVar.f183590c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f183589b, Integer.valueOf(this.f183588a), Integer.valueOf(this.f183590c.hashCode()));
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, parameters='%s')", new Object[]{this.f183589b, Integer.valueOf(this.f183588a), this.f183590c});
    }
}
