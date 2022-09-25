package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.p097i.C1974i;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2389t;
import androidx.lifecycle.C2391v;
import androidx.p060c.C0978h;
import androidx.p060c.C0979i;
import androidx.p060c.C0981k;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import java.util.ArrayList;

/* compiled from: PG */
public abstract class FragmentStateAdapter extends C0640fb implements C4297l {

    /* renamed from: a */
    final C2384o f13862a;

    /* renamed from: b */
    final FragmentManager f13863b;

    /* renamed from: c */
    final C0981k f13864c = new C0981k(10);

    /* renamed from: d */
    public final C4290e f13865d = new C4290e();

    /* renamed from: e */
    boolean f13866e = false;

    /* renamed from: f */
    private final C0981k f13867f = new C0981k(10);

    /* renamed from: g */
    private final C0981k f13868g = new C0981k(10);

    /* renamed from: h */
    private C4293h f13869h;

    /* renamed from: i */
    private boolean f13870i = false;

    public FragmentStateAdapter(Fragment fragment) {
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        C2384o lifecycle = fragment.getLifecycle();
        this.f13863b = childFragmentManager;
        this.f13862a = lifecycle;
        super.setHasStableIds(true);
    }

    /* renamed from: g */
    static final void m12296g(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    /* renamed from: h */
    private static long m12297h(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    /* renamed from: i */
    private final Long m12298i(int i) {
        Long l = null;
        for (int i2 = 0; i2 < this.f13868g.mo3675c(); i2++) {
            if (((Integer) this.f13868g.mo3680g(i2)).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(this.f13868g.mo3677d(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l;
    }

    /* renamed from: j */
    private static String m12299j(String str, long j) {
        return str + j;
    }

    /* renamed from: k */
    private final void m12300k(long j) {
        ViewParent parent;
        Fragment fragment = (Fragment) this.f13864c.mo3678e(j);
        if (fragment != null) {
            if (!(fragment.getView() == null || (parent = fragment.getView().getParent()) == null)) {
                ((FrameLayout) parent).removeAllViews();
            }
            if (!mo9196f(j)) {
                this.f13867f.mo3683j(j);
            }
            if (!fragment.isAdded()) {
                this.f13864c.mo3683j(j);
            } else if (this.f13863b.mo461ab()) {
                this.f13870i = true;
            } else {
                if (fragment.isAdded() && mo9196f(j)) {
                    C4290e eVar = this.f13865d;
                    ArrayList arrayList = new ArrayList();
                    for (C4295j d : eVar.f13882a) {
                        arrayList.add(d.mo9208d());
                    }
                    Fragment.SavedState d2 = this.f13863b.mo473d(fragment);
                    C4290e.m12317b(arrayList);
                    this.f13867f.mo3682i(j, d2);
                }
                C4290e eVar2 = this.f13865d;
                ArrayList arrayList2 = new ArrayList();
                for (C4295j c : eVar2.f13882a) {
                    arrayList2.add(c.mo9207c());
                }
                try {
                    C0154a aVar = new C0154a(this.f13863b);
                    aVar.mo516m(fragment);
                    aVar.mo509f();
                    this.f13864c.mo3683j(j);
                } finally {
                    C4290e.m12317b(arrayList2);
                }
            }
        }
    }

    /* renamed from: l */
    private final void m12301l(Fragment fragment, FrameLayout frameLayout) {
        FragmentManager fragmentManager = this.f13863b;
        fragmentManager.f644k.mo606o(new C4287b(fragment, frameLayout), false);
    }

    /* renamed from: m */
    private static boolean m12302m(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    /* renamed from: a */
    public final Parcelable mo9191a() {
        Bundle bundle = new Bundle(this.f13864c.mo3675c() + this.f13867f.mo3675c());
        for (int i = 0; i < this.f13864c.mo3675c(); i++) {
            long d = this.f13864c.mo3677d(i);
            Fragment fragment = (Fragment) this.f13864c.mo3678e(d);
            if (fragment != null && fragment.isAdded()) {
                this.f13863b.mo443J(bundle, m12299j("f#", d), fragment);
            }
        }
        for (int i2 = 0; i2 < this.f13867f.mo3675c(); i2++) {
            long d2 = this.f13867f.mo3677d(i2);
            if (mo9196f(d2)) {
                bundle.putParcelable(m12299j("s#", d2), (Parcelable) this.f13867f.mo3678e(d2));
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public abstract Fragment mo9192b(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo9193c() {
        Fragment fragment;
        View view;
        if (this.f13870i && !this.f13863b.mo461ab()) {
            C0979i iVar = new C0979i(0);
            for (int i = 0; i < this.f13864c.mo3675c(); i++) {
                long d = this.f13864c.mo3677d(i);
                if (!mo9196f(d)) {
                    iVar.add(Long.valueOf(d));
                    this.f13868g.mo3683j(d);
                }
            }
            if (!this.f13866e) {
                this.f13870i = false;
                for (int i2 = 0; i2 < this.f13864c.mo3675c(); i2++) {
                    long d2 = this.f13864c.mo3677d(i2);
                    if (!this.f13868g.mo3685l(d2) && ((fragment = (Fragment) this.f13864c.mo3678e(d2)) == null || (view = fragment.getView()) == null || view.getParent() == null)) {
                        iVar.add(Long.valueOf(d2));
                    }
                }
            }
            C0978h hVar = new C0978h(iVar);
            while (hVar.hasNext()) {
                m12300k(((Long) hVar.next()).longValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo9194d(final C4296k kVar) {
        Fragment fragment = (Fragment) this.f13864c.mo3678e(kVar.mItemId);
        if (fragment != null) {
            FrameLayout frameLayout = (FrameLayout) kVar.itemView;
            View view = fragment.getView();
            if (!fragment.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            } else if (fragment.isAdded() && view == null) {
                m12301l(fragment, frameLayout);
            } else if (!fragment.isAdded() || view.getParent() == null) {
                if (fragment.isAdded()) {
                    m12296g(view, frameLayout);
                } else if (!this.f13863b.mo461ab()) {
                    m12301l(fragment, frameLayout);
                    C4290e eVar = this.f13865d;
                    ArrayList arrayList = new ArrayList();
                    for (C4295j b : eVar.f13882a) {
                        arrayList.add(b.mo9206b());
                    }
                    try {
                        fragment.setMenuVisibility(false);
                        C0154a aVar = new C0154a(this.f13863b);
                        aVar.mo685r(fragment, C10662f.f35572a + kVar.mItemId);
                        aVar.mo517n(fragment, C2383n.STARTED);
                        aVar.mo509f();
                        this.f13869h.mo9203a(false);
                    } finally {
                        C4290e.m12317b(arrayList);
                    }
                } else if (!this.f13863b.f659z) {
                    this.f13862a.mo5790b(new C2389t() {
                        /* renamed from: eN */
                        public final void mo416eN(C2391v vVar, C2382m mVar) {
                            if (!FragmentStateAdapter.this.f13863b.mo461ab()) {
                                vVar.getLifecycle().mo5791c(this);
                                if (C2043bi.m5569aw((FrameLayout) kVar.itemView)) {
                                    FragmentStateAdapter.this.mo9194d(kVar);
                                }
                            }
                        }
                    });
                }
            } else if (view.getParent() != frameLayout) {
                m12296g(view, frameLayout);
            }
        } else {
            throw new IllegalStateException("Design assumption violated.");
        }
    }

    /* renamed from: e */
    public final void mo9195e(Parcelable parcelable) {
        if (!this.f13867f.mo3686m() || !this.f13864c.mo3686m()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (m12302m(str, "f#")) {
                this.f13864c.mo3682i(m12297h(str, "f#"), this.f13863b.mo474f(bundle, str));
            } else if (m12302m(str, "s#")) {
                long h = m12297h(str, "s#");
                Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                if (mo9196f(h)) {
                    this.f13867f.mo3682i(h, savedState);
                }
            } else {
                throw new IllegalArgumentException("Unexpected key in savedState: ".concat(String.valueOf(str)));
            }
        }
        if (!this.f13864c.mo3686m()) {
            this.f13870i = true;
            this.f13866e = true;
            mo9193c();
            final Handler handler = new Handler(Looper.getMainLooper());
            final C4288c cVar = new C4288c(this);
            this.f13862a.mo5790b(new C2389t() {
                /* renamed from: eN */
                public final void mo416eN(C2391v vVar, C2382m mVar) {
                    if (mVar == C2382m.ON_DESTROY) {
                        handler.removeCallbacks(cVar);
                        vVar.getLifecycle().mo5791c(this);
                    }
                }
            });
            handler.postDelayed(cVar, 10000);
        }
    }

    /* renamed from: f */
    public final boolean mo9196f(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C1974i.m5313a(this.f13869h == null);
        C4293h hVar = new C4293h(this);
        this.f13869h = hVar;
        hVar.f13888d = C4293h.m12323b(recyclerView);
        hVar.f13885a = new C4291f(hVar);
        hVar.f13888d.f13892b.mo9232c(hVar.f13885a);
        hVar.f13886b = new C4292g(hVar);
        hVar.f13889e.mObservable.registerObserver(hVar.f13886b);
        hVar.f13887c = new FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3(hVar);
        hVar.f13889e.f13862a.mo5790b(hVar.f13887c);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C4296k kVar = (C4296k) ghVar;
        long j = kVar.mItemId;
        int id = ((FrameLayout) kVar.itemView).getId();
        Long i2 = m12298i(id);
        if (!(i2 == null || i2.longValue() == j)) {
            m12300k(i2.longValue());
            this.f13868g.mo3683j(i2.longValue());
        }
        this.f13868g.mo3682i(j, Integer.valueOf(id));
        long j2 = (long) i;
        if (!this.f13864c.mo3685l(j2)) {
            Fragment b = mo9192b(i);
            b.setInitialSavedState((Fragment.SavedState) this.f13867f.mo3678e(j2));
            this.f13864c.mo3682i(j2, b);
        }
        FrameLayout frameLayout = (FrameLayout) kVar.itemView;
        if (C2043bi.m5569aw(frameLayout)) {
            if (frameLayout.getParent() == null) {
                frameLayout.addOnLayoutChangeListener(new C4286a(this, frameLayout, kVar));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        mo9193c();
    }

    public final /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(C2043bi.m5574c());
        frameLayout.setSaveEnabled(false);
        return new C4296k(frameLayout);
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C4293h hVar = this.f13869h;
        ViewPager2 b = C4293h.m12323b(recyclerView);
        b.f13892b.mo9234e(hVar.f13885a);
        FragmentStateAdapter fragmentStateAdapter = hVar.f13889e;
        fragmentStateAdapter.mObservable.unregisterObserver(hVar.f13886b);
        hVar.f13889e.f13862a.mo5791c(hVar.f13887c);
        hVar.f13888d = null;
        this.f13869h = null;
    }

    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(C0673gh ghVar) {
        C4296k kVar = (C4296k) ghVar;
        return true;
    }

    public final /* synthetic */ void onViewAttachedToWindow(C0673gh ghVar) {
        mo9194d((C4296k) ghVar);
        mo9193c();
    }

    public final /* bridge */ /* synthetic */ void onViewRecycled(C0673gh ghVar) {
        Long i = m12298i(((FrameLayout) ((C4296k) ghVar).itemView).getId());
        if (i != null) {
            m12300k(i.longValue());
            this.f13868g.mo3683j(i.longValue());
        }
    }
}
