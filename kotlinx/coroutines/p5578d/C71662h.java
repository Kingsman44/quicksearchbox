package kotlinx.coroutines.p5578d;

import com.google.common.util.concurrent.C60870cx;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: kotlinx.coroutines.d.h */
/* compiled from: PG */
final class C71662h extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C60870cx f191114a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71662h(C60870cx cxVar) {
        super(1);
        this.f191114a = cxVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        Throwable th = (Throwable) obj;
        this.f191114a.cancel(false);
        return C69788q.f186170a;
    }
}
