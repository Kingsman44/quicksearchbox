package com.google.android.libraries.logging.p2185ve.p2192d;

import com.google.android.libraries.logging.p2182b.C28280k;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28481u;
import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60218r;
import java.util.List;

/* renamed from: com.google.android.libraries.logging.ve.d.e */
/* compiled from: PG */
public final class C28352e implements C28280k, C28349b {

    /* renamed from: a */
    public final C60218r f77074a;

    /* renamed from: b */
    public final List f77075b;

    /* renamed from: c */
    public final C28442l f77076c;

    /* renamed from: d */
    public final long f77077d;

    /* renamed from: e */
    public final boolean f77078e;

    public C28352e(C60218r rVar, List list, C28442l lVar, long j, boolean z) {
        this.f77074a = rVar;
        this.f77075b = list;
        this.f77076c = lVar;
        this.f77077d = j;
        this.f77078e = z;
    }

    /* renamed from: a */
    public final /* synthetic */ C28481u mo33862a() {
        return C28348a.m53028a(this);
    }

    /* renamed from: b */
    public final List mo33863b() {
        return this.f77075b;
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        C60214n nVar = C28348a.m53028a(this).f77290c;
        if (nVar == null) {
            nVar = C60214n.f162914g;
        }
        b.mo56103c("rootVeId", String.valueOf(nVar.f162918c));
        C60214n nVar2 = C28348a.m53029b(this).f77290c;
        if (nVar2 == null) {
            nVar2 = C60214n.f162914g;
        }
        b.mo56103c("targetVeId", String.valueOf(nVar2.f162918c));
        return b.toString();
    }
}
