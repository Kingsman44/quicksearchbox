package dagger.p5295b.p5297b.p5298a;

import dagger.p5295b.p5297b.C68280g;
import dagger.p5295b.p5297b.C68281h;

/* renamed from: dagger.b.b.a.e */
/* compiled from: PG */
final class C68272e extends C68280g {

    /* renamed from: a */
    private final C68280g f184634a;

    public C68272e(C68280g gVar) {
        this.f184634a = gVar;
    }

    /* renamed from: a */
    public final C68281h mo51662a(Object obj) {
        try {
            C68281h a = this.f184634a.mo51662a(obj);
            if (a == null) {
                return C68281h.f184641b;
            }
            return new C68273f(a);
        } catch (RuntimeException e) {
            C68274g.m98605b(e, this.f184634a, obj);
            return C68281h.f184641b;
        }
    }
}
