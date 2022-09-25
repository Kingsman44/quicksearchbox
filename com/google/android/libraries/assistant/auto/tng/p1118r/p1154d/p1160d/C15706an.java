package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1160d;

import android.databinding.C0118a;
import com.google.android.libraries.assistant.auto.ondevice.p710d.C11873a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.C15756i;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.C15757j;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1331a.C16850a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.p4449cd.p4456g.C57981b;
import com.google.speech.p5218j.C67167nn;
import com.google.speech.p5218j.p5222c.C66853d;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.d.an */
/* compiled from: PG */
public final class C15706an implements C15757j {

    /* renamed from: a */
    public static final C59071e f46852a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.r.d.d.an");

    /* renamed from: b */
    public final C69464a f46853b;

    /* renamed from: c */
    public final C16850a f46854c;

    /* renamed from: d */
    public final C15756i f46855d;

    /* renamed from: e */
    public final C69464a f46856e;

    /* renamed from: f */
    public final C69464a f46857f;

    /* renamed from: g */
    public final C69464a f46858g;

    /* renamed from: h */
    public final Executor f46859h;

    /* renamed from: i */
    public final C66853d f46860i;

    /* renamed from: j */
    public final C11873a f46861j;

    /* renamed from: k */
    public final C58833ax f46862k;

    /* renamed from: l */
    public C15704al f46863l = new C15704al(this);

    /* renamed from: m */
    public C58833ax f46864m = C58836b.f156633a;

    /* renamed from: n */
    public C70862aj f46865n;

    /* renamed from: o */
    public C15705am f46866o;

    /* renamed from: p */
    private final Executor f46867p;

    public C15706an(C66853d dVar, C16850a aVar, C15756i iVar, C11873a aVar2, Executor executor, Executor executor2, C58833ax axVar, C69464a aVar3, C69464a aVar4, C69464a aVar5, C69464a aVar6) {
        this.f46860i = dVar;
        this.f46854c = aVar;
        this.f46855d = iVar;
        this.f46861j = aVar2;
        this.f46867p = new C60904dr(executor);
        this.f46859h = new C60904dr(executor2);
        this.f46856e = aVar3;
        this.f46857f = aVar4;
        this.f46858g = aVar6;
        this.f46862k = axVar;
        this.f46853b = aVar5;
    }

    /* renamed from: a */
    public final C60870cx mo22516a() {
        ((C59052c) ((C59052c) f46852a.mo56224b()).mo56372aa(46291)).mo56386p("#initialize");
        return C47633f.m84733g(C47633f.m84733g(this.f46861j.mo20264c()).mo51516i(new C15727u(this), this.f46867p).mo51515h(new C15728v(this), this.f46867p)).mo51516i(new C15720n(this), this.f46859h);
    }

    /* renamed from: b */
    public final C60870cx mo22517b(C60870cx cxVar) {
        ((C59052c) ((C59052c) f46852a.mo56224b()).mo56372aa(46299)).mo56386p("#startAudioStream");
        return C47633f.m84733g(mo22518c()).mo51516i(new C15696ad(this), this.f46859h).mo51516i(new C15697ae(this, cxVar), this.f46859h).mo51516i(new C15698af(this, cxVar), this.f46859h).mo51516i(new C15719m(this), this.f46859h);
    }

    /* renamed from: c */
    public final C60870cx mo22518c() {
        C0118a.m96d(f46852a.mo56224b(), "#stopAudioStream", 46302, C58979ad.SMALL);
        C15724r rVar = new C15724r(this);
        return C60856cj.m92903l(C47810es.m84977q(rVar), this.f46859h);
    }

    /* renamed from: d */
    public final C60870cx mo22519d(C67167nn nnVar) {
        return C47633f.m84733g(mo22516a()).mo51516i(new C15718l(this, nnVar), this.f46859h);
    }

    /* renamed from: e */
    public final C57981b mo22520e() {
        ((C59052c) ((C59052c) f46852a.mo56224b()).mo56372aa(46303)).mo56386p("#getSodaEventSource");
        return this.f46863l.f46850b;
    }
}
