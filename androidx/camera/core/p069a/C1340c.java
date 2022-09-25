package androidx.camera.core.p069a;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.a.c */
/* compiled from: PG */
public final class C1340c extends C1297ak {

    /* renamed from: a */
    public final Executor f3820a;

    /* renamed from: b */
    public final Handler f3821b;

    public C1340c(Executor executor, Handler handler) {
        this.f3820a = executor;
        if (handler != null) {
            this.f3821b = handler;
            return;
        }
        throw new NullPointerException("Null schedulerHandler");
    }

    /* renamed from: a */
    public final Handler mo4154a() {
        return this.f3821b;
    }

    /* renamed from: b */
    public final Executor mo4155b() {
        return this.f3820a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1297ak) {
            C1297ak akVar = (C1297ak) obj;
            return this.f3820a.equals(akVar.mo4155b()) && this.f3821b.equals(akVar.mo4154a());
        }
    }

    public final int hashCode() {
        return ((this.f3820a.hashCode() ^ 1000003) * 1000003) ^ this.f3821b.hashCode();
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f3820a + ", schedulerHandler=" + this.f3821b + "}";
    }
}
