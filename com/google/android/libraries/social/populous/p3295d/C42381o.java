package com.google.android.libraries.social.populous.p3295d;

import com.google.android.libraries.social.populous.logging.C42564ab;
import com.google.android.libraries.social.populous.logging.C42576k;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.android.libraries.social.populous.p3289c.p3293d.C42237e;
import com.google.android.libraries.social.populous.p3289c.p3293d.C42241i;
import com.google.common.base.C58872ci;
import com.google.common.util.concurrent.C60845bz;
import java.util.List;

/* renamed from: com.google.android.libraries.social.populous.d.o */
/* compiled from: PG */
final class C42381o implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ List f111140a;

    /* renamed from: b */
    final /* synthetic */ C58872ci f111141b;

    /* renamed from: c */
    final /* synthetic */ C42383q f111142c;

    public C42381o(C42383q qVar, List list, C58872ci ciVar) {
        this.f111142c = qVar;
        this.f111140a = list;
        this.f111141b = ciVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f111142c.f111149e.keySet().removeAll(this.f111140a);
        this.f111142c.f111147c.mo45639i(15, 0, C42576k.f111734a);
        this.f111142c.f111147c.mo45640j(15, C42564ab.m75120a(th), 0, (C58872ci) null, C42576k.f111734a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C42241i iVar = (C42241i) obj;
        this.f111142c.f111149e.keySet().removeAll(this.f111140a);
        C42591z zVar = this.f111142c.f111147c;
        C42237e eVar = iVar.f110590b;
        if (eVar == null) {
            eVar = C42237e.f110577d;
        }
        zVar.mo45639i(15, eVar.f110580b, C42576k.f111734a);
        C42591z zVar2 = this.f111142c.f111147c;
        C42237e eVar2 = iVar.f110590b;
        if (eVar2 == null) {
            eVar2 = C42237e.f110577d;
        }
        zVar2.mo45640j(15, 2, eVar2.f110581c, this.f111141b, C42576k.f111734a);
    }
}
