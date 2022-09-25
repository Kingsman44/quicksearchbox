package com.google.ads.interactivemedia.p367v3.internal;

import android.media.AudioAttributes;

/* renamed from: com.google.ads.interactivemedia.v3.internal.gs */
/* compiled from: PG */
public final class C6966gs {

    /* renamed from: a */
    public static final C6966gs f22224a = C7009ih.m20723a(1, 1);

    /* renamed from: b */
    public final int f22225b = 0;

    /* renamed from: c */
    public final int f22226c = 1;

    /* renamed from: d */
    public final int f22227d = 1;

    /* renamed from: e */
    private AudioAttributes f22228e;

    public /* synthetic */ C6966gs(int i, int i2) {
    }

    /* renamed from: a */
    public final AudioAttributes mo15885a() {
        if (this.f22228e == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            if (aeu.f20466a >= 29) {
                usage.setAllowedCapturePolicy(1);
            }
            this.f22228e = usage.build();
        }
        return this.f22228e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6966gs gsVar = (C6966gs) obj;
        return true;
    }

    public final int hashCode() {
        return 15699889;
    }
}
