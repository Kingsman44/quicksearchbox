package com.google.android.libraries.social.populous;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.android.p3287a.C42162a;
import com.google.android.libraries.social.populous.core.C42331dc;
import com.google.common.p4522b.C58528ij;
import java.util.Arrays;

/* compiled from: PG */
public final class AutoValue_PersonMetadata extends C$AutoValue_PersonMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42597r();

    /* renamed from: e */
    private static final ClassLoader f110339e = AutoValue_PersonMetadata.class.getClassLoader();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoValue_PersonMetadata(Parcel parcel) {
        super(parcel.readByte() == 1 ? parcel.readString() : null, parcel.readByte() == 1 ? (IdentityInfo) parcel.readParcelable(f110339e) : null, new int[]{1, 2, 3}[parcel.readInt()], parcel.readByte() == 1 ? C58528ij.m90008H((C42331dc[]) C42162a.m74078b(parcel, C42331dc.class).toArray(new C42331dc[0])) : null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte b = 1;
        parcel.writeByte(this.f110332a == null ? (byte) 0 : 1);
        String str = this.f110332a;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeByte(this.f110333b == null ? (byte) 0 : 1);
        IdentityInfo identityInfo = this.f110333b;
        if (identityInfo != null) {
            parcel.writeParcelable(identityInfo, 0);
        }
        parcel.writeInt(this.f110335d - 1);
        if (this.f110334c == null) {
            b = 0;
        }
        parcel.writeByte(b);
        C58528ij ijVar = this.f110334c;
        if (ijVar != null) {
            C42162a.m74081e(parcel, Arrays.asList((C42331dc[]) ijVar.toArray(new C42331dc[0])));
        }
    }

    public AutoValue_PersonMetadata(IdentityInfo identityInfo, int i, C58528ij ijVar) {
        super((String) null, identityInfo, i, ijVar);
    }
}
