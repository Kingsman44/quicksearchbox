package com.google.android.apps.gsa.shared.p7148ui;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.C4268a;

/* renamed from: com.google.android.apps.gsa.shared.ui.o */
/* compiled from: PG */
public abstract class C90703o extends C4268a {

    /* renamed from: c */
    private final FragmentManager f253725c;

    /* renamed from: d */
    private FragmentTransaction f253726d = null;

    /* renamed from: e */
    private Fragment f253727e = null;

    public C90703o(FragmentManager fragmentManager) {
        this.f253725c = fragmentManager;
    }

    /* renamed from: o */
    private static String m148096o(int i, int i2) {
        return "android:switcher:" + i + ":" + i2;
    }

    /* renamed from: b */
    public abstract Fragment mo85033b(int i);

    /* renamed from: d */
    public final void mo646d(ViewGroup viewGroup, int i, Object obj) {
        if (this.f253726d == null) {
            this.f253726d = this.f253725c.beginTransaction();
        }
        this.f253726d.detach((Fragment) obj);
    }

    /* renamed from: g */
    public final void mo647g(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f253727e;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f253727e.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.f253727e = fragment;
        }
    }

    /* renamed from: gv */
    public final Parcelable mo648gv() {
        return null;
    }

    /* renamed from: gw */
    public final Object mo649gw(ViewGroup viewGroup, int i) {
        if (this.f253726d == null) {
            this.f253726d = this.f253725c.beginTransaction();
        }
        FragmentTransaction fragmentTransaction = this.f253726d;
        Fragment findFragmentByTag = this.f253725c.findFragmentByTag(m148096o(viewGroup.getId(), i));
        if (findFragmentByTag != null) {
            fragmentTransaction.attach(findFragmentByTag);
        } else {
            findFragmentByTag = mo85033b(i);
            fragmentTransaction.add(viewGroup.getId(), findFragmentByTag, m148096o(viewGroup.getId(), i));
        }
        if (findFragmentByTag != this.f253727e) {
            findFragmentByTag.setMenuVisibility(false);
            findFragmentByTag.setUserVisibleHint(false);
        }
        return findFragmentByTag;
    }

    /* renamed from: gx */
    public final void mo650gx(ViewGroup viewGroup) {
        FragmentTransaction fragmentTransaction = this.f253726d;
        if (fragmentTransaction != null) {
            fragmentTransaction.commitAllowingStateLoss();
            this.f253726d = null;
            this.f253725c.executePendingTransactions();
        }
    }

    /* renamed from: h */
    public final void mo651h(ViewGroup viewGroup) {
    }

    /* renamed from: i */
    public final boolean mo652i(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    /* renamed from: jT */
    public final void mo653jT(Parcelable parcelable, ClassLoader classLoader) {
    }
}
