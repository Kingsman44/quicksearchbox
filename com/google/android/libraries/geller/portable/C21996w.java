package com.google.android.libraries.geller.portable;

import com.google.common.base.C58817ah;
import com.google.common.base.C58872ci;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.geller.portable.w */
/* compiled from: PG */
public final /* synthetic */ class C21996w implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Geller f60685a;

    /* renamed from: b */
    public final /* synthetic */ boolean f60686b;

    /* renamed from: c */
    public final /* synthetic */ C65753ak f60687c;

    /* renamed from: d */
    public final /* synthetic */ C58872ci f60688d;

    public /* synthetic */ C21996w(Geller geller, boolean z, C65753ak akVar, C58872ci ciVar) {
        this.f60685a = geller;
        this.f60686b = z;
        this.f60687c = akVar;
        this.f60688d = ciVar;
    }

    public final Object apply(Object obj) {
        Geller geller = this.f60685a;
        boolean z = this.f60686b;
        C65753ak akVar = this.f60687c;
        C58872ci ciVar = this.f60688d;
        Long l = (Long) obj;
        if (z) {
            geller.mo27175b(akVar).mo27233a(akVar, (l.longValue() > 0 ? C62722b.OK : C62722b.UNAVAILABLE).name(), ciVar.mo56158a(TimeUnit.MILLISECONDS));
        }
        return l;
    }
}
