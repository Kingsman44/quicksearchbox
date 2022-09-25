package com.google.android.apps.search.googleapp.stampviewer.p10495g;

import com.google.common.base.C58817ah;
import com.google.p4017at.p4027c.p4031b.p4041d.p4042a.C53910e;
import java.util.ArrayList;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.g.e */
/* compiled from: PG */
public final /* synthetic */ class C139401e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C139409m f379048a;

    public /* synthetic */ C139401e(C139409m mVar) {
        this.f379048a = mVar;
    }

    public final Object apply(Object obj) {
        return (ArrayList) Collection.EL.stream(((C53910e) obj).f141463a).map(C139398b.f379045a).filter(new C139399c(this.f379048a)).collect(Collectors.toCollection(C139400d.f379047a));
    }
}
