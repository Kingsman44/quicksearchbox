package com.google.android.apps.gsa.search.shared.actions.core;

import com.evernote.android.state.BuildConfig;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55263lx;
import com.google.p4152bb.p4153a.C55365pr;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* compiled from: PG */
public class PromoAction extends ButtonAction {

    /* renamed from: h */
    public String f236052h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f236053i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f236054j = BuildConfig.FLAVOR;

    public PromoAction(C55365pr prVar) {
        super("Discoverability");
        Object obj;
        if (prVar != null) {
            if ((prVar.f145878a & 1) != 0) {
                C55136he heVar = prVar.f145879b;
                this.f236052h = (heVar == null ? C55136he.f145130j : heVar).f145133b;
            }
            C62940bt r0 = C62942bv.checkIsLite(C55263lx.f145543j);
            prVar.mo58887l(r0);
            Object l = prVar.f169962ag.mo58854l(r0.f169971d);
            if (l == null) {
                obj = r0.f169969b;
            } else {
                obj = r0.mo58889c(l);
            }
            C55263lx lxVar = (C55263lx) obj;
            if (lxVar.f145552g.size() > 0) {
                this.f236053i = ((C55136he) lxVar.f145552g.get(0)).f145133b;
            }
            if (!lxVar.f145549d.isEmpty()) {
                this.f236054j = lxVar.f145549d;
            }
        }
    }

    public final String toString() {
        String str = this.f236041g;
        return "PromoCardAction[" + str + "]";
    }
}
