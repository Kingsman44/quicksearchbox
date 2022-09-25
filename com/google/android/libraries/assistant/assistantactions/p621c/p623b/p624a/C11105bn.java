package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q;
import com.google.assistant.p3897e.p3902c.p3907c.C50969bn;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.p3926e.C51937eq;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.bn */
/* compiled from: PG */
public final /* synthetic */ class C11105bn implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C11108bq f36392a;

    /* renamed from: b */
    public final /* synthetic */ C52490tr f36393b;

    public /* synthetic */ C11105bn(C11108bq bqVar, C52490tr trVar) {
        this.f36392a = bqVar;
        this.f36393b = trVar;
    }

    public final Object apply(Object obj) {
        C11108bq bqVar = this.f36392a;
        C52490tr trVar = this.f36393b;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return false;
        }
        C51937eq eqVar = (C51937eq) C51941eu.f136271l.createBuilder();
        String str = trVar.f137800d;
        eqVar.copyOnWrite();
        C51941eu euVar = (C51941eu) eqVar.instance;
        str.getClass();
        euVar.f136273a |= 8;
        euVar.f136279g = str;
        C50969bn a = ((C11072ah) axVar.mo56107c()).mo19548a();
        eqVar.copyOnWrite();
        C51941eu euVar2 = (C51941eu) eqVar.instance;
        a.getClass();
        euVar2.f136278f = a;
        euVar2.f136277e = 16;
        bqVar.f36401c = C11222q.m26609f((C51941eu) eqVar.build(), C58836b.f156633a, bqVar.f36401c);
        return Boolean.valueOf(((C11072ah) axVar.mo56107c()).mo19551d());
    }
}
