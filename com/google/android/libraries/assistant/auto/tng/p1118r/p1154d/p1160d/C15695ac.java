package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1160d;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5218j.C66893dj;
import com.google.speech.p5218j.C67087ko;
import com.google.speech.p5218j.C67105lf;
import com.google.speech.p5218j.C67150mx;
import com.google.speech.p5218j.C67152mz;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.d.ac */
/* compiled from: PG */
public final /* synthetic */ class C15695ac implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C15706an f46834a;

    /* renamed from: b */
    public final /* synthetic */ C67105lf f46835b;

    public /* synthetic */ C15695ac(C15706an anVar, C67105lf lfVar) {
        this.f46834a = anVar;
        this.f46835b = lfVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C15705am amVar;
        Object obj;
        C15706an anVar = this.f46834a;
        C67105lf lfVar = this.f46835b;
        if (((Boolean) anVar.f46858g.mo17428b()).booleanValue() && (amVar = anVar.f46866o) != null && ((C15709c) amVar).f46873a.equals(lfVar)) {
            C67087ko koVar = ((C15709c) anVar.f46866o).f46874b;
            C62940bt r2 = C62942bv.checkIsLite(C66893dj.f181859d);
            koVar.mo58887l(r2);
            Object l = koVar.f169962ag.mo58854l(r2.f169971d);
            if (l == null) {
                obj = r2.f169969b;
            } else {
                obj = r2.mo58889c(l);
            }
            C67150mx mxVar = ((C66893dj) obj).f181862b;
            if (mxVar == null) {
                mxVar = C67150mx.f182524d;
            }
            C67152mz a = C67152mz.m97427a(mxVar.f182527b);
            if (a == null) {
                a = C67152mz.NO_ERROR;
            }
            if (a == C67152mz.NO_ERROR) {
                C15705am amVar2 = anVar.f46866o;
                amVar2.getClass();
                return C60856cj.m92900i(C58833ax.m90834k(((C15709c) amVar2).f46874b));
            }
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }
}
