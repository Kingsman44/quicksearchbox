package com.google.android.apps.gsa.staticplugins.opa.p8204al;

import android.util.Pair;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8889z.p8893c.p8899f.C118897c;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119052h;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.recognizer.p5233a.C67438ag;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.al.av */
/* compiled from: PG */
public final class C106342av extends C68247h {

    /* renamed from: a */
    private final C68283d f296670a;

    /* renamed from: c */
    private final C68283d f296671c;

    /* renamed from: d */
    private final C68283d f296672d;

    /* renamed from: e */
    private final C68283d f296673e;

    public C106342av(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C106342av.class), aVar);
        this.f296670a = C68236af.m98549d(dVar);
        this.f296671c = C68236af.m98549d(dVar2);
        this.f296672d = C68236af.m98549d(dVar3);
        this.f296673e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C119052h hVar = (C119052h) list.get(0);
        C58833ax axVar = (C58833ax) list.get(1);
        C89859i iVar = (C89859i) list.get(2);
        long longValue = ((Long) list.get(3)).longValue();
        if (axVar.mo56113h()) {
            Pair a = new C118897c().mo104065a((C67438ag) axVar.mo56107c());
            if (((String) a.first).isEmpty() && ((String) a.second).isEmpty()) {
                hVar.mo104095g();
                C89856f fVar = new C89856f();
                fVar.f246201a = C89849ae.VOICE_SEARCH_NO_SPEECH_DETECTED;
                fVar.mo83701c("rId", Long.toString(longValue));
                iVar.mo74236a(fVar.mo83699a());
            }
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f296670a.mo60297gq(), this.f296671c.mo60297gq(), this.f296672d.mo60297gq(), this.f296673e.mo60297gq());
    }
}
