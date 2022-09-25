package com.google.android.apps.gsa.assistant.settings.features.p548ah;

import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.gsa.assistant.settings.base.C9506h;
import com.google.android.apps.gsa.assistant.settings.shared.DescriptionPreferenceCategory;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C50323sv;
import com.google.assistant.p3861at.C50324sw;
import com.google.assistant.p3861at.C50327sz;
import com.google.assistant.p3861at.C50329ta;
import com.google.assistant.p3861at.act;
import com.google.protobuf.C62971cq;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ah.d */
/* compiled from: PG */
final class C10067d extends C9506h {

    /* renamed from: a */
    final /* synthetic */ C10071h f34320a;

    public C10067d(C10071h hVar) {
        this.f34320a = hVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17818b(Object obj) {
        act act = (act) obj;
        if ((act.f128895b & 2) != 0) {
            C10071h hVar = this.f34320a;
            C50324sw swVar = act.f128875B;
            if (swVar == null) {
                swVar = C50324sw.f130974d;
            }
            hVar.mo17792e().mo8376ac();
            PreferenceScreen e = hVar.mo17792e();
            DescriptionPreferenceCategory descriptionPreferenceCategory = new DescriptionPreferenceCategory(hVar.mo17792e().f12738j);
            descriptionPreferenceCategory.mo65205ak(R.dimen.assistant_settings_preference_category_padding);
            descriptionPreferenceCategory.mo8346M(R.string.notes_lists_title);
            descriptionPreferenceCategory.mo65204aj();
            e.mo8379af(descriptionPreferenceCategory);
            hVar.f34328m = hVar.mo18226b(R.string.notes_lists_category_title, "assistant_notes_lists_section_key");
            hVar.mo17792e().mo8379af(hVar.f34328m);
            C50323sv svVar = swVar.f130976a;
            if (svVar == null) {
                svVar = C50323sv.f130971b;
            }
            C62971cq cqVar = svVar.f130973a;
            PreferenceCategory preferenceCategory = hVar.f34328m;
            Iterator it = cqVar.iterator();
            C10061a aVar = null;
            while (true) {
                int i = 1;
                if (!it.hasNext()) {
                    break;
                }
                C50329ta taVar = (C50329ta) it.next();
                long j = taVar.f130984b;
                String str = taVar.f130987e;
                String str2 = taVar.f130989g;
                String str3 = taVar.f130986d;
                int a = C50327sz.m85810a(taVar.f130985c);
                if (a != 0) {
                    i = a;
                }
                C10061a a2 = C10065b.m24878a(hVar.mo17792e().f12738j);
                a2.mo8347N(str);
                a2.mo8329n(str2);
                a2.mo8343J("assistant_notes_lists_provider_" + j);
                a2.f12742n = hVar;
                hVar.mo17803n(str3, R.drawable.quantum_ic_lists_grey600_24, new C10069f(a2));
                if (i == 5) {
                    a2.mo8361ab();
                    a2.mo8339F(false);
                }
                if (aVar == null && taVar.f130988f) {
                    aVar = a2;
                }
                preferenceCategory.mo8379af(a2);
            }
            C10061a a3 = C10065b.m24878a(hVar.mo17792e().f12738j);
            a3.mo8346M(R.string.notes_lists_none_preference_title);
            a3.mo8345L(R.string.notes_lists_none_preference_summary);
            a3.mo8343J("assistant_notes_lists_no_preference");
            a3.f12742n = hVar;
            hVar.mo17803n((String) null, R.drawable.quantum_ic_sync_disabled_grey600_24, new C10068e(a3));
            preferenceCategory.mo8379af(a3);
            if (aVar == null) {
                aVar = a3;
            }
            aVar.mo8391j(true);
            if (preferenceCategory == hVar.f34328m) {
                hVar.f34326k = aVar;
            } else if (preferenceCategory == hVar.f34329n) {
                hVar.f34327l = aVar;
            }
            if (hVar.f34325j.mo79746e(C90059dk.f249126bj)) {
                hVar.f34329n = hVar.mo18226b(R.string.shopping_list_category_title, "assistant_shopping_section_key");
                hVar.mo17792e().mo8379af(hVar.f34329n);
            }
            hVar.f34324i.d("notes_lists", hVar.mo17792e());
        }
    }
}
