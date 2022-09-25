package com.google.ads.interactivemedia.p367v3.internal;

import android.support.p033v7.widget.LinearLayoutManager;
import java.nio.ByteBuffer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.qc */
/* compiled from: PG */
final class C7220qc extends C7024iw {

    /* renamed from: f */
    private final C7024iw f23569f = new C7024iw(2);

    /* renamed from: g */
    private boolean f23570g;

    /* renamed from: h */
    private long f23571h;

    /* renamed from: i */
    private int f23572i;

    /* renamed from: j */
    private int f23573j;

    public C7220qc() {
        super(2);
        mo16030a();
    }

    /* renamed from: v */
    private final void m21537v(C7024iw iwVar) {
        ByteBuffer byteBuffer = iwVar.f22515b;
        if (byteBuffer != null) {
            iwVar.mo16045l();
            mo16042i(byteBuffer.remaining());
            this.f22515b.put(byteBuffer);
        }
        if (iwVar.mo16032c()) {
            mo16035f(4);
        }
        if (iwVar.mo16031b()) {
            mo16035f(LinearLayoutManager.INVALID_OFFSET);
        }
        if (iwVar.mo16033d()) {
            mo16035f(1);
        }
        int i = this.f23572i + 1;
        this.f23572i = i;
        long j = iwVar.f22517d;
        this.f22517d = j;
        if (i == 1) {
            this.f23571h = j;
        }
        iwVar.mo16030a();
    }

    /* renamed from: w */
    private final void m21538w() {
        super.mo16030a();
        this.f23572i = 0;
        this.f23571h = -9223372036854775807L;
        this.f22517d = -9223372036854775807L;
    }

    /* renamed from: a */
    public final void mo16030a() {
        mo16288n();
        this.f23573j = 32;
    }

    /* renamed from: m */
    public final void mo16287m(int i) {
        ary.m19462o(true);
        this.f23573j = i;
    }

    /* renamed from: n */
    public final void mo16288n() {
        m21538w();
        this.f23569f.mo16030a();
        this.f23570g = false;
    }

    /* renamed from: o */
    public final void mo16289o() {
        m21538w();
        if (this.f23570g) {
            m21537v(this.f23569f);
            this.f23570g = false;
        }
    }

    /* renamed from: p */
    public final C7024iw mo16290p() {
        return this.f23569f;
    }

    /* renamed from: q */
    public final long mo16291q() {
        return this.f23571h;
    }

    /* renamed from: r */
    public final int mo16292r() {
        return this.f23572i;
    }

    /* renamed from: s */
    public final boolean mo16293s() {
        return this.f23572i == 0;
    }

    /* renamed from: t */
    public final boolean mo16294t() {
        if (this.f23572i >= this.f23573j) {
            return true;
        }
        ByteBuffer byteBuffer = this.f22515b;
        return (byteBuffer != null && byteBuffer.position() >= 3072000) || this.f23570g;
    }

    /* renamed from: u */
    public final void mo16295u() {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        C7024iw iwVar = this.f23569f;
        boolean z = false;
        ary.m19464q(!mo16294t() && !mo16032c());
        if (!iwVar.mo16044k() && !iwVar.mo16034e()) {
            z = true;
        }
        ary.m19462o(z);
        if (!mo16293s() && !(iwVar.mo16031b() == mo16031b() && ((byteBuffer = iwVar.f22515b) == null || (byteBuffer2 = this.f22515b) == null || byteBuffer2.position() + byteBuffer.limit() < 3072000))) {
            this.f23570g = true;
        } else {
            m21537v(iwVar);
        }
    }
}
