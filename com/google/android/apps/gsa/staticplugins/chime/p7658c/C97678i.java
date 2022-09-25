package com.google.android.apps.gsa.staticplugins.chime.p7658c;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.shared.search.p7138b.C90485a;
import com.google.android.apps.gsa.shared.search.p7138b.C90486b;
import com.google.android.apps.gsa.sidekick.shared.cards.C91679ah;
import com.google.android.apps.gsa.sidekick.shared.p7230a.C91643a;
import com.google.android.apps.gsa.sidekick.shared.p7241j.C91752h;
import com.google.android.apps.gsa.staticplugins.chime.C97735q;
import com.google.android.apps.gsa.staticplugins.chime.p7656a.C97644a;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p375ai.p378b.C7605de;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56975k;
import com.google.p4283bv.p4345d.p4350b.p4352b.C57000j;
import p5535j.p5536a.p5545c.p5548c.p5550b.C71141a;
import p5535j.p5536a.p5545c.p5548c.p5550b.C71142b;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.c.i */
/* compiled from: PG */
public final class C97678i implements C97671b {

    /* renamed from: a */
    private final Context f272773a;

    /* renamed from: b */
    private final C91643a f272774b;

    /* renamed from: c */
    private final C84486a f272775c;

    public C97678i(Context context, C91643a aVar, C84486a aVar2) {
        this.f272773a = context;
        this.f272774b = aVar;
        this.f272775c = aVar2;
    }

    /* renamed from: a */
    public final Intent mo90789a(C29827r rVar, C56975k kVar) {
        C9141ad a = C97644a.m161882a(kVar);
        if (a != null) {
            C91643a aVar = this.f272774b;
            C90485a aVar2 = (C90485a) C90486b.f252864g.createBuilder();
            boolean n = this.f272775c.mo78207n();
            aVar2.copyOnWrite();
            C90486b bVar = (C90486b) aVar2.instance;
            bVar.f252866a |= 1;
            bVar.f252867b = n;
            boolean l = this.f272775c.mo78205l();
            aVar2.copyOnWrite();
            C90486b bVar2 = (C90486b) aVar2.instance;
            bVar2.f252866a |= 2;
            bVar2.f252868c = l;
            aVar2.copyOnWrite();
            C90486b bVar3 = (C90486b) aVar2.instance;
            bVar3.f252870e = 1;
            bVar3.f252866a |= 32;
            C71141a aVar3 = (C71141a) C71142b.f189780d.createBuilder();
            String d = C97735q.m162007d(rVar);
            aVar3.copyOnWrite();
            C71142b bVar4 = (C71142b) aVar3.instance;
            d.getClass();
            bVar4.f189782a |= 2;
            bVar4.f189784c = d;
            C57000j jVar = C97735q.m162005b(rVar).f152041d;
            if (jVar == null) {
                jVar = C57000j.f152155i;
            }
            C60220t tVar = jVar.f152159c;
            if (tVar == null) {
                tVar = C60220t.f162931e;
            }
            aVar3.copyOnWrite();
            C71142b bVar5 = (C71142b) aVar3.instance;
            tVar.getClass();
            bVar5.f189783b = tVar;
            bVar5.f189782a |= 1;
            C71142b bVar6 = (C71142b) aVar3.build();
            aVar2.copyOnWrite();
            C90486b bVar7 = (C90486b) aVar2.instance;
            bVar6.getClass();
            bVar7.f252871f = bVar6;
            bVar7.f252866a |= 128;
            C91679ah ahVar = new C91679ah(aVar, C58833ax.m90834k((C90486b) aVar2.build()));
            Context context = this.f272773a;
            C58838bb.m90869d((a.f31535a & 64) != 0, "ClientAction must have an SearchAction to create intent.");
            C7605de deVar = a.f31543i;
            if (deVar == null) {
                deVar = C7605de.f26269s;
            }
            return C91752h.m150310a(context, deVar.f26272b, ahVar.mo86158a(deVar), true);
        }
        throw new IllegalArgumentException("Search action failed to convert.");
    }
}
