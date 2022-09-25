package com.google.android.libraries.lens.view.render;

import com.google.common.p4526f.p4527a.C58974d;

/* compiled from: PG */
public class LensRenderer {

    /* renamed from: a */
    public static final C58974d f75521a = C58974d.m91136j();

    /* renamed from: b */
    public final long f75522b;

    public LensRenderer(long j) {
        this.f75522b = j;
    }

    private native byte[] nTap(long j, float f, float f2);

    public native void nSetDynamicResolutionOptions(long j, boolean z, float f, float f2);

    public native byte[] nSetFrame(long j, byte[] bArr);

    public native void nSetMuted(long j, boolean z);
}
