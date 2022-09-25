package com.google.android.apps.gsa.search.core.google;

import android.net.Uri;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p6994ap.C89255a;
import com.google.android.apps.gsa.shared.p7066m.C90117fo;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.util.p7191w.C91144a;
import com.google.common.base.C58838bb;
import com.google.common.base.C58890d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.search.core.google.cq */
/* compiled from: PG */
public final class C85923cq extends C89255a {

    /* renamed from: b */
    private static final C59071e f232306b = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.cq");

    /* renamed from: a */
    public final C86338r f232307a;

    /* renamed from: c */
    private final C86130z f232308c;

    /* renamed from: d */
    private final C86124t f232309d;

    public C85923cq(C86130z zVar, C86124t tVar, C86338r rVar) {
        this.f232308c = zVar;
        this.f232309d = tVar;
        this.f232307a = rVar;
    }

    /* renamed from: k */
    private static Optional m138066k(String str, String str2) {
        if (str.endsWith(str2)) {
            if (str.length() == str2.length()) {
                return Optional.m71637of(BuildConfig.FLAVOR);
            }
            int length = str.length() - str2.length();
            String substring = str.substring(0, length);
            if (str2.charAt(0) == '.') {
                return Optional.m71637of(substring);
            }
            if (str.charAt(length - 1) == '.') {
                return Optional.m71637of(substring.substring(0, substring.length() - 1));
            }
        }
        return Optional.empty();
    }

    /* renamed from: l */
    private static String m138067l(String str) {
        C58838bb.m90868c(!TextUtils.isEmpty(str));
        return str.startsWith(".") ? "www".concat(String.valueOf(str)) : str;
    }

    /* renamed from: m */
    private static String m138068m(String str) {
        C58838bb.m90868c(!TextUtils.isEmpty(str));
        return str.startsWith("www.") ? str.substring(3) : str;
    }

    /* renamed from: a */
    public final String mo79550a() {
        return this.f232309d.mo79758x(C90120fr.f250809aa);
    }

    /* renamed from: b */
    public final String mo79551b() {
        String string = this.f232307a.getString("debug_search_domain_override", (String) null);
        if (!TextUtils.isEmpty(string)) {
            ((C59052c) ((C59052c) f232306b.mo56224b()).mo56372aa(7909)).mo56389s("Using manual override for search domain: %s", string);
            return m138067l(string);
        } else if (TextUtils.isEmpty(BuildConfig.FLAVOR)) {
            return null;
        } else {
            ((C59052c) ((C59052c) f232306b.mo56224b()).mo56372aa(7908)).mo56389s("Using overriden search domain: %s", BuildConfig.FLAVOR);
            return m138067l(BuildConfig.FLAVOR);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo79552c() {
        String str;
        String b = mo79551b();
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        C86130z zVar = this.f232308c;
        String str2 = zVar.f232792a;
        if (str2 == null) {
            str = null;
        } else {
            str = (String) zVar.mo79771l().get(str2);
        }
        if (!TextUtils.isEmpty(str)) {
            return m138067l(str);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo79553d() {
        return this.f232307a.getString("debug_search_scheme_override", (String) null);
    }

    /* renamed from: e */
    public final boolean mo79554e(Uri uri, boolean z) {
        String c;
        String scheme = uri.getScheme();
        if (scheme != null && (C58890d.m90990e(scheme, "https") || C58890d.m90990e(scheme, "http"))) {
            String string = this.f232307a.getString("debug_search_scheme_override", (String) null);
            if ((z && !C58890d.m90990e(scheme, "https") && (string == null || !C58890d.m90990e(scheme, string))) || (c = C58890d.m90988c(uri.getHost())) == null) {
                return false;
            }
            if (!c.equals(mo79550a())) {
                Optional k = m138066k(c, m138068m("www.google.com"));
                if (k.isEmpty()) {
                    k = m138066k(c, m138068m(mo83211i()));
                }
                if (!k.isEmpty() && !Collection.EL.stream(this.f232309d.mo79745c(C90117fo.f250752h)).anyMatch(new C85921co(k)) && !Collection.EL.stream(this.f232309d.mo79745c(C90117fo.f250751g)).anyMatch(new C85922cp(uri))) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo79555f(Uri uri) {
        return C91144a.m148925b(uri, "www.google.com", mo83211i());
    }

    /* renamed from: g */
    public final boolean mo79556g(Uri uri, boolean z, boolean z2) {
        String authority = uri.getAuthority();
        String scheme = uri.getScheme();
        if (z2 && (TextUtils.isEmpty(authority) || TextUtils.isEmpty(scheme))) {
            return false;
        }
        if (TextUtils.isEmpty(authority) && TextUtils.isEmpty(scheme)) {
            return true;
        }
        if (!z && !TextUtils.isEmpty(scheme)) {
            String j = mo83212j();
            String scheme2 = uri.getScheme();
            if (TextUtils.isEmpty(scheme2) || (!scheme2.equals("https") && !scheme2.equals(j))) {
                return false;
            }
        }
        return mo79555f(uri);
    }

    /* renamed from: h */
    public final boolean mo79557h() {
        return mo79551b() != null;
    }
}
