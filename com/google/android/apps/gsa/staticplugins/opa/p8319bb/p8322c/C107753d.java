package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c;

import com.google.android.apps.gsa.nga.shared.p6335c.C81018a;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3917i.p3918a.C51481jh;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.base.C58833ax;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.c.d */
/* compiled from: PG */
public final /* synthetic */ class C107753d implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C107759j f299821a;

    public /* synthetic */ C107753d(C107759j jVar) {
        this.f299821a = jVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C107759j jVar = this.f299821a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C51195j jVar2 = (C51195j) axVar.mo56107c();
            C52081en enVar = jVar2.f133275j;
            if (enVar == null) {
                enVar = C52081en.f136679i;
            }
            if ((enVar.f136681a & 16) != 0) {
                C52081en enVar2 = jVar2.f133275j;
                if (enVar2 == null) {
                    enVar2 = C52081en.f136679i;
                }
                C52091ex exVar = enVar2.f136685e;
                if (exVar == null) {
                    exVar = C52091ex.f136710b;
                }
                Optional b = C81018a.f222068g.mo74802b(exVar);
                int i = 3;
                if (b.isPresent() && ((C51481jh) b.get()).f134140b) {
                    i = 2;
                }
                jVar.mo96277m(i);
            }
        }
    }
}
