package com.google.android.libraries.searchbox.shared.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58471gg;
import com.google.common.p4522b.C58485gu;
import com.google.p4017at.p4060h.p4073d.p4074a.C54231at;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class Response implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C41646a();

    /* renamed from: a */
    public final String f108861a;

    /* renamed from: b */
    public final C58485gu f108862b;

    /* renamed from: c */
    public final Bundle f108863c;

    /* renamed from: d */
    public final int f108864d;

    /* renamed from: e */
    public final String f108865e;

    /* renamed from: f */
    public final long f108866f;

    /* renamed from: g */
    public final boolean f108867g;

    /* renamed from: h */
    public final C54231at f108868h;

    public Response(Parcel parcel) {
        this.f108861a = parcel.readString();
        this.f108862b = C58485gu.m89842j(parcel.createTypedArrayList(Suggestion.CREATOR));
        this.f108863c = parcel.readBundle(Response.class.getClassLoader());
        this.f108864d = parcel.readInt();
        this.f108865e = parcel.readString();
        this.f108866f = parcel.readLong();
        this.f108867g = parcel.readByte() != 0;
        try {
            this.f108868h = (C54231at) C62942bv.parseFrom((C62942bv) C54231at.f142359r, parcel.createByteArray());
        } catch (C62974ct e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final int mo44245a() {
        return this.f108863c.getInt("gsa:au");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Response)) {
            return false;
        }
        Response response = (Response) obj;
        if (this == response) {
            return true;
        }
        if (!C58832aw.m90831a(this.f108861a, response.f108861a) || !C58832aw.m90831a(this.f108862b, response.f108862b) || this.f108864d != response.f108864d || !this.f108865e.equals(response.f108865e) || this.f108866f != response.f108866f || this.f108867g != response.f108867g) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.f108861a, this.f108862b.toArray(C58471gg.f156097c), this.f108863c, Integer.valueOf(this.f108864d), this.f108865e, Long.valueOf(this.f108866f), Boolean.valueOf(this.f108867g)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response[input=");
        sb.append(this.f108861a);
        sb.append(", suggestMode=");
        sb.append(this.f108864d);
        sb.append(", corpusId=");
        sb.append(this.f108865e);
        sb.append(", isCacheable=");
        sb.append(this.f108867g);
        sb.append(", suggestions=[");
        C58485gu guVar = this.f108862b;
        int size = guVar.size();
        boolean z = true;
        int i = 0;
        while (i < size) {
            Suggestion suggestion = (Suggestion) guVar.get(i);
            if (!z) {
                sb.append(",");
            }
            sb.append(suggestion);
            i++;
            z = false;
        }
        sb.append("]]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f108861a);
        parcel.writeTypedList(this.f108862b);
        parcel.writeBundle(this.f108863c);
        parcel.writeInt(this.f108864d);
        parcel.writeString(this.f108865e);
        parcel.writeLong(this.f108866f);
        parcel.writeByte(this.f108867g ? (byte) 1 : 0);
        parcel.writeByteArray(this.f108868h.toByteArray());
    }

    public Response(Response response, long j) {
        this.f108861a = response.f108861a;
        this.f108862b = C58485gu.m89842j(response.f108862b);
        this.f108863c = new Bundle(response.f108863c);
        this.f108864d = response.f108864d;
        this.f108865e = response.f108865e;
        this.f108866f = j;
        this.f108867g = response.f108867g;
        this.f108868h = response.f108868h;
    }

    public Response(String str, List list, Bundle bundle, int i, String str2, long j) {
        this(str, list, bundle, i, str2, j, true, C54231at.f142359r);
    }

    public Response(String str, List list, Bundle bundle, int i, String str2, long j, boolean z, C54231at atVar) {
        this.f108861a = str;
        this.f108862b = C58485gu.m89842j(list);
        this.f108863c = bundle;
        this.f108864d = i;
        this.f108865e = str2;
        this.f108866f = j;
        this.f108867g = z;
        this.f108868h = atVar;
    }
}
