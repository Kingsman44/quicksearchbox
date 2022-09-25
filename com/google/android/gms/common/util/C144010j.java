package com.google.android.gms.common.util;

import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p3186j$.net.URLDecoder;

/* renamed from: com.google.android.gms.common.util.j */
/* compiled from: PG */
public final class C144010j {
    static {
        Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
        Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
        Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");
    }

    /* renamed from: a */
    public static Map m234188a(URI uri) {
        Map emptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            emptyMap = new HashMap();
            C58869cf b = C58869cf.m90936b(new C58903m('='));
            for (String i : C58869cf.m90936b(new C58903m('&')).mo56151a().mo56153g(rawQuery)) {
                List i2 = b.mo56155i(i);
                if (i2.isEmpty() || i2.size() > 2) {
                    throw new IllegalArgumentException("bad parameter");
                }
                emptyMap.put(m234189b((String) i2.get(0)), i2.size() == 2 ? m234189b((String) i2.get(1)) : null);
            }
        }
        return emptyMap;
    }

    /* renamed from: b */
    private static String m234189b(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
