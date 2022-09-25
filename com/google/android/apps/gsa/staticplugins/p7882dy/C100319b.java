package com.google.android.apps.gsa.staticplugins.p7882dy;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8885y.p8887b.C118833a;
import com.google.android.apps.gsa.p8885y.p8887b.C118835b;
import com.google.android.apps.gsa.search.core.p6494aa.C84392c;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.dy.b */
/* compiled from: PG */
public final /* synthetic */ class C100319b implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C100320c f280534a;

    public /* synthetic */ C100319b(C100320c cVar) {
        this.f280534a = cVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C100320c cVar = this.f280534a;
        C118835b bVar = cVar.f280535a;
        C84392c b = C118833a.m197237b((C84392c) bVar.f331448b.b(bVar.f331447a), cVar.f280536b.mo77938a());
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 584;
        tzVar.copyOnWrite();
        ((C60555uf) tzVar.instance).f164098aE = C60555uf.emptyProtobufList();
        tzVar.mo57111a(b.f229652b);
        long max = Math.max(0, cVar.f280537c.mo26871c() - b.f229653c);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        ufVar2.f164253h |= 4194304;
        ufVar2.f164156bJ = max;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        return C118826c.f331422a;
    }
}
