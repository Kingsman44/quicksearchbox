package com.google.android.gms.libs.identity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58485gu;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public final class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144867a();

    /* renamed from: a */
    public final int f391716a;

    /* renamed from: b */
    public final int f391717b;

    /* renamed from: c */
    public final String f391718c;

    /* renamed from: d */
    public final String f391719d;

    /* renamed from: e */
    public final int f391720e;

    /* renamed from: f */
    public final String f391721f;

    /* renamed from: g */
    public final ClientIdentity f391722g;

    /* renamed from: h */
    public final List f391723h;

    static {
        Process.myUid();
        Process.myPid();
    }

    public ClientIdentity(int i, int i2, String str, String str2, String str3, int i3, List list, ClientIdentity clientIdentity) {
        this.f391716a = i;
        this.f391717b = i2;
        this.f391718c = str;
        this.f391719d = str2;
        this.f391721f = str3;
        this.f391720e = i3;
        this.f391723h = C58485gu.m89842j(list);
        this.f391722g = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ClientIdentity) {
            ClientIdentity clientIdentity = (ClientIdentity) obj;
            if (this.f391716a != clientIdentity.f391716a || this.f391717b != clientIdentity.f391717b || this.f391720e != clientIdentity.f391720e || !this.f391718c.equals(clientIdentity.f391718c) || !C58832aw.m90831a(this.f391719d, clientIdentity.f391719d) || !C58832aw.m90831a(this.f391721f, clientIdentity.f391721f) || !C58832aw.m90831a(this.f391722g, clientIdentity.f391722g) || !this.f391723h.equals(clientIdentity.f391723h)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f391716a), this.f391718c, this.f391719d, this.f391721f});
    }

    public final String toString() {
        int length = this.f391718c.length() + 18;
        String str = this.f391719d;
        if (str != null) {
            length += str.length();
        }
        StringBuilder sb = new StringBuilder(length);
        sb.append(this.f391716a);
        sb.append("/");
        sb.append(this.f391718c);
        if (this.f391719d != null) {
            sb.append("[");
            if (this.f391719d.startsWith(this.f391718c)) {
                sb.append(this.f391719d, this.f391718c.length(), this.f391719d.length());
            } else {
                sb.append(this.f391719d);
            }
            sb.append("]");
        }
        if (this.f391721f != null) {
            sb.append("/");
            sb.append(Integer.toHexString(this.f391721f.hashCode()));
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f391716a);
        C143947c.m234089h(parcel, 2, this.f391717b);
        C143947c.m234106y(parcel, 3, this.f391718c);
        C143947c.m234106y(parcel, 4, this.f391719d);
        C143947c.m234089h(parcel, 5, this.f391720e);
        C143947c.m234106y(parcel, 6, this.f391721f);
        C143947c.m234105x(parcel, 7, this.f391722g, i);
        C143947c.m234080C(parcel, 8, this.f391723h);
        C143947c.m234083b(parcel, a);
    }
}
