package com.google.android.apps.gsa.staticplugins.p7825dm.p7830e;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6660cn.C85142a;
import com.google.android.apps.gsa.search.core.p6519al.p6662co.C85167c;
import com.google.android.apps.gsa.search.core.p6519al.p6682cy.C85265e;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.googleapp.p10539y.p10540a.C139883a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1880l.C22873a;
import com.google.android.libraries.gsa.p1880l.C22875c;
import com.google.android.libraries.gsa.p1880l.C22876d;
import com.google.android.libraries.gsa.p1880l.C22879g;
import com.google.android.libraries.gsa.p1880l.C22880h;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57566aj;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57647h;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57648i;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57665z;
import com.google.p4283bv.p4412k.p4415c.p4416a.C57844b;
import com.google.p4283bv.p4412k.p4415c.p4416a.C57846d;
import com.google.p4283bv.p4412k.p4415c.p4416a.C57848f;
import com.google.p4283bv.p4412k.p4415c.p4416a.C57852j;
import com.google.p4283bv.p4412k.p4415c.p4416a.C57856n;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.e.n */
/* compiled from: PG */
public final class C99781n extends C86734a implements C85265e {

    /* renamed from: a */
    private final C85167c f279176a;

    /* renamed from: b */
    private final C85142a f279177b;

    /* renamed from: c */
    private final C22871g f279178c;

    public C99781n(C85167c cVar, C85142a aVar, C22871g gVar) {
        super(C118575h.SILK_COLLECTIONS_API, "silkcollections");
        this.f279176a = cVar;
        this.f279177b = aVar;
        this.f279178c = gVar;
    }

    /* renamed from: e */
    private final C60870cx m165408e(boolean z, C58833ax axVar, C58833ax axVar2, String str, boolean z2, C57648i iVar, boolean z3) {
        C58833ax axVar3;
        C22873a aVar = (C22873a) C22876d.f62944x.createBuilder();
        aVar.copyOnWrite();
        C22876d dVar = (C22876d) aVar.instance;
        int i = 1;
        dVar.f62946a |= 1;
        dVar.f62947b = z;
        aVar.copyOnWrite();
        C22876d dVar2 = (C22876d) aVar.instance;
        dVar2.f62946a |= 1024;
        dVar2.f62955j = false;
        if (axVar2.mo56113h()) {
            C57665z zVar = C57665z.UNKNOWN_ITEM_TYPE;
            int ordinal = ((C57665z) axVar2.mo56107c()).ordinal();
            if (ordinal == 5) {
                axVar3 = C58833ax.m90834k(C22875c.IMAGE);
            } else if (ordinal == 9) {
                axVar3 = C58833ax.m90834k(C22875c.PLACE);
            } else if (ordinal == 11) {
                axVar3 = C58833ax.m90834k(C22875c.SCREENSHOT);
            } else if (ordinal != 19) {
                axVar3 = C58836b.f156633a;
            } else {
                axVar3 = C58833ax.m90834k(C22875c.PAGE);
            }
            if (axVar3.mo56113h()) {
                aVar.copyOnWrite();
                C22876d dVar3 = (C22876d) aVar.instance;
                dVar3.f62951f = ((C22875c) axVar3.mo56107c()).f62943e;
                dVar3.f62946a |= 16;
            }
        }
        C22879g gVar = (C22879g) C22880h.f62974h.createBuilder();
        gVar.copyOnWrite();
        C22880h hVar = (C22880h) gVar.instance;
        str.getClass();
        hVar.f62976a |= 1;
        hVar.f62977b = str;
        if (axVar.mo56113h()) {
            C57578av avVar = (C57578av) axVar.mo56107c();
            gVar.copyOnWrite();
            C22880h hVar2 = (C22880h) gVar.instance;
            avVar.getClass();
            hVar2.f62982g = avVar;
            hVar2.f62976a |= 32;
        }
        if (z2) {
            gVar.copyOnWrite();
            C22880h hVar3 = (C22880h) gVar.instance;
            hVar3.f62976a |= 16;
            hVar3.f62981f = true;
        }
        int b = C57647h.m88511b(iVar.f153955a);
        if (b != 0) {
            i = b;
        }
        int a = C57647h.m88510a(i);
        gVar.copyOnWrite();
        C22880h hVar4 = (C22880h) gVar.instance;
        hVar4.f62976a |= 8;
        hVar4.f62980e = a;
        gVar.copyOnWrite();
        C22880h hVar5 = (C22880h) gVar.instance;
        hVar5.f62976a |= 4;
        hVar5.f62979d = z3;
        C22880h hVar6 = (C22880h) gVar.build();
        aVar.copyOnWrite();
        C22876d dVar4 = (C22876d) aVar.instance;
        hVar6.getClass();
        dVar4.f62963r = hVar6;
        dVar4.f62946a |= C89885b.HTTP_VALUE;
        return this.f279177b.mo78733b((C22876d) aVar.build());
    }

    /* renamed from: b */
    public final C60870cx mo78829b(String str, C57665z zVar, C57648i iVar, C57848f fVar) {
        C58833ax axVar;
        C57578av avVar;
        if (fVar == null || (avVar = fVar.f154553a) == null) {
            axVar = C58836b.f156633a;
        } else {
            axVar = C58833ax.m90834k(avVar);
        }
        return this.f279178c.mo28209i(m165408e(true, axVar, C58833ax.m90834k(zVar), str, false, iVar, false), "SilkCollectionsWorker save transformSaveResult", C99778k.f279173a);
    }

    /* renamed from: c */
    public final C60870cx mo78830c(C57578av avVar, C57852j jVar) {
        return this.f279178c.mo28209i(this.f279177b.mo78734c(avVar), "SilkCollectionsWorker setActiveList transformResult", C99780m.f279175a);
    }

    /* renamed from: d */
    public final C60870cx mo78831d(String str, C57648i iVar, C57856n nVar) {
        C58836b bVar = C58836b.f156633a;
        return this.f279178c.mo28209i(m165408e(false, bVar, bVar, str, nVar != null && nVar.f154568a, iVar, true), "SilkCollectionsWorker unsave transformResult", C99779l.f279174a);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }

    /* renamed from: a */
    public final C60870cx mo78828a(C57566aj ajVar, String str, C57844b bVar) {
        C58833ax axVar;
        C58833ax axVar2;
        C85167c cVar = this.f279176a;
        if (ajVar == null) {
            axVar = C58836b.f156633a;
        } else {
            axVar = C58833ax.m90834k(C139883a.m227490b(ajVar));
        }
        if (C58837ba.m90859h(str)) {
            axVar2 = C58836b.f156633a;
        } else {
            axVar2 = C58833ax.m90834k(str);
        }
        cVar.mo78753h(8, axVar, axVar2);
        return C60856cj.m92900i(C57846d.f154549a);
    }
}
