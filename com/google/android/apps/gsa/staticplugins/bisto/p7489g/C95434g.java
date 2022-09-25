package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.g */
/* compiled from: PG */
final class C95434g extends C95394cr {

    /* renamed from: a */
    public C58485gu f267034a;

    /* renamed from: b */
    public int f267035b;

    /* renamed from: c */
    public int f267036c;

    /* renamed from: d */
    public int f267037d;

    /* renamed from: a */
    public final C95395cs mo89336a() {
        int i;
        int i2;
        C58485gu guVar;
        int i3 = this.f267035b;
        if (i3 != 0 && (i = this.f267036c) != 0 && (i2 = this.f267037d) != 0 && (guVar = this.f267034a) != null) {
            return new C95435h(i3, i, i2, guVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f267035b == 0) {
            sb.append(" actionType");
        }
        if (this.f267036c == 0) {
            sb.append(" animationMode");
        }
        if (this.f267037d == 0) {
            sb.append(" colorId");
        }
        if (this.f267034a == null) {
            sb.append(" colors");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
