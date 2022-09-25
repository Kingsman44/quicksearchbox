package com.google.android.apps.gsa.nga.engine.understanding;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.k */
/* compiled from: PG */
final class C79153k extends C79007bd {

    /* renamed from: a */
    public final Optional f217591a;

    /* renamed from: c */
    private final C58485gu f217592c;

    /* renamed from: d */
    private final C58485gu f217593d;

    /* renamed from: e */
    private final C58485gu f217594e;

    /* renamed from: f */
    private final C58485gu f217595f;

    /* renamed from: g */
    private final C58485gu f217596g;

    /* renamed from: h */
    private final C58485gu f217597h;

    /* renamed from: i */
    private final C58485gu f217598i;

    /* renamed from: j */
    private final C58485gu f217599j;

    /* renamed from: k */
    private final C58485gu f217600k;

    public C79153k(C58485gu guVar, C58485gu guVar2, C58485gu guVar3, C58485gu guVar4, C58485gu guVar5, C58485gu guVar6, C58485gu guVar7, C58485gu guVar8, C58485gu guVar9, Optional optional) {
        this.f217592c = guVar;
        this.f217593d = guVar2;
        this.f217594e = guVar3;
        this.f217595f = guVar4;
        this.f217596g = guVar5;
        this.f217597h = guVar6;
        this.f217598i = guVar7;
        this.f217599j = guVar8;
        this.f217600k = guVar9;
        this.f217591a = optional;
    }

    /* renamed from: a */
    public final C58485gu mo73767a() {
        return this.f217599j;
    }

    /* renamed from: b */
    public final C58485gu mo73768b() {
        return this.f217596g;
    }

    /* renamed from: c */
    public final C58485gu mo73769c() {
        return this.f217593d;
    }

    /* renamed from: d */
    public final C58485gu mo73770d() {
        return this.f217600k;
    }

    /* renamed from: e */
    public final C58485gu mo73771e() {
        return this.f217597h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C79007bd) {
            C79007bd bdVar = (C79007bd) obj;
            return C58597ky.m90218i(this.f217592c, bdVar.mo73775i()) && C58597ky.m90218i(this.f217593d, bdVar.mo73769c()) && C58597ky.m90218i(this.f217594e, bdVar.mo73772f()) && C58597ky.m90218i(this.f217595f, bdVar.mo73774h()) && C58597ky.m90218i(this.f217596g, bdVar.mo73768b()) && C58597ky.m90218i(this.f217597h, bdVar.mo73771e()) && C58597ky.m90218i(this.f217598i, bdVar.mo73773g()) && C58597ky.m90218i(this.f217599j, bdVar.mo73767a()) && C58597ky.m90218i(this.f217600k, bdVar.mo73770d()) && this.f217591a.equals(bdVar.mo73776j());
        }
    }

    /* renamed from: f */
    public final C58485gu mo73772f() {
        return this.f217594e;
    }

    /* renamed from: g */
    public final C58485gu mo73773g() {
        return this.f217598i;
    }

    /* renamed from: h */
    public final C58485gu mo73774h() {
        return this.f217595f;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f217592c.hashCode() ^ 1000003) * 1000003) ^ this.f217593d.hashCode()) * 1000003) ^ this.f217594e.hashCode()) * 1000003) ^ this.f217595f.hashCode()) * 1000003) ^ this.f217596g.hashCode()) * 1000003) ^ this.f217597h.hashCode()) * 1000003) ^ this.f217598i.hashCode()) * 1000003) ^ this.f217599j.hashCode()) * 1000003) ^ this.f217600k.hashCode()) * 1000003) ^ this.f217591a.hashCode();
    }

    /* renamed from: i */
    public final C58485gu mo73775i() {
        return this.f217592c;
    }

    /* renamed from: j */
    public final Optional mo73776j() {
        return this.f217591a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f217592c);
        String valueOf2 = String.valueOf(this.f217593d);
        String valueOf3 = String.valueOf(this.f217594e);
        String valueOf4 = String.valueOf(this.f217595f);
        String valueOf5 = String.valueOf(this.f217596g);
        String valueOf6 = String.valueOf(this.f217597h);
        String valueOf7 = String.valueOf(this.f217598i);
        String valueOf8 = String.valueOf(this.f217599j);
        String valueOf9 = String.valueOf(this.f217600k);
        String valueOf10 = String.valueOf(this.f217591a);
        return "UnderstandingStreamzEvents{nonEmptyRewrite=" + valueOf + ", emptyRewrite=" + valueOf2 + ", failedRewrite=" + valueOf3 + ", nonEmptyIntentGeneration=" + valueOf4 + ", emptyIntentGeneration=" + valueOf5 + ", failedIntentGeneration=" + valueOf6 + ", nonEmptyFulfillment=" + valueOf7 + ", emptyFulfillment=" + valueOf8 + ", failedFulfillment=" + valueOf9 + ", lockscreenArbitrationEvent=" + valueOf10 + "}";
    }
}
