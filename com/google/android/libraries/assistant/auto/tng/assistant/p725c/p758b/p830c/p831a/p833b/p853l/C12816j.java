package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p853l;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12865i;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12788a;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16667a;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16689e;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16754d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.l.j */
/* compiled from: PG */
public final class C12816j extends C22538o {

    /* renamed from: a */
    public final C69464a f40019a;

    /* renamed from: b */
    private final C12865i f40020b;

    /* renamed from: c */
    private final C16667a f40021c;

    /* renamed from: d */
    private final ScheduledExecutorService f40022d;

    /* renamed from: e */
    private final C69464a f40023e;

    public C12816j(C12865i iVar, C16667a aVar, ScheduledExecutorService scheduledExecutorService, C69464a aVar2, C69464a aVar3) {
        this.f40020b = iVar;
        this.f40021c = aVar;
        this.f40022d = scheduledExecutorService;
        this.f40023e = aVar2;
        this.f40019a = aVar3;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C16754d dVar;
        C69464a aVar = (C69464a) this.f40021c.f48821b.get(dyVar.f135936b);
        if (aVar == null || aVar.mo17428b() == null) {
            ((C59052c) ((C59052c) C16667a.f48820a.mo56226d()).mo56372aa(46769)).mo56389s("ClientOp cannot be handled by AppActionArgsTranslator, clientOp = %s", dyVar.f135936b);
            dVar = null;
        } else {
            dVar = ((C16689e) aVar.mo17428b()).mo22979a(dyVar);
        }
        if (dVar == null) {
            return C60856cj.m92900i(C12788a.f39966a);
        }
        this.f40020b.mo20749b(dVar);
        C12815i iVar = new C12815i(this);
        return C60856cj.m92902k(C47810es.m84965e(iVar), ((Long) this.f40023e.mo17428b()).longValue(), TimeUnit.MILLISECONDS, this.f40022d);
    }
}
