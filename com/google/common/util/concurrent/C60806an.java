package com.google.common.util.concurrent;

import com.google.apps.tiktok.concurrent.C46465q;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.apps.tiktok.dataservice.C46699aq;
import com.google.apps.tiktok.dataservice.C46701as;
import com.google.apps.tiktok.dataservice.C46720bd;
import com.google.apps.tiktok.dataservice.C46721be;
import com.google.apps.tiktok.tracing.C47794ec;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.common.util.concurrent.an */
/* compiled from: PG */
public final class C60806an implements C60930r {

    /* renamed from: a */
    final /* synthetic */ C60808ap f164864a;

    /* renamed from: b */
    final /* synthetic */ C60811as f164865b;

    public C60806an(C60811as asVar, C60808ap apVar) {
        this.f164865b = asVar;
        this.f164864a = apVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60817ay ayVar;
        C60813au auVar = new C60813au(this.f164865b.f164870b);
        C60808ap apVar = this.f164864a;
        C60802aj ajVar = this.f164865b.f164869a;
        boolean z = true;
        auVar.f164873a = true;
        C60802aj ajVar2 = new C60802aj();
        try {
            C47572bw bwVar = ((C47794ec) apVar).f123791a;
            C60808ap apVar2 = ((C47794ec) apVar).f123792b;
            int i = C47810es.f123822b;
            C47572bw h = C47831fm.m85013h(bwVar);
            try {
                C46465q qVar = ((C46701as) apVar2).f121994a;
                C60817ay ayVar2 = ((C46701as) apVar2).f121995b;
                C60817ay ayVar3 = ((C46701as) apVar2).f121996c;
                C46721be beVar = new C46721be(qVar);
                C46688af afVar = (C46688af) auVar.mo57269a(ayVar2);
                C46688af afVar2 = (C46688af) auVar.mo57269a(ayVar3);
                if (afVar.f121977b.f121974b) {
                    if (afVar2.f121977b.f121974b) {
                        C46465q qVar2 = beVar.f122040a;
                        C60817ay ayVar4 = new C60817ay(C60856cj.m92900i(((C46699aq) qVar2).f121989a.mo50468a(afVar.mo50739f(), afVar2.mo50739f())));
                        if (!afVar.mo50740g() || !afVar2.mo50740g()) {
                            z = false;
                        }
                        ayVar = ayVar4.mo57272e(C47810es.m84970j(new C46720bd(z, afVar, afVar2)), C60826bg.f164896a);
                        C47831fm.m85013h(h);
                        ayVar.mo57277i(ajVar);
                        return ayVar.f164885c;
                    }
                }
                ayVar = new C60817ay(C60856cj.m92900i(C46688af.f121976a));
                C47831fm.m85013h(h);
                ayVar.mo57277i(ajVar);
                return ayVar.f164885c;
            } catch (Throwable th) {
                C47831fm.m85013h(h);
                throw th;
            }
        } finally {
            ajVar.mo57261b(ajVar2, C60826bg.f164896a);
            auVar.f164873a = false;
        }
    }

    public final String toString() {
        return this.f164864a.toString();
    }
}
