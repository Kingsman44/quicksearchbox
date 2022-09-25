package com.google.android.apps.gsa.speech.p7295k.p7297b;

import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.speech.k.b.a */
/* compiled from: PG */
public final class C92444a extends C92453j {

    /* renamed from: a */
    public C92302a f257820a;

    /* renamed from: b */
    public C89994f f257821b;

    /* renamed from: c */
    public C58833ax f257822c;

    /* renamed from: d */
    public C58833ax f257823d;

    /* renamed from: e */
    public C58833ax f257824e;

    /* renamed from: f */
    public C58833ax f257825f;

    /* renamed from: g */
    public C58833ax f257826g;

    /* renamed from: h */
    public C58833ax f257827h;

    /* renamed from: i */
    public C58833ax f257828i;

    /* renamed from: j */
    public C58833ax f257829j;

    /* renamed from: k */
    public C58833ax f257830k;

    public C92444a() {
        C58836b bVar = C58836b.f156633a;
        this.f257822c = bVar;
        this.f257823d = bVar;
        this.f257824e = bVar;
        this.f257825f = bVar;
        this.f257826g = bVar;
        this.f257827h = bVar;
        this.f257828i = bVar;
        this.f257829j = bVar;
        this.f257830k = bVar;
    }

    /* renamed from: a */
    public final C92454k mo87125a() {
        C89994f fVar;
        C92302a aVar = this.f257820a;
        if (aVar != null && (fVar = this.f257821b) != null) {
            return new C92445b(aVar, fVar, this.f257822c, this.f257823d, this.f257824e, this.f257825f, this.f257826g, this.f257827h, this.f257828i, this.f257829j, this.f257830k);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f257820a == null) {
            sb.append(" authTokenHelper");
        }
        if (this.f257821b == null) {
            sb.append(" speechSettings");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo87126b(C58833ax axVar) {
        if (axVar != null) {
            this.f257829j = axVar;
            return;
        }
        throw new NullPointerException("Null account");
    }

    /* renamed from: c */
    public final void mo87127c(C58833ax axVar) {
        if (axVar != null) {
            this.f257827h = axVar;
            return;
        }
        throw new NullPointerException("Null additionalLocales");
    }

    /* renamed from: d */
    public final void mo87128d(C92302a aVar) {
        if (aVar != null) {
            this.f257820a = aVar;
            return;
        }
        throw new NullPointerException("Null authTokenHelper");
    }

    /* renamed from: e */
    public final void mo87129e(C58833ax axVar) {
        if (axVar != null) {
            this.f257825f = axVar;
            return;
        }
        throw new NullPointerException("Null deviceLocale");
    }

    /* renamed from: f */
    public final void mo87130f(C89994f fVar) {
        if (fVar != null) {
            this.f257821b = fVar;
            return;
        }
        throw new NullPointerException("Null speechSettings");
    }

    /* renamed from: g */
    public final void mo87131g(C58833ax axVar) {
        if (axVar != null) {
            this.f257826g = axVar;
            return;
        }
        throw new NullPointerException("Null spokenLocale");
    }
}
