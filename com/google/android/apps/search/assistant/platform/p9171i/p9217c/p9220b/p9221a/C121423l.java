package com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9221a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.i.c.b.a.l */
/* compiled from: PG */
public final /* synthetic */ class C121423l implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C121424m f337075a;

    public /* synthetic */ C121423l(C121424m mVar) {
        this.f337075a = mVar;
    }

    public final void accept(Object obj) {
        C121424m mVar = this.f337075a;
        C121422k kVar = (C121422k) obj;
        if (mVar.f337076a.containsKey(kVar.mo105131b())) {
            C59104x d = C121425n.f337077a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TapasTruncator");
            ((C59052c) ((C59052c) d).mo56372aa(35833)).mo56389s("Found duplicate max for key [%s]", kVar.mo105131b());
        }
        mVar.f337076a.put(kVar.mo105131b(), kVar.mo105130a());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
