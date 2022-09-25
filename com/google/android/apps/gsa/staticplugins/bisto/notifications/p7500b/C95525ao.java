package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.util.Patterns;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90379m;
import com.google.android.googlequicksearchbox.R;
import java.util.Locale;
import java.util.regex.Matcher;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.b.ao */
/* compiled from: PG */
public final class C95525ao {

    /* renamed from: a */
    final String f267321a;

    /* renamed from: b */
    final String f267322b;

    public C95525ao(Context context, String str) {
        C95525ao aoVar;
        Matcher matcher = Patterns.PHONE.matcher(str);
        if (!matcher.find()) {
            aoVar = new C95525ao(str, m158038a(str));
        } else {
            String formatNumber = PhoneNumberUtils.formatNumber(matcher.group(), Locale.getDefault().getCountry());
            if (formatNumber == null) {
                aoVar = new C95525ao(str, m158038a(str));
            } else {
                String a = C90379m.m146982a(context, "tel:".concat(formatNumber));
                aoVar = a == null ? new C95525ao(context.getString(R.string.unknown_phone_number), (String) null) : new C95525ao(a, m158038a(a));
            }
        }
        this.f267321a = aoVar.f267321a;
        this.f267322b = aoVar.f267322b;
    }

    public C95525ao(String str, String str2) {
        this.f267321a = str;
        this.f267322b = str2;
    }

    /* renamed from: a */
    public static String m158038a(String str) {
        return str.split("\\s+", 2)[0];
    }

    /* renamed from: b */
    public final String mo89429b() {
        String str = this.f267322b;
        return str == null ? this.f267321a : str;
    }
}
