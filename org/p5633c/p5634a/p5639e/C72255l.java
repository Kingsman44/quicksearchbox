package org.p5633c.p5634a.p5639e;

import com.evernote.android.state.BuildConfig;
import java.util.Locale;
import java.util.Set;
import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72151ai;
import org.p5633c.p5634a.C72288l;

/* renamed from: org.c.a.e.l */
/* compiled from: PG */
enum C72255l implements C72265v, C72261r {
    ;
    

    /* renamed from: b */
    static final Set f192255b = null;

    /* renamed from: c */
    static final int f192256c = 0;

    static {
        int i;
        Set<String> set = C72288l.f192417c;
        f192255b = set;
        for (String length : set) {
            i = Math.max(i, length.length());
        }
        f192256c = i;
    }

    private C72255l() {
    }

    /* renamed from: a */
    public final int mo63604a() {
        return f192256c;
    }

    /* renamed from: b */
    public final int mo63605b() {
        return f192256c;
    }

    /* renamed from: c */
    public final int mo63606c(C72264u uVar, String str, int i) {
        String substring = str.substring(i);
        String str2 = null;
        for (String str3 : f192255b) {
            if (substring.startsWith(str3) && (str2 == null || str3.length() > str2.length())) {
                str2 = str3;
            }
        }
        if (str2 == null) {
            return i ^ -1;
        }
        C72288l m = C72288l.m106786m(str2);
        uVar.f192285h = null;
        uVar.f192279b = m;
        return i + str2.length();
    }

    /* renamed from: d */
    public final void mo63607d(StringBuffer stringBuffer, C72151ai aiVar, Locale locale) {
    }

    /* renamed from: e */
    public final void mo63608e(StringBuffer stringBuffer, long j, C72132a aVar, int i, C72288l lVar, Locale locale) {
        stringBuffer.append(lVar != null ? lVar.f192423d : BuildConfig.FLAVOR);
    }
}
