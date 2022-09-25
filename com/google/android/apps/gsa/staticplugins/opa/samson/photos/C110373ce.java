package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.view.animation.DecelerateInterpolator;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.experience.C109024k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.lang.reflect.Field;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.ce */
/* compiled from: PG */
public final class C110373ce {

    /* renamed from: a */
    private static final C59071e f307615a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.photos.ce");

    /* renamed from: b */
    private final C68214a f307616b;

    /* renamed from: c */
    private final C22871g f307617c;

    /* renamed from: d */
    private C60870cx f307618d;

    public C110373ce(C68214a aVar, C22871g gVar) {
        this.f307616b = aVar;
        this.f307617c = gVar;
    }

    /* renamed from: a */
    public final void mo98603a() {
        C60870cx cxVar = this.f307618d;
        if (cxVar != null) {
            cxVar.cancel(true);
        }
    }

    /* renamed from: b */
    public final void mo98604b(ViewPager viewPager) {
        try {
            Field declaredField = ViewPager.class.getDeclaredField(C59002s.f156871a);
            declaredField.setAccessible(true);
            declaredField.set(viewPager, new C110372cd(viewPager.getContext(), new DecelerateInterpolator()));
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException e) {
            C59104x d = f307615a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SlideshowCtrlr");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(25883)).mo56386p("can't replace viewpager scroller");
        }
    }

    /* renamed from: c */
    public final void mo98605c(C109024k kVar) {
        mo98603a();
        this.f307618d = this.f307617c.mo28208h("autoscroll", ((C86124t) this.f307616b.mo27525b()).mo79743a(C90014bt.f247126bK), new C110371cc(kVar));
    }
}
