package com.google.apps.tiktok.contrib.work.p3631b;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.List;

/* renamed from: com.google.apps.tiktok.contrib.work.b.ab */
/* compiled from: PG */
public final /* synthetic */ class C46516ab implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C46524aj f121664a;

    public /* synthetic */ C46516ab(C46524aj ajVar) {
        this.f121664a = ajVar;
    }

    public final Object apply(Object obj) {
        C46524aj ajVar = this.f121664a;
        C58480gp e = C58485gu.m89837e();
        for (String a : (List) obj) {
            C60870cx g = C60922j.m93044g(ajVar.f121670d.f121739a.mo50520a(a), C46559q.f121734a, C60826bg.f164896a);
            C60845bz bzVar = ajVar.f121671e;
            C60856cj.m92911t(g, C47810es.m84974n(bzVar), ajVar.f121669c);
            e.mo55395g(g);
        }
        return e.mo55394f();
    }
}
