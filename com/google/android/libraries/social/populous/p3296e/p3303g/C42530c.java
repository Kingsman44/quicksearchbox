package com.google.android.libraries.social.populous.p3296e.p3303g;

import com.google.android.libraries.social.populous.p3289c.p3293d.C42239g;
import com.google.android.libraries.social.populous.storage.C42680d;
import com.google.android.libraries.social.populous.storage.C42681da;
import com.google.android.libraries.social.populous.storage.C42685f;
import com.google.android.libraries.social.populous.storage.C42701v;
import com.google.common.base.C58833ax;
import com.google.p4181bi.C55844f;
import com.google.p4420by.p4425c.p4428b.p4429a.p4430a.C57883f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.social.populous.e.g.c */
/* compiled from: PG */
public final /* synthetic */ class C42530c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C42540m f111536a;

    /* renamed from: b */
    public final /* synthetic */ List f111537b;

    /* renamed from: c */
    public final /* synthetic */ C42239g f111538c;

    public /* synthetic */ C42530c(C42540m mVar, List list, C42239g gVar) {
        this.f111536a = mVar;
        this.f111537b = list;
        this.f111538c = gVar;
    }

    public final void run() {
        long j;
        C42540m mVar = this.f111536a;
        List list = this.f111537b;
        C42239g gVar = this.f111538c;
        mVar.f111565e.mo45702n().mo45766a();
        mVar.f111565e.mo45695d().mo45744j();
        List i = mVar.f111565e.mo45695d().mo45743i(list);
        C42701v vVar = mVar.f111565e;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C42685f fVar = (C42685f) list.get(i2);
            if (i != null) {
                j = ((Long) i.get(i2)).longValue();
            } else {
                j = fVar.f111901a;
            }
            List<C42681da> list2 = fVar.f111905e;
            for (C42681da daVar : list2) {
                daVar.f111896a = j;
            }
            arrayList.addAll(list2);
        }
        vVar.mo45702n().mo45767b(arrayList);
        long b = mVar.f111572l.f110538c.mo26870b();
        long size = (long) list.size();
        C55844f fVar2 = gVar.f110584a;
        if (fVar2 == null) {
            fVar2 = C55844f.f147352c;
        }
        C57883f fVar3 = fVar2.f147355b;
        if (fVar3 == null) {
            fVar3 = C57883f.f154839d;
        }
        C42680d dVar = new C42680d(1, b, size, fVar3);
        mVar.f111565e.mo45694a().mo45718c(dVar);
        mVar.f111562b.mo45324c(C58833ax.m90834k(dVar));
    }
}
