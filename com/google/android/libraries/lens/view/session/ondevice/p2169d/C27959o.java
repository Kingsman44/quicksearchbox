package com.google.android.libraries.lens.view.session.ondevice.p2169d;

import com.google.android.libraries.lens.view.p2069am.C25322bc;
import com.google.android.libraries.lens.view.p2069am.C25324be;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.lens.p4695b.C62160f;
import com.google.lens.p4699e.C62213az;
import com.google.lens.p4699e.C62215ba;
import com.google.p4017at.p4056g.p4057a.p4058a.C54042cw;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.d.o */
/* compiled from: PG */
public final /* synthetic */ class C27959o implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C27959o f76119a = new C27959o();

    private /* synthetic */ C27959o() {
    }

    public final C60870cx apply(Object obj) {
        int i = C27962r.f76122b;
        C58480gp e = C58485gu.m89837e();
        for (C62160f fVar : ((C54042cw) obj).f141798c) {
            C25322bc bcVar = (C25322bc) C25324be.f68896e.createBuilder();
            String str = fVar.f167806a;
            bcVar.copyOnWrite();
            str.getClass();
            ((C25324be) bcVar.instance).f68898a = str;
            String str2 = fVar.f167807b;
            bcVar.copyOnWrite();
            str2.getClass();
            ((C25324be) bcVar.instance).f68899b = str2;
            C62215ba baVar = fVar.f167808c;
            if (baVar == null) {
                baVar = C62215ba.f167974c;
            }
            int a = C62213az.m94757a(baVar.f167977b);
            if (a == 0) {
                a = 1;
            }
            switch (a - 1) {
                case 1:
                    bcVar.copyOnWrite();
                    ((C25324be) bcVar.instance).f68900c = 1;
                    break;
                case 2:
                    bcVar.copyOnWrite();
                    ((C25324be) bcVar.instance).f68900c = 2;
                    break;
                case 3:
                    bcVar.copyOnWrite();
                    ((C25324be) bcVar.instance).f68900c = 3;
                    break;
                case 4:
                    bcVar.copyOnWrite();
                    ((C25324be) bcVar.instance).f68900c = 4;
                    break;
                case 5:
                    bcVar.copyOnWrite();
                    ((C25324be) bcVar.instance).f68900c = 2;
                    bcVar.copyOnWrite();
                    ((C25324be) bcVar.instance).f68901d = "UNKNOWN_SOURCE_LANGUAGE";
                    break;
                case 6:
                    bcVar.copyOnWrite();
                    ((C25324be) bcVar.instance).f68900c = 2;
                    bcVar.copyOnWrite();
                    ((C25324be) bcVar.instance).f68901d = "INVALID_REQUEST";
                    break;
                case 7:
                    bcVar.copyOnWrite();
                    ((C25324be) bcVar.instance).f68900c = 2;
                    bcVar.copyOnWrite();
                    ((C25324be) bcVar.instance).f68901d = "DEADLINE_EXCEEDED";
                    break;
                default:
                    bcVar.copyOnWrite();
                    ((C25324be) bcVar.instance).f68900c = 0;
                    break;
            }
            e.mo55395g((C25324be) bcVar.build());
        }
        return C60856cj.m92900i(e.mo55394f());
    }
}
