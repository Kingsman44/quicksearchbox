package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.p8083c;

import android.os.RemoteException;
import com.google.android.apps.gsa.nga.shared.p6364s3.aidl.C81496n;
import com.google.android.apps.gsa.nga.shared.p6364s3.aidl.CloudFulfillmentData;
import com.google.android.apps.gsa.nga.shared.p6364s3.p6365a.C81469d;
import com.google.android.apps.gsa.nga.shared.p6364s3.p6365a.C81474i;
import com.google.android.apps.gsa.nga.shared.p6364s3.p6365a.C81475j;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.c.t */
/* compiled from: PG */
public final class C103558t extends C68247h {

    /* renamed from: a */
    private final C68283d f288518a;

    /* renamed from: c */
    private final C68283d f288519c;

    public C103558t(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C103558t.class), aVar);
        this.f288518a = C68236af.m98549d(dVar);
        this.f288519c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C57981b bVar = (C57981b) list.get(0);
        C58833ax b = ((CloudFulfillmentData) list.get(1)).f222916b.mo56106b(C103553o.f288512a);
        if (b.mo56113h()) {
            C81496n nVar = (C81496n) b.mo56107c();
            C81474i iVar = (C81474i) C81475j.f222893c.createBuilder();
            C81469d dVar = C81469d.f222885a;
            iVar.copyOnWrite();
            C81475j jVar = (C81475j) iVar.instance;
            dVar.getClass();
            jVar.f222896b = dVar;
            jVar.f222895a = 3;
            try {
                nVar.mo72775a(((C81475j) iVar.build()).toByteArray());
            } catch (RemoteException e) {
                C59104x d = C103556r.f288515a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "SpeechRecognitionEvent");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(21613)).mo56386p("Unable to send network latency event");
            }
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f288518a.mo60297gq(), this.f288519c.mo60297gq());
    }
}
