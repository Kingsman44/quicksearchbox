package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p819f.p820a.p821a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p819f.C12612e;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p868d.C12899c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p868d.C12900d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13020ah;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13023ak;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52077ej;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52079el;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52082eo;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.f.a.a.d */
/* compiled from: PG */
public final class C12587d extends C68247h {

    /* renamed from: a */
    private final C68283d f39542a;

    /* renamed from: c */
    private final C68283d f39543c;

    public C12587d(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C12587d.class), aVar);
        this.f39542a = C68236af.m98549d(dVar);
        this.f39543c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C12900d dVar;
        C13020ah ahVar;
        List list = (List) obj;
        C52091ex exVar = (C52091ex) list.get(0);
        C12612e eVar = (C12612e) list.get(1);
        C52079el elVar = (C52079el) C52081en.f136679i.createBuilder();
        elVar.copyOnWrite();
        C52081en enVar = (C52081en) elVar.instance;
        exVar.getClass();
        enVar.f136685e = exVar;
        enVar.f136681a |= 16;
        if (eVar.mo20677c().f40449a == 2) {
            C52082eo eoVar = (C52082eo) C52083ep.f136689f.createBuilder();
            C52077ej ejVar = (C52077ej) C52078ek.f136671f.createBuilder();
            C13023ak c = eVar.mo20677c();
            if (c.f40449a == 2) {
                ahVar = (C13020ah) c.f40450b;
            } else {
                ahVar = C13020ah.f40439c;
            }
            C51805du duVar = ahVar.f40442b;
            if (duVar == null) {
                duVar = C51805du.f135924e;
            }
            ejVar.copyOnWrite();
            C52078ek ekVar = (C52078ek) ejVar.instance;
            duVar.getClass();
            ekVar.f136675c = duVar;
            ekVar.f136674b = 5;
            C52078ek ekVar2 = (C52078ek) ejVar.build();
            eoVar.copyOnWrite();
            C52083ep epVar = (C52083ep) eoVar.instance;
            ekVar2.getClass();
            epVar.f136693c = ekVar2;
            epVar.f136692b = 3;
            elVar.mo53786c((C52083ep) eoVar.build());
        } else if (eVar.mo20677c().f40449a == 3) {
            C13023ak c2 = eVar.mo20677c();
            if (c2.f40449a == 3) {
                dVar = (C12900d) c2.f40450b;
            } else {
                dVar = C12900d.f40164b;
            }
            for (C12899c cVar : dVar.f40166a) {
                C52082eo eoVar2 = (C52082eo) C52083ep.f136689f.createBuilder();
                int i = cVar.f40162b;
                eoVar2.copyOnWrite();
                C52083ep epVar2 = (C52083ep) eoVar2.instance;
                epVar2.f136691a |= 2;
                epVar2.f136695e = i;
                C52077ej ejVar2 = (C52077ej) C52078ek.f136671f.createBuilder();
                C52070ec ecVar = cVar.f40163c;
                if (ecVar == null) {
                    ecVar = C52070ec.f136651d;
                }
                ejVar2.copyOnWrite();
                C52078ek ekVar3 = (C52078ek) ejVar2.instance;
                ecVar.getClass();
                ekVar3.f136675c = ecVar;
                ekVar3.f136674b = 3;
                C52078ek ekVar4 = (C52078ek) ejVar2.build();
                eoVar2.copyOnWrite();
                C52083ep epVar3 = (C52083ep) eoVar2.instance;
                ekVar4.getClass();
                epVar3.f136693c = ekVar4;
                epVar3.f136692b = 3;
                elVar.mo53786c((C52083ep) eoVar2.build());
            }
        }
        return C60856cj.m92900i((C52081en) elVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39542a.mo60297gq(), this.f39543c.mo60297gq());
    }
}
