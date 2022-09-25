package com.google.android.libraries.web.browser.internal;

import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.base.p3348b.p3351c.C43249e;
import com.google.android.libraries.web.base.p3348b.p3351c.C43250f;
import com.google.android.libraries.web.browser.internal.p3352a.C43284c;
import com.google.android.libraries.web.lifecycle.C43891f;
import com.google.android.libraries.web.p3353c.C43323b;
import com.google.android.libraries.web.p3353c.C43364i;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.p3355b.C43331ag;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43945v;
import com.google.android.libraries.web.p3428m.p3429a.C43923l;
import com.google.android.libraries.web.p3428m.p3429a.p3430a.C43911f;
import com.google.android.libraries.web.p3428m.p3429a.p3430a.C43912g;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.web.browser.internal.o */
/* compiled from: PG */
final class C43303o extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C43308t f113140a;

    /* renamed from: b */
    final /* synthetic */ C43257h f113141b;

    /* renamed from: c */
    final /* synthetic */ C43366k f113142c;

    /* renamed from: d */
    final /* synthetic */ C60870cx f113143d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43303o(C43308t tVar, C43257h hVar, C43366k kVar, C60870cx cxVar) {
        super(1);
        this.f113140a = tVar;
        this.f113141b = hVar;
        this.f113142c = kVar;
        this.f113143d = cxVar;
    }

    /* renamed from: b */
    public static final void m76397b(C43904a aVar, C43367l lVar, C60870cx cxVar, C43366k kVar, C43257h hVar, Object obj) {
        C43891f d = aVar.mo46411d(C43331ag.class);
        C69664n.m101060f(d, "getPlugin(T::class.java)");
        ((C43331ag) ((C43945v) d)).mo46448j(lVar, cxVar != null, new C43302n(aVar, cxVar, obj, kVar, hVar));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C43904a aVar = (C43904a) obj;
        C69664n.m101061g(aVar, "window");
        C43911f a = C43912g.m77530a(aVar);
        C43257h b = C43284c.m76381a(this.f113140a.f113152b).mo46394b(this.f113141b);
        C43364i iVar = (C43364i) C43367l.f113293h.createBuilder();
        String f = b.mo46356f();
        iVar.copyOnWrite();
        C43367l lVar = (C43367l) iVar.instance;
        f.getClass();
        lVar.f113295a |= 2;
        lVar.f113297c = f;
        String f2 = b.mo46356f();
        iVar.copyOnWrite();
        C43367l lVar2 = (C43367l) iVar.instance;
        f2.getClass();
        lVar2.f113295a |= 1;
        lVar2.f113296b = f2;
        C43366k kVar = this.f113142c;
        iVar.copyOnWrite();
        C43367l lVar3 = (C43367l) iVar.instance;
        lVar3.f113299e = kVar.f113292i;
        lVar3.f113295a |= 8;
        C43323b c = b.mo46352c();
        iVar.copyOnWrite();
        C43367l lVar4 = (C43367l) iVar.instance;
        c.getClass();
        lVar4.f113300f = c;
        lVar4.f113295a |= 16;
        C62942bv build = iVar.build();
        C69664n.m101060f(build, "newBuilder()\n          .…ata())\n          .build()");
        C43367l lVar5 = (C43367l) build;
        if (!this.f113141b.mo46363l() || !C43923l.m77561a(aVar).mo46947b(lVar5, 1)) {
            C43308t tVar = this.f113140a;
            C43250f fVar = tVar.f113156f;
            C60870cx cxVar = this.f113143d;
            C43366k kVar2 = this.f113142c;
            C43257h hVar = this.f113141b;
            C43298j jVar = new C43298j(a, b, aVar, lVar5, cxVar, kVar2, hVar);
            C43300l lVar6 = r1;
            C43300l lVar7 = new C43300l(tVar, aVar, lVar5, cxVar, kVar2, hVar, a, b);
            if (!fVar.mo46331b()) {
                jVar.mo5672a();
            } else {
                lVar6.mo5761a(C71663i.m104692e(fVar.f113021b, (C71424ay) null, new C43249e(fVar, (C69577g) null), 3));
            }
        }
        return C69788q.f186170a;
    }
}
