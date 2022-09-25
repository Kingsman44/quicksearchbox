package com.bumptech.glide.load.p299c.p300a;

import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bumptech.glide.load.c.a.ae */
/* compiled from: PG */
public final class C5826ae {

    /* renamed from: a */
    public static volatile int f17408a = -1;

    /* renamed from: b */
    private static final File f17409b = new File("/proc/self/fd");

    /* renamed from: c */
    private static volatile C5826ae f17410c;

    /* renamed from: d */
    private int f17411d;

    /* renamed from: e */
    private boolean f17412e = true;

    public C5826ae() {
        new AtomicBoolean(false);
    }

    /* renamed from: a */
    public static C5826ae m15058a() {
        if (f17410c == null) {
            synchronized (C5826ae.class) {
                if (f17410c == null) {
                    f17410c = new C5826ae();
                }
            }
        }
        return f17410c;
    }

    /* renamed from: c */
    private final synchronized boolean m15059c() {
        boolean z = true;
        int i = this.f17411d + 1;
        this.f17411d = i;
        if (i >= 50) {
            this.f17411d = 0;
            int length = f17409b.list().length;
            long j = (long) (f17408a != -1 ? f17408a : 20000);
            if (((long) length) >= j) {
                z = false;
            }
            this.f17412e = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + j);
            }
        }
        return this.f17412e;
    }

    /* renamed from: b */
    public final boolean mo12297b(int i, int i2, boolean z, boolean z2) {
        if (!z) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        } else if (z2) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        } else if (i < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because width is too small");
            }
            return false;
        } else if (i2 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because height is too small");
            }
            return false;
        } else if (m15059c()) {
            return true;
        } else {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
            }
            return false;
        }
    }
}
