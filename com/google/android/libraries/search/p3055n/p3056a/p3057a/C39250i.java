package com.google.android.libraries.search.p3055n.p3056a.p3057a;

import com.google.android.libraries.search.p3055n.p3056a.C39241a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import com.google.speech.p5218j.C66999hh;
import com.google.speech.p5218j.C67087ko;
import com.google.speech.p5218j.p5219a.C66752s;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.n.a.a.i */
/* compiled from: PG */
public final class C39250i implements C39241a {

    /* renamed from: a */
    public static final C59071e f103388a = C59071e.m91332i("com.google.android.libraries.search.n.a.a.i");

    /* renamed from: b */
    public final Optional f103389b;

    /* renamed from: c */
    public final Executor f103390c;

    /* renamed from: d */
    public Optional f103391d = Optional.empty();

    /* renamed from: e */
    public Optional f103392e = Optional.empty();

    /* renamed from: f */
    public int f103393f = 1;

    /* renamed from: g */
    private final boolean f103394g;

    public C39250i(boolean z, Optional optional, C60887da daVar) {
        this.f103394g = z;
        this.f103389b = optional;
        this.f103390c = new C60904dr(daVar);
    }

    /* renamed from: a */
    public final C60870cx mo41742a(C66999hh hhVar, C66752s sVar) {
        if (!mo41745d()) {
            return C60856cj.m92899h(new IllegalStateException("ART service not usable."));
        }
        C39244c cVar = new C39244c(this, hhVar, sVar);
        return C60856cj.m92905n(C47810es.m84965e(cVar), this.f103390c);
    }

    /* renamed from: b */
    public final C60870cx mo41743b() {
        if (!mo41745d()) {
            return C60856cj.m92899h(new IllegalStateException("ART service not usable."));
        }
        C39242a aVar = new C39242a(this);
        return C60856cj.m92904m(C47810es.m84978r(aVar), this.f103390c);
    }

    /* renamed from: c */
    public final C60870cx mo41744c(C67087ko koVar) {
        if (!mo41745d()) {
            return C60856cj.m92899h(new IllegalStateException("ART service not usable."));
        }
        C39243b bVar = new C39243b(this, koVar);
        return C60856cj.m92904m(C47810es.m84978r(bVar), this.f103390c);
    }

    /* renamed from: d */
    public final boolean mo41745d() {
        return this.f103394g && this.f103389b.isPresent();
    }

    /* renamed from: e */
    public final boolean mo41746e() {
        int i = this.f103393f;
        boolean z = i == 3;
        if (i != 0) {
            return z;
        }
        throw null;
    }
}
