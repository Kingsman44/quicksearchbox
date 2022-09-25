package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import androidx.lifecycle.C2333ah;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.gsa.staticplugins.opa.experience.C109024k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.ai */
/* compiled from: PG */
public final /* synthetic */ class C110323ai implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C110332ar f307488a;

    public /* synthetic */ C110323ai(C110332ar arVar) {
        this.f307488a = arVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C110332ar arVar = this.f307488a;
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            C58976aa aaVar = C58975e.f156826a;
            boolean z = true;
            arVar.f307498A = true;
            C110373ce ceVar = arVar.f307506a;
            ViewPager viewPager = arVar.f307522q;
            C109024k kVar = arVar.f307521p;
            int k = viewPager.mo9126b().mo9175k();
            int a = viewPager.mo9122a();
            if (k <= 0 || a >= k - 1) {
                z = false;
            } else {
                viewPager.mo9148m(a + 1, true);
            }
            kVar.f303169e.mo5708l(false);
            if (z) {
                ceVar.mo98605c(kVar);
            }
            arVar.f307498A = false;
        }
    }
}
