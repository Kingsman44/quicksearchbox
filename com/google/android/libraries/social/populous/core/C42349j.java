package com.google.android.libraries.social.populous.core;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.social.populous.core.j */
/* compiled from: PG */
public final class C42349j extends C42324cw {

    /* renamed from: a */
    public CharSequence f111078a;

    /* renamed from: b */
    private PersonFieldMetadata f111079b;

    /* renamed from: c */
    private C58833ax f111080c;

    /* renamed from: d */
    private C58833ax f111081d;

    public C42349j() {
        C58836b bVar = C58836b.f156633a;
        this.f111080c = bVar;
        this.f111081d = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ProfileId mo45309a() {
        if (this.f111078a != null && this.f111079b != null) {
            return new AutoValue_ProfileId(this.f111078a, this.f111079b, this.f111080c, this.f111081d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f111078a == null) {
            sb.append(" value");
        }
        if (this.f111079b == null) {
            sb.append(" metadata");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C58833ax mo45310b() {
        PersonFieldMetadata personFieldMetadata = this.f111079b;
        return personFieldMetadata == null ? C58836b.f156633a : C58833ax.m90834k(personFieldMetadata);
    }

    /* renamed from: c */
    public final void mo45311c(PersonFieldMetadata personFieldMetadata) {
        this.f111079b = personFieldMetadata;
    }

    /* renamed from: e */
    public final /* synthetic */ void mo45235e(Name name) {
        this.f111080c = C58833ax.m90833j(name);
    }

    /* renamed from: f */
    public final /* synthetic */ void mo45236f(Photo photo) {
        this.f111081d = C58833ax.m90833j(photo);
    }
}
