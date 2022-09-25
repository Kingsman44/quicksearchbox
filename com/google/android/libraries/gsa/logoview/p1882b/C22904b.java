package com.google.android.libraries.gsa.logoview.p1882b;

import com.google.android.libraries.gsa.logoview.p1881a.C22886a;
import com.google.android.libraries.gsa.logoview.p1881a.C22887b;
import com.google.android.libraries.gsa.logoview.p1881a.C22888c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.logoview.b.b */
/* compiled from: PG */
public final class C22904b implements Iterable {

    /* renamed from: a */
    public final List f63076a = new ArrayList(6);

    /* renamed from: b */
    public final C22903a f63077b;

    /* renamed from: c */
    public final C22903a f63078c;

    /* renamed from: d */
    public final C22903a f63079d;

    /* renamed from: e */
    public final C22903a f63080e;

    /* renamed from: f */
    public final C22903a f63081f;

    /* renamed from: g */
    public final C22903a f63082g;

    /* renamed from: h */
    public final C22905c f63083h;

    /* renamed from: i */
    public final C22887b f63084i;

    /* renamed from: j */
    public boolean f63085j;

    /* renamed from: k */
    public float f63086k = 75.0f;

    /* renamed from: l */
    public float f63087l = 25.0f;

    public C22904b(C22903a aVar, C22903a aVar2, C22903a aVar3, C22903a aVar4, C22903a aVar5, C22903a aVar6, C22905c cVar, C22887b bVar) {
        this.f63077b = aVar;
        aVar.mo28255a(12.0f, 3.1415927f, 1.0f, -12483341);
        this.f63078c = aVar2;
        aVar2.mo28255a(4.0f, 3.1415927f, 1.0f, -1424587);
        this.f63079d = aVar3;
        aVar3.mo28255a(4.0f, 0.0f, 1.0f, -279547);
        this.f63080e = aVar4;
        aVar4.mo28255a(12.0f, 0.0f, 1.0f, -13326253);
        this.f63081f = aVar5;
        aVar5.mo28255a(8.0f, 0.0f, 0.0f, -12483341);
        this.f63082g = aVar6;
        aVar6.mo28255a(16.0f, 0.0f, 0.0f, -1424587);
        this.f63083h = cVar;
        this.f63084i = bVar;
        bVar.mo28237e(1.0f);
        mo28267e(false);
    }

    /* renamed from: a */
    public final float mo28263a(C22903a aVar) {
        if (aVar == this.f63077b) {
            return -16.0f;
        }
        if (aVar == this.f63078c) {
            return -7.85f;
        }
        if (aVar == this.f63079d) {
            return -2.55f;
        }
        if (aVar == this.f63080e) {
            return 11.5f;
        }
        if (aVar == this.f63081f) {
            return 6.7f;
        }
        if (aVar == this.f63082g) {
            return 16.1f;
        }
        throw new IllegalArgumentException("Unknown dot");
    }

    /* renamed from: b */
    public final int mo28264b(C22903a aVar) {
        if (aVar == this.f63077b) {
            return 0;
        }
        if (aVar == this.f63078c) {
            return 1;
        }
        if (aVar == this.f63079d) {
            return 2;
        }
        if (aVar == this.f63080e) {
            return this.f63085j ? 4 : 3;
        }
        if (aVar == this.f63081f && this.f63085j) {
            return 3;
        }
        if (aVar == this.f63082g && this.f63085j) {
            return 5;
        }
        throw new IllegalArgumentException("Unknown or unexpected dot");
    }

    /* renamed from: c */
    public final void mo28265c(C22903a aVar, float f) {
        C22886a aVar2 = aVar.f63066b;
        float f2 = f - aVar2.f63012b;
        aVar2.mo28234b(f2);
        Iterator it = iterator();
        while (it.hasNext()) {
            C22903a aVar3 = (C22903a) it.next();
            if (aVar3 != aVar) {
                aVar3.f63066b.mo28234b(f2);
            }
        }
        this.f63083h.f63088a.mo28234b(-f2);
    }

    /* renamed from: d */
    public final void mo28266d() {
        Iterator it = iterator();
        while (it.hasNext()) {
            C22903a aVar = (C22903a) it.next();
            C22888c cVar = aVar.f63065a;
            cVar.mo28237e(cVar.f63012b);
            C22886a aVar2 = aVar.f63066b;
            aVar2.mo28237e(aVar2.f63012b);
            C22888c cVar2 = aVar.f63067c;
            cVar2.mo28237e(cVar2.f63012b);
            C22888c cVar3 = aVar.f63068d;
            cVar3.mo28237e(cVar3.f63012b);
            C22888c cVar4 = aVar.f63069e;
            cVar4.mo28237e(cVar4.f63012b);
            C22887b bVar = aVar.f63070f;
            bVar.mo28237e(bVar.f63012b);
            C22887b bVar2 = aVar.f63072h;
            bVar2.mo28237e(bVar2.f63012b);
            C22887b bVar3 = aVar.f63073i;
            bVar3.mo28237e(bVar3.f63012b);
            C22887b bVar4 = aVar.f63071g;
            bVar4.mo28237e(bVar4.f63012b);
        }
        C22905c cVar5 = this.f63083h;
        C22887b bVar5 = cVar5.f63089b;
        bVar5.mo28237e(bVar5.f63012b);
        C22886a aVar3 = cVar5.f63088a;
        aVar3.mo28237e(aVar3.f63012b);
        C22887b bVar6 = this.f63084i;
        bVar6.mo28237e(bVar6.f63012b);
    }

    /* renamed from: e */
    public final void mo28267e(boolean z) {
        if (this.f63076a.isEmpty()) {
            this.f63076a.add(this.f63080e);
            this.f63076a.add(this.f63079d);
            this.f63076a.add(this.f63078c);
            this.f63076a.add(this.f63077b);
        }
        if (z != this.f63085j) {
            if (z) {
                this.f63076a.add(1, this.f63081f);
                this.f63076a.add(0, this.f63082g);
            } else {
                this.f63076a.remove(this.f63081f);
                this.f63076a.remove(this.f63082g);
            }
        }
        this.f63085j = z;
    }

    /* renamed from: f */
    public final void mo28268f() {
        C22886a aVar = this.f63083h.f63088a;
        float f = -0.3926991f - aVar.f63013c;
        aVar.mo28234b(f);
        Iterator it = iterator();
        while (it.hasNext()) {
            ((C22903a) it.next()).f63066b.mo28234b(-f);
        }
    }

    public final Iterator iterator() {
        return this.f63076a.iterator();
    }
}
