package com.google.android.libraries.social.populous.p3296e.p3298b;

import android.telephony.PhoneNumberUtils;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58837ba;
import com.google.p4420by.p4425c.p4426a.p4427a.C57873c;
import java.util.Locale;

/* renamed from: com.google.android.libraries.social.populous.e.b.a */
/* compiled from: PG */
public final class C42403a extends C42416am {

    /* renamed from: a */
    private final Locale f111217a;

    public C42403a(Locale locale) {
        this.f111217a = locale;
    }

    /* renamed from: c */
    public static final String m74667c(String str) {
        String str2;
        if (!C58837ba.m90859h(str)) {
            try {
                str2 = PhoneNumberUtils.normalizeNumber(str);
            } catch (NoSuchMethodError unused) {
                Log.e("PhoneNumbers", "normalizeNumber not supported");
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
        }
        return BuildConfig.FLAVOR;
    }

    /* renamed from: a */
    public final String mo45392a(String str) {
        String str2;
        if (C58837ba.m90859h(str)) {
            return BuildConfig.FLAVOR;
        }
        try {
            str2 = PhoneNumberUtils.formatNumber(str, this.f111217a.getCountry());
        } catch (NoSuchMethodError unused) {
            Log.e("PhoneNumbers", "formatNumber not supported");
            str2 = null;
        }
        return str2 == null ? str : str2;
    }

    /* renamed from: b */
    public final String mo45393b(String str) {
        String str2;
        if (C58837ba.m90859h(str)) {
            return BuildConfig.FLAVOR;
        }
        try {
            str2 = PhoneNumberUtils.formatNumberToE164(str, this.f111217a.getCountry());
        } catch (NoSuchMethodError unused) {
            Log.e("PhoneNumbers", "formatNumberToE164 not supported");
            str2 = null;
        }
        return str2 == null ? C57873c.m88543e(str).f154597c : str2;
    }
}
