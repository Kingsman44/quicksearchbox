package p3186j$.util.stream;

import p3186j$.desugar.sun.nio.p3187fs.C40947a;

/* renamed from: j$.util.stream.N2 */
final class C41180N2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f107771a;

    /* renamed from: b */
    final /* synthetic */ Object f107772b;

    /* renamed from: c */
    final /* synthetic */ Object f107773c;

    public /* synthetic */ C41180N2(int i, Object obj, Object obj2) {
        this.f107771a = i;
        this.f107772b = obj;
        this.f107773c = obj2;
    }

    public final void run() {
        int i = this.f107771a;
        Object obj = this.f107772b;
        Object obj2 = this.f107773c;
        switch (i) {
            case 0:
                try {
                    ((Runnable) obj).run();
                    ((Runnable) obj2).run();
                    return;
                } catch (Throwable th) {
                    try {
                        C40947a.m71103g(th, th);
                        break;
                    } catch (Throwable unused) {
                        break;
                    }
                }
            default:
                try {
                    ((BaseStream) obj).close();
                    ((BaseStream) obj2).close();
                    return;
                } catch (Throwable th2) {
                    try {
                        C40947a.m71103g(th, th2);
                        break;
                    } catch (Throwable unused2) {
                        break;
                    }
                }
        }
        throw th;
        throw th;
    }
}
