package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import com.google.apps.tiktok.dataservice.p3638c.C46748e;
import com.google.assistant.p3861at.C50268qu;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import p3186j$.util.function.IntConsumer;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.bw */
/* compiled from: PG */
public final /* synthetic */ class C9940bw implements IntConsumer {

    /* renamed from: a */
    public final /* synthetic */ C9941bx f34065a;

    /* renamed from: b */
    public final /* synthetic */ List f34066b;

    public /* synthetic */ C9940bw(C9941bx bxVar, List list) {
        this.f34065a = bxVar;
        this.f34066b = list;
    }

    public final void accept(int i) {
        C9941bx bxVar = this.f34065a;
        List list = this.f34066b;
        ((C46748e) bxVar.f34070d.get(i)).mo50767a(C58485gu.m89846n(((C50268qu) list.get(i)).f130723b));
        ((C46748e) bxVar.f34071e.get(i)).mo50767a(C58485gu.m89842j(((C50268qu) list.get(i)).f130725d));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }
}
