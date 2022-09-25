package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8114b;

import com.google.android.apps.p489g.p494d.C9273q;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.p375ai.p378b.C7688gg;
import com.google.p375ai.p378b.C7691gj;
import com.google.p375ai.p378b.C7694gm;
import com.google.p375ai.p378b.C7718hj;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.b.d */
/* compiled from: PG */
public final class C104843d {
    /* renamed from: a */
    public static void m173800a(C9273q qVar) {
        int a;
        C9278v vVar = (C9278v) qVar.instance;
        int i = 1;
        if ((vVar.f32195b & 1024) == 0 || (a = C7688gg.m22805a(vVar.f32185S)) == 0 || a == 1) {
            C7718hj hjVar = vVar.f32174H;
            if (hjVar == null) {
                hjVar = C7718hj.f26927af;
            }
            C7694gm gmVar = hjVar.f26956aa;
            if (gmVar == null) {
                gmVar = C7694gm.f26861e;
            }
            if ((gmVar.f26863a & 4) != 0) {
                C7718hj hjVar2 = ((C9278v) qVar.instance).f32174H;
                if (hjVar2 == null) {
                    hjVar2 = C7718hj.f26927af;
                }
                C7694gm gmVar2 = hjVar2.f26956aa;
                if (gmVar2 == null) {
                    gmVar2 = C7694gm.f26861e;
                }
                int a2 = C7688gg.m22805a(gmVar2.f26865c);
                if (a2 != 0) {
                    i = a2;
                }
                qVar.copyOnWrite();
                C9278v vVar2 = (C9278v) qVar.instance;
                vVar2.f32185S = i - 1;
                vVar2.f32195b |= 1024;
            }
        }
    }

    /* renamed from: b */
    public static C9278v m173801b(C9273q qVar, int i) {
        int a;
        C9278v vVar = (C9278v) qVar.instance;
        if ((vVar.f32195b & 2048) != 0 && (a = C7691gj.m22806a(vVar.f32186T)) != 0 && a != 1) {
            return (C9278v) qVar.build();
        }
        C7718hj hjVar = vVar.f32174H;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        C7694gm gmVar = hjVar.f26956aa;
        if (gmVar == null) {
            gmVar = C7694gm.f26861e;
        }
        if ((gmVar.f26863a & 8) != 0) {
            C7718hj hjVar2 = ((C9278v) qVar.instance).f32174H;
            if (hjVar2 == null) {
                hjVar2 = C7718hj.f26927af;
            }
            C7694gm gmVar2 = hjVar2.f26956aa;
            if (gmVar2 == null) {
                gmVar2 = C7694gm.f26861e;
            }
            int a2 = C7691gj.m22806a(gmVar2.f26866d);
            if (a2 == 0) {
                a2 = 1;
            }
            qVar.copyOnWrite();
            C9278v vVar2 = (C9278v) qVar.instance;
            int i2 = a2 - 1;
            vVar2.f32186T = i2;
            vVar2.f32195b |= 2048;
            int a3 = C7691gj.m22806a(i2);
            if (a3 == 0 || a3 == 1) {
                qVar.copyOnWrite();
                C9278v vVar3 = (C9278v) qVar.instance;
                vVar3.f32186T = i - 1;
                vVar3.f32195b |= 2048;
            }
        } else {
            qVar.copyOnWrite();
            C9278v vVar4 = (C9278v) qVar.instance;
            vVar4.f32186T = i - 1;
            vVar4.f32195b |= 2048;
        }
        return (C9278v) qVar.build();
    }
}
