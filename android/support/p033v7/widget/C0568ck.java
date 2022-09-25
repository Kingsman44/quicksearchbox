package android.support.p033v7.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.p098j.C2043bi;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.ck */
/* compiled from: PG */
public class C0568ck extends C0707ho {

    /* renamed from: n */
    private static TimeInterpolator f2199n;

    /* renamed from: a */
    final ArrayList f2200a = new ArrayList();

    /* renamed from: b */
    final ArrayList f2201b = new ArrayList();

    /* renamed from: c */
    final ArrayList f2202c = new ArrayList();

    /* renamed from: d */
    final ArrayList f2203d = new ArrayList();

    /* renamed from: e */
    final ArrayList f2204e = new ArrayList();

    /* renamed from: f */
    final ArrayList f2205f = new ArrayList();

    /* renamed from: g */
    final ArrayList f2206g = new ArrayList();

    /* renamed from: o */
    private final ArrayList f2207o = new ArrayList();

    /* renamed from: p */
    private final ArrayList f2208p = new ArrayList();

    /* renamed from: q */
    private final ArrayList f2209q = new ArrayList();

    /* renamed from: r */
    private final ArrayList f2210r = new ArrayList();

    /* renamed from: A */
    private final boolean m2095A(C0566ci ciVar, C0673gh ghVar) {
        if (ciVar.f2189b == ghVar) {
            ciVar.f2189b = null;
        } else if (ciVar.f2188a != ghVar) {
            return false;
        } else {
            ciVar.f2188a = null;
        }
        ghVar.itemView.setAlpha(1.0f);
        ghVar.itemView.setTranslationX(0.0f);
        ghVar.itemView.setTranslationY(0.0f);
        mo2889m(ghVar);
        return true;
    }

    /* renamed from: l */
    static final void m2096l(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C0673gh) list.get(size)).itemView.animate().cancel();
            } else {
                return;
            }
        }
    }

    /* renamed from: x */
    private final void m2097x(List list, C0673gh ghVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C0566ci ciVar = (C0566ci) list.get(size);
                if (m2095A(ciVar, ghVar) && ciVar.f2188a == null && ciVar.f2189b == null) {
                    list.remove(ciVar);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: y */
    private final void m2098y(C0566ci ciVar) {
        C0673gh ghVar = ciVar.f2188a;
        if (ghVar != null) {
            m2095A(ciVar, ghVar);
        }
        C0673gh ghVar2 = ciVar.f2189b;
        if (ghVar2 != null) {
            m2095A(ciVar, ghVar2);
        }
    }

    /* renamed from: z */
    private final void m2099z(C0673gh ghVar) {
        if (f2199n == null) {
            f2199n = new ValueAnimator().getInterpolator();
        }
        ghVar.itemView.animate().setInterpolator(f2199n);
        mo2687c(ghVar);
    }

    /* renamed from: a */
    public void mo2685a(C0673gh ghVar) {
        View view = ghVar.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f2203d.add(ghVar);
        animate.alpha(1.0f).setDuration(this.f2408h).setListener(new C0562ce(this, ghVar, view, animate)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo2686b() {
        if (!mo2695k()) {
            mo2890n();
        }
    }

    /* renamed from: c */
    public void mo2687c(C0673gh ghVar) {
        View view = ghVar.itemView;
        view.animate().cancel();
        int size = this.f2209q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C0567cj) this.f2209q.get(size)).f2194a == ghVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo2889m(ghVar);
                this.f2209q.remove(size);
            }
        }
        m2097x(this.f2210r, ghVar);
        if (this.f2207o.remove(ghVar)) {
            view.setAlpha(1.0f);
            mo2889m(ghVar);
        }
        if (this.f2208p.remove(ghVar)) {
            view.setAlpha(1.0f);
            mo2889m(ghVar);
        }
        int size2 = this.f2202c.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.f2202c.get(size2);
            m2097x(arrayList, ghVar);
            if (arrayList.isEmpty()) {
                this.f2202c.remove(size2);
            }
        }
        int size3 = this.f2201b.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.f2201b.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((C0567cj) arrayList2.get(size4)).f2194a == ghVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo2889m(ghVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f2201b.remove(size3);
                    }
                }
            }
        }
        int size5 = this.f2200a.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList3 = (ArrayList) this.f2200a.get(size5);
                if (arrayList3.remove(ghVar)) {
                    view.setAlpha(1.0f);
                    mo2889m(ghVar);
                    if (arrayList3.isEmpty()) {
                        this.f2200a.remove(size5);
                    }
                }
            } else {
                this.f2205f.remove(ghVar);
                this.f2203d.remove(ghVar);
                this.f2206g.remove(ghVar);
                this.f2204e.remove(ghVar);
                mo2686b();
                return;
            }
        }
    }

    /* renamed from: d */
    public void mo2688d() {
        int size = this.f2209q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0567cj cjVar = (C0567cj) this.f2209q.get(size);
            View view = cjVar.f2194a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo2889m(cjVar.f2194a);
            this.f2209q.remove(size);
        }
        int size2 = this.f2207o.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            mo2889m((C0673gh) this.f2207o.get(size2));
            this.f2207o.remove(size2);
        }
        int size3 = this.f2208p.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C0673gh ghVar = (C0673gh) this.f2208p.get(size3);
            ghVar.itemView.setAlpha(1.0f);
            mo2889m(ghVar);
            this.f2208p.remove(size3);
        }
        int size4 = this.f2210r.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            m2098y((C0566ci) this.f2210r.get(size4));
        }
        this.f2210r.clear();
        if (mo2695k()) {
            int size5 = this.f2201b.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList arrayList = (ArrayList) this.f2201b.get(size5);
                int size6 = arrayList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        C0567cj cjVar2 = (C0567cj) arrayList.get(size6);
                        View view2 = cjVar2.f2194a.itemView;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        mo2889m(cjVar2.f2194a);
                        arrayList.remove(size6);
                        if (arrayList.isEmpty()) {
                            this.f2201b.remove(arrayList);
                        }
                    }
                }
            }
            int size7 = this.f2200a.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList arrayList2 = (ArrayList) this.f2200a.get(size7);
                int size8 = arrayList2.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        C0673gh ghVar2 = (C0673gh) arrayList2.get(size8);
                        ghVar2.itemView.setAlpha(1.0f);
                        mo2889m(ghVar2);
                        arrayList2.remove(size8);
                        if (arrayList2.isEmpty()) {
                            this.f2200a.remove(arrayList2);
                        }
                    }
                }
            }
            int size9 = this.f2202c.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    ArrayList arrayList3 = (ArrayList) this.f2202c.get(size9);
                    int size10 = arrayList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            m2098y((C0566ci) arrayList3.get(size10));
                            if (arrayList3.isEmpty()) {
                                this.f2202c.remove(arrayList3);
                            }
                        }
                    }
                } else {
                    m2096l(this.f2205f);
                    m2096l(this.f2204e);
                    m2096l(this.f2203d);
                    m2096l(this.f2206g);
                    mo2890n();
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    public void mo2689e() {
        boolean z = !this.f2207o.isEmpty();
        boolean z2 = !this.f2209q.isEmpty();
        boolean z3 = !this.f2210r.isEmpty();
        boolean z4 = !this.f2208p.isEmpty();
        if (z || z2 || z4 || z3) {
            ArrayList arrayList = this.f2207o;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0673gh ghVar = (C0673gh) arrayList.get(i);
                View view = ghVar.itemView;
                ViewPropertyAnimator animate = view.animate();
                this.f2205f.add(ghVar);
                animate.setDuration(this.f2409i).alpha(0.0f).setListener(new C0561cd(this, ghVar, animate, view)).start();
            }
            this.f2207o.clear();
            if (z2) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f2209q);
                this.f2201b.add(arrayList2);
                this.f2209q.clear();
                C0558ca caVar = new C0558ca(this, arrayList2);
                if (z) {
                    C2043bi.m5521O(((C0567cj) arrayList2.get(0)).f2194a.itemView, caVar, this.f2409i);
                } else {
                    caVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f2210r);
                this.f2202c.add(arrayList3);
                this.f2210r.clear();
                C0559cb cbVar = new C0559cb(this, arrayList3);
                if (z) {
                    C2043bi.m5521O(((C0566ci) arrayList3.get(0)).f2188a.itemView, cbVar, this.f2409i);
                } else {
                    cbVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(this.f2208p);
                this.f2200a.add(arrayList4);
                this.f2208p.clear();
                C0560cc ccVar = new C0560cc(this, arrayList4);
                if (z || z2 || z3) {
                    long j = 0;
                    long j2 = z ? this.f2409i : 0;
                    long j3 = z2 ? this.f2410j : 0;
                    if (z3) {
                        j = this.f2411k;
                    }
                    C2043bi.m5521O(((C0673gh) arrayList4.get(0)).itemView, ccVar, j2 + Math.max(j3, j));
                    return;
                }
                ccVar.run();
            }
        }
    }

    /* renamed from: f */
    public boolean mo2690f(C0673gh ghVar) {
        m2099z(ghVar);
        ghVar.itemView.setAlpha(0.0f);
        this.f2208p.add(ghVar);
        return true;
    }

    /* renamed from: g */
    public boolean mo2691g(C0673gh ghVar, C0673gh ghVar2, int i, int i2, int i3, int i4) {
        if (ghVar == ghVar2) {
            return mo2692h(ghVar, i, i2, i3, i4);
        }
        float translationX = ghVar.itemView.getTranslationX();
        float translationY = ghVar.itemView.getTranslationY();
        float alpha = ghVar.itemView.getAlpha();
        m2099z(ghVar);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        ghVar.itemView.setTranslationX(translationX);
        ghVar.itemView.setTranslationY(translationY);
        ghVar.itemView.setAlpha(alpha);
        if (ghVar2 != null) {
            m2099z(ghVar2);
            ghVar2.itemView.setTranslationX((float) (-i5));
            ghVar2.itemView.setTranslationY((float) (-i6));
            ghVar2.itemView.setAlpha(0.0f);
        }
        this.f2210r.add(new C0566ci(ghVar, ghVar2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: h */
    public boolean mo2692h(C0673gh ghVar, int i, int i2, int i3, int i4) {
        View view = ghVar.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) ghVar.itemView.getTranslationY());
        m2099z(ghVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0) {
            i5 = 0;
            if (i6 == 0) {
                mo2889m(ghVar);
                return false;
            }
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.f2209q.add(new C0567cj(ghVar, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: i */
    public boolean mo2693i(C0673gh ghVar) {
        m2099z(ghVar);
        this.f2207o.add(ghVar);
        return true;
    }

    /* renamed from: j */
    public final boolean mo2694j(C0673gh ghVar, List list) {
        return !list.isEmpty() || mo2895s(ghVar);
    }

    /* renamed from: k */
    public boolean mo2695k() {
        return !this.f2208p.isEmpty() || !this.f2210r.isEmpty() || !this.f2209q.isEmpty() || !this.f2207o.isEmpty() || !this.f2204e.isEmpty() || !this.f2205f.isEmpty() || !this.f2203d.isEmpty() || !this.f2206g.isEmpty() || !this.f2201b.isEmpty() || !this.f2200a.isEmpty() || !this.f2202c.isEmpty();
    }
}
