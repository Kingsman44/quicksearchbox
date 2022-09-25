package com.google.android.apps.gsa.staticplugins.nowcards.carousel;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import androidx.core.p097i.C1970e;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.gsa.sidekick.shared.cards.C91704s;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104308aj;
import com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104913ak;
import com.google.android.apps.gsa.staticplugins.nowcards.p8119i.C105048f;
import com.google.android.apps.p489g.p494d.C9183bs;
import com.google.android.apps.p489g.p494d.C9188bx;
import com.google.android.apps.p489g.p494d.C9269m;
import com.google.android.apps.p489g.p494d.C9270n;
import com.google.android.apps.p489g.p494d.C9273q;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.apps.p489g.p494d.C9279w;
import com.google.android.apps.p489g.p494d.C9280x;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7834lr;
import com.google.p375ai.p378b.C7845mb;
import com.google.p375ai.p378b.C7994rp;
import com.google.p375ai.p378b.C7998rt;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.carousel.ab */
/* compiled from: PG */
public class C104389ab extends C104913ak {

    /* renamed from: j */
    protected List f290474j;

    public C104389ab(C7718hj hjVar, C7718hj[] hjVarArr, CardRenderingContext cardRenderingContext, C105048f fVar, C89291a aVar, C91704s sVar, C104308aj ajVar) {
        super(hjVar, hjVarArr, cardRenderingContext, aVar, fVar, sVar, ajVar);
    }

    /* renamed from: a */
    public C9270n mo94024a(Context context) {
        C7998rt rtVar;
        C7845mb mbVar;
        Object obj;
        Context context2 = context;
        C1970e c = mo86081c();
        if (c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object obj2 = c.f5888a;
        if (obj2 != null) {
            mbVar = ((C7718hj) obj2).f26982w;
            if (mbVar == null) {
                mbVar = C7845mb.f27493p;
            }
            if (mbVar != null) {
                rtVar = mbVar.f27506l;
                if (rtVar == null) {
                    rtVar = C7998rt.f28087v;
                }
                if (mbVar.f27496b.size() > 0 && ((obj = c.f5888a) == null || (((C7718hj) obj).f26955a & 524288) == 0 || mbVar.f27507m)) {
                    for (C7994rp R : mbVar.f27496b) {
                        C9278v R2 = mo94395R(context2, this.f290132c, R, 2);
                        if (R2 != null) {
                            if (rtVar == null || !rtVar.f28092d) {
                                arrayList.add(R2);
                            } else {
                                C9273q qVar = (C9273q) R2.toBuilder();
                                qVar.copyOnWrite();
                                C9278v vVar = (C9278v) qVar.instance;
                                vVar.f32195b |= 64;
                                vVar.f32181O = false;
                                arrayList.add((C9278v) qVar.build());
                            }
                        }
                    }
                }
                if (mbVar.f27497c.size() > 0) {
                    for (C7994rp R3 : mbVar.f27497c) {
                        m172340G(arrayList2, mo94395R(context2, this.f290132c, R3, 4));
                    }
                }
            } else {
                rtVar = null;
            }
        } else {
            mbVar = null;
            rtVar = null;
        }
        this.f290474j = new ArrayList();
        Object obj3 = c.f5889b;
        if (obj3 != null) {
            for (C7718hj hjVar : (C7718hj[]) obj3) {
                C7834lr K = m172341K(hjVar);
                if (K == null) {
                    C9278v B = mo94393B(context2, hjVar);
                    if (B != null) {
                        List list = this.f290474j;
                        C9273q qVar2 = (C9273q) B.toBuilder();
                        qVar2.copyOnWrite();
                        C9278v vVar2 = (C9278v) qVar2.instance;
                        vVar2.f32195b |= 1;
                        vVar2.f32175I = true;
                        list.add((C9278v) qVar2.build());
                    }
                } else {
                    for (C7994rp R4 : K.f27469a) {
                        C9278v R5 = mo94395R(context2, hjVar, R4, 3);
                        if (R5 != null) {
                            C9273q qVar3 = (C9273q) R5.toBuilder();
                            if ((R5.f32192a & 16384) != 0) {
                                C9277u a = C9277u.m23705a(R5.f32196c);
                                if (a == null) {
                                    a = C9277u.UNKNOWN;
                                }
                                if (a != C9277u.METADATA_CARD_SMALL_CAROUSEL_TEXTONLY) {
                                    C9277u a2 = C9277u.m23705a(R5.f32196c);
                                    if (a2 == null) {
                                        a2 = C9277u.UNKNOWN;
                                    }
                                    if (!(a2 == C9277u.TRAY_GENERIC_SMALL_SPACE || a2 == C9277u.TRAY_GENERIC_LARGE_SPACE || a2 == C9277u.TRAY_SPORTS_STANDINGS || a2 == C9277u.TRAY_CRITIC)) {
                                        C9188bx bxVar = R5.f32210q;
                                        if (bxVar == null) {
                                            bxVar = C9188bx.f31714x;
                                        }
                                        C9183bs bsVar = (C9183bs) bxVar.toBuilder();
                                        bsVar.copyOnWrite();
                                        C9188bx bxVar2 = (C9188bx) bsVar.instance;
                                        bxVar2.f31716a |= 1024;
                                        bxVar2.f31730o = true;
                                        qVar3.copyOnWrite();
                                        C9278v vVar3 = (C9278v) qVar3.instance;
                                        C9188bx bxVar3 = (C9188bx) bsVar.build();
                                        bxVar3.getClass();
                                        vVar3.f32210q = bxVar3;
                                        vVar3.f32192a |= 16384;
                                    }
                                }
                            }
                            List list2 = this.f290474j;
                            qVar3.copyOnWrite();
                            C9278v vVar4 = (C9278v) qVar3.instance;
                            vVar4.f32195b |= 1;
                            vVar4.f32175I = true;
                            list2.add((C9278v) qVar3.build());
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty() && this.f290474j.isEmpty()) {
            return null;
        }
        C9279w wVar = (C9279w) C9280x.f32220d.createBuilder();
        wVar.mo17466a(this.f290474j);
        if (rtVar != null) {
            wVar.copyOnWrite();
            C9280x xVar = (C9280x) wVar.instance;
            xVar.f32224c = rtVar;
            xVar.f32222a |= 1;
        }
        C9273q qVar4 = (C9273q) C9278v.f32165Z.createBuilder();
        qVar4.copyOnWrite();
        C9278v vVar5 = (C9278v) qVar4.instance;
        C9280x xVar2 = (C9280x) wVar.build();
        xVar2.getClass();
        vVar5.f32211r = xVar2;
        vVar5.f32192a |= 32768;
        C9277u uVar = C9277u.METADATA_CARD_SMALL_CAROUSEL;
        qVar4.copyOnWrite();
        C9278v vVar6 = (C9278v) qVar4.instance;
        vVar6.f32196c = uVar.f32164ay;
        vVar6.f32192a |= 1;
        C7718hj hjVar2 = this.f290132c;
        qVar4.copyOnWrite();
        C9278v vVar7 = (C9278v) qVar4.instance;
        hjVar2.getClass();
        vVar7.f32174H = hjVar2;
        vVar7.f32192a |= LinearLayoutManager.INVALID_OFFSET;
        ArrayList arrayList3 = new ArrayList();
        if (!arrayList.isEmpty()) {
            if (mbVar != null && (mbVar.f27495a & 1024) != 0) {
                C9273q qVar5 = (C9273q) ((C9278v) arrayList.get(arrayList.size() - 1)).toBuilder();
                int i = mbVar.f27508n;
                qVar5.copyOnWrite();
                C9278v vVar8 = (C9278v) qVar5.instance;
                vVar8.f32195b |= 16384;
                vVar8.f32187U = i;
                arrayList.set(arrayList.size() - 1, (C9278v) qVar5.build());
                qVar4.copyOnWrite();
                C9278v vVar9 = (C9278v) qVar4.instance;
                vVar9.f32192a |= 16777216;
                vVar9.f32167A = 0;
            }
            arrayList3.addAll(arrayList);
        }
        arrayList3.add((C9278v) qVar4.build());
        if (!arrayList2.isEmpty()) {
            arrayList3.addAll(arrayList2);
        }
        C9269m mVar = (C9269m) C9270n.f32072e.createBuilder();
        mVar.mo17460a(arrayList3);
        boolean z = rtVar != null && rtVar.f28092d;
        mVar.copyOnWrite();
        C9270n nVar = (C9270n) mVar.instance;
        nVar.f32074a |= 1;
        nVar.f32076c = z;
        if (!(mbVar == null || (mbVar.f27495a & 2048) == 0)) {
            int i2 = mbVar.f27509o;
            mVar.copyOnWrite();
            C9270n nVar2 = (C9270n) mVar.instance;
            nVar2.f32074a |= 2;
            nVar2.f32077d = i2;
        }
        return (C9270n) mVar.build();
    }

    /* renamed from: b */
    public C7718hj mo94031b() {
        return null;
    }
}
