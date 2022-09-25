package com.google.android.libraries.elements.interfaces;

import com.google.android.libraries.search.rendering.xuikit.p3131d.p3134c.C40340d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.elements.interfaces.e */
/* compiled from: PG */
public final class C21298e extends C21255ay {

    /* renamed from: a */
    public C69464a f59648a;

    /* renamed from: b */
    public String f59649b;

    /* renamed from: c */
    public C21252av f59650c;

    /* renamed from: d */
    public C40340d f59651d;

    /* renamed from: e */
    private C21261bd f59652e;

    /* renamed from: f */
    private boolean f59653f;

    /* renamed from: g */
    private Object f59654g;

    /* renamed from: h */
    private C21274bq f59655h;

    /* renamed from: i */
    private boolean f59656i;

    /* renamed from: j */
    private byte f59657j;

    public C21298e() {
    }

    public C21298e(C21256az azVar) {
        C21299f fVar = (C21299f) azVar;
        this.f59648a = fVar.f59658a;
        this.f59651d = fVar.f59666i;
        this.f59649b = fVar.f59659b;
        this.f59650c = fVar.f59660c;
        this.f59652e = fVar.f59661d;
        this.f59653f = fVar.f59662e;
        this.f59654g = fVar.f59663f;
        this.f59655h = fVar.f59664g;
        this.f59656i = fVar.f59665h;
        this.f59657j = 3;
    }

    /* renamed from: a */
    public final C21256az mo26713a() {
        C69464a aVar;
        String str;
        C21252av avVar;
        if (this.f59657j == 3 && (aVar = this.f59648a) != null && (str = this.f59649b) != null && (avVar = this.f59650c) != null) {
            return new C21299f(aVar, this.f59651d, str, avVar, this.f59652e, this.f59653f, this.f59654g, this.f59655h, this.f59656i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f59648a == null) {
            sb.append(" converterProvider");
        }
        if (this.f59649b == null) {
            sb.append(" logTag");
        }
        if (this.f59650c == null) {
            sb.append(" perfLoggerFactory");
        }
        if ((this.f59657j & 1) == 0) {
            sb.append(" useIncrementalMount");
        }
        if ((this.f59657j & 2) == 0) {
            sb.append(" nestedScrollingEnabled");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo26714b(C21261bd bdVar) {
        this.f59652e = bdVar;
    }

    /* renamed from: c */
    public final void mo26715c(String str) {
        this.f59649b = str;
    }

    /* renamed from: d */
    public final void mo26716d(boolean z) {
        this.f59656i = z;
        this.f59657j = (byte) (this.f59657j | 2);
    }

    /* renamed from: e */
    public final void mo26717e(C21274bq bqVar) {
        this.f59655h = bqVar;
    }

    /* renamed from: f */
    public final void mo26718f(boolean z) {
        this.f59653f = z;
        this.f59657j = (byte) (this.f59657j | 1);
    }

    /* renamed from: g */
    public final void mo26719g(Object obj) {
        this.f59654g = obj;
    }
}
