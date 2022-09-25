package androidx.media3.p134c;

import androidx.media3.common.C2591ar;
import java.nio.ByteBuffer;

/* renamed from: androidx.media3.c.g */
/* compiled from: PG */
public class C2529g extends C2523a {

    /* renamed from: b */
    public final C2525c f6954b = new C2525c();

    /* renamed from: c */
    public ByteBuffer f6955c;

    /* renamed from: d */
    public boolean f6956d;

    /* renamed from: e */
    public long f6957e;

    /* renamed from: f */
    public ByteBuffer f6958f;

    /* renamed from: g */
    private final int f6959g;

    static {
        C2591ar.m6797b("media3.decoder");
    }

    public C2529g(int i) {
        this.f6959g = i;
    }

    /* renamed from: e */
    private final ByteBuffer m6658e(int i) {
        int i2;
        int i3 = this.f6959g;
        if (i3 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i3 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f6955c;
        if (byteBuffer == null) {
            i2 = 0;
        } else {
            i2 = byteBuffer.capacity();
        }
        throw new C2528f(i2, i);
    }

    /* renamed from: c */
    public final void mo5960c(int i) {
        ByteBuffer byteBuffer = this.f6955c;
        if (byteBuffer == null) {
            this.f6955c = m6658e(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.f6955c = byteBuffer;
            return;
        }
        ByteBuffer e = m6658e(i2);
        e.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            e.put(byteBuffer);
        }
        this.f6955c = e;
    }

    /* renamed from: d */
    public final void mo5961d() {
        ByteBuffer byteBuffer = this.f6955c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f6958f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    /* renamed from: fg */
    public void mo5953fg() {
        this.f6941a = 0;
        ByteBuffer byteBuffer = this.f6955c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f6958f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f6956d = false;
    }
}
