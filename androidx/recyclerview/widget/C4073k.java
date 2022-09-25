package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.C0707ho;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.p100b.C2034a;
import com.google.common.p4522b.C58597ky;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.k */
/* compiled from: PG */
public class C4073k extends C0707ho {

    /* renamed from: o */
    private static final TimeInterpolator f13031o = C2034a.m5471c(0.4f, 0.0f, 0.2f, 1.0f);

    /* renamed from: a */
    public TimeInterpolator f13032a = f13031o;

    /* renamed from: b */
    final ArrayList f13033b = new ArrayList();

    /* renamed from: c */
    final ArrayList f13034c = new ArrayList();

    /* renamed from: d */
    final ArrayList f13035d = new ArrayList();

    /* renamed from: e */
    final ArrayList f13036e = new ArrayList();

    /* renamed from: f */
    final ArrayList f13037f = new ArrayList();

    /* renamed from: g */
    final ArrayList f13038g = new ArrayList();

    /* renamed from: n */
    final ArrayList f13039n = new ArrayList();

    /* renamed from: p */
    private final ArrayList f13040p = new ArrayList();

    /* renamed from: q */
    private final ArrayList f13041q = new ArrayList();

    /* renamed from: r */
    private final ArrayList f13042r = new ArrayList();

    /* renamed from: s */
    private final ArrayList f13043s = new ArrayList();

    /* renamed from: b */
    static final void m11666b(List list) {
        for (C0673gh ghVar : C58597ky.m90216g(list)) {
            ghVar.itemView.animate().cancel();
        }
    }

    /* renamed from: l */
    private final void m11667l(List list, C0673gh ghVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C4071i iVar = (C4071i) list.get(size);
                if (m11670z(iVar, ghVar) && iVar.f13020a == null && iVar.f13021b == null) {
                    list.remove(iVar);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: x */
    private final void m11668x(C4071i iVar) {
        C0673gh ghVar = iVar.f13020a;
        if (ghVar != null) {
            m11670z(iVar, ghVar);
        }
        C0673gh ghVar2 = iVar.f13021b;
        if (ghVar2 != null) {
            m11670z(iVar, ghVar2);
        }
    }

    /* renamed from: y */
    private final void m11669y(C0673gh ghVar) {
        ghVar.itemView.animate().setInterpolator(this.f13032a);
        mo2687c(ghVar);
    }

    /* renamed from: z */
    private final boolean m11670z(C4071i iVar, C0673gh ghVar) {
        if (iVar.f13021b == ghVar) {
            iVar.f13021b = null;
        } else if (iVar.f13020a != ghVar) {
            return false;
        } else {
            iVar.f13020a = null;
        }
        ghVar.itemView.setAlpha(1.0f);
        ghVar.itemView.setTranslationX(0.0f);
        ghVar.itemView.setTranslationY(0.0f);
        mo2889m(ghVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8549a() {
        if (!mo2695k()) {
            mo2890n();
        }
    }

    /* renamed from: c */
    public void mo2687c(C0673gh ghVar) {
        View view = ghVar.itemView;
        view.animate().cancel();
        int size = this.f13042r.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C4072j) this.f13042r.get(size)).f13026a == ghVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo2889m(ghVar);
                this.f13042r.remove(size);
            }
        }
        m11667l(this.f13043s, ghVar);
        if (this.f13040p.remove(ghVar)) {
            view.setAlpha(1.0f);
            mo2889m(ghVar);
        }
        if (this.f13041q.remove(ghVar)) {
            view.setAlpha(1.0f);
            mo2889m(ghVar);
        }
        int size2 = this.f13035d.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.f13035d.get(size2);
            m11667l(arrayList, ghVar);
            if (arrayList.isEmpty()) {
                this.f13035d.remove(size2);
            }
        }
        int size3 = this.f13034c.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.f13034c.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((C4072j) arrayList2.get(size4)).f13026a == ghVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo2889m(ghVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f13034c.remove(size3);
                    }
                }
            }
        }
        int size5 = this.f13033b.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList3 = (ArrayList) this.f13033b.get(size5);
                if (arrayList3.remove(ghVar)) {
                    view.setAlpha(1.0f);
                    mo2889m(ghVar);
                    if (arrayList3.isEmpty()) {
                        this.f13033b.remove(size5);
                    }
                }
            } else {
                this.f13038g.remove(ghVar);
                this.f13036e.remove(ghVar);
                this.f13039n.remove(ghVar);
                this.f13037f.remove(ghVar);
                mo8549a();
                return;
            }
        }
    }

    /* renamed from: d */
    public final void mo2688d() {
        int size = this.f13042r.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C4072j jVar = (C4072j) this.f13042r.get(size);
            View view = jVar.f13026a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo2889m(jVar.f13026a);
            this.f13042r.remove(size);
        }
        int size2 = this.f13040p.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            mo2889m((C0673gh) this.f13040p.get(size2));
            this.f13040p.remove(size2);
        }
        int size3 = this.f13041q.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C0673gh ghVar = (C0673gh) this.f13041q.get(size3);
            ghVar.itemView.setAlpha(1.0f);
            mo2889m(ghVar);
            this.f13041q.remove(size3);
        }
        int size4 = this.f13043s.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            m11668x((C4071i) this.f13043s.get(size4));
        }
        this.f13043s.clear();
        if (mo2695k()) {
            int size5 = this.f13034c.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList arrayList = (ArrayList) this.f13034c.get(size5);
                int size6 = arrayList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        C4072j jVar2 = (C4072j) arrayList.get(size6);
                        View view2 = jVar2.f13026a.itemView;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        mo2889m(jVar2.f13026a);
                        arrayList.remove(size6);
                        if (arrayList.isEmpty()) {
                            this.f13034c.remove(arrayList);
                        }
                    }
                }
            }
            int size7 = this.f13033b.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList arrayList2 = (ArrayList) this.f13033b.get(size7);
                int size8 = arrayList2.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        C0673gh ghVar2 = (C0673gh) arrayList2.get(size8);
                        ghVar2.itemView.setAlpha(1.0f);
                        mo2889m(ghVar2);
                        arrayList2.remove(size8);
                        if (arrayList2.isEmpty()) {
                            this.f13033b.remove(arrayList2);
                        }
                    }
                }
            }
            int size9 = this.f13035d.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    ArrayList arrayList3 = (ArrayList) this.f13035d.get(size9);
                    int size10 = arrayList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            m11668x((C4071i) arrayList3.get(size10));
                            if (arrayList3.isEmpty()) {
                                this.f13035d.remove(arrayList3);
                            }
                        }
                    }
                } else {
                    m11666b(this.f13038g);
                    m11666b(this.f13037f);
                    m11666b(this.f13036e);
                    m11666b(this.f13039n);
                    mo2890n();
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo2689e() {
        boolean z = !this.f13040p.isEmpty();
        boolean z2 = !this.f13042r.isEmpty();
        boolean z3 = !this.f13043s.isEmpty();
        boolean z4 = !this.f13041q.isEmpty();
        if (z || z2 || z4 || z3) {
            ArrayList arrayList = this.f13040p;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0673gh ghVar = (C0673gh) arrayList.get(i);
                View view = ghVar.itemView;
                ViewPropertyAnimator animate = view.animate();
                this.f13038g.add(ghVar);
                animate.setDuration(this.f2409i).alpha(0.0f).setListener(new C4066d(this, ghVar, animate, view)).start();
            }
            this.f13040p.clear();
            if (z2) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f13042r);
                this.f13034c.add(arrayList2);
                this.f13042r.clear();
                C4063a aVar = new C4063a(this, arrayList2);
                if (z) {
                    C2043bi.m5521O(((C4072j) arrayList2.get(0)).f13026a.itemView, aVar, this.f2409i);
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f13043s);
                this.f13035d.add(arrayList3);
                this.f13043s.clear();
                C4064b bVar = new C4064b(this, arrayList3);
                if (z) {
                    C2043bi.m5521O(((C4071i) arrayList3.get(0)).f13020a.itemView, bVar, this.f2409i);
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(this.f13041q);
                this.f13033b.add(arrayList4);
                this.f13041q.clear();
                C4065c cVar = new C4065c(this, arrayList4);
                if (z || z2 || z3) {
                    long j = 0;
                    long j2 = z ? this.f2409i : 0;
                    long j3 = z2 ? this.f2410j : 0;
                    if (z3) {
                        j = this.f2411k;
                    }
                    C2043bi.m5521O(((C0673gh) arrayList4.get(0)).itemView, cVar, j2 + Math.max(j3, j));
                    return;
                }
                cVar.run();
            }
        }
    }

    /* renamed from: f */
    public final boolean mo2690f(C0673gh ghVar) {
        m11669y(ghVar);
        ghVar.itemView.setAlpha(0.0f);
        this.f13041q.add(ghVar);
        return true;
    }

    /* renamed from: g */
    public final boolean mo2691g(C0673gh ghVar, C0673gh ghVar2, int i, int i2, int i3, int i4) {
        if (ghVar == ghVar2) {
            return mo2692h(ghVar, i, i2, i3, i4);
        }
        float translationX = ghVar.itemView.getTranslationX();
        float translationY = ghVar.itemView.getTranslationY();
        float alpha = ghVar.itemView.getAlpha();
        m11669y(ghVar);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        ghVar.itemView.setTranslationX(translationX);
        ghVar.itemView.setTranslationY(translationY);
        ghVar.itemView.setAlpha(alpha);
        if (ghVar2 != null) {
            m11669y(ghVar2);
            ghVar2.itemView.setTranslationX((float) (-i5));
            ghVar2.itemView.setTranslationY((float) (-i6));
            ghVar2.itemView.setAlpha(0.0f);
        }
        this.f13043s.add(new C4071i(ghVar, ghVar2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: h */
    public final boolean mo2692h(C0673gh ghVar, int i, int i2, int i3, int i4) {
        View view = ghVar.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) ghVar.itemView.getTranslationY());
        m11669y(ghVar);
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
        this.f13042r.add(new C4072j(ghVar, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: i */
    public final boolean mo2693i(C0673gh ghVar) {
        m11669y(ghVar);
        this.f13040p.add(ghVar);
        return true;
    }

    /* renamed from: j */
    public final boolean mo2694j(C0673gh ghVar, List list) {
        return !list.isEmpty() || mo2895s(ghVar);
    }

    /* renamed from: k */
    public final boolean mo2695k() {
        return !this.f13041q.isEmpty() || !this.f13043s.isEmpty() || !this.f13042r.isEmpty() || !this.f13040p.isEmpty() || !this.f13037f.isEmpty() || !this.f13038g.isEmpty() || !this.f13036e.isEmpty() || !this.f13039n.isEmpty() || !this.f13034c.isEmpty() || !this.f13033b.isEmpty() || !this.f13035d.isEmpty();
    }
}
