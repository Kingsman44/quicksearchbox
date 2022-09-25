package com.google.android.apps.gsa.staticplugins.s3request.p8690a;

import com.google.android.apps.gsa.p5836c.p5843f.C74458k;
import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66677k;
import com.google.speech.p5208h.C66678l;
import com.google.speech.recognizer.p5233a.C67451at;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.a.bh */
/* compiled from: PG */
public final class C116280bh extends C68247h {

    /* renamed from: a */
    private final C68283d f322396a;

    /* renamed from: c */
    private final C68283d f322397c;

    public C116280bh(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C116280bh.class), aVar);
        this.f322396a = C68236af.m98549d(dVar);
        this.f322397c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C92460b bVar = (C92460b) list.get(0);
        C58833ax axVar = (C58833ax) list.get(1);
        int bitCount = Integer.bitCount(bVar.mo87190a());
        int f = bVar.mo87195f();
        if (axVar.mo56113h()) {
            C92460b a = ((C74458k) axVar.mo56107c()).mo70774a();
            bitCount = Integer.bitCount(a.mo87190a());
            f = a.mo87195f();
        } else {
            C59104x d = C116266au.f322366a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "VSS3HeaderModule");
            ((C59052c) ((C59052c) d).mo56372aa(31754)).mo56386p("AudioListeningSessionAdapterOptional is not present");
            int i = C90755l.f253831a;
        }
        C67451at n = bVar.mo87202n();
        C58976aa aaVar = C58975e.f156826a;
        C66677k kVar = (C66677k) C66678l.f181384f.createBuilder();
        kVar.copyOnWrite();
        C66678l lVar = (C66678l) kVar.instance;
        lVar.f181389b = n.f183321p;
        lVar.f181388a |= 1;
        kVar.copyOnWrite();
        C66678l lVar2 = (C66678l) kVar.instance;
        lVar2.f181388a |= 2;
        lVar2.f181390c = (float) f;
        kVar.copyOnWrite();
        C66678l lVar3 = (C66678l) kVar.instance;
        lVar3.f181388a |= 4;
        lVar3.f181391d = bitCount;
        return C60856cj.m92900i(new C118928k(C58833ax.m90834k((C66678l) kVar.build()), C66678l.f181385g));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f322396a.mo60297gq(), this.f322397c.mo60297gq());
    }
}
