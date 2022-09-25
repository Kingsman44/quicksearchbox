package org.chromium.base;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public class UnguessableToken implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C72371ab();

    /* renamed from: a */
    private final long f192514a;

    /* renamed from: b */
    private final long f192515b;

    public UnguessableToken(long j, long j2) {
        this.f192514a = j;
        this.f192515b = j2;
    }

    private static UnguessableToken create(long j, long j2) {
        return new UnguessableToken(j, j2);
    }

    private UnguessableToken parcelAndUnparcelForTesting() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        UnguessableToken unguessableToken = (UnguessableToken) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return unguessableToken;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            UnguessableToken unguessableToken = (UnguessableToken) obj;
            return unguessableToken.f192514a == this.f192514a && unguessableToken.f192515b == this.f192515b;
        }
    }

    public long getHighForSerialization() {
        return this.f192514a;
    }

    public long getLowForSerialization() {
        return this.f192515b;
    }

    public final int hashCode() {
        long j = this.f192515b;
        long j2 = this.f192514a;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f192514a);
        parcel.writeLong(this.f192515b);
    }
}
