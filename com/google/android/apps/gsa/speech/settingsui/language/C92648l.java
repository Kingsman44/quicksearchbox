package com.google.android.apps.gsa.speech.settingsui.language;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.Preference;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.settingsui.C88994i;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.C91035f;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.p7184t.C91098h;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92515a;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.android.apps.gsa.speech.p7311n.C92541i;
import com.google.android.apps.gsa.speech.utils.C92654a;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p395al.p408c.p414c.p416b.C8513w;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.language.l */
/* compiled from: PG */
public final class C92648l extends C88994i implements C92646j {

    /* renamed from: a */
    public static final C59071e f258615a = C59071e.m91332i("com.google.android.apps.gsa.speech.settingsui.language.l");

    /* renamed from: b */
    public final C89994f f258616b;

    /* renamed from: c */
    public final Context f258617c;

    /* renamed from: d */
    final C91097g f258618d;

    /* renamed from: e */
    public final C92518d f258619e;

    /* renamed from: f */
    public final SharedPreferences f258620f;

    /* renamed from: g */
    public final bm f258621g;

    /* renamed from: h */
    public final C118561t f258622h;

    /* renamed from: i */
    public final C68214a f258623i;

    public C92648l(C89994f fVar, Context context, C92518d dVar, SharedPreferences sharedPreferences, bm bmVar, C118561t tVar, C68214a aVar) {
        this.f258616b = fVar;
        this.f258617c = context;
        this.f258618d = context instanceof C91098h ? ((C91098h) context).mo17775x() : null;
        this.f258620f = sharedPreferences;
        this.f258619e = dVar;
        this.f258621g = bmVar;
        this.f258622h = tVar;
        this.f258623i = aVar;
    }

    /* renamed from: a */
    public final void mo87415a(LanguagePreference languagePreference) {
        String str;
        String str2;
        Context context = languagePreference.getContext();
        C89994f fVar = this.f258616b;
        C8513w a = ((C92541i) this.f258623i.mo27525b()).mo87316a();
        String ae = fVar.mo83885ae();
        String e = C92654a.m152608e(a, ae);
        if (e == null) {
            str = null;
        } else {
            str = C91035f.m148707c(e, ae, context.getResources().getConfiguration().locale.toString());
        }
        List<String> aj = fVar.mo83890aj();
        ArrayList e2 = C58597ky.m90214e(aj.size());
        String locale = context.getResources().getConfiguration().locale.toString();
        for (String str3 : aj) {
            String e3 = C92654a.m152608e(a, str3);
            if (!TextUtils.isEmpty(e3)) {
                e2.add(C91035f.m148707c(e3, str3, locale));
            }
        }
        if (fVar.mo83871aH()) {
            if (aj.isEmpty()) {
                str2 = context.getString(R.string.pref_default_expanded_no_additional, new Object[]{str});
            } else {
                str2 = context.getString(R.string.pref_default_expanded_additional, new Object[]{str, new C58827ar(", ").mo56097d(e2)});
            }
        } else if (aj.isEmpty()) {
            str2 = context.getString(R.string.pref_expanded_no_additional, new Object[]{str});
        } else {
            str2 = context.getString(R.string.pref_expanded_additional, new Object[]{str, new C58827ar(", ").mo56097d(e2)});
        }
        languagePreference.setSummary(str2);
        languagePreference.setTitle(languagePreference.getContext().getString(R.string.prefDialogTitle_multiLanguage));
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        LanguagePreference languagePreference = (LanguagePreference) preference;
        languagePreference.f258591c = this;
        languagePreference.f258595g = this.f258620f.getString("selected_search_country_code", BuildConfig.FLAVOR);
        mo87415a(languagePreference);
    }

    /* renamed from: g */
    public final void mo82945g() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: i */
    public final void mo82947i() {
        C58976aa aaVar = C58975e.f156826a;
        C92518d dVar = this.f258619e;
        if (dVar != null) {
            dVar.mo87273a((C92515a) null);
        }
    }

    /* renamed from: j */
    public final void mo82948j() {
        C58976aa aaVar = C58975e.f156826a;
        C92518d dVar = this.f258619e;
        if (dVar != null) {
            dVar.mo87274b();
        }
    }
}
