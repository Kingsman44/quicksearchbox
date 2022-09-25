package com.google.android.apps.gsa.nga.engine.recognition.p6114e;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.b.c.j;
import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.p6260x.C79850ah;
import com.google.android.apps.gsa.nga.engine.p6260x.C79851ai;
import com.google.android.apps.gsa.nga.engine.p6260x.C79878z;
import com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79819do;
import com.google.android.apps.gsa.nga.engine.recognition.C77549ab;
import com.google.android.apps.gsa.nga.engine.recognition.C77553af;
import com.google.android.apps.gsa.nga.engine.recognition.C77555ah;
import com.google.android.apps.gsa.nga.engine.recognition.C77556ai;
import com.google.android.apps.gsa.nga.engine.recognition.C77557aj;
import com.google.android.apps.gsa.nga.engine.recognition.C77570aw;
import com.google.android.apps.gsa.nga.engine.recognition.C77623f;
import com.google.android.apps.gsa.nga.engine.recognition.C77674j;
import com.google.android.apps.gsa.nga.engine.recognition.C77887s;
import com.google.android.apps.gsa.nga.engine.recognition.C77889u;
import com.google.android.apps.gsa.nga.engine.recognition.C77890v;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80478c;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82955gq;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82961gw;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82964gz;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.speech.recognizer.p5233a.C67464l;
import dagger.C68214a;
import java.util.Set;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.e.b */
/* compiled from: PG */
public final class C77621b implements C77549ab {

    /* renamed from: a */
    private static final C58974d f213842a = C58974d.m91136j();

    /* renamed from: b */
    private final C68214a f213843b;

    /* renamed from: c */
    private final C91142g f213844c;

    /* renamed from: d */
    private final C79851ai f213845d;

    /* renamed from: e */
    private final C83334w f213846e;

    /* renamed from: f */
    private final C79819do f213847f;

    /* renamed from: g */
    private final Optional f213848g;

    /* renamed from: h */
    private String f213849h = BuildConfig.FLAVOR;

    /* renamed from: i */
    private C79850ah f213850i = null;

    public C77621b(C68214a aVar, C91142g gVar, C79851ai aiVar, C83334w wVar, C79819do doVar, Optional optional) {
        this.f213843b = aVar;
        this.f213844c = gVar;
        this.f213845d = aiVar;
        this.f213846e = wVar;
        this.f213847f = doVar;
        this.f213848g = optional;
    }

    /* renamed from: a */
    public final void mo72601a(C67464l lVar, ac acVar, boolean z) {
        for (C77553af c : (Set) this.f213843b.mo27525b()) {
            c.mo72619c(lVar, acVar, z);
        }
    }

    /* renamed from: c */
    public final void mo72602c(C77557aj ajVar, String str) {
        long j;
        C82955gq gqVar = (C82955gq) C82964gz.f226343j.createBuilder();
        gqVar.copyOnWrite();
        C82964gz gzVar = (C82964gz) gqVar.instance;
        str.getClass();
        gzVar.f226345a |= 4;
        gzVar.f226347c = str;
        C80478c c = C79878z.m128028c(ajVar);
        gqVar.copyOnWrite();
        C82964gz gzVar2 = (C82964gz) gqVar.instance;
        gzVar2.f226349e = c.getNumber();
        gzVar2.f226345a |= 16;
        boolean isEmpty = ajVar.mo72660x().isEmpty();
        gqVar.copyOnWrite();
        C82964gz gzVar3 = (C82964gz) gqVar.instance;
        gzVar3.f226345a |= 128;
        gzVar3.f226352h = !isEmpty;
        C82961gw f = ajVar.mo72642e().mo72672f();
        gqVar.copyOnWrite();
        C82964gz gzVar4 = (C82964gz) gqVar.instance;
        f.getClass();
        gzVar4.f226348d = f;
        gzVar4.f226345a |= 8;
        if (ajVar.mo72649l().isPresent()) {
            C77556ai aiVar = C77556ai.PARTIAL;
            C77890v vVar = C77890v.UNKNOWN;
            int ordinal = ((C77890v) ajVar.mo72649l().get()).ordinal();
            if (ordinal == 0) {
                gqVar.copyOnWrite();
                C82964gz gzVar5 = (C82964gz) gqVar.instance;
                gzVar5.f226353i = 0;
                gzVar5.f226345a |= 256;
            } else if (ordinal == 1) {
                gqVar.copyOnWrite();
                C82964gz gzVar6 = (C82964gz) gqVar.instance;
                gzVar6.f226353i = 1;
                gzVar6.f226345a |= 256;
            } else if (ordinal == 2) {
                gqVar.copyOnWrite();
                C82964gz gzVar7 = (C82964gz) gqVar.instance;
                gzVar7.f226353i = 2;
                gzVar7.f226345a |= 256;
            }
        }
        C77556ai aiVar2 = C77556ai.PARTIAL;
        C77890v vVar2 = C77890v.UNKNOWN;
        int ordinal2 = ajVar.mo72641d().ordinal();
        if (ordinal2 == 0) {
            gqVar.copyOnWrite();
            C82964gz gzVar8 = (C82964gz) gqVar.instance;
            gzVar8.f226346b = 6;
            gzVar8.f226345a = 1 | gzVar8.f226345a;
        } else if (ordinal2 == 1) {
            gqVar.copyOnWrite();
            C82964gz gzVar9 = (C82964gz) gqVar.instance;
            gzVar9.f226346b = 3;
            gzVar9.f226345a = 1 | gzVar9.f226345a;
        } else if (ordinal2 == 2) {
            gqVar.copyOnWrite();
            C82964gz gzVar10 = (C82964gz) gqVar.instance;
            gzVar10.f226346b = 5;
            gzVar10.f226345a = 1 | gzVar10.f226345a;
        }
        C83334w wVar = this.f213846e;
        C82887ec ecVar = C82887ec.SPEECH_EVENT;
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        C82964gz gzVar11 = (C82964gz) gqVar.build();
        gzVar11.getClass();
        eaVar.f225980b = gzVar11;
        eaVar.f225979a = 13;
        wVar.mo75545c(ecVar, (C82885ea) dzVar.build(), ajVar.mo72638a().c());
        if (ajVar.mo72662z() && this.f213844c.mo85405j(C90082eg.f250067dx)) {
            ((C58970a) ((C58970a) f213842a.mo56224b()).mo56372aa(4335)).mo56389s("Recognized Text: %s", ajVar.mo72660x());
        }
        j a = ajVar.mo72638a();
        if (ajVar.mo72657t()) {
            C77674j jVar = new C77674j(a.b(), ajVar.mo72639b());
            for (C77553af gK : (Set) this.f213843b.mo27525b()) {
                gK.mo72622gK(jVar);
            }
        }
        if (ajVar.mo72660x().isEmpty()) {
            if (!ajVar.mo72662z()) {
                return;
            }
        } else if (!ajVar.mo72658u()) {
            C77887s sVar = new C77887s();
            sVar.mo72700b(ajVar.mo72657t());
            sVar.mo72701c(ajVar.mo72644g());
            sVar.mo72703e(ajVar.mo72661y());
            if (a != null) {
                sVar.f214571a = a;
                sVar.mo72702d(ajVar.mo72642e());
                C77570aw a2 = sVar.mo72699a();
                for (C77553af f2 : (Set) this.f213843b.mo27525b()) {
                    f2.mo72621f(a2);
                }
            } else {
                throw new NullPointerException("Null candidateIdentifier");
            }
        }
        a.e();
        ajVar.mo72641d();
        ajVar.mo72660x();
        if (this.f213844c.mo85405j(C90126fx.f251369hX) || !ajVar.mo72641d().equals(C77556ai.PARTIAL) || ajVar.mo72657t()) {
            this.f213848g.ifPresent(new C77620a(ajVar));
            if (ajVar.mo72662z()) {
                this.f213849h = BuildConfig.FLAVOR;
                C79850ah ahVar = this.f213850i;
                if (ahVar != null) {
                    ahVar.mo74257d();
                    this.f213850i = null;
                }
            } else if (!ajVar.mo72660x().equals(this.f213849h)) {
                this.f213849h = ajVar.mo72660x();
                C79850ah ahVar2 = this.f213850i;
                if (ahVar2 != null) {
                    ahVar2.mo74254a();
                }
                this.f213850i = this.f213845d.mo74252c(27, ajVar.mo72638a().c());
            }
            C77555ah c2 = ajVar.mo72640c();
            C58485gu f3 = ajVar.mo72643f();
            if (!f3.isEmpty()) {
                if (ajVar.mo72639b() == C77889u.SODA) {
                    j = this.f213844c.mo85399d(C90126fx.f251754ol);
                } else {
                    j = this.f213844c.mo85399d(C90126fx.f251753ok);
                }
                c2.mo72628f(f3.subList(0, Math.min(f3.size(), (int) j)));
            }
            C77557aj a3 = c2.mo72623a();
            this.f213847f.mo74265d(a3);
            this.f213846e.mo75546d(C82887ec.QUERY_SENSITIVE, C79878z.m128034i(a3, Optional.empty()), a3.mo72638a().c());
            for (C77553af e : (Set) this.f213843b.mo27525b()) {
                e.mo72620e(a3);
            }
        }
    }

    /* renamed from: gG */
    public final void mo72714gG(C77623f fVar) {
        for (C77553af gG : (Set) this.f213843b.mo27525b()) {
            gG.mo72714gG(fVar);
        }
    }
}
