package com.google.android.libraries.lens.view.render;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.lens.common.p1998a.C24094b;
import com.google.android.libraries.lens.common.p1998a.C24095c;
import com.google.android.libraries.lens.view.livingsurfaces.C27245d;
import com.google.android.libraries.lens.view.livingsurfaces.C27250i;
import com.google.android.libraries.lens.view.livingsurfaces.C27251j;
import com.google.android.libraries.lens.view.livingsurfaces.C27270x;
import com.google.android.libraries.lens.view.p2069am.C25312at;
import com.google.android.libraries.lens.view.p2073ao.C25459e;
import com.google.android.libraries.lens.view.p2146j.C27212a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4699e.C62205ar;
import com.google.lens.p4707j.C62445bv;
import com.google.lens.p4707j.C62451ca;
import com.google.lens.p4707j.C62452cb;
import com.google.lens.p4708k.C62593a;
import com.google.lens.p4708k.C62596d;
import com.google.lens.p4708k.C62598f;
import com.google.lens.p4708k.C62600h;
import com.google.lens.p4708k.C62602j;
import com.google.lens.p4708k.C62604l;
import com.google.lens.p4708k.C62609q;
import com.google.lens.p4708k.C62610r;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p3723ar.imp.view.C47981aa;
import com.google.p3723ar.imp.view.C47982ab;
import com.google.p3723ar.imp.view.C47984ad;
import com.google.p3723ar.imp.view.C47985ae;
import com.google.p3723ar.imp.view.C47993i;
import com.google.p3723ar.imp.view.C48003m;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p3723ar.imp.view.C48005o;
import com.google.p3723ar.imp.view.C48008r;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.render.h */
/* compiled from: PG */
public final class C27666h implements C27661c {

    /* renamed from: h */
    private static final C58974d f75529h = C58974d.m91135i("ImpGleamRenderer");

    /* renamed from: a */
    public C48004n f75530a;

    /* renamed from: b */
    public C27671m f75531b;

    /* renamed from: c */
    public LensRenderer f75532c;

    /* renamed from: d */
    public C62602j f75533d;

    /* renamed from: e */
    public float f75534e = 0.0f;

    /* renamed from: f */
    public boolean f75535f;

    /* renamed from: g */
    public boolean f75536g = false;

    /* renamed from: i */
    private final C37215b f75537i;

    /* renamed from: j */
    private final C27251j f75538j;

    /* renamed from: k */
    private final C25459e f75539k;

    /* renamed from: l */
    private C48005o f75540l;

    /* renamed from: m */
    private boolean f75541m;

    /* renamed from: n */
    private final HashMap f75542n = new HashMap();

    /* renamed from: o */
    private C62598f f75543o = C62598f.f169003g;

    /* renamed from: p */
    private final Set f75544p = new HashSet();

    /* renamed from: q */
    private C27673o f75545q;

    /* renamed from: r */
    private final C27250i f75546r;

    /* renamed from: s */
    private final C21370a f75547s;

    /* renamed from: t */
    private final Executor f75548t;

    /* renamed from: u */
    private boolean f75549u = true;

    public C27666h(C37215b bVar, C21370a aVar, Executor executor, C27251j jVar, C25459e eVar) {
        this.f75537i = bVar;
        this.f75547s = aVar;
        this.f75548t = executor;
        this.f75538j = jVar;
        this.f75539k = eVar;
        this.f75546r = new C27665g(this, jVar);
    }

    /* renamed from: g */
    public static void m51479g(View view, boolean z) {
        if (view != null && view.getKeepScreenOn() != z) {
            view.setKeepScreenOn(z);
        }
    }

    /* renamed from: a */
    public final C27674p mo33154a(C25312at atVar) {
        return new C27674p(atVar, this.f75541m, this.f75544p);
    }

    /* renamed from: b */
    public final void mo33155b() {
        C62593a aVar = (C62593a) C62596d.f168994g.createBuilder();
        aVar.copyOnWrite();
        C62596d dVar = (C62596d) aVar.instance;
        dVar.f168996a |= 32;
        dVar.f169001f = true;
        mo33158e((C62596d) aVar.build());
    }

    /* renamed from: c */
    public final void mo33156c() {
        C27671m mVar = this.f75531b;
        if (mVar != null) {
            mVar.f75550a.clear();
        }
        m51479g(this.f75531b, false);
        C48004n nVar = this.f75530a;
        if (nVar != null) {
            nVar.mo53116b();
            this.f75530a = null;
        }
    }

    /* renamed from: d */
    public final void mo33157d(boolean z) {
        this.f75541m = z;
    }

    /* renamed from: e */
    public final boolean mo33158e(C62596d dVar) {
        C62596d dVar2;
        C62598f fVar;
        C62602j jVar;
        boolean z;
        C62604l lVar;
        C62604l lVar2;
        boolean z2 = false;
        if (this.f75549u) {
            dVar2 = dVar;
            if (dVar2.f168997b.isEmpty()) {
                return false;
            }
        } else {
            dVar2 = dVar;
        }
        boolean a = C27660b.m51465a(dVar);
        C27671m mVar = this.f75531b;
        if (mVar != null && a) {
            this.f75539k.mo30496b(mVar, 0.0f, 1.0f, 0.0f, 1.0f);
            float[] fArr = this.f75539k.mo30495a(this.f75531b).f69381c;
            C62451ca caVar = (C62451ca) C62452cb.f168638e.createBuilder();
            float f = fArr[0];
            caVar.copyOnWrite();
            C62452cb cbVar = (C62452cb) caVar.instance;
            cbVar.f168640a |= 1;
            cbVar.f168641b = f;
            float f2 = fArr[1];
            caVar.copyOnWrite();
            C62452cb cbVar2 = (C62452cb) caVar.instance;
            cbVar2.f168640a |= 2;
            cbVar2.f168642c = f2;
            float f3 = fArr[2];
            caVar.copyOnWrite();
            C62452cb cbVar3 = (C62452cb) caVar.instance;
            cbVar3.f168640a |= 4;
            cbVar3.f168643d = f3;
            C62452cb cbVar4 = (C62452cb) caVar.build();
            C62593a aVar = (C62593a) dVar.toBuilder();
            aVar.copyOnWrite();
            C62596d dVar3 = (C62596d) aVar.instance;
            cbVar4.getClass();
            dVar3.f168999d = cbVar4;
            dVar3.f168996a |= 4;
            dVar2 = (C62596d) aVar.build();
        }
        C62596d dVar4 = dVar2;
        m51479g(this.f75531b, a);
        LensRenderer lensRenderer = this.f75532c;
        if (lensRenderer == null || this.f75530a == null) {
            return false;
        }
        try {
            fVar = (C62598f) C62942bv.parseFrom((C62942bv) C62598f.f169003g, lensRenderer.nSetFrame(lensRenderer.f75522b, dVar4.toByteArray()), C62921ba.m95368a());
        } catch (C62974ct e) {
            ((C58970a) ((C58970a) ((C58970a) LensRenderer.f75521a.mo56225c()).mo56382g(e)).mo56372aa(49911)).mo56386p("Could not parse FrameResult bytes");
            fVar = C62598f.f169003g;
        }
        C62598f fVar2 = this.f75543o;
        Iterator it = C58557jl.m90124e(dVar4.f168997b, C27662d.f75524a).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i = ((C62610r) it.next()).f169043d;
            C62961ch chVar = fVar2.f169007c;
            Integer valueOf = Integer.valueOf(i);
            if (!chVar.contains(valueOf) && !fVar2.f169008d.contains(valueOf) && !fVar2.f169009e.contains(valueOf)) {
                this.f75537i.mo19974a(C37194a.f98450aM);
                break;
            }
        }
        C62598f fVar3 = this.f75543o;
        Iterator it2 = fVar.f169008d.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (!fVar3.f169008d.contains(Integer.valueOf(((Integer) it2.next()).intValue()))) {
                this.f75537i.mo19974a(C37194a.f98451aN);
                break;
            }
        }
        C58833ax axVar = C58836b.f156633a;
        Iterator it3 = fVar3.f169008d.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            int intValue = ((Integer) it3.next()).intValue();
            C62961ch chVar2 = fVar.f169008d;
            Integer valueOf2 = Integer.valueOf(intValue);
            if (!chVar2.contains(valueOf2)) {
                axVar = C58833ax.m90834k(valueOf2);
                if (this.f75542n.containsKey(valueOf2)) {
                    this.f75542n.remove(valueOf2);
                }
            }
        }
        C58833ax axVar2 = C58836b.f156633a;
        Iterator it4 = fVar.f169009e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            int intValue2 = ((Integer) it4.next()).intValue();
            C62961ch chVar3 = fVar3.f169009e;
            Integer valueOf3 = Integer.valueOf(intValue2);
            if (!chVar3.contains(valueOf3)) {
                axVar2 = C58833ax.m90834k(valueOf3);
                break;
            }
        }
        if (axVar2.mo56113h()) {
            this.f75537i.mo19974a(C37194a.f98452aO.mo40815i(C62722b.UNAVAILABLE));
        } else if (axVar.mo56113h()) {
            this.f75537i.mo19974a(C37194a.f98452aO.mo40815i(C62722b.OK));
        }
        this.f75544p.addAll(fVar.f169009e);
        this.f75543o = fVar;
        this.f75534e = fVar.f169006b;
        Iterator it5 = dVar4.f168997b.iterator();
        while (true) {
            if (!it5.hasNext()) {
                jVar = null;
                break;
            }
            C62610r rVar = (C62610r) it5.next();
            if (rVar.f169041b == 4) {
                lVar = (C62604l) rVar.f169042c;
            } else {
                lVar = C62604l.f169022d;
            }
            C62602j jVar2 = lVar.f169026c;
            if (jVar2 == null) {
                jVar2 = C62602j.f169017d;
            }
            if (!jVar2.f169020b.isEmpty()) {
                if (rVar.f169041b == 4) {
                    lVar2 = (C62604l) rVar.f169042c;
                } else {
                    lVar2 = C62604l.f169022d;
                }
                jVar = lVar2.f169026c;
                if (jVar == null) {
                    jVar = C62602j.f169017d;
                }
            }
        }
        if (this.f75535f != fVar.f169005a || !C58832aw.m90831a(this.f75533d, jVar)) {
            this.f75535f = fVar.f169005a;
            this.f75533d = jVar;
            if (!this.f75536g) {
                this.f75538j.mo32776a(this.f75546r);
                this.f75536g = true;
            }
            this.f75538j.mo32779d();
        }
        if (this.f75545q != null) {
            if (!this.f75541m) {
                Iterator it6 = C58557jl.m90124e(dVar4.f168997b, C27662d.f75524a).iterator();
                if (it6.hasNext()) {
                    C62610r rVar2 = (C62610r) it6.next();
                    boolean contains = fVar.f169007c.contains(Integer.valueOf(rVar2.f169043d));
                    C27673o oVar = this.f75545q;
                    if (!contains) {
                        oVar.mo33165d(oVar.f75553b);
                    } else {
                        if (oVar.f75553b.getParent() == null) {
                            oVar.mo33164c(oVar.f75553b);
                            C62609q qVar = rVar2.f169044e;
                            if (qVar == null) {
                                qVar = C62609q.f169033d;
                            }
                            C62445bv bvVar = qVar.f169036b;
                            if (bvVar == null) {
                                bvVar = C62445bv.f168618e;
                            }
                            oVar.f75553b.mo32801c(oVar.f75557f, C27245d.m50630b(bvVar.f168623d));
                        }
                        C27270x xVar = oVar.f75553b;
                        xVar.mo32800a(oVar.f75558g, C27673o.m51498b(rVar2, xVar));
                    }
                    if (oVar.f75554c.getParent() == null) {
                        if (contains) {
                            contains = true;
                        }
                    }
                    if (oVar.f75554c.getParent() == null) {
                        oVar.mo33166e();
                        oVar.mo33164c(oVar.f75554c);
                    }
                    if (oVar.f75560i && contains) {
                        oVar.mo33166e();
                    }
                    if (!oVar.f75560i && !contains) {
                        oVar.f75560i = true;
                        oVar.f75559h = oVar.mo33163a();
                        oVar.f75561j = C27212a.m50465a(oVar.f75556e.getAlpha());
                    }
                    C58485gu e2 = C24095c.m44760e(C27673o.m51498b(rVar2, oVar.f75554c).f168713b);
                    oVar.f75555d.reset();
                    int size = e2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        PointF d = C24094b.m44755d((PointF) e2.get(i2), (PointF) e2.get(((i2 + size) - 1) % size), 0.05f);
                        PointF d2 = C24094b.m44755d((PointF) e2.get(i2), (PointF) e2.get((i2 + 1) % size), 0.05f);
                        if (i2 == 0) {
                            oVar.f75555d.moveTo(d.x, d.y);
                            i2 = 0;
                        }
                        oVar.f75555d.cubicTo(d.x, d.y, ((PointF) e2.get(i2)).x, ((PointF) e2.get(i2)).y, d2.x, d2.y);
                        if (i2 != size) {
                            PointF d3 = C24094b.m44755d((PointF) e2.get(i2), (PointF) e2.get((i2 + 1) % size), 0.95f);
                            oVar.f75555d.lineTo(d3.x, d3.y);
                        }
                        i2++;
                    }
                    oVar.f75555d.close();
                    oVar.f75554c.invalidate();
                    if (oVar.f75560i && oVar.mo33163a() - oVar.f75559h >= 248) {
                        oVar.mo33165d(oVar.f75554c);
                    }
                }
            }
            C27673o oVar2 = this.f75545q;
            oVar2.mo33165d(oVar2.f75554c);
            oVar2.mo33165d(oVar2.f75553b);
        }
        C48004n nVar = this.f75530a;
        nVar.getClass();
        long nanoTime = System.nanoTime();
        C47981aa aaVar = nVar.f124239b;
        if (aaVar != null && aaVar.mo53089a(nanoTime) == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            for (C62610r rVar3 : dVar4.f168997b) {
                if (rVar3.f169041b == 4) {
                    C62971cq cqVar = ((C62604l) rVar3.f169042c).f169025b;
                    if (cqVar.isEmpty() || (((C62600h) cqVar.get(0)).f169014a & 2) == 0) {
                        break;
                    }
                    C62205ar arVar = ((C62600h) cqVar.get(0)).f169016c;
                    if (arVar == null) {
                        arVar = C62205ar.f167954c;
                    }
                    if ((arVar.f167956a & 1) == 0) {
                        break;
                    }
                    int i3 = rVar3.f169043d;
                    C62205ar arVar2 = ((C62600h) cqVar.get(0)).f169016c;
                    if (arVar2 == null) {
                        arVar2 = C62205ar.f167954c;
                    }
                    String str = arVar2.f167957b;
                    HashMap hashMap = this.f75542n;
                    Integer valueOf4 = Integer.valueOf(i3);
                    Integer num = (Integer) hashMap.get(valueOf4);
                    if (num != null) {
                        int intValue3 = num.intValue();
                        HashMap hashMap2 = this.f75542n;
                        Integer valueOf5 = Integer.valueOf(intValue3 + 1);
                        hashMap2.put(valueOf4, valueOf5);
                        if (num.intValue() % 10 == 0) {
                            ((C58970a) ((C58970a) f75529h.mo56224b()).mo56372aa(49910)).mo56359L("gleam id: %d, frame: %d, url: %s", valueOf4, valueOf5, str);
                        }
                    } else {
                        this.f75542n.put(valueOf4, 0);
                        ((C58970a) ((C58970a) f75529h.mo56224b()).mo56372aa(49909)).mo56395y("new living scene; gleam id: %d, url: %s", i3, str);
                    }
                }
            }
        }
        if (z && fVar.f169010f) {
            z2 = true;
        }
        this.f75549u = z2;
        return z;
    }

    /* renamed from: f */
    public final void mo33159f(ViewGroup viewGroup, Context context, C27670l lVar) {
        if (this.f75531b == null) {
            C27671m mVar = new C27671m(context);
            this.f75531b = mVar;
            if (this.f75540l == null) {
                this.f75540l = mVar;
            }
        }
        this.f75531b.mo33160a(lVar);
        this.f75531b.mo33160a(new C27663e(this));
        C27671m mVar2 = this.f75531b;
        if (mVar2 != null) {
            mVar2.setAlpha(this.f75534e);
            viewGroup.addView(this.f75531b, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f75545q = new C27673o(context, this.f75547s, viewGroup);
        C48005o oVar = this.f75540l;
        if (oVar != null && this.f75531b != null) {
            C47982ab abVar = (C47982ab) C47985ae.f124188h.createBuilder();
            abVar.copyOnWrite();
            C47985ae aeVar = (C47985ae) abVar.instance;
            aeVar.f124190a |= 8;
            aeVar.f124194e = "lens";
            abVar.copyOnWrite();
            C47985ae aeVar2 = (C47985ae) abVar.instance;
            aeVar2.f124190a |= 2;
            aeVar2.f124192c = false;
            abVar.copyOnWrite();
            C47985ae aeVar3 = (C47985ae) abVar.instance;
            int i = 1;
            aeVar3.f124190a |= 1;
            aeVar3.f124191b = "agsa_renderer_jni";
            C47985ae aeVar4 = (C47985ae) abVar.build();
            Executor executor = this.f75548t;
            C27664f fVar = new C27664f(this);
            C48008r rVar = (C48008r) oVar;
            Context context2 = rVar.f124243b;
            C48004n nVar = new C48004n();
            C60870cx f = C48004n.m85168f(aeVar4, context2, executor);
            int a = C47984ad.m85154a(aeVar4.f124196g);
            if (a != 0) {
                i = a;
            }
            C47993i iVar = new C47993i(i);
            C60856cj.m92911t(f, new C48003m(aeVar4, nVar, iVar, (View) oVar, fVar), iVar.mo53095a());
            rVar.f124244c = nVar;
        }
    }
}
