package com.google.android.apps.gsa.search.core.p6507ag.p6508a;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86036e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.C46066c;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protos.p5124m.p5125a.C65599b;
import dagger.C68214a;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.search.core.ag.a.c */
/* compiled from: PG */
public final class C84471c implements C84469a {

    /* renamed from: a */
    private static final C58974d f229875a = C58974d.m91136j();

    /* renamed from: b */
    private final boolean f229876b;

    /* renamed from: c */
    private final boolean f229877c;

    /* renamed from: d */
    private final boolean f229878d;

    /* renamed from: e */
    private final Context f229879e;

    /* renamed from: f */
    private final C68214a f229880f;

    /* renamed from: g */
    private final SharedPreferences f229881g;

    /* renamed from: h */
    private final C58528ij f229882h;

    /* renamed from: i */
    private final boolean f229883i;

    /* renamed from: j */
    private final C58528ij f229884j;

    /* renamed from: k */
    private final boolean f229885k;

    /* renamed from: l */
    private final boolean f229886l;

    /* renamed from: m */
    private final long f229887m;

    /* renamed from: n */
    private final C58485gu f229888n;

    /* renamed from: o */
    private final boolean f229889o;

    /* renamed from: p */
    private final boolean f229890p;

    /* renamed from: q */
    private final boolean f229891q;

    /* renamed from: r */
    private final boolean f229892r;

    /* renamed from: s */
    private final boolean f229893s;

    /* renamed from: t */
    private final boolean f229894t;

    /* renamed from: u */
    private final boolean f229895u;

    /* renamed from: v */
    private final boolean f229896v;

    /* renamed from: w */
    private final boolean f229897w;

    /* renamed from: x */
    private final boolean f229898x;

    /* renamed from: y */
    private final long f229899y;

    /* renamed from: com.google.android.apps.gsa.search.core.ag.a.c$a */
    /* compiled from: PG */
    public interface C84472a {
        /* renamed from: mV */
        boolean mo78052mV();

        /* renamed from: nb */
        boolean mo78053nb();

        /* renamed from: nn */
        boolean mo78054nn();

        /* renamed from: no */
        boolean mo78055no();
    }

    public C84471c(boolean z, boolean z2, boolean z3, Context context, C68214a aVar, SharedPreferences sharedPreferences, C65599b bVar, C65599b bVar2, C65599b bVar3, C65599b bVar4, boolean z4, C65599b bVar5, boolean z5, boolean z6, long j, C65599b bVar6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, long j2) {
        this.f229876b = z;
        this.f229877c = z2;
        this.f229878d = z3;
        this.f229879e = context;
        this.f229880f = aVar;
        this.f229881g = sharedPreferences;
        C58526ih ihVar = new C58526ih();
        ihVar.mo55489i(bVar.f178301a);
        ihVar.mo55489i(bVar2.f178301a);
        ihVar.mo55489i(bVar3.f178301a);
        ihVar.mo55489i(bVar4.f178301a);
        this.f229882h = (C58528ij) Collection.EL.stream(ihVar.mo55486f()).map(C84470b.f229874a).collect(C58370cn.f155947b);
        this.f229883i = z4;
        this.f229884j = C58528ij.m90006F(bVar5.f178301a);
        this.f229885k = z5;
        this.f229886l = z6;
        this.f229887m = j;
        this.f229888n = C58485gu.m89842j(bVar6.f178301a);
        this.f229889o = z7;
        this.f229890p = z8;
        this.f229891q = z9;
        this.f229892r = z10;
        this.f229893s = z11;
        this.f229894t = z12;
        this.f229895u = z13;
        this.f229896v = z14;
        this.f229897w = z15;
        this.f229898x = z16;
        this.f229899y = j2;
    }

    /* renamed from: z */
    private final C84472a m134835z() {
        AccountId accountId;
        int i = this.f229881g.getInt("tik_tok_account_id", -1);
        if (i == -1) {
            accountId = null;
        } else {
            accountId = C46066c.m82284a(i);
        }
        if (accountId == null) {
            ((C58970a) ((C58970a) f229875a.mo56226d()).mo56372aa(9346)).mo56386p("Account id is not cached");
            ((C86036e) this.f229880f.mo27525b()).mo79654A();
        }
        if (accountId == null) {
            return null;
        }
        return (C84472a) C47245e.m84045a(this.f229879e, C84472a.class, accountId);
    }

    /* renamed from: a */
    public final long mo78027a() {
        return this.f229887m;
    }

    /* renamed from: b */
    public final long mo78028b() {
        return this.f229899y;
    }

    /* renamed from: c */
    public final C58485gu mo78029c() {
        return this.f229888n;
    }

    /* renamed from: d */
    public final C58528ij mo78030d() {
        return this.f229884j;
    }

    /* renamed from: e */
    public final /* synthetic */ Set mo78031e() {
        return this.f229882h;
    }

    /* renamed from: f */
    public final boolean mo78032f() {
        return this.f229878d;
    }

    /* renamed from: g */
    public final boolean mo78033g() {
        return this.f229890p;
    }

    /* renamed from: h */
    public final boolean mo78034h() {
        return this.f229877c;
    }

    /* renamed from: i */
    public final boolean mo78035i() {
        return this.f229896v;
    }

    /* renamed from: j */
    public final boolean mo78036j() {
        C84472a z = m134835z();
        return z != null && z.mo78052mV();
    }

    /* renamed from: k */
    public final boolean mo78037k() {
        C84472a z = m134835z();
        return z != null && z.mo78053nb();
    }

    /* renamed from: l */
    public final boolean mo78038l() {
        return this.f229894t;
    }

    /* renamed from: m */
    public final boolean mo78039m() {
        return this.f229891q;
    }

    /* renamed from: n */
    public final boolean mo78040n() {
        return this.f229892r;
    }

    /* renamed from: o */
    public final boolean mo78041o() {
        return this.f229886l;
    }

    /* renamed from: p */
    public final boolean mo78042p() {
        return this.f229885k;
    }

    /* renamed from: q */
    public final boolean mo78043q() {
        return this.f229876b;
    }

    /* renamed from: r */
    public final boolean mo78044r() {
        return this.f229889o;
    }

    /* renamed from: s */
    public final boolean mo78045s() {
        return this.f229898x;
    }

    /* renamed from: t */
    public final boolean mo78046t() {
        C84472a z = m134835z();
        return z != null && z.mo78054nn();
    }

    /* renamed from: u */
    public final boolean mo78047u() {
        C84472a z = m134835z();
        return z != null && z.mo78055no();
    }

    /* renamed from: v */
    public final boolean mo78048v() {
        return this.f229893s;
    }

    /* renamed from: w */
    public final boolean mo78049w() {
        return this.f229895u;
    }

    /* renamed from: x */
    public final boolean mo78050x() {
        return this.f229897w;
    }

    /* renamed from: y */
    public final boolean mo78051y() {
        return this.f229883i;
    }
}
