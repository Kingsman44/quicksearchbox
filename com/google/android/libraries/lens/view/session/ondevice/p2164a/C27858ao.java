package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24286d;
import com.google.android.libraries.lens.view.session.ondevice.C27796a;
import com.google.android.libraries.lens.view.session.ondevice.C27970h;
import com.google.android.libraries.lens.view.session.ondevice.C27971i;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4172bg.p4174b.C55731t;
import com.google.p4172bg.p4174b.C55733v;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.ao */
/* compiled from: PG */
public final /* synthetic */ class C27858ao implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C24286d f75936a;

    /* renamed from: b */
    public final /* synthetic */ C24286d f75937b;

    public /* synthetic */ C27858ao(C24286d dVar, C24286d dVar2) {
        this.f75936a = dVar;
        this.f75937b = dVar2;
    }

    public final Object call() {
        C24286d dVar = this.f75936a;
        C24286d dVar2 = this.f75937b;
        C27970h n = C27971i.m52077n();
        if (C27877bg.m51908g(dVar.mo29848a())) {
            ((C27796a) n).f75830a = (C55731t) C60856cj.m92909r(dVar.mo29848a());
        }
        if (C27877bg.m51908g(dVar2.mo29848a())) {
            ((C27796a) n).f75834e = (C55733v) C60856cj.m92909r(dVar2.mo29848a());
        }
        return n.mo33307a();
    }
}
