package com.google.android.apps.gsa.assistant.settings.features.p548ah;

import com.google.android.apps.gsa.assistant.settings.base.C9506h;
import com.google.android.apps.gsa.assistant.settings.shared.CustomPreferenceCategory;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C50323sv;
import com.google.assistant.p3861at.C50324sw;
import com.google.assistant.p3861at.C50325sx;
import com.google.assistant.p3861at.C50327sz;
import com.google.assistant.p3861at.C50329ta;
import com.google.assistant.p3861at.act;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ah.s */
/* compiled from: PG */
final class C10082s extends C9506h {

    /* renamed from: a */
    final /* synthetic */ C10064ab f34355a;

    public C10082s(C10064ab abVar) {
        this.f34355a = abVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17818b(Object obj) {
        act act = (act) obj;
        if ((act.f128895b & 2) != 0) {
            C10064ab abVar = this.f34355a;
            C50324sw swVar = act.f128875B;
            if (swVar == null) {
                swVar = C50324sw.f130974d;
            }
            abVar.f34317o = swVar;
            C10064ab abVar2 = this.f34355a;
            C50324sw swVar2 = abVar2.f34317o;
            abVar2.mo17792e().mo8376ac();
            abVar2.mo17792e().mo8379af(abVar2.mo18215F(R.string.notes_lists_main_title, R.string.notes_lists_main_summary, R.string.notes_lists_main_tappable_link, swVar2.f130978c, abVar2.f34312j.mo79746e(C90059dk.f249124bh), false, false));
            abVar2.f34315m = abVar2.mo18215F(R.string.notes_lists_category_title_v2, R.string.notes_lists_category_summary_v2, R.string.notes_lists_category_tappable_link, abVar2.mo17795g(R.string.notes_lists_category_url), false, true, true);
            abVar2.mo17792e().mo8379af(abVar2.f34315m);
            C50323sv svVar = swVar2.f130976a;
            if (svVar == null) {
                svVar = C50323sv.f130971b;
            }
            abVar2.mo18217H(svVar.f130973a, abVar2.f34315m, "assistant_notes_lists_provider_", "assistant_notes_lists_no_preference", false);
            if (abVar2.f34312j.mo79746e(C90059dk.f249128bl)) {
                CustomPreferenceCategory customPreferenceCategory = new CustomPreferenceCategory(abVar2.mo17792e().f12738j);
                customPreferenceCategory.f12718D = R.layout.notes_and_lists_title_preference_category;
                customPreferenceCategory.mo65205ak(R.dimen.assistant_settings_preference_category_small_padding);
                customPreferenceCategory.mo8346M(R.string.shopping_list_category_title_v2);
                customPreferenceCategory.mo8345L(R.string.shopping_list_category_summary_v2);
                abVar2.f34316n = customPreferenceCategory;
                abVar2.mo17792e().mo8379af(abVar2.f34316n);
                C50323sv svVar2 = swVar2.f130977b;
                if (svVar2 == null) {
                    svVar2 = C50323sv.f130971b;
                }
                abVar2.mo18217H(svVar2.f130973a, abVar2.f34316n, "assistant_shopping_provider_", "assistant_shopping_no_preference", abVar2.f34312j.mo79746e(C90059dk.f249125bi));
            }
            abVar2.f34311i.d("notes_lists", abVar2.mo17792e());
            C50323sv svVar3 = this.f34355a.f34317o.f130976a;
            if (svVar3 == null) {
                svVar3 = C50323sv.f130971b;
            }
            for (C50329ta taVar : svVar3.f130973a) {
                C10064ab abVar3 = this.f34355a;
                int i = taVar.f130985c;
                int a = C50327sz.m85810a(i);
                if (a != 0 && a == 4 && !taVar.f130988f) {
                    abVar3.mo18216G((C10073j) null, taVar.f130991i, false, (Runnable) null);
                    C50325sx sxVar = (C50325sx) taVar.toBuilder();
                    sxVar.copyOnWrite();
                    C50329ta taVar2 = (C50329ta) sxVar.instance;
                    taVar2.f130985c = 2;
                    taVar2.f130983a |= 2;
                    C50329ta taVar3 = (C50329ta) sxVar.build();
                } else {
                    int a2 = C50327sz.m85810a(i);
                    if (a2 != 0 && a2 == 3 && taVar.f130988f) {
                        abVar3.mo18222M(abVar3.mo18223b("assistant_notes_lists_no_preference"), Long.valueOf(taVar.f130984b), false, new C10083t());
                        C50325sx sxVar2 = (C50325sx) taVar.toBuilder();
                        sxVar2.copyOnWrite();
                        C50329ta taVar4 = (C50329ta) sxVar2.instance;
                        taVar4.f130983a |= 16;
                        taVar4.f130988f = false;
                        C50329ta taVar5 = (C50329ta) sxVar2.build();
                    }
                }
            }
        }
    }
}
