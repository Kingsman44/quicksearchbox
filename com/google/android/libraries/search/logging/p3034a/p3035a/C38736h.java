package com.google.android.libraries.search.logging.p3034a.p3035a;

import com.google.android.gms.clearcut.C143657j;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.logging.a.a.h */
/* compiled from: PG */
public final /* synthetic */ class C38736h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C38737i f102265a;

    public /* synthetic */ C38736h(C38737i iVar) {
        this.f102265a = iVar;
    }

    public final Object apply(Object obj) {
        C38737i iVar = this.f102265a;
        if (!((Optional) obj).isPresent()) {
            return null;
        }
        while (true) {
            C143657j jVar = (C143657j) iVar.f102266a.poll();
            if (jVar == null) {
                return null;
            }
            jVar.mo118992a();
            C58976aa aaVar = C58975e.f156826a;
            jVar.hashCode();
        }
    }
}
