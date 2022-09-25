package com.google.android.apps.search.googleapp.stampviewer.p10488b;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.b.a */
/* compiled from: PG */
final class C139319a extends C139334p {

    /* renamed from: a */
    public C139321c f378907a;

    /* renamed from: b */
    private boolean f378908b;

    /* renamed from: c */
    private byte f378909c;

    /* renamed from: a */
    public final C139335q mo114894a() {
        if (this.f378909c == 1) {
            return new C139320b(this.f378908b, this.f378907a);
        }
        throw new IllegalStateException("Missing required properties: isValid");
    }

    /* renamed from: b */
    public final void mo114895b(boolean z) {
        this.f378908b = z;
        this.f378909c = 1;
    }
}
