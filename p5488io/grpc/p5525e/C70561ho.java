package p5488io.grpc.p5525e;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.grpc.e.ho */
/* compiled from: PG */
final class C70561ho extends OutputStream {

    /* renamed from: a */
    public final List f188103a = new ArrayList();

    /* renamed from: b */
    final /* synthetic */ C70564hr f188104b;

    /* renamed from: c */
    private C70680lz f188105c;

    public C70561ho(C70564hr hrVar) {
        this.f188104b = hrVar;
    }

    public final void write(int i) {
        C70680lz lzVar = this.f188105c;
        if (lzVar == null || lzVar.mo61935b() <= 0) {
            write(new byte[]{(byte) i}, 0, 1);
            return;
        }
        this.f188105c.mo61936c((byte) i);
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (this.f188105c == null) {
            C70680lz a = this.f188104b.f188108b.mo61938a(i2);
            this.f188105c = a;
            this.f188103a.add(a);
        }
        while (i2 > 0) {
            int min = Math.min(i2, this.f188105c.mo61935b());
            if (min == 0) {
                int a2 = this.f188105c.mo61934a();
                C70680lz a3 = this.f188104b.f188108b.mo61938a(Math.max(i2, a2 + a2));
                this.f188105c = a3;
                this.f188103a.add(a3);
            } else {
                this.f188105c.mo61937d(bArr, i, min);
                i += min;
                i2 -= min;
            }
        }
    }
}
