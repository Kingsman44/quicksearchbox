package androidx.p104d.p105a;

/* renamed from: androidx.d.a.f */
/* compiled from: PG */
final class C2167f extends C2153a {

    /* renamed from: c */
    final /* synthetic */ C2168g f6142c;

    public C2167f(C2168g gVar) {
        this.f6142c = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo5421d() {
        C2164c cVar = (C2164c) this.f6142c.f6143a.get();
        if (cVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + cVar.f6138a + "]";
    }
}
