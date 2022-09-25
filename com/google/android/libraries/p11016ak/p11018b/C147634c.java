package com.google.android.libraries.p11016ak.p11018b;

import com.google.android.libraries.p11016ak.C147630ak;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.grpc.C47686k;
import com.google.common.base.C58827ar;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import p5285d.p5290b.p5291a.p5292a.C68154aq;
import p5285d.p5290b.p5291a.p5292a.C68155ar;
import p5285d.p5290b.p5291a.p5292a.C68200m;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.p5533i.C70877p;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.android.libraries.ak.b.c */
/* compiled from: PG */
public final class C147634c {

    /* renamed from: a */
    public final C68154aq f398472a;

    /* renamed from: b */
    public final C147630ak f398473b;

    /* renamed from: c */
    private final C68155ar f398474c;

    public C147634c(C68155ar arVar, C68154aq aqVar, C147630ak akVar) {
        this.f398474c = arVar;
        this.f398472a = aqVar;
        this.f398473b = akVar;
    }

    /* renamed from: a */
    public static C60870cx m240700a(C60870cx cxVar, Object obj) {
        C147632a aVar = new C147632a(obj);
        return C60846c.m92879h(cxVar, C70761fa.class, C47810es.m84966f(aVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public static C70761fa m240701b(C70761fa faVar, Object obj) {
        return new C70761fa(faVar.f188571a.mo61677b(obj.toString()), faVar.f188572b, true);
    }

    /* renamed from: c */
    public final void mo124382c(C68200m mVar, C70877p pVar, String... strArr) {
        C68155ar arVar = this.f398474c;
        C70334de deVar = new C70334de();
        deVar.mo62033h(new C70290cs("X-Goog-FieldMask", C70334de.f187481c), C58827ar.m90818c(',').mo56097d(Arrays.asList(strArr)));
        C68155ar arVar2 = (C68155ar) arVar.mo62576o(new C70879r(deVar));
        C62910ar arVar3 = this.f398473b.f398461a;
        if (arVar3 == null) {
            arVar3 = C62910ar.f169858c;
        }
        ((C68155ar) arVar2.mo62575n(C62948a.m95453d(arVar3), TimeUnit.MILLISECONDS)).mo60280b(mVar, C47686k.m84827a(new C147633b(pVar, mVar)));
    }
}
