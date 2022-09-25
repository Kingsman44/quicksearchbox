package com.google.android.libraries.mdi.download.p2246f;

import com.google.android.libraries.mdi.download.C28787cb;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.p4552o.p4566l.C60129au;
import com.google.common.p4552o.p4566l.C60130av;
import com.google.common.p4552o.p4566l.C60144bi;
import com.google.common.p4552o.p4566l.C60145bj;
import com.google.common.p4552o.p4566l.C60184cv;

/* renamed from: com.google.android.libraries.mdi.download.f.b */
/* compiled from: PG */
public final class C29405b {

    /* renamed from: a */
    public final C28787cb f79724a;

    /* renamed from: b */
    public final C29404a f79725b;

    public C29405b(C29404a aVar, C28787cb cbVar) {
        this.f79725b = aVar;
        this.f79724a = cbVar;
    }

    /* renamed from: a */
    public final void mo34708a(int i, String str, String str2, String str3) {
        long j = (long) this.f79724a.mo34430j();
        if (C29045l.m53929a(j)) {
            C60129au auVar = (C60129au) C60130av.f162627x.createBuilder();
            auVar.copyOnWrite();
            C60130av avVar = (C60130av) auVar.instance;
            avVar.f162629a |= 524288;
            avVar.f162634f = j;
            C60144bi biVar = (C60144bi) C60145bj.f162698f.createBuilder();
            biVar.copyOnWrite();
            C60145bj bjVar = (C60145bj) biVar.instance;
            bjVar.f162701b = C60184cv.m92533a(i);
            bjVar.f162700a |= 1;
            biVar.copyOnWrite();
            C60145bj bjVar2 = (C60145bj) biVar.instance;
            str.getClass();
            bjVar2.f162700a |= 2;
            bjVar2.f162702c = str;
            biVar.copyOnWrite();
            C60145bj bjVar3 = (C60145bj) biVar.instance;
            str2.getClass();
            bjVar3.f162700a |= 4;
            bjVar3.f162703d = str2;
            biVar.copyOnWrite();
            C60145bj bjVar4 = (C60145bj) biVar.instance;
            str3.getClass();
            bjVar4.f162700a |= 8;
            bjVar4.f162704e = str3;
            auVar.copyOnWrite();
            C60130av avVar2 = (C60130av) auVar.instance;
            C60145bj bjVar5 = (C60145bj) biVar.build();
            bjVar5.getClass();
            avVar2.f162648t = bjVar5;
            avVar2.f162631c |= 2;
            this.f79725b.mo34707a((C60130av) auVar.build(), 1072);
        }
    }
}
