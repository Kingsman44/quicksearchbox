package com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.apps.c.a.a.a.a.aq */
/* compiled from: PG */
public enum C45637aq implements C62957cd {
    OWNER_USER_TYPE_UNKNOWN(0),
    GOOGLE_USER(1),
    GPLUS_USER(2),
    GPLUS_DISABLED_BY_ADMIN(3),
    GOOGLE_APPS_USER(4),
    GOOGLE_APPS_SELF_MANAGED_USER(5),
    GOOGLE_FAMILY_USER(6),
    GOOGLE_FAMILY_CHILD_USER(7),
    GOOGLE_APPS_ADMIN_DISABLED(9),
    GOOGLE_ONE_USER(10),
    GOOGLE_FAMILY_CONVERTED_CHILD_USER(11);
    

    /* renamed from: l */
    private final int f120060l;

    private C45637aq(int i) {
        this.f120060l = i;
    }

    /* renamed from: a */
    public static C45637aq m81349a(int i) {
        switch (i) {
            case 0:
                return OWNER_USER_TYPE_UNKNOWN;
            case 1:
                return GOOGLE_USER;
            case 2:
                return GPLUS_USER;
            case 3:
                return GPLUS_DISABLED_BY_ADMIN;
            case 4:
                return GOOGLE_APPS_USER;
            case 5:
                return GOOGLE_APPS_SELF_MANAGED_USER;
            case 6:
                return GOOGLE_FAMILY_USER;
            case 7:
                return GOOGLE_FAMILY_CHILD_USER;
            case 9:
                return GOOGLE_APPS_ADMIN_DISABLED;
            case 10:
                return GOOGLE_ONE_USER;
            case 11:
                return GOOGLE_FAMILY_CONVERTED_CHILD_USER;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m81350b() {
        return C45636ap.f120047a;
    }

    public final int getNumber() {
        return this.f120060l;
    }

    public final String toString() {
        return Integer.toString(this.f120060l);
    }
}
