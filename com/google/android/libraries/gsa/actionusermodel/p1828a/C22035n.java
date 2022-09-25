package com.google.android.libraries.gsa.actionusermodel.p1828a;

import com.google.android.libraries.gsa.actionusermodel.C22067ay;
import com.google.android.libraries.gsa.actionusermodel.p1830c.C22098a;
import com.google.android.libraries.gsa.actionusermodel.p1830c.C22099b;
import com.google.common.base.C58817ah;
import com.google.protos.p5129p.p5131b.C65768az;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.a.n */
/* compiled from: PG */
public final /* synthetic */ class C22035n implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C22035n f60757a = new C22035n();

    private /* synthetic */ C22035n() {
    }

    public final Object apply(Object obj) {
        C22067ay ayVar = (C22067ay) obj;
        C22098a aVar = (C22098a) C22099b.f60908d.createBuilder();
        aVar.mo27353a(ayVar.f60805c);
        if ((ayVar.f60803a & 1) != 0) {
            C65768az azVar = ayVar.f60804b;
            if (azVar == null) {
                azVar = C65768az.f178793f;
            }
            aVar.copyOnWrite();
            C22099b bVar = (C22099b) aVar.instance;
            azVar.getClass();
            bVar.f60911b = azVar;
            bVar.f60910a |= 1;
        }
        return (C22099b) aVar.build();
    }
}
