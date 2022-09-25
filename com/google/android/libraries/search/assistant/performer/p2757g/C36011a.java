package com.google.android.libraries.search.assistant.performer.p2757g;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.a */
/* compiled from: PG */
final class C36011a extends C36053aw {

    /* renamed from: a */
    private boolean f94215a;

    /* renamed from: b */
    private byte f94216b;

    /* renamed from: a */
    public final C36054ax mo39932a() {
        if (this.f94216b == 1) {
            return new C36057b(this.f94215a);
        }
        throw new IllegalStateException("Missing required properties: tngReadaloudEnabled");
    }

    /* renamed from: b */
    public final void mo39933b(boolean z) {
        this.f94215a = z;
        this.f94216b = 1;
    }
}
