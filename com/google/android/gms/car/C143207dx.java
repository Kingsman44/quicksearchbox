package com.google.android.gms.car;

import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.view.Surface;
import com.google.android.gms.car.p10760f.C143239ac;
import com.google.android.gms.car.p10764h.C143316a;

/* renamed from: com.google.android.gms.car.dx */
/* compiled from: PG */
public final class C143207dx {

    /* renamed from: a */
    public final VirtualDisplay f388308a;

    /* renamed from: b */
    private Surface f388309b;

    /* renamed from: c */
    private final C143239ac f388310c;

    public C143207dx(DisplayManager displayManager, String str, int i, int i2, int i3, Surface surface, C143239ac acVar) {
        this.f388309b = surface;
        this.f388310c = acVar;
        try {
            VirtualDisplay createVirtualDisplay = displayManager.createVirtualDisplay(str, i, i2, i3, surface, 10);
            if (createVirtualDisplay != null) {
                this.f388308a = createVirtualDisplay;
                return;
            }
            throw new RuntimeException("Failed to create virtual display");
        } catch (SecurityException e) {
            throw new RuntimeException("Failed to create virtual display", e);
        }
    }

    /* renamed from: a */
    public final synchronized Surface mo118227a() {
        return this.f388309b;
    }

    /* renamed from: b */
    public final synchronized void mo118228b() {
        this.f388308a.release();
        Surface surface = this.f388309b;
        if (surface != null) {
            surface.release();
            this.f388310c.mo118282a(this.f388309b);
            this.f388309b = null;
        }
    }

    /* renamed from: c */
    public final synchronized void mo118229c(Surface surface) {
        if (surface != this.f388309b) {
            if (C143109au.m232164a("CAR.PROJECTION", 3)) {
                C143316a.m232514d(3, "CAR.PROJECTION", (Throwable) null, "surface changed %s", surface);
            }
            this.f388308a.setSurface(surface);
            Surface surface2 = this.f388309b;
            if (surface2 != null) {
                surface2.release();
                this.f388310c.mo118282a(this.f388309b);
            }
            this.f388309b = surface;
        }
    }
}
