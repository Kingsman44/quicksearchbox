package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p853l;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12865i;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12788a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p856a.C12875h;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16627a;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.p3926e.C51965fr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.l.y */
/* compiled from: PG */
public final class C12831y extends C22538o {

    /* renamed from: a */
    private static final C59071e f40053a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.l.y");

    /* renamed from: b */
    private final C12865i f40054b;

    public C12831y(C12865i iVar) {
        this.f40054b = iVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        Optional b = C12875h.m29134b(dwVar, "show_rendered_card_args", C51965fr.f136369d.getParserForType());
        if (b.isEmpty() || (((C51965fr) b.get()).f136371a & 1) == 0) {
            ((C59052c) ((C59052c) f40053a.mo56226d()).mo56372aa(44480)).mo56386p("Failed to get client op args");
            return C60856cj.m92900i(C12788a.f39966a);
        }
        try {
            C54201r rVar = (C54201r) C62942bv.parseFrom((C62942bv) C54201r.f142243f, ((C51965fr) b.get()).f136372b, C62921ba.m95368a());
            C12865i iVar = this.f40054b;
            C16627a aVar = (C16627a) C16662b.f48800l.createBuilder();
            aVar.copyOnWrite();
            C16662b bVar = (C16662b) aVar.instance;
            rVar.getClass();
            bVar.f48810i = rVar;
            bVar.f48802a |= 4;
            iVar.mo20751d((C16662b) aVar.build());
            return C60856cj.m92900i(C12788a.f39968c);
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f40053a.mo56225c()).mo56382g(e)).mo56372aa(44481)).mo56386p("Failed to parse RenderedCard in ShowRenderedCardArgs");
            return C60856cj.m92900i(C12788a.f39966a);
        }
    }
}
