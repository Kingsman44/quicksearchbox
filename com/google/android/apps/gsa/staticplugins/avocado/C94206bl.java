package com.google.android.apps.gsa.staticplugins.avocado;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83917d;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83923j;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3861at.C50070jl;
import com.google.assistant.p3861at.C50071jm;
import com.google.assistant.p3861at.C50074jp;
import com.google.assistant.p3861at.C50075jq;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.bl */
/* compiled from: PG */
final class C94206bl extends C84036z {

    /* renamed from: a */
    final /* synthetic */ C94207bm f263207a;

    public C94206bl(C94207bm bmVar) {
        this.f263207a = bmVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        C94207bm bmVar = this.f263207a;
        C94256dh dhVar = bmVar.f263210c;
        C83923j jVar = bmVar.f263216i.f262367a.f262354z;
        C22871g gVar = dhVar.f263392g;
        ((C59052c) ((C59052c) C94256dh.f263378a.mo56224b()).mo56372aa(14331)).mo56386p("Start to link!");
        l lVar = dhVar.f263394i;
        Account account = (Account) dhVar.f263396k.mo77278a().mo56107c();
        ((C59052c) ((C59052c) C94256dh.f263378a.mo56224b()).mo56372aa(14307)).mo56387q("Link account for %d device(s)", jVar.f228573b.size());
        C50074jp jpVar = (C50074jp) C50075jq.f130193b.createBuilder();
        for (C83917d dVar : jVar.f228573b) {
            String str = dVar.f228555b;
            C50070jl jlVar = (C50070jl) C50071jm.f130181f.createBuilder();
            String str2 = dVar.f228555b;
            jlVar.copyOnWrite();
            C50071jm jmVar = (C50071jm) jlVar.instance;
            str2.getClass();
            jmVar.f130183a |= 1;
            jmVar.f130184b = str2;
            String str3 = dVar.f228556c;
            jlVar.copyOnWrite();
            C50071jm jmVar2 = (C50071jm) jlVar.instance;
            str3.getClass();
            jmVar2.f130183a |= 2;
            jmVar2.f130185c = str3;
            jlVar.copyOnWrite();
            C50071jm jmVar3 = (C50071jm) jlVar.instance;
            jmVar3.f130183a |= 8;
            jmVar3.f130186d = true;
            jlVar.copyOnWrite();
            C50071jm jmVar4 = (C50071jm) jlVar.instance;
            jmVar4.f130183a |= 16;
            jmVar4.f130187e = true;
            jpVar.mo53378a(jlVar);
        }
        acw acw = (acw) acx.f128971H.createBuilder();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        C50075jq jqVar = (C50075jq) jpVar.build();
        jqVar.getClass();
        acx.f128988e = jqVar;
        acx.f128984a |= 4;
        C60870cx j = gVar.mo28210j(lVar.d(account, (acx) acw.build(), 10, TimeUnit.SECONDS, dhVar.getClass().getSimpleName()), "link account", new C94249da(dhVar, jVar));
        ((C59052c) ((C59052c) C94207bm.f263208a.mo56224b()).mo56372aa(14244)).mo56386p("Start to link and verify.");
        return C58485gu.m89847o(this.f263207a.f263209b.mo77487a(j, C94203bi.f263204a), C83875ai.m133536a(j, new C94204bj(this), new C94205bk(this)));
    }
}
