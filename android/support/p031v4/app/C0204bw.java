package android.support.p031v4.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.C4268a;

@Deprecated
/* renamed from: android.support.v4.app.bw */
/* compiled from: PG */
public abstract class C0204bw extends C4268a {

    /* renamed from: c */
    private final FragmentManager f780c;

    /* renamed from: d */
    private C0213ce f781d = null;

    /* renamed from: e */
    private Fragment f782e = null;

    /* renamed from: f */
    private boolean f783f;

    public C0204bw(FragmentManager fragmentManager) {
        this.f780c = fragmentManager;
    }

    /* renamed from: o */
    private static String m441o(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    /* renamed from: b */
    public abstract Fragment mo645b(int i);

    /* renamed from: d */
    public final void mo646d(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f781d == null) {
            this.f781d = new C0154a(this.f780c);
        }
        this.f781d.mo514k(fragment);
        if (fragment.equals(this.f782e)) {
            this.f782e = null;
        }
    }

    /* renamed from: g */
    public final void mo647g(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f782e;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f782e.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.f782e = fragment;
        }
    }

    /* renamed from: gv */
    public final Parcelable mo648gv() {
        return null;
    }

    /* renamed from: gw */
    public final Object mo649gw(ViewGroup viewGroup, int i) {
        if (this.f781d == null) {
            this.f781d = new C0154a(this.f780c);
        }
        long j = (long) i;
        Fragment c = this.f780c.f634a.mo671c(m441o(viewGroup.getId(), j));
        if (c != null) {
            this.f781d.mo687t(c);
        } else {
            c = mo645b(i);
            this.f781d.mo511h(viewGroup.getId(), c, m441o(viewGroup.getId(), j), 1);
        }
        if (c != this.f782e) {
            c.setMenuVisibility(false);
            c.setUserVisibleHint(false);
        }
        return c;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: gx */
    public final void mo650gx(ViewGroup viewGroup) {
        C0213ce ceVar = this.f781d;
        if (ceVar != null) {
            if (!this.f783f) {
                try {
                    this.f783f = true;
                    ceVar.mo510g();
                    this.f783f = false;
                } catch (Throwable th) {
                    this.f783f = false;
                    throw th;
                }
            }
            this.f781d = null;
        }
    }

    /* renamed from: h */
    public final void mo651h(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    /* renamed from: i */
    public final boolean mo652i(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    /* renamed from: jT */
    public final void mo653jT(Parcelable parcelable, ClassLoader classLoader) {
    }
}
