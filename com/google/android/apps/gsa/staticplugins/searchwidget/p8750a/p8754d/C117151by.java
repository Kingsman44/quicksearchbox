package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import com.google.android.apps.gsa.shared.p6995aq.C89269l;
import com.google.android.apps.gsa.shared.p6995aq.C89272o;
import com.google.android.apps.gsa.shared.p6995aq.C89280w;
import com.google.android.apps.gsa.shared.p6995aq.C89283z;
import com.google.android.libraries.gsa.monet.shared.C23108e;
import com.google.android.libraries.gsa.monet.shared.C23110f;
import com.google.android.libraries.gsa.monet.shared.C23117m;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.by */
/* compiled from: PG */
public final /* synthetic */ class C117151by implements C23108e {

    /* renamed from: a */
    public static final /* synthetic */ C117151by f325224a = new C117151by();

    private /* synthetic */ C117151by() {
    }

    /* renamed from: a */
    public final void mo28558a(C23117m mVar, C23110f fVar, ProtoParcelable protoParcelable) {
        int i = 1;
        C89283z zVar = (C89283z) C23245b.m43557b(protoParcelable, C89283z.f242073n.getParserForType(), C62921ba.m95368a(), true);
        zVar.getClass();
        C117171l lVar = new C117171l(mVar);
        lVar.f325266d.mo28730f(Integer.valueOf(zVar.f242076b), false);
        lVar.f325263a.mo28730f(Integer.valueOf(zVar.f242087m), false);
        lVar.f325264b.mo28730f(zVar.f242084j, false);
        C23251a aVar = lVar.f325267e;
        int a = C89269l.m145214a(zVar.f242077c);
        if (a == 0) {
            a = 1;
        }
        aVar.mo28730f(Integer.valueOf(a - 1), false);
        C23251a aVar2 = lVar.f325265c;
        int a2 = C89280w.m145217a(zVar.f242078d);
        if (a2 == 0) {
            a2 = 1;
        }
        aVar2.mo28730f(Integer.valueOf(a2 - 1), false);
        lVar.f325268f.mo28730f(Boolean.valueOf(zVar.f242080f), false);
        C23251a aVar3 = lVar.f325270h;
        int a3 = C89272o.m145215a(zVar.f242083i);
        if (a3 != 0) {
            i = a3;
        }
        aVar3.mo28730f(Integer.valueOf(i - 1), false);
        lVar.f325269g.mo28730f(Boolean.valueOf(zVar.f242079e), false);
    }
}
