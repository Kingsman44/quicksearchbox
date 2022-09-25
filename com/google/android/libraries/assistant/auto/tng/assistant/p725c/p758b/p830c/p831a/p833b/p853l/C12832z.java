package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p853l;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12865i;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12788a;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16735aw;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16736ax;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.assistant.p3897e.p3902c.p3907c.C51075fl;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.p3926e.C52036ih;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.l.z */
/* compiled from: PG */
public final class C12832z extends C22538o {

    /* renamed from: a */
    private static final C59071e f40055a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.l.z");

    /* renamed from: b */
    private final C12865i f40056b;

    /* renamed from: c */
    private final C69464a f40057c;

    public C12832z(C12865i iVar, C69464a aVar) {
        this.f40056b = iVar;
        this.f40057c = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C52070ec ecVar;
        C51075fl flVar;
        C51075fl flVar2;
        C51075fl flVar3;
        C51075fl flVar4;
        String str = dyVar.f135936b;
        if (str.equals("ui.THIRD_PARTY_START_INDICATOR")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C52036ih ihVar = (C52036ih) m41992m(dwVar, "third_party_start_indicator_args", C52036ih.f136574g.getParserForType());
            C51098gh ghVar = ihVar.f136578c;
            if (ghVar == null) {
                ghVar = C51098gh.f133009e;
            }
            if (ghVar.f133012b == 3) {
                flVar = (C51075fl) ghVar.f133013c;
            } else {
                flVar = C51075fl.f132982e;
            }
            if (!flVar.f132985b.isEmpty()) {
                C51098gh ghVar2 = ihVar.f136578c;
                if (ghVar2 == null) {
                    ghVar2 = C51098gh.f133009e;
                }
                if (ghVar2.f133012b == 3) {
                    flVar2 = (C51075fl) ghVar2.f133013c;
                } else {
                    flVar2 = C51075fl.f132982e;
                }
                if (!flVar2.f132986c.isEmpty()) {
                    C16735aw awVar = (C16735aw) C16736ax.f48947d.createBuilder();
                    C51098gh ghVar3 = ihVar.f136578c;
                    if (ghVar3 == null) {
                        ghVar3 = C51098gh.f133009e;
                    }
                    if (ghVar3.f133012b == 3) {
                        flVar3 = (C51075fl) ghVar3.f133013c;
                    } else {
                        flVar3 = C51075fl.f132982e;
                    }
                    String str2 = flVar3.f132985b;
                    awVar.copyOnWrite();
                    C16736ax axVar = (C16736ax) awVar.instance;
                    str2.getClass();
                    axVar.f48949a |= 1;
                    axVar.f48950b = str2;
                    C51098gh ghVar4 = ihVar.f136578c;
                    if (ghVar4 == null) {
                        ghVar4 = C51098gh.f133009e;
                    }
                    if (ghVar4.f133012b == 3) {
                        flVar4 = (C51075fl) ghVar4.f133013c;
                    } else {
                        flVar4 = C51075fl.f132982e;
                    }
                    String str3 = flVar4.f132986c;
                    awVar.copyOnWrite();
                    C16736ax axVar2 = (C16736ax) awVar.instance;
                    str3.getClass();
                    axVar2.f48949a |= 2;
                    axVar2.f48951c = str3;
                    ((C59052c) ((C59052c) f40055a.mo56224b()).mo56372aa(44485)).mo56386p("Updating ThirdPartyProvider");
                    this.f40056b.mo20753f((C16736ax) awVar.build());
                }
            }
            ((C59052c) ((C59052c) f40055a.mo56226d()).mo56372aa(44484)).mo56386p("Empty Provider Logo or Name");
            return C60856cj.m92900i(C12788a.f39966a);
        } else if (str.equals("ui.THIRD_PARTY_EXIT_INDICATOR")) {
            ((C59052c) ((C59052c) f40055a.mo56224b()).mo56372aa(44483)).mo56386p("Exiting ThirdPartyProvider");
            this.f40056b.mo20753f(C16736ax.f48947d);
        }
        if (((Boolean) this.f40057c.mo17428b()).booleanValue()) {
            ecVar = C12788a.f39969d;
        } else {
            ecVar = C12788a.f39968c;
        }
        return C60856cj.m92900i(ecVar);
    }
}
