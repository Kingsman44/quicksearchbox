package com.google.android.libraries.lens.view.p2087ay;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Size;
import com.google.android.libraries.lens.p2014e.p2015a.C24194m;
import com.google.android.libraries.lens.p2014e.p2015a.C24195n;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.gleam.C26504ci;
import com.google.android.libraries.lens.view.p2069am.C25332h;
import com.google.android.libraries.lens.view.p2069am.C25333i;
import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.android.libraries.lens.view.p2078at.C25496ab;
import com.google.android.libraries.lens.view.p2078at.C25497ac;
import com.google.android.libraries.lens.view.p2078at.C25533p;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26752d;
import com.google.android.libraries.lens.view.p2177w.C28185a;
import com.google.android.libraries.lens.view.vision.C28179u;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58839bc;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60897dk;
import com.google.common.util.concurrent.C60899dm;
import com.google.lens.p4707j.C62440bq;
import com.google.lens.p4707j.C62441br;
import com.google.lens.p4707j.C62444bu;
import com.google.lens.p4707j.C62445bv;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56219a;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56327y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.lens.view.ay.ag */
/* compiled from: PG */
public final class C25624ag implements C25496ab {

    /* renamed from: a */
    static final C58839bc f69697a = C25622ae.f69695a;

    /* renamed from: b */
    static final C58839bc f69698b = C25623af.f69696a;

    /* renamed from: m */
    public static final /* synthetic */ int f69699m = 0;

    /* renamed from: c */
    public final C26752d f69700c;

    /* renamed from: d */
    public final C21370a f69701d;

    /* renamed from: e */
    public final C25989d f69702e;

    /* renamed from: f */
    public final C25664y f69703f;

    /* renamed from: g */
    public final AtomicBoolean f69704g = new AtomicBoolean(false);

    /* renamed from: h */
    public long f69705h = 0;

    /* renamed from: i */
    public boolean f69706i = false;

    /* renamed from: j */
    public C25621ad f69707j;

    /* renamed from: k */
    public C58485gu f69708k;

    /* renamed from: l */
    public C58485gu f69709l;

    /* renamed from: n */
    private final Random f69710n;

    /* renamed from: o */
    private final boolean f69711o;

    /* renamed from: p */
    private final AtomicBoolean f69712p = new AtomicBoolean(false);

    /* renamed from: q */
    private C25497ac f69713q = C25497ac.NONE;

    /* renamed from: r */
    private C60899dm f69714r;

    static {
        C58974d.m91135i("ThinkingGleamCtrl");
    }

    public C25624ag(C26752d dVar, C21370a aVar, C25989d dVar2, C25664y yVar, Random random, boolean z) {
        this.f69703f = yVar;
        this.f69710n = random;
        this.f69701d = aVar;
        this.f69702e = dVar2;
        this.f69700c = dVar;
        this.f69711o = z;
        this.f69707j = C25621ad.m47261d(new Size(0, 0));
    }

    /* renamed from: e */
    static C58485gu m47267e(int i, Rect rect) {
        int i2 = rect.right - rect.left;
        int i3 = rect.bottom - rect.top;
        double d = (double) i2;
        double d2 = (double) i;
        Double.isNaN(d);
        Double.isNaN(d2);
        int floor = (int) Math.floor(d / d2);
        C58480gp e = C58485gu.m89837e();
        int i4 = i3;
        while (i4 > 0) {
            int i5 = (i3 - i4) + rect.top;
            int i6 = floor + floor;
            int i7 = i4 >= i6 ? floor : i4;
            i4 -= i7;
            int i8 = i2;
            while (i8 > 0) {
                int i9 = (i2 - i8) + rect.left;
                int i10 = i8 >= i6 ? floor : i8;
                i8 -= i10;
                C24194m mVar = (C24194m) C24195n.f66127f.createBuilder();
                mVar.copyOnWrite();
                ((C24195n) mVar.instance).f66129a = (float) i9;
                mVar.copyOnWrite();
                ((C24195n) mVar.instance).f66130b = (float) i5;
                mVar.copyOnWrite();
                ((C24195n) mVar.instance).f66131c = (float) ((i9 + i10) - 1);
                mVar.copyOnWrite();
                ((C24195n) mVar.instance).f66132d = (float) ((i5 + i7) - 1);
                mVar.copyOnWrite();
                ((C24195n) mVar.instance).f66133e = 0.0f;
                e.mo55395g((C24195n) mVar.build());
            }
        }
        return e.mo55394f();
    }

    /* renamed from: l */
    private final boolean m47268l() {
        if (this.f69713q.mo30525b()) {
            return true;
        }
        if (!this.f69713q.mo30526c() || !this.f69711o || this.f69702e.f70642a.f70649b == C25980d.AUTO_FILTER) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo30735f(C25621ad adVar) {
        if (!adVar.mo30733b().isEmpty()) {
            if (adVar.mo30734c() != 2 || adVar.mo30732a().isEmpty()) {
                this.f69708k = m47267e(4, adVar.mo30733b());
                return;
            }
            this.f69708k = m47267e(2, adVar.mo30733b());
            this.f69709l = m47267e(4, adVar.mo30732a());
        }
    }

    /* renamed from: g */
    public final void mo30736g() {
        this.f69703f.mo30775i(f69698b);
    }

    /* renamed from: h */
    public final void mo30737h() {
        if (!this.f69712p.get() && m47268l()) {
            if (this.f69709l == null) {
                this.f69714r = C60899dm.m93001b(10.0d, new C60897dk());
            } else {
                this.f69714r = C60899dm.m93001b(40.0d, new C60897dk());
            }
            this.f69712p.set(true);
            this.f69704g.set(false);
            mo30739j();
        }
    }

    /* renamed from: i */
    public final void mo30738i() {
        this.f69712p.set(false);
    }

    /* renamed from: j */
    public final void mo30739j() {
        C58485gu guVar;
        if (this.f69708k != null && this.f69704g.get()) {
            this.f69703f.mo30775i(f69697a);
            if (this.f69712p.get() && !mo30740k()) {
                if (this.f69705h <= 0 || this.f69701d.mo26871c() - this.f69705h >= 1000) {
                    this.f69705h = 0;
                    C58480gp e = C58485gu.m89837e();
                    C58485gu f = this.f69703f.mo30772f();
                    int size = f.size();
                    for (int i = 0; i < size; i++) {
                        C26504ci ciVar = (C26504ci) f.get(i);
                        if (ciVar.mo31760d() == C25349y.THINKING_GLEAM) {
                            C28179u uVar = ciVar.f72215i;
                            e.mo55395g(new PointF(uVar.mo33662f(), uVar.mo33663g()));
                        }
                    }
                    C58485gu f2 = e.mo55394f();
                    Size size2 = this.f69700c.f72881b.f72878a;
                    C58485gu guVar2 = this.f69708k;
                    guVar2.getClass();
                    ArrayList arrayList = new ArrayList(guVar2);
                    C58485gu guVar3 = this.f69709l;
                    if (guVar3 != null) {
                        arrayList.addAll(guVar3);
                    }
                    Collections.shuffle(arrayList, this.f69710n);
                    int size3 = arrayList.size();
                    int i2 = 0;
                    while (i2 < size3) {
                        C24195n nVar = (C24195n) arrayList.get(i2);
                        C58485gu guVar4 = this.f69708k;
                        guVar4.getClass();
                        if (guVar4.contains(nVar)) {
                            C25332h hVar = (C25332h) C25333i.f68945c.createBuilder();
                            int width = size2.getWidth();
                            hVar.copyOnWrite();
                            ((C25333i) hVar.instance).f68947a = width;
                            int height = size2.getHeight();
                            hVar.copyOnWrite();
                            ((C25333i) hVar.instance).f68948b = height;
                            C25333i iVar = (C25333i) hVar.build();
                            int i3 = ((C58724pq) f2).f156474d;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= i3) {
                                    break;
                                }
                                int i5 = i4 + 1;
                                if (C28185a.m52697o(nVar, (PointF) f2.get(i4), iVar)) {
                                    guVar = f2;
                                    break;
                                }
                                i4 = i5;
                            }
                        }
                        C60899dm dmVar = this.f69714r;
                        if (dmVar != null && dmVar.mo57395c()) {
                            float f3 = nVar.f66131c - nVar.f66129a;
                            float f4 = nVar.f66132d - nVar.f66130b;
                            PointF pointF = new PointF((this.f69710n.nextFloat() * f3) + nVar.f66129a, (this.f69710n.nextFloat() * f4) + nVar.f66130b);
                            C25664y yVar = this.f69703f;
                            C56219a aVar = (C56219a) C56327y.f150136i.createBuilder();
                            C62444bu buVar = (C62444bu) C62445bv.f168618e.createBuilder();
                            C62440bq bqVar = (C62440bq) C62441br.f168608h.createBuilder();
                            float f5 = pointF.x;
                            int width2 = size2.getWidth();
                            bqVar.copyOnWrite();
                            C62441br brVar = (C62441br) bqVar.instance;
                            guVar = f2;
                            brVar.f168610a |= 1;
                            brVar.f168611b = f5 / ((float) width2);
                            float f6 = pointF.y;
                            int height2 = size2.getHeight();
                            bqVar.copyOnWrite();
                            C62441br brVar2 = (C62441br) bqVar.instance;
                            brVar2.f168610a |= 2;
                            brVar2.f168612c = f6 / ((float) height2);
                            int width3 = size2.getWidth();
                            bqVar.copyOnWrite();
                            C62441br brVar3 = (C62441br) bqVar.instance;
                            brVar3.f168610a |= 4;
                            brVar3.f168613d = f3 / ((float) width3);
                            int height3 = size2.getHeight();
                            bqVar.copyOnWrite();
                            C62441br brVar4 = (C62441br) bqVar.instance;
                            brVar4.f168610a |= 8;
                            brVar4.f168614e = f4 / ((float) height3);
                            bqVar.copyOnWrite();
                            C62441br brVar5 = (C62441br) bqVar.instance;
                            brVar5.f168610a |= 16;
                            brVar5.f168615f = 0.0f;
                            buVar.copyOnWrite();
                            C62445bv bvVar = (C62445bv) buVar.instance;
                            C62441br brVar6 = (C62441br) bqVar.build();
                            brVar6.getClass();
                            bvVar.f168621b = brVar6;
                            bvVar.f168620a |= 1;
                            aVar.copyOnWrite();
                            C56327y yVar2 = (C56327y) aVar.instance;
                            C62445bv bvVar2 = (C62445bv) buVar.build();
                            bvVar2.getClass();
                            yVar2.f150140c = bvVar2;
                            yVar2.f150139b = 7;
                            C56327y yVar3 = (C56327y) aVar.build();
                            if (yVar.f69788d.mo56113h()) {
                                ((C58970a) ((C58970a) C25664y.f69785a.mo56226d()).mo56372aa(50224)).mo56386p("startTrackingOnLatestFrame called while frozen");
                            } else {
                                C58833ax b = yVar.f69798n.mo30742b(yVar3);
                                if (b.mo56113h()) {
                                    synchronized (yVar.f69790f) {
                                        yVar.f69791g.add((C26504ci) b.mo56107c());
                                    }
                                } else {
                                    continue;
                                }
                            }
                            i2++;
                            f2 = guVar;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public final boolean mo30740k() {
        C58485gu f = this.f69703f.mo30772f();
        int size = f.size();
        for (int i = 0; i < size; i++) {
            C26504ci ciVar = (C26504ci) f.get(i);
            C25349y d = ciVar.mo31760d();
            if (d != C25349y.THINKING_GLEAM && (d != C25349y.PRE_GLEAM || ciVar.mo31758b() <= 2000)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: kW */
    public final /* synthetic */ void mo30520kW(C25533p pVar) {
    }

    /* renamed from: kX */
    public final /* synthetic */ void mo30521kX(boolean z) {
    }

    /* renamed from: kY */
    public final void mo30522kY(C25497ac acVar, C25497ac acVar2, C25533p pVar) {
        this.f69713q = acVar2;
        if (!acVar2.mo30526c() || !m47268l()) {
            mo30738i();
            mo30736g();
            return;
        }
        mo30737h();
    }

    /* renamed from: kZ */
    public final /* synthetic */ void mo30523kZ() {
    }
}
