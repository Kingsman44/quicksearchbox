package com.google.android.libraries.logging.p2185ve;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28315b;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28316c;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28317d;
import com.google.android.libraries.logging.p2185ve.p2201h.C28429b;
import com.google.android.libraries.logging.p2185ve.p2201h.C28432e;
import com.google.android.libraries.logging.p2185ve.p2201h.C28437j;
import com.google.android.libraries.logging.p2185ve.p2201h.C28438k;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58838bb;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.libraries.logging.ve.y */
/* compiled from: PG */
public final class C28485y implements View.OnAttachStateChangeListener, View.OnLayoutChangeListener, C28316c {

    /* renamed from: f */
    public static final /* synthetic */ int f77298f = 0;

    /* renamed from: a */
    public final View f77299a;

    /* renamed from: b */
    public ViewGroup f77300b;

    /* renamed from: c */
    public boolean f77301c = false;

    /* renamed from: d */
    public final C28438k f77302d;

    /* renamed from: e */
    public Runnable f77303e = null;

    /* renamed from: g */
    private final C28439i f77304g;

    /* renamed from: h */
    private final C28317d f77305h;

    /* renamed from: i */
    private C28439i f77306i;

    /* renamed from: j */
    private List f77307j;

    /* renamed from: k */
    private boolean f77308k = false;

    /* renamed from: l */
    private boolean f77309l = false;

    /* renamed from: m */
    private boolean f77310m = false;

    /* renamed from: n */
    private C28439i f77311n = null;

    /* renamed from: o */
    private final Rect f77312o = new Rect();

    /* renamed from: p */
    private boolean f77313p = false;

    /* renamed from: q */
    private final ViewTreeObserver.OnDrawListener f77314q;

    /* renamed from: r */
    private int f77315r = 2;

    private C28485y(View view, C28439i iVar) {
        this.f77299a = view;
        this.f77304g = iVar;
        this.f77305h = iVar.f77219e;
        C28438k kVar = (C28438k) iVar.f77217c.mo58881i(C28432e.f77206a);
        this.f77302d = kVar;
        int a = C28437j.m53123a(kVar.f77211a);
        if (a != 0 && a == 3) {
            this.f77314q = new C28484x(this);
        } else {
            this.f77314q = null;
        }
    }

    /* renamed from: a */
    public static C28439i m53234a(View view) {
        return (C28439i) view.getTag(R.id.ve_tag);
    }

    /* renamed from: o */
    public static boolean m53235o(View view) {
        return view.getId() == 16908290;
    }

    /* renamed from: q */
    static void m53236q(View view, C28439i iVar) {
        C28485y yVar = new C28485y(view, iVar);
        iVar.f77220f = yVar;
        yVar.f77299a.setTag(R.id.ve_tag, yVar.f77304g);
        if (yVar.f77305h.mo33835c()) {
            yVar.f77299a.addOnAttachStateChangeListener(yVar);
            if (C2043bi.m5569aw(yVar.f77299a)) {
                yVar.onViewAttachedToWindow(yVar.f77299a);
            }
        }
    }

    /* renamed from: t */
    private static String m53237t(View view) {
        if (view.getId() != -1) {
            try {
                return view.getResources().getResourceEntryName(view.getId());
            } catch (Resources.NotFoundException unused) {
                return String.valueOf(view.getClass().getSimpleName()).concat("#ResourceNotFoundException");
            }
        } else {
            String simpleName = view.getClass().getSimpleName();
            String valueOf = String.valueOf(view.getTag());
            return simpleName + "#" + valueOf;
        }
    }

    /* renamed from: u */
    private final void m53238u() {
        Runnable runnable = this.f77303e;
        if (runnable != null) {
            C19559g.m37302a().removeCallbacks(runnable);
            this.f77303e = null;
        }
    }

    /* renamed from: v */
    private final void m53239v() {
        int a;
        m53238u();
        int a2 = C28437j.m53123a(this.f77302d.f77211a);
        if (a2 != 0 && a2 == 3) {
            this.f77299a.getViewTreeObserver().removeOnDrawListener(this.f77314q);
        }
        if (this.f77300b == null || ((a = C28437j.m53123a(this.f77302d.f77211a)) != 0 && a == 2)) {
            this.f77299a.removeOnLayoutChangeListener(this);
        }
        ViewGroup viewGroup = this.f77300b;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener(this);
            this.f77300b = null;
        }
    }

    /* renamed from: w */
    private final void m53240w() {
        int a;
        C58838bb.m90883r(this.f77308k);
        if (this.f77310m) {
            ViewGroup viewGroup = (ViewGroup) this.f77299a.getRootView().findViewById(16908290);
            viewGroup.getClass();
            this.f77300b = viewGroup;
        } else {
            this.f77300b = (ViewGroup) this.f77299a.getParent();
        }
        ViewGroup viewGroup2 = this.f77300b;
        if (viewGroup2 != null) {
            viewGroup2.addOnLayoutChangeListener(this);
        } else if (Log.isLoggable("GIL", 3) && !this.f77299a.isTemporarilyDetached()) {
            Log.d("GIL", "Unexpected null parent: ".concat(String.valueOf(String.valueOf(this.f77304g))));
        }
        if (this.f77300b == null || ((a = C28437j.m53123a(this.f77302d.f77211a)) != 0 && a == 2)) {
            this.f77299a.addOnLayoutChangeListener(this);
        }
        int a2 = C28437j.m53123a(this.f77302d.f77211a);
        if (a2 != 0 && a2 == 3) {
            this.f77299a.getViewTreeObserver().addOnDrawListener(this.f77314q);
        }
    }

    /* renamed from: x */
    private static void m53241x(View view, C28315b bVar) {
        C28439i a = m53234a(view);
        if (a != null) {
            C28316c cVar = a.f77220f;
            if (cVar instanceof C28485y) {
                C28485y yVar = (C28485y) cVar;
                if (yVar.f77306i != null || yVar.f77310m) {
                    return;
                }
            }
            bVar.mo33799b(a);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m53241x(viewGroup.getChildAt(i), bVar);
            }
        }
    }

    /* renamed from: y */
    private final int m53242y() {
        if (this.f77299a.getVisibility() != 0) {
            return 2;
        }
        if (this.f77310m && !this.f77299a.isShown()) {
            return 2;
        }
        int a = C28437j.m53123a(this.f77302d.f77211a);
        if (!(a == 0 || a == 1)) {
            ViewGroup viewGroup = this.f77300b;
            if (viewGroup == null) {
                return 2;
            }
            this.f77312o.set(viewGroup.getScrollX(), this.f77300b.getScrollY(), this.f77300b.getWidth() + this.f77300b.getScrollX(), this.f77300b.getHeight() + this.f77300b.getScrollY());
            if (this.f77299a.getLeft() > this.f77312o.left || this.f77299a.getTop() > this.f77312o.top || this.f77299a.getRight() < this.f77312o.right || this.f77299a.getBottom() < this.f77312o.bottom) {
                if (this.f77312o.intersect(this.f77299a.getLeft(), this.f77299a.getTop(), this.f77299a.getRight(), this.f77299a.getBottom())) {
                    Log.d("GIL", "V=".concat(this.f77312o.toString()));
                    int width = ((this.f77312o.width() * this.f77312o.height()) * 100) / (this.f77299a.getWidth() * this.f77299a.getHeight());
                    C28429b bVar = this.f77302d.f77213c;
                    if (bVar == null) {
                        bVar = C28429b.f77199b;
                    }
                    if (width < bVar.f77201a) {
                        return 2;
                    }
                }
                return 2;
            }
        }
        return 1;
    }

    /* renamed from: z */
    private final boolean m53243z(int i) {
        int i2 = this.f77315r;
        if (i == i2) {
            return false;
        }
        this.f77315r = i;
        if (!this.f77309l) {
            return true;
        }
        this.f77305h.mo33836d(this.f77304g, i2, i);
        return true;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo33819b() {
        if (mo33830n() || this.f77310m) {
            return null;
        }
        C28439i iVar = this.f77306i;
        if (iVar != null || (iVar = this.f77311n) != null) {
            return iVar;
        }
        ViewParent parent = this.f77299a.getParent();
        while (parent != null && (parent instanceof View)) {
            View view = (View) parent;
            C28439i a = m53234a(view);
            if (a != null) {
                if (!this.f77308k) {
                    return a;
                }
                this.f77311n = a;
                return a;
            } else if (m53235o(view)) {
                return null;
            } else {
                parent = parent.getParent();
            }
        }
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo33820c(Object obj) {
        if (this.f77307j == null) {
            this.f77307j = new ArrayList();
        }
        C28316c cVar = ((C28439i) obj).f77220f;
        C58838bb.m90868c(this.f77307j.add(obj));
        cVar.mo33826i(this.f77304g);
        if (this.f77308k) {
            cVar.mo33823f();
        }
    }

    /* renamed from: d */
    public final void mo33821d() {
        C58838bb.m90884s(this.f77306i != null, "No parent override to unset");
        this.f77306i = null;
        if (this.f77308k) {
            mo33823f();
        }
    }

    /* renamed from: e */
    public final void mo33822e() {
        if (this.f77305h.mo33835c()) {
            this.f77299a.removeOnAttachStateChangeListener(this);
            if (C2043bi.m5569aw(this.f77299a)) {
                onViewDetachedFromWindow(this.f77299a);
            }
        }
        C28439i iVar = this.f77306i;
        if (iVar != null) {
            iVar.f77220f.mo33825h(this.f77304g);
        }
        List<C28439i> list = this.f77307j;
        if (list != null) {
            for (C28439i iVar2 : list) {
                if (this.f77308k) {
                    iVar2.f77220f.mo33824g();
                }
                iVar2.f77220f.mo33821d();
            }
            this.f77307j.clear();
            this.f77307j = null;
        }
        this.f77311n = null;
        this.f77299a.setTag(R.id.ve_tag, (Object) null);
    }

    /* renamed from: f */
    public final void mo33823f() {
        if (this.f77308k && !this.f77309l) {
            this.f77309l = true;
            this.f77305h.mo33833a(this.f77304g);
            List<C28439i> list = this.f77307j;
            if (list != null) {
                for (C28439i iVar : list) {
                    iVar.f77220f.mo33823f();
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo33824g() {
        if (this.f77309l) {
            this.f77309l = false;
            List<C28439i> list = this.f77307j;
            if (list != null) {
                for (C28439i iVar : list) {
                    iVar.f77220f.mo33824g();
                }
            }
            this.f77305h.mo33834b(this.f77304g);
            this.f77311n = null;
        }
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo33825h(Object obj) {
        C58838bb.m90868c(this.f77307j.remove(obj));
        C28316c cVar = ((C28439i) obj).f77220f;
        if (this.f77308k) {
            cVar.mo33824g();
        }
        cVar.mo33821d();
    }

    /* renamed from: j */
    public final void mo33827j() {
        throw null;
    }

    /* renamed from: k */
    public final void mo33938k() {
        m53238u();
        if (m53243z(m53242y()) && this.f77300b != null && Log.isLoggable("GIL", 2)) {
            Log.v("GIL", String.format(Locale.US, "Visibility: %s v=%s\tpbb=%d,%d,%d,%d cbb=%d,%d,%d,%d", new Object[]{this.f77304g, m53237t(this.f77299a), Integer.valueOf(this.f77300b.getScrollX()), Integer.valueOf(this.f77300b.getScrollY()), Integer.valueOf(this.f77300b.getWidth() + this.f77300b.getScrollX()), Integer.valueOf(this.f77300b.getHeight() + this.f77300b.getScrollY()), Integer.valueOf(this.f77299a.getLeft()), Integer.valueOf(this.f77299a.getTop()), Integer.valueOf(this.f77299a.getRight()), Integer.valueOf(this.f77299a.getBottom())}));
        }
        this.f77303e = null;
    }

    /* renamed from: l */
    public final void mo33828l(C28315b bVar) {
        View view = this.f77299a;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m53241x(viewGroup.getChildAt(i), bVar);
            }
        }
        List list = this.f77307j;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    bVar.mo33799b((C28439i) this.f77307j.get(size));
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: m */
    public final boolean mo33829m() {
        return this.f77309l;
    }

    /* renamed from: n */
    public final boolean mo33830n() {
        return (this.f77306i == null && m53235o(this.f77299a)) || this.f77310m;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = view;
        int a = C28437j.m53123a(this.f77302d.f77211a);
        int i9 = 1;
        if (a != 0 && a == 2) {
            if (!this.f77313p || view2 != this.f77300b) {
                View view3 = this.f77299a;
                boolean z = view2 != view3;
                if (view2 == view3) {
                    this.f77313p = true;
                } else {
                    this.f77313p = false;
                }
                if (this.f77300b == null) {
                    C58838bb.m90883r(!z);
                    ViewGroup viewGroup = (ViewGroup) this.f77299a.getParent();
                    this.f77300b = viewGroup;
                    viewGroup.addOnLayoutChangeListener(this);
                }
            } else {
                this.f77313p = false;
                if (Log.isLoggable("GIL", 2)) {
                    Log.v("GIL", String.format(Locale.US, "LayoutChange: %s (Skipped)", new Object[]{this.f77304g}));
                    return;
                }
                return;
            }
        } else if (view2 == this.f77299a) {
            C58838bb.m90883r(this.f77300b == null);
            ViewGroup viewGroup2 = (ViewGroup) this.f77299a.getParent();
            this.f77300b = viewGroup2;
            viewGroup2.addOnLayoutChangeListener(this);
            this.f77299a.removeOnLayoutChangeListener(this);
        }
        if (Log.isLoggable("GIL", 2)) {
            if (this.f77300b == null) {
                Throwable th = new Throwable();
                th.fillInStackTrace();
                Locale locale = Locale.US;
                View view4 = this.f77299a;
                Log.w("GIL", String.format(locale, "You have a bug in your layout code. %s Expected [%s] Got [%s] Parent [%s]", new Object[]{this.f77304g, view4, view2, view4.getParent()}), th);
                return;
            }
            Locale locale2 = Locale.US;
            Object[] objArr = new Object[23];
            objArr[0] = this.f77304g;
            objArr[1] = m53237t(this.f77299a);
            if (view2 != this.f77300b) {
                i9 = 0;
            }
            objArr[2] = Integer.valueOf(i9);
            objArr[3] = Integer.valueOf(this.f77299a.isDirty() ? 1 : 0);
            objArr[4] = Integer.valueOf(this.f77299a.isLayoutRequested() ? 1 : 0);
            objArr[5] = Integer.valueOf(view.isDirty() ? 1 : 0);
            objArr[6] = Integer.valueOf(view.isLayoutRequested() ? 1 : 0);
            objArr[7] = Integer.valueOf(i5);
            objArr[8] = Integer.valueOf(i);
            objArr[9] = Integer.valueOf(i6);
            objArr[10] = Integer.valueOf(i2);
            objArr[11] = Integer.valueOf(i7);
            objArr[12] = Integer.valueOf(i3);
            objArr[13] = Integer.valueOf(i8);
            objArr[14] = Integer.valueOf(i4);
            objArr[15] = Integer.valueOf(this.f77300b.getScrollX());
            objArr[16] = Integer.valueOf(this.f77300b.getScrollY());
            objArr[17] = Integer.valueOf(this.f77300b.getWidth() + this.f77300b.getScrollX());
            objArr[18] = Integer.valueOf(this.f77300b.getHeight() + this.f77300b.getScrollY());
            objArr[19] = Integer.valueOf(this.f77299a.getLeft());
            objArr[20] = Integer.valueOf(this.f77299a.getTop());
            objArr[21] = Integer.valueOf(this.f77299a.getRight());
            objArr[22] = Integer.valueOf(this.f77299a.getBottom());
            Log.v("GIL", String.format(locale2, "LayoutChange: %s v=%s p=%d d=%d lr=%d pd=%d plr=%d\tl=%d,%d t=%d,%d r=%d,%d b=%d,%d\tpbb=%d,%d,%d,%d cbb=%d,%d,%d,%d", objArr));
        }
        if (!this.f77301c) {
            mo33938k();
        }
    }

    public final void onViewAttachedToWindow(View view) {
        C58838bb.m90883r(!this.f77308k);
        if (Log.isLoggable("GIL", 2) && view.getParent() == null) {
            Log.v("GIL", "Attached View had no parent: ".concat(String.valueOf(m53237t(view))));
        }
        this.f77308k = true;
        m53240w();
        mo33823f();
        if (!this.f77301c) {
            mo33938k();
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        C58838bb.m90883r(this.f77308k);
        if (Log.isLoggable("GIL", 2) && view.getParent() == null) {
            Log.v("GIL", "Detached View had no parent: ".concat(String.valueOf(m53237t(view))));
        }
        this.f77308k = false;
        m53239v();
        C28439i iVar = this.f77306i;
        if (iVar != null) {
            iVar.f77220f.mo33825h(this.f77304g);
            C58838bb.m90890y(!this.f77309l, "CVE (%s) was child of detached CVE (%s).", this.f77304g, this.f77306i);
            return;
        }
        mo33824g();
    }

    /* renamed from: p */
    public final void mo33942p(boolean z) {
        if (this.f77310m != z) {
            boolean z2 = false;
            C58838bb.m90883r(this.f77306i == null);
            if (!z || !m53235o(this.f77299a)) {
                z2 = true;
            }
            C58838bb.m90868c(z2);
            if (this.f77308k) {
                m53239v();
            }
            this.f77310m = z;
            if (this.f77308k) {
                m53240w();
            }
        }
    }

    /* renamed from: r */
    public final int mo33831r() {
        return this.f77301c ? this.f77315r : m53242y();
    }

    /* renamed from: s */
    public final void mo33832s(int i) {
        if (i == 1) {
            this.f77301c = false;
            mo33938k();
            return;
        }
        this.f77301c = true;
        m53243z(2);
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo33826i(Object obj) {
        obj.getClass();
        C28439i iVar = this.f77306i;
        C58838bb.m90890y(iVar == null, "CVE (%s) has a parent override (%s). Swapping prohibited.", this.f77304g, iVar);
        C58838bb.m90884s(!this.f77310m, "Isolated trees cannot have parents.");
        if (this.f77308k) {
            C58838bb.m90879n(((C28439i) obj).f77220f.mo33829m(), "Attached CVE (%s) cannot be a child of a detached CVE (%s).", this.f77304g, obj);
            mo33824g();
        }
        this.f77306i = (C28439i) obj;
    }
}
