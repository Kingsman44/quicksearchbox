package com.google.android.gms.usonia;

import android.os.Parcel;
import android.os.Parcelable;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
public final class PeerAddress extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146157c();

    /* renamed from: a */
    public final byte[] f394831a;

    /* renamed from: b */
    public final int f394832b;

    /* renamed from: c */
    public final String f394833c;

    /* renamed from: d */
    public final int f394834d;

    private PeerAddress() {
        this.f394831a = new byte[0];
        this.f394832b = 0;
        this.f394833c = BuildConfig.FLAVOR;
        this.f394834d = 0;
    }

    public PeerAddress(byte[] bArr, int i, String str, int i2) {
        this.f394831a = bArr;
        this.f394832b = i;
        this.f394833c = str;
        this.f394834d = i2;
    }

    /* renamed from: a */
    public final String mo122618a() {
        try {
            InetAddress byAddress = InetAddress.getByAddress(this.f394831a);
            if (byAddress == null) {
                String arrays = Arrays.toString(this.f394831a);
                return "[invalid ip: " + arrays + "]";
            }
            return String.format(Locale.ENGLISH, "%s:%d:%d", new Object[]{byAddress.getHostAddress(), Integer.valueOf(this.f394832b), Integer.valueOf(this.f394834d)});
        } catch (UnknownHostException unused) {
            String arrays2 = Arrays.toString(this.f394831a);
            return "[illegal length: " + arrays2 + "]";
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PeerAddress) {
            PeerAddress peerAddress = (PeerAddress) obj;
            return Arrays.equals(this.f394831a, peerAddress.f394831a) && C143912ba.m233950b(Integer.valueOf(this.f394832b), Integer.valueOf(peerAddress.f394832b)) && C143912ba.m233950b(this.f394833c, peerAddress.f394833c) && C143912ba.m233950b(Integer.valueOf(this.f394834d), Integer.valueOf(peerAddress.f394834d));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f394831a)), Integer.valueOf(this.f394832b), this.f394833c, Integer.valueOf(this.f394834d)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        byte[] bArr = this.f394831a;
        C143947c.m234094m(parcel, 1, Arrays.copyOf(bArr, bArr.length));
        C143947c.m234089h(parcel, 2, this.f394832b);
        C143947c.m234106y(parcel, 3, this.f394833c);
        C143947c.m234089h(parcel, 4, this.f394834d);
        C143947c.m234083b(parcel, a);
    }
}
