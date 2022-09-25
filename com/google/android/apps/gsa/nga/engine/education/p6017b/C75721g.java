package com.google.android.apps.gsa.nga.engine.education.p6017b;

import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.nga.shared.p6345h.C81315k;
import com.google.android.apps.gsa.shared.p7066m.C90040cs;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.b.g */
/* compiled from: PG */
public final class C75721g {

    /* renamed from: a */
    public static final C58974d f210177a = C58974d.m91136j();

    /* renamed from: b */
    private final C81315k f210178b;

    /* renamed from: c */
    private final C91142g f210179c;

    /* renamed from: d */
    private final C60950i f210180d;

    public C75721g(C81315k kVar, C91142g gVar, C60950i iVar) {
        this.f210178b = kVar;
        this.f210179c = gVar;
        this.f210180d = iVar;
    }

    /* renamed from: a */
    public final int mo71866a() {
        long d = this.f210179c.mo85399d(C90126fx.f251603lt);
        int k = this.f210178b.mo74895k();
        if (d > 0) {
            C58485gu r = this.f210178b.mo74902r();
            if (!r.isEmpty() && Duration.between((Instant) C58557jl.m90131l(r), this.f210180d.mo57444a()).toMillis() > Duration.ofDays(d).toMillis()) {
                C80905at.m128763g(this.f210178b.mo74875W(), C75720f.f210176a);
                return 0;
            }
        }
        return k;
    }

    /* renamed from: b */
    public final boolean mo71867b() {
        return ((long) mo71866a()) < this.f210179c.mo85399d(C90126fx.f251068bo) && ((long) this.f210178b.mo74896l()) < this.f210179c.mo85399d(C90040cs.f248663b);
    }
}
