package com.airbnb.lottie.p238c.p240b;

import com.airbnb.lottie.C4825ac;
import com.airbnb.lottie.p234a.p235a.C4785d;
import com.airbnb.lottie.p234a.p235a.C4786e;
import com.airbnb.lottie.p238c.p241c.C4878b;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.b.m */
/* compiled from: PG */
public final class C4870m implements C4859b {

    /* renamed from: a */
    public final String f15513a;

    /* renamed from: b */
    public final List f15514b;

    /* renamed from: c */
    public final boolean f15515c;

    public C4870m(String str, List list, boolean z) {
        this.f15513a = str;
        this.f15514b = list;
        this.f15515c = z;
    }

    /* renamed from: a */
    public final C4785d mo9801a(C4825ac acVar, C4878b bVar) {
        return new C4786e(acVar, bVar, this);
    }

    public final String toString() {
        String str = this.f15513a;
        String arrays = Arrays.toString(this.f15514b.toArray());
        return "ShapeGroup{name='" + str + "' Shapes: " + arrays + "}";
    }
}
