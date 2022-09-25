package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Set;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C11067ac implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C11070af f36326a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f36327b;

    /* renamed from: c */
    public final /* synthetic */ C52623yp f36328c;

    /* renamed from: d */
    public final /* synthetic */ Set f36329d;

    public /* synthetic */ C11067ac(C11070af afVar, C58833ax axVar, C52623yp ypVar, Set set) {
        this.f36326a = afVar;
        this.f36327b = axVar;
        this.f36328c = ypVar;
        this.f36329d = set;
    }

    public final C60870cx apply(Object obj) {
        C11070af afVar = this.f36326a;
        C58833ax axVar = this.f36327b;
        C52623yp ypVar = this.f36328c;
        Set set = this.f36329d;
        C58833ax axVar2 = (C58833ax) obj;
        if (!axVar2.mo56113h()) {
            return afVar.mo19544k(ypVar, C11070af.m26158o(axVar, set));
        }
        if (axVar.mo56113h() && ((String) axVar2.mo56107c()).equals(axVar.mo56107c())) {
            return afVar.mo19541h(ypVar);
        }
        afVar.f36334c.mo19564J((String) axVar2.mo56107c());
        return afVar.mo19539f(ypVar, (String) axVar2.mo56107c());
    }
}
