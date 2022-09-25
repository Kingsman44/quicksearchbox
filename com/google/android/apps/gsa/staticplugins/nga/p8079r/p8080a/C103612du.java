package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import android.os.RemoteException;
import com.google.android.apps.gsa.nga.shared.p6364s3.aidl.C81490h;
import com.google.android.apps.gsa.nga.shared.p6364s3.aidl.CloudFulfillmentData;
import com.google.android.apps.gsa.nga.shared.p6364s3.p6365a.C81472g;
import com.google.android.apps.gsa.nga.shared.p6364s3.p6365a.C81473h;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66624cv;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.du */
/* compiled from: PG */
public final class C103612du extends C68247h {

    /* renamed from: a */
    private final C68283d f288632a;

    /* renamed from: c */
    private final C68283d f288633c;

    /* renamed from: d */
    private final C68283d f288634d;

    /* renamed from: e */
    private final C68283d f288635e;

    /* renamed from: f */
    private final C68283d f288636f;

    public C103612du(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C103612du.class), aVar);
        this.f288632a = C68236af.m98549d(dVar);
        this.f288633c = C68236af.m98549d(dVar2);
        this.f288634d = C68236af.m98549d(dVar3);
        this.f288635e = C68236af.m98549d(dVar4);
        this.f288636f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C118826c cVar;
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        Query query = (Query) list.get(1);
        CloudFulfillmentData cloudFulfillmentData = (CloudFulfillmentData) list.get(2);
        C89356b bVar = (C89356b) list.get(3);
        C83334w wVar = (C83334w) list.get(4);
        C59104x b = C103611dt.f288631a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ResultsForwardingPM");
        ((C59052c) ((C59052c) b).mo56372aa(21584)).mo56389s("Device selection: %s", axVar);
        if (!axVar.mo56113h()) {
            C103611dt.m171596a(wVar, 9);
        } else if (((C66624cv) axVar.mo56107c()).f181251b) {
            C103611dt.m171596a(wVar, 7);
        } else {
            C103611dt.m171596a(wVar, 8);
        }
        C58833ax b2 = cloudFulfillmentData.f222915a.mo56106b(C103609dr.f288629a);
        if (!axVar.mo56113h() || !b2.mo56113h()) {
            cVar = C118826c.f331422a;
        } else if (bVar.mo83286e().f155009a.isDone()) {
            cVar = C118826c.f331422a;
        } else {
            C81472g gVar = (C81472g) C81473h.f222889c.createBuilder();
            String b3 = C39191a.m68623b(query.f252749G);
            gVar.copyOnWrite();
            b3.getClass();
            ((C81473h) gVar.instance).f222891a = b3;
            C66624cv cvVar = (C66624cv) axVar.mo56107c();
            gVar.copyOnWrite();
            cvVar.getClass();
            ((C81473h) gVar.instance).f222892b = cvVar;
            try {
                ((C81490h) b2.mo56107c()).mo75108b(((C81473h) gVar.build()).toByteArray());
            } catch (RemoteException e) {
                C59104x d = C103611dt.f288631a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ResultsForwardingPM");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(21585)).mo56386p("Unable to send stream event, NGA died?");
            }
            cVar = C118826c.f331422a;
        }
        return C60856cj.m92900i(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f288632a.mo60297gq(), this.f288633c.mo60297gq(), this.f288634d.mo60297gq(), this.f288635e.mo60297gq(), this.f288636f.mo60297gq());
    }
}
