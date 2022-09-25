package com.google.android.libraries.notifications.platform.p2318f.p2322b.p2323a.p2324a;

import com.google.android.libraries.notifications.platform.registration.AccountRepresentation;
import com.google.android.libraries.notifications.platform.registration.C30151a;

/* renamed from: com.google.android.libraries.notifications.platform.f.b.a.a.a */
/* compiled from: PG */
public final class C30118a {
    /* renamed from: a */
    public static final String m55954a(AccountRepresentation accountRepresentation, int i) {
        String str;
        if (accountRepresentation != null) {
            int i2 = C30151a.GAIA.f81530c;
            int hashCode = accountRepresentation.mo35539c().hashCode();
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append(hashCode);
            str = sb.toString();
        } else {
            str = "no_account";
        }
        return "GNP_SDK_JOB::" + str + "::" + i;
    }
}
