package com.google.android.apps.gsa.staticplugins.opa.p8204al;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119052h;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.al.ay */
/* compiled from: PG */
public final class C106345ay extends C68247h {

    /* renamed from: a */
    private final C68283d f296681a;

    /* renamed from: c */
    private final C68283d f296682c;

    /* renamed from: d */
    private final C68283d f296683d;

    /* renamed from: e */
    private final C68283d f296684e;

    public C106345ay(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C106345ay.class), aVar);
        this.f296681a = C68236af.m98549d(dVar);
        this.f296682c = C68236af.m98549d(dVar2);
        this.f296683d = C68236af.m98549d(dVar3);
        this.f296684e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C119052h hVar = (C119052h) list.get(0);
        C89859i iVar = (C89859i) list.get(2);
        long longValue = ((Long) list.get(3)).longValue();
        if (((C58833ax) list.get(1)).mo56113h()) {
            C58976aa aaVar = C58975e.f156826a;
            hVar.mo104098j();
            C89856f fVar = new C89856f();
            fVar.f246201a = C89849ae.SPEECH_START_RECEIVED;
            fVar.mo83701c("rId", Long.toString(longValue));
            iVar.mo74236a(fVar.mo83699a());
        } else {
            C59104x c = C106334an.f296653a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VoiceResultModule");
            ((C59052c) ((C59052c) c).mo56372aa(25312)).mo56386p("Failed to detect start of speech");
            hVar.mo104093e(C106334an.m177102a(new Throwable("Failed to detect start of speech.")));
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f296681a.mo60297gq(), this.f296682c.mo60297gq(), this.f296683d.mo60297gq(), this.f296684e.mo60297gq());
    }
}
