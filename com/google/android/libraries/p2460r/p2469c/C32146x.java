package com.google.android.libraries.p2460r.p2469c;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.staticplugins.nowcards.p8116f.C104898x;
import com.google.android.libraries.p2460r.p2461a.p2462a.p2463a.C32049a;
import com.google.android.libraries.p2460r.p2464b.p2466b.C32054a;
import com.google.android.libraries.p2460r.p2469c.p2470a.C32058a;
import com.google.android.libraries.p2460r.p2469c.p2470a.C32062e;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57357ai;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57361am;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57362an;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57369au;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57394bs;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57408cf;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57418cp;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57438di;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57444do;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57474er;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57501i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.libraries.r.c.x */
/* compiled from: PG */
public final class C32146x implements C32145w {

    /* renamed from: a */
    public final Set f86325a;

    /* renamed from: b */
    public final Set f86326b = new HashSet();

    /* renamed from: c */
    public LinearLayout f86327c = null;

    /* renamed from: d */
    public C32148z f86328d = null;

    /* renamed from: e */
    private final Context f86329e;

    /* renamed from: f */
    private final C32127e f86330f;

    /* renamed from: g */
    private final C32058a f86331g;

    /* renamed from: h */
    private final C32062e f86332h;

    /* renamed from: i */
    private final C32049a f86333i;

    public C32146x(Context context, C32127e eVar, C32058a aVar, C32062e eVar2, C32049a aVar2) {
        this.f86329e = context;
        this.f86330f = eVar;
        this.f86331g = aVar;
        this.f86332h = eVar2;
        this.f86333i = aVar2;
        this.f86325a = new HashSet();
    }

    /* renamed from: e */
    private final void m59911e(ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams;
        if (this.f86327c == null) {
            LinearLayout linearLayout = new LinearLayout(this.f86329e);
            linearLayout.setOrientation(1);
            if (viewGroup == null || viewGroup.getLayoutParams() == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            } else {
                layoutParams = new LinearLayout.LayoutParams(viewGroup.getLayoutParams());
                layoutParams.width = -1;
                layoutParams.height = -2;
            }
            linearLayout.setLayoutParams(layoutParams);
            this.f86327c = linearLayout;
        }
    }

    /* renamed from: a */
    public final LinearLayout mo37954a() {
        m59911e((ViewGroup) this.f86330f.f86273b.mo37837a());
        LinearLayout linearLayout = this.f86327c;
        linearLayout.getClass();
        return linearLayout;
    }

    /* renamed from: b */
    public final void mo37955b() {
        LinearLayout linearLayout;
        C32148z zVar = this.f86328d;
        if (zVar != null && (linearLayout = this.f86327c) != null) {
            C57501i iVar = zVar.f86340g.f153425g;
            if (iVar == null) {
                iVar = C57501i.f153593f;
            }
            C32124bl.m59847f(linearLayout, iVar, zVar.f86338e, zVar.f86340g, this.f86326b);
            for (C32138p pVar : this.f86325a) {
                C32124bl.m59847f(pVar.mo37939e(), pVar.f86306j, zVar.f86338e, zVar.f86340g, pVar.f86307k);
            }
        }
    }

    /* renamed from: c */
    public final void mo37956c() {
        mo37955b();
        LinearLayout linearLayout = this.f86327c;
        linearLayout.getClass();
        C104898x xVar = this.f86330f.f86274c.f86119c;
        C32148z zVar = this.f86328d;
        if (zVar != null) {
            C57438di diVar = zVar.f86340g;
            if (!(xVar == null || diVar == null || (diVar.f153419a & 64) == 0)) {
                C57418cp cpVar = diVar.f153426h;
                if (cpVar == null) {
                    cpVar = C57418cp.f153391a;
                }
                xVar.mo94387b(cpVar);
            }
        }
        for (C32138p b : this.f86325a) {
            this.f86330f.f86275d.mo37950b(b);
        }
        this.f86325a.clear();
        linearLayout.removeAllViews();
        this.f86328d = null;
    }

    /* renamed from: d */
    public final void mo37957d(C57438di diVar, int i, List list) {
        C32079aj ajVar;
        List<C32138p> list2;
        C57369au auVar;
        C57394bs bsVar;
        C57438di diVar2 = diVar;
        long nanoTime = System.nanoTime();
        m59911e((ViewGroup) this.f86330f.f86273b.mo37837a());
        LinearLayout linearLayout = this.f86327c;
        linearLayout.getClass();
        C32090au auVar2 = (C32090au) this.f86330f.f86278g.f86164a.get(new C32089at(list, new C32078ai(i, this.f86330f.f86274c.f86117a, this.f86329e)));
        auVar2.getClass();
        C32049a aVar = this.f86333i;
        C32136n nVar = new C32136n();
        C32058a aVar2 = this.f86331g;
        C32072ac acVar = this.f86330f.f86274c;
        if ((diVar2.f153419a & 8) != 0) {
            C57444do doVar = diVar2.f153421c;
            if (doVar == null) {
                doVar = C57444do.f153440c;
            }
            ajVar = auVar2.mo37869a(doVar, nVar);
        } else {
            ajVar = null;
        }
        if (ajVar == null) {
            ajVar = new C32079aj("Style", C57404cb.ERR_DUPLICATE_STYLE);
        }
        long j = nanoTime;
        C32148z zVar = r2;
        C32148z zVar2 = new C32148z(diVar, ajVar, list, auVar2, aVar, nVar, aVar2, acVar, linearLayout);
        this.f86328d = zVar;
        this.f86326b.clear();
        Set set = this.f86326b;
        C57501i iVar = diVar2.f153425g;
        if (iVar == null) {
            iVar = C57501i.f153593f;
        }
        set.addAll(iVar.f153599e);
        LinearLayout linearLayout2 = this.f86327c;
        linearLayout2.getClass();
        int i2 = 5;
        try {
            for (C57362an anVar : diVar2.f153424f) {
                int i3 = anVar.f153243a;
                int b = C57361am.m88331b(i3);
                int i4 = b - 1;
                if (b != 0) {
                    if (i4 == 0) {
                        if (i3 == 1) {
                            auVar = (C57369au) anVar.f153244b;
                        } else {
                            auVar = C57369au.f153254l;
                        }
                        C32138p a = this.f86330f.f86275d.mo37949a(auVar, zVar);
                        a.mo37941g(a.mo37852v(auVar), auVar, zVar);
                        list2 = Collections.singletonList(a);
                    } else if (i4 != 2) {
                        C32054a.m59731b(i2, "FrameAdapter", (Throwable) null, zVar.mo37967i(1, C57404cb.ERR_MISSING_OR_UNHANDLED_CONTENT, String.format("Unsupported Content type for frame: %s", new Object[]{C57361am.m88330a(C57361am.m88331b(anVar.f153243a))})), new Object[0]);
                        list2 = Collections.emptyList();
                    } else {
                        if (i3 == 3) {
                            bsVar = (C57394bs) anVar.f153244b;
                        } else {
                            bsVar = C57394bs.f153311c;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (C57357ai azVar : bsVar.f153314b) {
                            arrayList.add(this.f86330f.f86276e.mo37918a(new C32095az(bsVar.f153313a, zVar, azVar), zVar));
                        }
                        arrayList.trimToSize();
                        list2 = Collections.unmodifiableList(arrayList);
                    }
                    for (C32138p pVar : list2) {
                        this.f86325a.add(pVar);
                        int i5 = pVar.f86308l;
                        if (i5 == -3) {
                            i5 = -1;
                        }
                        int i6 = pVar.f86309m;
                        if (i6 == -3) {
                            i6 = -2;
                        }
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i5, i6);
                        pVar.mo37940f().mo37878h(this.f86329e, layoutParams);
                        layoutParams.gravity = pVar.mo37938d(8388659);
                        pVar.mo37944j(layoutParams);
                        linearLayout2.addView(pVar.mo37939e());
                    }
                    i2 = 5;
                } else {
                    throw null;
                }
            }
            C57474er erVar = diVar2.f153422d;
            if (erVar == null) {
                erVar = C57474er.f153542d;
            }
            C32094ay b2 = zVar.mo37960b(erVar);
            C57408cf cfVar = b2.f86174b.f153525i;
            if (cfVar == null) {
                cfVar = C57408cf.f153369c;
            }
            linearLayout2.setBackground(b2.mo37874e(cfVar));
        } catch (RuntimeException e) {
            C32054a.m59731b(6, "FrameAdapter", e, "Catch top level exception", new Object[0]);
            String message = e.getMessage() != null ? e.getMessage() : "Top Level Exception was caught - see logcat";
            if (e instanceof C32083an) {
                zVar.mo37967i(1, ((C32083an) e).f86137a, message);
            } else {
                zVar.mo37968j(message);
            }
        }
        long nanoTime2 = System.nanoTime() - j;
        if (nanoTime2 / 1000000 > 30) {
            C32054a.m59731b(5, "FrameAdapter", (Throwable) null, zVar.mo37967i(2, C57404cb.ERR_POOR_FRAME_RATE, String.format("Slow Bind (%s) time: %s ps", new Object[]{diVar2.f153420b, Long.valueOf(nanoTime2 / 1000)})), new Object[0]);
        }
        boolean z = zVar.f86336c.f86108b;
        C32062e eVar = this.f86332h;
        C32136n nVar2 = zVar.f86337d;
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < nVar2.f86295a.size(); i7++) {
            for (C32135m mVar : (List) nVar2.f86295a.valueAt(i7)) {
                arrayList2.add(mVar.f86293a);
            }
        }
        arrayList2.trimToSize();
        eVar.mo37848a(Collections.unmodifiableList(arrayList2));
        C104898x xVar = this.f86330f.f86274c.f86119c;
        C57438di diVar3 = zVar.f86340g;
        if (xVar != null && diVar3 != null && (diVar3.f153419a & 64) != 0) {
            C57418cp cpVar = diVar3.f153426h;
            if (cpVar == null) {
                cpVar = C57418cp.f153391a;
            }
            xVar.mo94386a(cpVar, linearLayout2);
        }
    }
}
