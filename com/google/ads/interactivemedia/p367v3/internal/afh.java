package com.google.ads.interactivemedia.p367v3.internal;

import android.hardware.display.DisplayManager;
import android.os.Handler;

/* renamed from: com.google.ads.interactivemedia.v3.internal.afh */
/* compiled from: PG */
final class afh implements DisplayManager.DisplayListener {

    /* renamed from: a */
    final /* synthetic */ afj f20553a;

    /* renamed from: b */
    private final DisplayManager f20554b;

    public afh(afj afj, DisplayManager displayManager) {
        this.f20553a = afj;
        this.f20554b = displayManager;
    }

    /* renamed from: a */
    public final void mo14654a() {
        this.f20554b.registerDisplayListener(this, (Handler) null);
    }

    /* renamed from: b */
    public final void mo14655b() {
        this.f20554b.unregisterDisplayListener(this);
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.f20553a.m18629e();
        }
    }

    public final void onDisplayRemoved(int i) {
    }
}
