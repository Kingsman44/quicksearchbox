package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9126a.p9129c;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120510g;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120511h;
import com.google.android.libraries.search.p2904c.p2990z.p2991a.C38289e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.p4458b.C57982a;
import com.google.speech.p5218j.C67087ko;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.a.c.ar */
/* compiled from: PG */
final class C120851ar implements C70862aj {

    /* renamed from: a */
    public static final C59071e f336040a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.f.m.a.c.ar");

    /* renamed from: b */
    public final C120862bb f336041b;

    /* renamed from: c */
    public final C57982a f336042c;

    /* renamed from: d */
    public final C120861ba f336043d;

    /* renamed from: e */
    public final C60870cx f336044e;

    /* renamed from: f */
    public boolean f336045f = true;

    /* renamed from: g */
    public C2164c f336046g;

    /* renamed from: h */
    public final C38289e f336047h;

    /* renamed from: i */
    private final C60870cx f336048i;

    /* renamed from: j */
    private final Executor f336049j;

    public C120851ar(C60870cx cxVar, Executor executor, C120862bb bbVar, C38289e eVar, C120861ba baVar) {
        this.f336048i = cxVar;
        this.f336049j = executor;
        this.f336041b = bbVar;
        this.f336042c = new C57982a();
        this.f336047h = eVar;
        this.f336043d = baVar;
        this.f336044e = C2169h.m6027a(new C120848ao(this));
    }

    /* renamed from: a */
    public final void mo20121a() {
        C58976aa aaVar = C58975e.f156826a;
        Executor executor = this.f336049j;
        C57982a aVar = this.f336042c;
        Objects.requireNonNull(aVar);
        executor.execute(C47810es.m84977q(new C120846am(aVar)));
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C59104x d = f336040a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceAsr");
        ((C59052c) ((C59052c) d).mo56372aa(35629)).mo56386p("SodaEventResponseStreamObserver#onError");
        this.f336046g.mo5439d(th);
        this.f336049j.execute(C47810es.m84977q(new C120845al(this, th)));
    }

    /* renamed from: d */
    public final Optional mo104947d() {
        try {
            return (Optional) C60856cj.m92909r(((C120511h) C60856cj.m92909r(this.f336048i)).mo104769b());
        } catch (CancellationException | ExecutionException e) {
            C59104x c = f336040a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceAsr");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(35624)).mo56386p("#getMicOpenElapsedRealtime: could not getMicOpenElapsedRealtime: the microphone is not yet open or failed to open.");
            return Optional.empty();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo104948e(C120510g gVar) {
        C59104x b = f336040a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceAsr");
        ((C59052c) ((C59052c) b).mo56372aa(35625)).mo56386p("SodaEventResponseStreamObserver#closeAudioInputSession");
        C60870cx cxVar = this.f336048i;
        C120850aq aqVar = new C120850aq(gVar);
        C60856cj.m92911t(cxVar, C47810es.m84974n(aqVar), this.f336049j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo104949f() {
        Executor executor = this.f336049j;
        C57982a aVar = this.f336042c;
        Objects.requireNonNull(aVar);
        executor.execute(C47810es.m84977q(new C120846am(aVar)));
    }

    /* renamed from: g */
    public final void mo20123c(C67087ko koVar) {
        int i = koVar.f182368a;
        if ((i & 32) == 0 && (i & C89885b.HTTP_VALUE) == 0) {
            C58976aa aaVar = C58975e.f156826a;
        }
        this.f336049j.execute(C47810es.m84977q(new C120849ap(this, koVar)));
    }
}
