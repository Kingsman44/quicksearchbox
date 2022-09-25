package com.google.android.apps.gsa.staticplugins.p7890ec.p7892b.p7893a.p7894a;

import com.google.android.apps.gsa.p8889z.p8893c.p8899f.C118896b;
import com.google.android.apps.gsa.search.core.service.C86771n;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88380zn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88381zo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88382zp;
import com.google.android.apps.gsa.staticplugins.p7890ec.p7892b.p7895b.C100413a;
import com.google.p4449cd.p4456g.p4457a.C57975a;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.ec.b.a.a.b */
/* compiled from: PG */
final class C100386b extends C57975a {

    /* renamed from: a */
    final /* synthetic */ C100413a f280682a;

    public C100386b(C100413a aVar) {
        this.f280682a = aVar;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20337c(Object obj) {
        C118896b bVar = (C118896b) obj;
        C100413a aVar = this.f280682a;
        String b = bVar.mo104059b();
        String c = bVar.mo104060c();
        if (aVar.f280728a != null) {
            C87684al alVar = new C87684al(C88244um.UPDATE_RECOGNIZED_TEXT);
            C62940bt btVar = C88380zn.f238990a;
            C88381zo zoVar = (C88381zo) C88382zp.f238991e.createBuilder();
            zoVar.copyOnWrite();
            C88382zp zpVar = (C88382zp) zoVar.instance;
            b.getClass();
            zpVar.f238993a |= 1;
            zpVar.f238994b = b;
            zoVar.copyOnWrite();
            C88382zp zpVar2 = (C88382zp) zoVar.instance;
            c.getClass();
            zpVar2.f238993a |= 2;
            zpVar2.f238995c = c;
            alVar.mo81965b(btVar, (C88382zp) zoVar.build());
            ((C86771n) aVar.f280728a).mo80379b(alVar.mo81964a());
        }
    }
}
