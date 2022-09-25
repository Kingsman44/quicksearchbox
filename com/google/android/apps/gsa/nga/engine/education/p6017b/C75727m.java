package com.google.android.apps.gsa.nga.engine.education.p6017b;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.engine.p5964av.C75155d;
import com.google.android.apps.gsa.nga.engine.p6044n.C76248a;
import com.google.android.apps.gsa.nga.engine.p6044n.C76401e;
import com.google.android.apps.gsa.nga.engine.p6056o.C77422p;
import com.google.android.apps.gsa.nga.engine.recognition.C77551ad;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80590x;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80987g;
import com.google.android.apps.gsa.nga.shared.p6345h.C81315k;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import dagger.C68214a;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.b.m */
/* compiled from: PG */
public final class C75727m implements C77422p, C75155d {

    /* renamed from: a */
    public static final C58974d f210186a = C58974d.m91136j();

    /* renamed from: b */
    public static final C58528ij f210187b = C58528ij.m90015O(C80590x.EXPLORE, C80590x.ONE_LEARNING_CENTER, C80590x.UPDATES_CENTER, C80590x.OOBE, C80590x.LENS, C80590x.BISTO, C80590x.HISTORY, C80590x.HOMESCREEN_ENTRY_POINT, C80590x.VOICE_MATCH, C80590x.ASSISTANT_ON_LOCKSCREEN, C80590x.NEST_PROMO, C80590x.TELL_MY_FAMILY);

    /* renamed from: c */
    private final AtomicReference f210188c = new AtomicReference();

    /* renamed from: d */
    private final C60950i f210189d;

    /* renamed from: e */
    private final C81315k f210190e;

    /* renamed from: f */
    private final C91142g f210191f;

    /* renamed from: g */
    private final C68214a f210192g;

    /* renamed from: h */
    private final AtomicReference f210193h = new AtomicReference(true);

    public C75727m(C60950i iVar, C81315k kVar, C91142g gVar, C68214a aVar) {
        this.f210189d = iVar;
        this.f210190e = kVar;
        this.f210191f = gVar;
        this.f210192g = aVar;
    }

    /* renamed from: g */
    private final void m122060g(C76401e eVar) {
        this.f210193h.get();
        if (((Boolean) this.f210193h.get()).booleanValue()) {
            ac b = eVar.mo72186d().b();
            if (!b.equals(this.f210188c.getAndSet(b)) && !Collection.EL.stream(((C76248a) eVar).f211268a.mo72528e().f220658a).anyMatch(C75723i.f210182a)) {
                if (eVar.mo72187e().mo71153f().equals(C77551ad.S3) || eVar.mo72187e().mo71153f().equals(C77551ad.SODA_PREDICTION) || eVar.mo72187e().mo71153f().equals(C77551ad.ASR) || eVar.mo72187e().mo71153f().equals(C77551ad.JINN) || eVar.mo72187e().mo71153f().equals(C77551ad.JINN_RERANK) || eVar.mo72187e().mo71153f().equals(C77551ad.ANDROID_RECOGNIZER)) {
                    C80905at.m128763g(this.f210190e.mo74871S(), C75724j.f210183a);
                }
                C80905at.m128763g(this.f210190e.mo74868P(this.f210189d.mo57444a().toEpochMilli()), C75725k.f210184a);
            }
        }
    }

    /* renamed from: h */
    private static boolean m122061h(C76401e eVar) {
        Optional m = ((C76248a) eVar).f211269b.mo71335j().mo71467m();
        e eVar2 = e.bb;
        Objects.requireNonNull(eVar2);
        return ((Boolean) m.map(new C75722h(eVar2)).orElse(false)).booleanValue();
    }

    /* renamed from: i */
    private final boolean m122062i() {
        return this.f210191f.mo85405j(C90126fx.f251177dr);
    }

    /* renamed from: a */
    public final void mo71137a(C75077bo boVar, C75077bo boVar2) {
        if (!this.f210191f.mo85405j(C90037cp.f248441aV)) {
            this.f210193h.set(true);
        } else {
            this.f210193h.set(Boolean.valueOf(true ^ ((C80987g) this.f210192g.mo27525b()).mo74770g()));
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo71138b(bl blVar) {
    }

    /* renamed from: c */
    public final void mo71390c(C76401e eVar) {
        if (!this.f210191f.mo85405j(C90037cp.f248560ci) && !m122061h(eVar) && !m122062i()) {
            m122060g(eVar);
        }
    }

    /* renamed from: d */
    public final void mo71391d(C76401e eVar) {
        if (m122061h(eVar)) {
            C80905at.m128763g(this.f210190e.mo74862J(eVar.mo72187e().mo71163q()), C75726l.f210185a);
        } else if (!this.f210191f.mo85405j(C90037cp.f248560ci) && m122062i()) {
            m122060g(eVar);
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void mo71392e() {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo71393f() {
    }
}
