package com.google.android.apps.gsa.shared.proto.p7126io;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.C58817ah;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.shared.proto.io.AbstractProtoParcelable */
/* compiled from: PG */
public abstract class AbstractProtoParcelable implements Parcelable {

    /* renamed from: a */
    boolean f252674a = true;

    /* renamed from: b */
    Object f252675b;

    /* renamed from: c */
    byte[] f252676c;

    protected AbstractProtoParcelable(Object obj) {
        this.f252675b = obj;
    }

    protected AbstractProtoParcelable(byte[] bArr) {
        this.f252676c = bArr;
    }

    /* renamed from: c */
    private final byte[] m147129c() {
        Object obj;
        if (this.f252676c == null && this.f252674a && (obj = this.f252675b) != null) {
            this.f252676c = mo84180b(obj);
        }
        return this.f252676c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo84179a(C58817ah ahVar) {
        if (this.f252675b == null) {
            if (this.f252674a) {
                return null;
            }
            this.f252675b = ahVar.apply(this.f252676c);
            this.f252674a = true;
        }
        return this.f252675b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract byte[] mo84180b(Object obj);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractProtoParcelable)) {
            return false;
        }
        return Arrays.equals(m147129c(), ((AbstractProtoParcelable) obj).m147129c());
    }

    public final int hashCode() {
        return Arrays.hashCode(m147129c());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(m147129c());
    }
}
