package com.google.android.apps.gsa.nga.engine.p6044n.p6052e.p6053a;

import com.google.android.apps.gsa.nga.engine.p6044n.p6052e.C76402a;
import com.google.android.apps.gsa.nga.engine.p6044n.p6052e.C76438k;
import com.google.android.apps.gsa.nga.engine.p6044n.p6052e.C76442o;
import com.google.android.apps.gsa.nga.engine.p6056o.C77426t;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.shared.p7066m.C90048d;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.e.a.u */
/* compiled from: PG */
public final class C76423u implements C76402a {

    /* renamed from: a */
    public static final /* synthetic */ int f211566a = 0;

    /* renamed from: b */
    private static final C58485gu f211567b;

    /* renamed from: c */
    private static final C58495hd f211568c;

    /* renamed from: d */
    private final C91142g f211569d;

    static {
        C58485gu n = C58485gu.m89846n(C90126fx.f251134dA);
        f211567b = n;
        f211568c = C58495hd.m89898l((Map) Collection.EL.stream(n).collect(Collectors.toMap(C76421s.f211564a, C76422t.f211565a)));
    }

    public C76423u(C91142g gVar) {
        this.f211569d = gVar;
    }

    /* renamed from: a */
    public final boolean mo72188a(C76590bg bgVar, C77426t tVar, C76438k kVar) {
        C76442o oVar;
        if (kVar.f211605a == 251) {
            oVar = (C76442o) kVar.f211606b;
        } else {
            oVar = C76442o.f211610c;
        }
        C90048d dVar = (C90048d) f211568c.get(Integer.valueOf(oVar.f211612a));
        if (dVar != null && this.f211569d.mo85405j(dVar) == oVar.f211613b) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo72189b(C76438k kVar) {
        C76442o oVar;
        if (kVar.f211605a == 251) {
            oVar = (C76442o) kVar.f211606b;
        } else {
            oVar = C76442o.f211610c;
        }
        return f211568c.containsKey(Integer.valueOf(oVar.f211612a));
    }
}
