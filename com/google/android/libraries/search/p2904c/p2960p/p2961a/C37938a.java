package com.google.android.libraries.search.p2904c.p2960p.p2961a;

import com.google.android.libraries.search.p2904c.C37645gx;
import com.google.android.libraries.search.p2904c.p2908b.C37363a;
import com.google.android.libraries.search.p2904c.p2942m.C37895i;
import com.google.android.libraries.search.p2904c.p2960p.C37937a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.c.p.a.a */
/* compiled from: PG */
public final class C37938a implements C37937a {

    /* renamed from: a */
    private static final C59071e f100545a = C59071e.m91332i("com.google.android.libraries.search.c.p.a.a");

    /* renamed from: b */
    private final C37895i f100546b;

    public C37938a(C37895i iVar) {
        this.f100546b = iVar;
    }

    /* renamed from: a */
    public final C60870cx mo41160a(C37645gx gxVar, C37363a aVar) {
        ((C59052c) ((C59052c) f100545a.mo56224b()).mo56372aa(52858)).mo56386p("#audio# notifyStartListening");
        return this.f100546b.mo41111l(aVar).mo41138c();
    }

    /* renamed from: b */
    public final void mo41161b() {
        ((C59052c) ((C59052c) f100545a.mo56224b()).mo56372aa(52859)).mo56386p("#audio# notifyStopListening");
        this.f100546b.mo41117r();
    }
}
