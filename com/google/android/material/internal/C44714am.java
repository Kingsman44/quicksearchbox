package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p033v7.view.menu.C0451ae;
import android.support.p033v7.view.menu.C0452af;
import android.support.p033v7.view.menu.C0460an;
import android.support.p033v7.view.menu.C0477q;
import android.support.p033v7.view.menu.C0480t;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.material.internal.am */
/* compiled from: PG */
public final class C44714am implements C0452af {

    /* renamed from: A */
    final View.OnClickListener f116540A = new C44766z(this);

    /* renamed from: a */
    public NavigationMenuView f116541a;

    /* renamed from: b */
    public LinearLayout f116542b;

    /* renamed from: c */
    C0477q f116543c;

    /* renamed from: d */
    public int f116544d;

    /* renamed from: e */
    public C44704ac f116545e;

    /* renamed from: f */
    public LayoutInflater f116546f;

    /* renamed from: g */
    public int f116547g = 0;

    /* renamed from: h */
    public ColorStateList f116548h;

    /* renamed from: i */
    public int f116549i = 0;

    /* renamed from: j */
    public ColorStateList f116550j;

    /* renamed from: k */
    public ColorStateList f116551k;

    /* renamed from: l */
    Drawable f116552l;

    /* renamed from: m */
    public RippleDrawable f116553m;

    /* renamed from: n */
    public int f116554n;

    /* renamed from: o */
    public int f116555o;

    /* renamed from: p */
    public int f116556p;

    /* renamed from: q */
    public int f116557q;

    /* renamed from: r */
    public int f116558r;

    /* renamed from: s */
    public int f116559s;

    /* renamed from: t */
    int f116560t;

    /* renamed from: u */
    public boolean f116561u;

    /* renamed from: v */
    public boolean f116562v = true;

    /* renamed from: w */
    public int f116563w;

    /* renamed from: x */
    public int f116564x;

    /* renamed from: y */
    int f116565y;

    /* renamed from: z */
    public int f116566z = -1;

    /* renamed from: a */
    public final int mo1519a() {
        return this.f116544d;
    }

    /* renamed from: c */
    public final void mo1520c(Context context, C0477q qVar) {
        this.f116546f = LayoutInflater.from(context);
        this.f116543c = qVar;
        this.f116565y = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
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
        Bundle bundle = new Bundle();
        if (this.f116541a != null) {
            SparseArray sparseArray = new SparseArray();
            this.f116541a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C44704ac acVar = this.f116545e;
        if (acVar != null) {
            Bundle bundle2 = new Bundle();
            C0480t tVar = acVar.f116532b;
            if (tVar != null) {
                bundle2.putInt("android:menu:checked", tVar.f1682a);
            }
            SparseArray sparseArray2 = new SparseArray();
            int size = acVar.f116531a.size();
            for (int i = 0; i < size; i++) {
                C44706ae aeVar = (C44706ae) acVar.f116531a.get(i);
                if (aeVar instanceof C44708ag) {
                    C0480t tVar2 = ((C44708ag) aeVar).f116537a;
                    View actionView = tVar2 != null ? tVar2.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray2.put(tVar2.f1682a, parcelableSparseArray);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f116542b != null) {
            SparseArray sparseArray3 = new SparseArray();
            this.f116542b.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    /* renamed from: f */
    public final void mo1546f(boolean z) {
        C44704ac acVar = this.f116545e;
        if (acVar != null) {
            acVar.mo48016a();
            acVar.mObservable.mo2879a();
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
        return false;
    }

    /* renamed from: j */
    public final boolean mo1522j(C0480t tVar) {
        return false;
    }

    /* renamed from: k */
    public final void mo48018k(View view) {
        this.f116542b.addView(view);
        NavigationMenuView navigationMenuView = this.f116541a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: l */
    public final void mo48019l(Drawable drawable) {
        this.f116552l = drawable;
        mo1546f(false);
    }

    /* renamed from: m */
    public final void mo48020m(int i) {
        this.f116566z = i;
        NavigationMenuView navigationMenuView = this.f116541a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    /* renamed from: n */
    public final void mo1549n(Parcelable parcelable) {
        C0480t tVar;
        View actionView;
        ParcelableSparseArray parcelableSparseArray;
        C0480t tVar2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f116541a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                C44704ac acVar = this.f116545e;
                int i = bundle2.getInt("android:menu:checked", 0);
                if (i != 0) {
                    acVar.f116533c = true;
                    int size = acVar.f116531a.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        C44706ae aeVar = (C44706ae) acVar.f116531a.get(i2);
                        if ((aeVar instanceof C44708ag) && (tVar2 = ((C44708ag) aeVar).f116537a) != null && tVar2.f1682a == i) {
                            acVar.mo48017b(tVar2);
                            break;
                        }
                        i2++;
                    }
                    acVar.f116533c = false;
                    acVar.mo48016a();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = acVar.f116531a.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        C44706ae aeVar2 = (C44706ae) acVar.f116531a.get(i3);
                        if (!(!(aeVar2 instanceof C44708ag) || (tVar = ((C44708ag) aeVar2).f116537a) == null || (actionView = tVar.getActionView()) == null || (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray2.get(tVar.f1682a)) == null)) {
                            actionView.restoreHierarchyState(parcelableSparseArray);
                        }
                    }
                }
            }
            SparseArray sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f116542b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    /* renamed from: o */
    public final void mo48021o(int i) {
        this.f116560t = i;
        mo1546f(false);
    }

    /* renamed from: p */
    public final void mo48022p(boolean z) {
        C44704ac acVar = this.f116545e;
        if (acVar != null) {
            acVar.f116533c = z;
        }
    }

    /* renamed from: q */
    public final void mo48023q() {
        int i = (this.f116542b.getChildCount() != 0 || !this.f116562v) ? 0 : this.f116564x;
        NavigationMenuView navigationMenuView = this.f116541a;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }
}
