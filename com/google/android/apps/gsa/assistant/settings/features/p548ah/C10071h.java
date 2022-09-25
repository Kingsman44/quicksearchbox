package com.google.android.apps.gsa.assistant.settings.features.p548ah;

import android.app.AlertDialog;
import android.content.DialogInterface;
import androidx.preference.C4023s;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.base.C9504g;
import com.google.android.apps.gsa.assistant.settings.shared.CustomPreferenceCategory;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C50331tc;
import com.google.assistant.p3861at.C50332td;
import com.google.assistant.p3861at.C50333te;
import com.google.assistant.p3861at.C50334tf;
import com.google.assistant.p3861at.C50335tg;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ah.h */
/* compiled from: PG */
public final class C10071h extends C9504g implements C4023s {

    /* renamed from: o */
    private static final C59071e f34323o = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.features.ah.h");

    /* renamed from: i */
    public final h f34324i;

    /* renamed from: j */
    public final C86124t f34325j;

    /* renamed from: k */
    C10061a f34326k;

    /* renamed from: l */
    C10061a f34327l;

    /* renamed from: m */
    public PreferenceCategory f34328m;

    /* renamed from: n */
    public PreferenceCategory f34329n;

    public C10071h(h hVar, C86124t tVar) {
        this.f34324i = hVar;
        this.f34325j = tVar;
    }

    /* renamed from: F */
    public final void mo18225F(C10061a aVar) {
        String str = aVar.f12748t;
        C50332td tdVar = (C50332td) C50335tg.f131004c.createBuilder();
        if ("assistant_notes_lists_no_preference".equals(str)) {
            m24883G(this.f34328m, aVar);
            tdVar.mo53395a(C50334tf.f130998e);
        } else if (str.startsWith("assistant_notes_lists_provider_")) {
            m24883G(this.f34328m, aVar);
            C50333te teVar = (C50333te) C50334tf.f130998e.createBuilder();
            long parseLong = Long.parseLong(str.replaceFirst("assistant_notes_lists_provider_", BuildConfig.FLAVOR));
            teVar.copyOnWrite();
            C50334tf tfVar = (C50334tf) teVar.instance;
            tfVar.f131000a |= 1;
            tfVar.f131001b = parseLong;
            tdVar.copyOnWrite();
            C50335tg tgVar = (C50335tg) tdVar.instance;
            C50334tf tfVar2 = (C50334tf) teVar.build();
            tfVar2.getClass();
            tgVar.mo53397a();
            tgVar.f131006a.add(tfVar2);
        } else if ("assistant_shopping_no_preference".equals(str)) {
            m24883G(this.f34329n, aVar);
            tdVar.mo53396b(C50334tf.f130998e);
        } else if (str.startsWith("assistant_shopping_provider_")) {
            m24883G(this.f34329n, aVar);
            C50333te teVar2 = (C50333te) C50334tf.f130998e.createBuilder();
            long parseLong2 = Long.parseLong(str.replaceFirst("assistant_shopping_provider_", BuildConfig.FLAVOR));
            teVar2.copyOnWrite();
            C50334tf tfVar3 = (C50334tf) teVar2.instance;
            tfVar3.f131000a |= 1;
            tfVar3.f131001b = parseLong2;
            tdVar.copyOnWrite();
            C50335tg tgVar2 = (C50335tg) tdVar.instance;
            C50334tf tfVar4 = (C50334tf) teVar2.build();
            tfVar4.getClass();
            tgVar2.mo53398b();
            tgVar2.f131007b.add(tfVar4);
        } else {
            C59104x d = f34323o.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NotesAndListsController");
            ((C59052c) ((C59052c) d).mo56372aa(1038)).mo56389s("unknown preference key: %s", str);
        }
        acw acw = (acw) acx.f128971H.createBuilder();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        C50335tg tgVar3 = (C50335tg) tdVar.build();
        tgVar3.getClass();
        acx.f129005v = tgVar3;
        acx.f128984a |= 33554432;
        acx acx2 = (acx) acw.build();
        C58976aa aaVar = C58975e.f156826a;
        C50335tg tgVar4 = acx2.f129005v;
        mo17814y(acx2, new C10070g());
    }

    /* renamed from: a */
    public final boolean mo8472a(Preference preference, Object obj) {
        C10061a aVar;
        String str = preference.f12748t;
        if (!((Boolean) obj).booleanValue() || str == null) {
            return false;
        }
        C10061a aVar2 = (C10061a) preference;
        if (aVar2.f12789a) {
            return true;
        }
        if ("assistant_notes_lists_no_preference".equals(str) || str.startsWith("assistant_notes_lists_provider_")) {
            aVar = this.f34326k;
        } else if ("assistant_shopping_no_preference".equals(str) || str.startsWith("assistant_shopping_provider_")) {
            aVar = this.f34327l;
        } else {
            C59104x d = f34323o.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NotesAndListsController");
            ((C59052c) ((C59052c) d).mo56372aa(1037)).mo56389s("unknown preference key: %s", str);
            aVar = null;
        }
        aVar.getClass();
        if ("assistant_notes_lists_no_preference".equals(aVar.f12748t) || "assistant_shopping_no_preference".equals(aVar.f12748t)) {
            mo18225F(aVar2);
        } else {
            new AlertDialog.Builder(mo17794fX()).setMessage(mo17797h(R.string.notes_lists_provider_changed_description, aVar.f12745q)).setTitle(mo17797h(R.string.notes_lists_provider_changed_title, aVar.f12745q)).setPositiveButton(R.string.notes_lists_provider_changed_positive_button, new C10066c(this, aVar2)).setNegativeButton(R.string.notes_lists_provider_changed_negative_button, (DialogInterface.OnClickListener) null).show();
        }
        return false;
    }

    /* renamed from: b */
    public final CustomPreferenceCategory mo18226b(int i, String str) {
        CustomPreferenceCategory customPreferenceCategory = new CustomPreferenceCategory(mo17792e().f12738j);
        customPreferenceCategory.mo65205ak(R.dimen.assistant_settings_preference_category_small_padding);
        customPreferenceCategory.mo8346M(i);
        customPreferenceCategory.mo8343J(str);
        return customPreferenceCategory;
    }

    /* renamed from: u */
    public final void mo17810u() {
        mo17792e().mo8376ac();
        acu acu = (acu) acv.f128920X.createBuilder();
        C50331tc tcVar = C50331tc.f130994c;
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        tcVar.getClass();
        acv.f128930I = tcVar;
        acv.f128946b |= 8192;
        mo17813x(acu, new C10067d(this), false);
    }

    /* renamed from: G */
    private final void m24883G(PreferenceCategory preferenceCategory, C10061a aVar) {
        if (preferenceCategory == this.f34328m) {
            C10061a aVar2 = this.f34326k;
            aVar2.getClass();
            aVar2.mo8391j(false);
            this.f34326k = aVar;
            aVar.mo8391j(true);
        } else if (preferenceCategory == this.f34329n) {
            C10061a aVar3 = this.f34327l;
            aVar3.getClass();
            aVar3.mo8391j(false);
            this.f34327l = aVar;
            aVar.mo8391j(true);
        }
    }
}
