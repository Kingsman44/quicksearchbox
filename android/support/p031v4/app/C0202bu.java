package android.support.p031v4.app;

import android.util.Log;
import androidx.lifecycle.C2358bf;
import androidx.lifecycle.C2363bk;
import androidx.lifecycle.C2370br;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: android.support.v4.app.bu */
/* compiled from: PG */
final class C0202bu extends C2358bf {

    /* renamed from: a */
    public static final C2363bk f773a = new C0201bt();

    /* renamed from: b */
    public final HashMap f774b = new HashMap();

    /* renamed from: c */
    public final HashMap f775c = new HashMap();

    /* renamed from: d */
    public final HashMap f776d = new HashMap();

    /* renamed from: e */
    public final boolean f777e;

    /* renamed from: f */
    public boolean f778f = false;

    /* renamed from: g */
    public boolean f779g = false;

    public C0202bu(boolean z) {
        this.f777e = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo636a(Fragment fragment) {
        if (this.f779g) {
            if (FragmentManager.m246Z(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.f774b.containsKey(fragment.mWho)) {
            this.f774b.put(fragment.mWho, fragment);
            if (FragmentManager.m246Z(2)) {
                new StringBuilder("Updating retained Fragments: Added ").append(fragment);
                Log.v("FragmentManager", "Updating retained Fragments: Added ".concat(String.valueOf(fragment)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo637b(Fragment fragment) {
        if (FragmentManager.m246Z(3)) {
            new StringBuilder("Clearing non-config state for ").append(fragment);
            Log.d("FragmentManager", "Clearing non-config state for ".concat(String.valueOf(fragment)));
        }
        mo638c(fragment.mWho);
    }

    /* renamed from: c */
    public final void mo638c(String str) {
        C0202bu buVar = (C0202bu) this.f775c.get(str);
        if (buVar != null) {
            buVar.mo639d();
            this.f775c.remove(str);
        }
        C2370br brVar = (C2370br) this.f776d.get(str);
        if (brVar != null) {
            brVar.mo5774c();
            this.f776d.remove(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo639d() {
        if (FragmentManager.m246Z(3)) {
            new StringBuilder("onCleared called for ").append(this);
            Log.d("FragmentManager", "onCleared called for ".concat(toString()));
        }
        this.f778f = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo640e(Fragment fragment) {
        if (this.f779g) {
            if (FragmentManager.m246Z(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.f774b.remove(fragment.mWho) != null && FragmentManager.m246Z(2)) {
            new StringBuilder("Updating retained Fragments: Removed ").append(fragment);
            Log.v("FragmentManager", "Updating retained Fragments: Removed ".concat(String.valueOf(fragment)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0202bu buVar = (C0202bu) obj;
            return this.f774b.equals(buVar.f774b) && this.f775c.equals(buVar.f775c) && this.f776d.equals(buVar.f776d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo642f(Fragment fragment) {
        if (this.f774b.containsKey(fragment.mWho) && this.f777e) {
            return this.f778f;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f774b.hashCode() * 31) + this.f775c.hashCode()) * 31) + this.f776d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f774b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f775c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f776d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
