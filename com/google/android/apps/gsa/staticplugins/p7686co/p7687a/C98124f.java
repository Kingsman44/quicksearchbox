package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.f */
/* compiled from: PG */
final class C98124f extends C98097by {

    /* renamed from: a */
    public C58833ax f273994a;

    /* renamed from: b */
    public C58833ax f273995b;

    /* renamed from: c */
    public C58833ax f273996c;

    /* renamed from: d */
    public C58485gu f273997d;

    /* renamed from: e */
    public C58833ax f273998e;

    /* renamed from: f */
    public C58833ax f273999f;

    /* renamed from: g */
    public C58485gu f274000g;

    /* renamed from: h */
    public C58833ax f274001h;

    /* renamed from: i */
    public C58833ax f274002i;

    /* renamed from: j */
    public C58833ax f274003j;

    /* renamed from: k */
    public C58833ax f274004k;

    /* renamed from: l */
    public C58833ax f274005l;

    public C98124f() {
        C58836b bVar = C58836b.f156633a;
        this.f273994a = bVar;
        this.f273995b = bVar;
        this.f273996c = bVar;
        this.f273998e = bVar;
        this.f273999f = bVar;
        this.f274001h = bVar;
        this.f274002i = bVar;
        this.f274003j = bVar;
        this.f274004k = bVar;
        this.f274005l = bVar;
    }

    /* renamed from: a */
    public final C98098bz mo90937a() {
        C58485gu guVar;
        C58485gu guVar2 = this.f273997d;
        if (guVar2 != null && (guVar = this.f274000g) != null) {
            return new C98125g(this.f273994a, this.f273995b, this.f273996c, guVar2, this.f273998e, this.f273999f, guVar, this.f274001h, this.f274002i, this.f274003j, this.f274004k, this.f274005l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f273997d == null) {
            sb.append(" entryCookies");
        }
        if (this.f274000g == null) {
            sb.append(" cardRenderEvents");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
