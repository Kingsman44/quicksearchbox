package com.google.android.apps.gsa.staticplugins.p7699cq;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.apps.gsa.speech.p7294j.C92431a;
import com.google.android.apps.gsa.staticplugins.p7699cq.p7700a.p7702b.C98506a;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.cq.e */
/* compiled from: PG */
final class C98512e implements C92431a {

    /* renamed from: a */
    final /* synthetic */ Query f275077a;

    /* renamed from: b */
    final /* synthetic */ C98506a f275078b;

    public C98512e(Query query, C98506a aVar) {
        this.f275077a = query;
        this.f275078b = aVar;
    }

    /* renamed from: a */
    public final void mo87095a(C90528t tVar) {
    }

    /* renamed from: b */
    public final void mo87096b() {
    }

    /* renamed from: s */
    public final void mo87113s() {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 5;
        String b = C39191a.m68623b(this.f275077a.f252749G);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        this.f275078b.mo91154a();
    }
}
