package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4985f.p5028p.p5029a.C64979f;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.gb */
/* compiled from: PG */
public final /* synthetic */ class C123456gb implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123459ge f341239a;

    /* renamed from: b */
    public final /* synthetic */ C123503i f341240b;

    /* renamed from: c */
    public final /* synthetic */ C123427f f341241c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f341242d;

    /* renamed from: e */
    public final /* synthetic */ C64979f f341243e;

    public /* synthetic */ C123456gb(C123459ge geVar, C123503i iVar, C123427f fVar, C60870cx cxVar, C64979f fVar2) {
        this.f341239a = geVar;
        this.f341240b = iVar;
        this.f341241c = fVar;
        this.f341242d = cxVar;
        this.f341243e = fVar2;
    }

    public final C60870cx apply(Object obj) {
        Optional optional;
        C123459ge geVar = this.f341239a;
        C123503i iVar = this.f341240b;
        C123427f fVar = this.f341241c;
        C60870cx cxVar = this.f341242d;
        C64979f fVar2 = this.f341243e;
        if (((Boolean) obj).booleanValue()) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        if (!geVar.f341249c.mo105998b(iVar.mo106026d())) {
            Optional j = geVar.mo106017j(fVar, geVar.mo106011b(iVar).f118c);
            if (!j.isPresent()) {
                optional = Optional.empty();
            } else {
                C123427f c = C123459ge.m202806c((C123381dh) j.get());
                if (c.mo106010k()) {
                    optional = Optional.empty();
                } else {
                    String a = geVar.f341250d.mo105911a(iVar.mo106026d(), c);
                    if (a.isEmpty()) {
                        optional = Optional.empty();
                    } else {
                        optional = Optional.m71637of(a);
                    }
                }
            }
            if (!optional.isPresent()) {
                return geVar.mo106016h(fVar, cxVar, fVar2);
            }
            C123410ej ejVar = new C123410ej(geVar, iVar, (String) optional.get());
            return C60922j.m93044g(cxVar, C47810es.m84963c(ejVar), geVar.f341252f);
        }
        C60870cx a2 = geVar.f341249c.mo105997a(fVar, iVar.mo106026d(), fVar2);
        C123413em emVar = new C123413em(geVar, iVar, fVar);
        C60870cx g = C60922j.m93044g(a2, C47810es.m84963c(emVar), C60826bg.f164896a);
        C123429fb fbVar = new C123429fb(geVar, iVar, cxVar, fVar, fVar2);
        return C60922j.m93045h(g, C47810es.m84966f(fbVar), C60826bg.f164896a);
    }
}
