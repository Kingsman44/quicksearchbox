package androidx.camera.core.p069a.p070a.p072b;

import java.util.concurrent.ExecutionException;

/* renamed from: androidx.camera.core.a.a.b.m */
/* compiled from: PG */
public class C1264m extends C1267p {

    /* renamed from: a */
    private final Throwable f3666a;

    public C1264m(Throwable th) {
        this.f3666a = th;
    }

    public final Object get() {
        throw new ExecutionException(this.f3666a);
    }

    public final String toString() {
        return super.toString() + "[status=FAILURE, cause=[" + this.f3666a + "]]";
    }
}
