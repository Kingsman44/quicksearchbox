package com.google.p5261vr.p5262a.p5263a.p5265b;

/* renamed from: com.google.vr.a.a.b.a */
/* compiled from: PG */
public final class C67931a extends Exception {

    /* renamed from: a */
    private final String f184121a;

    /* renamed from: b */
    private final Class f184122b;

    public C67931a(String str, Class cls, Exception exc) {
        super(exc);
        this.f184121a = str;
        this.f184122b = cls;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f184122b);
        String str = this.f184121a;
        String exc = super.toString();
        return "Expected type " + valueOf + " for key '" + str + "'; " + exc;
    }
}
