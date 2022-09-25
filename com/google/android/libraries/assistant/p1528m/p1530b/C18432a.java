package com.google.android.libraries.assistant.p1528m.p1530b;

import com.google.assistant.p3745ab.p3746a.C48177a;
import com.google.assistant.p3745ab.p3746a.C48178b;
import com.google.assistant.p3897e.p3921j.p3926e.C51842bc;

/* renamed from: com.google.android.libraries.assistant.m.b.a */
/* compiled from: PG */
public final class C18432a {
    /* renamed from: a */
    public static C48178b m35904a(C51842bc bcVar) {
        C48177a aVar = (C48177a) C48178b.f124659h.createBuilder();
        long j = (bcVar.f136000a & 1) != 0 ? bcVar.f136001b : -1;
        aVar.copyOnWrite();
        C48178b bVar = (C48178b) aVar.instance;
        bVar.f124661a |= 1;
        bVar.f124662b = j;
        String str = bcVar.f136002c;
        aVar.copyOnWrite();
        C48178b bVar2 = (C48178b) aVar.instance;
        str.getClass();
        bVar2.f124661a |= 2;
        bVar2.f124663c = str;
        return (C48178b) aVar.build();
    }
}
