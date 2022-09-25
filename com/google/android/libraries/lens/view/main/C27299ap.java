package com.google.android.libraries.lens.view.main;

import android.graphics.RectF;
import androidx.lifecycle.C2333ah;
import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.android.libraries.lens.view.gleam.C26505cj;
import com.google.android.libraries.lens.view.gleam.region.C26613d;
import com.google.android.libraries.lens.view.gleam.region.C26614e;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26982r;
import com.google.android.libraries.lens.view.p2091bb.C25687a;
import com.google.android.libraries.lens.view.p2091bb.C25688b;
import com.google.android.libraries.lens.view.p2091bb.C25689c;
import com.google.android.libraries.lens.view.p2091bb.C25691e;
import com.google.android.libraries.lens.view.session.C27774bj;
import com.google.android.libraries.lens.view.session.C27777bm;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.lens.view.main.ap */
/* compiled from: PG */
public final /* synthetic */ class C27299ap implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C27327bq f74709a;

    public /* synthetic */ C27299ap(C27327bq bqVar) {
        this.f74709a = bqVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C27327bq bqVar = this.f74709a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C58838bb.m90887v(!bqVar.f74806k || bqVar.f74770P.mo30525b(), "Unexpected UserSelection with imageMode=%s", bqVar.f74770P.name());
            C27777bm bmVar = (C27777bm) axVar.mo56107c();
            if (!(bmVar.mo33256c() == C24231w.MULTIMODAL || bmVar.mo33256c() == C24231w.REGION_SEARCH)) {
                bqVar.f74784ad.mo32443j(C26982r.m50074c());
            }
            if (bqVar.f74806k && bmVar.mo33260h() == 4) {
                if (bmVar.mo33256c() == C24231w.FILTER_SWITCH || bmVar.mo33256c() == C24231w.FILTER_SHUTTER || bmVar.mo33256c() == C24231w.POSTCAPTURE_INJECTED_IMAGE) {
                    RectF a = ((C27774bj) bmVar).mo33280a();
                    C26505cj cjVar = bqVar.f74767M;
                    C26613d f = C26614e.m49159f(a);
                    f.mo31893b(true);
                    cjVar.mo31772h(f.mo31892a());
                    C25691e eVar = bqVar.f74786af;
                    C25687a b = C25688b.m47362b();
                    b.mo30792e(a);
                    ((C25689c) b).f69830b = 4;
                    eVar.mo30810l(b.mo30790c());
                }
            }
        }
    }
}
