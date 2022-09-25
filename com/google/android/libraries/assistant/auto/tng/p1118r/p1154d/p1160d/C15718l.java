package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1160d;

import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1158c.C15689a;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5218j.C66893dj;
import com.google.speech.p5218j.C67087ko;
import com.google.speech.p5218j.C67104le;
import com.google.speech.p5218j.C67105lf;
import com.google.speech.p5218j.C67150mx;
import com.google.speech.p5218j.C67152mz;
import com.google.speech.p5218j.C67167nn;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.d.l */
/* compiled from: PG */
public final /* synthetic */ class C15718l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C15706an f46891a;

    /* renamed from: b */
    public final /* synthetic */ C67167nn f46892b;

    public /* synthetic */ C15718l(C15706an anVar, C67167nn nnVar) {
        this.f46891a = anVar;
        this.f46892b = nnVar;
    }

    public final C60870cx apply(Object obj) {
        Object obj2;
        C70862aj ajVar;
        C15706an anVar = this.f46891a;
        C67167nn nnVar = this.f46892b;
        C58833ax axVar = (C58833ax) obj;
        axVar.mo56113h();
        if (axVar.mo56113h()) {
            C67087ko koVar = (C67087ko) axVar.mo56107c();
            C62940bt r2 = C62942bv.checkIsLite(C66893dj.f181859d);
            koVar.mo58887l(r2);
            Object l = koVar.f169962ag.mo58854l(r2.f169971d);
            if (l == null) {
                obj2 = r2.f169969b;
            } else {
                obj2 = r2.mo58889c(l);
            }
            C67150mx mxVar = ((C66893dj) obj2).f181862b;
            if (mxVar == null) {
                mxVar = C67150mx.f182524d;
            }
            C67152mz a = C67152mz.m97427a(mxVar.f182527b);
            if (a == null) {
                a = C67152mz.NO_ERROR;
            }
            if (a == C67152mz.NO_ERROR && (ajVar = anVar.f46865n) != null) {
                C67104le leVar = (C67104le) C67105lf.f182433a.createBuilder();
                leVar.mo58885m(C67167nn.f182565d, nnVar);
                ajVar.mo20123c((C67105lf) leVar.build());
                C70862aj ajVar2 = anVar.f46865n;
                C67104le leVar2 = (C67104le) C67105lf.f182433a.createBuilder();
                leVar2.mo58885m(C67167nn.f182565d, C67167nn.f182564c);
                ajVar2.mo20123c((C67105lf) leVar2.build());
                return C60866ct.f164955a;
            }
        }
        C15689a aVar = new C15689a("Error initializing Soda");
        anVar.f46863l.mo20122b(aVar);
        throw aVar;
    }
}
