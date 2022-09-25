package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import android.net.Uri;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4985f.p5028p.p5029a.C64979f;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ek */
/* compiled from: PG */
public final /* synthetic */ class C123411ek implements Function {

    /* renamed from: a */
    public final /* synthetic */ C123459ge f341176a;

    /* renamed from: b */
    public final /* synthetic */ C123427f f341177b;

    /* renamed from: c */
    public final /* synthetic */ C64979f f341178c;

    public /* synthetic */ C123411ek(C123459ge geVar, C123427f fVar, C64979f fVar2) {
        this.f341176a = geVar;
        this.f341177b = fVar;
        this.f341178c = fVar2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C123459ge geVar = this.f341176a;
        C123427f fVar = this.f341177b;
        C64979f fVar2 = this.f341178c;
        C123326bg bgVar = (C123326bg) obj;
        if (bgVar.mo105958a().mo105917a().equals(C123481h.APP) && !bgVar.mo105958a().mo105918b().equals("com.android.chrome") && geVar.f341251e.mo106027a(bgVar.mo105958a().mo105918b(), 4)) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        if (bgVar.mo105958a().mo105917a().equals(C123481h.URL) && geVar.f341251e.mo106028b(Optional.m71637of(Uri.parse(bgVar.mo105958a().mo105922c())), 4)) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        C60870cx g = geVar.mo106015g(bgVar.mo105958a(), fVar, fVar2);
        C123450fw fwVar = new C123450fw(geVar, fVar, bgVar);
        return C60922j.m93044g(g, C47810es.m84963c(fwVar), C60826bg.f164896a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
