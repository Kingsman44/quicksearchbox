package kotlinx.coroutines.p5578d;

import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.util.concurrent.C60845bz;
import kotlinx.coroutines.C71417ar;
import kotlinx.coroutines.C71816z;
import p5462h.C69702k;
import p5462h.C69714l;
import p5462h.p5466c.C69586p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.d.d */
/* compiled from: PG */
public final class C71658d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C71816z f191109a;

    public C71658d(C71816z zVar) {
        this.f191109a = zVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        Object obj;
        C69664n.m101061g(th, C42181t.f110467a);
        try {
            obj = Boolean.valueOf(this.f191109a.mo63050j(th));
        } catch (Throwable th2) {
            obj = C69714l.m101133a(th2);
        }
        Throwable a = C69702k.m101124a(obj);
        if (a != null) {
            C71417ar.m104192b(C69586p.f185991a, a);
        }
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        Object obj2;
        try {
            obj2 = Boolean.valueOf(this.f191109a.mo62909P(obj));
        } catch (Throwable th) {
            obj2 = C69714l.m101133a(th);
        }
        Throwable a = C69702k.m101124a(obj2);
        if (a != null) {
            C71417ar.m104192b(C69586p.f185991a, a);
        }
    }
}
