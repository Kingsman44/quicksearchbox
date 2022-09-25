package androidx.media3.exoplayer.video.p153a;

import android.support.p033v7.widget.LinearLayoutManager;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.C3001g;
import androidx.media3.p134c.C2529g;
import java.nio.ByteBuffer;

/* renamed from: androidx.media3.exoplayer.video.a.b */
/* compiled from: PG */
public final class C3277b extends C3001g {

    /* renamed from: f */
    private final C2529g f9838f = new C2529g(1);

    /* renamed from: g */
    private final C2604ac f9839g = new C2604ac();

    /* renamed from: h */
    private long f9840h;

    /* renamed from: i */
    private C3276a f9841i;

    /* renamed from: j */
    private long f9842j;

    public C3277b() {
        super(6);
    }

    /* renamed from: M */
    private final void m9522M() {
        C3276a aVar = this.f9841i;
        if (aVar != null) {
            aVar.mo6581b();
        }
    }

    /* renamed from: H */
    public final String mo6504H() {
        return "CameraMotionRenderer";
    }

    /* renamed from: I */
    public final void mo6686I(long j, long j2) {
        float[] fArr;
        while (!mo6684E() && this.f9842j < 100000 + j) {
            this.f9838f.mo5953fg();
            if (mo6933eW(mo6935h(), this.f9838f, 0) == -4) {
                C2529g gVar = this.f9838f;
                if (!gVar.mo5954fh(4)) {
                    this.f9842j = gVar.f6957e;
                    if (this.f9841i != null && !gVar.mo5954fh(LinearLayoutManager.INVALID_OFFSET)) {
                        gVar.mo5961d();
                        ByteBuffer byteBuffer = this.f9838f.f6955c;
                        int i = C2612ak.f7249a;
                        if (byteBuffer.remaining() != 16) {
                            fArr = null;
                        } else {
                            this.f9839g.mo6157y(byteBuffer.array(), byteBuffer.limit());
                            this.f9839g.mo6131A(byteBuffer.arrayOffset() + 4);
                            float[] fArr2 = new float[3];
                            for (int i2 = 0; i2 < 3; i2++) {
                                fArr2[i2] = Float.intBitsToFloat(this.f9839g.mo6135c());
                            }
                            fArr = fArr2;
                        }
                        if (fArr != null) {
                            this.f9841i.mo6580a(this.f9842j - this.f9840h, fArr);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: J */
    public final boolean mo6505J() {
        return mo6684E();
    }

    /* renamed from: K */
    public final boolean mo6506K() {
        return true;
    }

    /* renamed from: L */
    public final int mo6699L(C2680x xVar) {
        return "application/x-camera-motion".equals(xVar.f7496n) ? 132 : 128;
    }

    /* renamed from: n */
    public final void mo6526n(int i, Object obj) {
        if (i == 8) {
            this.f9841i = (C3276a) obj;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo6527q() {
        m9522M();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo6529s(long j, boolean z) {
        this.f9842j = Long.MIN_VALUE;
        m9522M();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo6920w(C2680x[] xVarArr, long j, long j2) {
        this.f9840h = j2;
    }
}
