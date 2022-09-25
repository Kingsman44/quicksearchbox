package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.android.libraries.assistant.auto.tng.p1028l.p1033d.C13829a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.bm */
/* compiled from: PG */
public final /* synthetic */ class C13760bm implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13811cj f41937a;

    /* renamed from: b */
    public final /* synthetic */ C13829a f41938b;

    public /* synthetic */ C13760bm(C13811cj cjVar, C13829a aVar) {
        this.f41937a = cjVar;
        this.f41938b = aVar;
    }

    public final C60870cx apply(Object obj) {
        C13811cj cjVar = this.f41937a;
        C13829a aVar = this.f41938b;
        Exception exc = (Exception) obj;
        if (((Boolean) cjVar.f42044E.mo17428b()).booleanValue()) {
            if (aVar.mo21274e()) {
                C13753bf bfVar = cjVar.f42080x;
                if (bfVar != null) {
                    cjVar.f42062f.mo21330c(bfVar.mo21241c(), true);
                }
            } else {
                C13753bf bfVar2 = cjVar.f42080x;
                if (bfVar2 != null) {
                    cjVar.f42062f.mo21330c(bfVar2.mo21241c(), false);
                }
            }
        }
        cjVar.f42040A = Optional.m71637of(exc);
        if (cjVar.f42082z.isPresent()) {
            C58976aa aaVar = C58975e.f156826a;
            cjVar.mo21263d(cjVar.f42081y);
            throw ((Exception) cjVar.f42082z.get());
        }
        throw exc;
    }
}
