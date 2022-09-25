package p5488io.p5490b.p5497e.p5502e.p5506d;

import com.google.android.libraries.elements.internal.C21328ah;
import com.google.android.libraries.elements.internal.C21329ai;
import p5488io.p5490b.C70122n;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.d.ao */
/* compiled from: PG */
public final class C69934ao extends C69919a {

    /* renamed from: b */
    final C21329ai f186404b;

    public C69934ao(C70122n nVar, C21329ai aiVar) {
        super(nVar);
        this.f186404b = aiVar;
    }

    /* renamed from: q */
    public final void mo61493q(C70123o oVar) {
        try {
            C21328ah ahVar = new C21328ah(this.f186404b, oVar);
            this.f186404b.toString();
            this.f186361a.mo61539p(ahVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C69813f.m101292a(th);
            C70101a.m102023e(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
