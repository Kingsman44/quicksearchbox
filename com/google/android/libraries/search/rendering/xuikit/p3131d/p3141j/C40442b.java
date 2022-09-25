package com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j;

import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.j.b */
/* compiled from: PG */
public final class C40442b extends C40449i {

    /* renamed from: a */
    public C63088z f106151a;

    /* renamed from: b */
    public Optional f106152b = Optional.empty();

    /* renamed from: c */
    private final Optional f106153c = Optional.empty();

    /* renamed from: d */
    private boolean f106154d;

    /* renamed from: e */
    private int f106155e;

    /* renamed from: f */
    private final Optional f106156f = Optional.empty();

    /* renamed from: g */
    private byte f106157g;

    /* renamed from: a */
    public final C40450j mo42439a() {
        C63088z zVar;
        if (this.f106157g == 3 && (zVar = this.f106151a) != null) {
            return new C40443c(this.f106153c, zVar, this.f106154d, this.f106155e, this.f106152b, this.f106156f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f106151a == null) {
            sb.append(" rawData");
        }
        if ((this.f106157g & 1) == 0) {
            sb.append(" success");
        }
        if ((this.f106157g & 2) == 0) {
            sb.append(" status");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo42440b(int i) {
        this.f106155e = i;
        this.f106157g = (byte) (this.f106157g | 2);
    }

    /* renamed from: c */
    public final void mo42441c(boolean z) {
        this.f106154d = z;
        this.f106157g = (byte) (this.f106157g | 1);
    }
}
