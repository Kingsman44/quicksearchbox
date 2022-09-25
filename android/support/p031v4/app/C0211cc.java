package android.support.p031v4.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: android.support.v4.app.cc */
/* compiled from: PG */
public final class C0211cc {

    /* renamed from: a */
    public final ArrayList f796a = new ArrayList();

    /* renamed from: b */
    public final HashMap f797b = new HashMap();

    /* renamed from: c */
    public final HashMap f798c = new HashMap();

    /* renamed from: d */
    public C0202bu f799d;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Fragment mo669a(String str) {
        C0209ca caVar = (C0209ca) this.f797b.get(str);
        if (caVar != null) {
            return caVar.f785a;
        }
        return null;
    }

    /* renamed from: b */
    public final Fragment mo670b(int i) {
        int size = this.f796a.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = (Fragment) this.f796a.get(size);
                if (fragment != null && fragment.mFragmentId == i) {
                    return fragment;
                }
            } else {
                for (C0209ca caVar : this.f797b.values()) {
                    if (caVar != null) {
                        Fragment fragment2 = caVar.f785a;
                        if (fragment2.mFragmentId == i) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    /* renamed from: c */
    public final Fragment mo671c(String str) {
        if (str != null) {
            int size = this.f796a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Fragment fragment = (Fragment) this.f796a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C0209ca caVar : this.f797b.values()) {
            if (caVar != null) {
                Fragment fragment2 = caVar.f785a;
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Fragment mo672d(String str) {
        Fragment findFragmentByWho;
        for (C0209ca caVar : this.f797b.values()) {
            if (caVar != null && (findFragmentByWho = caVar.f785a.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final FragmentState mo673e(String str, FragmentState fragmentState) {
        if (fragmentState != null) {
            return (FragmentState) this.f798c.put(str, fragmentState);
        }
        return (FragmentState) this.f798c.remove(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C0209ca mo674f(String str) {
        return (C0209ca) this.f797b.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final List mo675g() {
        ArrayList arrayList = new ArrayList();
        for (C0209ca caVar : this.f797b.values()) {
            if (caVar != null) {
                arrayList.add(caVar);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final List mo676h() {
        ArrayList arrayList = new ArrayList();
        for (C0209ca caVar : this.f797b.values()) {
            if (caVar != null) {
                arrayList.add(caVar.f785a);
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public final List mo677i() {
        ArrayList arrayList;
        if (this.f796a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f796a) {
            arrayList = new ArrayList(this.f796a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo678j(Fragment fragment) {
        if (!this.f796a.contains(fragment)) {
            synchronized (this.f796a) {
                this.f796a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        new StringBuilder("Fragment already added: ").append(fragment);
        throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(fragment)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo679k() {
        this.f797b.values().removeAll(Collections.singleton((Object) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo680l(C0209ca caVar) {
        Fragment fragment = caVar.f785a;
        if (!mo683o(fragment.mWho)) {
            this.f797b.put(fragment.mWho, caVar);
            if (fragment.mRetainInstanceChangedWhileDetached) {
                if (fragment.mRetainInstance) {
                    this.f799d.mo636a(fragment);
                } else {
                    this.f799d.mo640e(fragment);
                }
                fragment.mRetainInstanceChangedWhileDetached = false;
            }
            if (FragmentManager.m246Z(2)) {
                new StringBuilder("Added fragment to active set ").append(fragment);
                Log.v("FragmentManager", "Added fragment to active set ".concat(String.valueOf(fragment)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo681m(C0209ca caVar) {
        Fragment fragment = caVar.f785a;
        if (fragment.mRetainInstance) {
            this.f799d.mo640e(fragment);
        }
        if (((C0209ca) this.f797b.put(fragment.mWho, (Object) null)) != null && FragmentManager.m246Z(2)) {
            new StringBuilder("Removed fragment from active set ").append(fragment);
            Log.v("FragmentManager", "Removed fragment from active set ".concat(String.valueOf(fragment)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo682n(Fragment fragment) {
        synchronized (this.f796a) {
            this.f796a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final boolean mo683o(String str) {
        return this.f797b.get(str) != null;
    }
}
