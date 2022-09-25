package com.google.android.apps.gsa.staticplugins.nowcards.p8116f;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104307ai;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104308aj;
import com.google.android.apps.p489g.p494d.C9202ck;
import com.google.android.apps.p489g.p494d.C9203cl;
import com.google.android.apps.p489g.p494d.C9269m;
import com.google.android.apps.p489g.p494d.C9270n;
import com.google.android.apps.p489g.p494d.C9273q;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.p375ai.p378b.C7717hi;
import com.google.p375ai.p378b.C7718hj;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57438di;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.f.g */
/* compiled from: PG */
public final class C104881g extends C104307ai {
    public C104881g(C7718hj hjVar, CardRenderingContext cardRenderingContext, C104308aj ajVar) {
        super(hjVar, cardRenderingContext, ajVar);
        this.f290137h = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final boolean mo94048J() {
        return true;
    }

    /* renamed from: a */
    public final C9270n mo94024a(Context context) {
        C7717hi hiVar = this.f290132c.f26975p;
        if (hiVar == null) {
            hiVar = C7717hi.f26920d;
        }
        if ((hiVar.f26922a & 1) != 0) {
            C7717hi hiVar2 = this.f290132c.f26975p;
            if (hiVar2 == null) {
                hiVar2 = C7717hi.f26920d;
            }
            C62971cq cqVar = hiVar2.f26923b;
            if ((hiVar2.f26922a & 1) != 0) {
                C57438di diVar = hiVar2.f26924c;
                if (diVar == null) {
                    diVar = C57438di.f153417i;
                }
                C9269m mVar = (C9269m) C9270n.f32072e.createBuilder();
                C9202ck ckVar = (C9202ck) C9203cl.f31796e.createBuilder();
                ckVar.copyOnWrite();
                C9203cl clVar = (C9203cl) ckVar.instance;
                diVar.getClass();
                clVar.f31799b = diVar;
                clVar.f31798a |= 1;
                ckVar.mo17453a(cqVar);
                C9203cl clVar2 = (C9203cl) ckVar.build();
                C9273q qVar = (C9273q) C9278v.f32165Z.createBuilder();
                C7718hj hjVar = this.f290132c;
                qVar.copyOnWrite();
                C9278v vVar = (C9278v) qVar.instance;
                hjVar.getClass();
                vVar.f32174H = hjVar;
                vVar.f32192a |= LinearLayoutManager.INVALID_OFFSET;
                C9277u uVar = C9277u.PIET_FRAME;
                qVar.copyOnWrite();
                C9278v vVar2 = (C9278v) qVar.instance;
                vVar2.f32196c = uVar.f32164ay;
                vVar2.f32192a |= 1;
                qVar.copyOnWrite();
                C9278v vVar3 = (C9278v) qVar.instance;
                vVar3.f32195b |= 64;
                vVar3.f32181O = true;
                qVar.copyOnWrite();
                C9278v vVar4 = (C9278v) qVar.instance;
                clVar2.getClass();
                vVar4.f32218y = clVar2;
                vVar4.f32192a |= 4194304;
                mVar.mo17462c((C9278v) qVar.build());
                return (C9270n) mVar.build();
            }
        }
        return C9270n.f32072e;
    }
}
