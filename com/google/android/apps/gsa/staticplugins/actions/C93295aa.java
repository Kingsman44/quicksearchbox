package com.google.android.apps.gsa.staticplugins.actions;

import android.content.ContentResolver;
import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.apps.gsa.contacts.C74490v;
import com.google.android.apps.gsa.contacts.bg;
import com.google.android.apps.gsa.contacts.cn;
import com.google.android.apps.gsa.contacts.example.C74486d;
import com.google.android.apps.gsa.contacts.u;
import com.google.android.apps.gsa.handsfree.a;
import com.google.android.apps.gsa.handsfree.h;
import com.google.android.apps.gsa.handsfree.k;
import com.google.android.apps.gsa.p8889z.p8917f.C119071a;
import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.C85669bt;
import com.google.android.apps.gsa.search.core.C85741ce;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84425ag;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84428aj;
import com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84579f;
import com.google.android.apps.gsa.search.core.p6774b.C85646d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.C87500v;
import com.google.android.apps.gsa.search.shared.contact.C87514b;
import com.google.android.apps.gsa.search.shared.p6931i.C87572a;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.shared.util.permissions.C91077d;
import com.google.android.apps.gsa.staticplugins.actions.modularanswer.C93406a;
import com.google.android.apps.gsa.staticplugins.actions.p7358d.C93320g;
import com.google.android.apps.gsa.staticplugins.actions.p7358d.C93324k;
import com.google.android.apps.gsa.staticplugins.actions.p7358d.C93330q;
import com.google.android.apps.gsa.staticplugins.actions.p7361g.C93396j;
import com.google.android.apps.gsa.staticplugins.actions.p7361g.C93397k;
import com.google.android.apps.gsa.staticplugins.actions.p7361g.C93398l;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.aa */
/* compiled from: PG */
public final class C93295aa implements C85646d {
    /* renamed from: a */
    public final C87500v mo79126a() {
        return new C93330q(new C93324k());
    }

    /* renamed from: b */
    public final C119071a mo79127b(Context context, C87514b bVar, C84413ad adVar, C85669bt btVar, bg bgVar, C74490v vVar, ContentResolver contentResolver, cn cnVar, C91123v vVar2, C86124t tVar, C68214a aVar, u uVar, int i, C85741ce ceVar, C85664bo boVar, a aVar2, C84425ag agVar, C21370a aVar3, C90931ca caVar, C91077d dVar, k kVar, C58833ax axVar, C90476a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C58833ax axVar2, com.google.android.apps.gsa.c.b.a aVar9, C87572a aVar10) {
        C84425ag agVar2 = agVar;
        Context context2 = context;
        C86124t tVar2 = tVar;
        C85741ce ceVar2 = ceVar;
        k kVar2 = kVar;
        C74486d dVar2 = r13;
        C74486d dVar3 = new C74486d(uVar);
        C84579f fVar = r13;
        C84579f fVar2 = new C84579f(agVar2, aVar7, aVar8);
        C93406a aVar11 = r1;
        Context context3 = context2;
        C68214a aVar12 = aVar;
        C93406a aVar13 = new C93406a(aVar12, new C93396j(bgVar, new C84428aj(agVar2), cnVar, (TelephonyManager) context2.getSystemService("phone"), aVar5, aVar6, tVar, new C93397k(tVar)), (h) null);
        C93398l lVar = r0;
        C93398l lVar2 = new C93398l(context.getPackageManager());
        return new C93320g(context3, aVar3, bVar, adVar, ceVar2, btVar, tVar2, bgVar, vVar, contentResolver, vVar2, false, aVar, (h) null, dVar2, i, boVar, aVar2, fVar, kVar2, aVar11, caVar, dVar, lVar, axVar, aVar4, axVar2, aVar9, aVar10);
    }
}
