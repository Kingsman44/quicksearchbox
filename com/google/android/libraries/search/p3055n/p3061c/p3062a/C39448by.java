package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3066d.C39494i;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a.C39518a;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a.C39526i;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71080dz;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71082ea;

/* renamed from: com.google.android.libraries.search.n.c.a.by */
/* compiled from: PG */
public final /* synthetic */ class C39448by implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39479cu f103853a;

    /* renamed from: b */
    public final /* synthetic */ C39411b f103854b;

    public /* synthetic */ C39448by(C39479cu cuVar, C39411b bVar) {
        this.f103853a = cuVar;
        this.f103854b = bVar;
    }

    public final C60870cx apply(Object obj) {
        C37259h hVar;
        C39479cu cuVar = this.f103853a;
        C39411b bVar = this.f103854b;
        Exception exc = (Exception) obj;
        C39526i iVar = cuVar.f103970u;
        String b = bVar.mo41821b();
        C39389ae a = bVar.mo41820a();
        C58833ax axVar = cuVar.f103942D;
        C58833ax axVar2 = cuVar.f103943E;
        boolean z = false;
        boolean z2 = axVar.mo56113h() && ((Boolean) axVar.mo56107c()).booleanValue();
        if (axVar2.mo56113h() && ((Boolean) axVar2.mo56107c()).booleanValue()) {
            z = true;
        }
        if (a == C39389ae.HOTWORD_TIMEOUT) {
            hVar = C37176a.f97312jf.mo40806d();
        } else {
            hVar = C37176a.f97250hx.mo40806d();
        }
        C39636r rVar = new C39636r();
        if (b != null) {
            rVar.f104346a = b;
            rVar.mo41791b(a);
            C39411b a2 = rVar.mo41790a();
            if (z) {
                C71080dz dzVar = (C71080dz) C71082ea.f189563q.createBuilder();
                dzVar.copyOnWrite();
                C71082ea eaVar = (C71082ea) dzVar.instance;
                eaVar.f189566b = a.getNumber();
                eaVar.f189565a |= 1;
                String name = exc.getClass().getName();
                dzVar.copyOnWrite();
                C71082ea eaVar2 = (C71082ea) dzVar.instance;
                name.getClass();
                eaVar2.f189565a |= 32768;
                eaVar2.f189578n = name;
                String g = C58837ba.m90858g(exc.getMessage());
                dzVar.copyOnWrite();
                C71082ea eaVar3 = (C71082ea) dzVar.instance;
                eaVar3.f189565a |= 65536;
                eaVar3.f189579o = g;
                iVar.mo41873g(hVar, a2, (C71082ea) dzVar.build(), 16);
            } else if (z2) {
                C71080dz dzVar2 = (C71080dz) C71082ea.f189563q.createBuilder();
                dzVar2.copyOnWrite();
                C71082ea eaVar4 = (C71082ea) dzVar2.instance;
                eaVar4.f189566b = a.getNumber();
                eaVar4.f189565a |= 1;
                iVar.mo41873g(hVar, a2, (C71082ea) dzVar2.build(), 14);
            } else if (!axVar2.mo56113h()) {
                ((C59052c) ((C59052c) ((C59052c) C39518a.f104055a.mo56224b()).mo56382g(exc.getCause())).mo56372aa(53685)).mo56354G("e.namge %s, e.getCause() %s ", exc.getClass().getName(), exc.getCause());
                if (exc.getCause() instanceof C39494i) {
                    C71080dz dzVar3 = (C71080dz) C71082ea.f189563q.createBuilder();
                    dzVar3.copyOnWrite();
                    C71082ea eaVar5 = (C71082ea) dzVar3.instance;
                    eaVar5.f189566b = a.getNumber();
                    eaVar5.f189565a |= 1;
                    iVar.mo41873g(hVar, a2, (C71082ea) dzVar3.build(), 12);
                } else {
                    C71080dz dzVar4 = (C71080dz) C71082ea.f189563q.createBuilder();
                    dzVar4.copyOnWrite();
                    C71082ea eaVar6 = (C71082ea) dzVar4.instance;
                    eaVar6.f189566b = a.getNumber();
                    eaVar6.f189565a |= 1;
                    iVar.mo41873g(hVar, a2, (C71082ea) dzVar4.build(), 11);
                }
            } else {
                ((C59052c) ((C59052c) C39518a.f104055a.mo56225c()).mo56372aa(53684)).mo56386p("This should not happen now since we only fetch speech internal Config after fetching HotwordInformation success.");
                C71080dz dzVar5 = (C71080dz) C71082ea.f189563q.createBuilder();
                dzVar5.copyOnWrite();
                C71082ea eaVar7 = (C71082ea) dzVar5.instance;
                eaVar7.f189566b = a.getNumber();
                eaVar7.f189565a |= 1;
                iVar.mo41873g(hVar, a2, (C71082ea) dzVar5.build(), 15);
            }
            C59104x c = C39479cu.f103938a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
            ((C59052c) ((C59052c) c).mo56372aa(53582)).mo56386p("Getting HotwordInformation failed! Reset internalHotwordConfigOptional");
            C59104x d = C39479cu.f103938a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
            C59052c cVar = (C59052c) ((C59052c) d).mo56382g(exc);
            cVar.mo56380ai(C58979ad.FULL);
            ((C59052c) cVar.mo56372aa(53583)).mo56386p("getAllConfigAndTakeAction failed!");
            cuVar.f103973x = C58836b.f156633a;
            return C60866ct.f164955a;
        }
        throw new NullPointerException("Null appFlowLoggingTag");
    }
}
