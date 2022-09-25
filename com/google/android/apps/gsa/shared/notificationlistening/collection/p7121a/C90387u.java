package com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a;

import com.evernote.android.state.BuildConfig;
import java.util.regex.Matcher;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.a.u */
/* compiled from: PG */
public final class C90387u {

    /* renamed from: a */
    public CharSequence f252440a;

    /* renamed from: b */
    public CharSequence f252441b;

    /* renamed from: c */
    public CharSequence f252442c;

    public C90387u(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.f252440a = charSequence;
        this.f252441b = charSequence2;
        this.f252442c = charSequence3;
    }

    /* renamed from: a */
    public static C90387u m146991a(C90388v vVar, CharSequence charSequence) {
        String d;
        String str = null;
        if (charSequence == null) {
            return null;
        }
        Matcher matcher = vVar.mo84089a().matcher(charSequence);
        if (matcher.matches()) {
            int intValue = vVar.f252444b.intValue();
            Integer num = vVar.f252443a;
            if (num != null) {
                intValue = Math.max(intValue, num.intValue());
            }
            Integer num2 = vVar.f252445c;
            if (num2 != null) {
                intValue = Math.max(intValue, num2.intValue());
            }
            if (!(matcher.groupCount() < intValue || (d = C90391y.m146997d(matcher.group(vVar.f252444b.intValue()))) == null || d.toString().replaceAll("\\p{C}", BuildConfig.FLAVOR).length() == 0)) {
                Integer num3 = vVar.f252443a;
                String d2 = num3 != null ? C90391y.m146997d(matcher.group(num3.intValue())) : null;
                Integer num4 = vVar.f252445c;
                if (num4 != null) {
                    str = C90391y.m146997d(matcher.group(num4.intValue()));
                }
                return new C90387u(d2, d, str);
            }
        }
        return null;
    }
}
