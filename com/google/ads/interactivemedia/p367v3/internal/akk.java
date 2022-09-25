package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.akk */
/* compiled from: PG */
final class akk extends agt {

    /* renamed from: a */
    final /* synthetic */ Class f20784a;

    /* renamed from: b */
    final /* synthetic */ akl f20785b;

    public akk(akl akl, Class cls) {
        this.f20785b = akl;
        this.f20784a = cls;
    }

    public final Object read(alb alb) {
        Object read = this.f20785b.f20787b.read(alb);
        if (read == null || this.f20784a.isInstance(read)) {
            return read;
        }
        throw new agq("Expected a " + this.f20784a.getName() + " but was " + read.getClass().getName());
    }

    public final void write(ald ald, Object obj) {
        this.f20785b.f20787b.write(ald, obj);
    }
}
