package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.nga.shared.p6309ag.C80627v;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122189j;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.mdi.C29689e;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.mdi.download.C28707am;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29676p;
import com.google.assistant.p3793ae.p3794a.C48770b;
import com.google.assistant.p3793ae.p3794a.C48772d;
import com.google.assistant.p3793ae.p3794a.C48773e;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.j */
/* compiled from: PG */
public final /* synthetic */ class C104113j implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ C104123t f289625a;

    /* renamed from: b */
    public final /* synthetic */ String f289626b;

    /* renamed from: c */
    public final /* synthetic */ String f289627c;

    /* renamed from: d */
    public final /* synthetic */ Optional f289628d;

    /* renamed from: e */
    public final /* synthetic */ C80627v f289629e;

    public /* synthetic */ C104113j(C104123t tVar, String str, String str2, Optional optional, C80627v vVar) {
        this.f289625a = tVar;
        this.f289626b = str;
        this.f289627c = str2;
        this.f289628d = optional;
        this.f289629e = vVar;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C60870cx cxVar;
        C104123t tVar = this.f289625a;
        String str = this.f289626b;
        String str2 = this.f289627c;
        Optional optional = this.f289628d;
        C80627v vVar = this.f289629e;
        Optional findAny = Collection.EL.stream(((C122189j) obj).f338887a).filter(C103981d.f289380a).findAny();
        if (Collection.EL.stream(((C122189j) obj2).f338887a).filter(C104008e.f289416a).findAny().isPresent()) {
            ((C58970a) ((C58970a) C104123t.f289645a.mo56224b()).mo56372aa(21676)).mo56359L("Skipping %s -> %s, because %s already exists.", str, str2, str2);
            return C60866ct.f164955a;
        }
        if (!findAny.isEmpty()) {
            C29690f fVar = ((C48770b) findAny.get()).f126196a;
            if (fVar == null) {
                fVar = C29690f.f80408m;
            }
            C29689e a = C29689e.m54781a(fVar.f80415f);
            if (a == null) {
                a = C29689e.UNSPECIFIED;
            }
            if (a.equals(C29689e.DOWNLOADED)) {
                C22871g gVar = tVar.f289648d;
                C48770b bVar = (C48770b) findAny.get();
                C48773e eVar = bVar.f126197b;
                if (eVar == null) {
                    eVar = C48773e.f126198g;
                }
                Optional filter = Optional.m71637of(eVar).filter(new C103927b(str));
                if (vVar.equals(C80627v.GENIE_FM) && filter.isEmpty()) {
                    ((C58970a) ((C58970a) C104123t.f289645a.mo56224b()).mo56372aa(21680)).mo56386p("Handling the GDD group Genie FM.");
                    C29676p pVar = new C29676p();
                    pVar.mo34785b(str);
                    cxVar = tVar.f289648d.mo28210j(((C29409fd) tVar.f289647c.mo27525b()).mo34721j(pVar.mo34784a()), "[NGA] migrateFromDFG", new C103819a(tVar, vVar, bVar, str2, optional));
                } else if (filter.isEmpty()) {
                    ((C58970a) ((C58970a) C104123t.f289645a.mo56226d()).mo56372aa(21679)).mo56389s("Skipping %s because no SoT config exists.", str);
                    cxVar = C60866ct.f164955a;
                } else {
                    C48773e eVar2 = bVar.f126197b;
                    if (eVar2 == null) {
                        eVar2 = C48773e.f126198g;
                    }
                    C58495hd a2 = C104123t.m172077a(vVar, bVar);
                    C28708an anVar = eVar2.f126205f;
                    if (anVar == null) {
                        anVar = C28708an.f77994l;
                    }
                    C58485gu guVar = (C58485gu) Collection.EL.stream(anVar.f78003h).map(new C104089h(a2)).collect(C58370cn.f155946a);
                    C28708an anVar2 = eVar2.f126205f;
                    if (anVar2 == null) {
                        anVar2 = C28708an.f77994l;
                    }
                    C28707am amVar = (C28707am) anVar2.toBuilder();
                    amVar.copyOnWrite();
                    C28708an anVar3 = (C28708an) amVar.instance;
                    str2.getClass();
                    anVar3.f77996a |= 1;
                    anVar3.f77997b = str2;
                    amVar.copyOnWrite();
                    ((C28708an) amVar.instance).f78003h = C28708an.emptyProtobufList();
                    amVar.mo34327a(guVar);
                    C28708an anVar4 = (C28708an) amVar.build();
                    C48772d dVar = (C48772d) eVar2.toBuilder();
                    dVar.copyOnWrite();
                    str2.getClass();
                    ((C48773e) dVar.instance).f126200a = str2;
                    dVar.copyOnWrite();
                    anVar4.getClass();
                    ((C48773e) dVar.instance).f126205f = anVar4;
                    cxVar = tVar.f289648d.mo28210j(tVar.f289649e.mo105562c((C48773e) dVar.build()), "[NGA] addFileGroup", new C104120q(tVar, optional.isPresent(), optional, !str2.equals(eVar2.f126200a)));
                }
                return gVar.mo28209i(cxVar, "[NGA] migrateGroupInternal", new C104035f(tVar));
            }
        }
        ((C58970a) ((C58970a) C104123t.f289645a.mo56226d()).mo56372aa(21675)).mo56359L("Skipping %s -> %s because %s does not exist.", str, str2, str);
        return C60866ct.f164955a;
    }
}
