package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8752b;

import com.google.android.apps.gsa.shared.p6995aq.C89269l;
import com.google.android.apps.gsa.shared.p6995aq.C89272o;
import com.google.android.apps.gsa.shared.p6995aq.C89280w;
import com.google.android.apps.gsa.shared.p6995aq.C89283z;
import com.google.android.apps.gsa.staticplugins.searchwidget.C117241bi;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117098j;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.b.aj */
/* compiled from: PG */
public final class C117062aj extends C23056g {

    /* renamed from: a */
    public final C117098j f325013a;

    /* renamed from: b */
    public final C117241bi f325014b;

    /* renamed from: c */
    private final C89283z f325015c;

    public C117062aj(C23052c cVar, C117098j jVar, C117241bi biVar) {
        super(cVar);
        this.f325014b = biVar;
        this.f325013a = jVar;
        this.f325015c = biVar.mo103215b();
    }

    /* renamed from: e */
    public final boolean mo103125e() {
        int a = C89280w.m145217a(this.f325015c.f242078d);
        if (a == 0) {
            a = 1;
        }
        if (a != C89280w.m145217a(((Integer) ((C117077o) this.f325013a).f325065c.f63720e).intValue()) || this.f325015c.f242076b != ((Integer) ((C117077o) this.f325013a).f325066d.f63720e).intValue()) {
            return true;
        }
        int a2 = C89269l.m145214a(this.f325015c.f242077c);
        if (a2 == 0) {
            a2 = 1;
        }
        if (a2 != C89269l.m145214a(((Integer) ((C117077o) this.f325013a).f325067e.f63720e).intValue()) || this.f325015c.f242080f != ((Boolean) ((C117077o) this.f325013a).f325068f.f63720e).booleanValue()) {
            return true;
        }
        int a3 = C89272o.m145215a(this.f325015c.f242083i);
        if (a3 == 0) {
            a3 = 1;
        }
        if (a3 != C89272o.m145215a(((Integer) ((C117077o) this.f325013a).f325070h.f63720e).intValue())) {
            return true;
        }
        C89283z zVar = this.f325015c;
        int a4 = C89272o.m145215a(zVar.f242083i);
        if (a4 == 0 || a4 != 4 || zVar.f242087m == ((Integer) ((C117077o) this.f325013a).f325063a.f63720e).intValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        int i = 1;
        C89283z zVar = (C89283z) C23245b.m43557b(protoParcelable, C89283z.f242073n.getParserForType(), C62921ba.m95368a(), true);
        zVar.getClass();
        ((C117077o) this.f325013a).f325066d.mo28730f(Integer.valueOf(zVar.f242076b), false);
        C23251a aVar = ((C117077o) this.f325013a).f325067e;
        int a = C89269l.m145214a(zVar.f242077c);
        if (a == 0) {
            a = 1;
        }
        aVar.mo28730f(Integer.valueOf(a - 1), false);
        C23251a aVar2 = ((C117077o) this.f325013a).f325065c;
        int a2 = C89280w.m145217a(zVar.f242078d);
        if (a2 == 0) {
            a2 = 1;
        }
        aVar2.mo28730f(Integer.valueOf(a2 - 1), false);
        ((C117077o) this.f325013a).f325068f.mo28730f(Boolean.valueOf(zVar.f242080f), false);
        C23251a aVar3 = ((C117077o) this.f325013a).f325070h;
        int a3 = C89272o.m145215a(zVar.f242083i);
        if (a3 != 0) {
            i = a3;
        }
        aVar3.mo28730f(Integer.valueOf(i - 1), false);
        ((C117077o) this.f325013a).f325063a.mo28730f(Integer.valueOf(zVar.f242087m), false);
        ((C117077o) this.f325013a).f325064b.mo28730f(zVar.f242084j, false);
        ((C117077o) this.f325013a).f325069g.mo28730f(Boolean.valueOf(zVar.f242079e), false);
    }
}
