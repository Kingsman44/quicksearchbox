package com.google.android.apps.gsa.staticplugins.p7706ct;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.contact.C87512aa;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.util.p7159c.C90880an;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58838bb;
import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.speech.grammar.pumpkin.ActionFrame;
import com.google.speech.grammar.pumpkin.UserValidators;

/* renamed from: com.google.android.apps.gsa.staticplugins.ct.x */
/* compiled from: PG */
final class C98554x extends C90880an {

    /* renamed from: a */
    final /* synthetic */ C87512aa f275205a;

    /* renamed from: b */
    final /* synthetic */ C98555y f275206b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98554x(C98555y yVar, C87512aa aaVar) {
        super("Initializing Pumpkin", 1, 8);
        this.f275206b = yVar;
        this.f275205a = aaVar;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C98535e eVar;
        C98555y yVar = this.f275206b;
        boolean z = false;
        C58838bb.m90883r(yVar.f275230j.get() == 1);
        C58872ci.m90947d(C58274c.f155808a);
        C89949q.m146523g(337);
        yVar.f275235o.mo83702b(C89849ae.OFFLINE_PUMPKIN_INITIALIZATION_START);
        try {
            yVar.f275225e.mo59666e();
            if (!yVar.f275225e.mo91161f()) {
                ActionFrame a = yVar.f275225e.mo91160a(C98527a.m163198c("action"));
                yVar.f275211B = yVar.f275225e.f275110a;
                yVar.f275223c.put(0, a);
            }
        } catch (Exception e) {
            ((C59052c) ((C59052c) C98555y.f275209a.mo56225c()).mo56372aa(30856)).mo56389s("Pumpkin init error: %s.", e.getMessage());
        }
        yVar.f275246z = yVar.f275225e.f180917f;
        yVar.f275227g.mo79746e(C90086ek.f250350bV);
        if (yVar.f275227g.mo79746e(C90086ek.f250350bV)) {
            eVar = new C98535e(yVar.f275244x);
        } else {
            eVar = new C98535e(yVar.f275226f);
        }
        yVar.f275218I = eVar;
        C98553w wVar = new C98553w(yVar.f275228h);
        C98534d dVar = new C98534d(yVar.f275226f);
        C86124t tVar = yVar.f275227g;
        C98552v vVar = new C98552v(tVar, yVar.f275242v, yVar.f275229i);
        if (tVar.mo79746e(C90086ek.f250385cD)) {
            yVar.f275217H = new C98551u(yVar.f275227g);
        }
        yVar.f275210A = yVar.f275227g.mo79745c(C90120fr.f250763C).contains(yVar.f275229i);
        boolean z2 = (1048576 & ((int) yVar.f275227g.mo79743a(C90120fr.f250824ap))) != 0;
        if (z2) {
            yVar.f275212C = new C98541k(yVar.f275232l, "MusicAlbum", yVar.f275240t, yVar.f275241u, yVar.f275227g);
            yVar.f275213D = new C98541k(yVar.f275232l, "MusicGroup", yVar.f275240t, yVar.f275241u, yVar.f275227g);
            yVar.f275215F = new C98541k(yVar.f275232l, "MusicRecording", yVar.f275240t, yVar.f275241u, yVar.f275227g);
            yVar.f275214E = new C98541k(yVar.f275232l, "MusicPlaylist", yVar.f275240t, yVar.f275241u, yVar.f275227g);
        }
        synchronized (yVar.f275222b) {
            yVar.f275245y = yVar.f275225e.f180918g;
            UserValidators userValidators = yVar.f275245y;
            if (userValidators != null) {
                userValidators.addValidator("CONTACT", yVar.f275218I);
                yVar.f275245y.addValidator("RELATIONSHIP", wVar);
                yVar.f275245y.addValidator("APP", yVar.f275239s);
                yVar.f275245y.addValidator("CONTACT_NAVIGATION", dVar);
                if (yVar.f275227g.mo79746e(C90086ek.f250385cD)) {
                    yVar.f275245y.addValidator("PUNT_VALIDATOR", yVar.f275217H);
                }
                if (z2) {
                    yVar.f275245y.addValidator("ALBUM", yVar.f275212C);
                    yVar.f275245y.addValidator("ARTIST", yVar.f275213D);
                    yVar.f275245y.addValidator("SONG", yVar.f275215F);
                    yVar.f275245y.addValidator("PLAYLIST", yVar.f275214E);
                    yVar.f275245y.addValidator("RADIO", vVar);
                }
                yVar.f275245y.addValidator("POINT_OF_INTEREST", yVar.f275237q);
                yVar.f275245y.addValidator("ADDRESS", yVar.f275236p);
                yVar.f275245y.addValidator("LOCAL_LOCATION", yVar.f275238r);
            }
        }
        C89949q.m146523g(338);
        yVar.f275235o.mo83702b(C89849ae.OFFLINE_PUMPKIN_INITIALIZATION_END);
        if (yVar.f275227g.mo79746e(C90086ek.f250383cB)) {
            yVar.f275216G = C58495hd.m89898l(yVar.f275225e.f275111b);
        }
        yVar.f275230j.set(2);
        if (this.f275206b.f275230j.get() == 2) {
            z = true;
        }
        C58838bb.m90883r(z);
        return this.f275206b;
    }
}
