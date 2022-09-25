package com.google.ads.interactivemedia.p367v3.internal;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;

/* renamed from: com.google.ads.interactivemedia.v3.internal.afe */
/* compiled from: PG */
final class afe implements MediaCodec.OnFrameRenderedListener, Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ aff f20509a;

    /* renamed from: b */
    private final Handler f20510b;

    public afe(aff aff, MediaCodec mediaCodec) {
        this.f20509a = aff;
        Handler l = aeu.m18542l(this);
        this.f20510b = l;
        mediaCodec.setOnFrameRenderedListener(this, l);
    }

    /* renamed from: a */
    private final void m18569a(long j) {
        aff aff = this.f20509a;
        if (this == aff.f20531b) {
            if (j != Long.MAX_VALUE) {
                try {
                    aff.mo14628W(j);
                } catch (C6826bn e) {
                    this.f20509a.mo16315ai(e);
                }
            } else {
                aff.mo16326ax();
            }
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        m18569a(aeu.m18500R(message.arg1, message.arg2));
        return true;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        if (aeu.f20466a < 30) {
            this.f20510b.sendMessageAtFrontOfQueue(Message.obtain(this.f20510b, 0, (int) (j >> 32), (int) j));
            return;
        }
        m18569a(j);
    }
}
