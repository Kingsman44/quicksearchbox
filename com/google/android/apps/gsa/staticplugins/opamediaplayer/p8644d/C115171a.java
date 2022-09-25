package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d;

import com.google.android.apps.gsa.p6486s.C84273m;
import com.google.android.apps.gsa.p6486s.C84274n;
import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.shared.p7129r.C90464f;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115421a;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115460d;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.a */
/* compiled from: PG */
public final class C115171a extends C23056g implements C115421a, C84273m {

    /* renamed from: a */
    public final C90464f f319636a;

    /* renamed from: b */
    public C58833ax f319637b = C58836b.f156633a;

    /* renamed from: c */
    private final C115460d f319638c;

    /* renamed from: d */
    private final C84274n f319639d;

    public C115171a(C23052c cVar, C115460d dVar, C84274n nVar, C90464f fVar) {
        super(cVar);
        this.f319638c = dVar;
        this.f319636a = fVar;
        this.f319639d = nVar;
    }

    /* renamed from: a */
    public final void mo77783a(C52176ia iaVar) {
    }

    /* renamed from: b */
    public final void mo77784b(C84275o oVar) {
        this.f319637b = C58833ax.m90833j(oVar);
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C23251a aVar = ((C115202c) this.f319638c).f319703a;
        C52176ia iaVar = (C52176ia) C23245b.m43557b(protoParcelable, C52176ia.f136911k.getParserForType(), C62921ba.m95368a(), true);
        iaVar.getClass();
        aVar.mo28730f(iaVar, false);
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        this.f319639d.mo77791g(this);
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        this.f319639d.mo77792h(this);
    }
}
