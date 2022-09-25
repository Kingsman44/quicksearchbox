package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.rx */
/* compiled from: PG */
public enum C60492rx implements C62957cd {
    YES_USER_DEFAULT(1),
    YES_IMPLICIT(2),
    YES_OVERRIDE(3),
    YES_FORCED(14),
    NO_NOT_LOADED(4),
    NO_NO_CUSTOM_TABS_BROWSERS(5),
    NO_BROWSER_FIRST_RUN_NOT_DONE(6),
    NO_UNRESOLVED_INTENT(7),
    NO_NON_BROWSER_APP_DEFAULT(8),
    NO_MULTIPLE_APPS_NO_DEFAULT(9),
    NO_ACCOUNT_MISMATCH_TOAST_NOT_SUPPORTED(10),
    MAYBE_CUSTOM_TABS_ONBOARDING_DIALOG_SHOWN(11),
    MAYBE_OFFLINE_LANDING_PAGES_OPTIN_SHOWN(12),
    NO_USER_OPTED_OUT(13),
    NO_INTENT_URL(15),
    NO_INTERNAL_URL(16);
    

    /* renamed from: q */
    public final int f163738q;

    private C60492rx(int i) {
        this.f163738q = i;
    }

    /* renamed from: a */
    public static C60492rx m92596a(int i) {
        switch (i) {
            case 1:
                return YES_USER_DEFAULT;
            case 2:
                return YES_IMPLICIT;
            case 3:
                return YES_OVERRIDE;
            case 4:
                return NO_NOT_LOADED;
            case 5:
                return NO_NO_CUSTOM_TABS_BROWSERS;
            case 6:
                return NO_BROWSER_FIRST_RUN_NOT_DONE;
            case 7:
                return NO_UNRESOLVED_INTENT;
            case 8:
                return NO_NON_BROWSER_APP_DEFAULT;
            case 9:
                return NO_MULTIPLE_APPS_NO_DEFAULT;
            case 10:
                return NO_ACCOUNT_MISMATCH_TOAST_NOT_SUPPORTED;
            case 11:
                return MAYBE_CUSTOM_TABS_ONBOARDING_DIALOG_SHOWN;
            case 12:
                return MAYBE_OFFLINE_LANDING_PAGES_OPTIN_SHOWN;
            case 13:
                return NO_USER_OPTED_OUT;
            case 14:
                return YES_FORCED;
            case 15:
                return NO_INTENT_URL;
            case 16:
                return NO_INTERNAL_URL;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m92597b() {
        return C60491rw.f163720a;
    }

    public final int getNumber() {
        return this.f163738q;
    }

    public final String toString() {
        return Integer.toString(this.f163738q);
    }
}
