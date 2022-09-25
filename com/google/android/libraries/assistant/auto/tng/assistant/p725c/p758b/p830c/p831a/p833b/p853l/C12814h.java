package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p853l;

import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.aek;
import com.google.assistant.p3897e.p3921j.aem;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65849r;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.l.h */
/* compiled from: PG */
public final class C12814h extends C22538o {

    /* renamed from: d */
    public static final /* synthetic */ int f40012d = 0;

    /* renamed from: a */
    public final C38469m f40013a;

    /* renamed from: b */
    public final C21370a f40014b;

    /* renamed from: c */
    public final C69464a f40015c;

    /* renamed from: e */
    private final Executor f40016e;

    /* renamed from: f */
    private final Executor f40017f;

    public C12814h(C38469m mVar, C21370a aVar, C69464a aVar2, Executor executor, Executor executor2) {
        this.f40013a = mVar;
        this.f40014b = aVar;
        this.f40015c = aVar2;
        this.f40016e = executor;
        this.f40017f = executor2;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("auto_read.MODIFY_SETTINGS")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            int a = aek.m86299a(((aem) m41992m(dwVar, "auto_read_settings_args", aem.f134938b.getParserForType())).f134940a);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 1) {
                return mo20802b(true);
            }
            if (i == 2) {
                return mo20802b(false);
            }
            throw new C22428d(dyVar);
        }
        throw new C22428d(dyVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C60870cx mo20802b(boolean z) {
        return C47633f.m84733g(C47633f.m84733g(this.f40013a.mo41431b(C65753ak.ASSISTANT_SETTINGS, "driving_settings", C63662ac.f172144a, C65849r.f179002c)).mo51515h(C12811e.f40008a, this.f40017f).mo51515h(C12812f.f40009a, this.f40017f)).mo51515h(new C12806a(this, z), this.f40017f).mo51516i(new C12808b(this), this.f40016e).mo51515h(C12809c.f40006a, this.f40017f).mo51513e(Exception.class, C12810d.f40007a, this.f40017f);
    }
}
