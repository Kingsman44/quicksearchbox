package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9990s;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.smartspace.C83730ab;
import com.google.android.apps.gsa.opa.smartspace.C83731ac;
import com.google.android.apps.gsa.opa.smartspace.C83734af;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.assistant.p3803ag.p3809c.C49156z;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3994s.p3995a.C53224fz;
import com.google.assistant.p3994s.p3995a.C53226ga;
import com.google.assistant.p3994s.p3995a.C53227gb;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62971cq;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.s.g */
/* compiled from: PG */
public final /* synthetic */ class C131552g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131558m f359435a;

    /* renamed from: b */
    public final /* synthetic */ Function f359436b;

    public /* synthetic */ C131552g(C131558m mVar, Function function) {
        this.f359435a = mVar;
        this.f359436b = function;
    }

    public final Object apply(Object obj) {
        String str;
        C131558m mVar = this.f359435a;
        Function function = this.f359436b;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return Optional.empty();
        }
        C62971cq cqVar = ((C53227gb) optional.get()).f139502a;
        if (cqVar.isEmpty()) {
            ((C58970a) ((C58970a) mVar.f359442a.mo56224b()).mo56372aa(39315)).mo56386p("No stations details in PCP response.");
            return Optional.empty();
        }
        C53226ga gaVar = (C53226ga) cqVar.get(0);
        C83730ab abVar = (C83730ab) C83739ak.f228230q.createBuilder();
        C50794cr crVar = C50794cr.TRANSIT_STATION_INFO;
        abVar.copyOnWrite();
        C83739ak akVar = (C83739ak) abVar.instance;
        akVar.f228239h = crVar.f132222T;
        akVar.f228232a |= 64;
        String str2 = gaVar.f139495a;
        abVar.copyOnWrite();
        C83739ak akVar2 = (C83739ak) abVar.instance;
        str2.getClass();
        akVar2.f228232a |= 2;
        akVar2.f228234c = str2;
        C62971cq cqVar2 = gaVar.f139497c;
        if (cqVar2.isEmpty()) {
            str = BuildConfig.FLAVOR;
        } else {
            C53224fz fzVar = (C53224fz) cqVar2.get(0);
            str = fzVar.f139489a + " " + fzVar.f139490b + " " + fzVar.f139491c;
        }
        abVar.copyOnWrite();
        C83739ak akVar3 = (C83739ak) abVar.instance;
        akVar3.f228232a |= 4;
        akVar3.f228235d = str;
        abVar.copyOnWrite();
        C83739ak akVar4 = (C83739ak) abVar.instance;
        akVar4.f228232a |= 256;
        akVar4.f228241j = false;
        C49156z a = mVar.f359443b.mo110159a();
        abVar.copyOnWrite();
        C83739ak akVar5 = (C83739ak) abVar.instance;
        a.getClass();
        akVar5.f228240i = a;
        akVar5.f228232a |= 128;
        C83731ac acVar = (C83731ac) C83734af.f228216e.createBuilder();
        acVar.copyOnWrite();
        C83734af afVar = (C83734af) acVar.instance;
        afVar.f228218a |= 1;
        afVar.f228219b = "https://www.gstatic.com/images/icons/material/system_gm/2x/departure_board_white_24dp.png";
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
        afVar4.f228219b = "https://www.gstatic.com/images/icons/material/system_gm/2x/departure_board_black_24dp.png";
        acVar2.copyOnWrite();
        C83734af afVar5 = (C83734af) acVar2.instance;
        afVar5.f228220c = 1;
        afVar5.f228218a |= 2;
        acVar2.copyOnWrite();
        C83734af afVar6 = (C83734af) acVar2.instance;
        afVar6.f228218a |= 4;
        afVar6.f228221d = true;
        abVar.mo77053a(acVar2);
        Optional optional2 = (Optional) function.apply(gaVar.f139496b);
        if (optional2.isPresent()) {
            String str3 = (String) optional2.get();
            abVar.copyOnWrite();
            C83739ak akVar6 = (C83739ak) abVar.instance;
            str3.getClass();
            akVar6.f228232a |= 32;
            akVar6.f228238g = str3;
        }
        return Optional.m71637of((C83739ak) abVar.build());
    }
}
