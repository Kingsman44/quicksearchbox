package android.support.p031v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p031v4.app.Fragment;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.C4268a;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import java.util.ArrayList;

@Deprecated
/* renamed from: android.support.v4.app.cb */
/* compiled from: PG */
public abstract class C0210cb extends C4268a {

    /* renamed from: c */
    private final FragmentManager f790c;

    /* renamed from: d */
    private C0213ce f791d = null;

    /* renamed from: e */
    private final ArrayList f792e = new ArrayList();

    /* renamed from: f */
    private final ArrayList f793f = new ArrayList();

    /* renamed from: g */
    private Fragment f794g = null;

    /* renamed from: h */
    private boolean f795h;

    public C0210cb(FragmentManager fragmentManager) {
        this.f790c = fragmentManager;
    }

    /* renamed from: b */
    public abstract Fragment mo668b(int i);

    /* renamed from: d */
    public void mo646d(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f791d == null) {
            this.f791d = new C0154a(this.f790c);
        }
        while (this.f792e.size() <= i) {
            this.f792e.add((Object) null);
        }
        this.f792e.set(i, fragment.isAdded() ? this.f790c.mo473d(fragment) : null);
        this.f793f.set(i, (Object) null);
        this.f791d.mo516m(fragment);
        if (fragment.equals(this.f794g)) {
            this.f794g = null;
        }
    }

    /* renamed from: g */
    public final void mo647g(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f794g;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f794g.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.f794g = fragment;
        }
    }

    /* renamed from: gv */
    public final Parcelable mo648gv() {
        Bundle bundle;
        if (this.f792e.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f792e.size()];
            this.f792e.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.f793f.size(); i++) {
            Fragment fragment = (Fragment) this.f793f.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f790c.mo443J(bundle, C10662f.f35572a + i, fragment);
            }
        }
        return bundle;
    }

    /* renamed from: gw */
    public final Object mo649gw(ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f793f.size() > i && (fragment = (Fragment) this.f793f.get(i)) != null) {
            return fragment;
        }
        if (this.f791d == null) {
            this.f791d = new C0154a(this.f790c);
        }
        Fragment b = mo668b(i);
        if (this.f792e.size() > i && (savedState = (Fragment.SavedState) this.f792e.get(i)) != null) {
            b.setInitialSavedState(savedState);
        }
        while (this.f793f.size() <= i) {
            this.f793f.add((Object) null);
        }
        b.setMenuVisibility(false);
        b.setUserVisibleHint(false);
        this.f793f.set(i, b);
        this.f791d.mo511h(viewGroup.getId(), b, (String) null, 1);
        return b;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: gx */
    public final void mo650gx(ViewGroup viewGroup) {
        C0213ce ceVar = this.f791d;
        if (ceVar != null) {
            if (!this.f795h) {
                try {
                    this.f795h = true;
                    ceVar.mo510g();
                    this.f795h = false;
                } catch (Throwable th) {
                    this.f795h = false;
                    throw th;
                }
            }
            this.f791d = null;
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
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f792e.clear();
            this.f793f.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f792e.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith(C10662f.f35572a)) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment f = this.f790c.mo474f(bundle, str);
                    if (f != null) {
                        while (this.f793f.size() <= parseInt) {
                            this.f793f.add((Object) null);
                        }
                        f.setMenuVisibility(false);
                        this.f793f.set(parseInt, f);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key ".concat(String.valueOf(str)));
                    }
                }
            }
        }
    }
}
