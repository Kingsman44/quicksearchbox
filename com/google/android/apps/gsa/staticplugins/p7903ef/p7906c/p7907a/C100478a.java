package com.google.android.apps.gsa.staticplugins.p7903ef.p7906c.p7907a;

import com.google.android.apps.gsa.search.core.p6519al.p6709dk.C85379a;
import com.google.android.apps.gsa.search.core.service.C86771n;
import com.google.android.apps.gsa.search.core.state.p6874f.C87038e;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.OnTranscriptionUpdateEventParcelable;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88073od;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88074oe;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88075of;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88380zn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88381zo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88382zp;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.p7903ef.p7906c.p7908b.C100488a;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protobuf.C62940bt;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.ef.c.a.a */
/* compiled from: PG */
public final class C100478a implements C85379a {

    /* renamed from: b */
    private static final C59071e f280885b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ef.c.a.a");

    /* renamed from: a */
    public int f280886a = 0;

    /* renamed from: c */
    private final C68214a f280887c;

    /* renamed from: d */
    private final C68214a f280888d;

    /* renamed from: e */
    private final C68214a f280889e;

    public C100478a(C68214a aVar, C68214a aVar2, C68214a aVar3) {
        this.f280887c = aVar;
        this.f280888d = aVar2;
        this.f280889e = aVar3;
    }

    /* renamed from: k */
    private final void m166540k(int i) {
        this.f280886a = i;
        ((C100488a) this.f280888d.mo27525b()).mo91935a(i);
    }

    /* renamed from: a */
    public final void mo78900a() {
        m166540k(3);
    }

    /* renamed from: b */
    public final void mo78901b(Query query) {
        mo91933i(query);
        m166540k(9);
    }

    /* renamed from: c */
    public final void mo78902c() {
        m166540k(4);
    }

    /* renamed from: d */
    public final void mo78903d(Query query, SearchError searchError) {
        if (mo91934j(query)) {
            C87038e.m140569c(searchError, query, ((C89037bh) this.f280889e.mo27525b()).mo27377b());
            C87682aj ajVar = ((C100488a) this.f280888d.mo27525b()).f280915a;
            if (ajVar != null) {
                C87684al alVar = new C87684al(C88244um.SHOW_ERROR);
                alVar.mo81966c(new ParcelableVoiceAction(searchError));
                ((C86771n) ajVar).mo80379b(alVar.mo81964a());
                return;
            }
            return;
        }
        C59104x c = f280885b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GraphRecognition");
        ((C59052c) ((C59052c) c).mo56372aa(33450)).mo56386p("Not current commit query. Won't send the error update");
    }

    /* renamed from: e */
    public final void mo78904e() {
        m166540k(2);
    }

    /* renamed from: f */
    public final void mo78905f(Query query, List list, String str, boolean z, String str2) {
        if (mo91934j(query)) {
            C87682aj ajVar = ((C100488a) this.f280888d.mo27525b()).f280915a;
            if (ajVar != null) {
                C88074oe oeVar = (C88074oe) C88075of.f238132e.createBuilder();
                oeVar.copyOnWrite();
                C88075of ofVar = (C88075of) oeVar.instance;
                ofVar.f238134a |= 2;
                ofVar.f238136c = z;
                if (str2 != null) {
                    oeVar.copyOnWrite();
                    C88075of ofVar2 = (C88075of) oeVar.instance;
                    ofVar2.f238134a |= 4;
                    ofVar2.f238137d = str2;
                }
                if (str != null) {
                    oeVar.copyOnWrite();
                    C88075of ofVar3 = (C88075of) oeVar.instance;
                    ofVar3.f238134a |= 1;
                    ofVar3.f238135b = str;
                }
                C87684al alVar = new C87684al(C88244um.ON_TRANSCRIPTION_UPDATE);
                alVar.mo81966c(new OnTranscriptionUpdateEventParcelable(query, list));
                alVar.mo81965b(C88073od.f238131a, (C88075of) oeVar.build());
                ((C86771n) ajVar).mo80379b(alVar.mo81964a());
                return;
            }
            return;
        }
        C59104x c = f280885b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GraphRecognition");
        ((C59052c) ((C59052c) c).mo56372aa(33451)).mo56386p("Not current commit query. Won't send the transcription update.");
    }

    /* renamed from: g */
    public final void mo78906g(Query query) {
        mo91933i(query);
    }

    /* renamed from: h */
    public final void mo78907h(String str, String str2) {
        C87682aj ajVar = ((C100488a) this.f280888d.mo27525b()).f280915a;
        if (ajVar != null) {
            C87684al alVar = new C87684al(C88244um.UPDATE_RECOGNIZED_TEXT);
            C62940bt btVar = C88380zn.f238990a;
            C88381zo zoVar = (C88381zo) C88382zp.f238991e.createBuilder();
            zoVar.copyOnWrite();
            C88382zp zpVar = (C88382zp) zoVar.instance;
            str.getClass();
            zpVar.f238993a |= 1;
            zpVar.f238994b = str;
            zoVar.copyOnWrite();
            C88382zp zpVar2 = (C88382zp) zoVar.instance;
            str2.getClass();
            zpVar2.f238993a |= 2;
            zpVar2.f238995c = str2;
            alVar.mo81965b(btVar, (C88382zp) zoVar.build());
            ((C86771n) ajVar).mo80379b(alVar.mo81964a());
        }
    }

    /* renamed from: i */
    public final void mo91933i(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        if (mo91934j(query)) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 196;
            String b = C39191a.m68623b(query.f252749G);
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            b.getClass();
            ufVar2.f164093a |= 4;
            ufVar2.f164259n = b;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo91934j(Query query) {
        return ((C100487j) this.f280887c.mo27525b()).f280914a.mo84383cP(query);
    }
}
