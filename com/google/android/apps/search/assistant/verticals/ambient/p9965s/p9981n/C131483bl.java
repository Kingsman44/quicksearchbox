package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n;

import com.google.android.apps.gsa.opa.smartspace.C83730ab;
import com.google.android.apps.gsa.opa.smartspace.C83731ac;
import com.google.android.apps.gsa.opa.smartspace.C83734af;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83776s;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83780w;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3803ag.p3809c.C49156z;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.bl */
/* compiled from: PG */
public final /* synthetic */ class C131483bl implements Function {

    /* renamed from: a */
    public final /* synthetic */ C131495bx f359325a;

    /* renamed from: b */
    public final /* synthetic */ C131494bw f359326b;

    public /* synthetic */ C131483bl(C131495bx bxVar, C131494bw bwVar) {
        this.f359325a = bxVar;
        this.f359326b = bwVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C131495bx bxVar = this.f359325a;
        C83780w wVar = (C83780w) obj;
        C58485gu a = this.f359326b.mo110181a();
        C83730ab abVar = (C83730ab) C83739ak.f228230q.createBuilder();
        String a2 = bxVar.f359345f.mo110160a(a);
        abVar.copyOnWrite();
        C83739ak akVar = (C83739ak) abVar.instance;
        a2.getClass();
        akVar.f228232a |= 2;
        akVar.f228234c = a2;
        C50794cr crVar = C50794cr.SHOPPING_LIST;
        abVar.copyOnWrite();
        C83739ak akVar2 = (C83739ak) abVar.instance;
        akVar2.f228239h = crVar.f132222T;
        akVar2.f228232a |= 64;
        String string = bxVar.f359344e.getString(R.string.assistant_shopping_list_sign_up_card_content);
        abVar.copyOnWrite();
        C83739ak akVar3 = (C83739ak) abVar.instance;
        string.getClass();
        akVar3.f228232a |= 8;
        akVar3.f228236e = string;
        C49156z a3 = bxVar.f359343d.mo110159a();
        abVar.copyOnWrite();
        C83739ak akVar4 = (C83739ak) abVar.instance;
        a3.getClass();
        akVar4.f228240i = a3;
        akVar4.f228232a |= 128;
        String str = wVar.f228354b;
        abVar.copyOnWrite();
        C83739ak akVar5 = (C83739ak) abVar.instance;
        str.getClass();
        akVar5.f228232a |= 32;
        akVar5.f228238g = str;
        abVar.copyOnWrite();
        C83739ak akVar6 = (C83739ak) abVar.instance;
        akVar6.f228232a |= 256;
        akVar6.f228241j = false;
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
        C83776s sVar = wVar.f228355c;
        if (sVar == null) {
            sVar = C83776s.f228333e;
        }
        Optional a4 = C131495bx.m213920a(sVar);
        Objects.requireNonNull(abVar);
        a4.ifPresent(new C131492bu(abVar));
        return (C83739ak) abVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
