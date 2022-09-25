package android.support.p031v4.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: android.support.v4.app.ax */
/* compiled from: PG */
public final class C0178ax {

    /* renamed from: a */
    private final CopyOnWriteArrayList f750a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private final FragmentManager f751b;

    public C0178ax(FragmentManager fragmentManager) {
        this.f751b = fragmentManager;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo592a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f751b.f649p;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f644k.mo592a(fragment, bundle, true);
        }
        Iterator it = this.f750a.iterator();
        while (it.hasNext()) {
            C0177aw awVar = (C0177aw) it.next();
            if (!z || awVar.f749b) {
                awVar.f748a.onFragmentActivityCreated(this.f751b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo593b(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.f751b;
        Context context = fragmentManager.f647n.f742c;
        Fragment fragment2 = fragmentManager.f649p;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f644k.mo593b(fragment, true);
        }
        Iterator it = this.f750a.iterator();
        while (it.hasNext()) {
            C0177aw awVar = (C0177aw) it.next();
            if (!z || awVar.f749b) {
                awVar.f748a.onFragmentAttached(this.f751b, fragment, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo594c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f751b.f649p;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f644k.mo594c(fragment, bundle, true);
        }
        Iterator it = this.f750a.iterator();
        while (it.hasNext()) {
            C0177aw awVar = (C0177aw) it.next();
            if (!z || awVar.f749b) {
                awVar.f748a.onFragmentCreated(this.f751b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo595d(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f751b.f649p;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f644k.mo595d(fragment, true);
        }
        Iterator it = this.f750a.iterator();
        while (it.hasNext()) {
            C0177aw awVar = (C0177aw) it.next();
            if (!z || awVar.f749b) {
                awVar.f748a.onFragmentDestroyed(this.f751b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo596e(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f751b.f649p;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f644k.mo596e(fragment, true);
        }
        Iterator it = this.f750a.iterator();
        while (it.hasNext()) {
            C0177aw awVar = (C0177aw) it.next();
            if (!z || awVar.f749b) {
                awVar.f748a.onFragmentDetached(this.f751b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo597f(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f751b.f649p;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f644k.mo597f(fragment, true);
        }
        Iterator it = this.f750a.iterator();
        while (it.hasNext()) {
            C0177aw awVar = (C0177aw) it.next();
            if (!z || awVar.f749b) {
                awVar.f748a.onFragmentPaused(this.f751b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo598g(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.f751b;
        Context context = fragmentManager.f647n.f742c;
        Fragment fragment2 = fragmentManager.f649p;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f644k.mo598g(fragment, true);
        }
        Iterator it = this.f750a.iterator();
        while (it.hasNext()) {
            C0177aw awVar = (C0177aw) it.next();
            if (!z || awVar.f749b) {
                awVar.f748a.onFragmentPreAttached(this.f751b, fragment, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo599h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f751b.f649p;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f644k.mo599h(fragment, bundle, true);
        }
        Iterator it = this.f750a.iterator();
        while (it.hasNext()) {
            C0177aw awVar = (C0177aw) it.next();
            if (!z || awVar.f749b) {
                awVar.f748a.onFragmentPreCreated(this.f751b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo600i(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f751b.f649p;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f644k.mo600i(fragment, true);
        }
        Iterator it = this.f750a.iterator();
        while (it.hasNext()) {
            C0177aw awVar = (C0177aw) it.next();
            if (!z || awVar.f749b) {
                awVar.f748a.onFragmentResumed(this.f751b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo601j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f751b.f649p;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f644k.mo601j(fragment, bundle, true);
        }
        Iterator it = this.f750a.iterator();
        while (it.hasNext()) {
            C0177aw awVar = (C0177aw) it.next();
            if (!z || awVar.f749b) {
                awVar.f748a.onFragmentSaveInstanceState(this.f751b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo602k(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f751b.f649p;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f644k.mo602k(fragment, true);
        }
        Iterator it = this.f750a.iterator();
        while (it.hasNext()) {
            C0177aw awVar = (C0177aw) it.next();
            if (!z || awVar.f749b) {
                awVar.f748a.onFragmentStarted(this.f751b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo603l(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f751b.f649p;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f644k.mo603l(fragment, true);
        }
        Iterator it = this.f750a.iterator();
        while (it.hasNext()) {
            C0177aw awVar = (C0177aw) it.next();
            if (!z || awVar.f749b) {
                awVar.f748a.onFragmentStopped(this.f751b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo604m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f751b.f649p;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f644k.mo604m(fragment, view, bundle, true);
        }
        Iterator it = this.f750a.iterator();
        while (it.hasNext()) {
            C0177aw awVar = (C0177aw) it.next();
            if (!z || awVar.f749b) {
                awVar.f748a.onFragmentViewCreated(this.f751b, fragment, view, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo605n(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f751b.f649p;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f644k.mo605n(fragment, true);
        }
        Iterator it = this.f750a.iterator();
        while (it.hasNext()) {
            C0177aw awVar = (C0177aw) it.next();
            if (!z || awVar.f749b) {
                awVar.f748a.onFragmentViewDestroyed(this.f751b, fragment);
            }
        }
    }

    /* renamed from: o */
    public final void mo606o(C0192bk bkVar, boolean z) {
        this.f750a.add(new C0177aw(bkVar, z));
    }

    /* renamed from: p */
    public final void mo607p(C0192bk bkVar) {
        synchronized (this.f750a) {
            int size = this.f750a.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (((C0177aw) this.f750a.get(i)).f748a == bkVar) {
                    this.f750a.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }
}
