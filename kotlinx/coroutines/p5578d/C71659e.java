package kotlinx.coroutines.p5578d;

import com.google.common.util.concurrent.C60870cx;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: kotlinx.coroutines.d.e */
/* compiled from: PG */
final class C71659e extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C60870cx f191110a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71659e(C60870cx cxVar) {
        super(1);
        this.f191110a = cxVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        Throwable th = (Throwable) obj;
        this.f191110a.cancel(false);
        return C69788q.f186170a;
    }
}
