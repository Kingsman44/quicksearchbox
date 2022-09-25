package com.google.android.libraries.lens.view.sensors.orientation;

import android.hardware.display.DisplayManager;
import com.google.android.libraries.lens.view.main.C27359cv;

/* renamed from: com.google.android.libraries.lens.view.sensors.orientation.e */
/* compiled from: PG */
final class C27728e implements DisplayManager.DisplayListener {

    /* renamed from: a */
    C27730g f75703a;

    /* renamed from: b */
    final /* synthetic */ DisplayFlipService$1 f75704b;

    public C27728e(DisplayFlipService$1 displayFlipService$1) {
        this.f75704b = displayFlipService$1;
        this.f75703a = C27729f.m51583a(displayFlipService$1.f75691b);
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayChanged(int i) {
        C27730g a = C27729f.m51583a(this.f75704b.f75691b);
        if (Math.abs(this.f75703a.mo33214a() - a.mo33214a()) == 180) {
            ((C27359cv) this.f75704b.f75692c).f74851a.mo32930Q();
        }
        this.f75703a = a;
    }

    public final void onDisplayRemoved(int i) {
    }
}
