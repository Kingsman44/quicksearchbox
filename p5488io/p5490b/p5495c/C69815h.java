package p5488io.p5490b.p5495c;

/* renamed from: io.b.c.h */
/* compiled from: PG */
public final class C69815h extends RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69815h(Throwable th) {
        super("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ".concat(String.valueOf(String.valueOf(th))), th == null ? new NullPointerException() : th);
    }
}
