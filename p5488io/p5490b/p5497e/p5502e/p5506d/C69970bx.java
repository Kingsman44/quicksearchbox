package p5488io.p5490b.p5497e.p5502e.p5506d;

import android.util.Pair;
import com.facebook.litho.C6393hr;
import com.facebook.litho.C6394hs;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import com.facebook.litho.widget.C6558w;
import com.google.android.libraries.elements.p1714d.C20867cr;
import com.google.android.libraries.elements.p1714d.C20869ct;
import com.google.android.libraries.elements.p1714d.C20920dp;
import com.google.protos.youtube.elements.C66260r;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5499b.C69841j;

/* renamed from: io.b.e.e.d.bx */
/* compiled from: PG */
final class C69970bx extends AtomicReference implements C70123o, C69803b {
    private static final long serialVersionUID = -312246233408980075L;

    /* renamed from: a */
    final C70123o f186496a;

    /* renamed from: b */
    final AtomicReference f186497b = new AtomicReference();

    /* renamed from: c */
    final AtomicReference f186498c = new AtomicReference();

    /* renamed from: d */
    final C20867cr f186499d;

    public C69970bx(C70123o oVar, C20867cr crVar) {
        this.f186496a = oVar;
        this.f186499d = crVar;
    }

    /* renamed from: a */
    public final void mo25986a() {
        C69828d.m101309f(this.f186498c);
        this.f186496a.mo25986a();
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        C69828d.m101309f(this.f186498c);
        this.f186496a.mo25987b(th);
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        C69828d.m101307c(this.f186497b, bVar);
    }

    public final void dispose() {
        C69828d.m101309f(this.f186497b);
        C69828d.m101309f(this.f186498c);
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        C6407q qVar;
        Object obj2 = get();
        if (obj2 != null) {
            try {
                C20869ct ctVar = this.f186499d.f58522a;
                C20920dp dpVar = (C20920dp) obj;
                C6411u uVar = (C6411u) obj2;
                if (dpVar == null) {
                    ctVar.f58527a.mo25782a(C66260r.LOG_TYPE_INTERNAL_TEMPLATE_RESOLUTION_ERROR, "Template produced null Element", ctVar.f58529c, (Throwable) null);
                    qVar = C6558w.m17858b(uVar).f19531a;
                } else {
                    C6407q a = ctVar.f58528b.mo26711a(uVar, ctVar.f58529c, dpVar.mo25904b(), ctVar.f58530d, ctVar.f58531e);
                    if (dpVar.mo25903a() != null) {
                        C6393hr b = C6394hs.m17136b(uVar);
                        b.mo13404d(a);
                        b.mo13428L(dpVar.mo25903a());
                        qVar = b.mo13259a();
                    } else {
                        qVar = a;
                    }
                }
                Pair create = Pair.create(qVar, uVar);
                C69841j.m101337b(create, "The combiner returned a null value");
                this.f186496a.mo25988lL(create);
            } catch (Throwable th) {
                C69813f.m101292a(th);
                dispose();
                this.f186496a.mo25987b(th);
            }
        }
    }
}
