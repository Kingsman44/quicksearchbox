package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.opa.smartspace.C83730ab;
import com.google.android.apps.gsa.opa.smartspace.C83731ac;
import com.google.android.apps.gsa.opa.smartspace.C83734af;
import com.google.android.apps.gsa.opa.smartspace.C83737ai;
import com.google.android.apps.gsa.opa.smartspace.C83738aj;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83776s;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83778u;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83781x;
import com.google.assistant.p3803ag.p3809c.C49156z;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p4016z.C53692aq;
import com.google.assistant.p4016z.C53700ay;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.p4479cg.C58079k;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.bq */
/* compiled from: PG */
public final /* synthetic */ class C131488bq implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131495bx f359332a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f359333b;

    public /* synthetic */ C131488bq(C131495bx bxVar, C58485gu guVar) {
        this.f359332a = bxVar;
        this.f359333b = guVar;
    }

    public final Object apply(Object obj) {
        C131495bx bxVar = this.f359332a;
        C58485gu guVar = this.f359333b;
        Optional optional = (Optional) obj;
        if (bxVar.f359347h) {
            C53692aq aqVar = (C53692aq) guVar.get(0);
            Locale locale = Locale.US;
            Object[] objArr = new Object[2];
            C53700ay ayVar = aqVar.f140945g;
            if (ayVar == null) {
                ayVar = C53700ay.f140964d;
            }
            C58079k kVar = ayVar.f140966a;
            if (kVar == null) {
                kVar = C58079k.f155250c;
            }
            objArr[0] = Double.valueOf(kVar.f155252a);
            C53700ay ayVar2 = aqVar.f140945g;
            if (ayVar2 == null) {
                ayVar2 = C53700ay.f140964d;
            }
            C58079k kVar2 = ayVar2.f140966a;
            if (kVar2 == null) {
                kVar2 = C58079k.f155250c;
            }
            objArr[1] = Double.valueOf(kVar2.f155253b);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format(locale, "geo:%f,%f", objArr)));
            intent.setPackage("com.google.android.apps.maps");
            C83730ab abVar = (C83730ab) C83739ak.f228230q.createBuilder();
            String a = bxVar.f359345f.mo110160a(guVar);
            abVar.copyOnWrite();
            C83739ak akVar = (C83739ak) abVar.instance;
            a.getClass();
            akVar.f228232a |= 2;
            akVar.f228234c = a;
            C50794cr crVar = C50794cr.SHOPPING_LIST;
            abVar.copyOnWrite();
            C83739ak akVar2 = (C83739ak) abVar.instance;
            akVar2.f228239h = crVar.f132222T;
            akVar2.f228232a |= 64;
            C49156z a2 = bxVar.f359343d.mo110159a();
            abVar.copyOnWrite();
            C83739ak akVar3 = (C83739ak) abVar.instance;
            a2.getClass();
            akVar3.f228240i = a2;
            akVar3.f228232a |= 128;
            abVar.copyOnWrite();
            C83739ak akVar4 = (C83739ak) abVar.instance;
            akVar4.f228232a |= 256;
            akVar4.f228241j = false;
            String uri = intent.toUri(1);
            abVar.copyOnWrite();
            C83739ak akVar5 = (C83739ak) abVar.instance;
            uri.getClass();
            akVar5.f228232a |= 32;
            akVar5.f228238g = uri;
            C83731ac acVar = (C83731ac) C83734af.f228216e.createBuilder();
            acVar.copyOnWrite();
            C83734af afVar = (C83734af) acVar.instance;
            afVar.f228218a |= 1;
            afVar.f228219b = "https://www.gstatic.com/images/icons/material/system_gm/2x/place_white_24dp.png";
            acVar.copyOnWrite();
            C83734af afVar2 = (C83734af) acVar.instance;
            afVar2.f228220c = 2;
            afVar2.f228218a |= 2;
            acVar.copyOnWrite();
            C83734af afVar3 = (C83734af) acVar.instance;
            afVar3.f228218a |= 4;
            afVar3.f228221d = true;
            abVar.mo77053a(acVar);
            C83731ac acVar2 = (C83731ac) C83734af.f228216e.createBuilder();
            acVar2.copyOnWrite();
            C83734af afVar4 = (C83734af) acVar2.instance;
            afVar4.f228218a |= 1;
            afVar4.f228219b = "https://www.gstatic.com/images/icons/material/system_gm/2x/place_black_24dp.png";
            acVar2.copyOnWrite();
            C83734af afVar5 = (C83734af) acVar2.instance;
            afVar5.f228220c = 1;
            afVar5.f228218a |= 2;
            acVar2.copyOnWrite();
            C83734af afVar6 = (C83734af) acVar2.instance;
            afVar6.f228218a |= 4;
            afVar6.f228221d = true;
            abVar.mo77053a(acVar2);
            C83737ai aiVar = (C83737ai) C83738aj.f228226c.createBuilder();
            C83778u uVar = C83778u.f228339k;
            aiVar.copyOnWrite();
            C83738aj ajVar = (C83738aj) aiVar.instance;
            uVar.getClass();
            ajVar.f228229b = uVar;
            ajVar.f228228a = 9;
            abVar.copyOnWrite();
            C83739ak akVar6 = (C83739ak) abVar.instance;
            C83738aj ajVar2 = (C83738aj) aiVar.build();
            ajVar2.getClass();
            akVar6.f228233b = ajVar2;
            akVar6.f228232a |= 1;
            C131467b e = C131494bw.m213915e();
            e.mo110179c(Optional.m71637of((C83739ak) abVar.build()));
            ((C58970a) ((C58970a) bxVar.f359340a.mo56224b()).mo56372aa(39294)).mo56386p("Building CSL card");
            return e.mo110177a();
        } else if (optional.isEmpty()) {
            ((C58970a) ((C58970a) bxVar.f359340a.mo56224b()).mo56372aa(39293)).mo56386p("No shopping list payload.");
            return C131494bw.m213915e().mo110177a();
        } else {
            C83781x xVar = (C83781x) optional.get();
            Optional max = Collection.EL.stream(xVar.f228358a).max(Comparator.CC.comparingLong(C131493bv.f359339a));
            if (max.isPresent()) {
                C83778u uVar2 = (C83778u) max.get();
                if (uVar2.f228347g) {
                    ((C58970a) ((C58970a) bxVar.f359340a.mo56224b()).mo56372aa(39292)).mo56386p("Found a shopping list to show, but it's not loaded yet.");
                    C131467b e2 = C131494bw.m213915e();
                    e2.f359300a = Optional.m71637of(uVar2.f228346f);
                    return e2.mo110177a();
                }
                C83730ab abVar2 = (C83730ab) C83739ak.f228230q.createBuilder();
                String a3 = bxVar.f359345f.mo110160a(guVar);
                abVar2.copyOnWrite();
                C83739ak akVar7 = (C83739ak) abVar2.instance;
                a3.getClass();
                akVar7.f228232a |= 2;
                akVar7.f228234c = a3;
                C50794cr crVar2 = C50794cr.SHOPPING_LIST;
                abVar2.copyOnWrite();
                C83739ak akVar8 = (C83739ak) abVar2.instance;
                akVar8.f228239h = crVar2.f132222T;
                akVar8.f228232a |= 64;
                C49156z a4 = bxVar.f359343d.mo110159a();
                abVar2.copyOnWrite();
                C83739ak akVar9 = (C83739ak) abVar2.instance;
                a4.getClass();
                akVar9.f228240i = a4;
                akVar9.f228232a |= 128;
                String str = uVar2.f228348h;
                abVar2.copyOnWrite();
                C83739ak akVar10 = (C83739ak) abVar2.instance;
                str.getClass();
                akVar10.f228232a |= 32;
                akVar10.f228238g = str;
                abVar2.copyOnWrite();
                C83739ak akVar11 = (C83739ak) abVar2.instance;
                akVar11.f228232a |= 256;
                akVar11.f228241j = false;
                C83731ac acVar3 = (C83731ac) C83734af.f228216e.createBuilder();
                acVar3.copyOnWrite();
                C83734af afVar7 = (C83734af) acVar3.instance;
                afVar7.f228218a |= 1;
                afVar7.f228219b = "https://www.gstatic.com/images/icons/material/system_gm/2x/place_white_24dp.png";
                acVar3.copyOnWrite();
                C83734af afVar8 = (C83734af) acVar3.instance;
                afVar8.f228220c = 2;
                afVar8.f228218a |= 2;
                acVar3.copyOnWrite();
                C83734af afVar9 = (C83734af) acVar3.instance;
                afVar9.f228218a |= 4;
                afVar9.f228221d = true;
                abVar2.mo77053a(acVar3);
                C83731ac acVar4 = (C83731ac) C83734af.f228216e.createBuilder();
                acVar4.copyOnWrite();
                C83734af afVar10 = (C83734af) acVar4.instance;
                afVar10.f228218a |= 1;
                afVar10.f228219b = "https://www.gstatic.com/images/icons/material/system_gm/2x/place_black_24dp.png";
                acVar4.copyOnWrite();
                C83734af afVar11 = (C83734af) acVar4.instance;
                afVar11.f228220c = 1;
                afVar11.f228218a |= 2;
                acVar4.copyOnWrite();
                C83734af afVar12 = (C83734af) acVar4.instance;
                afVar12.f228218a |= 4;
                afVar12.f228221d = true;
                abVar2.mo77053a(acVar4);
                C83737ai aiVar2 = (C83737ai) C83738aj.f228226c.createBuilder();
                aiVar2.copyOnWrite();
                C83738aj ajVar3 = (C83738aj) aiVar2.instance;
                uVar2.getClass();
                ajVar3.f228229b = uVar2;
                ajVar3.f228228a = 9;
                abVar2.copyOnWrite();
                C83739ak akVar12 = (C83739ak) abVar2.instance;
                C83738aj ajVar4 = (C83738aj) aiVar2.build();
                ajVar4.getClass();
                akVar12.f228233b = ajVar4;
                akVar12.f228232a |= 1;
                C83776s sVar = uVar2.f228350j;
                if (sVar == null) {
                    sVar = C83776s.f228333e;
                }
                Optional a5 = C131495bx.m213920a(sVar);
                Objects.requireNonNull(abVar2);
                a5.ifPresent(new C131492bu(abVar2));
                C131467b e3 = C131494bw.m213915e();
                e3.mo110179c(Optional.m71637of((C83739ak) abVar2.build()));
                if (!uVar2.f228346f.isEmpty()) {
                    e3.f359300a = Optional.m71637of(uVar2.f228346f);
                }
                ((C58970a) ((C58970a) bxVar.f359340a.mo56224b()).mo56372aa(39291)).mo56386p("Generated a card.");
                return e3.mo110177a();
            }
            ((C58970a) ((C58970a) bxVar.f359340a.mo56224b()).mo56372aa(39290)).mo56386p("No shopping list to show.");
            C131467b e4 = C131494bw.m213915e();
            e4.f359301b = Optional.m71637of(xVar);
            e4.mo110178b(guVar);
            e4.f359301b = Optional.m71637of(xVar);
            return e4.mo110177a();
        }
    }
}
