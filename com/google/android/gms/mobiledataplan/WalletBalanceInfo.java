package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class WalletBalanceInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145551y();

    /* renamed from: a */
    public long f393516a;

    /* renamed from: b */
    public String f393517b;

    /* renamed from: c */
    public int f393518c;

    /* renamed from: d */
    public Long f393519d;

    /* renamed from: e */
    public String f393520e;

    /* renamed from: f */
    public String f393521f;

    /* renamed from: g */
    public Long f393522g;

    /* renamed from: h */
    public Long f393523h;

    /* renamed from: i */
    public Long f393524i;

    /* renamed from: j */
    public String f393525j;

    private WalletBalanceInfo() {
    }

    public WalletBalanceInfo(long j, String str, int i, Long l, String str2, String str3, Long l2, Long l3, Long l4, String str4) {
        this.f393516a = j;
        this.f393517b = str;
        this.f393518c = i;
        this.f393519d = l;
        this.f393520e = str2;
        this.f393521f = str3;
        this.f393522g = l2;
        this.f393523h = l3;
        this.f393524i = l4;
        this.f393525j = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WalletBalanceInfo) {
            WalletBalanceInfo walletBalanceInfo = (WalletBalanceInfo) obj;
            return C143912ba.m233950b(Long.valueOf(this.f393516a), Long.valueOf(walletBalanceInfo.f393516a)) && C143912ba.m233950b(this.f393517b, walletBalanceInfo.f393517b) && C143912ba.m233950b(Integer.valueOf(this.f393518c), Integer.valueOf(walletBalanceInfo.f393518c)) && C143912ba.m233950b(this.f393519d, walletBalanceInfo.f393519d) && C143912ba.m233950b(this.f393520e, walletBalanceInfo.f393520e) && C143912ba.m233950b(this.f393521f, walletBalanceInfo.f393521f) && C143912ba.m233950b(this.f393522g, walletBalanceInfo.f393522g) && C143912ba.m233950b(this.f393523h, walletBalanceInfo.f393523h) && C143912ba.m233950b(this.f393524i, walletBalanceInfo.f393524i) && C143912ba.m233950b(this.f393525j, walletBalanceInfo.f393525j);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f393516a), this.f393517b, Integer.valueOf(this.f393518c), this.f393519d, this.f393520e, this.f393521f, this.f393522g, this.f393523h, this.f393524i, this.f393525j});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234090i(parcel, 1, this.f393516a);
        C143947c.m234106y(parcel, 2, this.f393517b);
        C143947c.m234089h(parcel, 3, this.f393518c);
        C143947c.m234104w(parcel, 4, this.f393519d);
        C143947c.m234106y(parcel, 5, this.f393520e);
        C143947c.m234106y(parcel, 6, this.f393521f);
        C143947c.m234104w(parcel, 7, this.f393522g);
        C143947c.m234104w(parcel, 8, this.f393523h);
        C143947c.m234104w(parcel, 9, this.f393524i);
        C143947c.m234106y(parcel, 10, this.f393525j);
        C143947c.m234083b(parcel, a);
    }
}
