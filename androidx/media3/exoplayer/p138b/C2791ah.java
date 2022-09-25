package androidx.media3.exoplayer.p138b;

import android.os.SystemClock;

/* renamed from: androidx.media3.exoplayer.b.ah */
/* compiled from: PG */
final class C2791ah {

    /* renamed from: a */
    public Exception f7715a;

    /* renamed from: b */
    private long f7716b;

    /* renamed from: a */
    public final void mo6479a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f7715a == null) {
            this.f7715a = exc;
            this.f7716b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f7716b) {
            Exception exc2 = this.f7715a;
            if (exc2 != exc) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(exc2, new Object[]{exc});
                } catch (Exception unused) {
                }
            }
            Exception exc3 = this.f7715a;
            this.f7715a = null;
            throw exc3;
        }
    }
}
