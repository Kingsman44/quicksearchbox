package com.google.android.apps.gsa.staticplugins.p7426ay;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6548an.C84712a;
import com.google.android.apps.gsa.search.core.p6519al.p6586bf.C84835b;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85007j;
import com.google.android.apps.gsa.search.core.p6519al.p6690db.C85299b;
import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85492i;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90034cm;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ay.i */
/* compiled from: PG */
public final class C94425i extends C68247h {

    /* renamed from: a */
    private final C68283d f263991a;

    /* renamed from: c */
    private final C68283d f263992c;

    /* renamed from: d */
    private final C68283d f263993d;

    /* renamed from: e */
    private final C68283d f263994e;

    /* renamed from: f */
    private final C68283d f263995f;

    /* renamed from: g */
    private final C68283d f263996g;

    /* renamed from: h */
    private final C68283d f263997h;

    /* renamed from: i */
    private final C68283d f263998i;

    /* renamed from: j */
    private final C68283d f263999j;

    public C94425i(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7, C68283d dVar8, C68283d dVar9) {
        super(aVar2, new C68277d(C94425i.class), aVar);
        this.f263991a = C68236af.m98549d(dVar);
        this.f263992c = C68236af.m98549d(dVar2);
        this.f263993d = C68236af.m98549d(dVar3);
        this.f263994e = C68236af.m98549d(dVar4);
        this.f263995f = C68236af.m98549d(dVar5);
        this.f263996g = C68236af.m98549d(dVar6);
        this.f263997h = C68236af.m98549d(dVar7);
        this.f263998i = C68236af.m98549d(dVar8);
        this.f263999j = C68236af.m98549d(dVar9);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C85299b bVar = (C85299b) list.get(0);
        C85005h hVar = (C85005h) list.get(1);
        C84835b bVar2 = (C84835b) list.get(2);
        C85492i iVar = (C85492i) list.get(3);
        C85007j jVar = (C85007j) list.get(4);
        C58833ax axVar = (C58833ax) list.get(5);
        Set set = (Set) list.get(6);
        byte[] bArr = (byte[]) list.get(7);
        C86124t tVar = (C86124t) list.get(8);
        ArrayList arrayList = new ArrayList();
        if (set.contains(5)) {
            arrayList.add(bVar.mo78851c(bArr));
        }
        if (set.contains(7)) {
            arrayList.add(hVar.mo78621e(bArr));
        }
        if (set.contains(8)) {
            arrayList.add(bVar2.mo78519a(bArr));
        }
        if (tVar.mo79746e(C90014bt.f247285eK) && set.contains(9)) {
            arrayList.add(iVar.mo78998c(bArr));
        }
        if (tVar.mo79746e(C90034cm.f248337C) && set.contains(10) && axVar.mo56113h()) {
            arrayList.add(((C84712a) axVar.mo56107c()).mo78437a(bArr));
        }
        if (set.contains(2)) {
            hVar.mo78613I(bArr);
        }
        if (set.contains(12)) {
            arrayList.add(jVar.mo78648c(bArr));
        }
        return C118826c.m197212b(arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f263991a.mo60297gq(), this.f263992c.mo60297gq(), this.f263993d.mo60297gq(), this.f263994e.mo60297gq(), this.f263995f.mo60297gq(), this.f263996g.mo60297gq(), this.f263997h.mo60297gq(), this.f263998i.mo60297gq(), this.f263999j.mo60297gq());
    }
}
