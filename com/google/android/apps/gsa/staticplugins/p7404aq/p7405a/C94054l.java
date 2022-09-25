package com.google.android.apps.gsa.staticplugins.p7404aq.p7405a;

import android.os.ConditionVariable;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84425ag;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84452s;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84453t;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.gms.appdatasearch.C142787ac;
import com.google.android.gms.appdatasearch.C142797am;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.appdatasearch.Section;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5195a.p5196a.C66421a;
import com.google.speech.p5195a.p5196a.C66422b;
import com.google.speech.p5195a.p5196a.C66423c;
import com.google.speech.p5195a.p5196a.C66425e;
import com.google.speech.p5195a.p5196a.C66427g;
import com.google.speech.p5195a.p5196a.C66428h;
import com.google.speech.p5195a.p5196a.C66429i;
import com.google.speech.p5195a.p5196a.C66446z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.aq.a.l */
/* compiled from: PG */
public final class C94054l implements C94055m {

    /* renamed from: a */
    private static final C59071e f262716a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.aq.a.l");

    /* renamed from: b */
    private static final QuerySpecification f262717b;

    /* renamed from: c */
    private static final QuerySpecification f262718c;

    /* renamed from: d */
    private static final QuerySpecification f262719d;

    /* renamed from: e */
    private static final QuerySpecification f262720e;

    /* renamed from: f */
    private static final Comparator f262721f = new C94053k();

    /* renamed from: g */
    private final C84425ag f262722g;

    static {
        C142787ac acVar = new C142787ac();
        acVar.mo117690b(new Section("song", false, 0));
        f262717b = acVar.mo117689a();
        C142787ac acVar2 = new C142787ac();
        acVar2.mo117690b(new Section("album", false, 0));
        f262718c = acVar2.mo117689a();
        C142787ac acVar3 = new C142787ac();
        acVar3.mo117690b(new Section("playlist", false, 0));
        f262719d = acVar3.mo117689a();
        C142787ac acVar4 = new C142787ac();
        acVar4.mo117690b(new Section("artist", false, 0));
        f262720e = acVar4.mo117689a();
    }

    public C94054l(C84425ag agVar) {
        this.f262722g = agVar;
    }

    /* renamed from: b */
    private final List m155255b(String str, int i, QuerySpecification querySpecification) {
        SearchResults searchResults;
        C84425ag agVar = this.f262722g;
        if (agVar != null) {
            C90748e.m148224b();
            ConditionVariable conditionVariable = new ConditionVariable();
            SearchResults[] searchResultsArr = new SearchResults[1];
            agVar.mo77997c();
            agVar.f229721d.mo28212l("query", new C84452s(agVar, searchResultsArr, new String[]{str}, i, querySpecification, conditionVariable));
            agVar.f229721d.mo28212l("maybeDisconnect", new C84453t(agVar));
            conditionVariable.block();
            searchResults = searchResultsArr[0];
        } else {
            searchResults = null;
        }
        if (searchResults == null || searchResults.f387543g == 0) {
            C58976aa aaVar = C58975e.f156826a;
            return new ArrayList();
        }
        C58976aa aaVar2 = C58975e.f156826a;
        ArrayList arrayList = new ArrayList(searchResults.f387543g);
        C142797am amVar = new C142797am(searchResults);
        while (amVar.hasNext()) {
            String h = amVar.next().mo117712h(((Section) querySpecification.f387497c.get(0)).f387556a);
            if (h == null) {
                C59104x d = f262716a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "MusicNamesContextBuilde");
                ((C59052c) ((C59052c) d).mo56372aa(19470)).mo56386p("wanted section name null");
            } else {
                C66428h hVar = (C66428h) C66429i.f180626d.createBuilder();
                hVar.copyOnWrite();
                C66429i iVar = (C66429i) hVar.instance;
                iVar.f180628a |= 1;
                iVar.f180629b = h;
                C66429i iVar2 = (C66429i) hVar.build();
                try {
                    iVar2.getSerializedSize();
                    arrayList.add(iVar2);
                } catch (Exception e) {
                    Exception exc = e;
                    C59104x c = f262716a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "MusicNamesContextBuilde");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(19468)).mo56389s("Malformed unicode name %s", h);
                }
            }
        }
        Collections.sort(arrayList, f262721f);
        return arrayList;
    }

    /* renamed from: a */
    public final C66422b mo88310a(String str) {
        C66421a aVar = (C66421a) C66422b.f180605k.createBuilder();
        if (this.f262722g == null) {
            C59104x c = f262716a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MusicNamesContextBuilde");
            ((C59052c) ((C59052c) c).mo56372aa(19466)).mo56386p("icing connection null");
        } else {
            List[] listArr = {m155255b("songs", 500, f262717b), m155255b("playlists", 100, f262719d), m155255b("artists", 100, f262720e), m155255b("albums", 100, f262718c)};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 4; i++) {
                arrayList.addAll(listArr[i]);
            }
            C66423c cVar = (C66423c) C66446z.f180663j.createBuilder();
            cVar.copyOnWrite();
            C66446z zVar = (C66446z) cVar.instance;
            zVar.f180666b = 7;
            zVar.f180665a |= 1;
            C66425e eVar = (C66425e) C66427g.f180621d.createBuilder();
            eVar.copyOnWrite();
            C66427g gVar = (C66427g) eVar.instance;
            gVar.f180624b = 3;
            gVar.f180623a = 1 | gVar.f180623a;
            eVar.mo59626a(arrayList);
            cVar.copyOnWrite();
            C66446z zVar2 = (C66446z) cVar.instance;
            C66427g gVar2 = (C66427g) eVar.build();
            gVar2.getClass();
            zVar2.f180673i = gVar2;
            zVar2.f180665a |= 1024;
            aVar.mo59624c((C66446z) cVar.build());
        }
        return (C66422b) aVar.build();
    }
}
