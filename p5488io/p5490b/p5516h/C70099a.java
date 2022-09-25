package p5488io.p5490b.p5516h;

import org.p5649d.C72639b;
import p5488io.p5490b.p5497e.p5512i.C70078b;

/* renamed from: io.b.h.a */
/* compiled from: PG */
public abstract class C70099a {
    /* renamed from: a */
    public abstract int mo61563a();

    /* renamed from: c */
    public final boolean mo61637c(C72639b[] bVarArr) {
        int a = mo61563a();
        if (r1 == a) {
            return true;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("parallelism = " + a + ", subscribers = " + r1);
        for (C72639b f : bVarArr) {
            C70078b.m101964f(illegalArgumentException, f);
        }
        return false;
    }
}
