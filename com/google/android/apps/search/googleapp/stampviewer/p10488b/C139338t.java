package com.google.android.apps.search.googleapp.stampviewer.p10488b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.search.googleapp.accounts.p10123a.C133150a;
import com.google.android.apps.search.googleapp.stampviewer.p10493e.C139386e;
import com.google.android.apps.search.googleapp.stampviewer.p10493e.C139387f;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56609a;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import com.google.protos.p5124m.p5125a.C65603f;
import java.util.Collection;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.b.t */
/* compiled from: PG */
public final class C139338t {

    /* renamed from: a */
    private static final C59071e f378952a = C59071e.m91332i("com.google.android.apps.search.googleapp.stampviewer.b.t");

    /* renamed from: b */
    private final Context f378953b;

    /* renamed from: c */
    private final C62921ba f378954c;

    /* renamed from: d */
    private final boolean f378955d;

    /* renamed from: e */
    private final List f378956e;

    /* renamed from: f */
    private final C139387f f378957f;

    /* renamed from: g */
    private final C133150a f378958g;

    /* renamed from: h */
    private final C139336r f378959h;

    public C139338t(Context context, C62921ba baVar, C139336r rVar, Optional optional, C65603f fVar, C139387f fVar2, C133150a aVar) {
        this.f378953b = context;
        this.f378954c = baVar;
        this.f378959h = rVar;
        this.f378955d = ((Boolean) optional.orElse(false)).booleanValue();
        this.f378956e = fVar.f178307a;
        this.f378957f = fVar2;
        this.f378958g = aVar;
    }

    /* renamed from: a */
    public final Intent mo114907a(C139324f fVar, AccountId accountId) {
        C139335q qVar;
        Uri.Builder builder;
        C139321c cVar;
        if (!this.f378956e.isEmpty()) {
            C139323e eVar = (C139323e) fVar.toBuilder();
            eVar.copyOnWrite();
            ((C139324f) eVar.instance).f378928b = C139324f.emptyProtobufList();
            for (String str : this.f378956e) {
                C56609a aVar = (C56609a) C56610b.f151140k.createBuilder();
                aVar.copyOnWrite();
                C56610b bVar = (C56610b) aVar.instance;
                str.getClass();
                bVar.f151142a |= 2;
                bVar.f151144c = str;
                aVar.copyOnWrite();
                C56610b bVar2 = (C56610b) aVar.instance;
                str.getClass();
                bVar2.f151142a |= 1;
                bVar2.f151143b = str;
                eVar.mo114902a(aVar);
            }
            fVar = (C139324f) eVar.build();
        }
        C139336r rVar = this.f378959h;
        boolean z = this.f378955d;
        int size = fVar.f378928b.size();
        if (size <= 0) {
            qVar = C139336r.m226469a(C139321c.NO_STAMPS);
        } else {
            int i = fVar.f378929c;
            if (i < 0 || i >= size) {
                qVar = C139336r.m226469a(C139321c.INVALID_INDEX_TO_DISPLAY);
            } else if (z) {
                qVar = C139336r.m226470b();
            } else {
                qVar = rVar.mo114905c((Collection) Collection.EL.stream(fVar.f378928b).map(C139327i.f378942a).collect(C58370cn.f155946a), (java.util.Collection) Collection.EL.stream(fVar.f378928b).map(C139328j.f378943a).collect(C58370cn.f155946a));
            }
        }
        if (!qVar.mo114897b()) {
            if (qVar.mo114896a() == null) {
                cVar = C139321c.UNSPECIFIED;
            } else {
                cVar = qVar.mo114896a();
            }
            cVar.getClass();
            ((C59052c) ((C59052c) f378952a.mo56225c()).mo56372aa(41373)).mo56389s("Cannot open STAMP: %s", cVar.name());
            C139387f fVar2 = this.f378957f;
            C60856cj.m92911t(fVar2.mo114941a(), C47810es.m84974n(new C139386e("STAMP_VIEWER_CANNOT_OPEN", cVar)), fVar2.f379021b);
            throw new C139322d(cVar);
        }
        Intent intent = new Intent();
        intent.setClassName(this.f378953b, "com.google.android.apps.search.googleapp.stampviewer.StampViewerActivity");
        intent.addFlags(67108864);
        ProtoParsers.m95531n(intent, "EXTRA_OPEN_STAMP_VIEWER_PARAMS", fVar);
        C45963aa.m82131a(intent, accountId);
        C133150a aVar2 = this.f378958g;
        C69664n.m101061g(accountId, "accountId");
        if (aVar2.f362966b) {
            Uri data = intent.getData();
            if (data == null || (builder = data.buildUpon()) == null) {
                builder = new Uri.Builder().scheme("ga").path("/data");
            }
            intent.setData(builder.appendQueryParameter("googleapp_account_id", Integer.toString(accountId.mo50068a())).build());
        }
        return intent;
    }

    /* renamed from: b */
    public final C139324f mo114908b(Intent intent) {
        if (!intent.hasExtra("EXTRA_OPEN_STAMP_VIEWER_PARAMS")) {
            return C139324f.f378925k;
        }
        return (C139324f) ProtoParsers.m95519b(intent, "EXTRA_OPEN_STAMP_VIEWER_PARAMS", C139324f.f378925k, this.f378954c);
    }
}
