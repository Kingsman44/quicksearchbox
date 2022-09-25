package androidx.work;

/* renamed from: androidx.work.af */
/* compiled from: PG */
public final class C4382af extends C4399aw {
    public C4382af(Class cls) {
        super(cls);
        this.f14042c.f14220e = OverwritingInputMerger.class.getName();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C4400ax mo9316a() {
        if (!this.f14040a || !this.f14042c.f14226k.f14083d) {
            return new C4383ag(this);
        }
        throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
    }
}
