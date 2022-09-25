package com.google.android.libraries.assistant.assistantactions.p621c;

import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b */
/* compiled from: PG */
public final /* synthetic */ class C11063b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f36312a;

    public /* synthetic */ C11063b(List list) {
        this.f36312a = list;
    }

    public final Object call() {
        for (C60870cx r : this.f36312a) {
            C58833ax axVar = (C58833ax) C60856cj.m92909r(r);
            if (axVar.mo56113h() && (((C51195j) axVar.mo56107c()).f133266a & 128) != 0) {
                C52081en enVar = ((C51195j) axVar.mo56107c()).f133275j;
                if (enVar == null) {
                    enVar = C52081en.f136679i;
                }
                return C58833ax.m90834k(enVar);
            }
        }
        ((C59052c) ((C59052c) C11227d.f36635a.mo56224b()).mo56372aa(42851)).mo56386p("fallback to server");
        return C58836b.f156633a;
    }
}
