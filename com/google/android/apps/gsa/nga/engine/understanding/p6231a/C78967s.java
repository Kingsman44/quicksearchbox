package com.google.android.apps.gsa.nga.engine.understanding.p6231a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80512a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61747i;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61751m;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protos.p4850an.C63618g;
import com.google.protos.p4850an.C63624h;
import com.google.protos.p4883as.p4884a.C63772a;
import com.google.protos.p4883as.p4884a.C63775d;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.s */
/* compiled from: PG */
public final /* synthetic */ class C78967s implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C78967s f217212a = new C78967s();

    private /* synthetic */ C78967s() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        boolean z;
        String str;
        C78953e eVar = (C78953e) obj;
        C78952d a = eVar.mo73707a();
        C58480gp e = C58485gu.m89837e();
        if (eVar.mo73708b() != null) {
            e.mo55395g(C78968t.m126870d("App_search_classifier_origin", C78968t.m126872f(eVar.mo73708b())));
        }
        if (a instanceof C78945b) {
            String a2 = ((C78945b) a).mo73705a();
            C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
            C63618g gVar = (C63618g) C63624h.f172070b.createBuilder();
            C63772a aVar = (C63772a) C63775d.f172518h.createBuilder();
            aVar.copyOnWrite();
            C63775d dVar = (C63775d) aVar.instance;
            a2.getClass();
            dVar.f172520a |= 4;
            dVar.f172523d = a2;
            gVar.mo59221b(aVar);
            iVar.copyOnWrite();
            C61748j jVar = (C61748j) iVar.instance;
            C63624h hVar = (C63624h) gVar.build();
            hVar.getClass();
            jVar.f166803b = hVar;
            jVar.f166802a = 15;
            e.mo55395g(C78968t.m126870d("app", (C61748j) iVar.build()));
            str = "FindOnApp";
            z = false;
        } else if (a instanceof C78947c) {
            e.mo55395g(C78968t.m126870d("website", C78968t.m126872f(((C78947c) a).mo73706a())));
            str = "FindOnSite";
            z = true;
        } else {
            ((C58970a) ((C58970a) C78968t.f217213a.mo56225c()).mo56372aa(5462)).mo56386p("Unsupported target type.");
            return Stream.CC.m71936of((T[]) new C80513b[0]);
        }
        e.mo55371a(new C61746h[]{C78968t.m126870d("query", C78968t.m126872f(eVar.mo73709c())), C78968t.m126870d("isAssistedBrowse", C78968t.m126871e(true)), C78968t.m126870d("isSiteInForeground", C78968t.m126871e(z))}, 3);
        C80512a aVar2 = (C80512a) C80513b.f221014e.createBuilder();
        C80515d dVar2 = C80515d.APP_SEARCH_CLASSIFIER;
        aVar2.copyOnWrite();
        ((C80513b) aVar2.instance).f221019d = dVar2.getNumber();
        C58485gu f = e.mo55394f();
        C61751m mVar = (C61751m) C61752n.f166808f.createBuilder();
        mVar.copyOnWrite();
        C61752n nVar = (C61752n) mVar.instance;
        nVar.f166810a |= 4;
        nVar.f166811b = str;
        mVar.mo58183b(f);
        C61752n nVar2 = (C61752n) mVar.build();
        aVar2.copyOnWrite();
        nVar2.getClass();
        ((C80513b) aVar2.instance).f221016a = nVar2;
        return Stream.CC.m71935of((C80513b) aVar2.build());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
