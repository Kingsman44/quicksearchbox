package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d;

import com.google.android.apps.gsa.p6486s.C84269i;
import com.google.android.apps.gsa.p6486s.C84271k;
import com.google.android.apps.gsa.p6486s.C84273m;
import com.google.android.apps.gsa.p6486s.C84274n;
import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115475s;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115478v;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.u */
/* compiled from: PG */
public final class C115408u extends C23056g implements C84273m, C115475s {

    /* renamed from: a */
    public static final C59071e f320210a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opamediaplayer.d.u");

    /* renamed from: b */
    public final C68214a f320211b;

    /* renamed from: c */
    public final C115478v f320212c;

    /* renamed from: d */
    public final C84274n f320213d;

    /* renamed from: e */
    public final C22871g f320214e;

    public C115408u(C23052c cVar, C115478v vVar, C84274n nVar, C22871g gVar, C68214a aVar) {
        super(cVar);
        this.f320212c = vVar;
        this.f320213d = nVar;
        this.f320214e = gVar;
        this.f320211b = aVar;
    }

    /* renamed from: j */
    private final void m191389j(C60870cx cxVar, C84269i iVar) {
        new C90873ag(cxVar, this.f320214e, "perform-playback-action", new C115403p()).mo85223a(new C115404q(iVar));
    }

    /* renamed from: a */
    public final void mo77783a(C52176ia iaVar) {
        this.f320214e.mo28212l("update-media-data", new C115402o(this, iaVar));
    }

    /* renamed from: b */
    public final void mo77784b(C84275o oVar) {
        this.f320214e.mo28212l("update-playback-state", new C115407t(this, oVar));
    }

    /* renamed from: e */
    public final void mo102045e(long j) {
        throw null;
    }

    /* renamed from: f */
    public final void mo102046f() {
        throw null;
    }

    /* renamed from: h */
    public final void mo102047h(C84269i iVar) {
        m191389j(this.f320213d.mo77787c(iVar), iVar);
    }

    /* renamed from: i */
    public final void mo102048i(C84269i iVar, C84271k kVar) {
        m191389j(this.f320213d.mo77788d(iVar, kVar), iVar);
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iB */
    public final void mo28497iB(C23028x xVar) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C58976aa aaVar = C58975e.f156826a;
        C52176ia iaVar = (C52176ia) C23245b.m43557b(protoParcelable, C52176ia.f136911k.getParserForType(), C62921ba.m95368a(), true);
        iaVar.getClass();
        ((C23251a) this.f320212c.mo102033b()).mo28730f(iaVar, false);
        ((C23251a) this.f320212c.mo102036e()).mo28730f(Float.valueOf(1.0f), false);
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        this.f320213d.mo77791g(this);
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        this.f320213d.mo77792h(this);
    }
}
