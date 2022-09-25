package androidx.camera.core;

import android.media.ImageReader;
import androidx.camera.core.p069a.C1330bq;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.d */
/* compiled from: PG */
public final /* synthetic */ class C1523d implements ImageReader.OnImageAvailableListener {

    /* renamed from: a */
    public final /* synthetic */ C1550e f4202a;

    /* renamed from: b */
    public final /* synthetic */ Executor f4203b;

    /* renamed from: c */
    public final /* synthetic */ C1330bq f4204c;

    public /* synthetic */ C1523d(C1550e eVar, Executor executor, C1330bq bqVar) {
        this.f4202a = eVar;
        this.f4203b = executor;
        this.f4204c = bqVar;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        C1550e eVar = this.f4202a;
        Executor executor = this.f4203b;
        C1330bq bqVar = this.f4204c;
        synchronized (eVar.f4260a) {
            if (!eVar.f4261b) {
                executor.execute(new C1481c(eVar, bqVar));
            }
        }
    }
}
