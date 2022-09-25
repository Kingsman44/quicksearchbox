package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a;

import com.google.android.apps.gsa.search.core.google.p6790a.C85822g;
import com.google.android.apps.gsa.search.core.google.p6790a.C85831p;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107484j;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107486l;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107944s;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.a.m */
/* compiled from: PG */
public final class C107838m implements C107839n {

    /* renamed from: a */
    private final C85822g f300078a;

    /* renamed from: b */
    private final C85831p f300079b;

    public C107838m(C85822g gVar, C85831p pVar) {
        this.f300079b = pVar;
        this.f300078a = gVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo96296a() {
    }

    /* renamed from: b */
    public final void mo96297b(C107504e eVar, C58833ax axVar, C107944s sVar) {
        Object obj;
        Object obj2;
        Object obj3;
        C107502c a = C107502c.m178394a(eVar.f299118b);
        if (a == null) {
            a = C107502c.UNDEFINED;
        }
        if (a == C107502c.OPA_IMMERSIVE_CANVAS_UPDATE_STATE) {
            C62940bt r4 = C62942bv.checkIsLite(C107484j.f299076a);
            eVar.mo58887l(r4);
            if (eVar.f169962ag.mo58857o(r4.f169971d)) {
                C62940bt r42 = C62942bv.checkIsLite(C107484j.f299076a);
                eVar.mo58887l(r42);
                Object l = eVar.f169962ag.mo58854l(r42.f169971d);
                if (l == null) {
                    obj = r42.f169969b;
                } else {
                    obj = r42.mo58889c(l);
                }
                if (((C107486l) obj).equals(C107486l.f299077d)) {
                    C85822g gVar = this.f300078a;
                    synchronized (gVar.f232057a) {
                        gVar.f232060d = null;
                    }
                    return;
                }
                C62940bt r43 = C62942bv.checkIsLite(C107484j.f299076a);
                eVar.mo58887l(r43);
                Object l2 = eVar.f169962ag.mo58854l(r43.f169971d);
                if (l2 == null) {
                    obj2 = r43.f169969b;
                } else {
                    obj2 = r43.mo58889c(l2);
                }
                String str = ((C107486l) obj2).f299080b;
                C85831p pVar = this.f300079b;
                synchronized (pVar.f232079a) {
                    pVar.f232081c = str;
                }
                C85831p pVar2 = this.f300079b;
                C62940bt r0 = C62942bv.checkIsLite(C107484j.f299076a);
                eVar.mo58887l(r0);
                Object l3 = eVar.f169962ag.mo58854l(r0.f169971d);
                if (l3 == null) {
                    obj3 = r0.f169969b;
                } else {
                    obj3 = r0.mo58889c(l3);
                }
                pVar2.f232080b = ((C107486l) obj3).f299081c;
                C85822g gVar2 = this.f300078a;
                synchronized (gVar2.f232057a) {
                    gVar2.f232060d = str;
                }
            }
        }
    }
}
