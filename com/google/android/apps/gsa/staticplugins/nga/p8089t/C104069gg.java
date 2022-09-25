package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.gg */
/* compiled from: PG */
public final /* synthetic */ class C104069gg implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C104073gk f289551a;

    /* renamed from: b */
    public final /* synthetic */ C58528ij f289552b;

    /* renamed from: c */
    public final /* synthetic */ C29409fd f289553c;

    public /* synthetic */ C104069gg(C104073gk gkVar, C58528ij ijVar, C29409fd fdVar) {
        this.f289551a = gkVar;
        this.f289552b = ijVar;
        this.f289553c = fdVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C104073gk gkVar = this.f289551a;
        return C60856cj.m92894c((List) Collection.EL.stream((C58485gu) obj).filter(new C104070gh(this.f289552b)).map(new C104071gi(gkVar, this.f289553c)).collect(Collectors.toList())).mo57334a(C104072gj.f289557a, C60826bg.f164896a);
    }
}
