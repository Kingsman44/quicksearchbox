package com.google.android.apps.gsa.sidekick.shared.cards.p7233a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91417d;
import com.google.android.apps.gsa.sidekick.shared.cards.C91684am;
import com.google.android.apps.gsa.sidekick.shared.p7234d.C91713a;
import com.google.android.apps.gsa.sidekick.shared.p7239h.C91742e;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104651ek;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104652el;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104653em;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104654en;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104655eo;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104656ep;
import com.google.p375ai.p378b.C7664fj;
import com.google.p375ai.p378b.C7665fk;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.cards.a.c */
/* compiled from: PG */
public final class C91664c {

    /* renamed from: a */
    public final CharSequence f255652a;

    /* renamed from: b */
    public final CharSequence f255653b;

    /* renamed from: c */
    public final CharSequence f255654c;

    /* renamed from: d */
    public final C7718hj f255655d;

    /* renamed from: e */
    public final C7681g f255656e;

    /* renamed from: f */
    public final C7681g f255657f;

    /* renamed from: g */
    public final C91684am f255658g;

    /* renamed from: h */
    public C104653em f255659h;

    /* renamed from: i */
    private final C91713a f255660i;

    /* renamed from: j */
    private final C91742e f255661j;

    public C91664c(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, C91684am amVar, C7681g gVar, C7681g gVar2, C91713a aVar, C91742e eVar, C7718hj hjVar) {
        this.f255652a = charSequence;
        this.f255653b = charSequence2;
        this.f255654c = charSequence3;
        this.f255658g = amVar;
        this.f255656e = gVar;
        this.f255657f = gVar2;
        this.f255661j = eVar;
        this.f255660i = aVar;
        this.f255655d = hjVar;
    }

    /* renamed from: a */
    public final void mo86077a(C7681g gVar, C91684am amVar) {
        C7708h c;
        C104655eo eoVar;
        C7681g gVar2 = C7681g.INVALID;
        if (amVar != null) {
            amVar.f255681a.mo85969d(amVar.f255682b, C7681g.LIKE_CARD);
        }
        C7718hj hjVar = this.f255655d;
        if (hjVar != null && this.f255660i != null && (c = C91978bb.m150937c(hjVar, gVar, new C7681g[0])) != null) {
            if (c.f26902g) {
                this.f255660i.mo86207a();
            }
            if (c.f26906k) {
                C91742e eVar = this.f255661j;
                C7718hj hjVar2 = this.f255655d;
                C104656ep epVar = ((C104652el) eVar).f291432a;
                C104654en enVar = new C104654en(epVar, hjVar2);
                C7665fk fkVar = hjVar2.f26942N;
                if (fkVar == null) {
                    fkVar = C7665fk.f26611e;
                }
                Optional findFirst = Collection.EL.stream(fkVar.f26615c).filter(C104651ek.f291431a).findFirst();
                String str = findFirst.isPresent() ? ((C7664fj) findFirst.get()).f26607e : BuildConfig.FLAVOR;
                C91417d dVar = epVar.f291437a;
                if (true == str.isEmpty()) {
                    str = null;
                }
                dVar.mo85763a(epVar, hjVar2, false, true, true, str, enVar);
            }
            C104653em emVar = this.f255659h;
            if (emVar != null) {
                C104656ep epVar2 = emVar.f291433a;
                if (!c.f26906k && (eoVar = epVar2.f291440d) != null) {
                    eoVar.mo94263a();
                }
            }
        }
    }
}
