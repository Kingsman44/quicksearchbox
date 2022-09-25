package androidx.navigation.fragment;

import android.content.Context;
import android.support.p031v4.app.C0260w;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.util.Log;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2389t;
import androidx.navigation.C3825ax;
import androidx.navigation.C3840bh;
import androidx.navigation.C3864ce;
import androidx.navigation.C3865cf;
import androidx.navigation.C3868ci;
import androidx.navigation.C3871cl;
import androidx.navigation.C3892m;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

@C3865cf(mo8118a = "dialog")
/* renamed from: androidx.navigation.fragment.c */
/* compiled from: PG */
public final class C3879c extends C3868ci {

    /* renamed from: b */
    public final Set f12452b = new LinkedHashSet();

    /* renamed from: c */
    public final C2389t f12453c = new DialogFragmentNavigator$$ExternalSyntheticLambda1(this);

    /* renamed from: d */
    private final Context f12454d;

    /* renamed from: e */
    private final FragmentManager f12455e;

    public C3879c(Context context, FragmentManager fragmentManager) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(fragmentManager, "fragmentManager");
        this.f12454d = context;
        this.f12455e = fragmentManager;
    }

    /* renamed from: a */
    public final /* synthetic */ C3825ax mo8074a() {
        return new C3878b(this);
    }

    /* renamed from: d */
    public final void mo8097d(List list, C3840bh bhVar, C3864ce ceVar) {
        C69664n.m101061g(list, "entries");
        if (this.f12455e.mo461ab()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3892m mVar = (C3892m) it.next();
            C3878b bVar = (C3878b) mVar.f12477b;
            String h = bVar.mo8128h();
            if (h.charAt(0) == '.') {
                h = C69664n.m101057c(this.f12454d.getPackageName(), h);
            }
            Fragment a = this.f12455e.mo475h().mo586a(this.f12454d.getClassLoader(), h);
            C69664n.m101060f(a, "fragmentManager.fragment…ader, className\n        )");
            if (C0260w.class.isAssignableFrom(a.getClass())) {
                C0260w wVar = (C0260w) a;
                wVar.setArguments(mVar.f12478c);
                wVar.getLifecycle().mo5790b(this.f12453c);
                wVar.show(this.f12455e, mVar.f12480e);
                mo8120f().mo8127e(mVar);
            } else {
                throw new IllegalArgumentException("Dialog destination " + bVar.mo8128h() + " is not an instance of DialogFragment");
            }
        }
    }

    /* renamed from: g */
    public final void mo8121g(C3871cl clVar) {
        C2384o lifecycle;
        super.mo8121g(clVar);
        for (C3892m mVar : (List) clVar.f12436f.mo62784e()) {
            FragmentManager fragmentManager = this.f12455e;
            C0260w wVar = (C0260w) fragmentManager.f634a.mo671c(mVar.f12480e);
            C69788q qVar = null;
            if (!(wVar == null || (lifecycle = wVar.getLifecycle()) == null)) {
                lifecycle.mo5790b(this.f12453c);
                qVar = C69788q.f186170a;
            }
            if (qVar == null) {
                this.f12452b.add(mVar.f12480e);
            }
        }
        FragmentManager fragmentManager2 = this.f12455e;
        fragmentManager2.f645l.add(new C3877a(this));
    }

    /* renamed from: i */
    public final void mo8123i(C3892m mVar, boolean z) {
        C69664n.m101061g(mVar, "popUpTo");
        if (this.f12455e.mo461ab()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) mo8120f().f12436f.mo62784e();
        for (C3892m mVar2 : C69540x.m100834P(list.subList(list.indexOf(mVar), list.size()))) {
            FragmentManager fragmentManager = this.f12455e;
            Fragment c = fragmentManager.f634a.mo671c(mVar2.f12480e);
            if (c != null) {
                c.getLifecycle().mo5791c(this.f12453c);
                ((C0260w) c).dismiss();
            }
        }
        mo8120f().mo8126d(mVar, z);
    }
}
