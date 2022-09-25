package com.google.android.libraries.lens.view.filters.p2101e;

import android.content.Context;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25979c;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25981e;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25982f;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25985i;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56258bl;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56278ce;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.libraries.lens.view.filters.e.e */
/* compiled from: PG */
public final class C25990e {

    /* renamed from: a */
    private static final C58485gu f70646a = C58485gu.m89852t(C25980d.TRANSLATE, C25980d.TEXT, C25980d.AUTO_FILTER, C25980d.EDUCATION, C25980d.SHOPPING, C25980d.OUTDOOR, C25980d.DINING);

    /* renamed from: a */
    public static C25981e m47983a(Context context) {
        C25979c o = C25981e.m47951o(C25980d.AUTO_FILTER);
        o.mo31174g(context.getString(R.string.lens_search_filter_name));
        o.mo31173f(context.getString(R.string.lens_auto_filter_guidance_message));
        o.mo31170c(context.getString(R.string.lens_auto_filter_guidance_message_filters_in_home));
        o.mo31172e(R.id.filter_item_view_auto);
        o.mo31181n(R.drawable.quantum_ic_search_vd_theme_24);
        o.mo31180m(101612);
        o.mo31171d(144352);
        o.mo31169b(true);
        o.mo31176i(true);
        o.mo31177j(true);
        o.mo31178k(true);
        o.mo31175h(true);
        return o.mo31168a();
    }

    /* renamed from: b */
    static C25985i m47984b() {
        C56258bl blVar = (C56258bl) C56278ce.f149986e.createBuilder();
        C56306df dfVar = C56306df.AUTO_FILTER;
        blVar.copyOnWrite();
        C56278ce ceVar = (C56278ce) blVar.instance;
        ceVar.f149991d = dfVar.f150068m;
        ceVar.f149988a |= 1;
        return new C25982f((C56278ce) blVar.build());
    }

    /* renamed from: c */
    public static C58485gu m47985c(Set set, boolean z) {
        EnumMap enumMap = new EnumMap(C25980d.class);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C25981e eVar = (C25981e) it.next();
            enumMap.put(eVar.mo31185d(), eVar);
        }
        C58838bb.m90883r(enumMap.containsKey(C25980d.AUTO_FILTER));
        C58480gp e = C58485gu.m89837e();
        C58485gu guVar = f70646a;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C25980d dVar = (C25980d) guVar.get(i2);
            if ((dVar != C25980d.DINING || !z) && enumMap.containsKey(dVar)) {
                C25981e eVar2 = (C25981e) enumMap.get(dVar);
                eVar2.getClass();
                e.mo55395g(eVar2);
            }
        }
        return e.mo55394f();
    }
}
