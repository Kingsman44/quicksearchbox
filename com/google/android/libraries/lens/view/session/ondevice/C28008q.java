package com.google.android.libraries.lens.view.session.ondevice;

import android.util.Size;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.p2014e.C24199ab;
import com.google.android.libraries.lens.p2014e.C24207aj;
import com.google.android.libraries.lens.p2014e.C24229u;
import com.google.android.libraries.lens.p2014e.C24233y;
import com.google.android.libraries.lens.view.p2070an.p2071a.C25357f;
import com.google.android.libraries.lens.view.utils.C28130s;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import com.google.lens.p4699e.C62219be;
import com.google.lens.p4699e.C62223d;
import com.google.p4017at.p4056g.p4057a.p4058a.C54037cr;
import com.google.p4017at.p4056g.p4057a.p4058a.C54038cs;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56280cg;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56301da;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56302db;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.q */
/* compiled from: PG */
final class C28008q implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C28016y f76215a;

    /* renamed from: b */
    final /* synthetic */ C28017z f76216b;

    public C28008q(C28017z zVar, C28016y yVar) {
        this.f76216b = zVar;
        this.f76215a = yVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f76215a.f76236b.mo30912b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58833ax axVar;
        C54038cs csVar;
        C56301da daVar;
        C24229u uVar = (C24229u) obj;
        if (!uVar.equals(this.f76215a.f76237c.mo29696a())) {
            C28016y yVar = this.f76215a;
            C24207aj c = yVar.f76237c.mo29698c();
            c.mo29694b(uVar);
            yVar.mo33465a(c.mo29693a());
        }
        if (this.f76215a.f76235a.mo29682e().mo56113h()) {
            C28017z zVar = this.f76216b;
            C56280cg c2 = this.f76215a.f76235a.mo29679b().mo29686c();
            if (!zVar.mo33475n(c2) || !C28130s.m52412c(c2, C56306df.TEXT)) {
                this.f76215a.f76236b.mo30914d(new IllegalStateException("No interaction support for filter config"));
                return;
            }
            C28017z zVar2 = this.f76216b;
            C28016y yVar2 = this.f76215a;
            C58838bb.m90884s(!zVar2.mo33474m(yVar2.f76235a.mo29679b().mo29686c()), "No interactions are handled on device for hints.");
            C56220aa j = uVar.mo29743j();
            C58485gu f = uVar.mo29738f();
            Iterator it = uVar.mo29744k().f150052a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    axVar = C58836b.f156633a;
                    break;
                }
                C56302db dbVar = (C56302db) it.next();
                if (dbVar.f150046b == 4) {
                    daVar = (C56301da) dbVar.f150047c;
                } else {
                    daVar = C56301da.f150037e;
                }
                String str = daVar.f150040b;
                if (!str.isEmpty()) {
                    axVar = C58833ax.m90834k(str);
                    break;
                }
            }
            C25357f fVar = zVar2.f76240c;
            C56280cg c3 = yVar2.f76235a.mo29679b().mo29686c();
            C24233y yVar3 = (C24233y) yVar2.f76235a.mo29682e().mo56107c();
            String str2 = BuildConfig.FLAVOR;
            String str3 = (String) axVar.mo56109e(str2);
            int size = f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                C62223d dVar = (C62223d) f.get(i);
                i++;
                if (dVar.f168007a == 10) {
                    str2 = ((C62219be) dVar.f168008b).f167990c;
                    break;
                }
            }
            String str4 = str2;
            Size n = yVar2.f76235a.mo29678a().mo29792n();
            C58836b bVar = C58836b.f156633a;
            if (axVar.mo56113h()) {
                C54037cr crVar = (C54037cr) C54038cs.f141782f.createBuilder();
                String str5 = (String) axVar.mo56107c();
                crVar.copyOnWrite();
                str5.getClass();
                ((C54038cs) crVar.instance).f141787d = str5;
                csVar = (C54038cs) crVar.build();
            } else {
                csVar = C54038cs.f141782f;
            }
            C58833ax a = fVar.mo30406a(j, c3, yVar3, str3, str4, n, bVar, csVar);
            if (!a.mo56113h()) {
                ((C58970a) ((C58970a) C28017z.f76238a.mo56225c()).mo56372aa(49967)).mo56386p("Failed to build interaction result.");
            }
            if (!a.mo56113h()) {
                this.f76215a.f76236b.mo30914d(new IllegalStateException("Failed to build interaction result"));
                return;
            }
            C28016y yVar4 = this.f76215a;
            C24207aj c4 = yVar4.f76237c.mo29698c();
            c4.mo29695c((C24199ab) a.mo56107c());
            yVar4.mo33465a(c4.mo29693a());
        }
    }
}
