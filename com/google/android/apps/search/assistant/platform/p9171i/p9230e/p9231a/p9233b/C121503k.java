package com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b;

import android.databinding.C0118a;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121538g;
import com.google.assistant.p4001w.p4002a.C53498e;
import com.google.assistant.p4001w.p4002a.C53499f;
import com.google.assistant.p4001w.p4002a.C53503j;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58872ci;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4580v.C60948g;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.platform.i.e.a.b.k */
/* compiled from: PG */
public final class C121503k implements C121538g {

    /* renamed from: a */
    private final C121501i f337185a;

    /* renamed from: b */
    private final List f337186b;

    /* renamed from: c */
    private final Instant f337187c = Instant.now();

    /* renamed from: d */
    private final C58872ci f337188d = C58872ci.m90947d(C58274c.f155808a);

    /* renamed from: e */
    private final C53499f f337189e;

    public C121503k(C121501i iVar, List list, C121495c cVar) {
        this.f337185a = iVar;
        this.f337186b = list;
        C60948g gVar = C60948g.f165068a;
        C53498e eVar = (C53498e) C53499f.f140392g.createBuilder();
        C121495c cVar2 = C121495c.OFF;
        int ordinal = cVar.ordinal();
        if (ordinal == 1) {
            eVar.copyOnWrite();
            C53499f fVar = (C53499f) eVar.instance;
            fVar.f140396a = 1 | fVar.f140396a;
            fVar.f140397b = 2;
        } else if (ordinal == 2) {
            eVar.copyOnWrite();
            C53499f fVar2 = (C53499f) eVar.instance;
            fVar2.f140396a = 1 | fVar2.f140396a;
            fVar2.f140397b = 2147483647L;
            C62910ar arVar = C62948a.f169986a;
            eVar.copyOnWrite();
            C53499f fVar3 = (C53499f) eVar.instance;
            arVar.getClass();
            fVar3.f140398c = arVar;
            fVar3.f140396a |= 2;
            eVar.copyOnWrite();
            C53499f fVar4 = (C53499f) eVar.instance;
            fVar4.f140396a |= 4;
            fVar4.f140399d = false;
            eVar.copyOnWrite();
            C53499f fVar5 = (C53499f) eVar.instance;
            fVar5.f140396a |= 8;
            fVar5.f140400e = false;
        } else if (ordinal == 3) {
            eVar.copyOnWrite();
            C53499f fVar6 = (C53499f) eVar.instance;
            fVar6.f140396a |= 1;
            fVar6.f140397b = 2147483647L;
            C62910ar arVar2 = C62948a.f169987b;
            eVar.copyOnWrite();
            C53499f fVar7 = (C53499f) eVar.instance;
            arVar2.getClass();
            fVar7.f140398c = arVar2;
            fVar7.f140396a |= 2;
            eVar.copyOnWrite();
            C53499f fVar8 = (C53499f) eVar.instance;
            fVar8.f140396a |= 4;
            fVar8.f140399d = true;
            eVar.copyOnWrite();
            C53499f fVar9 = (C53499f) eVar.instance;
            fVar9.f140396a |= 8;
            fVar9.f140400e = true;
        }
        this.f337189e = (C53499f) eVar.build();
    }

    /* renamed from: a */
    public final C53499f mo105204a() {
        return this.f337189e;
    }

    /* renamed from: b */
    public final void mo105205b(C53499f fVar) {
        C58872ci ciVar = this.f337188d;
        if (!ciVar.f156708a) {
            C0118a.m96d(C121505m.f337190a.mo56226d(), "Remote call closed more than once, event ignored.", 35844, C58979ad.MEDIUM);
            return;
        }
        ciVar.mo56162g();
        C121501i iVar = this.f337185a;
        List list = this.f337186b;
        Instant instant = this.f337187c;
        Duration ofNanos = Duration.ofNanos(this.f337188d.mo56159b());
        C53503j jVar = fVar.f140401f;
        if (jVar == null) {
            jVar = C53503j.f140408h;
        }
        for (C121496d h : C121499g.f337177a) {
            C121499g.m200775a(iVar, list);
            h.mo105187h(instant, ofNanos, jVar);
        }
    }
}
