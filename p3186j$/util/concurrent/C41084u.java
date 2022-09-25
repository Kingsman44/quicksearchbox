package p3186j$.util.concurrent;

/* renamed from: j$.util.concurrent.u */
final class C41084u extends ThreadLocal {
    C41084u() {
    }

    /* access modifiers changed from: protected */
    public final Object initialValue() {
        return new ThreadLocalRandom();
    }
}
