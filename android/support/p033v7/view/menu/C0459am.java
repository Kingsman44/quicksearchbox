package android.support.p033v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.p033v7.widget.C0578cu;
import android.support.p033v7.widget.C0619eh;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.view.menu.am */
/* compiled from: PG */
final class C0459am extends C0447aa implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener, C0452af {

    /* renamed from: a */
    final C0619eh f1567a;

    /* renamed from: b */
    final ViewTreeObserver.OnGlobalLayoutListener f1568b = new C0457ak(this);

    /* renamed from: c */
    View f1569c;

    /* renamed from: d */
    ViewTreeObserver f1570d;

    /* renamed from: e */
    private final Context f1571e;

    /* renamed from: f */
    private final C0477q f1572f;

    /* renamed from: h */
    private final C0474n f1573h;

    /* renamed from: i */
    private final boolean f1574i;

    /* renamed from: j */
    private final int f1575j;

    /* renamed from: k */
    private final int f1576k;

    /* renamed from: l */
    private final View.OnAttachStateChangeListener f1577l = new C0458al(this);

    /* renamed from: m */
    private PopupWindow.OnDismissListener f1578m;

    /* renamed from: n */
    private View f1579n;

    /* renamed from: o */
    private C0451ae f1580o;

    /* renamed from: p */
    private boolean f1581p;

    /* renamed from: q */
    private boolean f1582q;

    /* renamed from: r */
    private int f1583r;

    /* renamed from: s */
    private int f1584s = 0;

    /* renamed from: t */
    private boolean f1585t;

    public C0459am(Context context, C0477q qVar, View view, int i, boolean z) {
        this.f1571e = context;
        this.f1572f = qVar;
        this.f1574i = z;
        this.f1573h = new C0474n(qVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f1576k = i;
        Resources resources = context.getResources();
        this.f1575j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f1579n = view;
        this.f1567a = new C0619eh(context, i);
        qVar.mo1655f(this, context);
    }

    /* renamed from: d */
    public final void mo1543d(C0477q qVar, boolean z) {
        if (qVar == this.f1572f) {
            mo1575m();
            C0451ae aeVar = this.f1580o;
            if (aeVar != null) {
                aeVar.mo1121a(qVar, z);
            }
        }
    }

    /* renamed from: e */
    public final void mo1544e(C0451ae aeVar) {
        this.f1580o = aeVar;
    }

    /* renamed from: eI */
    public final Parcelable mo1545eI() {
        return null;
    }

    /* renamed from: eJ */
    public final ListView mo1574eJ() {
        return this.f1567a.f2354e;
    }

    /* renamed from: f */
    public final void mo1546f(boolean z) {
        this.f1582q = false;
        C0474n nVar = this.f1573h;
        if (nVar != null) {
            nVar.notifyDataSetChanged();
        }
    }

    /* renamed from: g */
    public final boolean mo1547g() {
        return false;
    }

    /* renamed from: h */
    public final boolean mo1548h(C0460an anVar) {
        if (anVar.hasVisibleItems()) {
            C0450ad adVar = new C0450ad(this.f1571e, anVar, this.f1569c, this.f1574i, this.f1576k);
            adVar.mo1538e(this.f1580o);
            adVar.mo1537d(C0447aa.m1475z(anVar));
            adVar.f1555c = this.f1578m;
            this.f1578m = null;
            this.f1572f.mo1657g(false);
            C0619eh ehVar = this.f1567a;
            int i = ehVar.f2356g;
            int b = ehVar.mo2817b();
            if ((Gravity.getAbsoluteGravity(this.f1584s, C2043bi.m5577f(this.f1579n)) & 7) == 5) {
                i += this.f1579n.getWidth();
            }
            if (!adVar.mo1541h()) {
                if (adVar.f1553a != null) {
                    adVar.mo1540g(i, b, true, true);
                }
            }
            C0451ae aeVar = this.f1580o;
            if (aeVar != null) {
                aeVar.mo1122b(anVar);
            }
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final void mo1523l(C0477q qVar) {
    }

    /* renamed from: m */
    public final void mo1575m() {
        if (mo1577x()) {
            this.f1567a.mo1575m();
        }
    }

    /* renamed from: n */
    public final void mo1549n(Parcelable parcelable) {
    }

    /* renamed from: o */
    public final void mo1524o(View view) {
        this.f1579n = view;
    }

    public final void onDismiss() {
        this.f1581p = true;
        this.f1572f.mo1657g(true);
        ViewTreeObserver viewTreeObserver = this.f1570d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1570d = this.f1569c.getViewTreeObserver();
            }
            this.f1570d.removeGlobalOnLayoutListener(this.f1568b);
            this.f1570d = null;
        }
        this.f1569c.removeOnAttachStateChangeListener(this.f1577l);
        PopupWindow.OnDismissListener onDismissListener = this.f1578m;
        if (onDismissListener != null) {
            ((C0448ab) onDismissListener).f1552a.mo1536c();
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
        this.f1573h.f1644b = z;
    }

    /* renamed from: q */
    public final void mo1527q(int i) {
        this.f1584s = i;
    }

    /* renamed from: r */
    public final void mo1528r(int i) {
        this.f1567a.f2356g = i;
    }

    /* renamed from: s */
    public final void mo1529s(PopupWindow.OnDismissListener onDismissListener) {
        this.f1578m = onDismissListener;
    }

    /* renamed from: t */
    public final void mo1530t(boolean z) {
        this.f1585t = z;
    }

    /* renamed from: u */
    public final void mo1531u(int i) {
        this.f1567a.mo2821j(i);
    }

    /* renamed from: v */
    public final void mo1576v() {
        View view;
        if (!mo1577x()) {
            if (this.f1581p || (view = this.f1579n) == null) {
                throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
            }
            this.f1569c = view;
            this.f1567a.f2366q.setOnDismissListener(this);
            C0619eh ehVar = this.f1567a;
            ehVar.f2361l = this;
            ehVar.mo2829w();
            View view2 = this.f1569c;
            ViewTreeObserver viewTreeObserver = this.f1570d;
            ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
            this.f1570d = viewTreeObserver2;
            if (viewTreeObserver == null) {
                viewTreeObserver2.addOnGlobalLayoutListener(this.f1568b);
            }
            view2.addOnAttachStateChangeListener(this.f1577l);
            C0619eh ehVar2 = this.f1567a;
            ehVar2.f2360k = view2;
            ehVar2.f2359j = this.f1584s;
            if (!this.f1582q) {
                this.f1583r = m1473A(this.f1573h, this.f1571e, this.f1575j);
                this.f1582q = true;
            }
            this.f1567a.mo2825r(this.f1583r);
            this.f1567a.mo2828u();
            this.f1567a.mo2826s(this.f1551g);
            this.f1567a.mo1576v();
            C0578cu cuVar = this.f1567a.f2354e;
            cuVar.setOnKeyListener(this);
            if (this.f1585t && this.f1572f.f1656g != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1571e).inflate(R.layout.abc_popup_menu_header_item_layout, cuVar, false);
                TextView textView = (TextView) frameLayout.findViewById(16908310);
                if (textView != null) {
                    textView.setText(this.f1572f.f1656g);
                }
                frameLayout.setEnabled(false);
                cuVar.addHeaderView(frameLayout, (Object) null, false);
            }
            this.f1567a.mo2532e(this.f1573h);
            this.f1567a.mo1576v();
        }
    }

    /* renamed from: x */
    public final boolean mo1577x() {
        return !this.f1581p && this.f1567a.f2366q.isShowing();
    }
}
