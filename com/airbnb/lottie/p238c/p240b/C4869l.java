package com.airbnb.lottie.p238c.p240b;

import android.graphics.Path;
import com.airbnb.lottie.C4825ac;
import com.airbnb.lottie.p234a.p235a.C4785d;
import com.airbnb.lottie.p234a.p235a.C4789h;
import com.airbnb.lottie.p238c.p239a.C4843a;
import com.airbnb.lottie.p238c.p239a.C4846d;
import com.airbnb.lottie.p238c.p241c.C4878b;

/* renamed from: com.airbnb.lottie.c.b.l */
/* compiled from: PG */
public final class C4869l implements C4859b {

    /* renamed from: a */
    public final Path.FillType f15507a;

    /* renamed from: b */
    public final String f15508b;

    /* renamed from: c */
    public final C4843a f15509c;

    /* renamed from: d */
    public final C4846d f15510d;

    /* renamed from: e */
    public final boolean f15511e;

    /* renamed from: f */
    private final boolean f15512f;

    public C4869l(String str, boolean z, Path.FillType fillType, C4843a aVar, C4846d dVar, boolean z2) {
        this.f15508b = str;
        this.f15512f = z;
        this.f15507a = fillType;
        this.f15509c = aVar;
        this.f15510d = dVar;
        this.f15511e = z2;
    }

    /* renamed from: a */
    public final C4785d mo9801a(C4825ac acVar, C4878b bVar) {
        return new C4789h(acVar, bVar, this);
    }

    public final String toString() {
        boolean z = this.f15512f;
        return "ShapeFill{color=, fillEnabled=" + z + "}";
    }
}
