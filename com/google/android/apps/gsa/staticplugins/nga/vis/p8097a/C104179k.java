package com.google.android.apps.gsa.staticplugins.nga.vis.p8097a;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3745ab.p3771w.C48420g;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.vis.a.k */
/* compiled from: PG */
public final /* synthetic */ class C104179k implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C104181m f289784a;

    /* renamed from: b */
    public final /* synthetic */ Optional f289785b;

    /* renamed from: c */
    public final /* synthetic */ C60321oe f289786c;

    public /* synthetic */ C104179k(C104181m mVar, Optional optional, C60321oe oeVar) {
        this.f289784a = mVar;
        this.f289785b = optional;
        this.f289786c = oeVar;
    }

    public final void run() {
        C104181m mVar = this.f289784a;
        Optional optional = this.f289785b;
        C60321oe oeVar = this.f289786c;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 472;
        Objects.requireNonNull(tzVar);
        optional.ifPresent(new C104178j(tzVar));
        Optional a = mVar.f289788b.mo75183a();
        if (a.isPresent()) {
            a.get();
            long longValue = ((Long) a.get()).longValue();
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            ufVar2.f164256k |= 2;
            ufVar2.f164210cK = longValue;
        }
        C48420g b = mVar.f289787a.mo75573b();
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar3.f164237co = b;
        ufVar3.f164255j |= 32;
        C89949q.m146525j((C60555uf) tzVar.build(), oeVar, (C63196b) null, (String) null);
    }
}
