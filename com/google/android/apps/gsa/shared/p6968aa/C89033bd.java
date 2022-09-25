package com.google.android.apps.gsa.shared.p6968aa;

import android.text.TextUtils;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.common.base.C58832aw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.shared.aa.bd */
/* compiled from: PG */
public final class C89033bd implements Serializable {

    /* renamed from: a */
    static final Pattern f241304a = Pattern.compile("text/html|(text|application)/javascript|(x-)?application/json|application/(x-protobuffer|protobuf)");

    /* renamed from: d */
    private static final C59071e f241305d = C59071e.m91332i("com.google.android.apps.gsa.shared.aa.bd");

    /* renamed from: e */
    private static final Charset f241306e = C90772bp.f253863a;
    public static final long serialVersionUID = 1;

    /* renamed from: b */
    public final String f241307b;

    /* renamed from: c */
    public final String f241308c;

    public C89033bd(String str, String str2) {
        this.f241307b = str;
        this.f241308c = str2;
    }

    /* renamed from: a */
    public static C89033bd m144788a(String str) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(";");
        if (split.length > 0) {
            str3 = split[0].trim();
            if (TextUtils.isEmpty(str3)) {
                C59104x d = f241305d.mo56226d();
                d.mo56378ag(C58975e.f156826a, "MimeTypeAndCharSet");
                ((C59052c) ((C59052c) d).mo56372aa(10646)).mo56389s("Empty MIME type from: %s", str);
                str3 = null;
            } else if (!f241304a.matcher(str3).matches()) {
                C59104x d2 = f241305d.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "MimeTypeAndCharSet");
                ((C59052c) ((C59052c) d2).mo56372aa(10645)).mo56389s("Unexpected MIME type: %s", str3);
            }
            str2 = null;
            for (int i = 1; i < split.length; i++) {
                String trim = split[i].trim();
                if ("charset=".equalsIgnoreCase(trim.substring(0, 8))) {
                    str2 = trim.substring(8);
                    if (!"UTF-8".equals(str2)) {
                        C59104x d3 = f241305d.mo56226d();
                        d3.mo56378ag(C58975e.f156826a, "MimeTypeAndCharSet");
                        ((C59052c) ((C59052c) d3).mo56372aa(10644)).mo56389s("Unexpected encoding: %s", str2);
                    }
                } else {
                    C59104x d4 = f241305d.mo56226d();
                    d4.mo56378ag(C58975e.f156826a, "MimeTypeAndCharSet");
                    ((C59052c) ((C59052c) d4).mo56372aa(10643)).mo56389s("Unexpected parameter: %s", trim);
                }
            }
        } else {
            str3 = null;
            str2 = null;
        }
        if (str3 != null || str2 != null) {
            return new C89033bd(str3, str2);
        }
        C59104x d5 = f241305d.mo56226d();
        d5.mo56378ag(C58975e.f156826a, "MimeTypeAndCharSet");
        ((C59052c) ((C59052c) d5).mo56372aa(10642)).mo56389s("Empty charset and mime-type from: %s", str);
        return null;
    }

    /* renamed from: b */
    public static Charset m144789b(String str) {
        if (str == null) {
            return f241306e;
        }
        C58976aa aaVar = C58975e.f156826a;
        int indexOf = str.toLowerCase(Locale.US).indexOf("charset=");
        if (indexOf < 0) {
            return f241306e;
        }
        int indexOf2 = str.indexOf(59, indexOf);
        if (indexOf2 < 0) {
            indexOf2 = str.length();
        }
        return m144790c(str.substring(indexOf + 8, indexOf2).trim());
    }

    /* renamed from: c */
    private static Charset m144790c(String str) {
        if (str == null) {
            return f241306e;
        }
        try {
            if (Charset.isSupported(str)) {
                return Charset.forName(str);
            }
            C59104x d = f241305d.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MimeTypeAndCharSet");
            ((C59052c) ((C59052c) d).mo56372aa(10647)).mo56389s("Unsupported charset: %s", str);
            return f241306e;
        } catch (IllegalCharsetNameException unused) {
            C59104x d2 = f241305d.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "MimeTypeAndCharSet");
            ((C59052c) ((C59052c) d2).mo56372aa(10648)).mo56389s("Illegal charset name: %s", str);
            return f241306e;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C89033bd) {
            C89033bd bdVar = (C89033bd) obj;
            if (!C58832aw.m90831a(this.f241307b, bdVar.f241307b) || !C58832aw.m90831a(this.f241308c, bdVar.f241308c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        return String.format("{mimeType=%s, charset=%s}", new Object[]{this.f241307b, this.f241308c});
    }
}
