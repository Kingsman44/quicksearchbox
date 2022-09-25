package com.google.android.libraries.social.populous.core;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.social.populous.core.g */
/* compiled from: PG */
public final class C42346g extends C42298bx {

    /* renamed from: a */
    public PersonFieldMetadata f111058a;

    /* renamed from: b */
    public String f111059b;

    /* renamed from: c */
    public int f111060c;

    /* renamed from: d */
    private C42282bh f111061d;

    /* renamed from: e */
    private C58833ax f111062e;

    /* renamed from: f */
    private C58833ax f111063f;

    /* renamed from: g */
    private C58485gu f111064g;

    /* renamed from: h */
    private CharSequence f111065h;

    public C42346g() {
        C58836b bVar = C58836b.f156633a;
        this.f111062e = bVar;
        this.f111063f = bVar;
    }

    public C42346g(InAppNotificationTarget inAppNotificationTarget) {
        C58836b bVar = C58836b.f156633a;
        this.f111062e = bVar;
        this.f111063f = bVar;
        this.f111061d = inAppNotificationTarget.mo45020lo();
        this.f111058a = inAppNotificationTarget.mo44976b();
        this.f111062e = inAppNotificationTarget.mo45013d();
        this.f111063f = inAppNotificationTarget.mo45014e();
        this.f111060c = inAppNotificationTarget.mo45019i();
        this.f111064g = inAppNotificationTarget.mo45016f();
        this.f111059b = inAppNotificationTarget.mo45017h();
        this.f111065h = inAppNotificationTarget.mo44982g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final InAppNotificationTarget mo45257a() {
        if (this.f111061d != null && this.f111058a != null && this.f111064g != null && this.f111065h != null) {
            return new AutoValue_InAppNotificationTarget(this.f111061d, this.f111058a, this.f111062e, this.f111063f, this.f111060c, this.f111064g, this.f111059b, this.f111065h);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f111061d == null) {
            sb.append(" type");
        }
        if (this.f111058a == null) {
            sb.append(" metadata");
        }
        if (this.f111064g == null) {
            sb.append(" originatingFields");
        }
        if (this.f111065h == null) {
            sb.append(" value");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C58833ax mo45258b() {
        PersonFieldMetadata personFieldMetadata = this.f111058a;
        return personFieldMetadata == null ? C58836b.f156633a : C58833ax.m90834k(personFieldMetadata);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C58833ax mo45259c() {
        C58485gu guVar = this.f111064g;
        return guVar == null ? C58836b.f156633a : C58833ax.m90834k(guVar);
    }

    /* renamed from: d */
    public final void mo45260d(PersonFieldMetadata personFieldMetadata) {
        this.f111058a = personFieldMetadata;
    }

    /* renamed from: e */
    public final /* synthetic */ void mo45235e(Name name) {
        this.f111062e = C58833ax.m90833j(name);
    }

    /* renamed from: f */
    public final /* synthetic */ void mo45236f(Photo photo) {
        this.f111063f = C58833ax.m90833j(photo);
    }

    /* renamed from: g */
    public final void mo45261g(C58485gu guVar) {
        if (guVar != null) {
            this.f111064g = guVar;
            return;
        }
        throw new NullPointerException("Null originatingFields");
    }

    /* renamed from: h */
    public final void mo45262h(C42282bh bhVar) {
        if (bhVar != null) {
            this.f111061d = bhVar;
            return;
        }
        throw new NullPointerException("Null type");
    }

    /* renamed from: i */
    public final void mo45263i(CharSequence charSequence) {
        if (charSequence != null) {
            this.f111065h = charSequence;
            return;
        }
        throw new NullPointerException("Null value");
    }
}
