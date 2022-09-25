package com.google.android.libraries.p590as.p593b.p596b.p607i;

import com.google.android.libraries.mdi.download.C28703ai;
import com.google.android.libraries.mdi.download.C28706al;
import com.google.android.libraries.mdi.download.C28707am;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C28713as;
import com.google.android.libraries.mdi.download.C28716av;
import com.google.android.libraries.mdi.download.C29343e;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.p590as.p593b.p596b.C10872g;
import com.google.android.libraries.p590as.p593b.p596b.C10882h;
import com.google.android.libraries.p590as.p593b.p596b.p602f.p603a.C10871f;
import com.google.android.libraries.p590as.p593b.p596b.p604g.C10874b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4433bz.p4437b.C57906k;
import com.google.p4433bz.p4437b.C57907l;
import com.google.p4433bz.p4437b.C57908m;
import com.google.p4433bz.p4437b.C57909n;
import com.google.p4433bz.p4437b.C57910o;
import com.google.p4433bz.p4437b.C57911p;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.as.b.b.i.q */
/* compiled from: PG */
public final /* synthetic */ class C10938q implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C10905af f36052a;

    /* renamed from: b */
    public final /* synthetic */ C10882h f36053b;

    /* renamed from: c */
    public final /* synthetic */ C29409fd f36054c;

    public /* synthetic */ C10938q(C10905af afVar, C10882h hVar, C29409fd fdVar) {
        this.f36052a = afVar;
        this.f36053b = hVar;
        this.f36054c = fdVar;
    }

    public final C60870cx apply(Object obj) {
        C10905af afVar = this.f36052a;
        C10882h hVar = this.f36053b;
        C29409fd fdVar = this.f36054c;
        int i = true != ((C10874b) obj).equals(C10874b.WIFI_AND_CELLULAR) ? 1 : 2;
        C28707am amVar = (C28707am) C28708an.f77994l.createBuilder();
        String c = C10905af.m25922c(hVar);
        amVar.copyOnWrite();
        C28708an anVar = (C28708an) amVar.instance;
        c.getClass();
        anVar.f77996a |= 1;
        anVar.f77997b = c;
        C28713as asVar = (C28713as) C28716av.f78018d.createBuilder();
        asVar.copyOnWrite();
        C28716av avVar = (C28716av) asVar.instance;
        avVar.f78022c = i - 1;
        avVar.f78020a |= 2;
        asVar.copyOnWrite();
        C28716av avVar2 = (C28716av) asVar.instance;
        avVar2.f78021b = 1;
        avVar2.f78020a |= 1;
        amVar.copyOnWrite();
        C28708an anVar2 = (C28708an) amVar.instance;
        C28716av avVar3 = (C28716av) asVar.build();
        avVar3.getClass();
        anVar2.f78002g = avVar3;
        anVar2.f77996a |= 1024;
        C28703ai aiVar = (C28703ai) C28706al.f77976q.createBuilder();
        aiVar.copyOnWrite();
        C28706al alVar = (C28706al) aiVar.instance;
        alVar.f77978a |= 1;
        alVar.f77979b = "zipfile";
        String a = ((C10872g) hVar.mo19285d().mo56107c()).mo19316a();
        aiVar.copyOnWrite();
        C28706al alVar2 = (C28706al) aiVar.instance;
        a.getClass();
        alVar2.f77978a |= 2;
        alVar2.f77980c = a;
        long b = hVar.mo19283b();
        aiVar.copyOnWrite();
        C28706al alVar3 = (C28706al) aiVar.instance;
        alVar3.f77978a |= 4;
        alVar3.f77981d = (int) b;
        String lowerCase = ((C10872g) hVar.mo19285d().mo56107c()).mo19317b().toLowerCase(Locale.US);
        aiVar.copyOnWrite();
        C28706al alVar4 = (C28706al) aiVar.instance;
        lowerCase.getClass();
        alVar4.f77978a |= 64;
        alVar4.f77985h = lowerCase;
        C57908m mVar = (C57908m) C57909n.f154891b.createBuilder();
        C57906k kVar = (C57906k) C57907l.f154887c.createBuilder();
        C57910o oVar = (C57910o) C57911p.f154894c.createBuilder();
        oVar.copyOnWrite();
        C57911p pVar = (C57911p) oVar.instance;
        pVar.f154896a |= 1;
        pVar.f154897b = "*";
        C57911p pVar2 = (C57911p) oVar.build();
        kVar.copyOnWrite();
        C57907l lVar = (C57907l) kVar.instance;
        pVar2.getClass();
        lVar.f154890b = pVar2;
        lVar.f154889a = 4;
        mVar.mo54537a(kVar);
        aiVar.copyOnWrite();
        C28706al alVar5 = (C28706al) aiVar.instance;
        C57909n nVar = (C57909n) mVar.build();
        nVar.getClass();
        alVar5.f77984g = nVar;
        alVar5.f77978a |= 32;
        amVar.mo34328b(aiVar);
        amVar.copyOnWrite();
        C28708an anVar3 = (C28708an) amVar.instance;
        anVar3.f77996a |= 256;
        anVar3.f78001f = 604800;
        C28708an anVar4 = (C28708an) amVar.build();
        Optional max = Collection.EL.stream(afVar.f35997c).filter(new C10936o(hVar)).max(Comparator.CC.comparingLong(C10937p.f36051a));
        if (!max.isEmpty()) {
            ((C58970a) ((C58970a) C10905af.f35995a.mo56224b()).mo56372aa(54032)).mo56388r("Injecting training plan %d", ((C10871f) max.get()).f35940b);
            C28707am amVar2 = (C28707am) anVar4.toBuilder();
            long j = ((C10871f) max.get()).f35940b;
            amVar2.copyOnWrite();
            C28708an anVar5 = (C28708an) amVar2.instance;
            anVar5.f77996a |= 4;
            anVar5.f77999d = (int) j;
            C28703ai aiVar2 = (C28703ai) C28706al.f77976q.createBuilder();
            aiVar2.copyOnWrite();
            C28706al alVar6 = (C28706al) aiVar2.instance;
            alVar6.f77978a |= 1;
            alVar6.f77979b = "training_plan_zipfile";
            String str = ((C10871f) max.get()).f35941c;
            aiVar2.copyOnWrite();
            C28706al alVar7 = (C28706al) aiVar2.instance;
            str.getClass();
            alVar7.f77978a = 2 | alVar7.f77978a;
            alVar7.f77980c = str;
            long j2 = ((C10871f) max.get()).f35943e;
            aiVar2.copyOnWrite();
            C28706al alVar8 = (C28706al) aiVar2.instance;
            alVar8.f77978a |= 4;
            alVar8.f77981d = (int) j2;
            String str2 = ((C10871f) max.get()).f35942d;
            aiVar2.copyOnWrite();
            C28706al alVar9 = (C28706al) aiVar2.instance;
            str2.getClass();
            alVar9.f77978a |= 64;
            alVar9.f77985h = str2;
            C57908m mVar2 = (C57908m) C57909n.f154891b.createBuilder();
            C57906k kVar2 = (C57906k) C57907l.f154887c.createBuilder();
            C57910o oVar2 = (C57910o) C57911p.f154894c.createBuilder();
            oVar2.copyOnWrite();
            C57911p pVar3 = (C57911p) oVar2.instance;
            pVar3.f154896a = 1 | pVar3.f154896a;
            pVar3.f154897b = "*";
            C57911p pVar4 = (C57911p) oVar2.build();
            kVar2.copyOnWrite();
            C57907l lVar2 = (C57907l) kVar2.instance;
            pVar4.getClass();
            lVar2.f154890b = pVar4;
            lVar2.f154889a = 4;
            mVar2.mo54537a(kVar2);
            aiVar2.copyOnWrite();
            C28706al alVar10 = (C28706al) aiVar2.instance;
            C57909n nVar2 = (C57909n) mVar2.build();
            nVar2.getClass();
            alVar10.f77984g = nVar2;
            alVar10.f77978a |= 32;
            amVar2.mo34328b(aiVar2);
            anVar4 = (C28708an) amVar2.build();
        }
        C29343e eVar = new C29343e();
        eVar.mo34326b(anVar4);
        return fdVar.mo34712a(eVar.mo34325a());
    }
}
