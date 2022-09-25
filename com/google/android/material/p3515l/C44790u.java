package com.google.android.material.p3515l;

/* renamed from: com.google.android.material.l.u */
/* compiled from: PG */
final class C44790u extends C44794y {

    /* renamed from: a */
    private final C44792w f116805a;

    /* renamed from: b */
    private final float f116806b;

    /* renamed from: c */
    private final float f116807c;

    public C44790u(C44792w wVar, float f, float f2) {
        this.f116805a = wVar;
        this.f116806b = f;
        this.f116807c = f2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final float mo48154a() {
        C44792w wVar = this.f116805a;
        return (float) Math.toDegrees(Math.atan((double) ((wVar.f116816b - this.f116807c) / (wVar.f116815a - this.f116806b))));
    }
}
