package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24286d;
import com.google.android.libraries.lens.view.session.ondevice.C27796a;
import com.google.android.libraries.lens.view.session.ondevice.C27970h;
import com.google.android.libraries.lens.view.session.ondevice.C27971i;
import com.google.common.util.concurrent.C60856cj;
import com.google.lens.p4701g.C62257ag;
import com.google.lens.p4701g.C62281bd;
import com.google.lens.p4701g.C62341dj;
import com.google.p4172bg.p4174b.C55733v;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.au */
/* compiled from: PG */
public final /* synthetic */ class C27864au implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C24286d f75944a;

    /* renamed from: b */
    public final /* synthetic */ C24286d f75945b;

    /* renamed from: c */
    public final /* synthetic */ C24286d f75946c;

    /* renamed from: d */
    public final /* synthetic */ C24286d f75947d;

    public /* synthetic */ C27864au(C24286d dVar, C24286d dVar2, C24286d dVar3, C24286d dVar4) {
        this.f75944a = dVar;
        this.f75945b = dVar2;
        this.f75946c = dVar3;
        this.f75947d = dVar4;
    }

    public final Object call() {
        C24286d dVar = this.f75944a;
        C24286d dVar2 = this.f75945b;
        C24286d dVar3 = this.f75946c;
        C24286d dVar4 = this.f75947d;
        C27970h n = C27971i.m52077n();
        if (C27877bg.m51908g(dVar.mo29848a())) {
            ((C27796a) n).f75831b = (C62281bd) C60856cj.m92909r(dVar.mo29848a());
        }
        if (C27877bg.m51908g(dVar2.mo29848a())) {
            ((C27796a) n).f75832c = (C62341dj) C60856cj.m92909r(dVar2.mo29848a());
        }
        if (C27877bg.m51908g(dVar3.mo29848a())) {
            ((C27796a) n).f75834e = (C55733v) C60856cj.m92909r(dVar3.mo29848a());
        }
        if (dVar4 != null && C27877bg.m51908g(dVar4.mo29848a())) {
            ((C27796a) n).f75833d = (C62257ag) C60856cj.m92909r(dVar4.mo29848a());
        }
        return n.mo33307a();
    }
}
