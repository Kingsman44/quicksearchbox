package androidx.media3.exoplayer.p142e;

import android.support.p033v7.widget.LinearLayoutManager;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.p134c.C2529g;
import java.nio.ByteBuffer;

/* renamed from: androidx.media3.exoplayer.e.k */
/* compiled from: PG */
final class C2981k extends C2529g {

    /* renamed from: g */
    public long f8568g;

    /* renamed from: h */
    public int f8569h;

    /* renamed from: i */
    public int f8570i = 32;

    public C2981k() {
        super(2);
    }

    /* renamed from: e */
    public final boolean mo6896e(C2529g gVar) {
        ByteBuffer byteBuffer;
        C2601a.m6830b(!gVar.mo5954fh(1073741824));
        C2601a.m6830b(!gVar.mo5954fh(268435456));
        C2601a.m6830b(!gVar.mo5954fh(4));
        if (mo6897f()) {
            if (this.f8569h >= this.f8570i || gVar.mo5954fh(LinearLayoutManager.INVALID_OFFSET) != mo5954fh(LinearLayoutManager.INVALID_OFFSET)) {
                return false;
            }
            ByteBuffer byteBuffer2 = gVar.f6955c;
            if (!(byteBuffer2 == null || (byteBuffer = this.f6955c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000)) {
                return false;
            }
        }
        int i = this.f8569h;
        this.f8569h = i + 1;
        if (i == 0) {
            this.f6957e = gVar.f6957e;
            if (gVar.mo5954fh(1)) {
                this.f6941a = 1;
            }
        }
        if (gVar.mo5954fh(LinearLayoutManager.INVALID_OFFSET)) {
            this.f6941a = LinearLayoutManager.INVALID_OFFSET;
        }
        ByteBuffer byteBuffer3 = gVar.f6955c;
        if (byteBuffer3 != null) {
            mo5960c(byteBuffer3.remaining());
            this.f6955c.put(byteBuffer3);
        }
        this.f8568g = gVar.f6957e;
        return true;
    }

    /* renamed from: f */
    public final boolean mo6897f() {
        return this.f8569h > 0;
    }

    /* renamed from: fg */
    public final void mo5953fg() {
        super.mo5953fg();
        this.f8569h = 0;
    }
}
