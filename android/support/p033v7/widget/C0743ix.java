package android.support.p033v7.widget;

import android.content.Context;
import android.os.Parcelable;
import android.support.p033v7.view.C0436d;
import android.support.p033v7.view.menu.C0451ae;
import android.support.p033v7.view.menu.C0452af;
import android.support.p033v7.view.menu.C0460an;
import android.support.p033v7.view.menu.C0477q;
import android.support.p033v7.view.menu.C0480t;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.widget.ix */
/* compiled from: PG */
final class C0743ix implements C0452af {

    /* renamed from: a */
    C0477q f2604a;

    /* renamed from: b */
    C0480t f2605b;

    /* renamed from: c */
    final /* synthetic */ Toolbar f2606c;

    public C0743ix(Toolbar toolbar) {
        this.f2606c = toolbar;
    }

    /* renamed from: a */
    public final int mo1519a() {
        return 0;
    }

    /* renamed from: c */
    public final void mo1520c(Context context, C0477q qVar) {
        C0480t tVar;
        C0477q qVar2 = this.f2604a;
        if (!(qVar2 == null || (tVar = this.f2605b) == null)) {
            qVar2.mo1596t(tVar);
        }
        this.f2604a = qVar;
    }

    /* renamed from: d */
    public final void mo1543d(C0477q qVar, boolean z) {
    }

    /* renamed from: e */
    public final void mo1544e(C0451ae aeVar) {
        throw null;
    }

    /* renamed from: eI */
    public final Parcelable mo1545eI() {
        return null;
    }

    /* renamed from: f */
    public final void mo1546f(boolean z) {
        if (this.f2605b != null) {
            C0477q qVar = this.f2604a;
            if (qVar != null) {
                int size = qVar.f1652c.size();
                int i = 0;
                while (i < size) {
                    if (this.f2604a.getItem(i) != this.f2605b) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
            mo1521i(this.f2605b);
        }
    }

    /* renamed from: g */
    public final boolean mo1547g() {
        return false;
    }

    /* renamed from: h */
    public final boolean mo1548h(C0460an anVar) {
        return false;
    }

    /* renamed from: i */
    public final boolean mo1521i(C0480t tVar) {
        View view = this.f2606c.f1947g;
        if (view instanceof C0436d) {
            ((C0436d) view).onActionViewCollapsed();
        }
        Toolbar toolbar = this.f2606c;
        toolbar.removeView(toolbar.f1947g);
        Toolbar toolbar2 = this.f2606c;
        toolbar2.removeView(toolbar2.f1946f);
        Toolbar toolbar3 = this.f2606c;
        toolbar3.f1947g = null;
        int size = toolbar3.f1959s.size();
        while (true) {
            size--;
            if (size >= 0) {
                toolbar3.addView((View) toolbar3.f1959s.get(size));
            } else {
                toolbar3.f1959s.clear();
                this.f2605b = null;
                this.f2606c.requestLayout();
                tVar.mo1698h(false);
                this.f2606c.mo2425z();
                return true;
            }
        }
    }

    /* renamed from: j */
    public final boolean mo1522j(C0480t tVar) {
        Toolbar toolbar = this.f2606c;
        if (toolbar.f1946f == null) {
            toolbar.f1946f = new AppCompatImageButton(toolbar.getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            toolbar.f1946f.setImageDrawable(toolbar.f1944d);
            toolbar.f1946f.setContentDescription(toolbar.f1945e);
            C0744iy iyVar = new C0744iy();
            iyVar.f1134a = (toolbar.f1951k & 112) | 8388611;
            iyVar.f2607b = 2;
            toolbar.f1946f.setLayoutParams(iyVar);
            toolbar.f1946f.setOnClickListener(new C0740iu(toolbar));
        }
        ViewParent parent = this.f2606c.f1946f.getParent();
        Toolbar toolbar2 = this.f2606c;
        if (parent != toolbar2) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar2.f1946f);
            }
            Toolbar toolbar3 = this.f2606c;
            toolbar3.addView(toolbar3.f1946f);
        }
        this.f2606c.f1947g = tVar.getActionView();
        this.f2605b = tVar;
        ViewParent parent2 = this.f2606c.f1947g.getParent();
        Toolbar toolbar4 = this.f2606c;
        if (parent2 != toolbar4) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar4.f1947g);
            }
            C0744iy iyVar2 = new C0744iy();
            Toolbar toolbar5 = this.f2606c;
            iyVar2.f1134a = 8388611 | (toolbar5.f1951k & 112);
            iyVar2.f2607b = 2;
            toolbar5.f1947g.setLayoutParams(iyVar2);
            Toolbar toolbar6 = this.f2606c;
            toolbar6.addView(toolbar6.f1947g);
        }
        Toolbar toolbar7 = this.f2606c;
        int childCount = toolbar7.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar7.getChildAt(childCount);
            if (!(((C0744iy) childAt.getLayoutParams()).f2607b == 2 || childAt == toolbar7.f1941a)) {
                toolbar7.removeViewAt(childCount);
                toolbar7.f1959s.add(childAt);
            }
        }
        this.f2606c.requestLayout();
        tVar.mo1698h(true);
        View view = this.f2606c.f1947g;
        if (view instanceof C0436d) {
            ((C0436d) view).onActionViewExpanded();
        }
        this.f2606c.mo2425z();
        return true;
    }

    /* renamed from: n */
    public final void mo1549n(Parcelable parcelable) {
    }
}
