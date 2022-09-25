package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143855b();

    /* renamed from: a */
    public static final ConnectionResult f389572a = new ConnectionResult(1, 0, (PendingIntent) null, (String) null);

    /* renamed from: b */
    final int f389573b;

    /* renamed from: c */
    public final int f389574c;

    /* renamed from: d */
    public final PendingIntent f389575d;

    /* renamed from: e */
    public final String f389576e;

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f389573b = i;
        this.f389574c = i2;
        this.f389575d = pendingIntent;
        this.f389576e = str;
    }

    /* renamed from: a */
    public final boolean mo119067a() {
        return (this.f389574c == 0 || this.f389575d == null) ? false : true;
    }

    /* renamed from: b */
    public final boolean mo119068b() {
        return this.f389574c == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f389574c == connectionResult.f389574c && C143912ba.m233950b(this.f389575d, connectionResult.f389575d) && C143912ba.m233950b(this.f389576e, connectionResult.f389576e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f389574c), this.f389575d, this.f389576e});
    }

    public final String toString() {
        String str;
        ArrayList arrayList = new ArrayList();
        int i = this.f389574c;
        if (i == 99) {
            str = "UNFINISHED";
        } else if (i != 1500) {
            switch (i) {
                case -1:
                    str = "UNKNOWN";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                    str = "SERVICE_MISSING";
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 9:
                    str = "SERVICE_INVALID";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 11:
                    str = "LICENSE_CHECK_FAILED";
                    break;
                default:
                    switch (i) {
                        case 13:
                            str = "CANCELED";
                            break;
                        case 14:
                            str = "TIMEOUT";
                            break;
                        case 15:
                            str = "INTERRUPTED";
                            break;
                        case 16:
                            str = "API_UNAVAILABLE";
                            break;
                        case 17:
                            str = "SIGN_IN_FAILED";
                            break;
                        case 18:
                            str = "SERVICE_UPDATING";
                            break;
                        case 19:
                            str = "SERVICE_MISSING_PERMISSION";
                            break;
                        case 20:
                            str = "RESTRICTED_PROFILE";
                            break;
                        case 21:
                            str = "API_VERSION_UPDATE_REQUIRED";
                            break;
                        case 22:
                            str = "RESOLUTION_ACTIVITY_NOT_FOUND";
                            break;
                        case 23:
                            str = "API_DISABLED";
                            break;
                        case 24:
                            str = "API_DISABLED_FOR_CONNECTION";
                            break;
                        default:
                            str = "UNKNOWN_ERROR_CODE(" + i + ")";
                            break;
                    }
            }
        } else {
            str = "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        C143910az.m233947b("statusCode", str, arrayList);
        C143910az.m233947b("resolution", this.f389575d, arrayList);
        C143910az.m233947b("message", this.f389576e, arrayList);
        return C143910az.m233946a(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f389573b);
        C143947c.m234089h(parcel, 2, this.f389574c);
        C143947c.m234105x(parcel, 3, this.f389575d, i);
        C143947c.m234106y(parcel, 4, this.f389576e);
        C143947c.m234083b(parcel, a);
    }
}
