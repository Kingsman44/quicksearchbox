package com.google.research.xeno.effect;

import android.util.Size;
import com.google.research.xeno.effect.ProcessorBase;

/* renamed from: com.google.research.xeno.effect.k */
/* compiled from: PG */
public final /* synthetic */ class C66408k implements C66417t {

    /* renamed from: a */
    public final /* synthetic */ InputFrameSource f180586a;

    /* renamed from: b */
    public final /* synthetic */ Size f180587b;

    public /* synthetic */ C66408k(InputFrameSource inputFrameSource, Size size) {
        this.f180586a = inputFrameSource;
        this.f180587b = size;
    }

    /* renamed from: a */
    public final void mo18708a(long j) {
        InputFrameSource inputFrameSource = this.f180586a;
        Size size = this.f180587b;
        String str = C66412o.f180592a;
        C66412o.nativeStartVideoProcessing(j, inputFrameSource.f180562e, (long) size.getWidth(), (long) size.getHeight(), 0, 0, (ProcessorBase.Callback) null);
    }
}
