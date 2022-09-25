package p3186j$.util.stream;

import p3186j$.util.function.Predicate;

/* renamed from: j$.util.stream.Y */
final class C41218Y extends C41225a0 {

    /* renamed from: c */
    final /* synthetic */ C41229b0 f107830c;

    /* renamed from: d */
    final /* synthetic */ Predicate f107831d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C41218Y(Predicate predicate, C41229b0 b0Var) {
        super(b0Var);
        this.f107830c = b0Var;
        this.f107831d = predicate;
    }

    public final void accept(Object obj) {
        if (!this.f107845a) {
            boolean test = this.f107831d.test(obj);
            C41229b0 b0Var = this.f107830c;
            if (test == b0Var.f107849a) {
                this.f107845a = true;
                this.f107846b = b0Var.f107850b;
            }
        }
    }
}
