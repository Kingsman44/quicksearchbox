package com.google.android.libraries.lens.p2016f;

import com.google.android.apps.gsa.search.shared.service.p6935b.C87949jo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87950jp;
import com.google.common.base.C58810aa;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56768l;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56769m;

/* renamed from: com.google.android.libraries.lens.f.k */
/* compiled from: PG */
class C24249k extends C58810aa {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17535b(Object obj) {
        C87950jp jpVar = (C87950jp) obj;
        C56768l lVar = (C56768l) C56769m.f151494c.createBuilder();
        if ((jpVar.f237867a & 1) != 0) {
            boolean z = jpVar.f237868b;
            lVar.copyOnWrite();
            C56769m mVar = (C56769m) lVar.instance;
            mVar.f151496a |= 1;
            mVar.f151497b = z;
        }
        return (C56769m) lVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo17536c(Object obj) {
        C56769m mVar = (C56769m) obj;
        C87949jo joVar = (C87949jo) C87950jp.f237865c.createBuilder();
        if ((mVar.f151496a & 1) != 0) {
            boolean z = mVar.f151497b;
            joVar.copyOnWrite();
            C87950jp jpVar = (C87950jp) joVar.instance;
            jpVar.f237867a |= 1;
            jpVar.f237868b = z;
        }
        return (C87950jp) joVar.build();
    }
}
