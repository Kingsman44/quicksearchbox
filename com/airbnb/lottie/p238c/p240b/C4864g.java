package com.airbnb.lottie.p238c.p240b;

import com.airbnb.lottie.C4825ac;
import com.airbnb.lottie.p234a.p235a.C4785d;
import com.airbnb.lottie.p234a.p235a.C4794m;
import com.airbnb.lottie.p238c.p241c.C4878b;
import com.airbnb.lottie.p245f.C4946c;
import com.airbnb.lottie.p245f.C4947d;

/* renamed from: com.airbnb.lottie.c.b.g */
/* compiled from: PG */
public final class C4864g implements C4859b {

    /* renamed from: a */
    public final boolean f15482a;

    /* renamed from: b */
    public final int f15483b;

    public C4864g(int i, boolean z) {
        this.f15483b = i;
        this.f15482a = z;
    }

    /* renamed from: a */
    public final C4785d mo9801a(C4825ac acVar, C4878b bVar) {
        if (acVar.f15350j) {
            return new C4794m(this);
        }
        ((C4946c) C4947d.f15711a).mo9784a("Animation contains merge paths but they are disabled.", (Throwable) null);
        return null;
    }

    public final String toString() {
        int i = this.f15483b;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "EXCLUDE_INTERSECTIONS" : "INTERSECT" : "SUBTRACT" : "ADD" : "MERGE";
        return "MergePaths{mode=" + str + "}";
    }
}
