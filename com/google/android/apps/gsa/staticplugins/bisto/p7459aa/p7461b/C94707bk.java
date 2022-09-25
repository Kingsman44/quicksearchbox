package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6816p.C86253h;
import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94785f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
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
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.b.bk */
/* compiled from: PG */
public final class C94707bk extends C68247h {

    /* renamed from: a */
    private final C68283d f264868a;

    /* renamed from: c */
    private final C68283d f264869c;

    /* renamed from: d */
    private final C68283d f264870d;

    /* renamed from: e */
    private final C68283d f264871e;

    /* renamed from: f */
    private final C68283d f264872f;

    /* renamed from: g */
    private final C68283d f264873g;

    public C94707bk(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6) {
        super(aVar2, new C68277d(C94707bk.class), aVar);
        this.f264868a = C68236af.m98549d(dVar);
        this.f264869c = C68236af.m98549d(dVar2);
        this.f264870d = C68236af.m98549d(dVar3);
        this.f264871e = C68236af.m98549d(dVar4);
        this.f264872f = C68236af.m98549d(dVar5);
        this.f264873g = C68236af.m98549d(dVar6);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C87421i iVar = (C87421i) list.get(0);
        C118826c cVar = (C118826c) list.get(1);
        boolean booleanValue = ((Boolean) list.get(2)).booleanValue();
        C94785f fVar = (C94785f) list.get(3);
        C22871g gVar = (C22871g) list.get(4);
        C59104x b = C94692aw.f264811a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoModularActionMod");
        ((C59052c) ((C59052c) b).mo56372aa(16864)).mo56386p("AV2 render complete");
        if (!C86253h.CONVERSATION_DELTA.equals(((C58833ax) list.get(5)).mo56111f())) {
            if (booleanValue) {
                gVar.mo28212l("ExpectFollowOn", new C94676ag(fVar));
            } else {
                Objects.requireNonNull(fVar);
                gVar.mo28212l("ConversationComplete", new C94677ah(fVar));
            }
        }
        return C118826c.f331423b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f264868a.mo60297gq(), this.f264869c.mo60297gq(), this.f264870d.mo60297gq(), this.f264871e.mo60297gq(), this.f264872f.mo60297gq(), this.f264873g.mo60297gq());
    }
}
