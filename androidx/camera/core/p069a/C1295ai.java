package androidx.camera.core.p069a;

import androidx.camera.camera2.p063b.C1083af;
import androidx.camera.core.C1477bw;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p3186j$.util.Objects;

/* renamed from: androidx.camera.core.a.ai */
/* compiled from: PG */
public final class C1295ai {

    /* renamed from: a */
    public C1291ae f3733a = null;

    /* renamed from: b */
    private final Executor f3734b;

    /* renamed from: c */
    private final C1083af f3735c;

    public C1295ai(Executor executor, C1083af afVar) {
        this.f3734b = executor;
        this.f3735c = afVar;
    }

    /* renamed from: a */
    public final void mo4151a() {
        try {
            Executor executor = this.f3734b;
            C1083af afVar = this.f3735c;
            Objects.requireNonNull(afVar);
            executor.execute(new C1294ah(afVar));
        } catch (RejectedExecutionException e) {
            C1477bw.m3981d("CameraStateRegistry", "Unable to notify camera.", e);
        }
    }
}
