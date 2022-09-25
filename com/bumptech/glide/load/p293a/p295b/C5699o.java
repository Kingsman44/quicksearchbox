package com.bumptech.glide.load.p293a.p295b;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.Log;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;

/* renamed from: com.bumptech.glide.load.a.b.o */
/* compiled from: PG */
public final class C5699o {

    /* renamed from: a */
    public final int f17171a;

    /* renamed from: b */
    public final int f17172b;

    /* renamed from: c */
    public final int f17173c;

    /* renamed from: d */
    private final Context f17174d;

    public C5699o(C5697m mVar) {
        Context context = mVar.f17165a;
        this.f17174d = context;
        boolean z = true;
        int i = true != mVar.f17166b.isLowRamDevice() ? 4194304 : C89885b.NOW_VALUE;
        this.f17173c = i;
        ActivityManager activityManager = mVar.f17166b;
        int round = Math.round(((float) (activityManager.getMemoryClass() * 1048576)) * (true == activityManager.isLowRamDevice() ? 0.33f : mVar.f17168d));
        float f = (float) (mVar.f17169e.f17170a.widthPixels * mVar.f17169e.f17170a.heightPixels * 4);
        int round2 = Math.round(mVar.f17167c * f);
        int round3 = Math.round(f + f);
        int i2 = round - i;
        int i3 = round3 + round2;
        if (i3 <= i2) {
            this.f17172b = round3;
            this.f17171a = round2;
        } else {
            float f2 = ((float) i2) / (mVar.f17167c + 2.0f);
            this.f17172b = Math.round(f2 + f2);
            this.f17171a = Math.round(f2 * mVar.f17167c);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            String formatFileSize = Formatter.formatFileSize(context, (long) this.f17172b);
            String formatFileSize2 = Formatter.formatFileSize(context, (long) this.f17171a);
            String formatFileSize3 = Formatter.formatFileSize(context, (long) i);
            z = i3 <= round ? false : z;
            String formatFileSize4 = Formatter.formatFileSize(context, (long) round);
            int memoryClass = mVar.f17166b.getMemoryClass();
            boolean isLowRamDevice = mVar.f17166b.isLowRamDevice();
            Log.d("MemorySizeCalculator", "Calculation complete, Calculated memory cache size: " + formatFileSize + ", pool size: " + formatFileSize2 + ", byte array size: " + formatFileSize3 + ", memory class limited? " + z + ", max size: " + formatFileSize4 + ", memoryClass: " + memoryClass + ", isLowMemoryDevice: " + isLowRamDevice);
        }
    }
}
