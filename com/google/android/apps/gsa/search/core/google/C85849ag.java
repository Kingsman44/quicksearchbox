package com.google.android.apps.gsa.search.core.google;

import android.text.TextUtils;
import android.util.JsonWriter;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6513aj.C84533ar;
import com.google.android.apps.gsa.search.core.p6513aj.C84534as;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.apps.gsa.tasks.C118551j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.p10905k.C146606e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.google.ag */
/* compiled from: PG */
public final class C85849ag implements C118549h {

    /* renamed from: a */
    private static final C59071e f232123a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.ag");

    /* renamed from: b */
    private final C85848af f232124b;

    /* renamed from: c */
    private final C86130z f232125c;

    /* renamed from: d */
    private final C86124t f232126d;

    /* renamed from: e */
    private final C86338r f232127e;

    /* renamed from: f */
    private final C86338r f232128f;

    /* renamed from: g */
    private final C89994f f232129g;

    /* renamed from: h */
    private final C84534as f232130h;

    /* renamed from: i */
    private final C68214a f232131i;

    /* renamed from: j */
    private final C68214a f232132j;

    /* renamed from: k */
    private final C39141kp f232133k;

    public C85849ag(C85848af afVar, C86130z zVar, C86124t tVar, C89994f fVar, C84534as asVar, C68214a aVar, C86338r rVar, C86338r rVar2, C68214a aVar2, C39141kp kpVar) {
        this.f232124b = afVar;
        this.f232125c = zVar;
        this.f232126d = tVar;
        this.f232129g = fVar;
        this.f232130h = asVar;
        this.f232131i = aVar;
        this.f232127e = rVar;
        this.f232128f = rVar2;
        this.f232132j = aVar2;
        this.f232133k = kpVar;
    }

    /* renamed from: b */
    public static String m137936b(C85848af afVar, int i) {
        int i2;
        int i3;
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginObject();
            for (Map.Entry entry : C146606e.m238842d(afVar.f232122a, "qsb:").entrySet()) {
                String substring = ((String) entry.getKey()).substring(4);
                int indexOf = substring.indexOf(58);
                if (indexOf >= 0) {
                    String substring2 = substring.substring(0, indexOf);
                    int indexOf2 = substring2.indexOf(44);
                    if (indexOf2 >= 0) {
                        try {
                            i2 = Integer.parseInt(substring2.substring(0, indexOf2));
                            i3 = Integer.parseInt(substring2.substring(indexOf2 + 1));
                        } catch (NumberFormatException e) {
                            ((C59052c) ((C59052c) ((C59052c) f232123a.mo56226d()).mo56382g(e)).mo56372aa(7850)).mo56386p("Error parsing gservices version spec");
                        }
                    } else {
                        i2 = Integer.parseInt(substring2);
                        i3 = i2;
                    }
                    if (i >= i2 && i <= i3) {
                        substring = substring.substring(indexOf + 1);
                    }
                }
                jsonWriter.name(substring).value((String) entry.getValue());
            }
            String[] j = C86130z.m138516j();
            for (int i4 = 0; i4 < 3; i4++) {
                String str = j[i4];
                String c = C146606e.m238841c(afVar.f232122a, str, (String) null);
                if (c != null) {
                    jsonWriter.name(str).value(c);
                }
            }
            jsonWriter.endObject();
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException unused) {
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C59071e eVar = f232123a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(7848)).mo56386p("Updating Gservices keys");
        C86337q b = this.f232127e.mo80076b();
        b.mo80073h("gservices_overrides", m137936b(this.f232124b, ((Integer) this.f232131i.mo27525b()).intValue()));
        b.apply();
        this.f232125c.mo79766f();
        String x = this.f232126d.mo79758x(C90120fr.f250807aT);
        if (!TextUtils.equals(x, this.f232129g.mo83888ah())) {
            ((C118551j) this.f232132j.mo27525b()).mo103747a(C118522by.REFRESH_AUTH_TOKENS);
            this.f232129g.mo83865aB(x);
        }
        if (!this.f232128f.getBoolean(C90507o.f253036z, false)) {
            C84533ar a = this.f232130h.mo78241a();
            a.mo78237c("written", true);
            a.mo78236b();
            C86337q b2 = this.f232128f.mo80076b();
            b2.mo80067b(C90507o.f253036z, true);
            b2.apply();
        } else if (!this.f232130h.mo85406k("written", false)) {
            ((C59052c) ((C59052c) eVar.mo56225c()).mo56372aa(7849)).mo56386p("SyncedStartupPrefs loss detected");
            ((C19567d) this.f232133k.f102939cQ.mo6453a()).mo24822a(1, new Object[0]);
            C84533ar a2 = this.f232130h.mo78241a();
            a2.mo78237c("written", true);
            a2.mo78236b();
        }
        C84533ar a3 = this.f232130h.mo78241a();
        if (!this.f232125c.mo79767g(R.bool.redirect_mfe_requests)) {
            a3.mo78237c("GSAPrefs.redirect_mfe_requests", false);
        } else if (this.f232130h.mo85404i("GSAPrefs.redirect_mfe_requests")) {
            a3.mo78240f("GSAPrefs.redirect_mfe_requests");
        }
        if (this.f232125c.mo79767g(R.bool.hide_dogfood_indicator)) {
            a3.mo78237c("GSAPrefs.hide_dogfood_indicator", true);
        } else {
            a3.mo78240f("GSAPrefs.hide_dogfood_indicator");
        }
        a3.mo78236b();
        return C118826c.f331423b;
    }
}
