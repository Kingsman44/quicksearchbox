package com.google.android.libraries.lens.p2014e;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.p4017at.p4056g.p4057a.p4058a.C54007bo;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56304dd;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.lens.e.g */
/* compiled from: PG */
public final class C24215g extends C24198aa {

    /* renamed from: a */
    public C58833ax f66215a;

    /* renamed from: b */
    public C58833ax f66216b;

    /* renamed from: c */
    public C58833ax f66217c;

    /* renamed from: d */
    public C58833ax f66218d;

    /* renamed from: e */
    public C58833ax f66219e;

    /* renamed from: f */
    private boolean f66220f;

    /* renamed from: g */
    private C63088z f66221g;

    /* renamed from: h */
    private C58485gu f66222h;

    /* renamed from: i */
    private C56304dd f66223i;

    /* renamed from: j */
    private C58485gu f66224j;

    /* renamed from: k */
    private C54007bo f66225k;

    /* renamed from: l */
    private int f66226l;

    /* renamed from: m */
    private byte f66227m;

    public C24215g() {
        C58836b bVar = C58836b.f156633a;
        this.f66215a = bVar;
        this.f66216b = bVar;
        this.f66217c = bVar;
        this.f66218d = bVar;
        this.f66219e = bVar;
    }

    /* renamed from: a */
    public final C24199ab mo29655a() {
        if (this.f66227m == 3 && this.f66221g != null && this.f66222h != null && this.f66223i != null && this.f66224j != null && this.f66225k != null) {
            return new C24216h(this.f66220f, this.f66221g, this.f66215a, this.f66222h, this.f66216b, this.f66217c, this.f66218d, this.f66223i, this.f66224j, this.f66219e, this.f66225k, this.f66226l);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f66227m & 1) == 0) {
            sb.append(" isComplete");
        }
        if (this.f66221g == null) {
            sb.append(" compressedPresentationHtmlBytes");
        }
        if (this.f66222h == null) {
            sb.append(" presentationResults");
        }
        if (this.f66223i == null) {
            sb.append(" filterDetectedContexts");
        }
        if (this.f66224j == null) {
            sb.append(" filterRecommendations");
        }
        if (this.f66225k == null) {
            sb.append(" logInfo");
        }
        if ((this.f66227m & 2) == 0) {
            sb.append(" statusCode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo29656b(C63088z zVar) {
        if (zVar != null) {
            this.f66221g = zVar;
            return;
        }
        throw new NullPointerException("Null compressedPresentationHtmlBytes");
    }

    /* renamed from: c */
    public final void mo29657c(C56304dd ddVar) {
        if (ddVar != null) {
            this.f66223i = ddVar;
            return;
        }
        throw new NullPointerException("Null filterDetectedContexts");
    }

    /* renamed from: d */
    public final void mo29658d(C58485gu guVar) {
        if (guVar != null) {
            this.f66224j = guVar;
            return;
        }
        throw new NullPointerException("Null filterRecommendations");
    }

    /* renamed from: e */
    public final void mo29659e(boolean z) {
        this.f66220f = z;
        this.f66227m = (byte) (this.f66227m | 1);
    }

    /* renamed from: f */
    public final void mo29660f(C54007bo boVar) {
        if (boVar != null) {
            this.f66225k = boVar;
            return;
        }
        throw new NullPointerException("Null logInfo");
    }

    /* renamed from: g */
    public final void mo29661g(C58485gu guVar) {
        if (guVar != null) {
            this.f66222h = guVar;
            return;
        }
        throw new NullPointerException("Null presentationResults");
    }

    /* renamed from: h */
    public final void mo29662h(int i) {
        this.f66226l = i;
        this.f66227m = (byte) (this.f66227m | 2);
    }
}
