package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e;

import android.content.Context;
import android.content.res.Configuration;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C49959fi;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p440an.p441a.C8837d;
import com.google.p440an.p441a.C8838e;
import com.google.p440an.p441a.C8841h;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.ai */
/* compiled from: PG */
public final class C101935ai {

    /* renamed from: a */
    public static final C59071e f284377a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.ai");

    /* renamed from: b */
    public final Context f284378b;

    /* renamed from: c */
    public final C89994f f284379c;

    /* renamed from: d */
    public final C86124t f284380d;

    /* renamed from: e */
    private final C68214a f284381e;

    /* renamed from: f */
    private final C101860a f284382f;

    public C101935ai(Context context, C68214a aVar, C89994f fVar, C86124t tVar, C101860a aVar2) {
        this.f284378b = context;
        this.f284381e = aVar;
        this.f284379c = fVar;
        this.f284380d = tVar;
        this.f284382f = aVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo92716a(String str, int i) {
        if (this.f284380d.mo79746e(C90082eg.f249877T) && this.f284382f.mo92637b() != null) {
            C49959fi fiVar = this.f284382f.mo92637b().f128887N;
            if (fiVar == null) {
                fiVar = C49959fi.f129877f;
            }
            if (!fiVar.f129880b.isEmpty()) {
                C49959fi fiVar2 = this.f284382f.mo92637b().f128887N;
                if (fiVar2 == null) {
                    fiVar2 = C49959fi.f129877f;
                }
                C62971cq cqVar = fiVar2.f129880b;
                if (i > cqVar.size()) {
                    C59104x d = f284377a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "GHEnrollmentUXHelper");
                    ((C59052c) ((C59052c) d).mo56372aa(20487)).mo56393w("server utterancesCount (%d) should not be greater than enrollmentPhrases' length (%d).", i, cqVar.size());
                    return BuildConfig.FLAVOR;
                } else if (i == cqVar.size()) {
                    return BuildConfig.FLAVOR;
                } else {
                    return (String) cqVar.get(i);
                }
            }
        }
        Context context = this.f284378b;
        String str2 = (String) ((C92486a) this.f284381e.mo27525b()).f258089c.mo79752r(C90082eg.f250014cX).get(str);
        String[] split = str2 != null ? str2.split("/") : null;
        if (split == null) {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            try {
                C8841h a = C8841h.m23466a(str);
                if (a.mo17253c()) {
                    configuration.setLocale(new Locale(a.mo17252b().f30255g, a.f30256h.f30568eV));
                } else {
                    configuration.setLocale(new Locale(a.mo17252b().f30255g));
                }
                split = context.createConfigurationContext(configuration).getResources().getStringArray(R.array.hotword_enrollment_tisid_enrollment_phrases_v2);
            } catch (C8837d | C8838e unused) {
                ((C59052c) ((C59052c) C92486a.f258085a.mo56226d()).mo56372aa(12652)).mo56389s("Invalid locale code: %s", str);
                split = context.getResources().getStringArray(R.array.hotword_enrollment_tisid_enrollment_phrases_v2);
            }
        }
        int length = split.length;
        if (i > length) {
            C59104x d2 = f284377a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "GHEnrollmentUXHelper");
            ((C59052c) ((C59052c) d2).mo56372aa(20486)).mo56393w("utterancesCount (%d) should not be greater than enrollmentPhrases' length (%d).", i, length);
            return BuildConfig.FLAVOR;
        } else if (i == length) {
            return BuildConfig.FLAVOR;
        } else {
            return split[i];
        }
    }

    /* renamed from: b */
    public final String mo92717b(C90584f fVar, String str, int i, int i2) {
        return ((C92486a) this.f284381e.mo27525b()).mo87227A(fVar, str, i, i2);
    }
}
