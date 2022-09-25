package com.google.common.p4574q;

import com.evernote.android.state.BuildConfig;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.google.common.q.r */
/* compiled from: PG */
public final class C60739r {

    /* renamed from: a */
    public static final Pattern f164760a = Pattern.compile("(?:.*?@)?([^:]+)(?::\\d+)?");

    /* renamed from: a */
    static C60740s m92696a(String str) {
        return C60740s.m92702b(str, C60742u.f164776a);
    }

    /* renamed from: b */
    static C60741t m92697b(Charset charset) {
        return new C60741t(charset);
    }

    /* renamed from: c */
    static C60743v m92698c(C60740s sVar, String str) {
        return C60743v.m92709f(str, sVar.f164767g);
    }

    /* renamed from: d */
    static String m92699d(String str) {
        return str.toLowerCase(Locale.ENGLISH);
    }

    /* renamed from: e */
    static String m92700e(C60743v vVar, Charset charset) {
        charset.getClass();
        StringBuilder sb = new StringBuilder();
        try {
            Iterator it = vVar.mo54948A().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb.append(C60742u.m92708a((String) entry.getKey(), charset));
                if (!BuildConfig.FLAVOR.equals(entry.getValue())) {
                    sb.append('=').append(C60742u.m92708a((String) entry.getValue(), charset));
                }
                if (it.hasNext()) {
                    sb.append('&');
                }
            }
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
