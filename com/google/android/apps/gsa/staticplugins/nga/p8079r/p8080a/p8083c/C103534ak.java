package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.p8083c;

import com.google.android.apps.gsa.nga.shared.p6364s3.aidl.CloudFulfillmentData;
import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5224k.p5225a.C67244v;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.c.ak */
/* compiled from: PG */
public final class C103534ak extends C68247h {

    /* renamed from: a */
    private final C68283d f288461a;

    /* renamed from: c */
    private final C68283d f288462c;

    /* renamed from: d */
    private final C68283d f288463d;

    /* renamed from: e */
    private final C68283d f288464e;

    public C103534ak(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C103534ak.class), aVar);
        this.f288461a = C68236af.m98549d(dVar);
        this.f288462c = C68236af.m98549d(dVar2);
        this.f288463d = C68236af.m98549d(dVar3);
        this.f288464e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C118928k kVar;
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(0);
        C58833ax axVar = (C58833ax) list.get(1);
        C90021c cVar2 = (C90021c) list.get(2);
        CloudFulfillmentData cloudFulfillmentData = (CloudFulfillmentData) list.get(3);
        try {
            C58833ax axVar2 = (C58833ax) cVar.mo60292a();
            if (axVar2.mo56113h()) {
                C58976aa aaVar = C58975e.f156826a;
                kVar = new C118928k(axVar2, C67244v.f182772t);
                return C60856cj.m92900i(kVar);
            }
        } catch (ExecutionException e) {
            C59104x c = C103528ae.f288448a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VoiceInputProducerModul");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(21615)).mo56386p("@Complete S3RecognizerInfo producer failed");
        }
        C58976aa aaVar2 = C58975e.f156826a;
        kVar = new C118928k(axVar, C67244v.f182772t);
        return C60856cj.m92900i(kVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f288461a.mo60297gq()), this.f288462c.mo60297gq(), this.f288463d.mo60297gq(), this.f288464e.mo60297gq());
    }
}
