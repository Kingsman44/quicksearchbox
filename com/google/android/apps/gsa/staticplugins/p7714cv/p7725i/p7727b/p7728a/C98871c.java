package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7728a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.speech.p7272e.p7275c.C92286w;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7728a.p7731b.C98848d;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7728a.p7733d.C98891b;
import com.google.android.libraries.assistant.soda.C19245ah;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.a.c */
/* compiled from: PG */
public final class C98871c {

    /* renamed from: a */
    public final C22871g f276249a;

    /* renamed from: b */
    public final C22871g f276250b;

    /* renamed from: c */
    public final C98848d f276251c;

    /* renamed from: d */
    public final C98891b f276252d;

    /* renamed from: e */
    public final C86127w f276253e;

    /* renamed from: f */
    public final C89994f f276254f;

    /* renamed from: g */
    public final C86124t f276255g;

    /* renamed from: h */
    private final C92286w f276256h;

    public C98871c(C22871g gVar, C22871g gVar2, C98848d dVar, C98891b bVar, C92286w wVar, C86127w wVar2, C89994f fVar, C86124t tVar) {
        this.f276249a = gVar;
        this.f276250b = gVar2;
        this.f276251c = dVar;
        this.f276252d = bVar;
        this.f276256h = wVar;
        this.f276253e = wVar2;
        this.f276254f = fVar;
        this.f276255g = tVar;
    }

    /* renamed from: a */
    public final C58833ax mo91316a(String str) {
        return C58833ax.m90833j(C19245ah.m36696d((String) this.f276256h.mo86965a(str).mo56109e(BuildConfig.FLAVOR)));
    }

    /* renamed from: b */
    public final void mo91317b(int i) {
        if (this.f276255g.mo79746e(C90082eg.f249916af)) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 1604;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            ufVar2.f164256k |= 8;
            ufVar2.f164212cM = (long) i;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
    }
}
