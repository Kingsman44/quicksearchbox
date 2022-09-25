package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.common.util.C144018r;
import com.google.android.gms.location.C144879aj;
import com.google.android.gms.location.C144890au;
import com.google.android.gms.location.C144902bf;
import com.google.android.gms.location.LocationRequest;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* compiled from: PG */
public class LocationRequestInternal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144920ai();

    /* renamed from: a */
    LocationRequest f391859a;

    public LocationRequestInternal(LocationRequest locationRequest, List list, boolean z, boolean z2, String str, boolean z3, boolean z4, String str2, long j) {
        WorkSource workSource;
        String str3 = str;
        String str4 = str2;
        long j2 = j;
        C144890au auVar = new C144890au(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                WorkSource workSource2 = new WorkSource();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ClientIdentity clientIdentity = (ClientIdentity) it.next();
                    int i = clientIdentity.f390000a;
                    String str5 = clientIdentity.f390001b;
                    Method method = C144018r.f390253b;
                    if (method != null) {
                        try {
                            method.invoke(workSource2, new Object[]{Integer.valueOf(i), str5 == null ? BuildConfig.FLAVOR : str5});
                        } catch (Exception e) {
                            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                        }
                    } else {
                        Method method2 = C144018r.f390252a;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource2, new Object[]{Integer.valueOf(i)});
                            } catch (Exception e2) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                            }
                        }
                    }
                }
                workSource = workSource2;
            }
            auVar.f391834h = workSource;
        }
        if (z) {
            C144879aj.m235477b(1);
            auVar.f391831e = 1;
        }
        if (z2) {
            C144902bf.m235502b(2);
            auVar.f391832f = 2;
        }
        if (str3 != null) {
            auVar.mo120386d(str3);
        } else if (str4 != null) {
            auVar.mo120386d(str4);
        }
        if (z3) {
            auVar.f391833g = true;
        }
        if (z4) {
            auVar.f391830d = true;
        }
        if (j2 != Long.MAX_VALUE) {
            auVar.mo120385c(j2);
        }
        this.f391859a = auVar.mo120383a();
    }

    @Deprecated
    /* renamed from: a */
    public static LocationRequestInternal m235512a(LocationRequest locationRequest) {
        return new LocationRequestInternal(locationRequest, (List) null, false, false, (String) null, false, false, (String) null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequestInternal) {
            return C143912ba.m233950b(this.f391859a, ((LocationRequestInternal) obj).f391859a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f391859a.hashCode();
    }

    public final String toString() {
        return this.f391859a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f391859a, i);
        C143947c.m234083b(parcel, a);
    }
}
