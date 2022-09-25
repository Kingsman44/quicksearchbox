package com.google.android.gms.cast.framework.p10772a.p10773a;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.gms.cast.framework.C143415aw;
import com.google.common.p4552o.p4566l.C60205e;
import com.google.common.p4552o.p4566l.C60206f;
import com.google.common.p4552o.p4566l.C60207g;
import com.google.common.p4552o.p4566l.C60208h;

/* renamed from: com.google.android.gms.cast.framework.a.a.d */
/* compiled from: PG */
public final class C143385d extends C143415aw {

    /* renamed from: a */
    final /* synthetic */ C143386e f388850a;

    public C143385d(C143386e eVar) {
        this.f388850a = eVar;
    }

    /* renamed from: a */
    public final void mo118548a(int i, int i2) {
        C143386e.f388851a.mo118884b("onTransferFailed with type = %d and reason = %d", Integer.valueOf(i), Integer.valueOf(i2));
        this.f388850a.mo118552c();
        C143386e eVar = this.f388850a;
        C60207g a = eVar.f388853c.mo118559a(eVar.f388856f);
        C60206f fVar = ((C60208h) a.instance).f162900i;
        if (fVar == null) {
            fVar = C60206f.f162878k;
        }
        C60205e eVar2 = (C60205e) C60206f.f162878k.createBuilder(fVar);
        eVar2.copyOnWrite();
        C60206f fVar2 = (C60206f) eVar2.instance;
        fVar2.f162880a |= 4096;
        fVar2.f162888i = i;
        eVar2.copyOnWrite();
        C60206f fVar3 = (C60206f) eVar2.instance;
        fVar3.f162880a |= 8192;
        fVar3.f162889j = i2;
        C60206f fVar4 = (C60206f) eVar2.build();
        a.copyOnWrite();
        C60208h hVar = (C60208h) a.instance;
        fVar4.getClass();
        hVar.f162900i = fVar4;
        hVar.f162892a |= LinearLayoutManager.INVALID_OFFSET;
        this.f388850a.f388852b.mo118567a((C60208h) a.build(), 232);
        this.f388850a.f388859i = false;
    }

    /* renamed from: b */
    public final void mo118549b(int i) {
        C143386e.f388851a.mo118884b("onTransferring with type = %d", Integer.valueOf(i));
        C143386e eVar = this.f388850a;
        eVar.f388859i = true;
        eVar.mo118552c();
        C143386e eVar2 = this.f388850a;
        this.f388850a.f388852b.mo118567a(eVar2.f388853c.mo118562d(eVar2.f388856f, i), 230);
    }

    /* renamed from: c */
    public final void mo118550c(int i) {
        C143386e.f388851a.mo118884b("onTransferred with type = %d", Integer.valueOf(i));
        this.f388850a.mo118552c();
        C143386e eVar = this.f388850a;
        this.f388850a.f388852b.mo118567a(eVar.f388853c.mo118562d(eVar.f388856f, i), 231);
        C143386e eVar2 = this.f388850a;
        eVar2.f388859i = false;
        eVar2.f388856f = null;
    }
}
