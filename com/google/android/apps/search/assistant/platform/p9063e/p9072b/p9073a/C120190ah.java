package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120420b;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120481c;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120507d;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120511h;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120515l;
import com.google.android.libraries.assistant.p1363c.p1380c.p1381a.C17166b;
import com.google.android.libraries.assistant.p1363c.p1380c.p1381a.C17171g;
import com.google.android.libraries.assistant.p1363c.p1380c.p1381a.C17173i;
import com.google.android.libraries.assistant.p1363c.p1380c.p1381a.C17179o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47630c;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60904dr;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5078a.p5082b.p5083a.p5084a.C65482b;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.ah */
/* compiled from: PG */
public final /* synthetic */ class C120190ah implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C120259cq f334485a;

    /* renamed from: b */
    public final /* synthetic */ C120511h f334486b;

    /* renamed from: c */
    public final /* synthetic */ C17179o f334487c;

    /* renamed from: d */
    public final /* synthetic */ Duration f334488d;

    /* renamed from: e */
    public final /* synthetic */ Executor f334489e;

    /* renamed from: f */
    public final /* synthetic */ C120191ai f334490f;

    public /* synthetic */ C120190ah(C120259cq cqVar, C120511h hVar, C17179o oVar, C120191ai aiVar, Duration duration, Executor executor) {
        this.f334485a = cqVar;
        this.f334486b = hVar;
        this.f334487c = oVar;
        this.f334490f = aiVar;
        this.f334488d = duration;
        this.f334489e = executor;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C120259cq cqVar = this.f334485a;
        C120511h hVar = this.f334486b;
        C17179o oVar = this.f334487c;
        C120191ai aiVar = this.f334490f;
        Duration duration = this.f334488d;
        Executor executor = this.f334489e;
        Objects.requireNonNull(cVar);
        cqVar.mo104713a(new C120185ac(cVar), cqVar.f334623a);
        C120507d a = hVar.mo104768a();
        if (a.mo104782c() == C120420b.STEREO) {
            C120515l f = C120507d.m199598f();
            f.mo104792d(a.mo104781b());
            f.mo104791c(a.mo104783d());
            f.mo104790b(C120420b.MONO);
            f.mo104793e(a.mo104784e());
            a = f.mo104789a();
        }
        C120481c cVar2 = C120481c.f335068a;
        if (a.mo104783d().ordinal() == 0 && a.mo104782c().ordinal() == 0) {
            int b = a.mo104781b();
            C60904dr drVar = new C60904dr(oVar.f49905b);
            C17171g gVar = oVar.f49904a;
            C47630c c = new C47630c(new C60817ay(gVar.f49882b.mo50395b())).mo51505c(new C17166b(b, drVar), gVar.f49881a).mo51505c(new C17173i(aiVar, duration, b, drVar), oVar.f49905b);
            cVar.mo5436a(C47810es.m84977q(new C120186ad(c)), executor);
            c.mo51508f(new C120187ae(cqVar, cVar), executor);
            return "produceEndpointerProcessor";
        }
        throw new C120236bz("Unsupported MicroEndpointer configuration: ".concat(String.valueOf(String.valueOf(a))), C65482b.INVALID_ENDPOINTER_AUDIO_CONFIG, (Throwable) null);
    }
}
