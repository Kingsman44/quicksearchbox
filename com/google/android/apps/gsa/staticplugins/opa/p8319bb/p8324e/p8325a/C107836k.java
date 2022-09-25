package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a;

import com.google.android.apps.gsa.search.core.google.p6790a.C85822g;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107481g;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107483i;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107944s;
import com.google.assistant.p3897e.p3917i.p3918a.C51580mz;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.a.k */
/* compiled from: PG */
public final class C107836k implements C107839n {

    /* renamed from: a */
    private final C85822g f300077a;

    public C107836k(C85822g gVar) {
        this.f300077a = gVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo96296a() {
    }

    /* renamed from: b */
    public final void mo96297b(C107504e eVar, C58833ax axVar, C107944s sVar) {
        Object obj;
        C107502c a = C107502c.m178394a(eVar.f299118b);
        if (a == null) {
            a = C107502c.UNDEFINED;
        }
        if (a == C107502c.OPA_IMMERSIVE_CANVAS_UPDATE_PARAMS) {
            C62940bt r3 = C62942bv.checkIsLite(C107481g.f299070a);
            eVar.mo58887l(r3);
            if (eVar.f169962ag.mo58857o(r3.f169971d)) {
                C62940bt r32 = C62942bv.checkIsLite(C107481g.f299070a);
                eVar.mo58887l(r32);
                Object l = eVar.f169962ag.mo58854l(r32.f169971d);
                if (l == null) {
                    obj = r32.f169969b;
                } else {
                    obj = r32.mo58889c(l);
                }
                C107483i iVar = (C107483i) obj;
                if (iVar.equals(C107483i.f299071d)) {
                    C85822g gVar = this.f300077a;
                    synchronized (gVar.f232057a) {
                        gVar.f232059c = null;
                        gVar.f232058b = null;
                    }
                    return;
                }
                if ((iVar.f299073a & 1) != 0) {
                    C85822g gVar2 = this.f300077a;
                    C51580mz mzVar = iVar.f299074b;
                    if (mzVar == null) {
                        mzVar = C51580mz.f134430h;
                    }
                    synchronized (gVar2.f232057a) {
                        gVar2.f232059c = mzVar;
                    }
                }
                if ((iVar.f299073a & 2) != 0) {
                    C85822g gVar3 = this.f300077a;
                    C63088z zVar = iVar.f299075c;
                    synchronized (gVar3.f232057a) {
                        gVar3.f232058b = zVar;
                    }
                }
            }
        }
    }
}
