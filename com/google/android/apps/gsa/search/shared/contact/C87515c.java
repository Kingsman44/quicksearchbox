package com.google.android.apps.gsa.search.shared.contact;

import com.evernote.android.state.BuildConfig;
import com.google.p4152bb.p4153a.C55084fg;

/* renamed from: com.google.android.apps.gsa.search.shared.contact.c */
/* compiled from: PG */
public enum C87515c {
    EMAIL("emails_data_id", true),
    PHONE_NUMBER("phones_data_id", true),
    POSTAL_ADDRESS("postals_data_id", true),
    GAIA_ID(BuildConfig.FLAVOR, false),
    APP_SPECIFIC_ENDPOINT_ID(BuildConfig.FLAVOR, false),
    PERSON("contacts", false);
    

    /* renamed from: g */
    public final boolean f236427g;

    /* renamed from: h */
    public final String f236428h;

    private C87515c(String str, boolean z) {
        this.f236428h = str;
        this.f236427g = z;
    }

    /* renamed from: a */
    public static C87515c m142148a(String str) {
        return (C87515c) Enum.valueOf(C87515c.class, str);
    }

    /* renamed from: b */
    public static C55084fg m142149b(C87515c cVar) {
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            return C55084fg.EMAIL_ADDRESS;
        }
        if (ordinal == 1) {
            return C55084fg.PHONE_NUMBER;
        }
        if (ordinal == 2) {
            return C55084fg.POSTAL_ADDRESS;
        }
        if (ordinal == 3) {
            return C55084fg.GAIA_ID;
        }
        if (ordinal != 4) {
            return C55084fg.UNKNOWN_CONTACT_METHOD;
        }
        return C55084fg.APP_SPECIFIC_ENDPOINT_ID;
    }
}
