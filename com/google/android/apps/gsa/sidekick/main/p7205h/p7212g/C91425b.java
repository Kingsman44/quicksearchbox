package com.google.android.apps.gsa.sidekick.main.p7205h.p7212g;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.gsa.shared.p7027bi.C89430a;
import com.google.android.apps.gsa.shared.p7027bi.C89432c;
import com.google.android.apps.gsa.sidekick.shared.p7231b.C91647a;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.C91903a;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.C91904b;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.C91909g;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.LoggingRequest;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.android.apps.p489g.p490a.C9117b;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7707gz;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7709ha;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7752iq;
import com.google.p4283bv.p4354e.p4355a.C57044b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.TimeZone;

/* renamed from: com.google.android.apps.gsa.sidekick.main.h.g.b */
/* compiled from: PG */
public final class C91425b {

    /* renamed from: a */
    private static final C59071e f255052a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.h.g.b");

    /* renamed from: b */
    private final C91647a f255053b;

    public C91425b(C91647a aVar) {
        this.f255053b = aVar;
    }

    /* renamed from: a */
    public final C91424a mo85777a(C7752iq iqVar, C7718hj hjVar, C7718hj hjVar2, C7718hj hjVar3, int i, int i2, int i3) {
        C57044b bVar;
        Object obj;
        C7752iq iqVar2 = iqVar;
        C7718hj hjVar4 = hjVar;
        if (hjVar4 == null) {
            return C91424a.m149536a();
        }
        boolean z = false;
        C7708h c = C91978bb.m150937c(hjVar4, C7681g.CARD_VISIBLE, new C7681g[0]);
        if (c == null) {
            ((C59052c) ((C59052c) f255052a.mo56225c()).mo56372aa(11583)).mo56386p("Could not find the CARD_VISIBLE action to log for entry");
            return C91424a.m149536a();
        }
        long j = iqVar2.f27154x;
        C7709ha d = m149537d(hjVar2, i2);
        C7709ha d2 = m149537d(hjVar3, i3);
        C91904b bVar2 = new C91904b();
        bVar2.f256309f = d;
        bVar2.f256308e = d2;
        bVar2.f256304a = Integer.valueOf(i);
        bVar2.f256306c = Integer.valueOf(i3);
        C91909g x = LoggingRequest.m150673x();
        C91903a aVar = (C91903a) x;
        aVar.f256281a = c;
        aVar.f256285e = hjVar4;
        aVar.f256288h = this.f255053b.mo85966a();
        aVar.f256282b = Long.valueOf(j / 1000);
        aVar.f256284d = Integer.valueOf((int) (((long) TimeZone.getDefault().getOffset(j)) / 1000));
        aVar.f256287g = bVar2.mo86554a();
        aVar.f256283c = Long.valueOf(iqVar2.f27142l);
        x.mo86544h(iqVar2.f27143m);
        x.mo86539c(iqVar2.f27144n);
        x.mo86542f(iqVar2.f27148r);
        x.mo86540d(iqVar2.f27149s);
        x.mo86541e(iqVar2.f27147q);
        x.mo86553q(iqVar2.f27145o);
        x.mo86550n(iqVar2.f27146p);
        x.mo86551o(iqVar2.f27150t);
        x.mo86552p(iqVar2.f27151u);
        if (hjVar4.f26964e == 329) {
            bVar = (C57044b) hjVar4.f26965f;
        } else {
            bVar = C57044b.f152285d;
        }
        if ((bVar.f152287a & 1) != 0) {
            C62940bt r3 = C62942bv.checkIsLite(C9117b.f31386e);
            hjVar4.mo58887l(r3);
            Object l = hjVar4.f169962ag.mo58854l(r3.f169971d);
            if (l == null) {
                obj = r3.f169969b;
            } else {
                obj = r3.mo58889c(l);
            }
            if (!((C9117b) obj).f31389b && iqVar2.f27142l >= 0) {
                z = C89432c.m145485a(new C89430a(iqVar2.f27147q, iqVar2.f27144n, iqVar2.f27149s, iqVar2.f27148r, iqVar2.f27145o, iqVar2.f27146p, iqVar2.f27150t, iqVar2.f27151u), 0.0f, 0.0f);
            }
        }
        if (z) {
            x.mo86549m(true);
        }
        this.f255053b.mo85967b(x.mo86537a());
        return new C91424a(z);
    }

    /* renamed from: b */
    public final boolean mo85778b(C7718hj hjVar) {
        return C91978bb.m150937c(hjVar, C7681g.CARD_VISIBLE, new C7681g[0]) != null;
    }

    /* renamed from: c */
    public final boolean mo85779c(C9278v vVar) {
        if ((vVar.f32192a & LinearLayoutManager.INVALID_OFFSET) == 0) {
            return false;
        }
        C7718hj hjVar = vVar.f32174H;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        return mo85778b(hjVar) && vVar.f32175I;
    }

    /* renamed from: d */
    private static final C7709ha m149537d(C7718hj hjVar, int i) {
        C7707gz gzVar;
        if (hjVar == null || (hjVar.f26955a & 64) == 0) {
            gzVar = (C7707gz) C7709ha.f26910f.createBuilder();
        } else {
            C7709ha haVar = hjVar.f26972m;
            if (haVar == null) {
                haVar = C7709ha.f26910f;
            }
            gzVar = (C7707gz) haVar.toBuilder();
        }
        if (i >= 0) {
            gzVar.copyOnWrite();
            C7709ha haVar2 = (C7709ha) gzVar.instance;
            haVar2.f26912a |= 4;
            haVar2.f26914c = i;
        }
        return (C7709ha) gzVar.build();
    }
}
