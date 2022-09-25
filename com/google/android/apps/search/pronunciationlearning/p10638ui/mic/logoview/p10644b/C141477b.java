package com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10644b;

import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10643a.C141472a;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10643a.C141473b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.mic.logoview.b.b */
/* compiled from: PG */
public final class C141477b implements Iterable {

    /* renamed from: a */
    public final List f384021a;

    /* renamed from: b */
    public final C141476a f384022b;

    /* renamed from: c */
    public final C141476a f384023c;

    /* renamed from: d */
    public final C141476a f384024d;

    /* renamed from: e */
    public final C141476a f384025e;

    /* renamed from: f */
    public final C141478c f384026f;

    /* renamed from: g */
    public final C141473b f384027g;

    /* renamed from: h */
    public float f384028h = 75.0f;

    /* renamed from: i */
    public float f384029i = 25.0f;

    /* renamed from: j */
    private final C141476a f384030j;

    /* renamed from: k */
    private final C141476a f384031k;

    public C141477b(C141476a aVar, C141476a aVar2, C141476a aVar3, C141476a aVar4, C141476a aVar5, C141476a aVar6, C141478c cVar, C141473b bVar) {
        C141476a aVar7 = aVar;
        C141476a aVar8 = aVar2;
        C141476a aVar9 = aVar3;
        C141476a aVar10 = aVar4;
        C141476a aVar11 = aVar5;
        C141476a aVar12 = aVar6;
        C141473b bVar2 = bVar;
        ArrayList arrayList = new ArrayList(6);
        this.f384021a = arrayList;
        this.f384022b = aVar7;
        aVar7.mo116483a(12.0f, 3.1415927f, 1.0f, -12483341);
        this.f384023c = aVar8;
        aVar8.mo116483a(4.0f, 3.1415927f, 1.0f, -1424587);
        this.f384024d = aVar9;
        aVar9.mo116483a(4.0f, 0.0f, 1.0f, -279547);
        this.f384025e = aVar10;
        aVar10.mo116483a(12.0f, 0.0f, 1.0f, -13326253);
        this.f384030j = aVar11;
        aVar11.mo116483a(8.0f, 0.0f, 0.0f, -12483341);
        this.f384031k = aVar12;
        aVar12.mo116483a(16.0f, 0.0f, 0.0f, -1424587);
        this.f384026f = cVar;
        this.f384027g = bVar2;
        bVar2.mo116477b(1.0f);
        if (arrayList.isEmpty()) {
            arrayList.add(aVar10);
            arrayList.add(aVar9);
            arrayList.add(aVar8);
            arrayList.add(aVar7);
        }
    }

    /* renamed from: a */
    public final int mo116485a(C141476a aVar) {
        if (aVar == this.f384022b) {
            return 0;
        }
        if (aVar == this.f384023c) {
            return 1;
        }
        if (aVar == this.f384024d) {
            return 2;
        }
        if (aVar == this.f384025e) {
            return 3;
        }
        throw new IllegalArgumentException("Unknown or unexpected dot");
    }

    /* renamed from: b */
    public final void mo116486b(float f, C141476a aVar) {
        C141472a aVar2 = aVar.f384011b;
        float f2 = f - aVar2.f383996a.f384006a.f383997a;
        aVar2.mo116475a(f2);
        Iterator it = iterator();
        while (it.hasNext()) {
            C141476a aVar3 = (C141476a) it.next();
            if (aVar3 != aVar) {
                aVar3.f384011b.mo116475a(f2);
            }
        }
        this.f384026f.f384032a.mo116475a(-f2);
    }

    /* renamed from: c */
    public final void mo116487c() {
        C141472a aVar = this.f384026f.f384032a;
        float f = -0.3926991f - aVar.f383996a.f384006a.f383998b;
        aVar.mo116475a(f);
        Iterator it = iterator();
        while (it.hasNext()) {
            ((C141476a) it.next()).f384011b.mo116475a(-f);
        }
    }

    public final Iterator iterator() {
        return this.f384021a.iterator();
    }
}
