package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106551f;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8218e.C106547a;
import com.google.common.base.C58832aw;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.m */
/* compiled from: PG */
public final /* synthetic */ class C106539m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C106544r f297089a;

    /* renamed from: b */
    public final /* synthetic */ C106551f f297090b;

    public /* synthetic */ C106539m(C106544r rVar, C106551f fVar) {
        this.f297089a = rVar;
        this.f297090b = fVar;
    }

    public final C60870cx apply(Object obj) {
        C106544r rVar = this.f297089a;
        C106551f fVar = this.f297090b;
        Optional optional = (Optional) obj;
        if (optional == null || optional.isEmpty()) {
            ((C58970a) ((C58970a) rVar.f297097a.mo56224b()).mo56372aa(23115)).mo56386p("HeadsetState: Ignore empty state");
        } else {
            C106532f fVar2 = (C106532f) optional.get();
            ((C58970a) ((C58970a) rVar.f297097a.mo56224b()).mo56372aa(23116)).mo56389s("HeadsetState: Got state %s", fVar2);
            if (C58832aw.m90831a(rVar.f297109m, fVar2)) {
                ((C58970a) ((C58970a) rVar.f297097a.mo56224b()).mo56372aa(23118)).mo56386p("HeadsetState: Not sending state because it was the same as the last one.");
            } else {
                rVar.f297109m = fVar2;
                C106529c a = C106529c.m177304a(fVar2.f297081b);
                if (a == null) {
                    a = C106529c.UNSPECIFIED;
                }
                if (a.equals(C106529c.CONNECTED)) {
                    ((C58970a) ((C58970a) rVar.f297097a.mo56224b()).mo56372aa(23117)).mo56386p("__SmartspaceMedia__Stage_1/9: Headphone connected event detected");
                }
                return ((C106547a) fVar).f297123a.mo95579e(fVar2);
            }
        }
        return C118826c.f331423b;
    }
}
