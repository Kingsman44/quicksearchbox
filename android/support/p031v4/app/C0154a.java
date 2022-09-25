package android.support.p031v4.app;

import android.util.Log;
import androidx.lifecycle.C2383n;
import androidx.p116i.p117a.p118a.C2284e;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.a */
/* compiled from: PG */
public final class C0154a extends C0213ce implements C0189bh, C0195bn {

    /* renamed from: a */
    final FragmentManager f690a;

    /* renamed from: b */
    boolean f691b;

    /* renamed from: c */
    int f692c;

    /* renamed from: d */
    boolean f693d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0154a(C0154a aVar) {
        super((byte[]) null);
        aVar.f690a.mo475h();
        C0174at atVar = aVar.f690a.f647n;
        if (atVar != null) {
            atVar.f742c.getClassLoader();
        }
        ArrayList arrayList = aVar.f809e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f809e.add(new C0212cd((C0212cd) arrayList.get(i)));
        }
        this.f810f = aVar.f810f;
        this.f811g = aVar.f811g;
        this.f812h = aVar.f812h;
        this.f813i = aVar.f813i;
        this.f814j = aVar.f814j;
        this.f815k = aVar.f815k;
        this.f816l = aVar.f816l;
        this.f817m = aVar.f817m;
        this.f820p = aVar.f820p;
        this.f821q = aVar.f821q;
        this.f818n = aVar.f818n;
        this.f819o = aVar.f819o;
        if (aVar.f822r != null) {
            this.f822r = new ArrayList();
            this.f822r.addAll(aVar.f822r);
        }
        if (aVar.f823s != null) {
            this.f823s = new ArrayList();
            this.f823s.addAll(aVar.f823s);
        }
        this.f824t = aVar.f824t;
        this.f692c = -1;
        this.f693d = false;
        this.f690a = aVar.f690a;
        this.f691b = aVar.f691b;
        this.f692c = aVar.f692c;
        this.f693d = aVar.f693d;
    }

    /* renamed from: a */
    public final int mo504a() {
        return mo505b(false);
    }

    /* renamed from: b */
    public final int mo505b(boolean z) {
        if (!this.f691b) {
            if (FragmentManager.m246Z(2)) {
                new StringBuilder("Commit: ").append(this);
                Log.v("FragmentManager", "Commit: ".concat(toString()));
                PrintWriter printWriter = new PrintWriter(new C0228ct());
                mo512i("  ", printWriter, true);
                printWriter.close();
            }
            this.f691b = true;
            if (this.f815k) {
                this.f692c = this.f690a.f639f.getAndIncrement();
            } else {
                this.f692c = -1;
            }
            this.f690a.mo437D(this, z);
            return this.f692c;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: c */
    public final int mo506c() {
        return this.f692c;
    }

    /* renamed from: d */
    public final String mo507d() {
        return this.f817m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo508e(int i) {
        if (this.f815k) {
            if (FragmentManager.m246Z(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f809e.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0212cd cdVar = (C0212cd) this.f809e.get(i2);
                Fragment fragment = cdVar.f801b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.m246Z(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + cdVar.f801b + " to " + cdVar.f801b.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo509f() {
        mo688u();
        this.f690a.mo438E(this, false);
    }

    /* renamed from: g */
    public final void mo510g() {
        mo688u();
        this.f690a.mo438E(this, true);
    }

    /* renamed from: h */
    public final void mo511h(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            C2284e.m6220a(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 == null || str.equals(str3)) {
                fragment.mTag = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.mFragmentId;
                if (i3 == 0 || i3 == i) {
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        mo684q(new C0212cd(i2, fragment));
        fragment.mFragmentManager = this.f690a;
    }

    /* renamed from: i */
    public final void mo512i(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f817m);
            printWriter.print(" mIndex=");
            printWriter.print(this.f692c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f691b);
            if (this.f814j != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f814j));
            }
            if (!(this.f810f == 0 && this.f811g == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f810f));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f811g));
            }
            if (!(this.f812h == 0 && this.f813i == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f812h));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f813i));
            }
            if (!(this.f818n == 0 && this.f819o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f818n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f819o);
            }
            if (!(this.f820p == 0 && this.f821q == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f820p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f821q);
            }
        }
        if (!this.f809e.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f809e.size();
            for (int i = 0; i < size; i++) {
                C0212cd cdVar = (C0212cd) this.f809e.get(i);
                switch (cdVar.f800a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + cdVar.f800a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(cdVar.f801b);
                if (z) {
                    if (!(cdVar.f803d == 0 && cdVar.f804e == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(cdVar.f803d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(cdVar.f804e));
                    }
                    if (cdVar.f805f != 0 || cdVar.f806g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(cdVar.f805f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(cdVar.f806g));
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public final boolean mo513j(ArrayList arrayList, ArrayList arrayList2) {
        if (FragmentManager.m246Z(2)) {
            new StringBuilder("Run: ").append(this);
            Log.v("FragmentManager", "Run: ".concat(toString()));
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.f815k) {
            return true;
        }
        FragmentManager fragmentManager = this.f690a;
        if (fragmentManager.f635b == null) {
            fragmentManager.f635b = new ArrayList();
        }
        fragmentManager.f635b.add(this);
        return true;
    }

    /* renamed from: k */
    public final void mo514k(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f690a) {
            mo684q(new C0212cd(6, fragment));
            return;
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: l */
    public final void mo515l(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f690a) {
            mo684q(new C0212cd(4, fragment));
            return;
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: m */
    public final void mo516m(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f690a) {
            mo684q(new C0212cd(3, fragment));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: n */
    public final void mo517n(Fragment fragment, C2383n nVar) {
        if (fragment.mFragmentManager != this.f690a) {
            StringBuilder sb = new StringBuilder("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            FragmentManager fragmentManager = this.f690a;
            sb.append(fragmentManager);
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ".concat(fragmentManager.toString()));
        } else if (nVar == C2383n.INITIALIZED && fragment.mState >= 0) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + nVar + " after the Fragment has been created");
        } else if (nVar != C2383n.DESTROYED) {
            mo684q(new C0212cd(fragment, nVar));
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + nVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    /* renamed from: p */
    public final void mo519p(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f690a) {
            mo684q(new C0212cd(5, fragment));
            return;
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f692c >= 0) {
            sb.append(" #");
            sb.append(this.f692c);
        }
        if (this.f817m != null) {
            sb.append(" ");
            sb.append(this.f817m);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: o */
    public final void mo518o(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.mFragmentManager) == null || fragmentManager == this.f690a) {
            mo684q(new C0212cd(8, fragment));
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0154a(FragmentManager fragmentManager) {
        super((byte[]) null);
        fragmentManager.mo475h();
        C0174at atVar = fragmentManager.f647n;
        if (atVar != null) {
            atVar.f742c.getClassLoader();
        }
        this.f692c = -1;
        this.f693d = false;
        this.f690a = fragmentManager;
    }
}
