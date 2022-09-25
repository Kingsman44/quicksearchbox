package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d;

import com.google.android.apps.gsa.p6486s.C84273m;
import com.google.android.apps.gsa.p6486s.C84274n;
import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115467k;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115470n;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.m */
/* compiled from: PG */
public final class C115400m extends C23056g implements C115467k, C84273m {

    /* renamed from: a */
    public static final C59071e f320197a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opamediaplayer.d.m");

    /* renamed from: b */
    public final C115470n f320198b;

    /* renamed from: c */
    public final C84274n f320199c;

    /* renamed from: d */
    public final C22871g f320200d;

    public C115400m(C23052c cVar, C115470n nVar, C84274n nVar2, C22871g gVar) {
        super(cVar);
        this.f320198b = nVar;
        this.f320199c = nVar2;
        this.f320200d = gVar;
    }

    /* renamed from: a */
    public final void mo77783a(C52176ia iaVar) {
    }

    /* renamed from: b */
    public final void mo77784b(C84275o oVar) {
        this.f320200d.mo28212l("update-playback-state-proto", new C115399l(this, oVar));
    }

    /* renamed from: e */
    public final void mo102044e() {
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
        C52174hz hzVar = (C52174hz) C23245b.m43557b(protoParcelable, C52174hz.f136892m.getParserForType(), C62921ba.m95368a(), true);
        hzVar.getClass();
        ((C23251a) this.f320198b.mo102031b()).mo28730f(hzVar, false);
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        this.f320199c.mo77791g(this);
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        this.f320199c.mo77792h(this);
    }
}
