package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85349r;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85350s;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90125fw;
import com.google.android.apps.gsa.shared.p7129r.C90464f;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115449s;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115452v;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1901b.C23149a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.et */
/* compiled from: PG */
public final class C115331et extends C23056g implements C115449s {

    /* renamed from: a */
    public static final C59071e f319984a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.et");

    /* renamed from: b */
    public final C115452v f319985b;

    /* renamed from: c */
    public final C22871g f319986c;

    /* renamed from: d */
    public final C23149a f319987d;

    /* renamed from: e */
    public final C115347fi f319988e;

    /* renamed from: f */
    public final C115211ah f319989f;

    /* renamed from: g */
    public final C86124t f319990g;

    /* renamed from: h */
    public final C115315ed f319991h;

    /* renamed from: i */
    public final C85349r f319992i;

    /* renamed from: j */
    public final C85350s f319993j;

    /* renamed from: k */
    public final C22871g f319994k;

    /* renamed from: l */
    private final C115330es f319995l = new C115330es(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C115331et(C23052c cVar, C23149a aVar, C115452v vVar, C115315ed edVar, C22871g gVar, C90464f fVar, C115211ah ahVar, C86124t tVar, C85349r rVar, C85350s sVar, C22871g gVar2) {
        super(cVar);
        this.f319987d = aVar;
        C115452v vVar2 = vVar;
        this.f319985b = vVar2;
        C115315ed edVar2 = edVar;
        this.f319991h = edVar2;
        C22871g gVar3 = gVar;
        this.f319986c = gVar3;
        this.f319989f = ahVar;
        this.f319990g = tVar;
        this.f319988e = new C115347fi(aVar, edVar2, gVar3, fVar, vVar2);
        this.f319992i = rVar;
        this.f319993j = sVar;
        this.f319994k = gVar2;
    }

    /* renamed from: e */
    public final void mo101891e(int i) {
    }

    /* renamed from: f */
    public final void mo101892f(int i) {
        throw null;
    }

    /* renamed from: h */
    public final void mo101977h() {
        this.f319991h.mo101966n(this.f319986c, "get-voice-selection-option", new C115320ei(this));
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iB */
    public final void mo28497iB(C23028x xVar) {
        C58976aa aaVar = C58975e.f156826a;
        mo101977h();
        this.f319988e.mo101987d();
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C58976aa aaVar = C58975e.f156826a;
        mo101977h();
        ((C23251a) this.f319985b.mo102025d()).mo28730f(Boolean.valueOf(this.f319990g.mo79746e(C90125fw.f250914ad) && !this.f319990g.mo79746e(C90125fw.f250937p)), false);
        this.f319991h.mo101966n(this.f319986c, "wait-for-updates", new C115319eh(this));
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        C58976aa aaVar = C58975e.f156826a;
        ((C23251a) this.f319985b.mo102024c()).mo28730f((C115466j) this.f319991h.mo101954a().f319952b.mo56106b(C115321ej.f319970a).mo56109e(C115466j.f320304q), false);
        this.f319991h.mo101958f(this.f319995l, false);
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        this.f319991h.mo101964l(this.f319995l.getClass().toString());
    }
}
