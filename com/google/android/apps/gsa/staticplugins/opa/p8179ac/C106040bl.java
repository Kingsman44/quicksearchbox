package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import com.google.assistant.p3814ai.p3815a.p3816a.C49168b;
import com.google.assistant.p3814ai.p3815a.p3816a.C49172f;
import com.google.assistant.p3814ai.p3815a.p3816a.C49174h;
import com.google.assistant.p3814ai.p3815a.p3816a.C49175i;
import com.google.assistant.p3814ai.p3815a.p3816a.C49177k;
import com.google.assistant.p3814ai.p3815a.p3816a.C49181o;
import com.google.assistant.p3814ai.p3815a.p3816a.C49185s;
import com.google.assistant.p3897e.p3917i.p3918a.C51571mq;
import com.google.assistant.p3897e.p3917i.p3918a.C51572mr;
import com.google.assistant.p3897e.p3917i.p3918a.C51575mu;
import com.google.assistant.p3897e.p3917i.p3918a.C51576mv;
import com.google.assistant.p3897e.p3917i.p3918a.C51577mw;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Collection;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.bl */
/* compiled from: PG */
public final /* synthetic */ class C106040bl implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C58495hd f296059a;

    /* renamed from: b */
    public final /* synthetic */ C51577mw f296060b;

    public /* synthetic */ C106040bl(C58495hd hdVar, C51577mw mwVar) {
        this.f296059a = hdVar;
        this.f296060b = mwVar;
    }

    public final void accept(Object obj) {
        C49177k kVar;
        C49168b bVar;
        C49181o oVar;
        C49181o oVar2;
        C49185s sVar;
        C58495hd hdVar = this.f296059a;
        C51577mw mwVar = this.f296060b;
        C49172f fVar = (C49172f) obj;
        C49175i iVar = fVar.f127149a;
        if (iVar == null) {
            iVar = C49175i.f127151d;
        }
        String str = iVar.f127155c;
        if (!hdVar.containsKey(str)) {
            ((C59052c) ((C59052c) C106044bp.f296064a.mo56226d()).mo56372aa(24700)).mo56389s("Invalid state. Expecting a horizontal intent entry for public id '%s'", str);
            return;
        }
        String str2 = (String) hdVar.get(str);
        C51571mq mqVar = (C51571mq) C51576mv.f134424c.createBuilder();
        mqVar.copyOnWrite();
        str2.getClass();
        ((C51576mv) mqVar.instance).f134426a = str2;
        C51572mr mrVar = (C51572mr) C51575mu.f134418e.createBuilder();
        C49175i iVar2 = fVar.f127149a;
        if (iVar2 == null) {
            iVar2 = C49175i.f127151d;
        }
        int a = C49174h.m85384a(iVar2.f127153a);
        int i = a - 1;
        if (a != 0) {
            if (i == 0) {
                mrVar.copyOnWrite();
                ((C51575mu) mrVar.instance).f134420a = 2;
                boolean z = fVar.f127150b;
                mrVar.copyOnWrite();
                ((C51575mu) mrVar.instance).f134422c = C106044bp.m176655b(z) - 2;
                C49175i iVar3 = fVar.f127149a;
                if (iVar3 == null) {
                    iVar3 = C49175i.f127151d;
                }
                if (iVar3.f127153a == 2) {
                    kVar = (C49177k) iVar3.f127154b;
                } else {
                    kVar = C49177k.f127156b;
                }
                mrVar.mo53640a(kVar.f127158a);
            } else if (i == 1) {
                mrVar.copyOnWrite();
                ((C51575mu) mrVar.instance).f134420a = 3;
                boolean z2 = fVar.f127150b;
                mrVar.copyOnWrite();
                ((C51575mu) mrVar.instance).f134422c = C106044bp.m176655b(z2) - 2;
                C49175i iVar4 = fVar.f127149a;
                if (iVar4 == null) {
                    iVar4 = C49175i.f127151d;
                }
                if (iVar4.f127153a == 3) {
                    bVar = (C49168b) iVar4.f127154b;
                } else {
                    bVar = C49168b.f127140b;
                }
                mrVar.mo53640a(bVar.f127142a);
            } else if (i == 2) {
                mrVar.copyOnWrite();
                ((C51575mu) mrVar.instance).f134420a = 4;
                boolean z3 = fVar.f127150b;
                mrVar.copyOnWrite();
                ((C51575mu) mrVar.instance).f134422c = C106044bp.m176655b(z3) - 2;
                C49175i iVar5 = fVar.f127149a;
                if (iVar5 == null) {
                    iVar5 = C49175i.f127151d;
                }
                if (iVar5.f127153a == 4) {
                    oVar = (C49181o) iVar5.f127154b;
                } else {
                    oVar = C49181o.f127163c;
                }
                mrVar.mo53640a(oVar.f127165a);
                C49175i iVar6 = fVar.f127149a;
                if (iVar6 == null) {
                    iVar6 = C49175i.f127151d;
                }
                if (iVar6.f127153a == 4) {
                    oVar2 = (C49181o) iVar6.f127154b;
                } else {
                    oVar2 = C49181o.f127163c;
                }
                Collection.EL.forEach(oVar2.f127166b, new C106042bn(mrVar));
            } else if (i == 3) {
                mrVar.copyOnWrite();
                ((C51575mu) mrVar.instance).f134420a = 1;
                boolean z4 = fVar.f127150b;
                mrVar.copyOnWrite();
                ((C51575mu) mrVar.instance).f134422c = C106044bp.m176655b(z4) - 2;
                C49175i iVar7 = fVar.f127149a;
                if (iVar7 == null) {
                    iVar7 = C49175i.f127151d;
                }
                if (iVar7.f127153a == 5) {
                    sVar = (C49185s) iVar7.f127154b;
                } else {
                    sVar = C49185s.f127170b;
                }
                mrVar.mo53640a(sVar.f127172a);
            } else if (i == 4) {
                throw new IllegalArgumentException("ExpectIntentMessage should have type horizontal intent config, but found custom intent.");
            }
            C51575mu muVar = (C51575mu) mrVar.build();
            mqVar.copyOnWrite();
            muVar.getClass();
            ((C51576mv) mqVar.instance).f134427b = muVar;
            mwVar.mo53644a((C51576mv) mqVar.build());
            return;
        }
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
