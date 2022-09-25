package androidx.p197u;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.core.p098j.C2043bi;
import androidx.p060c.C0977g;
import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: androidx.u.af */
/* compiled from: PG */
public abstract class C4195af implements Cloneable {

    /* renamed from: o */
    private static final int[] f13588o = {2, 1, 3, 4};

    /* renamed from: p */
    private static final C4239x f13589p = new C4241z();

    /* renamed from: q */
    private static final ThreadLocal f13590q = new ThreadLocal();

    /* renamed from: a */
    public long f13591a = -1;

    /* renamed from: b */
    public long f13592b = -1;

    /* renamed from: c */
    public TimeInterpolator f13593c = null;

    /* renamed from: d */
    final ArrayList f13594d = new ArrayList();

    /* renamed from: e */
    public final ArrayList f13595e = new ArrayList();

    /* renamed from: f */
    public C4207ar f13596f = new C4207ar();

    /* renamed from: g */
    public C4207ar f13597g = new C4207ar();

    /* renamed from: h */
    C4202am f13598h = null;

    /* renamed from: i */
    public final int[] f13599i = f13588o;

    /* renamed from: j */
    public ArrayList f13600j;

    /* renamed from: k */
    public ArrayList f13601k;

    /* renamed from: l */
    final ArrayList f13602l = new ArrayList();

    /* renamed from: m */
    public C4193ad f13603m;

    /* renamed from: n */
    public C4239x f13604n = f13589p;

    /* renamed from: r */
    private final String f13605r = getClass().getName();

    /* renamed from: s */
    private int f13606s = 0;

    /* renamed from: t */
    private boolean f13607t = false;

    /* renamed from: u */
    private boolean f13608u = false;

    /* renamed from: v */
    private ArrayList f13609v = null;

    /* renamed from: w */
    private ArrayList f13610w = new ArrayList();

    /* renamed from: H */
    private static boolean m12012H(C4206aq aqVar, C4206aq aqVar2, String str) {
        Object obj = aqVar.f13625a.get(str);
        Object obj2 = aqVar2.f13625a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* renamed from: e */
    private static void m12013e(C4207ar arVar, View view, C4206aq aqVar) {
        arVar.f13628a.put(view, aqVar);
        int id = view.getId();
        if (id >= 0) {
            if (arVar.f13629b.indexOfKey(id) >= 0) {
                arVar.f13629b.put(id, (Object) null);
            } else {
                arVar.f13629b.put(id, view);
            }
        }
        String E = C2043bi.m5511E(view);
        if (E != null) {
            if (arVar.f13631d.containsKey(E)) {
                arVar.f13631d.put(E, (Object) null);
            } else {
                arVar.f13631d.put(E, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (arVar.f13630c.mo3673a(itemIdAtPosition) >= 0) {
                    View view2 = (View) arVar.f13630c.mo3678e(itemIdAtPosition);
                    if (view2 != null) {
                        C2043bi.m5550ad(view2, false);
                        arVar.f13630c.mo3682i(itemIdAtPosition, (Object) null);
                        return;
                    }
                    return;
                }
                C2043bi.m5550ad(view, true);
                arVar.f13630c.mo3682i(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: f */
    private final void m12014f(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                C4206aq aqVar = new C4206aq(view);
                if (z) {
                    mo8878c(aqVar);
                } else {
                    mo8877b(aqVar);
                }
                aqVar.f13627c.add(this);
                mo8886m(aqVar);
                if (z) {
                    m12013e(this.f13596f, view, aqVar);
                } else {
                    m12013e(this.f13597g, view, aqVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m12014f(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    /* renamed from: g */
    public static C0977g m12015g() {
        ThreadLocal threadLocal = f13590q;
        C0977g gVar = (C0977g) threadLocal.get();
        if (gVar != null) {
            return gVar;
        }
        C0977g gVar2 = new C0977g();
        threadLocal.set(gVar2);
        return gVar2;
    }

    /* renamed from: A */
    public void mo8869A(View view) {
        this.f13595e.add(view);
    }

    /* renamed from: B */
    public final void mo8870B(C4194ae aeVar) {
        ArrayList arrayList = this.f13609v;
        if (arrayList != null) {
            arrayList.remove(aeVar);
            if (this.f13609v.size() == 0) {
                this.f13609v = null;
            }
        }
    }

    /* renamed from: C */
    public void mo8871C(View view) {
        this.f13595e.remove(view);
    }

    /* renamed from: D */
    public void mo8872D(long j) {
        this.f13592b = j;
    }

    /* renamed from: E */
    public void mo8873E(TimeInterpolator timeInterpolator) {
        this.f13593c = timeInterpolator;
    }

    /* renamed from: F */
    public void mo8874F(long j) {
        this.f13591a = j;
    }

    /* renamed from: G */
    public void mo8875G() {
    }

    /* renamed from: a */
    public Animator mo8876a(ViewGroup viewGroup, C4206aq aqVar, C4206aq aqVar2) {
        return null;
    }

    /* renamed from: b */
    public abstract void mo8877b(C4206aq aqVar);

    /* renamed from: c */
    public abstract void mo8878c(C4206aq aqVar);

    /* renamed from: d */
    public String[] mo8880d() {
        return null;
    }

    /* renamed from: h */
    public C4195af clone() {
        try {
            C4195af afVar = (C4195af) super.clone();
            afVar.f13610w = new ArrayList();
            afVar.f13596f = new C4207ar();
            afVar.f13597g = new C4207ar();
            afVar.f13600j = null;
            afVar.f13601k = null;
            return afVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C4206aq mo8882i(View view, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C4202am amVar = this.f13598h;
        if (amVar != null) {
            return amVar.mo8882i(view, z);
        }
        if (z) {
            arrayList = this.f13600j;
        } else {
            arrayList = this.f13601k;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            C4206aq aqVar = (C4206aq) arrayList.get(i);
            if (aqVar == null) {
                return null;
            }
            if (aqVar.f13626b == view) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return null;
        }
        if (z) {
            arrayList2 = this.f13601k;
        } else {
            arrayList2 = this.f13600j;
        }
        return (C4206aq) arrayList2.get(i);
    }

    /* renamed from: j */
    public final C4206aq mo8883j(View view, boolean z) {
        C4207ar arVar;
        C4202am amVar = this.f13598h;
        if (amVar != null) {
            return amVar.mo8883j(view, z);
        }
        if (z) {
            arVar = this.f13596f;
        } else {
            arVar = this.f13597g;
        }
        return (C4206aq) arVar.f13628a.get(view);
    }

    /* renamed from: k */
    public String mo8884k(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f13592b != -1) {
            str2 = str2 + "dur(" + this.f13592b + ") ";
        }
        if (this.f13591a != -1) {
            str2 = str2 + "dly(" + this.f13591a + ") ";
        }
        if (this.f13593c != null) {
            str2 = str2 + "interp(" + this.f13593c + ") ";
        }
        if (this.f13594d.size() <= 0 && this.f13595e.size() <= 0) {
            return str2;
        }
        String concat = str2.concat("tgts(");
        if (this.f13594d.size() > 0) {
            for (int i = 0; i < this.f13594d.size(); i++) {
                if (i > 0) {
                    concat = concat.concat(", ");
                }
                StringBuilder sb = new StringBuilder();
                sb.append(concat);
                Object obj = this.f13594d.get(i);
                sb.append(obj);
                concat = concat.concat(String.valueOf(obj));
            }
        }
        if (this.f13595e.size() > 0) {
            for (int i2 = 0; i2 < this.f13595e.size(); i2++) {
                if (i2 > 0) {
                    concat = concat.concat(", ");
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(concat);
                Object obj2 = this.f13595e.get(i2);
                sb2.append(obj2);
                concat = concat.concat(String.valueOf(obj2));
            }
        }
        return concat.concat(")");
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo8885l() {
        int size = this.f13602l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ((Animator) this.f13602l.get(size)).cancel();
        }
        ArrayList arrayList = this.f13609v;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f13609v.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((C4194ae) arrayList2.get(i)).mo8865b();
            }
        }
    }

    /* renamed from: m */
    public void mo8886m(C4206aq aqVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo8887n(ViewGroup viewGroup, boolean z) {
        mo8888o(z);
        if (this.f13594d.size() > 0 || this.f13595e.size() > 0) {
            for (int i = 0; i < this.f13594d.size(); i++) {
                View findViewById = viewGroup.findViewById(((Integer) this.f13594d.get(i)).intValue());
                if (findViewById != null) {
                    C4206aq aqVar = new C4206aq(findViewById);
                    if (z) {
                        mo8878c(aqVar);
                    } else {
                        mo8877b(aqVar);
                    }
                    aqVar.f13627c.add(this);
                    mo8886m(aqVar);
                    if (z) {
                        m12013e(this.f13596f, findViewById, aqVar);
                    } else {
                        m12013e(this.f13597g, findViewById, aqVar);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f13595e.size(); i2++) {
                View view = (View) this.f13595e.get(i2);
                C4206aq aqVar2 = new C4206aq(view);
                if (z) {
                    mo8878c(aqVar2);
                } else {
                    mo8877b(aqVar2);
                }
                aqVar2.f13627c.add(this);
                mo8886m(aqVar2);
                if (z) {
                    m12013e(this.f13596f, view, aqVar2);
                } else {
                    m12013e(this.f13597g, view, aqVar2);
                }
            }
            return;
        }
        m12014f(viewGroup, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo8888o(boolean z) {
        if (z) {
            this.f13596f.f13628a.clear();
            this.f13596f.f13629b.clear();
            this.f13596f.f13630c.mo3681h();
            return;
        }
        this.f13597g.f13628a.clear();
        this.f13597g.f13629b.clear();
        this.f13597g.f13630c.mo3681h();
    }

    /* renamed from: p */
    public void mo8889p(ViewGroup viewGroup, C4207ar arVar, C4207ar arVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        Animator animator;
        C4206aq aqVar;
        View view;
        Animator animator2;
        C4206aq aqVar2;
        C0977g g = m12015g();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            C4206aq aqVar3 = (C4206aq) arrayList.get(i2);
            C4206aq aqVar4 = (C4206aq) arrayList2.get(i2);
            if (aqVar3 != null && !aqVar3.f13627c.contains(this)) {
                aqVar3 = null;
            }
            if (aqVar4 != null && !aqVar4.f13627c.contains(this)) {
                aqVar4 = null;
            }
            if (!(aqVar3 == null && aqVar4 == null) && (aqVar3 == null || aqVar4 == null || mo8898x(aqVar3, aqVar4))) {
                Animator a = mo8876a(viewGroup, aqVar3, aqVar4);
                if (a != null) {
                    if (aqVar4 != null) {
                        View view2 = aqVar4.f13626b;
                        String[] d = mo8880d();
                        if (d != null && d.length > 0) {
                            C4206aq aqVar5 = new C4206aq(view2);
                            C4206aq aqVar6 = (C4206aq) arVar2.f13628a.get(view2);
                            if (aqVar6 != null) {
                                int i3 = 0;
                                while (i3 < d.length) {
                                    Map map = aqVar5.f13625a;
                                    Animator animator3 = a;
                                    String str = d[i3];
                                    map.put(str, aqVar6.f13625a.get(str));
                                    i3++;
                                    a = animator3;
                                    d = d;
                                }
                            }
                            animator2 = a;
                            int i4 = g.f3122d;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    aqVar2 = aqVar5;
                                    break;
                                }
                                C4192ac acVar = (C4192ac) g.get((Animator) g.mo3702e(i5));
                                if (acVar.f13585c != null && acVar.f13583a == view2 && acVar.f13584b.equals(this.f13605r) && acVar.f13585c.equals(aqVar5)) {
                                    aqVar2 = aqVar5;
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            C4207ar arVar3 = arVar2;
                            animator2 = a;
                            aqVar2 = null;
                        }
                        view = view2;
                        aqVar = aqVar2;
                        animator = animator2;
                    } else {
                        C4207ar arVar4 = arVar2;
                        view = aqVar3.f13626b;
                        animator = a;
                        aqVar = null;
                    }
                    if (animator != null) {
                        i = size;
                        C4192ac acVar2 = r0;
                        C4192ac acVar3 = new C4192ac(view, this.f13605r, this, C4211av.m12088a(viewGroup), aqVar);
                        g.put(animator, acVar2);
                        this.f13610w.add(animator);
                        i2++;
                        size = i;
                    }
                    i = size;
                    i2++;
                    size = i;
                }
            } else {
                ViewGroup viewGroup2 = viewGroup;
            }
            C4207ar arVar5 = arVar2;
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator4 = (Animator) this.f13610w.get(sparseIntArray.keyAt(i6));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i6)) - Long.MAX_VALUE) + animator4.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo8890q() {
        int i = this.f13606s - 1;
        this.f13606s = i;
        if (i == 0) {
            ArrayList arrayList = this.f13609v;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f13609v.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C4194ae) arrayList2.get(i2)).mo8864a(this);
                }
            }
            for (int i3 = 0; i3 < this.f13596f.f13630c.mo3675c(); i3++) {
                View view = (View) this.f13596f.f13630c.mo3680g(i3);
                if (view != null) {
                    C2043bi.m5550ad(view, false);
                }
            }
            for (int i4 = 0; i4 < this.f13597g.f13630c.mo3675c(); i4++) {
                View view2 = (View) this.f13597g.f13630c.mo3680g(i4);
                if (view2 != null) {
                    C2043bi.m5550ad(view2, false);
                }
            }
            this.f13608u = true;
        }
    }

    /* renamed from: r */
    public void mo8891r(View view) {
        if (!this.f13608u) {
            int size = this.f13602l.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C4189a.m12005b((Animator) this.f13602l.get(size));
            }
            ArrayList arrayList = this.f13609v;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f13609v.clone();
                int size2 = arrayList2.size();
                for (int i = 0; i < size2; i++) {
                    ((C4194ae) arrayList2.get(i)).mo8866c();
                }
            }
            this.f13607t = true;
        }
    }

    /* renamed from: s */
    public void mo8892s(View view) {
        if (this.f13607t) {
            if (!this.f13608u) {
                int size = this.f13602l.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    C4189a.m12006c((Animator) this.f13602l.get(size));
                }
                ArrayList arrayList = this.f13609v;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f13609v.clone();
                    int size2 = arrayList2.size();
                    for (int i = 0; i < size2; i++) {
                        ((C4194ae) arrayList2.get(i)).mo8867d();
                    }
                }
            }
            this.f13607t = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo8893t() {
        mo8897w();
        C0977g g = m12015g();
        ArrayList arrayList = this.f13610w;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (g.containsKey(animator)) {
                mo8897w();
                if (animator != null) {
                    animator.addListener(new C4190aa(this, g));
                    long j = this.f13592b;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f13591a;
                    if (j2 >= 0) {
                        animator.setStartDelay(j2 + animator.getStartDelay());
                    }
                    TimeInterpolator timeInterpolator = this.f13593c;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C4191ab(this));
                    animator.start();
                }
            }
        }
        this.f13610w.clear();
        mo8890q();
    }

    public final String toString() {
        return mo8884k(BuildConfig.FLAVOR);
    }

    /* renamed from: u */
    public void mo8895u(C4193ad adVar) {
        this.f13603m = adVar;
    }

    /* renamed from: v */
    public void mo8896v(C4239x xVar) {
        if (xVar == null) {
            this.f13604n = f13589p;
        } else {
            this.f13604n = xVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo8897w() {
        if (this.f13606s == 0) {
            ArrayList arrayList = this.f13609v;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f13609v.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C4194ae) arrayList2.get(i)).mo8868e(this);
                }
            }
            this.f13608u = false;
        }
        this.f13606s++;
    }

    /* renamed from: x */
    public boolean mo8898x(C4206aq aqVar, C4206aq aqVar2) {
        if (aqVar == null || aqVar2 == null) {
            return false;
        }
        String[] d = mo8880d();
        if (d != null) {
            int length = d.length;
            int i = 0;
            while (i < length) {
                if (!m12012H(aqVar, aqVar2, d[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String H : aqVar.f13625a.keySet()) {
            if (m12012H(aqVar, aqVar2, H)) {
            }
        }
        return false;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final boolean mo8899y(View view) {
        int id = view.getId();
        if ((this.f13594d.size() != 0 || this.f13595e.size() != 0) && !this.f13594d.contains(Integer.valueOf(id)) && !this.f13595e.contains(view)) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public final void mo8900z(C4194ae aeVar) {
        if (this.f13609v == null) {
            this.f13609v = new ArrayList();
        }
        this.f13609v.add(aeVar);
    }
}
