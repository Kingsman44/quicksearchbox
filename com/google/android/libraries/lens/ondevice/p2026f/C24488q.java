package com.google.android.libraries.lens.ondevice.p2026f;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24440ab;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24446ah;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24451f;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24465t;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24471z;
import com.google.android.libraries.lens.ondevice.p2037n.C24805p;
import com.google.android.libraries.lens.ondevice.p2037n.C24810u;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.ondevice.f.q */
/* compiled from: PG */
final class C24488q implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ List f67008a;

    /* renamed from: b */
    final /* synthetic */ C24491t f67009b;

    public C24488q(C24491t tVar, List list) {
        this.f67009b = tVar;
        this.f67008a = list;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C24491t.f67010a.mo56226d()).mo56382g(th)).mo56372aa(48789)).mo56386p("getModels failed");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C24491t tVar = this.f67009b;
        List<C24810u> list = this.f67008a;
        ArrayList arrayList = new ArrayList();
        for (C24440ab abVar : (List) obj) {
            C24446ah a = C24446ah.m45519a(abVar.f66922d);
            if (a == null) {
                a = C24446ah.STATUS_UNKNOWN;
            }
            if (a != C24446ah.STATUS_DOWNLOADED) {
                C24465t tVar2 = abVar.f66920b;
                if (tVar2 == null) {
                    tVar2 = C24465t.f66964f;
                }
                arrayList.add(tVar2);
            }
        }
        for (C24810u uVar : list) {
            C24471z zVar = uVar.f67820b;
            if (zVar == null) {
                zVar = C24471z.f66980d;
            }
            C24465t tVar3 = zVar.f66983b;
            if (tVar3 == null) {
                tVar3 = C24465t.f66964f;
            }
            if (arrayList.contains(tVar3) && uVar.f67821c) {
                ((C58970a) ((C58970a) C24491t.f67010a.mo56224b()).mo56372aa(48796)).mo56352E("Starting download for %s ver %d", tVar3.f66967b, tVar3.f66968c);
                tVar.mo29920i(C24805p.DOWNLOAD_REQUESTED, tVar3.f66967b);
                C24451f fVar = tVar.f67012c;
                C24471z[] zVarArr = new C24471z[1];
                C24471z zVar2 = uVar.f67820b;
                if (zVar2 == null) {
                    zVar2 = C24471z.f66980d;
                }
                zVarArr[0] = zVar2;
                fVar.mo29906b(Arrays.asList(zVarArr));
            }
        }
    }
}
