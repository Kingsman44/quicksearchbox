package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8114b;

import com.google.android.apps.gsa.shared.p7027bi.C89430a;
import com.google.android.apps.gsa.shared.p7027bi.C89432c;
import com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91767c;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104447j;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.p4283bv.p4354e.p4355a.C57046d;
import com.google.p4283bv.p4354e.p4355a.C57048f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.b.c */
/* compiled from: PG */
public final class C104842c {

    /* renamed from: a */
    public final List f292158a;

    /* renamed from: b */
    public final C104447j f292159b;

    /* renamed from: c */
    public final C21370a f292160c;

    /* renamed from: d */
    public final C22871g f292161d;

    /* renamed from: e */
    public final C91767c f292162e;

    /* renamed from: f */
    public final List f292163f = new ArrayList();

    /* renamed from: g */
    public long f292164g;

    /* renamed from: h */
    public int f292165h;

    /* renamed from: i */
    public int f292166i;

    public C104842c(C57046d dVar, C104447j jVar, C21370a aVar, C22871g gVar, C91767c cVar) {
        ArrayList arrayList = new ArrayList();
        this.f292158a = arrayList;
        this.f292159b = jVar;
        this.f292160c = aVar;
        this.f292161d = gVar;
        this.f292162e = cVar;
        arrayList.addAll(dVar.f152292a);
        for (int i = 0; i < this.f292158a.size(); i++) {
            this.f292163f.add(new C104841b());
        }
    }

    /* renamed from: a */
    public final boolean mo94367a(C57048f fVar, int i, int i2, int i3, int i4, long j) {
        C57048f fVar2 = fVar;
        if ((fVar2.f152295a & 1) == 0) {
            return false;
        }
        float f = fVar2.f152297c;
        int i5 = fVar2.f152298d;
        int i6 = this.f292166i;
        int i7 = this.f292165h;
        if (j < ((long) i5)) {
            return false;
        }
        return C89432c.m145485a(new C89430a(i, i2, i3, i4, 0, i6, 0, i7), f, f);
    }
}
