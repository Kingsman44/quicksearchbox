package com.google.android.libraries.assistant.p1363c.p1398g.p1441n.p1443b;

import android.content.Context;
import androidx.p104d.p105a.C2168g;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17377g;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17477am;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17485au;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17508k;
import com.google.android.libraries.assistant.p1363c.p1398g.p1439m.C17528a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1441n.C17550b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1446b.C17584j;
import com.google.android.libraries.search.assistant.p2498ac.p2499a.p2500a.C32432a;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.c.g.n.b.o */
/* compiled from: PG */
public final class C17565o implements C17550b {

    /* renamed from: a */
    public static final C59071e f50627a = C59071e.m91332i("com.google.android.libraries.assistant.c.g.n.b.o");

    /* renamed from: b */
    public final Executor f50628b;

    /* renamed from: c */
    public final C17485au f50629c;

    /* renamed from: d */
    public final C17477am f50630d;

    /* renamed from: e */
    public final C58881cr f50631e;

    /* renamed from: f */
    public final C58881cr f50632f;

    /* renamed from: g */
    public final C57987f f50633g = new C57987f();

    /* renamed from: h */
    public final AtomicReference f50634h = new AtomicReference();

    /* renamed from: i */
    public final AtomicReference f50635i = new AtomicReference();

    /* renamed from: j */
    private final C32432a f50636j;

    /* renamed from: k */
    private final AtomicBoolean f50637k = new AtomicBoolean(false);

    /* renamed from: l */
    private final C60870cx f50638l;

    /* renamed from: m */
    private final C60870cx f50639m;

    public C17565o(C17485au auVar, C17477am amVar, C17508k kVar, Context context, Executor executor, C32432a aVar, C17584j jVar) {
        this.f50628b = new C60904dr(executor);
        this.f50629c = auVar;
        this.f50630d = amVar;
        this.f50636j = aVar;
        this.f50639m = C2169h.m6027a(new C17551a(this));
        this.f50632f = C58886cw.m90973a(new C17552b(this, auVar, context, kVar.f50523a == 1 ? Optional.m71637of(jVar) : Optional.empty(), aVar, amVar));
        this.f50631e = C58886cw.m90973a(new C17553c(context));
        this.f50638l = C2169h.m6027a(new C17554d(this, amVar));
    }

    /* renamed from: a */
    public final void mo23386a() {
        C59104x b = f50627a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TTS.OnDevice");
        ((C59052c) ((C59052c) b).mo56372aa(42785)).mo56389s("Closing on-device TTS synthesizer for sessionToekn %s", C17377g.m34655c(this.f50630d));
        C60870cx cxVar = this.f50639m;
        ((C2168g) cxVar).f6144b.mo4106b(new C17560j(this, (C17564n) this.f50632f.mo6453a()), this.f50628b);
    }

    /* renamed from: b */
    public final synchronized C17528a mo23387b() {
        if (this.f50637k.compareAndSet(false, true)) {
            C59104x b = f50627a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TTS.OnDevice");
            ((C59052c) ((C59052c) b).mo56372aa(42781)).mo56389s("Starting on-device TTS synthesis for sessionToken %s", C17377g.m34655c(this.f50630d));
            C32432a aVar = this.f50636j;
            C17477am amVar = this.f50630d;
            C69664n.m101061g(amVar, "sessionToken");
            aVar.mo38058a(C37176a.f97051eJ.mo40815i(C62722b.OK), amVar);
            C60856cj.m92911t(this.f50639m, C47810es.m84974n(new C17562l(this, (C17564n) this.f50632f.mo6453a())), this.f50628b);
            C60856cj.m92911t(this.f50638l, C47810es.m84974n(new C17561k(this)), this.f50628b);
        } else {
            C59104x b2 = f50627a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "TTS.OnDevice");
            ((C59052c) ((C59052c) b2).mo56372aa(42780)).mo56389s("On-device TTS synthesis skipped for sessionToken %s. Already done.", C17377g.m34655c(this.f50630d));
        }
        return new C17528a(this.f50633g, this.f50638l, Optional.empty());
    }
}
