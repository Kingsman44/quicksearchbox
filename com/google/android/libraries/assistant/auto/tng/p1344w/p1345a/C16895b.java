package com.google.android.libraries.assistant.auto.tng.p1344w.p1345a;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58837ba;
import com.google.common.base.C58869cf;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import java.util.Locale;
import org.p5633c.p5634a.C72288l;
import org.p5633c.p5634a.p5639e.C72234a;
import org.p5633c.p5634a.p5639e.C72245b;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.w.a.b */
/* compiled from: PG */
public final class C16895b {

    /* renamed from: a */
    public static final C59071e f49395a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.w.a.b");

    /* renamed from: b */
    public static final Duration f49396b = Duration.ofHours(24);

    /* renamed from: c */
    public static final C72245b f49397c;

    /* renamed from: d */
    public final C60950i f49398d;

    static {
        C72245b g = C72234a.m106517a("EEE, dd MMM yyyy HH:mm:ss 'GMT'").mo63601g(C72288l.f192416b);
        Locale locale = Locale.US;
        Locale locale2 = g.f192233c;
        if (locale != locale2 && (locale == null || !locale.equals(locale2))) {
            g = new C72245b(g.f192231a, g.f192232b, locale, g.f192234d, g.f192235e);
        }
        f49397c = g;
    }

    public C16895b(C60950i iVar) {
        this.f49398d = iVar;
    }

    /* renamed from: a */
    public static String m33901a(String str) {
        if (str == null) {
            return BuildConfig.FLAVOR;
        }
        for (String str2 : C58869cf.m90937c(C58837ba.m90854c(";\\s")).mo56153g(str)) {
            int indexOf = str2.indexOf(61);
            if (indexOf > 0 && indexOf != str2.length() - 1 && str2.substring(0, indexOf).equals("NID")) {
                return str2.substring(indexOf + 1);
            }
        }
        return BuildConfig.FLAVOR;
    }
}
