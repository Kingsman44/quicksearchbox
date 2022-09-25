package com.google.android.apps.gsa.nga.engine.recognition.p6117g.p6118a;

import android.util.Base64;
import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.engine.p5964av.C75155d;
import com.google.android.apps.gsa.nga.engine.recognition.C77553af;
import com.google.android.apps.gsa.nga.engine.recognition.C77557aj;
import com.google.android.apps.gsa.nga.engine.recognition.C77570aw;
import com.google.android.apps.gsa.nga.engine.recognition.C77623f;
import com.google.android.apps.gsa.nga.engine.recognition.C77891w;
import com.google.android.apps.gsa.nga.engine.recognition.p6115f.C77624a;
import com.google.android.apps.gsa.nga.engine.recognition.p6115f.C77629b;
import com.google.android.apps.gsa.nga.engine.recognition.p6115f.C77631d;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80563h;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80564i;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80565j;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58889cz;
import com.google.common.p4520a.C58206am;
import com.google.common.p4520a.C58247c;
import com.google.common.p4520a.C58254i;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.speech.recognizer.p5233a.C67464l;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.g.a.q */
/* compiled from: PG */
public final class C77649q implements C75155d, C77553af, C77631d, C77629b, C77624a, C90991b {

    /* renamed from: a */
    public static final SimpleDateFormat f213868a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);

    /* renamed from: c */
    private static final C58974d f213869c = C58974d.m91136j();

    /* renamed from: b */
    public final C60950i f213870b;

    /* renamed from: d */
    private final C58247c f213871d;

    /* renamed from: e */
    private final C83334w f213872e;

    public C77649q(C58889cz czVar, C60950i iVar, C83334w wVar) {
        C58254i iVar2 = new C58254i();
        iVar2.mo54823g(10);
        iVar2.mo54824h(czVar);
        iVar2.mo54821e(12, TimeUnit.HOURS);
        this.f213871d = iVar2.mo54817a();
        this.f213870b = iVar;
        this.f213872e = wVar;
    }

    /* renamed from: j */
    private final void m124606j(ac acVar, Function function) {
        try {
            Objects.requireNonNull(function);
            DesugarAtomicReference.updateAndGet((AtomicReference) this.f213871d.mo54712b(acVar, new C77642j(acVar)), new C77643k(function));
        } catch (ExecutionException e) {
            ((C58970a) ((C58970a) ((C58970a) f213869c.mo56226d()).mo56382g(e)).mo56372aa(4338)).mo56386p("Failed updating utterance report cache");
        }
    }

    /* renamed from: a */
    public final void mo71137a(C75077bo boVar, C75077bo boVar2) {
        Optional h = boVar2.mo71464h();
        Optional h2 = boVar.mo71464h();
        if (h2.isPresent() && !h2.equals(h)) {
            m124606j((ac) h2.get(), new C77645m(this));
        }
        if (h.isPresent() && !h2.equals(h)) {
            m124606j((ac) h.get(), new C77646n(this));
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo71138b(bl blVar) {
    }

    /* renamed from: c */
    public final void mo72619c(C67464l lVar, ac acVar, boolean z) {
        m124606j(acVar, new C77641i(lVar));
    }

    /* renamed from: e */
    public final void mo72620e(C77557aj ajVar) {
        m124606j(ajVar.mo72638a().b(), new C77644l(ajVar));
    }

    /* renamed from: f */
    public final /* synthetic */ void mo72621f(C77570aw awVar) {
    }

    /* renamed from: g */
    public final void mo72756g(ac acVar) {
        AtomicReference atomicReference = (AtomicReference) ((C58206am) this.f213871d).f155647a.mo54792f(acVar);
        if (atomicReference != null) {
            C83334w wVar = this.f213872e;
            C82887ec ecVar = C82887ec.UTTERANCE_REPORT;
            C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
            C80563h hVar = (C80563h) atomicReference.get();
            dzVar.copyOnWrite();
            C82885ea eaVar = (C82885ea) dzVar.instance;
            hVar.getClass();
            eaVar.f225980b = hVar;
            eaVar.f225979a = 98;
            wVar.mo75545c(ecVar, (C82885ea) dzVar.build(), acVar.b());
        }
    }

    /* renamed from: gG */
    public final void mo72714gG(C77623f fVar) {
        m124606j(fVar.mo72755d(), new C77639g(fVar));
    }

    /* renamed from: gK */
    public final /* synthetic */ void mo72622gK(C77891w wVar) {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        if (!fVar.mo85296v()) {
            fVar.mo85291r("APA Speech");
            C80564i iVar = (C80564i) C80565j.f221147b.createBuilder();
            for (AtomicReference atomicReference : ((C58206am) this.f213871d).f155647a.values()) {
                C80563h hVar = (C80563h) atomicReference.get();
                iVar.copyOnWrite();
                C80565j jVar = (C80565j) iVar.instance;
                hVar.getClass();
                C62971cq cqVar = jVar.f221149a;
                if (!cqVar.mo58948c()) {
                    jVar.f221149a = C62942bv.mutableCopy(cqVar);
                }
                jVar.f221149a.add(hVar);
            }
            fVar.mo85293t("utterance_reports(%s)", C90752i.m148229c(Base64.encodeToString(iVar.build().toByteArray(), 2)));
        }
    }

    /* renamed from: h */
    public final void mo72757h(ac acVar) {
        m124606j(acVar, C77640h.f213859a);
    }

    /* renamed from: i */
    public final void mo72727i(ac acVar) {
        m124606j(acVar, C77647o.f213866a);
    }
}
