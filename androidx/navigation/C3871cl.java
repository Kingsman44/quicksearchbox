package androidx.navigation;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.p5574b.C71521by;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71571du;
import kotlinx.coroutines.p5574b.C71574dx;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69498ao;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.navigation.cl */
/* compiled from: PG */
public abstract class C3871cl {

    /* renamed from: b */
    public final ReentrantLock f12432b = new ReentrantLock(true);

    /* renamed from: c */
    public final C71548cy f12433c;

    /* renamed from: d */
    public final C71548cy f12434d;

    /* renamed from: e */
    public boolean f12435e;

    /* renamed from: f */
    public final C71571du f12436f;

    /* renamed from: g */
    public final C71571du f12437g;

    public C3871cl() {
        C71548cy b = C71574dx.m104480b(C69496am.f185918a);
        this.f12433c = b;
        C71548cy b2 = C71574dx.m104480b(C69498ao.f185920a);
        this.f12434d = b2;
        this.f12436f = C71521by.m104365c(b);
        this.f12437g = C71521by.m104365c(b2);
    }

    /* renamed from: a */
    public abstract C3892m mo8125a(C3825ax axVar, Bundle bundle);

    /* renamed from: d */
    public void mo8126d(C3892m mVar, boolean z) {
        C69664n.m101061g(mVar, "popUpTo");
        ReentrantLock reentrantLock = this.f12432b;
        reentrantLock.lock();
        try {
            C71548cy cyVar = this.f12433c;
            ArrayList arrayList = new ArrayList();
            for (Object next : (Iterable) cyVar.mo62784e()) {
                if (C69664n.m101066l((C3892m) next, mVar)) {
                    break;
                }
                arrayList.add(next);
            }
            cyVar.mo62807f(arrayList);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: e */
    public void mo8127e(C3892m mVar) {
        throw null;
    }
}
