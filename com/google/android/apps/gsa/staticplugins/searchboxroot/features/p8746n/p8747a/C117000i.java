package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n.p8747a;

import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8724a.C116858g;
import com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8724a.C116859h;
import com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8724a.C116860i;
import com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8724a.C116863l;
import com.google.android.libraries.searchbox.root.C41626a;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.a.i */
/* compiled from: PG */
public final /* synthetic */ class C117000i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C117001j f324801a;

    /* renamed from: b */
    public final /* synthetic */ C41642a f324802b;

    public /* synthetic */ C117000i(C117001j jVar, C41642a aVar) {
        this.f324801a = jVar;
        this.f324802b = aVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C117001j jVar = this.f324801a;
        C41642a aVar = this.f324802b;
        C41626a aVar2 = (C41626a) obj;
        C116863l lVar = jVar.f324804d;
        if (((long) ((C88616t) aVar).f239556a.mo84352bk().length()) < lVar.f324337a.mo79743a(C90085ej.f250148aY)) {
            cxVar = C60856cj.m92900i(aVar2);
        } else {
            C58485gu guVar = (C58485gu) Collection.EL.stream(aVar2.f108836a).filter(C116858g.f324328a).collect(C58370cn.f155946a);
            int a = (int) lVar.f324337a.mo79743a(C90085ej.f250146aW);
            if (a != -1 && guVar.size() > a) {
                cxVar = C60856cj.m92900i(aVar2);
            } else if (lVar.f324337a.mo79746e(C90085ej.f250154ae)) {
                cxVar = lVar.f324341e.mo28210j(lVar.mo103035b(), "fetchOnDeviceAppActions", new C116859h(lVar, aVar2, guVar));
            } else {
                cxVar = lVar.f324341e.mo28210j(lVar.f324340d, "fetch LauncherApps", new C116860i(lVar, aVar2, guVar));
            }
        }
        return C60846c.m92879h(cxVar, Throwable.class, new C116999h(aVar2), C60826bg.f164896a);
    }
}
