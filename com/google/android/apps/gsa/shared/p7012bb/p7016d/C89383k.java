package com.google.android.apps.gsa.shared.p7012bb.p7016d;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.p4449cd.p4452c.C57942b;
import com.google.p4449cd.p4452c.C57949i;
import com.google.p4449cd.p4452c.C57950j;

/* renamed from: com.google.android.apps.gsa.shared.bb.d.k */
/* compiled from: PG */
public final class C89383k implements C57949i {

    /* renamed from: a */
    public final C118575h f242332a;

    /* renamed from: b */
    public final C57949i f242333b;

    /* renamed from: c */
    public final long f242334c;

    /* renamed from: d */
    public final C58833ax f242335d;

    /* renamed from: e */
    public final C58833ax f242336e;

    /* renamed from: f */
    public final C58833ax f242337f;

    /* renamed from: g */
    public final Object f242338g = new Object();

    /* renamed from: h */
    public final Object f242339h = new Object();

    /* renamed from: i */
    public C57942b f242340i;

    /* renamed from: j */
    public volatile C58485gu f242341j;

    /* renamed from: k */
    public C57942b f242342k;

    /* renamed from: l */
    public volatile C58485gu f242343l;

    public C89383k(C118575h hVar, C57949i iVar, long j, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C57942b bVar, C57942b bVar2) {
        this.f242332a = hVar;
        this.f242333b = iVar;
        this.f242334c = j;
        this.f242335d = axVar;
        this.f242336e = axVar2;
        this.f242337f = axVar3;
        this.f242340i = bVar;
        this.f242342k = bVar2;
    }

    /* renamed from: a */
    public final C58485gu mo20640a() {
        throw null;
    }

    /* renamed from: b */
    public final int mo83317b() {
        C58833ax axVar = ((C57950j) this.f242333b).f154975b;
        if (!this.f242336e.mo56113h()) {
            return axVar.mo56113h() ? 4 : 1;
        }
        if (!axVar.mo56113h() || ((Long) axVar.mo56107c()).longValue() > ((Long) this.f242336e.mo56107c()).longValue()) {
            return this.f242337f.mo56113h() ? 3 : 2;
        }
        return 5;
    }
}
