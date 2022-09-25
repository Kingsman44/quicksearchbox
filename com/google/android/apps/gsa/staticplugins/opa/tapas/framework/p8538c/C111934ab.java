package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113189ct;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113404eo;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.ab */
/* compiled from: PG */
public final /* synthetic */ class C111934ab implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111943ak f310968a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f310969b;

    public /* synthetic */ C111934ab(C111943ak akVar, C113405ep epVar) {
        this.f310968a = akVar;
        this.f310969b = epVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C111943ak akVar = this.f310968a;
        C113405ep epVar = this.f310969b;
        C58485gu guVar = (C58485gu) obj;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C121537f fVar = C111943ak.f310986b;
            C111971bl blVar = akVar.f310989e;
            C113404eo b = akVar.f310992h.mo99904b((String) guVar.get(i), epVar.mo100022f(), epVar.mo100023g(), epVar.mo100024h());
            Optional n = epVar.mo100031n();
            Objects.requireNonNull(b);
            n.ifPresent(new C113189ct(b));
            C60870cx e = blVar.mo99325e(b.mo100001a());
            fVar.mo105244m("prefetch", e);
            akVar.mo99305b(e);
        }
        return C118826c.f331422a;
    }
}
