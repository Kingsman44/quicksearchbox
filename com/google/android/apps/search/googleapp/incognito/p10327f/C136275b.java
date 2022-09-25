package com.google.android.apps.search.googleapp.incognito.p10327f;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60559uj;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.util.concurrent.C60845bz;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58149a;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58150b;
import com.google.p4500cm.p4518d.C58191h;
import com.google.p4500cm.p4518d.C58192i;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.incognito.f.b */
/* compiled from: PG */
final class C136275b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C59743a f371090a;

    /* renamed from: b */
    final /* synthetic */ C60559uj f371091b;

    /* renamed from: c */
    final /* synthetic */ C136276c f371092c;

    public C136275b(C136276c cVar, C59743a aVar, C60559uj ujVar) {
        this.f371092c = cVar;
        this.f371090a = aVar;
        this.f371091b = ujVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C136276c.f371093a.mo56225c()).mo56382g(th)).mo56372aa(40706)).mo56386p("Failed to obtain token.");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Optional optional = (Optional) obj;
        optional.getClass();
        if (optional.isEmpty()) {
            ((C59052c) ((C59052c) C136276c.f371093a.mo56225c()).mo56372aa(40707)).mo56386p("Got empty token.");
            return;
        }
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        int i = this.f371090a.f161421ts;
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        C60559uj ujVar = this.f371091b;
        if (ujVar != null) {
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            ufVar2.f164208cI = ujVar;
            ufVar2.f164255j |= LinearLayoutManager.INVALID_OFFSET;
        }
        C143658k a = C143658k.m233374c(this.f371092c.f371094b, "ANDROID_GSA").mo118952a();
        C58191h hVar = (C58191h) C58192i.f155603j.createBuilder();
        String str = (String) optional.get();
        hVar.copyOnWrite();
        C58192i iVar = (C58192i) hVar.instance;
        str.getClass();
        iVar.f155605a |= 16;
        iVar.f155608d = str;
        hVar.copyOnWrite();
        C58192i iVar2 = (C58192i) hVar.instance;
        C60555uf ufVar3 = (C60555uf) tzVar.build();
        ufVar3.getClass();
        iVar2.f155607c = ufVar3;
        iVar2.f155605a |= 4;
        C143657j d = a.mo118999d(hVar.build());
        int i2 = this.f371090a.f161421ts;
        C58149a aVar = d.f389461c;
        aVar.copyOnWrite();
        C58150b bVar = (C58150b) aVar.instance;
        C58150b bVar2 = C58150b.f155459k;
        bVar.f155461a |= 16;
        bVar.f155464d = i2;
        d.mo118992a();
    }
}
