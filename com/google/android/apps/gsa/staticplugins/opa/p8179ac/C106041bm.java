package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import com.google.assistant.p3814ai.p3815a.p3816a.C49183q;
import com.google.assistant.p3814ai.p3815a.p3816a.C49187u;
import com.google.assistant.p3814ai.p3815a.p3816a.C49188v;
import com.google.assistant.p3897e.p3917i.p3918a.C51577mw;
import com.google.assistant.p3897e.p3917i.p3918a.C51580mz;
import com.google.assistant.p3897e.p3917i.p3918a.C51582na;
import com.google.assistant.p3897e.p3917i.p3918a.C51583nb;
import com.google.assistant.p3897e.p3917i.p3918a.C51586ne;
import com.google.assistant.p3897e.p3917i.p3918a.C51587nf;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.Collection;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.bm */
/* compiled from: PG */
public final /* synthetic */ class C106041bm implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C51577mw f296061a;

    public /* synthetic */ C106041bm(C51577mw mwVar) {
        this.f296061a = mwVar;
    }

    public final void accept(Object obj) {
        C49183q qVar;
        C51577mw mwVar = this.f296061a;
        C49187u uVar = (C49187u) obj;
        int b = C49188v.m85386b(uVar.f127178d);
        if (b == 0) {
            b = 1;
        }
        if (b == 3 || b == 4) {
            C51582na naVar = (C51582na) C51587nf.f134449e.createBuilder();
            String str = uVar.f127177c;
            naVar.copyOnWrite();
            str.getClass();
            ((C51587nf) naVar.instance).f134453c = str;
            C51583nb nbVar = (C51583nb) C51586ne.f134446b.createBuilder();
            int b2 = C49188v.m85386b(uVar.f127178d);
            if (b2 == 0) {
                b2 = 1;
            }
            int i = b2 - 2;
            if (i == 1) {
                naVar.copyOnWrite();
                ((C51587nf) naVar.instance).f134454d = 1;
            } else if (i != 2) {
                ((C59052c) ((C59052c) C106044bp.f296064a.mo56226d()).mo56372aa(24699)).mo56389s("Type override mode %s is unspecified or not supported.", C49188v.m85385a(b2));
            } else {
                naVar.copyOnWrite();
                ((C51587nf) naVar.instance).f134454d = 2;
            }
            if (uVar.f127175a == 3) {
                qVar = (C49183q) uVar.f127176b;
            } else {
                qVar = C49183q.f127167b;
            }
            Collection.EL.forEach(qVar.f127169a, new C106043bo(nbVar));
            C51586ne neVar = (C51586ne) nbVar.build();
            naVar.copyOnWrite();
            C51587nf nfVar = (C51587nf) naVar.instance;
            neVar.getClass();
            nfVar.f134452b = neVar;
            nfVar.f134451a = 3;
            C51587nf nfVar2 = (C51587nf) naVar.build();
            mwVar.copyOnWrite();
            C51580mz mzVar = (C51580mz) mwVar.instance;
            C51580mz mzVar2 = C51580mz.f134430h;
            nfVar2.getClass();
            C62971cq cqVar = mzVar.f134438g;
            if (!cqVar.mo58948c()) {
                mzVar.f134438g = C62942bv.mutableCopy(cqVar);
            }
            mzVar.f134438g.add(nfVar2);
            return;
        }
        ((C59052c) ((C59052c) C106044bp.f296064a.mo56226d()).mo56372aa(24701)).mo56389s("Type override mode %s is unspecified or unexpected.", C49188v.m85385a(b));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
