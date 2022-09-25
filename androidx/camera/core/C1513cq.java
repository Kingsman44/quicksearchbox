package androidx.camera.core;

/* renamed from: androidx.camera.core.cq */
/* compiled from: PG */
public final /* synthetic */ class C1513cq implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Exception f4159a;

    public /* synthetic */ C1513cq(Exception exc) {
        this.f4159a = exc;
    }

    public final void run() {
        Exception exc = this.f4159a;
        String message = exc.getMessage();
        exc.getCause();
        C1477bw.m3980c("ImageCapture", "Processing image failed! ".concat(String.valueOf(message)));
        throw null;
    }
}
