package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.p8083c;

import com.google.android.apps.gsa.nga.shared.p6364s3.aidl.C81496n;
import com.google.android.apps.gsa.nga.shared.p6364s3.aidl.CloudFulfillmentData;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.c.u */
/* compiled from: PG */
public final class C103559u extends C68247h {

    /* renamed from: a */
    private final C68283d f288520a;

    /* renamed from: c */
    private final C68283d f288521c;

    public C103559u(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C103559u.class), aVar);
        this.f288520a = C68236af.m98549d(dVar);
        this.f288521c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C57981b bVar = (C57981b) list.get(0);
        C58833ax b = ((CloudFulfillmentData) list.get(1)).f222916b.mo56106b(C103553o.f288512a);
        if (b.mo56113h()) {
            bVar.mo20440jJ(new C103554p((C81496n) b.mo56107c()));
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f288520a.mo60297gq(), this.f288521c.mo60297gq());
    }
}
