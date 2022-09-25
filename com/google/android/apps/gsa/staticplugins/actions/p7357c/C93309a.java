package com.google.android.apps.gsa.staticplugins.actions.p7357c;

import com.google.android.apps.gsa.search.shared.actions.modular.C87426a;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87447k;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87448l;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c;
import com.google.android.apps.gsa.search.shared.actions.util.C87494p;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;
import com.google.p4152bb.p4153a.C55133hb;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.p4152bb.p4153a.C55242lc;
import com.google.p4152bb.p4153a.C55361pn;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.c.a */
/* compiled from: PG */
final class C93309a extends C87447k {

    /* renamed from: a */
    final /* synthetic */ MatchingProviderInfo f260209a;

    /* renamed from: b */
    final /* synthetic */ C87426a f260210b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93309a(C87448l lVar, MatchingProviderInfo matchingProviderInfo, C87426a aVar) {
        super(lVar);
        this.f260209a = matchingProviderInfo;
        this.f260210b = aVar;
    }

    /* renamed from: U */
    public final C87429c mo81214U(C55134hc hcVar) {
        C55242lc d;
        C55361pn d2 = this.f260209a.mo81433d();
        if (d2 != null) {
            C55133hb hbVar = C55133hb.NONE;
            C55133hb a = C55133hb.m87600a(hcVar.f145123c);
            if (a == null) {
                a = C55133hb.NONE;
            }
            int ordinal = a.ordinal();
            if (ordinal == 2) {
                return new C87429c(d2.f145869b);
            }
            if (ordinal == 3) {
                String c = C87494p.m142026c(d2);
                if (c != null) {
                    return new C87429c(c);
                }
            } else if (ordinal == 5 && (d = this.f260210b.mo81234d()) != null) {
                return new C87429c(d.f145465b);
            }
        }
        return C87429c.f236122a;
    }
}
