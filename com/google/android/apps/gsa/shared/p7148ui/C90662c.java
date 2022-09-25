package com.google.android.apps.gsa.shared.p7148ui;

import android.os.Parcelable;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0213ce;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.C4268a;

/* renamed from: com.google.android.apps.gsa.shared.ui.c */
/* compiled from: PG */
public abstract class C90662c extends C4268a {

    /* renamed from: c */
    private final FragmentManager f253541c;

    /* renamed from: d */
    private C0213ce f253542d = null;

    /* renamed from: e */
    private Fragment f253543e = null;

    public C90662c(FragmentManager fragmentManager) {
        this.f253541c = fragmentManager;
    }

    /* renamed from: o */
    private static String m148014o(int i, int i2) {
        return "android:switcher:" + i + ":" + i2;
    }

    /* renamed from: b */
    public abstract Fragment mo84959b(int i);

    /* renamed from: d */
    public final void mo646d(ViewGroup viewGroup, int i, Object obj) {
        if (this.f253542d == null) {
            this.f253542d = new C0154a(this.f253541c);
        }
        this.f253542d.mo514k((Fragment) obj);
    }

    /* renamed from: g */
    public final void mo647g(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (!fragment.equals(this.f253543e)) {
            Fragment fragment2 = this.f253543e;
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f253543e.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.f253543e = fragment;
        }
    }

    /* renamed from: gv */
    public final Parcelable mo648gv() {
        return null;
    }

    /* renamed from: gw */
    public final Object mo649gw(ViewGroup viewGroup, int i) {
        if (this.f253542d == null) {
            this.f253542d = new C0154a(this.f253541c);
        }
        C0213ce ceVar = this.f253542d;
        Fragment c = this.f253541c.f634a.mo671c(m148014o(viewGroup.getId(), i));
        if (c != null) {
            ceVar.mo687t(c);
        } else {
            c = mo84959b(i);
            ceVar.mo511h(viewGroup.getId(), c, m148014o(viewGroup.getId(), i), 1);
        }
        if (!c.equals(this.f253543e)) {
            c.setMenuVisibility(false);
            c.setUserVisibleHint(false);
        }
        return c;
    }

    /* renamed from: gx */
    public final void mo650gx(ViewGroup viewGroup) {
        C0213ce ceVar = this.f253542d;
        if (ceVar != null) {
            ((C0154a) ceVar).mo505b(true);
            this.f253542d = null;
            this.f253541c.mo467ah();
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
