package com.google.android.libraries.lens.view.p2113h.p2115b.p2116a;

import android.hardware.Camera;

/* renamed from: com.google.android.libraries.lens.view.h.b.a.b */
/* compiled from: PG */
final class C26664b {

    /* renamed from: a */
    private final int f72703a;

    /* renamed from: b */
    private final Camera.CameraInfo f72704b;

    public C26664b(int i, Camera.CameraInfo cameraInfo) {
        this.f72703a = i;
        this.f72704b = cameraInfo;
    }

    public final String toString() {
        int i = this.f72703a;
        boolean z = this.f72704b.canDisableShutterSound;
        int i2 = this.f72704b.orientation;
        int i3 = this.f72704b.facing;
        return "CameraInfo{cameraId=" + i + ",canDisableShutterSound=" + z + ",orientation=" + i2 + ",facing=" + i3 + "}";
    }
}
