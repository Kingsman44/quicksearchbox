package com.google.android.libraries.geller.portable;

import com.google.common.base.C58817ah;
import com.google.common.base.C58872ci;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.geller.portable.n */
/* compiled from: PG */
public final /* synthetic */ class C21987n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Geller f60648a;

    /* renamed from: b */
    public final /* synthetic */ C65753ak f60649b;

    /* renamed from: c */
    public final /* synthetic */ C58872ci f60650c;

    public /* synthetic */ C21987n(Geller geller, C65753ak akVar, C58872ci ciVar) {
        this.f60648a = geller;
        this.f60649b = akVar;
        this.f60650c = ciVar;
    }

    public final Object apply(Object obj) {
        Geller geller = this.f60648a;
        C65753ak akVar = this.f60649b;
        Void voidR = (Void) obj;
        geller.mo27175b(akVar).mo27240h(akVar, C62722b.OK.name(), this.f60650c.mo56158a(TimeUnit.MILLISECONDS));
        return null;
    }
}
