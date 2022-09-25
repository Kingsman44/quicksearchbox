package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class WifiScan extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144903bg();

    /* renamed from: a */
    static final long[] f391798a = new long[0];

    /* renamed from: b */
    static final int[] f391799b = new int[0];

    /* renamed from: c */
    public final long f391800c;

    /* renamed from: d */
    final long[] f391801d;

    /* renamed from: e */
    final int[] f391802e;

    /* renamed from: f */
    final int[] f391803f;

    /* renamed from: g */
    final int[] f391804g;

    /* renamed from: h */
    final int[] f391805h;

    /* renamed from: i */
    final int[] f391806i;

    /* renamed from: j */
    final int[] f391807j;

    public WifiScan(long j, long[] jArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6) {
        this.f391800c = j;
        this.f391801d = jArr == null ? f391798a : jArr;
        this.f391802e = iArr == null ? f391799b : iArr;
        this.f391803f = iArr2 == null ? f391799b : iArr2;
        this.f391804g = iArr3 == null ? f391799b : iArr3;
        this.f391805h = iArr4 == null ? f391799b : iArr4;
        this.f391806i = iArr5 == null ? f391799b : iArr5;
        this.f391807j = iArr6 == null ? f391799b : iArr6;
    }

    /* renamed from: a */
    private final void m235458a(int i) {
        if (i < 0 || i >= this.f391801d.length) {
            long[] jArr = this.f391801d;
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds: [0, " + jArr.length + ")");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WifiScan)) {
            return false;
        }
        WifiScan wifiScan = (WifiScan) obj;
        if (wifiScan.f391800c != this.f391800c || !Arrays.equals(wifiScan.f391801d, this.f391801d) || !Arrays.equals(wifiScan.f391802e, this.f391802e) || !Arrays.equals(wifiScan.f391803f, this.f391803f) || !Arrays.equals(wifiScan.f391804g, this.f391804g) || !Arrays.equals(wifiScan.f391805h, this.f391805h) || !Arrays.equals(wifiScan.f391806i, this.f391806i) || !Arrays.equals(wifiScan.f391807j, this.f391807j)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f391801d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WifiScan[elapsed rt: ");
        sb.append(this.f391800c);
        int length = this.f391801d.length;
        for (int i = 0; i < length; i++) {
            sb.append(", Device[mac: ");
            m235458a(i);
            sb.append(this.f391801d[i] & 281474976710655L);
            sb.append(", dbm: ");
            m235458a(i);
            sb.append((byte) ((int) ((this.f391801d[i] & 71776119061217280L) >>> 48)));
            sb.append(", mhz: ");
            m235458a(i);
            sb.append(this.f391802e[i]);
            sb.append("]");
        }
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234090i(parcel, 1, this.f391800c);
        C143947c.m234102u(parcel, 2, this.f391801d);
        C143947c.m234099r(parcel, 3, this.f391802e);
        C143947c.m234099r(parcel, 4, this.f391803f);
        C143947c.m234099r(parcel, 5, this.f391804g);
        C143947c.m234099r(parcel, 6, this.f391805h);
        C143947c.m234099r(parcel, 7, this.f391806i);
        C143947c.m234099r(parcel, 8, this.f391807j);
        C143947c.m234083b(parcel, a);
    }
}
