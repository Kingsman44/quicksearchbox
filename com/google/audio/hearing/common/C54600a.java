package com.google.audio.hearing.common;

/* renamed from: com.google.audio.hearing.common.a */
/* compiled from: PG */
public final class C54600a {

    /* renamed from: a */
    public final C54601b f143351a;

    /* renamed from: b */
    public int f143352b = 0;

    /* renamed from: c */
    public long f143353c = 0;

    public C54600a(C54601b bVar) {
        this.f143351a = bVar;
    }

    /* renamed from: a */
    public final int mo54140a() {
        C54601b bVar = this.f143351a;
        return (int) Math.min((long) bVar.f143356c, bVar.mo54142a() - this.f143353c);
    }

    /* renamed from: b */
    public final void mo54141b(int i) {
        this.f143352b = (this.f143352b + i) % this.f143351a.f143356c;
    }
}
