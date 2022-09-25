package com.google.android.apps.gsa.nowoverlayservice.p6424c.p6425a;

import android.util.LruCache;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.libraries.gsa.p1859d.p1861b.p1862a.C22750a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C59742e;
import com.google.common.p4552o.C59770f;
import com.google.common.p4552o.C60343p;
import com.google.common.p4552o.C60522t;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.c.a.ae */
/* compiled from: PG */
public final class C83490ae implements C22750a {

    /* renamed from: a */
    public static final long f227642a = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: b */
    public static final long f227643b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    public final C89859i f227644c;

    /* renamed from: d */
    public final LruCache f227645d = new LruCache(10);

    /* renamed from: e */
    private final C22871g f227646e;

    public C83490ae(C90821bm bmVar, C89859i iVar) {
        this.f227644c = iVar;
        this.f227646e = bmVar.mo85163a(C83488ac.class);
    }

    /* renamed from: E */
    public static int m132904E(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return 2;
        }
        if (i2 != 1) {
            return i2 != 3 ? 1 : 4;
        }
        return 3;
    }

    /* renamed from: J */
    private static C89856f m132905J(C83489ad adVar, C89849ae aeVar) {
        C89856f fVar = new C89856f();
        fVar.mo83701c("internal_request_id", adVar.f227637a);
        fVar.f246201a = aeVar;
        return fVar;
    }

    /* renamed from: b */
    public static C89856f m132906b(C83489ad adVar, C89849ae aeVar) {
        C89856f J = m132905J(adVar, aeVar);
        C59582aj ajVar = adVar.f227638b;
        C60522t tVar = (C60522t) adVar.f227639c.build();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        C59687cb cbVar2 = C59687cb.f160034bf;
        tVar.getClass();
        cbVar.f160074aL = tVar;
        cbVar.f160123d |= 16;
        J.f246203c = (C59687cb) ajVar.build();
        return J;
    }

    /* renamed from: A */
    public final void mo27915A(String str) {
        this.f227646e.mo28212l("sharedOverlayEnabled", new C83506p(this, str));
    }

    /* renamed from: B */
    public final void mo27916B(String str) {
        this.f227646e.mo28212l("snoControllerCreated", new C83515y(this, str));
    }

    /* renamed from: C */
    public final void mo76824C(C83489ad adVar, int i, int i2, C89849ae aeVar) {
        if (adVar.f227641e == i) {
            mo76829e(adVar, aeVar);
            adVar.f227641e = i2;
            return;
        }
        mo76825F(adVar, C89849ae.ACETONE_OVERLAY_FLOW_CANCELED, 3);
    }

    /* renamed from: D */
    public final void mo27917D(String str, float f, int i) {
        this.f227646e.mo28212l("logSlideFraction", new C83502l(this, str, f, i));
    }

    /* renamed from: F */
    public final void mo76825F(C83489ad adVar, C89849ae aeVar, int i) {
        C60343p pVar = adVar.f227639c;
        pVar.copyOnWrite();
        C60522t tVar = (C60522t) pVar.instance;
        C60522t tVar2 = C60522t.f163843r;
        tVar.f163855k = i - 1;
        tVar.f163845a |= 512;
        mo76828d(adVar, aeVar);
    }

    /* renamed from: G */
    public final void mo27918G(String str, int i) {
        this.f227646e.mo28212l("acetoneOnCloseOverlayInitiated", new C83494d(this, str, i));
    }

    /* renamed from: H */
    public final void mo27919H(String str, int i) {
        this.f227646e.mo28212l("acetoneOnOpenOverlayInitiated", new C83485a(this, str, i));
    }

    /* renamed from: I */
    public final void mo76826I(C83489ad adVar, C89885b bVar) {
        C59742e eVar = (C59742e) C59770f.f161501d.createBuilder();
        eVar.copyOnWrite();
        C59770f fVar = (C59770f) eVar.instance;
        fVar.f161503a |= 1;
        fVar.f161504b = 0;
        int i = bVar.f246280a;
        eVar.copyOnWrite();
        C59770f fVar2 = (C59770f) eVar.instance;
        fVar2.f161503a |= 2;
        fVar2.f161505c = i;
        adVar.f227638b.mo57008e((C59770f) eVar.build());
        mo76828d(adVar, C89849ae.ACETONE_OVERLAY_ATTACH_FAILED);
    }

    /* renamed from: a */
    public final C83489ad mo76827a(String str, long j) {
        C83489ad adVar = (C83489ad) this.f227645d.get(str);
        if (adVar != null) {
            mo76825F(adVar, C89849ae.ACETONE_OVERLAY_FLOW_CANCELED, 2);
        }
        C83489ad adVar2 = new C83489ad(str);
        adVar2.f227640d = this.f227646e.mo28208h("acetoneAppFlowTimeout", j, new C83501k(this, adVar2));
        this.f227645d.put(str, adVar2);
        return adVar2;
    }

    /* renamed from: c */
    public final void mo27920c(String str, Optional optional) {
        this.f227646e.mo28212l("logDiscoverFragmentAge", new C83512v(this, str, optional));
    }

    /* renamed from: d */
    public final void mo76828d(C83489ad adVar, C89849ae aeVar) {
        if (adVar.f227640d != null) {
            adVar.f227640d.cancel(true);
            adVar.f227640d = null;
        }
        this.f227644c.mo74236a(m132906b(adVar, aeVar).mo83699a());
        this.f227645d.remove(adVar.f227637a);
    }

    /* renamed from: e */
    public final void mo76829e(C83489ad adVar, C89849ae aeVar) {
        this.f227644c.mo74236a(m132905J(adVar, aeVar).mo83699a());
    }

    /* renamed from: f */
    public final void mo27921f(String str, int i, boolean z, boolean z2, boolean z3) {
        this.f227646e.mo28212l("acetoneLogServiceOptions", new C83487ab(this, str, z2, i, z, z3));
    }

    /* renamed from: g */
    public final void mo27922g(String str) {
        this.f227646e.mo28212l("acetoneAttachDone", new C83513w(this, str));
    }

    /* renamed from: h */
    public final void mo27923h(String str) {
        this.f227646e.mo28212l("acetoneAttachFailedDueToBadToken", new C83495e(this, str));
    }

    /* renamed from: i */
    public final void mo27924i(String str) {
        this.f227646e.mo28212l("attachFailedWithUnknownError", new C83511u(this, str));
    }

    /* renamed from: j */
    public final void mo27925j(String str) {
        this.f227646e.mo28212l("acetoneAttachNoCreate", new C83503m(this, str));
    }

    /* renamed from: k */
    public final void mo27926k(String str) {
        this.f227646e.mo28212l("acetoneAttachRestoreSavedState", new C83498h(this, str));
    }

    /* renamed from: l */
    public final void mo27927l(String str) {
        this.f227646e.mo28212l("acetoneAttachStarted", new C83493c(this, str));
    }

    /* renamed from: m */
    public final void mo27928m(String str) {
        this.f227646e.mo28212l("attachedInBackgroundMode", new C83499i(this, str));
    }

    /* renamed from: n */
    public final void mo27929n(String str) {
        this.f227646e.mo28212l("attachedToWindow", new C83510t(this, str));
    }

    /* renamed from: o */
    public final void mo27930o(String str) {
        this.f227646e.mo28212l("acetoneOverlayControllerCreate", new C83504n(this, str));
    }

    /* renamed from: p */
    public final void mo27931p(String str) {
        this.f227646e.mo28212l("acetoneOverlayControllerDestroy", new C83500j(this, str));
    }

    /* renamed from: q */
    public final void mo27932q(String str) {
        this.f227646e.mo28212l("acetoneOverlayControllerPause", new C83486aa(this, str));
    }

    /* renamed from: r */
    public final void mo27933r(String str) {
        this.f227646e.mo28212l("acetoneOverlayControllerResume", new C83507q(this, str));
    }

    /* renamed from: s */
    public final void mo27934s(String str) {
        this.f227646e.mo28212l("acetoneOverlayControllerStart", new C83505o(this, str));
    }

    /* renamed from: t */
    public final void mo27935t(String str) {
        this.f227646e.mo28212l("acetoneOverlayControllerStop", new C83496f(this, str));
    }

    /* renamed from: u */
    public final void mo27936u(String str) {
        this.f227646e.mo28212l("createNewController", new C83508r(this, str));
    }

    /* renamed from: v */
    public final void mo27937v(String str, String str2) {
        this.f227646e.mo28212l("headerBindingComplete", new C83492b(this, str, str2));
    }

    /* renamed from: w */
    public final void mo27938w(String str) {
        this.f227646e.mo28212l("acetoneOverlayClosed", new C83516z(this, str));
    }

    /* renamed from: x */
    public final void mo27939x(String str, boolean z) {
        this.f227646e.mo28212l("acetoneOverlayOpened", new C83514x(this, str, z));
    }

    /* renamed from: y */
    public final void mo27940y(String str) {
        this.f227646e.mo28212l("RecreateNewController", new C83509s(this, str));
    }

    /* renamed from: z */
    public final void mo27941z(String str) {
        this.f227646e.mo28212l("acetoneSharedOverlayContentToggle", new C83497g(this, str));
    }
}
