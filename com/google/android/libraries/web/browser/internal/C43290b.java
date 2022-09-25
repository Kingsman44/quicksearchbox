package com.google.android.libraries.web.browser.internal;

import com.google.android.libraries.web.lifecycle.C43891f;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.C43375t;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.p3355b.C43324a;
import com.google.android.libraries.web.p3353c.p3355b.C43331ag;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43945v;
import java.util.concurrent.CancellationException;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.web.browser.internal.b */
/* compiled from: PG */
final class C43290b extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ Throwable f113100a;

    /* renamed from: b */
    final /* synthetic */ C43308t f113101b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43290b(Throwable th, C43308t tVar) {
        super(1);
        this.f113100a = th;
        this.f113101b = tVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C43904a aVar = (C43904a) obj;
        C69664n.m101061g(aVar, "window");
        C43891f d = aVar.mo46411d(C43331ag.class);
        C69664n.m101060f(d, "getPlugin(T::class.java)");
        C43331ag agVar = (C43331ag) ((C43945v) d);
        C43376u a = agVar.mo46439a();
        if ((a.f113328a & 64) != 0) {
            C43367l lVar = a.f113335h;
            if (lVar == null) {
                lVar = C43367l.f113293h;
            }
            if (lVar.f113301g) {
                Throwable th = this.f113100a;
                if (th instanceof CancellationException) {
                    C43375t tVar = (C43375t) agVar.mo46439a().toBuilder();
                    tVar.copyOnWrite();
                    C43376u uVar = (C43376u) tVar.instance;
                    uVar.f113335h = null;
                    uVar.f113328a &= -65;
                    agVar.mo46452n((C43376u) tVar.build());
                    C43324a c = agVar.f113186b.mo46464c();
                    if (c != null) {
                        c.mo46435n();
                    }
                } else {
                    C43375t tVar2 = (C43375t) agVar.mo46439a().toBuilder();
                    tVar2.copyOnWrite();
                    C43376u uVar2 = (C43376u) tVar2.instance;
                    uVar2.f113335h = null;
                    uVar2.f113328a &= -65;
                    agVar.mo46452n((C43376u) tVar2.build());
                    C43324a c2 = agVar.f113186b.mo46464c();
                    if (c2 != null) {
                        c2.mo46436o(th);
                    }
                    this.f113101b.f113154d.mo5761a(this.f113100a);
                }
            }
        }
        return C69788q.f186170a;
    }
}
