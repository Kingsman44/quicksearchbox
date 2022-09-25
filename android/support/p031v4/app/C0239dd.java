package android.support.p031v4.app;

import android.util.Log;
import android.view.ViewGroup;
import androidx.core.p094f.C1893f;
import androidx.core.p098j.C2043bi;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.app.dd */
/* compiled from: PG */
abstract class C0239dd {

    /* renamed from: a */
    public final ViewGroup f879a;

    /* renamed from: b */
    final ArrayList f880b = new ArrayList();

    /* renamed from: c */
    final ArrayList f881c = new ArrayList();

    /* renamed from: d */
    boolean f882d = false;

    /* renamed from: e */
    boolean f883e = false;

    public C0239dd(ViewGroup viewGroup) {
        this.f879a = viewGroup;
    }

    /* renamed from: a */
    private final void m561a() {
        ArrayList arrayList = this.f880b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0238dc dcVar = (C0238dc) arrayList.get(i);
            if (dcVar.f877f == 2) {
                dcVar.mo744f(C0237db.m552b(dcVar.f872a.requireView().getVisibility()), 1);
            }
        }
    }

    /* renamed from: k */
    static C0239dd m562k(ViewGroup viewGroup) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0239dd) {
            return (C0239dd) tag;
        }
        C0254q qVar = new C0254q(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, qVar);
        return qVar;
    }

    /* renamed from: b */
    public abstract void mo746b(List list, boolean z);

    /* renamed from: f */
    public final C0238dc mo747f(Fragment fragment) {
        ArrayList arrayList = this.f880b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0238dc dcVar = (C0238dc) arrayList.get(i);
            if (dcVar.f872a.equals(fragment) && !dcVar.f874c) {
                return dcVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo748g() {
        if (!this.f883e) {
            if (!C2043bi.m5569aw(this.f879a)) {
                mo749h();
                this.f882d = false;
                return;
            }
            synchronized (this.f880b) {
                if (!this.f880b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f881c);
                    this.f881c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C0238dc dcVar = (C0238dc) it.next();
                        if (FragmentManager.m246Z(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + dcVar);
                        }
                        dcVar.mo742d();
                        if (!dcVar.f875d) {
                            this.f881c.add(dcVar);
                        }
                    }
                    m561a();
                    ArrayList arrayList2 = new ArrayList(this.f880b);
                    this.f880b.clear();
                    this.f881c.addAll(arrayList2);
                    if (FragmentManager.m246Z(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((C0238dc) it2.next()).mo738b();
                    }
                    mo746b(arrayList2, this.f882d);
                    this.f882d = false;
                    if (FragmentManager.m246Z(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo749h() {
        String str;
        String str2;
        if (FragmentManager.m246Z(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean aw = C2043bi.m5569aw(this.f879a);
        synchronized (this.f880b) {
            m561a();
            Iterator it = this.f880b.iterator();
            while (it.hasNext()) {
                ((C0238dc) it.next()).mo738b();
            }
            Iterator it2 = new ArrayList(this.f881c).iterator();
            while (it2.hasNext()) {
                C0238dc dcVar = (C0238dc) it2.next();
                if (FragmentManager.m246Z(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (aw) {
                        str2 = BuildConfig.FLAVOR;
                    } else {
                        str2 = "Container " + this.f879a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(dcVar);
                    Log.v("FragmentManager", sb.toString());
                }
                dcVar.mo742d();
            }
            Iterator it3 = new ArrayList(this.f880b).iterator();
            while (it3.hasNext()) {
                C0238dc dcVar2 = (C0238dc) it3.next();
                if (FragmentManager.m246Z(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (aw) {
                        str = BuildConfig.FLAVOR;
                    } else {
                        str = "Container " + this.f879a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(dcVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                dcVar2.mo742d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo750i() {
        synchronized (this.f880b) {
            m561a();
            this.f883e = false;
            int size = this.f880b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C0238dc dcVar = (C0238dc) this.f880b.get(size);
                int c = C0237db.m553c(dcVar.f872a.mView);
                if (dcVar.f876e == 2 && c != 2) {
                    this.f883e = dcVar.f872a.isPostponed();
                    break;
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo751j(int i, int i2, C0209ca caVar) {
        synchronized (this.f880b) {
            C1893f fVar = new C1893f();
            C0238dc f = mo747f(caVar.f785a);
            if (f != null) {
                f.mo744f(i, i2);
                return;
            }
            C0233cy cyVar = new C0233cy(i, i2, caVar, fVar);
            this.f880b.add(cyVar);
            cyVar.mo741c(new C0231cw(this, cyVar));
            cyVar.mo741c(new C0232cx(this, cyVar));
        }
    }
}
