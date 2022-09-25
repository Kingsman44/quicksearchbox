package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f;

import com.google.android.libraries.assistant.assistantactions.p636e.C11271a;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.knowledge.p4661a.p4662a.C61745g;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.protos.p4850an.C63348as;
import com.google.protos.p4850an.C63349at;
import com.google.protos.p4850an.C63633q;
import com.google.protos.p4850an.C63634r;
import com.google.protos.p4850an.C63636t;
import com.google.protos.p4850an.p4853b.C63360d;
import com.google.protos.p4850an.p4854c.C63408ai;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.f.a */
/* compiled from: PG */
public final class C11206a {
    /* renamed from: a */
    public static C61746h m26554a(String str, C61748j jVar) {
        C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
        gVar.copyOnWrite();
        C61746h hVar = (C61746h) gVar.instance;
        str.getClass();
        hVar.f166793a |= 2;
        hVar.f166796d = str;
        gVar.copyOnWrite();
        C61746h hVar2 = (C61746h) gVar.instance;
        jVar.getClass();
        hVar2.f166797e = jVar;
        hVar2.f166793a |= 4;
        return (C61746h) gVar.build();
    }

    /* renamed from: b */
    public static C63634r m26555b(String str, C63349at atVar) {
        C63633q qVar = (C63633q) C63634r.f172096f.createBuilder();
        qVar.copyOnWrite();
        C63634r rVar = (C63634r) qVar.instance;
        str.getClass();
        rVar.f172098a |= 1;
        rVar.f172101d = str;
        qVar.copyOnWrite();
        C63634r rVar2 = (C63634r) qVar.instance;
        atVar.getClass();
        rVar2.f172100c = atVar;
        rVar2.f172099b = 2;
        return (C63634r) qVar.build();
    }

    /* renamed from: c */
    public static C63634r m26556c(String str) {
        C63633q qVar = (C63633q) C63634r.f172096f.createBuilder();
        qVar.copyOnWrite();
        C63634r rVar = (C63634r) qVar.instance;
        rVar.f172098a |= 1;
        rVar.f172101d = str;
        C63636t tVar = C63636t.f172104a;
        qVar.copyOnWrite();
        C63634r rVar2 = (C63634r) qVar.instance;
        tVar.getClass();
        rVar2.f172100c = tVar;
        rVar2.f172099b = 4;
        return (C63634r) qVar.build();
    }

    /* renamed from: d */
    public static C63634r m26557d(String str, C63360d dVar) {
        return m26555b(str, m26561h(C11271a.m26757a(dVar)));
    }

    /* renamed from: e */
    public static C63634r m26558e(String str, C63408ai aiVar) {
        return m26555b(str, m26561h(C11271a.m26760d(aiVar)));
    }

    /* renamed from: f */
    public static C63634r m26559f(String str, C52397qf qfVar) {
        return m26555b(str, m26561h(C11271a.m26761e(qfVar)));
    }

    /* renamed from: g */
    public static C63634r m26560g(String str, String str2) {
        return m26555b(str, m26561h(C11271a.m26762f(str2)));
    }

    /* renamed from: h */
    public static C63349at m26561h(C61748j jVar) {
        C63348as asVar = (C63348as) C63349at.f171190c.createBuilder();
        asVar.copyOnWrite();
        C63349at atVar = (C63349at) asVar.instance;
        jVar.getClass();
        atVar.f171193b = jVar;
        atVar.f171192a |= 1;
        return (C63349at) asVar.build();
    }
}
