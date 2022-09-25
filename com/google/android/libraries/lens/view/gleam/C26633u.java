package com.google.android.libraries.lens.view.gleam;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.lens.view.filters.p2100d.C25972a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.p2090ba.C25686g;
import com.google.android.libraries.lens.view.session.C27793m;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28441k;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.synthetic.C28452b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.acl;
import com.google.common.p4552o.acp;
import com.google.common.p4552o.ado;
import com.google.common.p4552o.p4563i.C59866ab;
import com.google.common.p4552o.p4563i.C59899bh;
import com.google.common.p4552o.p4563i.C59900bi;
import com.google.common.util.concurrent.C60888db;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56318p;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56320r;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56327y;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.lens.view.gleam.u */
/* compiled from: PG */
public final class C26633u implements C26603l {

    /* renamed from: a */
    public static final C58974d f72632a = C58974d.m91135i("DGleamVeLogger");

    /* renamed from: b */
    public final C26244b f72633b;

    /* renamed from: c */
    public final C25972a f72634c;

    /* renamed from: d */
    public final Map f72635d = new HashMap();

    /* renamed from: e */
    public final Map f72636e = new HashMap();

    /* renamed from: f */
    public final Set f72637f = new HashSet();

    /* renamed from: g */
    public C28452b f72638g;

    /* renamed from: h */
    private final C28443m f72639h;

    /* renamed from: i */
    private final C60888db f72640i;

    public C26633u(C26244b bVar, C25972a aVar, C28443m mVar, C60888db dbVar) {
        this.f72633b = bVar;
        this.f72634c = aVar;
        this.f72639h = mVar;
        this.f72640i = dbVar;
    }

    /* renamed from: g */
    public static C58833ax m49198g(C56327y yVar) {
        for (C56320r rVar : yVar.f150143f) {
            C56318p pVar = rVar.f150101h;
            if (pVar == null) {
                pVar = C56318p.f150087c;
            }
            if ((pVar.f150089a & 4) != 0) {
                C56318p pVar2 = rVar.f150101h;
                if (pVar2 == null) {
                    pVar2 = C56318p.f150087c;
                }
                return C58833ax.m90834k(pVar2.f150090b);
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: a */
    public final void mo31869a(String str) {
        if (this.f72637f.contains(str)) {
            this.f72640i.mo29164d(C47810es.m84977q(new C26632t(this, str)), 100, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: b */
    public final void mo31870b(C27793m mVar) {
        if (this.f72638g == null) {
            ((C58970a) ((C58970a) f72632a.mo56226d()).mo56372aa(49424)).mo56386p("gleamDetectionResults(): invalid syntheticContainer state");
        } else {
            this.f72640i.execute(new C26607p(this, mVar));
        }
    }

    /* renamed from: c */
    public final void mo31871c(String str) {
        if (this.f72637f.contains(str)) {
            this.f72640i.mo29164d(C47810es.m84977q(new C26631s(this, str)), 100, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: d */
    public final void mo31872d(String str) {
        C28440j h = C28442l.m53142h();
        C59899bh bhVar = (C59899bh) C59900bi.f161890j.createBuilder();
        acl acl = (acl) acp.f158315e.createBuilder();
        acl.copyOnWrite();
        acp acp = (acp) acl.instance;
        acp.f158318b = 8;
        acp.f158317a |= 1;
        acl.copyOnWrite();
        acp acp2 = (acp) acl.instance;
        acp2.f158319c = 1;
        acp2.f158317a |= 2;
        acp acp3 = (acp) acl.build();
        bhVar.copyOnWrite();
        C59900bi biVar = (C59900bi) bhVar.instance;
        acp3.getClass();
        biVar.f161895c = acp3;
        biVar.f161893a |= 4;
        mo31916h(str, h, C58833ax.m90834k((C59900bi) bhVar.build()));
    }

    /* renamed from: e */
    public final void mo31873e(String str) {
        mo31916h(str, C28442l.m53142h(), C58836b.f156633a);
    }

    /* renamed from: f */
    public final void mo31874f(C28452b bVar) {
        this.f72638g = bVar;
    }

    /* renamed from: h */
    public final void mo31916h(String str, C28440j jVar, C58833ax axVar) {
        C59899bh bhVar;
        if (this.f72638g == null) {
            ((C58970a) ((C58970a) f72632a.mo56226d()).mo56372aa(49425)).mo56386p("tapOnGleam(): invalid syntheticContainer state");
        } else if (this.f72637f.contains(str)) {
            if (axVar.mo56113h()) {
                bhVar = (C59899bh) C59900bi.f161890j.createBuilder((C59900bi) axVar.mo56107c());
            } else {
                bhVar = null;
            }
            ado ado = (ado) Map.EL.getOrDefault(this.f72636e, str, ado.f158388g);
            if ((ado.f158391a & 1) != 0) {
                if (bhVar == null) {
                    bhVar = (C59899bh) C59900bi.f161890j.createBuilder();
                }
                C59866ab abVar = ado.f158392b;
                if (abVar == null) {
                    abVar = C59866ab.f161790e;
                }
                bhVar.copyOnWrite();
                C59900bi biVar = (C59900bi) bhVar.instance;
                C59900bi biVar2 = C59900bi.f161890j;
                abVar.getClass();
                biVar.f161901i = abVar;
                biVar.f161893a |= C89885b.HTTP_VALUE;
            }
            if (bhVar != null) {
                jVar.mo33895b(new C28441k(C25686g.f69826b, (C59900bi) bhVar.build()));
            }
            this.f72639h.mo33853c(jVar.mo33894a(), this.f72638g.mo33908b(str));
        }
    }
}
