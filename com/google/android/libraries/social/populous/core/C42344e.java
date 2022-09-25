package com.google.android.libraries.social.populous.core;

import com.google.android.libraries.social.populous.core.Email;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.social.populous.core.e */
/* compiled from: PG */
public final class C42344e extends C42289bo {

    /* renamed from: a */
    public PersonFieldMetadata f111048a;

    /* renamed from: b */
    public C58833ax f111049b;

    /* renamed from: c */
    public Email.ExtendedData f111050c;

    /* renamed from: d */
    private CharSequence f111051d;

    /* renamed from: e */
    private C58833ax f111052e;

    /* renamed from: f */
    private C58833ax f111053f;

    /* renamed from: g */
    private C58485gu f111054g;

    public C42344e() {
        C58836b bVar = C58836b.f156633a;
        this.f111049b = bVar;
        this.f111052e = bVar;
        this.f111053f = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Email mo45245a() {
        if (this.f111051d != null && this.f111048a != null && this.f111054g != null) {
            return new AutoValue_Email(this.f111051d, this.f111048a, this.f111049b, this.f111052e, this.f111053f, this.f111050c, this.f111054g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f111051d == null) {
            sb.append(" value");
        }
        if (this.f111048a == null) {
            sb.append(" metadata");
        }
        if (this.f111054g == null) {
            sb.append(" certificates");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C58833ax mo45246b() {
        PersonFieldMetadata personFieldMetadata = this.f111048a;
        return personFieldMetadata == null ? C58836b.f156633a : C58833ax.m90834k(personFieldMetadata);
    }

    /* renamed from: c */
    public final void mo45247c(C58485gu guVar) {
        if (guVar != null) {
            this.f111054g = guVar;
            return;
        }
        throw new NullPointerException("Null certificates");
    }

    /* renamed from: d */
    public final void mo45248d(PersonFieldMetadata personFieldMetadata) {
        if (personFieldMetadata != null) {
            this.f111048a = personFieldMetadata;
            return;
        }
        throw new NullPointerException("Null metadata");
    }

    /* renamed from: e */
    public final /* synthetic */ void mo45235e(Name name) {
        this.f111052e = C58833ax.m90833j(name);
    }

    /* renamed from: f */
    public final /* synthetic */ void mo45236f(Photo photo) {
        this.f111053f = C58833ax.m90833j(photo);
    }

    /* renamed from: g */
    public final void mo45249g(CharSequence charSequence) {
        if (charSequence != null) {
            this.f111051d = charSequence;
            return;
        }
        throw new NullPointerException("Null value");
    }
}
