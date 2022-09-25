package com.google.android.libraries.social.populous.core;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.social.populous.core.h */
/* compiled from: PG */
public final class C42347h extends C42322cu {

    /* renamed from: a */
    public CharSequence f111066a;

    /* renamed from: b */
    public PersonFieldMetadata f111067b;

    /* renamed from: c */
    public C58833ax f111068c;

    /* renamed from: d */
    private CharSequence f111069d;

    /* renamed from: e */
    private C58833ax f111070e;

    /* renamed from: f */
    private C58833ax f111071f;

    public C42347h() {
        C58836b bVar = C58836b.f156633a;
        this.f111068c = bVar;
        this.f111070e = bVar;
        this.f111071f = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Phone mo45300a() {
        if (this.f111069d != null && this.f111067b != null) {
            return new AutoValue_Phone(this.f111069d, this.f111066a, this.f111067b, this.f111068c, this.f111070e, this.f111071f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f111069d == null) {
            sb.append(" value");
        }
        if (this.f111067b == null) {
            sb.append(" metadata");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C58833ax mo45301b() {
        PersonFieldMetadata personFieldMetadata = this.f111067b;
        return personFieldMetadata == null ? C58836b.f156633a : C58833ax.m90834k(personFieldMetadata);
    }

    /* renamed from: c */
    public final void mo45302c(PersonFieldMetadata personFieldMetadata) {
        if (personFieldMetadata != null) {
            this.f111067b = personFieldMetadata;
            return;
        }
        throw new NullPointerException("Null metadata");
    }

    /* renamed from: d */
    public final void mo45303d(CharSequence charSequence) {
        if (charSequence != null) {
            this.f111069d = charSequence;
            return;
        }
        throw new NullPointerException("Null value");
    }

    /* renamed from: e */
    public final /* synthetic */ void mo45235e(Name name) {
        this.f111070e = C58833ax.m90833j(name);
    }

    /* renamed from: f */
    public final /* synthetic */ void mo45236f(Photo photo) {
        this.f111071f = C58833ax.m90833j(photo);
    }
}
