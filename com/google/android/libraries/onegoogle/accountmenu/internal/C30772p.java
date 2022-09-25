package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.content.Context;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.RecyclerView;
import android.view.ViewGroup;
import androidx.lifecycle.C2333ah;
import com.google.android.libraries.onegoogle.account.disc.C30213m;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.accountmanagement.C30282k;
import com.google.android.libraries.onegoogle.accountmanagement.p2350b.C30258c;
import com.google.android.libraries.onegoogle.accountmanagement.p2350b.C30261f;
import com.google.android.libraries.onegoogle.accountmanagement.p2350b.C30262g;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.features.p2364e.C30545a;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30464e;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30465f;
import com.google.android.libraries.onegoogle.accountmenu.p2376g.C30643a;
import com.google.android.libraries.onegoogle.p2380c.C30860b;
import com.google.android.libraries.onegoogle.p2380c.C30898c;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.p */
/* compiled from: PG */
public final class C30772p extends C0640fb {

    /* renamed from: a */
    public final C58833ax f83045a;

    /* renamed from: b */
    public final C30778v f83046b;

    /* renamed from: c */
    public final List f83047c = new ArrayList();

    /* renamed from: d */
    public final List f83048d = new ArrayList();

    /* renamed from: e */
    public final C30898c f83049e;

    /* renamed from: f */
    public final C63644b f83050f;

    /* renamed from: g */
    public final C58833ax f83051g;

    /* renamed from: h */
    private final Context f83052h;

    /* renamed from: i */
    private final C30213m f83053i;

    /* renamed from: j */
    private final C30158c f83054j;

    /* renamed from: k */
    private final C30306o f83055k;

    /* renamed from: l */
    private final C30897z f83056l;

    /* renamed from: m */
    private final C58485gu f83057m;

    /* renamed from: n */
    private final C58485gu f83058n;

    /* renamed from: o */
    private final boolean f83059o;

    /* renamed from: p */
    private final HashMap f83060p = new HashMap();

    /* renamed from: q */
    private final C30643a f83061q;

    /* renamed from: r */
    private final C30262g f83062r;

    /* renamed from: s */
    private RecyclerView f83063s;

    /* renamed from: t */
    private final C30282k f83064t = new C30762f(this);

    /* renamed from: u */
    private final C30545a f83065u;

    public C30772p(Context context, C30305n nVar, List list, List list2, C30261f fVar, C30778v vVar, C63644b bVar) {
        C30778v vVar2 = vVar;
        context.getClass();
        this.f83052h = context;
        C30213m c = nVar.mo35853c();
        c.getClass();
        this.f83053i = c;
        C30158c b = nVar.mo35852b();
        b.getClass();
        this.f83054j = b;
        C30306o i = nVar.mo35858i();
        i.getClass();
        this.f83055k = i;
        C58833ax q = nVar.mo35866q();
        q.getClass();
        this.f83045a = q;
        C30897z o = nVar.mo35864o();
        this.f83056l = o;
        C30860b m = nVar.mo35862m();
        m.getClass();
        this.f83049e = m;
        nVar.mo35867r().getClass();
        this.f83051g = nVar.mo35860k().mo36179l();
        this.f83059o = nVar.mo35859j().mo36092d();
        this.f83046b = vVar2;
        bVar.getClass();
        this.f83050f = bVar;
        boolean z = true;
        this.f83057m = m57469e(list, 1);
        this.f83058n = m57469e(list2, 2);
        this.f83061q = new C30643a(context);
        C30545a aVar = (C30545a) nVar.mo35860k().mo36181n().mo56111f();
        this.f83065u = aVar;
        this.f83062r = new C30262g(i, m, bVar, o, fVar, new C30760d(this, vVar2, context));
        C58838bb.m90868c(q.mo56113h() != (aVar != null) ? false : z);
    }

    /* renamed from: c */
    public static boolean m57467c(C30769m mVar) {
        C30465f b = mVar.mo36464b();
        return b == null || b.f82286b;
    }

    /* renamed from: d */
    private static int m57468d(List list) {
        int i = 0;
        while (i < list.size() && ((C30769m) list.get(i)).mo36463a() == 0) {
            i++;
        }
        return i;
    }

    /* renamed from: e */
    private static C58485gu m57469e(List list, int i) {
        C58480gp gpVar = new C58480gp(4);
        if (list.isEmpty()) {
            return gpVar.mo55394f();
        }
        C58801sm G = ((C58485gu) list).listIterator(0);
        while (G.hasNext()) {
            gpVar.mo55395g(new C30770n((C30464e) G.next(), i));
        }
        return gpVar.mo55394f();
    }

    /* renamed from: f */
    private final void m57470f(C30769m mVar) {
        C30465f b = mVar.mo36464b();
        if (b != null) {
            b.mo36076b();
            C2333ah ahVar = (C2333ah) this.f83060p.remove(mVar);
            if (ahVar != null) {
                b.f82285a.mo5679j(ahVar);
            }
        }
    }

    /* renamed from: g */
    private final void m57471g(C30769m mVar) {
        C30465f b = mVar.mo36464b();
        if (b != null) {
            C30702a aVar = new C30702a(this, mVar);
            this.f83060p.put(mVar, aVar);
            b.f82285a.mo5705f(aVar);
        }
    }

    /* renamed from: h */
    private static final void m57472h(C30769m mVar) {
        C30465f b = mVar.mo36464b();
        if (b != null) {
            b.mo36075a();
        }
    }

    /* renamed from: a */
    public final void mo36465a(Runnable runnable) {
        if (C19559g.m37305d(Thread.currentThread())) {
            runnable.run();
            return;
        }
        RecyclerView recyclerView = this.f83063s;
        if (recyclerView != null) {
            recyclerView.post(runnable);
        }
    }

    /* renamed from: b */
    public final void mo36466b(C58485gu guVar) {
        List list = this.f83047c;
        List<C30769m> subList = list.subList(0, m57468d(list));
        for (C30769m f : subList) {
            m57470f(f);
        }
        subList.clear();
        ArrayList<C30768l> arrayList = new ArrayList<>(guVar.size());
        for (Object lVar : guVar) {
            arrayList.add(new C30768l(lVar, this.f83055k, this));
        }
        this.f83047c.addAll(0, arrayList);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (C30768l lVar2 : arrayList) {
            m57472h(lVar2);
            if (m57467c(lVar2)) {
                arrayList2.add(lVar2);
            }
        }
        int size = arrayList2.size();
        int d = m57468d(this.f83048d);
        this.f83048d.subList(0, d).clear();
        this.f83048d.addAll(0, arrayList2);
        int i = d - size;
        if (i > 0) {
            this.mObservable.mo2883e(0, i);
        }
        int i2 = size - d;
        if (i2 > 0) {
            this.mObservable.mo2882d(0, i2);
        }
        int min = Math.min(size, d);
        if (min > 0) {
            this.mObservable.mo2881c(Math.max(i2, 0), min, (Object) null);
        }
        for (C30768l g : arrayList) {
            m57471g(g);
        }
    }

    public final int getItemCount() {
        return this.f83048d.size();
    }

    public final int getItemViewType(int i) {
        return ((C30769m) this.f83048d.get(i)).mo36463a();
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f83063s = recyclerView;
        C30306o oVar = this.f83055k;
        oVar.f81934a.f81880a.add(this.f83064t);
        if (this.f83045a.mo56113h()) {
            this.f83047c.add(new C30771o());
        }
        this.f83047c.addAll(this.f83057m);
        this.f83047c.addAll(this.f83058n);
        for (C30769m mVar : this.f83047c) {
            m57472h(mVar);
            if (m57467c(mVar)) {
                this.f83048d.add(mVar);
            }
            m57471g(mVar);
        }
        mo36466b(C58485gu.m89842j(this.f83055k.f81934a.mo35794b()));
    }

    public final void onBindViewHolder(C0673gh ghVar, int i) {
        if (ghVar instanceof C30258c) {
            this.f83062r.mo35772a((C30258c) ghVar, ((C30768l) this.f83048d.get(i)).f83041a);
        } else if (ghVar instanceof C30704ab) {
            ((C30704ab) ghVar).mo36401b(((C30770n) this.f83048d.get(i)).f83043a);
        }
    }

    public final C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C30258c(viewGroup, viewGroup.getContext(), this.f83054j, this.f83053i, this.f83051g, this.f83059o, C58836b.f156633a, 0, this.f83056l, new C30763g());
        } else if (i == 3) {
            return new C30728az(this.f83052h, viewGroup, this.f83061q, new C30729b(this));
        } else {
            return new C30704ab(this.f83052h, viewGroup, this.f83046b, this.f83061q, this.f83056l);
        }
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C30306o oVar = this.f83055k;
        oVar.f81934a.f81880a.remove(this.f83064t);
        this.f83063s = null;
        for (C30769m f : this.f83047c) {
            m57470f(f);
        }
        this.f83048d.clear();
        this.f83047c.clear();
    }

    public final void onViewRecycled(C0673gh ghVar) {
        if (ghVar instanceof C30258c) {
            ((C30258c) ghVar).mo35768a();
        }
    }
}
