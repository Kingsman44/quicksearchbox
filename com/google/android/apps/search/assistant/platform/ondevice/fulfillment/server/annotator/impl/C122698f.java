package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.p9283a.C122594e;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123033c;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60887da;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.f */
/* compiled from: PG */
public final /* synthetic */ class C122698f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C122699g f339959a;

    public /* synthetic */ C122698f(C122699g gVar) {
        this.f339959a = gVar;
    }

    public final Object apply(Object obj) {
        C122699g gVar = this.f339959a;
        C58485gu guVar = (C58485gu) Collection.EL.stream((List) obj).flatMap(C122696d.f339957a).collect(C58370cn.f155946a);
        C122709q qVar = gVar.f339961b;
        String str = gVar.f339963d;
        C123033c cVar = gVar.f339962c;
        boolean z = gVar.f339965f.f339910a;
        boolean z2 = gVar.f339966g.f339939a;
        boolean z3 = gVar.f339964e;
        guVar.getClass();
        cVar.getClass();
        C60950i iVar = (C60950i) qVar.f339989a.mo17428b();
        iVar.getClass();
        ((C122594e) qVar.f339990b.mo17428b()).getClass();
        C60887da daVar = (C60887da) qVar.f339991c.mo17428b();
        daVar.getClass();
        TextAnnotatorImpl textAnnotatorImpl = new TextAnnotatorImpl(guVar, str, cVar, z, z2, z3, iVar, daVar);
        Collection.EL.forEach(textAnnotatorImpl.f339790c, new C122705m(textAnnotatorImpl));
        return textAnnotatorImpl;
    }
}
