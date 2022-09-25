package com.google.android.apps.gsa.staticplugins.opa.webview.p8604b;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.location.C74637ae;
import com.google.android.apps.gsa.search.core.C85757cq;
import com.google.android.apps.gsa.search.core.google.C85881bd;
import com.google.android.apps.gsa.search.core.google.C85975du;
import com.google.android.apps.gsa.search.core.google.C86074p;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.p7066m.C90062dn;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import dagger.C68214a;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.b.a */
/* compiled from: PG */
public final class C114213a {

    /* renamed from: a */
    public final C85757cq f316702a;

    /* renamed from: b */
    private final C86074p f316703b;

    /* renamed from: c */
    private final C74637ae f316704c;

    /* renamed from: d */
    private final C85881bd f316705d;

    /* renamed from: e */
    private final C86124t f316706e;

    /* renamed from: f */
    private final C68214a f316707f;

    public C114213a(C86074p pVar, C85757cq cqVar, C74637ae aeVar, C85881bd bdVar, C86124t tVar, C68214a aVar) {
        this.f316703b = pVar;
        this.f316702a = cqVar;
        this.f316704c = aeVar;
        this.f316705d = bdVar;
        this.f316706e = tVar;
        this.f316707f = aVar;
    }

    /* renamed from: c */
    public static boolean m189477c(String str) {
        return "https".equals(Uri.parse(str).getScheme());
    }

    /* renamed from: a */
    public final String mo101262a(String str, String str2, int i, Bundle bundle) {
        C58485gu c = this.f316706e.mo79745c(C90062dn.f249217p);
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("hl", Locale.getDefault().toLanguageTag());
        if (i != 0) {
            buildUpon.appendQueryParameter("config", Integer.toString(i));
        }
        if (!TextUtils.isEmpty(str2)) {
            buildUpon.appendQueryParameter("sc", str2);
        }
        if (c.contains("vme")) {
            buildUpon.appendQueryParameter("vme", String.valueOf(((C92486a) this.f316707f.mo27525b()).mo87249w()));
        }
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                String string = bundle.getString(str3);
                if (string != null && !TextUtils.isEmpty(string)) {
                    buildUpon.appendQueryParameter(str3, string);
                }
            }
        }
        return buildUpon.toString();
    }

    /* renamed from: b */
    public final Map mo101263b() {
        String str;
        if (!this.f316705d.mo79513d(false) || !this.f316706e.mo79746e(C90062dn.f249212k)) {
            str = BuildConfig.FLAVOR;
        } else {
            C85975du duVar = new C85975du();
            duVar.f232481a = this.f316704c.mo71018a();
            str = duVar.mo79631a();
        }
        C58495hd n = !TextUtils.isEmpty(str) ? C58495hd.m89900n("X-Geo", str) : null;
        Uri parse = Uri.parse(BuildConfig.FLAVOR);
        C86074p pVar = this.f316703b;
        return new UriRequest(parse, n, C58495hd.m89900n("X-Client-Data", pVar.mo79713a(true, pVar.mo79714b()).toByteArray()), (byte[]) null).mo81502a();
    }
}
