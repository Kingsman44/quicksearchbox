package com.google.android.apps.gsa.staticplugins.accl.p7337g;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6491a.C84349ah;
import com.google.android.apps.gsa.search.core.p6491a.C84350ai;
import com.google.android.apps.gsa.search.core.p6491a.p6493b.C84352a;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.accl.p7338h.C92847b;
import com.google.android.libraries.gsa.conversation.p1837a.C22333n;
import com.google.android.libraries.gsa.conversation.p1837a.C22334o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.g.e */
/* compiled from: PG */
public final class C92842e extends C22334o {

    /* renamed from: a */
    public static final C59071e f259038a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.g.e");

    /* renamed from: b */
    public final TtsRequest f259039b;

    /* renamed from: c */
    public final C92847b f259040c;

    /* renamed from: d */
    public final C84352a f259041d;

    /* renamed from: e */
    public final C84350ai f259042e;

    /* renamed from: f */
    public final C84349ah f259043f;

    /* renamed from: g */
    private final C60870cx f259044g;

    /* renamed from: h */
    private final C22871g f259045h;

    /* renamed from: i */
    private C60870cx f259046i;

    public C92842e(C60870cx cxVar, TtsRequest ttsRequest, C84349ah ahVar, C22871g gVar, C92847b bVar, C84352a aVar, C84350ai aiVar) {
        this.f259044g = cxVar;
        this.f259039b = ttsRequest;
        this.f259043f = ahVar;
        this.f259045h = gVar;
        this.f259040c = bVar;
        this.f259041d = aVar;
        this.f259042e = aiVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C22333n mo27546a() {
        return C22333n.OUTPUT;
    }

    /* renamed from: b */
    public final synchronized C60870cx mo27547b() {
        if (this.f259046i != null) {
            C59104x c = f259038a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SSTtsAudioRequest");
            ((C59052c) ((C59052c) c).mo56372aa(13467)).mo56386p("Can't reuse same AudioRequest to play TTS multiple times");
            return C118826c.f331423b;
        }
        C60870cx j = this.f259045h.mo28210j(this.f259044g, "SearchServiceTtsAudioRequest Network TTS", new C92838a(this));
        this.f259046i = j;
        new C90873ag(j, this.f259045h, "TtsPlaybackFuture Done", C92839b.f259035a).mo85223a(new C92840c(this));
        return this.f259046i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final synchronized C60870cx mo27548c() {
        C60870cx cxVar = this.f259046i;
        if (cxVar == null) {
            C59104x c = f259038a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SSTtsAudioRequest");
            ((C59052c) ((C59052c) c).mo56372aa(13468)).mo56386p("stop called before TTS execution");
            return C118826c.f331423b;
        }
        if (!cxVar.isDone()) {
            this.f259046i.cancel(true);
        }
        return C118826c.f331423b;
    }
}
