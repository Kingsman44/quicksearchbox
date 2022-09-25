package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Set;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.u */
/* compiled from: PG */
public final /* synthetic */ class C11130u implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C11070af f36480a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f36481b;

    /* renamed from: c */
    public final /* synthetic */ C52623yp f36482c;

    /* renamed from: d */
    public final /* synthetic */ Set f36483d;

    public /* synthetic */ C11130u(C11070af afVar, C58833ax axVar, C52623yp ypVar, Set set) {
        this.f36480a = afVar;
        this.f36481b = axVar;
        this.f36482c = ypVar;
        this.f36483d = set;
    }

    public final C60870cx apply(Object obj) {
        C11070af afVar = this.f36480a;
        C58833ax axVar = this.f36481b;
        C52623yp ypVar = this.f36482c;
        Set set = this.f36483d;
        C58833ax axVar2 = (C58833ax) obj;
        if (!axVar2.mo56113h()) {
            return afVar.mo19544k(ypVar, C11070af.m26158o(axVar, set));
        }
        if (axVar.mo56113h() && ((String) axVar2.mo56107c()).equals(axVar.mo56107c())) {
            return afVar.mo19541h(ypVar);
        }
        afVar.f36334c.mo19564J((String) axVar2.mo56107c());
        if (((String) axVar2.mo56107c()).equals("com.google.android.apps.tachyon")) {
            return afVar.mo19541h(ypVar);
        }
        return afVar.mo19539f(ypVar, (String) axVar2.mo56107c());
    }
}
