package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c;

import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13543s;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13546v;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p976c.C13488g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61886aw;
import com.google.protobuf.C62963cj;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.c.h */
/* compiled from: PG */
public final /* synthetic */ class C13493h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13496k f41392a;

    /* renamed from: b */
    public final /* synthetic */ C13543s f41393b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f41394c;

    public /* synthetic */ C13493h(C13496k kVar, C13543s sVar, C60870cx cxVar) {
        this.f41392a = kVar;
        this.f41393b = sVar;
        this.f41394c = cxVar;
    }

    public final C60870cx apply(Object obj) {
        C13496k kVar = this.f41392a;
        C13543s sVar = this.f41393b;
        C60870cx cxVar = this.f41394c;
        C13495j jVar = (C13495j) obj;
        if (jVar.mo21107d() != 3) {
            return C60856cj.m92900i((C13546v) jVar.mo21105b().mo56107c());
        }
        C60870cx g = C60922j.m93044g(cxVar, C47810es.m84963c(new C13490e(jVar)), kVar.f41396b);
        C60870cx b = C13488g.m29745b((C61886aw) jVar.mo21104a().mo56107c(), new C62963cj(sVar.f41503b, C13543s.f41497c), sVar.f41507i, cxVar, kVar.f41397c, kVar.f41396b, (((Boolean) kVar.f41400f.mo17428b()).booleanValue() && ((Boolean) kVar.f41399e.mo17428b()).booleanValue()) || ((Boolean) kVar.f41398d.mo17428b()).booleanValue());
        return C47638k.m84751b(b, g).mo51520a(new C13491f(kVar, b, g, jVar), kVar.f41396b);
    }
}
