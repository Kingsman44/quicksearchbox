package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p853l;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12865i;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12788a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p856a.C12875h;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16733au;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16734av;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.p3926e.C52040il;
import com.google.assistant.p3897e.p3921j.p3926e.C52042in;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.l.aa */
/* compiled from: PG */
public final class C12807aa extends C22538o {

    /* renamed from: a */
    private static final C59071e f40002a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.l.aa");

    /* renamed from: b */
    private final C12865i f40003b;

    /* renamed from: c */
    private final C69464a f40004c;

    public C12807aa(C12865i iVar, C69464a aVar) {
        this.f40003b = iVar;
        this.f40004c = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C52070ec ecVar;
        C52040il ilVar;
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        Optional b = C12875h.m29134b(dwVar, "ui_current_action_indicator_args", C52042in.f136592c.getParserForType());
        if (b.isEmpty()) {
            ((C59052c) ((C59052c) f40002a.mo56226d()).mo56372aa(44486)).mo56386p("Failed to get client op args");
            return C60856cj.m92900i(C12788a.f39966a);
        }
        C52042in inVar = (C52042in) b.get();
        int i = inVar.f136594a;
        if (i == 2) {
            C12865i iVar = this.f40003b;
            C16733au auVar = (C16733au) C16734av.f48942d.createBuilder();
            auVar.copyOnWrite();
            C16734av avVar = (C16734av) auVar.instance;
            avVar.f48944a |= 1;
            avVar.f48945b = true;
            if (inVar.f136594a == 2) {
                ilVar = (C52040il) inVar.f136595b;
            } else {
                ilVar = C52040il.f136585e;
            }
            String str = ilVar.f136588b;
            auVar.copyOnWrite();
            C16734av avVar2 = (C16734av) auVar.instance;
            str.getClass();
            avVar2.f48944a = 2 | avVar2.f48944a;
            avVar2.f48946c = str;
            iVar.mo20752e((C16734av) auVar.build());
        } else if (i == 3) {
            C12865i iVar2 = this.f40003b;
            C16733au auVar2 = (C16733au) C16734av.f48942d.createBuilder();
            auVar2.copyOnWrite();
            C16734av avVar3 = (C16734av) auVar2.instance;
            avVar3.f48944a = 1 | avVar3.f48944a;
            avVar3.f48945b = false;
            iVar2.mo20752e((C16734av) auVar2.build());
        }
        if (((Boolean) this.f40004c.mo17428b()).booleanValue()) {
            ecVar = C12788a.f39969d;
        } else {
            ecVar = C12788a.f39968c;
        }
        return C60856cj.m92900i(ecVar);
    }
}
