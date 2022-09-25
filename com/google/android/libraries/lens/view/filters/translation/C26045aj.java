package com.google.android.libraries.lens.view.filters.translation;

import com.google.android.libraries.lens.view.utils.C28136y;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.aj */
/* compiled from: PG */
final class C26045aj implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C26059ax f70767a;

    public C26045aj(C26059ax axVar) {
        this.f70767a = axVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C26059ax axVar = this.f70767a;
        axVar.f70795I = true;
        axVar.mo31263r(axVar.mo31248c(), this.f70767a.mo31249d());
        ((C58970a) ((C58970a) ((C58970a) C26059ax.f70786c.mo56226d()).mo56382g(th)).mo56372aa(49371)).mo56386p("Failed while retrieving language preferences.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        List list = (List) obj;
        Locale locale = C26059ax.f70784a;
        this.f70767a.f70795I = true;
        if (list.isEmpty() || C28136y.m52431b(this.f70767a.mo31248c()).equals(list.get(0))) {
            C26059ax axVar = this.f70767a;
            axVar.mo31263r(axVar.mo31248c(), this.f70767a.mo31249d());
            return;
        }
        list.get(0);
        C26059ax axVar2 = this.f70767a;
        axVar2.mo31263r(axVar2.mo31248c(), Locale.forLanguageTag((String) list.get(0)));
    }
}
