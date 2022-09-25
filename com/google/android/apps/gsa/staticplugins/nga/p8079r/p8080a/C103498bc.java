package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.nga.shared.p6364s3.aidl.C81486d;
import com.google.android.apps.gsa.nga.shared.p6364s3.aidl.CloudFulfillmentData;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.CancellationException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.bc */
/* compiled from: PG */
final class C103498bc extends C81486d {

    /* renamed from: a */
    final SettableFuture f288402a = new SettableFuture();

    /* renamed from: b */
    private final C22871g f288403b;

    /* renamed from: c */
    private final C69464a f288404c;

    public C103498bc(C22871g gVar, C69464a aVar) {
        this.f288403b = gVar;
        this.f288404c = aVar;
    }

    /* renamed from: a */
    public final void mo93811a() {
        this.f288402a.mo57357o(new CancellationException("Cancelled by NGA"));
    }

    /* renamed from: e */
    public final void mo75106e(CloudFulfillmentData cloudFulfillmentData) {
        C59104x b = C103499bd.f288405a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "CloudFulfillmentDM");
        ((C59052c) ((C59052c) b).mo56372aa(21568)).mo56386p("#onAccepted, proceed");
        this.f288402a.mo57356n(cloudFulfillmentData);
    }

    /* renamed from: f */
    public final void mo75107f() {
        C59104x d = C103499bd.f288405a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "CloudFulfillmentDM");
        ((C59052c) ((C59052c) d).mo56372aa(21569)).mo56386p("#onRejected: cloud fulfillment is no longer needed.");
        long a = ((C90021c) this.f288404c.mo17428b()).mo79743a(C90126fx.f250965R);
        if (a > 0) {
            this.f288403b.mo28213m("[NGA] CloudFulfillmentDM.onRejected", a, new C103497bb(this));
        } else {
            mo93811a();
        }
    }
}
