package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import android.os.Parcelable;
import android.support.p033v7.widget.LinearLayoutManager;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91417d;
import com.google.android.apps.gsa.sidekick.main.p7205h.p7206a.C91405d;
import com.google.android.apps.gsa.sidekick.shared.cards.C91684am;
import com.google.android.apps.gsa.sidekick.shared.cards.C91685an;
import com.google.android.apps.gsa.sidekick.shared.cards.C91704s;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91664c;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91667f;
import com.google.android.apps.gsa.sidekick.shared.monet.util.C91856d;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91863e;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91866h;
import com.google.android.apps.gsa.sidekick.shared.p7231b.C91647a;
import com.google.android.apps.gsa.sidekick.shared.p7234d.C91713a;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.android.apps.gsa.sidekick.shared.util.C91994m;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8106b.C104480p;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104501ar;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7664fj;
import com.google.p375ai.p378b.C7665fk;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C8142xb;
import com.google.p375ai.p378b.C8178yk;
import com.google.protobuf.C62921ba;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.ep */
/* compiled from: PG */
public final class C104656ep extends C23056g implements C91856d {

    /* renamed from: e */
    private static final C59071e f291436e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.ep");

    /* renamed from: a */
    public final C91417d f291437a;

    /* renamed from: b */
    public final C91405d f291438b;

    /* renamed from: c */
    C91664c f291439c;

    /* renamed from: d */
    public C104655eo f291440d;

    /* renamed from: f */
    private final CardRenderingContext f291441f;

    /* renamed from: g */
    private final C68214a f291442g;

    /* renamed from: h */
    private final C91647a f291443h;

    /* renamed from: i */
    private final C91713a f291444i;

    /* renamed from: j */
    private final C104480p f291445j;

    /* renamed from: k */
    private final C91866h f291446k;

    /* renamed from: l */
    private final C91863e f291447l;

    /* renamed from: m */
    private final C86124t f291448m;

    /* renamed from: n */
    private final C8142xb f291449n;

    /* renamed from: o */
    private final C86106b f291450o;

    public C104656ep(C23052c cVar, C104480p pVar, C68214a aVar, CardRenderingContext cardRenderingContext, C91866h hVar, C91863e eVar, C86124t tVar, C86106b bVar, C91647a aVar2, C91713a aVar3, C8142xb xbVar, C91417d dVar, C91405d dVar2) {
        super(cVar);
        this.f291445j = pVar;
        this.f291442g = aVar;
        this.f291441f = cardRenderingContext;
        this.f291446k = hVar;
        this.f291447l = eVar;
        this.f291448m = tVar;
        this.f291450o = bVar;
        this.f291443h = aVar2;
        this.f291444i = aVar3;
        this.f291449n = xbVar;
        this.f291437a = dVar;
        this.f291438b = dVar2;
    }

    /* renamed from: N */
    public final void mo28493N(String str, String str2, Parcelable parcelable) {
        C91664c cVar;
        if (!"EVENT_BUTTON_CLICK".equals(str)) {
            return;
        }
        if ("EVENT_SOURCE_BUTTON_ONE".equals(str2)) {
            C91664c cVar2 = this.f291439c;
            if (cVar2 != null) {
                cVar2.mo86077a(cVar2.f255656e, (C91684am) null);
            }
        } else if ("EVENT_SOURCE_BUTTON_TWO".equals(str2) && (cVar = this.f291439c) != null) {
            C7681g gVar = cVar.f255657f;
            C7718hj hjVar = cVar.f255655d;
            if (hjVar != null) {
                mo94289e(gVar, hjVar);
            }
            C91664c cVar3 = this.f291439c;
            cVar3.mo86077a(cVar3.f255657f, cVar3.f255658g);
        }
    }

    /* renamed from: b */
    public final long mo86358b() {
        C91664c cVar = this.f291439c;
        C7718hj hjVar = cVar != null ? cVar.f255655d : null;
        if (hjVar != null) {
            return C91994m.m150995b(hjVar);
        }
        return 0;
    }

    /* renamed from: e */
    public final void mo94289e(C7681g gVar, C7718hj hjVar) {
        C8178yk a = this.f291446k.mo86388a(C91978bb.m150937c(hjVar, gVar, new C7681g[0]), hjVar);
        if (a != null) {
            this.f291447l.mo86386c(a, this.f291450o.mo79727b(), this.f291446k.mo86390c(hjVar, this.f291449n, this.f291448m), false);
        }
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C7718hj hjVar;
        String str;
        String str2;
        C104501ar arVar = (C104501ar) C23245b.m43557b(protoParcelable, C104501ar.f290649d.getParserForType(), C62921ba.m95368a(), true);
        arVar.getClass();
        C91664c cVar = null;
        if ((arVar.f290651a & 1) != 0) {
            hjVar = arVar.f290652b;
            if (hjVar == null) {
                hjVar = C7718hj.f26927af;
            }
        } else {
            hjVar = null;
        }
        C91667f fVar = (C91667f) ((C91704s) this.f291442g.mo27525b()).mo86201g(hjVar, arVar.f290653c, this.f291441f);
        if (fVar == null) {
            ((C59052c) ((C59052c) f291436e.mo56225c()).mo56372aa(22031)).mo56386p("Could not find EntryAdapter for entryTreeNode");
            return;
        }
        C104652el elVar = new C104652el(this);
        C91647a aVar = this.f291443h;
        C91713a aVar2 = this.f291444i;
        C7718hj g = fVar.mo86085g();
        if (C91685an.m150077b(g)) {
            C7708h c = C91978bb.m150937c(g, C7681g.LIKE_CARD, new C7681g[0]);
            C7708h c2 = C91978bb.m150937c(g, C7681g.DISLIKE_CARD, new C7681g[0]);
            if (!(c == null || c2 == null)) {
                C7665fk fkVar = g.f26942N;
                if (fkVar == null) {
                    fkVar = C7665fk.f26611e;
                }
                String str3 = fkVar.f26614b;
                C7665fk fkVar2 = g.f26942N;
                if (fkVar2 == null) {
                    fkVar2 = C7665fk.f26611e;
                }
                Optional a = C91685an.m150076a(fkVar2, C7681g.LIKE_CARD);
                boolean isPresent = a.isPresent();
                String str4 = BuildConfig.FLAVOR;
                String str5 = isPresent ? ((C7664fj) a.get()).f26604b : str4;
                C7665fk fkVar3 = g.f26942N;
                if (fkVar3 == null) {
                    fkVar3 = C7665fk.f26611e;
                }
                Optional a2 = C91685an.m150076a(fkVar3, C7681g.DISLIKE_CARD);
                if (a2.isPresent()) {
                    str4 = ((C7664fj) a2.get()).f26604b;
                }
                if ((g.f26955a & LinearLayoutManager.INVALID_OFFSET) == 0 || (!str3.isEmpty() && !str5.isEmpty() && !str4.isEmpty())) {
                    str = str5;
                    str2 = str4;
                } else {
                    str3 = g.f26939K;
                    str = c.f26898c;
                    str2 = c2.f26898c;
                }
                if (!str3.isEmpty() && !str.isEmpty() && !str2.isEmpty()) {
                    cVar = new C91664c(str3, str2, str, new C91684am(aVar, g), C7681g.DISLIKE_CARD, C7681g.LIKE_CARD, aVar2, elVar, g);
                }
            }
        }
        if (cVar != null) {
            cVar.f255659h = new C104653em(this);
            this.f291439c = cVar;
            ((C23251a) this.f291445j.mo94228c()).mo28730f(cVar.f255652a.toString(), false);
            ((C23251a) this.f291445j.mo94227b()).mo28730f(cVar.f255653b.toString(), false);
            ((C23251a) this.f291445j.mo94229d()).mo28730f(cVar.f255654c.toString(), false);
            return;
        }
        ((C59052c) ((C59052c) f291436e.mo56225c()).mo56372aa(22030)).mo56386p("Could not create voice of google question for entryTreeNode.");
    }
}
