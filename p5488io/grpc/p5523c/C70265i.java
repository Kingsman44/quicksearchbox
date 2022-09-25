package p5488io.grpc.p5523c;

import android.util.Log;
import com.google.common.base.C58838bb;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;
import p5488io.grpc.p5525e.C70373ap;
import p5488io.grpc.p5525e.C70463dy;
import p5488io.grpc.p5525e.C70584ik;
import p5488io.grpc.p5525e.C70670lp;
import p5488io.grpc.p5525e.C70679ly;

/* renamed from: io.grpc.c.i */
/* compiled from: PG */
final class C70265i extends C70463dy {

    /* renamed from: i */
    public static final /* synthetic */ int f187288i = 0;

    /* renamed from: a */
    public final Object f187289a;

    /* renamed from: b */
    public final Collection f187290b = new ArrayList();

    /* renamed from: c */
    public boolean f187291c;

    /* renamed from: d */
    public boolean f187292d = false;

    /* renamed from: e */
    public Status f187293e;

    /* renamed from: f */
    public boolean f187294f;

    /* renamed from: g */
    public boolean f187295g;

    /* renamed from: h */
    final /* synthetic */ C70266j f187296h;

    /* renamed from: t */
    private int f187297t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70265i(C70266j jVar, int i, C70670lp lpVar, Object obj, C70679ly lyVar) {
        super(i, lpVar, lyVar);
        this.f187296h = jVar;
        this.f187289a = obj;
    }

    /* renamed from: a */
    public final void mo61918a(int i) {
        C58838bb.m90866a(this.f187296h.f187310k, "stream must not be null");
        int i2 = this.f187297t - i;
        this.f187297t = i2;
        if (i2 == 0 && !this.f187294f) {
            if (Log.isLoggable("grpc-java-cronet", 2)) {
                Log.v("grpc-java-cronet", "BidirectionalStream.read");
            }
            this.f187296h.f187310k.read(ByteBuffer.allocateDirect(4096));
        }
    }

    /* renamed from: b */
    public final void mo61919b(Throwable th) {
        mo61920c(Status.m102100d(th), true, new C70334de());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo61920c(Status status, boolean z, C70334de deVar) {
        C58838bb.m90866a(this.f187296h.f187310k, "stream must not be null");
        this.f187296h.f187310k.cancel();
        mo62131j(status, C70373ap.PROCESSED, z, deVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo61921d() {
        super.mo61921d();
    }

    /* renamed from: e */
    public final void mo61922e(Runnable runnable) {
        synchronized (this.f187289a) {
            runnable.run();
        }
    }

    /* renamed from: f */
    public final void mo61923f(ByteBuffer byteBuffer) {
        this.f187297t += byteBuffer.remaining();
        super.mo62182p(C70584ik.m103162a(byteBuffer), false);
    }
}
