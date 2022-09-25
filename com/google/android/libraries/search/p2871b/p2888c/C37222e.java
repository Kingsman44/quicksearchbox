package com.google.android.libraries.search.p2871b.p2888c;

/* renamed from: com.google.android.libraries.search.b.c.e */
/* compiled from: PG */
final class C37222e extends C37224g {

    /* renamed from: a */
    public byte f98892a;

    /* renamed from: b */
    private boolean f98893b;

    /* renamed from: c */
    private boolean f98894c;

    /* renamed from: a */
    public final C37225h mo40706a() {
        if (this.f98892a == 7) {
            return new C37223f(this.f98893b, this.f98894c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f98892a & 1) == 0) {
            sb.append(" tiktokIntegrationEnabled");
        }
        if ((this.f98892a & 2) == 0) {
            sb.append(" throwExceptionForEventsLoggedInFuture");
        }
        if ((this.f98892a & 4) == 0) {
            sb.append(" enableIndividualFlowEventsSending");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo40707b(boolean z) {
        this.f98894c = z;
        this.f98892a = (byte) (this.f98892a | 4);
    }

    /* renamed from: c */
    public final void mo40708c(boolean z) {
        this.f98893b = z;
        this.f98892a = (byte) (this.f98892a | 1);
    }
}
