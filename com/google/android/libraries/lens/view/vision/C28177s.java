package com.google.android.libraries.lens.view.vision;

import android.graphics.PointF;
import com.google.android.libraries.lens.common.p1998a.C24095c;
import com.google.android.libraries.lens.common.p1998a.C24101i;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4698d.C62162a;
import com.google.lens.p4698d.C62163b;
import com.google.p4488cj.p4489a.p4490a.C58120a;
import com.google.p4488cj.p4489a.p4490a.C58125b;
import com.google.p4488cj.p4489a.p4490a.p4491a.C58121a;
import com.google.p4488cj.p4489a.p4490a.p4491a.C58122b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62960cg;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.lens.view.vision.s */
/* compiled from: PG */
public final class C28177s {
    static {
        C58974d.m91135i("TimedBoxConverter");
    }

    /* renamed from: a */
    public static C28178t m52622a(C58122b bVar, int i, int i2) {
        Object obj;
        boolean z = false;
        if ((bVar.f155369a & 128) != 0 && bVar.f155377i >= 0) {
            z = true;
        }
        C58838bb.m90868c(z);
        C28178t C = C28179u.m52642C(bVar.f155377i);
        C28164f fVar = (C28164f) C;
        fVar.f76639g = C58833ax.m90834k(Float.valueOf(bVar.f155378j));
        C.mo33645i(bVar.f155380l);
        C.mo33649m(bVar.f155382n);
        if ((bVar.f155369a & 16) != 0) {
            float f = (float) i;
            C.mo33652p(((bVar.f155373e + bVar.f155371c) * f) / 2.0f);
            float f2 = (float) i2;
            C.mo33653q(((bVar.f155372d + bVar.f155370b) * f2) / 2.0f);
            C.mo33647k(f * (bVar.f155373e - bVar.f155371c));
            C.mo33648l(f2 * (bVar.f155372d - bVar.f155370b));
            C.mo33646j(bVar.f155374f);
        }
        if ((bVar.f155369a & 2048) != 0 && bVar.f155381m) {
            C.mo33642f(true);
        }
        C62940bt r1 = C62942bv.checkIsLite(C62163b.f167813j);
        bVar.mo58887l(r1);
        if (bVar.f169962ag.mo58857o(r1.f169971d)) {
            C62940bt r12 = C62942bv.checkIsLite(C62163b.f167813j);
            bVar.mo58887l(r12);
            Object l = bVar.f169962ag.mo58854l(r12.f169971d);
            if (l == null) {
                obj = r12.f169969b;
            } else {
                obj = r12.mo58889c(l);
            }
            C62163b bVar2 = (C62163b) obj;
            fVar.f76636d = C58833ax.m90834k(new C28158b(bVar2.f167817c, bVar2.f167818d, bVar2.f167819e, bVar2.f167820f, bVar2.f167821g, bVar2.f167822h));
            int i3 = bVar.f155377i;
            long j = bVar.f155376h;
        }
        if ((bVar.f155369a & 32) != 0) {
            C58125b bVar3 = bVar.f155375g;
            if (bVar3 == null) {
                bVar3 = C58125b.f155389b;
            }
            C58485gu j2 = C58485gu.m89842j(bVar3.f155391a);
            C.mo33644h(j2);
            PointF a = C24101i.m44774a(C24095c.m44766k(j2));
            C.mo33652p(a.x * ((float) i));
            C.mo33653q(a.y * ((float) i2));
        }
        if ((bVar.f155369a & 512) != 0) {
            fVar.f76634b = C58833ax.m90834k(Float.valueOf(bVar.f155379k));
        }
        C.mo33651o(bVar.f155383o);
        return C;
    }

    /* renamed from: b */
    public static C58121a m52623b(C28179u uVar, int i, int i2) {
        C58121a aVar = (C58121a) C58122b.f155367p.createBuilder();
        int h = uVar.mo33664h();
        aVar.copyOnWrite();
        C58122b bVar = (C58122b) aVar.instance;
        bVar.f155369a |= 128;
        bVar.f155377i = h;
        long millis = TimeUnit.MICROSECONDS.toMillis(uVar.mo33666i());
        aVar.copyOnWrite();
        C58122b bVar2 = (C58122b) aVar.instance;
        bVar2.f155369a |= 64;
        bVar2.f155376h = millis;
        boolean z = uVar.mo33684z();
        aVar.copyOnWrite();
        C58122b bVar3 = (C58122b) aVar.instance;
        bVar3.f155369a |= 1024;
        bVar3.f155380l = z;
        boolean x = uVar.mo33682x();
        aVar.copyOnWrite();
        C58122b bVar4 = (C58122b) aVar.instance;
        bVar4.f155369a |= 2048;
        bVar4.f155381m = x;
        boolean A = uVar.mo33654A();
        aVar.copyOnWrite();
        C58122b bVar5 = (C58122b) aVar.instance;
        bVar5.f155369a |= 16384;
        bVar5.f155382n = A;
        if (uVar.mo33659d() > 0.0f && uVar.mo33660e() > 0.0f) {
            float g = uVar.mo33663g();
            float e = uVar.mo33660e();
            float f = (float) i2;
            aVar.copyOnWrite();
            C58122b bVar6 = (C58122b) aVar.instance;
            bVar6.f155369a |= 4;
            bVar6.f155372d = (g + (e / 2.0f)) / f;
            float g2 = uVar.mo33663g();
            float e2 = uVar.mo33660e();
            aVar.copyOnWrite();
            C58122b bVar7 = (C58122b) aVar.instance;
            bVar7.f155369a |= 1;
            bVar7.f155370b = (g2 - (e2 / 2.0f)) / f;
            float f2 = uVar.mo33662f();
            float d = uVar.mo33659d();
            float f3 = (float) i;
            aVar.copyOnWrite();
            C58122b bVar8 = (C58122b) aVar.instance;
            bVar8.f155369a |= 8;
            bVar8.f155373e = (f2 + (d / 2.0f)) / f3;
            float f4 = uVar.mo33662f();
            float d2 = uVar.mo33659d();
            aVar.copyOnWrite();
            C58122b bVar9 = (C58122b) aVar.instance;
            bVar9.f155369a |= 2;
            bVar9.f155371c = (f4 - (d2 / 2.0f)) / f3;
            float c = uVar.mo33658c();
            aVar.copyOnWrite();
            C58122b bVar10 = (C58122b) aVar.instance;
            bVar10.f155369a |= 16;
            bVar10.f155374f = c;
        }
        if (uVar.mo33697E()) {
            C58120a aVar2 = (C58120a) C58125b.f155389b.createBuilder();
            C58485gu u = uVar.mo33679u();
            aVar2.copyOnWrite();
            C58125b bVar11 = (C58125b) aVar2.instance;
            C62960cg cgVar = bVar11.f155391a;
            if (!cgVar.mo58948c()) {
                bVar11.f155391a = C62942bv.mutableCopy(cgVar);
            }
            C62947c.addAll((Iterable) u, (List) bVar11.f155391a);
            aVar.copyOnWrite();
            C58122b bVar12 = (C58122b) aVar.instance;
            C58125b bVar13 = (C58125b) aVar2.build();
            bVar13.getClass();
            bVar12.f155375g = bVar13;
            bVar12.f155369a |= 32;
        }
        if (uVar.mo33675r().mo56113h()) {
            float floatValue = ((Float) uVar.mo33675r().mo56107c()).floatValue();
            aVar.copyOnWrite();
            C58122b bVar14 = (C58122b) aVar.instance;
            bVar14.f155369a |= 512;
            bVar14.f155379k = floatValue;
        }
        if (uVar.mo33681w()) {
            C62940bt btVar = C62163b.f167813j;
            C62162a aVar3 = (C62162a) C62163b.f167812i.createBuilder();
            aVar3.copyOnWrite();
            C62163b bVar15 = (C62163b) aVar3.instance;
            bVar15.f167815a |= 1;
            bVar15.f167816b = true;
            aVar.mo58885m(btVar, (C62163b) aVar3.build());
        }
        return aVar;
    }
}
