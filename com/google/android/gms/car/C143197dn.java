package com.google.android.gms.car;

import com.google.android.gms.common.ConnectionResult;
import java.util.Locale;

/* renamed from: com.google.android.gms.car.dn */
/* compiled from: PG */
public abstract class C143197dn {
    /* renamed from: a */
    public abstract ConnectionResult mo118219a();

    /* renamed from: b */
    public abstract int mo118220b();

    public final String toString() {
        String str;
        if (mo118220b() == 2) {
            ConnectionResult a = mo118219a();
            a.getClass();
            return String.format(Locale.US, "%s(%d)", new Object[]{a.f389576e, Integer.valueOf(a.f389574c)});
        }
        int b = mo118220b();
        switch (b) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "LEGACY_GMSCORE_FAILURE";
                break;
            case 3:
                str = "GEARHEAD_BINDING_FAILURE";
                break;
            case 4:
                str = "GEARHEAD_BINDING_INTERRUPTED";
                break;
            case 5:
                str = "GEARHEAD_CAR_SERVICE_FAILURE";
                break;
            case 6:
                str = "GEARHEAD_BINDING_DIED";
                break;
            default:
                str = "null";
                break;
        }
        if (b != 0) {
            return str;
        }
        throw null;
    }
}
