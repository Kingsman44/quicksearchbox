package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.util.Patterns;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58523ie;
import com.google.common.p4522b.C58525ig;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58701ou;
import com.google.common.p4522b.C58714pg;
import com.google.common.p4522b.C58764rc;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Locale;
import java.util.regex.Matcher;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.b.ap */
/* compiled from: PG */
public final class C95526ap {
    /* renamed from: a */
    public static CharSequence m158040a(CharSequence charSequence) {
        Matcher matcher = Patterns.PHONE.matcher(charSequence);
        StringBuilder sb = new StringBuilder(charSequence);
        int i = 0;
        while (matcher.find(i)) {
            String formatNumber = PhoneNumberUtils.formatNumber(matcher.group(), Locale.getDefault().getCountry());
            int end = matcher.end();
            if (formatNumber != null) {
                C58976aa aaVar = C58975e.f156826a;
                int length = sb.length() - charSequence.length();
                sb.replace(matcher.start() + length, matcher.end() + length, formatNumber);
            }
            i = end;
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static CharSequence m158041b(CharSequence charSequence, Context context) {
        C58523ie ieVar = new C58523ie();
        Matcher matcher = Patterns.EMAIL_ADDRESS.matcher(charSequence);
        int i = 0;
        while (matcher.find(i)) {
            i = matcher.end();
            ieVar.mo55482b(C58714pg.m90505h(Integer.valueOf(matcher.start()), Integer.valueOf(matcher.end())));
        }
        C58525ig a = ieVar.mo55481a();
        Matcher matcher2 = Patterns.WEB_URL.matcher(charSequence);
        StringBuilder sb = new StringBuilder(charSequence);
        int i2 = 0;
        while (matcher2.find(i2)) {
            i2 = matcher2.end();
            C58714pg h = C58714pg.m90505h(Integer.valueOf(matcher2.start()), Integer.valueOf(matcher2.end()));
            C58485gu guVar = a.f156174c;
            C58817ah c = C58714pg.m90500c();
            int a2 = C58764rc.m90670a(C58597ky.m90217h(guVar, c), h.f156456b, C58701ou.f156429a);
            if (a2 != -1) {
                C58714pg pgVar = (C58714pg) a.f156174c.get(a2);
                if (pgVar.f156456b.compareTo(h.f156456b) <= 0 && pgVar.f156457c.compareTo(h.f156457c) >= 0) {
                }
            }
            String group = matcher2.group(3);
            if (group != null) {
                if (group.startsWith("www.")) {
                    group = group.substring(4);
                }
                String string = context.getResources().getString(R.string.link_replacement, new Object[]{group});
                int length = sb.length() - charSequence.length();
                sb.replace(matcher2.start() + length, matcher2.end() + length, string);
            }
        }
        return sb.toString();
    }
}
