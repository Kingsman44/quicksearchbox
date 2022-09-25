package com.google.android.libraries.gsa.monet.shared;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
public final class ProtoParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C23071ab();

    /* renamed from: a */
    public static final ProtoParcelable f63423a = new ProtoParcelable((C23073ad) null);

    /* renamed from: b */
    public boolean f63424b;

    /* renamed from: c */
    public C23073ad f63425c;

    /* renamed from: d */
    public byte[] f63426d;

    public ProtoParcelable(C23073ad adVar) {
        this.f63425c = adVar;
        this.f63424b = true;
    }

    public ProtoParcelable(byte[] bArr) {
        this.f63426d = bArr;
        this.f63424b = bArr == null;
    }

    /* renamed from: a */
    public final void mo28512a() {
        C23073ad adVar;
        if (this.f63426d == null && this.f63424b && (adVar = this.f63425c) != null) {
            this.f63426d = adVar.mo28524b();
        }
    }

    /* renamed from: b */
    public final byte[] mo28513b() {
        mo28512a();
        byte[] bArr = this.f63426d;
        return bArr != null ? bArr : new byte[0];
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ProtoParcelable)) {
            return false;
        }
        return Arrays.equals(mo28513b(), ((ProtoParcelable) obj).mo28513b());
    }

    public final int hashCode() {
        return Arrays.hashCode(mo28513b());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        mo28512a();
        parcel.writeByteArray(this.f63426d);
    }
}
