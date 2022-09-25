package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.av */
/* compiled from: PG */
public enum C80201av implements C62957cd {
    PIE_ELIGIBILITY_UNKNOWN(0),
    PIE_ELIGIBLE(1),
    PIE_INELIGIBLE_NGA_NOT_ENABLED(2),
    PIE_INELIGIBLE_PIE_NOT_ENABLED(3),
    PIE_INELIGIBLE_SYSTEM_AND_ASSISTANT_LOCALE_DIFFER(4),
    PIE_INELIGIBLE_UNSUPPORTED_LOCALE(5),
    PIE_INELIGIBLE_NOT_SUPPORTED_NAV(6),
    PIE_INELIGIBLE_CONFIGURATION_NOT_INITIALIZED(7),
    PIE_INELIGIBLE_ANDROID_VERSION_NOT_SUPPORTED(8),
    PIE_INELIGIBLE_ACCESSIBILITY_ENABLED(9),
    PIE_INELIGIBLE_NGA_NOT_ACTIVE(10),
    PIE_INELIGIBLE_UNINITIALIZED(11);
    

    /* renamed from: m */
    public final int f220046m;

    private C80201av(int i) {
        this.f220046m = i;
    }

    /* renamed from: a */
    public static C80201av m128093a(int i) {
        switch (i) {
            case 0:
                return PIE_ELIGIBILITY_UNKNOWN;
            case 1:
                return PIE_ELIGIBLE;
            case 2:
                return PIE_INELIGIBLE_NGA_NOT_ENABLED;
            case 3:
                return PIE_INELIGIBLE_PIE_NOT_ENABLED;
            case 4:
                return PIE_INELIGIBLE_SYSTEM_AND_ASSISTANT_LOCALE_DIFFER;
            case 5:
                return PIE_INELIGIBLE_UNSUPPORTED_LOCALE;
            case 6:
                return PIE_INELIGIBLE_NOT_SUPPORTED_NAV;
            case 7:
                return PIE_INELIGIBLE_CONFIGURATION_NOT_INITIALIZED;
            case 8:
                return PIE_INELIGIBLE_ANDROID_VERSION_NOT_SUPPORTED;
            case 9:
                return PIE_INELIGIBLE_ACCESSIBILITY_ENABLED;
            case 10:
                return PIE_INELIGIBLE_NGA_NOT_ACTIVE;
            case 11:
                return PIE_INELIGIBLE_UNINITIALIZED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m128094b() {
        return C80200au.f220032a;
    }

    public final int getNumber() {
        return this.f220046m;
    }

    public final String toString() {
        return Integer.toString(this.f220046m);
    }
}
