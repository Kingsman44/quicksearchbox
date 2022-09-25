package com.google.android.libraries.search.logging.p3034a;

import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.common.base.C58817ah;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58149a;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58150b;
import com.google.p4500cm.p4518d.C58191h;
import com.google.p4500cm.p4518d.C58192i;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.logging.a.t */
/* compiled from: PG */
public final /* synthetic */ class C38771t implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C38745ah f102345a;

    /* renamed from: b */
    public final /* synthetic */ Optional f102346b;

    /* renamed from: c */
    public final /* synthetic */ C143658k f102347c;

    /* renamed from: d */
    public final /* synthetic */ C59743a f102348d;

    public /* synthetic */ C38771t(C38745ah ahVar, Optional optional, C143658k kVar, C59743a aVar) {
        this.f102345a = ahVar;
        this.f102346b = optional;
        this.f102347c = kVar;
        this.f102348d = aVar;
    }

    public final Object apply(Object obj) {
        C38745ah ahVar = this.f102345a;
        Optional optional = this.f102346b;
        C143658k kVar = this.f102347c;
        C59743a aVar = this.f102348d;
        C58192i iVar = (C58192i) obj;
        if (optional.isPresent()) {
            C58191h hVar = (C58191h) iVar.toBuilder();
            C19088t tVar = (C19088t) optional.get();
            hVar.copyOnWrite();
            C58192i iVar2 = (C58192i) hVar.instance;
            tVar.getClass();
            iVar2.f155611g = tVar;
            iVar2.f155605a |= 2048;
            iVar = (C58192i) hVar.build();
        }
        C143657j e = kVar.mo119000e(iVar, ahVar.f102289b);
        int i = aVar.f161421ts;
        C58149a aVar2 = e.f389461c;
        aVar2.copyOnWrite();
        C58150b bVar = (C58150b) aVar2.instance;
        C58150b bVar2 = C58150b.f155459k;
        bVar.f155461a |= 16;
        bVar.f155464d = i;
        return e;
    }
}
