package com.google.android.libraries.search.p2904c.p2939k.p2940a;

import com.google.android.libraries.search.p2904c.C37404bi;
import com.google.android.libraries.search.p2904c.C37405bj;
import com.google.android.libraries.search.p2904c.C37407bl;
import com.google.android.libraries.search.p2904c.C37410bo;
import com.google.android.libraries.search.p2904c.C37419bx;
import com.google.android.libraries.search.p2904c.C37636go;
import com.google.android.libraries.search.p2904c.p2933j.C37772b;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2942m.C37895i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.c.k.a.d */
/* compiled from: PG */
public final class C37796d implements C37419bx {

    /* renamed from: a */
    private static final C59071e f100295a = C59071e.m91332i("com.google.android.libraries.search.c.k.a.d");

    /* renamed from: b */
    private final C37895i f100296b;

    public C37796d(C37895i iVar) {
        this.f100296b = iVar;
    }

    /* renamed from: a */
    public final C37404bi mo40942a(C37407bl blVar) {
        C59104x b = f100295a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.ARCProvider");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(52794);
        C37773c cVar2 = blVar.f99328b;
        if (cVar2 == null) {
            cVar2 = C37773c.f100243c;
        }
        cVar.mo56389s("#audio# activate audio request client(%s)", C37772b.m66674a(cVar2.f100245a).name());
        return this.f100296b.mo41106g(blVar).mo41091b();
    }

    /* renamed from: b */
    public final C37405bj mo40943b(C37407bl blVar, C37410bo boVar) {
        C59104x b = f100295a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.ARCProvider");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(52795);
        C37773c cVar2 = blVar.f99328b;
        if (cVar2 == null) {
            cVar2 = C37773c.f100243c;
        }
        cVar.mo56389s("#audio# activate audio request client(%s) and start listening", C37772b.m66674a(cVar2.f100245a).name());
        C37404bi a = mo40942a(blVar);
        return new C37636go(a, a.mo40935a(boVar));
    }
}
