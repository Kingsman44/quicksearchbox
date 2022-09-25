package com.google.android.apps.gsa.staticplugins.p7429b.p7430a;

import com.google.android.apps.gsa.search.core.p6884y.C87290c;
import com.google.android.apps.gsa.shared.monet.p7070b.p7083b.C90217b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7083b.C90219d;
import com.google.android.apps.gsa.staticplugins.p7429b.p7431b.C94435a;
import com.google.android.apps.gsa.staticplugins.p7429b.p7431b.C94438d;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.service.C23058i;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.b.a.d */
/* compiled from: PG */
public final class C94432d extends C23056g implements C94435a {

    /* renamed from: a */
    public final C94438d f264012a;

    /* renamed from: b */
    public boolean f264013b = false;

    /* renamed from: c */
    public final C87290c f264014c;

    /* renamed from: d */
    private final C23058i f264015d;

    /* renamed from: e */
    private final C22871g f264016e;

    public C94432d(C23052c cVar, C94438d dVar, C23058i iVar, C87290c cVar2, C22871g gVar) {
        super(cVar);
        this.f264012a = dVar;
        this.f264015d = iVar;
        this.f264014c = cVar2;
        this.f264016e = gVar;
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C90217b bVar = (C90217b) C23245b.m43557b(protoParcelable, C90217b.f252031g.getParserForType(), C62921ba.f169869a, true);
        bVar.getClass();
        if ((bVar.f252033a & 8) != 0) {
            C23251a aVar = ((C94434f) this.f264012a).f264023d;
            C90219d dVar = bVar.f252037e;
            if (dVar == null) {
                dVar = C90219d.f252039h;
            }
            aVar.mo28730f(C58833ax.m90834k(dVar), false);
        }
        if ((bVar.f252033a & 16) != 0) {
            C23251a aVar2 = ((C94434f) this.f264012a).f264022c;
            C90219d dVar2 = bVar.f252038f;
            if (dVar2 == null) {
                dVar2 = C90219d.f252039h;
            }
            aVar2.mo28730f(C58833ax.m90834k(dVar2), false);
        }
        ((C94434f) this.f264012a).f264021b.mo28730f(Integer.valueOf(bVar.f252036d), false);
        this.f264016e.mo28212l("start initial page", new C94431c(this, bVar));
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        this.f264015d.mo28500a(this.f63405W, new C94429a(this));
        ((C94434f) this.f264012a).f264020a.f63521d = new C94430b(this);
    }
}
