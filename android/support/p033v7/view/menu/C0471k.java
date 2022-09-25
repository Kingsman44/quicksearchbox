package android.support.p033v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.support.p033v7.widget.C0578cu;
import android.support.p033v7.widget.C0614ec;
import android.support.p033v7.widget.C0615ed;
import android.support.p033v7.widget.C0616ee;
import android.support.p033v7.widget.C0619eh;
import android.transition.Transition;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.view.menu.k */
/* compiled from: PG */
public final class C0471k extends C0447aa implements View.OnKeyListener, PopupWindow.OnDismissListener, C0452af {

    /* renamed from: a */
    public final Handler f1610a;

    /* renamed from: b */
    public final List f1611b = new ArrayList();

    /* renamed from: c */
    final ViewTreeObserver.OnGlobalLayoutListener f1612c = new C0466f(this);

    /* renamed from: d */
    View f1613d;

    /* renamed from: e */
    ViewTreeObserver f1614e;

    /* renamed from: f */
    boolean f1615f;

    /* renamed from: h */
    private final Context f1616h;

    /* renamed from: i */
    private final int f1617i;

    /* renamed from: j */
    private final int f1618j;

    /* renamed from: k */
    private final boolean f1619k;

    /* renamed from: l */
    private final List f1620l = new ArrayList();

    /* renamed from: m */
    private final View.OnAttachStateChangeListener f1621m = new C0467g(this);

    /* renamed from: n */
    private final C0614ec f1622n = new C0469i(this);

    /* renamed from: o */
    private int f1623o = 0;

    /* renamed from: p */
    private int f1624p = 0;

    /* renamed from: q */
    private View f1625q;

    /* renamed from: r */
    private int f1626r;

    /* renamed from: s */
    private boolean f1627s;

    /* renamed from: t */
    private boolean f1628t;

    /* renamed from: u */
    private int f1629u;

    /* renamed from: v */
    private int f1630v;

    /* renamed from: w */
    private boolean f1631w;

    /* renamed from: x */
    private boolean f1632x;

    /* renamed from: y */
    private C0451ae f1633y;

    /* renamed from: z */
    private PopupWindow.OnDismissListener f1634z;

    public C0471k(Context context, View view, int i, boolean z) {
        this.f1616h = context;
        this.f1625q = view;
        this.f1618j = i;
        this.f1619k = z;
        this.f1631w = false;
        this.f1626r = m1562B();
        Resources resources = context.getResources();
        this.f1617i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f1610a = new Handler();
    }

    /* renamed from: B */
    private final int m1562B() {
        return C2043bi.m5577f(this.f1625q) == 1 ? 0 : 1;
    }

    /* renamed from: C */
    private final void m1563C(C0477q qVar) {
        View view;
        C0470j jVar;
        MenuItem menuItem;
        int i;
        C0474n nVar;
        int firstVisiblePosition;
        C0477q qVar2 = qVar;
        LayoutInflater from = LayoutInflater.from(this.f1616h);
        C0474n nVar2 = new C0474n(qVar2, from, this.f1619k, R.layout.abc_cascading_menu_item_layout);
        if (!mo1577x() && this.f1631w) {
            nVar2.f1644b = true;
        } else if (mo1577x()) {
            nVar2.f1644b = C0447aa.m1475z(qVar);
        }
        int A = m1473A(nVar2, this.f1616h, this.f1617i);
        C0619eh ehVar = new C0619eh(this.f1616h, this.f1618j);
        ehVar.f2377a = this.f1622n;
        ehVar.f2361l = this;
        ehVar.f2366q.setOnDismissListener(this);
        ehVar.f2360k = this.f1625q;
        ehVar.f2359j = this.f1624p;
        ehVar.mo2829w();
        ehVar.mo2828u();
        ehVar.mo2532e(nVar2);
        ehVar.mo2825r(A);
        ehVar.f2359j = this.f1624p;
        if (this.f1611b.size() > 0) {
            List list = this.f1611b;
            jVar = (C0470j) list.get(list.size() - 1);
            C0477q qVar3 = jVar.f1608b;
            int size = qVar3.f1652c.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = qVar3.getItem(i2);
                if (menuItem.hasSubMenu() && qVar2 == menuItem.getSubMenu()) {
                    break;
                }
                i2++;
            }
            if (menuItem != null) {
                C0578cu cuVar = jVar.f1607a.f2354e;
                ListAdapter adapter = cuVar.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    nVar = (C0474n) headerViewListAdapter.getWrappedAdapter();
                } else {
                    nVar = (C0474n) adapter;
                    i = 0;
                }
                int count = nVar.getCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= count) {
                        i3 = -1;
                        break;
                    } else if (menuItem == nVar.getItem(i3)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1 && (firstVisiblePosition = (i3 + i) - cuVar.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < cuVar.getChildCount()) {
                    view = cuVar.getChildAt(firstVisiblePosition);
                }
            }
            view = null;
        } else {
            jVar = null;
            view = null;
        }
        if (view != null) {
            C0616ee.m2193a(ehVar.f2366q, false);
            C0615ed.m2191a(ehVar.f2366q, (Transition) null);
            List list2 = this.f1611b;
            C0578cu cuVar2 = ((C0470j) list2.get(list2.size() - 1)).f1607a.f2354e;
            int[] iArr = new int[2];
            cuVar2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f1613d.getWindowVisibleDisplayFrame(rect);
            int i4 = (this.f1626r != 1 ? iArr[0] - A >= 0 : (iArr[0] + cuVar2.getWidth()) + A > rect.right) ? 0 : 1;
            this.f1626r = i4;
            ehVar.f2360k = view;
            if ((this.f1624p & 5) == 5) {
                if (i4 == 0) {
                    A = view.getWidth();
                }
                ehVar.f2356g = A;
                ehVar.f2358i = true;
                ehVar.f2357h = true;
                ehVar.mo2821j(0);
            } else if (i4 != 0) {
                A = view.getWidth();
                ehVar.f2356g = A;
                ehVar.f2358i = true;
                ehVar.f2357h = true;
                ehVar.mo2821j(0);
            }
            A = -A;
            ehVar.f2356g = A;
            ehVar.f2358i = true;
            ehVar.f2357h = true;
            ehVar.mo2821j(0);
        } else {
            if (this.f1627s) {
                ehVar.f2356g = this.f1629u;
            }
            if (this.f1628t) {
                ehVar.mo2821j(this.f1630v);
            }
            ehVar.mo2826s(this.f1551g);
        }
        this.f1611b.add(new C0470j(ehVar, qVar2, this.f1626r));
        ehVar.mo1576v();
        C0578cu cuVar3 = ehVar.f2354e;
        cuVar3.setOnKeyListener(this);
        if (jVar == null && this.f1632x && qVar2.f1656g != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, cuVar3, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(qVar2.f1656g);
            cuVar3.addHeaderView(frameLayout, (Object) null, false);
            ehVar.mo1576v();
        }
    }

    /* renamed from: d */
    public final void mo1543d(C0477q qVar, boolean z) {
        int size = this.f1611b.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (qVar == ((C0470j) this.f1611b.get(i)).f1608b) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < this.f1611b.size()) {
                ((C0470j) this.f1611b.get(i2)).f1608b.mo1657g(false);
            }
            C0470j jVar = (C0470j) this.f1611b.remove(i);
            jVar.f1608b.mo1666m(this);
            if (this.f1615f) {
                C0615ed.m2192b(jVar.f1607a.f2366q, (Transition) null);
                jVar.f1607a.f2366q.setAnimationStyle(0);
            }
            jVar.f1607a.mo1575m();
            int size2 = this.f1611b.size();
            if (size2 > 0) {
                this.f1626r = ((C0470j) this.f1611b.get(size2 - 1)).f1609c;
            } else {
                this.f1626r = m1562B();
            }
            if (size2 == 0) {
                mo1575m();
                C0451ae aeVar = this.f1633y;
                if (aeVar != null) {
                    aeVar.mo1121a(qVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f1614e;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f1614e.removeGlobalOnLayoutListener(this.f1612c);
                    }
                    this.f1614e = null;
                }
                this.f1613d.removeOnAttachStateChangeListener(this.f1621m);
                ((C0448ab) this.f1634z).f1552a.mo1536c();
            } else if (z) {
                ((C0470j) this.f1611b.get(0)).f1608b.mo1657g(false);
            }
        }
    }

    /* renamed from: e */
    public final void mo1544e(C0451ae aeVar) {
        this.f1633y = aeVar;
    }

    /* renamed from: eI */
    public final Parcelable mo1545eI() {
        return null;
    }

    /* renamed from: eJ */
    public final ListView mo1574eJ() {
        if (this.f1611b.isEmpty()) {
            return null;
        }
        List list = this.f1611b;
        return ((C0470j) list.get(list.size() - 1)).f1607a.f2354e;
    }

    /* renamed from: f */
    public final void mo1546f(boolean z) {
        for (C0470j jVar : this.f1611b) {
            m1474y(jVar.f1607a.f2354e.getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: g */
    public final boolean mo1547g() {
        return false;
    }

    /* renamed from: h */
    public final boolean mo1548h(C0460an anVar) {
        for (C0470j jVar : this.f1611b) {
            if (anVar == jVar.f1608b) {
                jVar.f1607a.f2354e.requestFocus();
                return true;
            }
        }
        if (!anVar.hasVisibleItems()) {
            return false;
        }
        mo1523l(anVar);
        C0451ae aeVar = this.f1633y;
        if (aeVar != null) {
            aeVar.mo1122b(anVar);
        }
        return true;
    }

    /* renamed from: l */
    public final void mo1523l(C0477q qVar) {
        qVar.mo1655f(this, this.f1616h);
        if (mo1577x()) {
            m1563C(qVar);
        } else {
            this.f1620l.add(qVar);
        }
    }

    /* renamed from: m */
    public final void mo1575m() {
        int size = this.f1611b.size();
        if (size > 0) {
            C0470j[] jVarArr = (C0470j[]) this.f1611b.toArray(new C0470j[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    C0470j jVar = jVarArr[size];
                    if (jVar.f1607a.f2366q.isShowing()) {
                        jVar.f1607a.mo1575m();
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo1549n(Parcelable parcelable) {
    }

    /* renamed from: o */
    public final void mo1524o(View view) {
        if (this.f1625q != view) {
            this.f1625q = view;
            this.f1624p = Gravity.getAbsoluteGravity(this.f1623o, C2043bi.m5577f(view));
        }
    }

    public final void onDismiss() {
        C0470j jVar;
        int size = this.f1611b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                jVar = null;
                break;
            }
            jVar = (C0470j) this.f1611b.get(i);
            if (!jVar.f1607a.f2366q.isShowing()) {
                break;
            }
            i++;
        }
        if (jVar != null) {
            jVar.f1608b.mo1657g(false);
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo1575m();
        return true;
    }

    /* renamed from: p */
    public final void mo1526p(boolean z) {
        this.f1631w = z;
    }

    /* renamed from: q */
    public final void mo1527q(int i) {
        if (this.f1623o != i) {
            this.f1623o = i;
            this.f1624p = Gravity.getAbsoluteGravity(i, C2043bi.m5577f(this.f1625q));
        }
    }

    /* renamed from: r */
    public final void mo1528r(int i) {
        this.f1627s = true;
        this.f1629u = i;
    }

    /* renamed from: s */
    public final void mo1529s(PopupWindow.OnDismissListener onDismissListener) {
        this.f1634z = onDismissListener;
    }

    /* renamed from: t */
    public final void mo1530t(boolean z) {
        this.f1632x = z;
    }

    /* renamed from: u */
    public final void mo1531u(int i) {
        this.f1628t = true;
        this.f1630v = i;
    }

    /* renamed from: v */
    public final void mo1576v() {
        if (!mo1577x()) {
            for (C0477q C : this.f1620l) {
                m1563C(C);
            }
            this.f1620l.clear();
            View view = this.f1625q;
            this.f1613d = view;
            if (view != null) {
                ViewTreeObserver viewTreeObserver = this.f1614e;
                ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                this.f1614e = viewTreeObserver2;
                if (viewTreeObserver == null) {
                    viewTreeObserver2.addOnGlobalLayoutListener(this.f1612c);
                }
                this.f1613d.addOnAttachStateChangeListener(this.f1621m);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final boolean mo1532w() {
        return false;
    }

    /* renamed from: x */
    public final boolean mo1577x() {
        if (this.f1611b.size() <= 0 || !((C0470j) this.f1611b.get(0)).f1607a.f2366q.isShowing()) {
            return false;
        }
        return true;
    }
}
