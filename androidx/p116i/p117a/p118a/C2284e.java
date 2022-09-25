package androidx.p116i.p117a.p118a;

import android.os.Handler;
import android.os.Looper;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.util.Log;
import android.view.ViewGroup;
import java.util.Set;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.i.a.a.e */
/* compiled from: PG */
public final class C2284e {

    /* renamed from: a */
    private static final C2283d f6444a = C2283d.f6441a;

    /* renamed from: a */
    public static final void m6220a(Fragment fragment, String str) {
        C69664n.m101061g(fragment, "fragment");
        C2280a aVar = new C2280a(fragment, str);
        m6230k(aVar);
        C2283d j = m6229j(fragment);
        if (j.f6442b.contains(C2282c.DETECT_FRAGMENT_REUSE) && m6231l(j, fragment.getClass(), aVar.getClass())) {
            m6232m(j, aVar);
        }
    }

    /* renamed from: b */
    public static final void m6221b(Fragment fragment, ViewGroup viewGroup) {
        C69664n.m101061g(fragment, "fragment");
        C2285f fVar = new C2285f(fragment, viewGroup);
        m6230k(fVar);
        C2283d j = m6229j(fragment);
        if (j.f6442b.contains(C2282c.DETECT_FRAGMENT_TAG_USAGE) && m6231l(j, fragment.getClass(), fVar.getClass())) {
            m6232m(j, fVar);
        }
    }

    /* renamed from: c */
    public static final void m6222c(Fragment fragment) {
        C2286g gVar = new C2286g(fragment);
        m6230k(gVar);
        C2283d j = m6229j(fragment);
        if (j.f6442b.contains(C2282c.DETECT_RETAIN_INSTANCE_USAGE) && m6231l(j, fragment.getClass(), gVar.getClass())) {
            m6232m(j, gVar);
        }
    }

    /* renamed from: d */
    public static final void m6223d(Fragment fragment) {
        C2287h hVar = new C2287h(fragment);
        m6230k(hVar);
        C2283d j = m6229j(fragment);
        if (j.f6442b.contains(C2282c.DETECT_TARGET_FRAGMENT_USAGE) && m6231l(j, fragment.getClass(), hVar.getClass())) {
            m6232m(j, hVar);
        }
    }

    /* renamed from: e */
    public static final void m6224e(Fragment fragment) {
        C2288i iVar = new C2288i(fragment);
        m6230k(iVar);
        C2283d j = m6229j(fragment);
        if (j.f6442b.contains(C2282c.DETECT_TARGET_FRAGMENT_USAGE) && m6231l(j, fragment.getClass(), iVar.getClass())) {
            m6232m(j, iVar);
        }
    }

    /* renamed from: f */
    public static final void m6225f(Fragment fragment) {
        C2290k kVar = new C2290k(fragment);
        m6230k(kVar);
        C2283d j = m6229j(fragment);
        if (j.f6442b.contains(C2282c.DETECT_RETAIN_INSTANCE_USAGE) && m6231l(j, fragment.getClass(), kVar.getClass())) {
            m6232m(j, kVar);
        }
    }

    /* renamed from: g */
    public static final void m6226g(Fragment fragment, Fragment fragment2, int i) {
        C2291l lVar = new C2291l(fragment, fragment2, i);
        m6230k(lVar);
        C2283d j = m6229j(fragment);
        if (j.f6442b.contains(C2282c.DETECT_TARGET_FRAGMENT_USAGE) && m6231l(j, fragment.getClass(), lVar.getClass())) {
            m6232m(j, lVar);
        }
    }

    /* renamed from: h */
    public static final void m6227h(Fragment fragment, boolean z) {
        C2292m mVar = new C2292m(fragment, z);
        m6230k(mVar);
        C2283d j = m6229j(fragment);
        if (j.f6442b.contains(C2282c.DETECT_SET_USER_VISIBLE_HINT) && m6231l(j, fragment.getClass(), mVar.getClass())) {
            m6232m(j, mVar);
        }
    }

    /* renamed from: i */
    public static final void m6228i(Fragment fragment, ViewGroup viewGroup) {
        C69664n.m101061g(fragment, "fragment");
        C2295p pVar = new C2295p(fragment, viewGroup);
        m6230k(pVar);
        C2283d j = m6229j(fragment);
        if (j.f6442b.contains(C2282c.DETECT_WRONG_FRAGMENT_CONTAINER) && m6231l(j, fragment.getClass(), pVar.getClass())) {
            m6232m(j, pVar);
        }
    }

    /* renamed from: j */
    private static final C2283d m6229j(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                fragment.getParentFragmentManager();
            }
            fragment = fragment.getParentFragment();
        }
        return f6444a;
    }

    /* renamed from: k */
    private static final void m6230k(C2294o oVar) {
        if (FragmentManager.m246Z(3)) {
            Log.d("FragmentManager", C69664n.m101057c("StrictMode violation in ", oVar.f6445a.getClass().getName()), oVar);
        }
    }

    /* renamed from: l */
    private static final boolean m6231l(C2283d dVar, Class cls, Class cls2) {
        Set set = (Set) dVar.f6443c.get(cls);
        if (set == null) {
            return true;
        }
        if ((C69664n.m101066l(cls2.getSuperclass(), C2294o.class) || !C69540x.m100848ad(set, cls2.getSuperclass())) && !set.contains(cls2)) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private static final void m6232m(C2283d dVar, C2294o oVar) {
        Fragment fragment = oVar.f6445a;
        String name = fragment.getClass().getName();
        if (dVar.f6442b.contains(C2282c.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", C69664n.m101057c("Policy violation in ", name), oVar);
        }
        if (dVar.f6442b.contains(C2282c.PENALTY_DEATH)) {
            C2281b bVar = new C2281b(name, oVar);
            if (fragment.isAdded()) {
                Handler handler = fragment.getParentFragmentManager().f647n.f743d;
                if (C69664n.m101066l(handler.getLooper(), Looper.myLooper())) {
                    bVar.run();
                } else {
                    handler.post(bVar);
                }
            } else {
                bVar.run();
            }
        }
    }
}
