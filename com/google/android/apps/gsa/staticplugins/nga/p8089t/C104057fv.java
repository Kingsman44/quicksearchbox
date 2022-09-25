package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.mdi.download.C28703ai;
import com.google.android.libraries.mdi.download.C28706al;
import com.google.android.libraries.mdi.download.C28707am;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C28746bx;
import com.google.android.libraries.mdi.download.C29343e;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.fv */
/* compiled from: PG */
public final class C104057fv implements C28746bx {

    /* renamed from: a */
    public final C104126w f289530a;

    /* renamed from: b */
    private final C104079gq f289531b;

    /* renamed from: c */
    private final C104032ex f289532c;

    /* renamed from: d */
    private final C22871g f289533d;

    /* renamed from: e */
    private final C103908ah f289534e;

    public C104057fv(C104032ex exVar, C104079gq gqVar, C22871g gVar, C104126w wVar, C103908ah ahVar) {
        this.f289532c = exVar;
        this.f289533d = gVar;
        this.f289531b = gqVar;
        this.f289530a = wVar;
        this.f289534e = ahVar;
    }

    /* renamed from: b */
    public final C60870cx mo19336b(C29409fd fdVar) {
        if (!this.f289531b.mo93938a()) {
            return C60866ct.f164955a;
        }
        if (this.f289532c.mo93928f(this.f289534e.mo93886h())) {
            return C60866ct.f164955a;
        }
        Optional a = this.f289532c.mo93925a();
        if (a.isEmpty()) {
            return C60866ct.f164955a;
        }
        String d = this.f289532c.mo93926d();
        C28707am amVar = (C28707am) C28708an.f77994l.createBuilder();
        amVar.copyOnWrite();
        C28708an anVar = (C28708an) amVar.instance;
        d.getClass();
        anVar.f77996a |= 1;
        anVar.f77997b = d;
        int i = ((C8476as) a.get()).f29419d;
        amVar.copyOnWrite();
        C28708an anVar2 = (C28708an) amVar.instance;
        anVar2.f77996a |= 4;
        anVar2.f77999d = i;
        C28703ai aiVar = (C28703ai) C28706al.f77976q.createBuilder();
        String str = ((C8476as) a.get()).f29421f;
        aiVar.copyOnWrite();
        C28706al alVar = (C28706al) aiVar.instance;
        str.getClass();
        alVar.f77978a |= 1;
        alVar.f77979b = str;
        aiVar.copyOnWrite();
        C28706al alVar2 = (C28706al) aiVar.instance;
        alVar2.f77982e = 1;
        alVar2.f77978a |= 8;
        int i2 = ((C8476as) a.get()).f29420e;
        aiVar.copyOnWrite();
        C28706al alVar3 = (C28706al) aiVar.instance;
        alVar3.f77978a |= 4;
        alVar3.f77981d = i2 * 1024;
        String str2 = ((C8476as) a.get()).f29418c;
        aiVar.copyOnWrite();
        C28706al alVar4 = (C28706al) aiVar.instance;
        str2.getClass();
        alVar4.f77978a |= 2;
        alVar4.f77980c = str2;
        amVar.mo34329c((C28706al) aiVar.build());
        C28708an anVar3 = (C28708an) amVar.build();
        C22871g gVar = this.f289533d;
        C29343e eVar = new C29343e();
        eVar.mo34326b(anVar3);
        return gVar.mo28209i(fdVar.mo34712a(eVar.mo34325a()), "[NGA] NgaFileGroupPopulator.refreshWithInitialData", new C104056fu(this, anVar3));
    }
}
