package com.google.android.apps.gsa.staticplugins.smartspace;

import android.graphics.Bitmap;
import com.google.android.apps.gsa.opa.smartspace.C83724a;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.gsa.opa.smartspace.C83740al;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83798n;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.smartspace.C92035ae;
import com.google.android.apps.gsa.staticplugins.smartspace.p8764e.C117383a;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.ag */
/* compiled from: PG */
final class C117348ag implements C22868d {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f325725a;

    /* renamed from: b */
    final /* synthetic */ Object f325726b;

    /* renamed from: c */
    final /* synthetic */ C117350ai f325727c;

    public C117348ag(C117350ai aiVar, SettableFuture settableFuture, Object obj) {
        this.f325727c = aiVar;
        this.f325725a = settableFuture;
        this.f325726b = obj;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x d = C117350ai.f325731a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SmartspaceWorker");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(33006)).mo56354G("Error processing input.  Input=%s, Error=%s", this.f325726b, th);
        this.f325725a.mo57356n(C118826c.f331422a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C117383a aVar = (C117383a) obj;
        C117350ai aiVar = this.f325727c;
        SettableFuture settableFuture = this.f325725a;
        Object obj2 = this.f325726b;
        ((C58970a) ((C58970a) aiVar.f325766p.mo56224b()).mo56372aa(33070)).mo56386p("handleUpdateAction");
        C50818do doVar = aVar.f325863b;
        if (doVar != null) {
            C130895ag agVar = aiVar.f325764n;
            C50794cr a = C50794cr.m85938a(doVar.f132315l);
            if (a == null) {
                a = C50794cr.UNDEFINED;
            }
            agVar.mo109889Y(a, C117383a.m195058a(aVar.f325862a));
        }
        ((C58970a) ((C58970a) aiVar.f325766p.mo56224b()).mo56372aa(33071)).mo56389s("action type string %s ", C117383a.m195058a(aVar.f325862a));
        int i = aVar.f325862a;
        if (i != 0) {
            if (i != 1) {
                settableFuture.mo57356n(C118826c.f331422a);
                return;
            }
            C50794cr crVar = aVar.f325865d;
            if (crVar != null) {
                aiVar.f325762l.mo77128j(crVar).mo4106b(new C117439t(settableFuture), C60826bg.f164896a);
            }
        } else if (aVar.f325864c != null) {
            C58833ax j = C58833ax.m90833j(aVar.f325863b);
            if (j.mo56113h()) {
                C83740al alVar = (C83740al) C83741am.f228248e.createBuilder();
                if (obj2 instanceof C92035ae) {
                    C83739ak i2 = aiVar.mo103270i((C92035ae) obj2);
                    alVar.copyOnWrite();
                    C83741am amVar = (C83741am) alVar.instance;
                    i2.getClass();
                    amVar.f228251b = i2;
                    amVar.f228250a |= 2;
                }
                Bitmap bitmap = aVar.f325864c;
                C83798n k = C83800p.m133473k();
                C50818do doVar2 = (C50818do) j.mo56107c();
                alVar.copyOnWrite();
                C83741am amVar2 = (C83741am) alVar.instance;
                doVar2.getClass();
                amVar2.f228252c = doVar2;
                amVar2.f228250a |= 4;
                k.mo77043b((C83741am) alVar.build());
                ((C83724a) k).f228192c = C58485gu.m89842j(bitmap == null ? C58485gu.m89845m() : C58485gu.m89846n(bitmap));
                C83800p a2 = k.mo77042a();
                C50794cr a3 = C50794cr.m85938a(((C50818do) j.mo56107c()).f132315l);
                if (a3 == null) {
                    a3 = C50794cr.UNDEFINED;
                }
                if (a3.equals(C50794cr.WEATHER)) {
                    aiVar.f325768r.mo77192a(C118569b.SMARTSPACE_WEATHER_UPDATE_ACTION, 1);
                    aiVar.f325762l.mo77124f(a2).mo4106b(new C117345ad(settableFuture), C60826bg.f164896a);
                    return;
                }
                aiVar.f325762l.mo77123e(a2).mo4106b(new C117346ae(settableFuture), C60826bg.f164896a);
                return;
            }
            ((C58970a) ((C58970a) aiVar.f325766p.mo56226d()).mo56372aa(33073)).mo56386p("new card to send could not be extracted");
        } else {
            C58833ax j2 = C58833ax.m90833j(aVar.f325863b);
            if (j2.mo56113h()) {
                C83798n k2 = C83800p.m133473k();
                C83740al alVar2 = (C83740al) C83741am.f228248e.createBuilder();
                C50818do doVar3 = (C50818do) j2.mo56107c();
                alVar2.copyOnWrite();
                C83741am amVar3 = (C83741am) alVar2.instance;
                doVar3.getClass();
                amVar3.f228252c = doVar3;
                amVar3.f228250a |= 4;
                k2.mo77043b((C83741am) alVar2.build());
                C83800p a4 = k2.mo77042a();
                C50794cr a5 = C50794cr.m85938a(((C50818do) j2.mo56107c()).f132315l);
                if (a5 == null) {
                    a5 = C50794cr.UNDEFINED;
                }
                if (a5.equals(C50794cr.WEATHER)) {
                    C59104x d = C117350ai.f325731a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "SmartspaceWorker");
                    ((C59052c) ((C59052c) d).mo56372aa(33072)).mo56386p("sending weather content without icon");
                    aiVar.f325768r.mo77192a(C118569b.SMARTSPACE_WEATHER_UPDATE_ACTION, 1);
                    aiVar.f325762l.mo77124f(a4).mo4106b(new C117347af(settableFuture), C60826bg.f164896a);
                    return;
                }
                aiVar.f325762l.mo77123e(a4).mo4106b(new C117438s(settableFuture), C60826bg.f164896a);
            }
        }
    }
}
