package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import androidx.viewpager.widget.C4281n;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7148ui.TouchInterceptingFrameLayout;
import com.google.android.apps.gsa.staticplugins.opa.experience.C109024k;
import com.google.android.libraries.logging.C28285c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.an */
/* compiled from: PG */
final class C110328an extends C4281n {

    /* renamed from: a */
    final /* synthetic */ TouchInterceptingFrameLayout f307493a;

    /* renamed from: b */
    final /* synthetic */ C110332ar f307494b;

    public C110328an(C110332ar arVar, TouchInterceptingFrameLayout touchInterceptingFrameLayout) {
        this.f307494b = arVar;
        this.f307493a = touchInterceptingFrameLayout;
    }

    /* renamed from: a */
    public final void mo9182a(int i) {
        if (i == 0) {
            C58976aa aaVar = C58975e.f156826a;
            C110332ar arVar = this.f307494b;
            arVar.f307506a.mo98605c(arVar.f307521p);
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        this.f307494b.f307506a.mo98603a();
    }

    /* renamed from: e */
    public final void mo9184e(int i) {
        C109024k kVar = this.f307494b.f307521p;
        List list = (List) kVar.f303165a.mo3842a();
        int size = list != null ? list.size() : 0;
        List list2 = (List) kVar.f303166b.mo3842a();
        boolean z = true;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        }
        int i2 = size - 3;
        if (z && i >= i2) {
            C58976aa aaVar = C58975e.f156826a;
            this.f307494b.f307521p.mo97392a();
        }
        if (!this.f307494b.f307498A) {
            C58976aa aaVar2 = C58975e.f156826a;
            C89949q.m146521e(C28285c.m52882i(this.f307493a, 22, (Integer) null), false);
        }
    }
}
