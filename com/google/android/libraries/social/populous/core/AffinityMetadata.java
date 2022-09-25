package com.google.android.libraries.social.populous.core;

import android.os.Parcelable;

/* compiled from: PG */
public abstract class AffinityMetadata implements Parcelable {

    /* renamed from: f */
    public static final AffinityMetadata f110679f;

    static {
        C42274b bVar = new C42274b();
        bVar.mo45230a(true);
        bVar.mo45230a(false);
        byte b = bVar.f110899b | 30;
        bVar.f110899b = (byte) b;
        if (b != 31) {
            StringBuilder sb = new StringBuilder();
            if ((1 & bVar.f110899b) == 0) {
                sb.append(" isPopulated");
            }
            if ((bVar.f110899b & 2) == 0) {
                sb.append(" isDeviceDataKnown");
            }
            if ((bVar.f110899b & 4) == 0) {
                sb.append(" isDirectClientInteraction");
            }
            if ((bVar.f110899b & 8) == 0) {
                sb.append(" cloudScore");
            }
            if ((bVar.f110899b & 16) == 0) {
                sb.append(" deviceScore");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        f110679f = new AutoValue_AffinityMetadata(bVar.f110898a);
    }

    /* renamed from: a */
    public abstract double mo44937a();

    /* renamed from: b */
    public abstract double mo44938b();

    /* renamed from: c */
    public abstract boolean mo44939c();

    /* renamed from: d */
    public abstract boolean mo44940d();

    /* renamed from: e */
    public abstract boolean mo44941e();
}
