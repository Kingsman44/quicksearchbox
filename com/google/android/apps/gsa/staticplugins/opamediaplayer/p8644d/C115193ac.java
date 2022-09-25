package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d;

import com.google.android.apps.gsa.p6486s.C84273m;
import com.google.android.apps.gsa.p6486s.C84274n;
import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.shared.p7129r.C90464f;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115479w;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115482z;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1901b.C23149a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.ac */
/* compiled from: PG */
public final class C115193ac extends C23056g implements C115479w, C84273m {

    /* renamed from: a */
    public static final C59071e f319687a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opamediaplayer.d.ac");

    /* renamed from: b */
    public final C115482z f319688b;

    /* renamed from: c */
    public final C84274n f319689c;

    /* renamed from: d */
    public final C22871g f319690d;

    /* renamed from: e */
    public final C23149a f319691e;

    /* renamed from: f */
    public final C90464f f319692f;

    /* renamed from: g */
    public C84275o f319693g;

    public C115193ac(C23052c cVar, C23149a aVar, C115482z zVar, C84274n nVar, C90464f fVar, C22871g gVar) {
        super(cVar);
        this.f319691e = aVar;
        this.f319688b = zVar;
        this.f319689c = nVar;
        this.f319690d = gVar;
        this.f319692f = fVar;
    }

    /* renamed from: a */
    public final void mo77783a(C52176ia iaVar) {
        this.f319690d.mo28212l("update-media-data", new C115192ab(this, iaVar));
    }

    /* renamed from: b */
    public final void mo77784b(C84275o oVar) {
        this.f319693g = oVar;
        this.f319690d.mo28212l("update-playback-state-proto", new C115410w(this, oVar));
    }

    /* renamed from: e */
    public final void mo101891e(int i) {
        throw null;
    }

    /* renamed from: f */
    public final void mo101892f(int i) {
        throw null;
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iB */
    public final void mo28497iB(C23028x xVar) {
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C52176ia iaVar = (C52176ia) C23245b.m43557b(protoParcelable, C52176ia.f136911k.getParserForType(), C62921ba.m95368a(), true);
        iaVar.getClass();
        ((C23251a) this.f319688b.mo102023b()).mo28730f(iaVar, false);
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        this.f319689c.mo77791g(this);
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        this.f319689c.mo77792h(this);
    }
}
