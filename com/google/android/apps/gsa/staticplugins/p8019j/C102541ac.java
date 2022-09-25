package com.google.android.apps.gsa.staticplugins.p8019j;

import com.google.assistant.p3897e.p3921j.C51714bl;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C51753cf;
import com.google.assistant.p3897e.p3921j.C51754cg;
import com.google.assistant.p3897e.p3921j.C51756ci;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.ac */
/* compiled from: PG */
public final /* synthetic */ class C102541ac implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C51753cf f286172a;

    /* renamed from: b */
    public final /* synthetic */ C51714bl f286173b;

    public /* synthetic */ C102541ac(C51753cf cfVar, C51714bl blVar) {
        this.f286172a = cfVar;
        this.f286173b = blVar;
    }

    public final C60870cx apply(Object obj) {
        C51756ci ciVar;
        C51753cf cfVar = this.f286172a;
        C51714bl blVar = this.f286173b;
        C58976aa aaVar = C58975e.f156826a;
        if (((Boolean) obj).booleanValue()) {
            ciVar = C51756ci.ALL_PERSONAL_DATA;
        } else {
            ciVar = C51756ci.NO_PERSONAL_DATA;
        }
        cfVar.copyOnWrite();
        C51754cg cgVar = (C51754cg) cfVar.instance;
        C51754cg cgVar2 = C51754cg.f135778e;
        cgVar.f135781b = ciVar.f135790e;
        cgVar.f135780a |= 1;
        blVar.copyOnWrite();
        C51715bm bmVar = (C51715bm) blVar.instance;
        C51754cg cgVar3 = (C51754cg) cfVar.build();
        C51715bm bmVar2 = C51715bm.f135662t;
        cgVar3.getClass();
        bmVar.f135672i = cgVar3;
        bmVar.f135664a |= 256;
        return C60856cj.m92900i(blVar);
    }
}
