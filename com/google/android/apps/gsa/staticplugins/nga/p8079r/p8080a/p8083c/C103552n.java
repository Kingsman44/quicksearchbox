package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.p8083c;

import com.google.android.apps.gsa.nga.shared.p6364s3.aidl.CloudFulfillmentData;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.c.n */
/* compiled from: PG */
public final class C103552n extends C68247h {

    /* renamed from: a */
    private final C68283d f288511a;

    public C103552n(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C103552n.class), aVar);
        this.f288511a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C103551m mVar;
        if (((CloudFulfillmentData) obj).f222916b.mo56113h()) {
            mVar = C103551m.VOICE;
        } else {
            mVar = C103551m.TEXT;
        }
        return C60856cj.m92900i(mVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f288511a.mo60297gq();
    }
}
