package androidx.navigation;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5482l.C69734n;

/* renamed from: androidx.navigation.ci */
/* compiled from: PG */
public abstract class C3868ci {

    /* renamed from: a */
    public boolean f12428a;

    /* renamed from: b */
    private C3871cl f12429b;

    /* renamed from: a */
    public abstract C3825ax mo8074a();

    /* renamed from: b */
    public C3825ax mo8075b(C3825ax axVar, Bundle bundle, C3840bh bhVar, C3864ce ceVar) {
        return axVar;
    }

    /* renamed from: c */
    public boolean mo8076c() {
        return true;
    }

    /* renamed from: d */
    public void mo8097d(List list, C3840bh bhVar, C3864ce ceVar) {
        C69664n.m101061g(list, "entries");
        Iterator a = C69734n.m101142j(C69734n.m101143k(C69540x.m100847ac(list), new C3866cg(this, bhVar, ceVar))).mo5191a();
        while (a.hasNext()) {
            mo8120f().mo8127e((C3892m) a.next());
        }
    }

    /* renamed from: e */
    public Bundle mo8119e() {
        return null;
    }

    /* renamed from: f */
    public final C3871cl mo8120f() {
        C3871cl clVar = this.f12429b;
        if (clVar != null) {
            return clVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    /* renamed from: g */
    public void mo8121g(C3871cl clVar) {
        this.f12429b = clVar;
        this.f12428a = true;
    }

    /* renamed from: h */
    public void mo8122h(Bundle bundle) {
    }

    /* renamed from: i */
    public void mo8123i(C3892m mVar, boolean z) {
        C69664n.m101061g(mVar, "popUpTo");
        List list = (List) mo8120f().f12436f.mo62784e();
        if (list.contains(mVar)) {
            ListIterator listIterator = list.listIterator(list.size());
            C3892m mVar2 = null;
            while (mo8076c()) {
                mVar2 = (C3892m) listIterator.previous();
                if (C69664n.m101066l(mVar2, mVar)) {
                    break;
                }
            }
            if (mVar2 != null) {
                mo8120f().mo8126d(mVar2, z);
                return;
            }
            return;
        }
        throw new IllegalStateException("popBackStack was called with " + mVar + " which does not exist in back stack " + list);
    }
}
