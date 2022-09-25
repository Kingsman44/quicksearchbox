package com.google.android.apps.gsa.search.core.service.p6859i.p6861b.p6862a.p6863a;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.service.p6856h.C86744b;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.service.i.b.a.a.k */
/* compiled from: PG */
public final class C86763k {

    /* renamed from: a */
    public static final C59071e f234350a = C59071e.m91332i("com.google.android.apps.gsa.search.core.service.i.b.a.a.k");

    /* renamed from: b */
    private final C68214a f234351b;

    public C86763k(C68214a aVar) {
        this.f234351b = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo80376a(C86744b bVar, boolean z) {
        String ia = bVar.mo80349ia();
        return ((C22871g) this.f234351b.mo27525b()).mo28207g("Unloading worker [" + ia + "]", new C86762j(this, bVar, z));
    }

    /* renamed from: b */
    public final void mo80377b(C86744b bVar, boolean z) {
        bVar.mo79108hY();
        if (z) {
            C118575h hZ = bVar.mo80348hZ();
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 760;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            hZ.getClass();
            C62961ch chVar = ufVar2.f164117aX;
            if (!chVar.mo58948c()) {
                ufVar2.f164117aX = C62942bv.mutableCopy(chVar);
            }
            ufVar2.f164117aX.mo58916g(hZ.f330812sk);
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
    }

    /* renamed from: c */
    public final boolean mo80378c(C86744b bVar) {
        return bVar.mo20306o();
    }
}
