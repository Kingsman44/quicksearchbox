package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.bl */
/* compiled from: PG */
public final /* synthetic */ class C78389bl implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f215835a;

    /* renamed from: b */
    public final /* synthetic */ Supplier f215836b;

    public /* synthetic */ C78389bl(String str, Supplier supplier) {
        this.f215835a = str;
        this.f215836b = supplier;
    }

    public final Object apply(Object obj) {
        String str = this.f215835a;
        Supplier supplier = this.f215836b;
        ((C59052c) ((C59052c) ((C59052c) C78394bq.f215838p.mo56226d()).mo56382g((Exception) obj)).mo56372aa(5181)).mo56389s("Could not fetch future: %s", str);
        return supplier.get();
    }
}
