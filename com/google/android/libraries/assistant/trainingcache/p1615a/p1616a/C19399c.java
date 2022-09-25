package com.google.android.libraries.assistant.trainingcache.p1615a.p1616a;

/* renamed from: com.google.android.libraries.assistant.trainingcache.a.a.c */
/* compiled from: PG */
final class C19399c extends C19410n {

    /* renamed from: a */
    public byte f54274a;

    /* renamed from: b */
    private boolean f54275b;

    /* renamed from: a */
    public final C19411o mo24553a() {
        if (this.f54274a == 3) {
            return new C19400d(this.f54275b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f54274a & 1) == 0) {
            sb.append(" success");
        }
        if ((this.f54274a & 2) == 0) {
            sb.append(" resumptionNeeded");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo24554b(boolean z) {
        this.f54275b = z;
        this.f54274a = (byte) (this.f54274a | 1);
    }
}
