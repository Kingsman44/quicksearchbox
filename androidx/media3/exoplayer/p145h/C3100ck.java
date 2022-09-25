package androidx.media3.exoplayer.p145h;

import androidx.media3.common.C2598ay;
import androidx.media3.exoplayer.C2874cc;
import androidx.media3.p134c.C2529g;
import java.nio.ByteBuffer;

/* renamed from: androidx.media3.exoplayer.h.ck */
/* compiled from: PG */
final class C3100ck implements C3095cf {

    /* renamed from: a */
    public int f9081a;

    /* renamed from: b */
    final /* synthetic */ C3102cm f9082b;

    /* renamed from: c */
    private boolean f9083c;

    public C3100ck(C3102cm cmVar) {
        this.f9082b = cmVar;
    }

    /* renamed from: d */
    private final void m8995d() {
        if (!this.f9083c) {
            C3102cm cmVar = this.f9082b;
            cmVar.f9088a.mo7016o(C2598ay.m6803b(cmVar.f9090c.f7496n), this.f9082b.f9090c, 0, 0);
            this.f9083c = true;
        }
    }

    /* renamed from: a */
    public final int mo6843a(C2874cc ccVar, C2529g gVar, int i) {
        m8995d();
        C3102cm cmVar = this.f9082b;
        boolean z = cmVar.f9091d;
        if (z && cmVar.f9092e == null) {
            this.f9081a = 2;
        }
        int i2 = this.f9081a;
        if (i2 == 2) {
            gVar.f6941a |= 4;
            return -4;
        } else if ((i & 2) != 0 || i2 == 0) {
            ccVar.f8096a = cmVar.f9090c;
            this.f9081a = 1;
            return -5;
        } else if (!z) {
            return -3;
        } else {
            cmVar.f9092e.getClass();
            gVar.f6941a |= 1;
            gVar.f6957e = 0;
            if ((i & 4) == 0) {
                gVar.mo5960c(cmVar.f9093f);
                ByteBuffer byteBuffer = gVar.f6955c;
                C3102cm cmVar2 = this.f9082b;
                byteBuffer.put(cmVar2.f9092e, 0, cmVar2.f9093f);
            }
            if ((i & 1) == 0) {
                this.f9081a = 2;
            }
            return -4;
        }
    }

    /* renamed from: b */
    public final int mo6844b(long j) {
        m8995d();
        if (j <= 0 || this.f9081a == 2) {
            return 0;
        }
        this.f9081a = 2;
        return 1;
    }

    /* renamed from: f */
    public final boolean mo6847f() {
        return this.f9082b.f9091d;
    }

    /* renamed from: fd */
    public final void mo6848fd() {
    }
}
