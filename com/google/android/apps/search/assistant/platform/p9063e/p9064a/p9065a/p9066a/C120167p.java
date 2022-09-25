package com.google.android.apps.search.assistant.platform.p9063e.p9064a.p9065a.p9066a;

import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17266e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66649dp;
import com.google.speech.p5208h.C66650dq;
import java.util.concurrent.Executor;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.e.a.a.a.p */
/* compiled from: PG */
public final class C120167p implements C17266e {

    /* renamed from: a */
    public static final C59071e f334438a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.e.a.a.a.p");

    /* renamed from: b */
    public final C60870cx f334439b;

    /* renamed from: c */
    public final C60870cx f334440c;

    /* renamed from: d */
    private final Executor f334441d;

    public C120167p(Executor executor, C60870cx cxVar, C60870cx cxVar2) {
        this.f334441d = executor;
        this.f334439b = cxVar;
        this.f334440c = cxVar2;
    }

    /* renamed from: b */
    public static void m199098b(C66606cd cdVar) {
        C62940bt btVar = C66650dq.f181324e;
        C66649dp dpVar = (C66649dp) C66650dq.f181323d.createBuilder();
        dpVar.copyOnWrite();
        C66650dq dqVar = (C66650dq) dpVar.instance;
        dqVar.f181326a |= 2;
        dqVar.f181328c = true;
        cdVar.mo58885m(btVar, (C66650dq) dpVar.build());
    }

    /* renamed from: a */
    public final C60870cx mo23245a() {
        C59104x b = f334438a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SpeakerIdInfoS3RequestProducer");
        ((C59052c) ((C59052c) b).mo56372aa(34668)).mo56386p("Create initial request mutator");
        return C47638k.m84753d(this.f334439b, this.f334440c).mo51520a(new C120165n(this), this.f334441d);
    }

    /* renamed from: c */
    public final /* synthetic */ C60870cx mo23246c(Consumer consumer) {
        return C60866ct.f164955a;
    }
}
