package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6711dl.C85392b;
import com.google.android.apps.gsa.search.core.p6816p.C86253h;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94785f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C55349pb;
import com.google.p4152bb.p4153a.C55351pd;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.b.bh */
/* compiled from: PG */
public final class C94704bh extends C68247h {

    /* renamed from: a */
    private final C68283d f264850a;

    /* renamed from: c */
    private final C68283d f264851c;

    /* renamed from: d */
    private final C68283d f264852d;

    /* renamed from: e */
    private final C68283d f264853e;

    /* renamed from: f */
    private final C68283d f264854f;

    /* renamed from: g */
    private final C68283d f264855g;

    /* renamed from: h */
    private final C68283d f264856h;

    /* renamed from: i */
    private final C68283d f264857i;

    /* renamed from: j */
    private final C68283d f264858j;

    public C94704bh(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7, C68283d dVar8, C68283d dVar9) {
        super(aVar2, new C68277d(C94704bh.class), aVar);
        this.f264850a = C68236af.m98549d(dVar);
        this.f264851c = C68236af.m98549d(dVar2);
        this.f264852d = C68236af.m98549d(dVar3);
        this.f264853e = C68236af.m98549d(dVar4);
        this.f264854f = C68236af.m98549d(dVar5);
        this.f264855g = C68236af.m98549d(dVar6);
        this.f264856h = C68236af.m98549d(dVar7);
        this.f264857i = C68236af.m98549d(dVar8);
        this.f264858j = C68236af.m98549d(dVar9);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        C58833ax axVar2 = (C58833ax) list.get(1);
        C118826c cVar = (C118826c) list.get(2);
        C94785f fVar = (C94785f) list.get(3);
        C22871g gVar = (C22871g) list.get(4);
        C85392b bVar = (C85392b) list.get(5);
        Query query = (Query) list.get(6);
        Context context = (Context) list.get(7);
        if (!C86253h.ACTION_V2.equals(((C58833ax) list.get(8)).mo56111f())) {
            C58976aa aaVar = C58975e.f156826a;
            return C118826c.f331423b;
        }
        String str = null;
        if (!axVar.mo56113h()) {
            C59104x c = C94692aw.f264811a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoModularActionMod");
            ((C59052c) ((C59052c) c).mo56372aa(16870)).mo56386p("actionDataOptional is not present");
        } else {
            C55349pb pbVar = ((ActionData) axVar.mo56107c()).f235993c;
            if (pbVar == null) {
                C59104x c2 = C94692aw.f264811a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "BistoModularActionMod");
                ((C59052c) ((C59052c) c2).mo56372aa(16869)).mo56386p("No peanut");
            } else {
                C55351pd pdVar = pbVar.f145834c;
                if (pdVar == null) {
                    pdVar = C55351pd.f145839f;
                }
                if ((4 & pdVar.f145841a) != 0) {
                    str = pdVar.f145843c;
                } else {
                    C58976aa aaVar2 = C58975e.f156826a;
                }
            }
        }
        if (axVar2.mo56113h()) {
            TtsRequest ttsRequest = ((CardDecision) axVar2.mo56107c()).f236250d;
            if (ttsRequest != null && !ttsRequest.mo81450a().isEmpty()) {
                String ttsRequest2 = ttsRequest.toString();
                if (!ttsRequest2.equalsIgnoreCase(str)) {
                    C58976aa aaVar3 = C58975e.f156826a;
                    String languageTag = context.getResources().getConfiguration().getLocales().get(0).toLanguageTag();
                    if (axVar.mo56113h()) {
                        String e = ((ActionData) axVar.mo56107c()).mo81092e();
                        if (!TextUtils.isEmpty(e)) {
                            languageTag = e;
                        }
                    }
                    bVar.mo78915d(4, languageTag.replace('-', '_'), query, (C90606n) null, ttsRequest, true, false, ttsRequest2, C94686aq.f264801a);
                    Objects.requireNonNull(fVar);
                    return gVar.mo28202b("WaitForTtsComplete", new C94687ar(fVar));
                }
            }
        } else {
            C59104x b = C94692aw.f264811a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoModularActionMod");
            ((C59052c) ((C59052c) b).mo56372aa(16853)).mo56386p("cardDecision is absent");
        }
        C58976aa aaVar4 = C58975e.f156826a;
        Objects.requireNonNull(fVar);
        gVar.mo28212l("SendTtsToClient", new C94688as(fVar));
        Objects.requireNonNull(fVar);
        return gVar.mo28202b("WaitForTtsComplete", new C94687ar(fVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f264850a.mo60297gq(), this.f264851c.mo60297gq(), this.f264852d.mo60297gq(), this.f264853e.mo60297gq(), this.f264854f.mo60297gq(), this.f264855g.mo60297gq(), this.f264856h.mo60297gq(), this.f264857i.mo60297gq(), this.f264858j.mo60297gq());
    }
}
