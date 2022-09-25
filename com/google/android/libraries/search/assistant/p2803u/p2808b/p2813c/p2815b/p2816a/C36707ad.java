package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a;

import com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.C36680d;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.p2811b.C36678f;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2812b.C36683c;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.assistant.p3861at.C50358uc;
import com.google.assistant.p3861at.C50359ud;
import com.google.assistant.p3861at.C50362ug;
import com.google.assistant.p3861at.ado;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4184bj.p4193c.p4201f.C56002b;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62971cq;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.ad */
/* compiled from: PG */
final class C36707ad implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C36704ac f95626a;

    public C36707ad(C36704ac acVar) {
        this.f95626a = acVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        String str;
        C36683c cVar = (C36683c) bVar;
        C36704ac acVar = this.f95626a;
        C58976aa aaVar = C58975e.f156826a;
        int b = cVar.mo40318b();
        Optional a = cVar.mo40317a();
        if (a.isPresent()) {
            C56002b bVar2 = (C56002b) a.get();
            C36680d dVar = acVar.f95617i;
            bVar2.name();
            int ordinal = bVar2.ordinal();
            if (ordinal == 5) {
                str = "multi_consent_waa_screen_interaction_count_key";
            } else if (ordinal == 11) {
                str = "multi_consent_da_screen_interaction_count_key";
            } else if (ordinal == 12) {
                str = "multi_consent_dc_screen_interaction_count_key";
            } else {
                throw new IllegalArgumentException("Unknown screen settingSetId: %s".concat(String.valueOf(bVar2.name())));
            }
            C60870cx b2 = dVar.mo40316b(str);
            C46439e eVar = acVar.f95618j;
            C46438d b3 = C46438d.m82810b(b2);
            eVar.mo50428h(b3.f121541a, (Object) null, acVar.f95620l);
            if (acVar.f95622n.isPresent()) {
                C36734j jVar = (C36734j) acVar.f95622n.get();
                C50362ug ugVar = jVar.f95718b;
                if (ugVar == null) {
                    ugVar = C50362ug.f131096h;
                }
                C62971cq cqVar = ugVar.f131101d;
                int i = 0;
                while (true) {
                    if (i >= cqVar.size()) {
                        break;
                    }
                    C50362ug ugVar2 = jVar.f95718b;
                    if (ugVar2 == null) {
                        ugVar2 = C50362ug.f131096h;
                    }
                    C50358uc ucVar = ((C50359ud) ugVar2.f131101d.get(i)).f131083b;
                    if (ucVar == null) {
                        ucVar = C50358uc.f131066m;
                    }
                    C56002b a2 = C56002b.m87880a(((ado) ucVar.f131078k.get(0)).f129053b);
                    if (a2 == null) {
                        a2 = C56002b.UNKNOWN_SETTING_SET_ID;
                    }
                    if (a2.equals(bVar2)) {
                        acVar.f95624p = i + 1;
                        break;
                    }
                    i++;
                }
                int i2 = acVar.f95624p;
                C50362ug ugVar3 = jVar.f95718b;
                if (ugVar3 == null) {
                    ugVar3 = C50362ug.f131096h;
                }
                if (i2 >= ugVar3.f131101d.size() || new C62963cj(jVar.f95722f, C36734j.f95714g).isEmpty()) {
                    C58480gp e = C58485gu.m89837e();
                    C60870cx b4 = acVar.f95613e.mo40333b(false);
                    C60870cx b5 = acVar.f95617i.mo40316b("udc_consent_screen_interaction_count_key");
                    e.mo55395g(b4);
                    e.mo55395g(b5);
                    C60870cx a3 = C36678f.m65268a(e.mo55394f());
                    C46439e eVar2 = acVar.f95618j;
                    C46438d b6 = C46438d.m82810b(a3);
                    eVar2.mo50428h(b6.f121541a, (Object) null, acVar.f95621m);
                }
            }
        }
        acVar.mo40338b(b);
        return C47392e.f123115a;
    }
}
