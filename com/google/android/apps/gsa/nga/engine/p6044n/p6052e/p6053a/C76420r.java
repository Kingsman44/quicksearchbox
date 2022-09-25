package com.google.android.apps.gsa.nga.engine.p6044n.p6052e.p6053a;

import com.google.android.apps.gsa.nga.engine.p6044n.p6052e.C76402a;
import com.google.android.apps.gsa.nga.engine.p6044n.p6052e.C76435h;
import com.google.android.apps.gsa.nga.engine.p6044n.p6052e.C76438k;
import com.google.android.apps.gsa.nga.engine.p6056o.C77426t;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76575as;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import p3186j$.util.Optional;
import p3186j$.util.function.BiFunction;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.e.a.r */
/* compiled from: PG */
public final class C76420r implements C76402a {

    /* renamed from: a */
    public static final /* synthetic */ int f211562a = 0;

    /* renamed from: b */
    private static final C58485gu f211563b = C58485gu.m89847o(C76416n.f211558a, C76417o.f211559a);

    /* renamed from: a */
    public final boolean mo72188a(C76590bg bgVar, C77426t tVar, C76438k kVar) {
        C76435h hVar;
        Optional empty;
        if (kVar.f211605a == 301) {
            hVar = (C76435h) kVar.f211606b;
        } else {
            hVar = C76435h.f211585e;
        }
        String str = hVar.f211589c;
        int i = hVar.f211587a;
        int i2 = 3;
        int i3 = 0;
        if (i != 0) {
            i2 = i != 2 ? i != 3 ? 0 : 2 : 1;
        }
        int i4 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i4 == 0) {
            return ((Boolean) bgVar.mo72265g(C76575as.f211814a, str).map(new C76418p(hVar)).orElse(Boolean.valueOf(hVar.f211590d))).booleanValue();
        } else if (i4 != 1) {
            return true;
        } else {
            C58485gu guVar = f211563b;
            int i5 = ((C58724pq) guVar).f156474d;
            while (true) {
                if (i3 >= i5) {
                    empty = Optional.empty();
                    break;
                }
                empty = (Optional) ((BiFunction) guVar.get(i3)).apply(bgVar, str);
                i3++;
                if (empty.isPresent()) {
                    break;
                }
            }
            return ((Boolean) empty.map(new C76419q(hVar)).orElse(Boolean.valueOf(hVar.f211590d))).booleanValue();
        }
    }

    /* renamed from: b */
    public final boolean mo72189b(C76438k kVar) {
        C76435h hVar;
        if (kVar.f211605a == 301) {
            hVar = (C76435h) kVar.f211606b;
        } else {
            hVar = C76435h.f211585e;
        }
        if (hVar.f211589c.isEmpty()) {
            return false;
        }
        int i = hVar.f211587a;
        return i == 2 || i == 3;
    }
}
