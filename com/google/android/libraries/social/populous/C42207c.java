package com.google.android.libraries.social.populous;

/* renamed from: com.google.android.libraries.social.populous.c */
/* compiled from: PG */
final class C42207c extends C42187at {

    /* renamed from: a */
    public Person f110528a;

    /* renamed from: b */
    public int f110529b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final GroupMember mo44876a() {
        if (this.f110529b != 0) {
            return new AutoValue_GroupMember(this.f110529b, this.f110528a);
        }
        throw new IllegalStateException("Missing required properties: memberType");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Person mo44877b() {
        return this.f110528a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo44878c() {
        this.f110529b = 2;
    }
}
