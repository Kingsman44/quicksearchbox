package com.google.android.apps.gsa.assistant.settings.features.p554ak;

import android.os.Bundle;
import android.preference.Preference;
import com.google.android.apps.gsa.assistant.settings.base.C9504g;
import com.google.android.apps.gsa.assistant.settings.shared.DescriptionPreferenceCategory;
import com.google.android.apps.gsa.assistant.settings.shared.phone.C73761c;
import com.google.android.apps.gsa.assistant.settings.shared.phone.PhoneNumberPreference;
import com.google.android.apps.gsa.assistant.settings.shared.phone.l;
import com.google.android.apps.gsa.staticplugins.p7815dk.C99639m;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C49869c;
import com.google.assistant.p3861at.C49896d;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Iterator;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ak.c */
/* compiled from: PG */
public final class C10171c extends C9504g implements Preference.OnPreferenceChangeListener {

    /* renamed from: i */
    public final C69464a f34575i;

    /* renamed from: j */
    public final l f34576j = new l(this, new C73761c());

    /* renamed from: k */
    public androidx.preference.Preference f34577k;

    /* renamed from: l */
    PhoneNumberPreference f34578l;

    public C10171c(C69464a aVar) {
        this.f34575i = aVar;
    }

    /* renamed from: o */
    public final void mo17804o(Bundle bundle) {
        this.f34578l = mo17792e().mo8382l(mo17795g(R.string.assistant_settings_personal_info_phone_number_title));
        if (this.f34576j != null) {
            DescriptionPreferenceCategory descriptionPreferenceCategory = new DescriptionPreferenceCategory(mo17792e().f12738j);
            descriptionPreferenceCategory.mo8346M(R.string.assistant_settings_phone_number_header);
            mo17792e().mo8379af(descriptionPreferenceCategory);
            androidx.preference.Preference preference = new androidx.preference.Preference(mo17792e().f12738j);
            this.f34577k = preference;
            preference.mo8346M(R.string.assistant_settings_voice_video_header);
            this.f34577k.mo8339F(true);
            androidx.preference.Preference preference2 = this.f34577k;
            preference2.f12719E = R.layout.preference_widget_next;
            preference2.f12743o = new C10168a(this);
            l lVar = this.f34576j;
            lVar.getClass();
            PhoneNumberPreference phoneNumberPreference = this.f34578l;
            phoneNumberPreference.getClass();
            lVar.a(phoneNumberPreference);
        }
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        return false;
    }

    /* renamed from: q */
    public final void mo17806q() {
    }

    /* renamed from: s */
    public final void mo17808s() {
        if (this.f34576j != null) {
            acu acu = (acu) acv.f128920X.createBuilder();
            acu.copyOnWrite();
            acv acv = (acv) acu.instance;
            acv.f128945a |= 128;
            acv.f128952h = true;
            C49869c cVar = (C49869c) C49896d.f129700c.createBuilder();
            cVar.copyOnWrite();
            C49896d dVar = (C49896d) cVar.instance;
            dVar.f129702a |= 2;
            dVar.f129703b = true;
            C49896d dVar2 = (C49896d) cVar.build();
            acu.copyOnWrite();
            acv acv2 = (acv) acu.instance;
            dVar2.getClass();
            acv2.f128953i = dVar2;
            acv2.f128945a |= 256;
            mo17813x(acu, new C10170b(this), false);
        }
    }

    /* renamed from: v */
    public final void mo17811v() {
        C58976aa aaVar = C58975e.f156826a;
        Iterator it = this.f32990f.entrySet().iterator();
        while (it.hasNext()) {
            ((C99639m) ((Map.Entry) it.next()).getValue()).mo91529a();
            it.remove();
        }
    }
}
