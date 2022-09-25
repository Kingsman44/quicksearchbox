package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p832a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12863g;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12864h;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12865i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13037ay;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16734av;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16736ax;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16754d;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16756f;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16766p;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60904dr;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.a.p */
/* compiled from: PG */
public final class C12709p implements C12865i {

    /* renamed from: a */
    public static final C59071e f39791a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.a.p");

    /* renamed from: b */
    public final Executor f39792b;

    /* renamed from: c */
    public final C57987f f39793c = new C57987f();

    /* renamed from: d */
    public C12863g f39794d = ((C12863g) C12864h.f40117i.createBuilder());

    public C12709p(Executor executor) {
        this.f39792b = new C60904dr(executor);
    }

    /* renamed from: a */
    public final void mo20748a(C16756f fVar) {
        C12708o oVar = new C12708o(this, fVar);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(oVar), this.f39792b), "Error updating AppActionsServiceArgs", new Object[0]);
    }

    /* renamed from: b */
    public final void mo20749b(C16754d dVar) {
        C12706m mVar = new C12706m(this, dVar);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(mVar), this.f39792b), "Error updating App Action Args", new Object[0]);
    }

    /* renamed from: c */
    public final void mo20750c(C16766p pVar) {
        C12705l lVar = new C12705l(this, pVar);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(lVar), this.f39792b), "Error updating App Open Args", new Object[0]);
    }

    /* renamed from: d */
    public final void mo20751d(C16662b bVar) {
        C12700g gVar = new C12700g(this, bVar);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(gVar), this.f39792b), "Error updating Immersive Args", new Object[0]);
    }

    /* renamed from: e */
    public final void mo20752e(C16734av avVar) {
        C12707n nVar = new C12707n(this, avVar);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(nVar), this.f39792b), "Error updating Routine State", new Object[0]);
    }

    /* renamed from: f */
    public final void mo20753f(C16736ax axVar) {
        C12701h hVar = new C12701h(this, axVar);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(hVar), this.f39792b), "Error updating third party provider", new Object[0]);
    }

    /* renamed from: g */
    public final void mo20754g(C13037ay ayVar) {
        C12703j jVar = new C12703j(this, ayVar);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(jVar), this.f39792b), "Error updating TTS State", new Object[0]);
    }
}
