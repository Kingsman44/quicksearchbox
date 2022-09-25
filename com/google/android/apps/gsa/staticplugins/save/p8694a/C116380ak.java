package com.google.android.apps.gsa.staticplugins.save.p8694a;

import com.google.android.apps.gsa.search.core.p6519al.p6568ax.p6569a.C84758b;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.save.p8694a.p8696b.C116391a;
import com.google.android.apps.gsa.staticplugins.save.p8694a.p8696b.C116392b;
import com.google.android.apps.gsa.staticplugins.save.p8694a.p8696b.C116396f;
import com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116430i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.libraries.gsa.p1880l.C22875c;
import com.google.android.libraries.gsa.p1880l.C22876d;
import com.google.android.libraries.gsa.p1880l.C22881i;
import com.google.android.libraries.gsa.p1880l.C22884l;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57643df;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.a.ak */
/* compiled from: PG */
final class C116380ak implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C116381al f322712a;

    public C116380ak(C116381al alVar) {
        this.f322712a = alVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C58833ax axVar;
        ((C59052c) ((C59052c) ((C59052c) C116381al.f322713a.mo56225c()).mo56382g(th)).mo56372aa(31788)).mo56389s("Failed to unsave item: %s", this.f322712a.f322720h.f62948c);
        C116381al alVar = this.f322712a;
        C22876d dVar = alVar.f322720h;
        if ((dVar.f62946a & 16) != 0) {
            C22875c a = C22875c.m42745a(dVar.f62951f);
            if (a == null) {
                a = C22875c.IMAGE;
            }
            axVar = C58833ax.m90834k(a);
        } else {
            axVar = C58836b.f156633a;
        }
        int i = 720932;
        if (axVar.mo56113h()) {
            C22875c cVar = C22875c.IMAGE;
            int ordinal = ((C22875c) axVar.mo56107c()).ordinal();
            if (ordinal == 0) {
                i = 720898;
            } else if (ordinal == 1) {
                i = 720905;
            } else if (ordinal == 3) {
                i = 720930;
            }
        }
        alVar.mo102675q(th, i);
        C116381al alVar2 = this.f322712a;
        alVar2.f322717e.mo78737f(alVar2.f322720h, th);
        C116381al alVar3 = this.f322712a;
        alVar3.mo102679u(alVar3.f322716d.getString(R.string.save_unsave_network_error), true);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C58833ax axVar;
        C116430i iVar = (C116430i) obj;
        C116381al alVar = this.f322712a;
        C22876d dVar = alVar.f322720h;
        if ((dVar.f62946a & 16) != 0) {
            C22875c a = C22875c.m42745a(dVar.f62951f);
            if (a == null) {
                a = C22875c.IMAGE;
            }
            axVar = C58833ax.m90834k(a);
        } else {
            axVar = C58836b.f156633a;
        }
        C22881i iVar2 = (C22881i) C22884l.f62985g.createBuilder();
        iVar2.copyOnWrite();
        C22884l lVar = (C22884l) iVar2.instance;
        lVar.f62990d = 2;
        lVar.f62987a |= 1;
        long j = alVar.f322720h.f62968w;
        iVar2.copyOnWrite();
        C22884l lVar2 = (C22884l) iVar2.instance;
        lVar2.f62987a |= 16;
        lVar2.f62992f = j;
        if ((alVar.f322720h.f62946a & C89885b.HTTP_VALUE) == 0 && axVar.mo56113h()) {
            C22875c cVar = C22875c.IMAGE;
            int ordinal = ((C22875c) axVar.mo56107c()).ordinal();
            if (ordinal == 0) {
                C84758b bVar = alVar.f322723k;
                C65930h hVar = alVar.f322720h.f62950e;
                if (hVar == null) {
                    hVar = C65930h.f179300i;
                }
                bVar.mo78464a(hVar.f179303b, (String) null, false);
                C65930h hVar2 = alVar.f322720h.f62950e;
                if (hVar2 == null) {
                    hVar2 = C65930h.f179300i;
                }
                String str = hVar2.f179303b;
                iVar2.copyOnWrite();
                C22884l lVar3 = (C22884l) iVar2.instance;
                str.getClass();
                lVar3.f62988b = 5;
                lVar3.f62989c = str;
            } else if (ordinal == 1) {
                String str2 = alVar.f322720h.f62948c;
                alVar.mo102673o(str2);
                C57569am amVar = iVar.f322841a;
                if (amVar == null) {
                    amVar = C57569am.f153797f;
                }
                if (amVar.f153799a == 9) {
                    C57643df dfVar = (C57643df) amVar.f153800b;
                    C116396f fVar = alVar.f322724l;
                    C47633f.m84733g(fVar.f322768b.mo79697b()).mo51516i(new C116391a(fVar, str2, dfVar), fVar.f322769c).mo51515h(C116392b.f322763a, C60826bg.f164896a);
                    if (!dfVar.f153947a.isEmpty()) {
                        alVar.mo102673o(dfVar.f153947a);
                    }
                    if (!dfVar.f153949c.isEmpty()) {
                        alVar.mo102673o(dfVar.f153949c);
                    }
                    if (!dfVar.f153950d.isEmpty()) {
                        alVar.mo102673o(dfVar.f153950d);
                    }
                }
                alVar.mo102669k(false);
                String str3 = alVar.f322720h.f62948c;
                iVar2.copyOnWrite();
                C22884l lVar4 = (C22884l) iVar2.instance;
                str3.getClass();
                lVar4.f62988b = 4;
                lVar4.f62989c = str3;
            } else if (ordinal == 3) {
                String str4 = alVar.f322720h.f62961p;
                iVar2.copyOnWrite();
                C22884l lVar5 = (C22884l) iVar2.instance;
                str4.getClass();
                lVar5.f62988b = 7;
                lVar5.f62989c = str4;
            }
        }
        alVar.mo102672n((C22884l) iVar2.build());
        if (alVar.f322720h.f62962q) {
            alVar.mo102668j();
        } else {
            alVar.mo102679u(alVar.f322716d.getString(R.string.save_unsave_confirmation), false);
        }
    }
}
