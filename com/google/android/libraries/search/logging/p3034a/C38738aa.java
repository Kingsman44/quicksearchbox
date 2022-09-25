package com.google.android.libraries.search.logging.p3034a;

import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.assistant.p3897e.p3915h.p3916a.C51227b;
import com.google.common.base.C58817ah;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58149a;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58150b;
import com.google.p4500cm.p4518d.C58191h;
import com.google.p4500cm.p4518d.C58192i;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.logging.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C38738aa implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C38745ah f102272a;

    /* renamed from: b */
    public final /* synthetic */ Optional f102273b;

    /* renamed from: c */
    public final /* synthetic */ C143658k f102274c;

    /* renamed from: d */
    public final /* synthetic */ C59743a f102275d;

    public /* synthetic */ C38738aa(C38745ah ahVar, Optional optional, C143658k kVar, C59743a aVar) {
        this.f102272a = ahVar;
        this.f102273b = optional;
        this.f102274c = kVar;
        this.f102275d = aVar;
    }

    public final Object apply(Object obj) {
        C38745ah ahVar = this.f102272a;
        Optional optional = this.f102273b;
        C143658k kVar = this.f102274c;
        C59743a aVar = this.f102275d;
        C58192i iVar = (C58192i) obj;
        if (optional.isPresent()) {
            C58191h hVar = (C58191h) iVar.toBuilder();
            C51227b bVar = (C51227b) optional.get();
            hVar.copyOnWrite();
            C58192i iVar2 = (C58192i) hVar.instance;
            bVar.getClass();
            iVar2.f155613i = bVar;
            iVar2.f155605a |= 8192;
            iVar = (C58192i) hVar.build();
        }
        C143657j e = kVar.mo119000e(iVar, ahVar.f102289b);
        int i = aVar.f161421ts;
        C58149a aVar2 = e.f389461c;
        aVar2.copyOnWrite();
        C58150b bVar2 = (C58150b) aVar2.instance;
        C58150b bVar3 = C58150b.f155459k;
        bVar2.f155461a |= 16;
        bVar2.f155464d = i;
        return e;
    }
}
