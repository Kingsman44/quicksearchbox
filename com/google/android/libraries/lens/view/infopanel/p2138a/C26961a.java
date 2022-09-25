package com.google.android.libraries.lens.view.infopanel.p2138a;

import com.google.android.libraries.lens.view.infopanel.p2138a.p2139a.C26965d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.lens.view.infopanel.a.a */
/* compiled from: PG */
public final class C26961a extends C26971g {

    /* renamed from: a */
    public C58833ax f73509a;

    /* renamed from: b */
    public C58833ax f73510b;

    /* renamed from: c */
    public C58833ax f73511c;

    /* renamed from: d */
    public C58833ax f73512d;

    /* renamed from: e */
    public C58833ax f73513e;

    /* renamed from: f */
    public C58833ax f73514f;

    /* renamed from: g */
    public C58833ax f73515g;

    /* renamed from: h */
    private C58485gu f73516h;

    /* renamed from: i */
    private C26965d f73517i;

    /* renamed from: j */
    private boolean f73518j;

    /* renamed from: k */
    private boolean f73519k;

    /* renamed from: l */
    private C58833ax f73520l;

    /* renamed from: m */
    private byte f73521m;

    public C26961a() {
        C58836b bVar = C58836b.f156633a;
        this.f73509a = bVar;
        this.f73510b = bVar;
        this.f73511c = bVar;
        this.f73512d = bVar;
        this.f73513e = bVar;
        this.f73514f = bVar;
        this.f73520l = bVar;
        this.f73515g = bVar;
    }

    public C26961a(C26973i iVar) {
        C58836b bVar = C58836b.f156633a;
        this.f73509a = bVar;
        this.f73510b = bVar;
        this.f73511c = bVar;
        this.f73512d = bVar;
        this.f73513e = bVar;
        this.f73514f = bVar;
        this.f73520l = bVar;
        this.f73515g = bVar;
        C26966b bVar2 = (C26966b) iVar;
        this.f73516h = bVar2.f73530a;
        this.f73517i = bVar2.f73531b;
        this.f73518j = bVar2.f73532c;
        this.f73509a = bVar2.f73533d;
        this.f73510b = bVar2.f73534e;
        this.f73511c = bVar2.f73535f;
        this.f73519k = bVar2.f73536g;
        this.f73512d = bVar2.f73537h;
        this.f73513e = bVar2.f73538i;
        this.f73514f = bVar2.f73539j;
        this.f73520l = bVar2.f73540k;
        this.f73515g = bVar2.f73541l;
        this.f73521m = 3;
    }

    /* renamed from: a */
    public final C26973i mo32393a() {
        if (this.f73521m == 3 && this.f73516h != null && this.f73517i != null) {
            return new C26966b(this.f73516h, this.f73517i, this.f73518j, this.f73509a, this.f73510b, this.f73511c, this.f73519k, this.f73512d, this.f73513e, this.f73514f, this.f73520l, this.f73515g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f73516h == null) {
            sb.append(" items");
        }
        if (this.f73517i == null) {
            sb.append(" header");
        }
        if ((this.f73521m & 1) == 0) {
            sb.append(" showLoading");
        }
        if ((this.f73521m & 2) == 0) {
            sb.append(" isGoodResult");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo32394b(C26965d dVar) {
        if (dVar != null) {
            this.f73517i = dVar;
            return;
        }
        throw new NullPointerException("Null header");
    }

    /* renamed from: c */
    public final void mo32395c(boolean z) {
        this.f73519k = z;
        this.f73521m = (byte) (this.f73521m | 2);
    }

    /* renamed from: d */
    public final void mo32396d(C58485gu guVar) {
        if (guVar != null) {
            this.f73516h = guVar;
            return;
        }
        throw new NullPointerException("Null items");
    }

    /* renamed from: e */
    public final void mo32397e(C58833ax axVar) {
        this.f73520l = axVar;
    }

    /* renamed from: f */
    public final void mo32398f(boolean z) {
        this.f73518j = z;
        this.f73521m = (byte) (this.f73521m | 1);
    }
}
