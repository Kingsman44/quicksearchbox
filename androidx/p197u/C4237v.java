package androidx.p197u;

import android.graphics.Rect;
import android.support.p031v4.app.C0222cn;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p094f.C1893f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.u.v */
/* compiled from: PG */
public final class C4237v extends C0222cn {
    /* renamed from: t */
    private static boolean m12137t(C4195af afVar) {
        return !m524r(afVar.f13594d) || !m524r((List) null) || !m524r((List) null);
    }

    /* renamed from: a */
    public final Object mo709a(Object obj) {
        if (obj != null) {
            return ((C4195af) obj).clone();
        }
        return null;
    }

    /* renamed from: b */
    public final Object mo710b(Object obj, Object obj2, Object obj3) {
        C4195af afVar = (C4195af) obj;
        C4195af afVar2 = (C4195af) obj2;
        C4195af afVar3 = (C4195af) obj3;
        if (afVar != null && afVar2 != null) {
            C4202am amVar = new C4202am();
            amVar.mo8908f(afVar);
            amVar.mo8908f(afVar2);
            amVar.mo8905I(1);
            afVar = amVar;
        } else if (afVar == null) {
            afVar = afVar2 != null ? afVar2 : null;
        }
        if (afVar3 == null) {
            return afVar;
        }
        C4202am amVar2 = new C4202am();
        if (afVar != null) {
            amVar2.mo8908f(afVar);
        }
        amVar2.mo8908f(afVar3);
        return amVar2;
    }

    /* renamed from: c */
    public final Object mo711c(Object obj) {
        if (obj == null) {
            return null;
        }
        C4202am amVar = new C4202am();
        amVar.mo8908f((C4195af) obj);
        return amVar;
    }

    /* renamed from: d */
    public final void mo712d(Object obj, View view) {
        ((C4195af) obj).mo8869A(view);
    }

    /* renamed from: e */
    public final void mo713e(Object obj, ArrayList arrayList) {
        C4195af afVar = (C4195af) obj;
        if (afVar != null) {
            int i = 0;
            if (afVar instanceof C4202am) {
                C4202am amVar = (C4202am) afVar;
                int size = amVar.f13620o.size();
                while (i < size) {
                    mo713e(amVar.mo8907e(i), arrayList);
                    i++;
                }
            } else if (!m12137t(afVar) && m524r(afVar.f13595e)) {
                int size2 = arrayList.size();
                while (i < size2) {
                    afVar.mo8869A((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo714f(ViewGroup viewGroup, Object obj) {
        C4199aj.m12054b(viewGroup, (C4195af) obj);
    }

    /* renamed from: g */
    public final void mo8941g(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        C4195af afVar = (C4195af) obj;
        int i2 = 0;
        if (afVar instanceof C4202am) {
            C4202am amVar = (C4202am) afVar;
            int size = amVar.f13620o.size();
            while (i2 < size) {
                mo8941g(amVar.mo8907e(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m12137t(afVar)) {
            ArrayList arrayList3 = afVar.f13595e;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    afVar.mo8869A((View) arrayList2.get(i2));
                    i2++;
                }
                int size2 = arrayList.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        afVar.mo8871C((View) arrayList.get(size2));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo716h(Object obj, View view, ArrayList arrayList) {
        ((C4195af) obj).mo8900z(new C4232q(view, arrayList));
    }

    /* renamed from: i */
    public final void mo717i(Object obj, Rect rect) {
        ((C4195af) obj).mo8895u(new C4236u());
    }

    /* renamed from: j */
    public final void mo718j(Object obj, View view) {
        if (view != null) {
            m525s(view, new Rect());
            ((C4195af) obj).mo8895u(new C4231p());
        }
    }

    /* renamed from: k */
    public final void mo719k(Object obj, View view, ArrayList arrayList) {
        C4202am amVar = (C4202am) obj;
        ArrayList arrayList2 = amVar.f13595e;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m523q(arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo713e(amVar, arrayList);
    }

    /* renamed from: l */
    public final void mo720l(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C4202am amVar = (C4202am) obj;
        if (amVar != null) {
            amVar.f13595e.clear();
            amVar.f13595e.addAll(arrayList2);
            mo8941g(amVar, arrayList, arrayList2);
        }
    }

    /* renamed from: m */
    public final boolean mo721m(Object obj) {
        return obj instanceof C4195af;
    }

    /* renamed from: n */
    public final Object mo722n(Object obj, Object obj2) {
        C4202am amVar = new C4202am();
        if (obj != null) {
            amVar.mo8908f((C4195af) obj);
        }
        amVar.mo8908f((C4195af) obj2);
        return amVar;
    }

    /* renamed from: o */
    public final void mo723o(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((C4195af) obj).mo8900z(new C4233r(this, obj2, arrayList, obj3, arrayList2));
    }

    /* renamed from: p */
    public final void mo724p(Object obj, C1893f fVar, Runnable runnable) {
        C4195af afVar = (C4195af) obj;
        fVar.mo5046a(new C4234s(afVar));
        afVar.mo8900z(new C4235t(runnable));
    }
}
