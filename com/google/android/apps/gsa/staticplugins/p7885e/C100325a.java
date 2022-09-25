package com.google.android.apps.gsa.staticplugins.p7885e;

import android.content.Context;
import android.icu.text.IDNA;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6919a.C87393a;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58486gv;
import com.google.common.p4522b.C58487gw;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4537i.C59294s;
import com.google.common.p4541l.C59326i;
import java.util.Map;
import p3186j$.nio.charset.StandardCharsets;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.e.a */
/* compiled from: PG */
public final class C100325a {

    /* renamed from: a */
    private static final C59071e f280550a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.e.a");

    /* renamed from: b */
    private static final C58528ij f280551b = C58528ij.m90011K("amp_js_v", "amp_gsa");

    /* renamed from: c */
    private static final C58528ij f280552c = C58528ij.m90012L("referrer", "ampshare", "amp_tf");

    /* renamed from: d */
    private final Context f280553d;

    /* renamed from: e */
    private final C86124t f280554e;

    /* renamed from: f */
    private final C84474e f280555f;

    /* renamed from: g */
    private final C85923cq f280556g;

    /* renamed from: h */
    private final IDNA f280557h = IDNA.getUTS46Instance(4);

    /* renamed from: i */
    private final IDNA f280558i = IDNA.getUTS46Instance(76);

    public C100325a(Context context, C86124t tVar, C84474e eVar, C85923cq cqVar) {
        this.f280553d = context;
        this.f280554e = tVar;
        this.f280555f = eVar;
        this.f280556g = cqVar;
    }

    /* renamed from: d */
    public static final boolean m166296d(String str) {
        return C87393a.f235981a.matcher(str).matches();
    }

    /* renamed from: e */
    private static final String m166297e(String str) {
        C59326i iVar = C59326i.f157518f;
        byte[] e = C59294s.m92135e().mo56759a(str, StandardCharsets.UTF_8).mo56775e();
        return iVar.mo56837l(e, e.length).substring(0, 52).toLowerCase();
    }

    /* renamed from: a */
    public final Uri mo91886a(Uri uri) {
        String str;
        String host = uri.getHost();
        if (this.f280557h == null || this.f280558i == null) {
            ((C59052c) ((C59052c) f280550a.mo56226d()).mo56372aa(13782)).mo56386p("This method is only functional in Android N+.");
            int i = C90755l.f253831a;
            str = BuildConfig.FLAVOR;
        } else {
            IDNA.Info info = new IDNA.Info();
            String sb = this.f280557h.nameToUnicode(host, new StringBuilder(), info).toString();
            if (info.hasErrors()) {
                str = m166297e(host);
            } else {
                StringBuilder sb2 = new StringBuilder();
                for (int i2 = 0; i2 < sb.length(); i2++) {
                    char charAt = sb.charAt(i2);
                    sb2.append(charAt == '.' ? '-' : charAt);
                    if (charAt == '-') {
                        sb2.append('-');
                    }
                }
                IDNA.Info info2 = new IDNA.Info();
                String sb3 = this.f280558i.labelToASCII(sb2, new StringBuilder(), info2).toString();
                if (info2.hasErrors() || !sb3.contains("-")) {
                    if (info2.getErrors().size() == 1 && info2.getErrors().contains(IDNA.Error.HYPHEN_3_4)) {
                        IDNA.Info info3 = new IDNA.Info();
                        String sb4 = this.f280558i.labelToASCII("0-" + sb2 + "-0", new StringBuilder(), info3).toString();
                        if (!info3.hasErrors() && sb4.contains("-")) {
                            str = sb4;
                        }
                    }
                    str = m166297e(host);
                } else {
                    str = sb3;
                }
            }
        }
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority(String.valueOf(str).concat(".cdn.ampproject.org")).appendPath("v");
        if ("https".equals(uri.getScheme())) {
            appendPath.appendPath(C59002s.f156871a);
        }
        appendPath.appendPath(uri.getHost()).appendEncodedPath(uri.getEncodedPath().substring(1)).encodedQuery(uri.getEncodedQuery()).encodedFragment(uri.getEncodedFragment());
        return appendPath.build();
    }

    /* renamed from: b */
    public final Uri mo91887b(Uri uri, C58487gw gwVar) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("amp_js_v=");
        sb.append(Uri.encode(this.f280554e.mo79758x(C90110fh.f250710p)));
        sb.append("&amp_gsa=1");
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery != null) {
            for (String str3 : encodedQuery.split("&", -1)) {
                int indexOf = str3.indexOf(61);
                if (indexOf == -1) {
                    str2 = str3;
                } else {
                    str2 = str3.substring(0, indexOf);
                }
                if (!f280551b.contains(str2)) {
                    sb.append("&");
                    sb.append(str3);
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        String encodedFragment = uri.getEncodedFragment();
        if (encodedFragment != null) {
            for (String str4 : encodedFragment.split("&", -1)) {
                int indexOf2 = str4.indexOf(61);
                if (indexOf2 == -1) {
                    str = str4;
                } else {
                    str = str4.substring(0, indexOf2);
                }
                if (!f280552c.contains(str)) {
                    sb2.append("&");
                    sb2.append(str4);
                }
            }
        }
        sb2.append("&referrer=");
        sb2.append(Uri.encode("https://".concat(String.valueOf(this.f280556g.mo83211i()))));
        sb2.append("&amp_tf=");
        sb2.append(Uri.encode(this.f280553d.getString(R.string.amp_source_header)));
        sb2.deleteCharAt(0);
        if (!this.f280555f.mo78120i().isEmpty()) {
            sb2.append("&amp_agsa_csa=");
            sb2.append(Uri.encode(this.f280555f.mo78120i()));
        }
        C58800sl lA = gwVar.mo54948A().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            sb2.append("&");
            sb2.append((String) entry.getKey());
            sb2.append("=");
            sb2.append(Uri.encode((String) entry.getValue()));
        }
        return uri.buildUpon().encodedQuery(sb.toString()).encodedFragment(sb2.toString()).build();
    }

    /* renamed from: c */
    public final Uri mo91888c(Uri uri, Instant instant) {
        String str;
        C58486gv gvVar = new C58486gv();
        if (this.f280555f.mo78125n()) {
            try {
                str = String.valueOf(instant.toEpochMilli());
            } catch (ArithmeticException e) {
                ((C59052c) ((C59052c) ((C59052c) f280550a.mo56226d()).mo56382g(e)).mo56372aa(13781)).mo56386p("Invalid amp_ct timestamp");
                str = null;
            }
            if (str != null) {
                gvVar.mo55419c("amp_ct", str);
            }
        }
        return mo91887b(uri, gvVar.mo55417a());
    }
}
