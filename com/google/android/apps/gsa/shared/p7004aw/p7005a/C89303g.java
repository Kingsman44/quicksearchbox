package com.google.android.apps.gsa.shared.p7004aw.p7005a;

import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a.C119091p;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.shared.aw.a.g */
/* compiled from: PG */
public final /* synthetic */ class C89303g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C89309m f242113a;

    /* renamed from: b */
    public final /* synthetic */ int f242114b;

    /* renamed from: c */
    public final /* synthetic */ long f242115c;

    public /* synthetic */ C89303g(C89309m mVar, int i, long j) {
        this.f242113a = mVar;
        this.f242114b = i;
        this.f242115c = j;
    }

    public final Object apply(Object obj) {
        C89309m mVar = this.f242113a;
        int i = this.f242114b;
        long j = this.f242115c;
        C58485gu guVar = (C58485gu) obj;
        mVar.f242125f.put(Integer.valueOf(i), guVar);
        return C58833ax.m90833j((C119091p) Collection.EL.stream(guVar).filter(new C89297a(j)).findFirst().orElse(null));
    }
}
