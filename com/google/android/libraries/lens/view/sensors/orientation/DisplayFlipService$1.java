package com.google.android.libraries.lens.view.sensors.orientation;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.WindowManager;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;

/* compiled from: PG */
public class DisplayFlipService$1 implements C2376g {

    /* renamed from: a */
    final DisplayManager.DisplayListener f75690a = new C27728e(this);

    /* renamed from: b */
    final /* synthetic */ WindowManager f75691b;

    /* renamed from: c */
    final /* synthetic */ Runnable f75692c;

    /* renamed from: d */
    final /* synthetic */ DisplayManager f75693d;

    public DisplayFlipService$1(WindowManager windowManager, Runnable runnable, DisplayManager displayManager) {
        this.f75691b = windowManager;
        this.f75692c = runnable;
        this.f75693d = displayManager;
    }

    /* renamed from: gV */
    public final /* synthetic */ void mo3520gV(C2391v vVar) {
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
    }

    /* renamed from: gX */
    public final void mo3522gX(C2391v vVar) {
        this.f75693d.unregisterDisplayListener(this.f75690a);
    }

    /* renamed from: gY */
    public final void mo3523gY(C2391v vVar) {
        this.f75693d.registerDisplayListener(this.f75690a, (Handler) null);
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }
}
