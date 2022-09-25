package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a;

import com.google.android.libraries.mdi.C28597c;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4985f.p5030q.C65202fi;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a.as */
/* compiled from: PG */
public final /* synthetic */ class C123105as implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C123111ay f340734a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f340735b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f340736c;

    public /* synthetic */ C123105as(C123111ay ayVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f340734a = ayVar;
        this.f340735b = cxVar;
        this.f340736c = cxVar2;
    }

    public final Object call() {
        C123111ay ayVar = this.f340734a;
        C60870cx cxVar = this.f340735b;
        C60870cx cxVar2 = this.f340736c;
        Optional optional = (Optional) C60856cj.m92909r(cxVar);
        if (optional.isEmpty()) {
            return C65202fi.f176480c;
        }
        if (((C29690f) optional.get()).f80417h != 0) {
            return C123111ay.m202450b((C29690f) optional.get(), ayVar.f340743b);
        }
        Optional map = ((Optional) C60856cj.m92909r(cxVar2)).map(new C123107au(ayVar));
        C28597c cVar = (C28597c) ((C29690f) optional.get()).toBuilder();
        map.ifPresent(new C123108av(cVar));
        return C123111ay.m202450b((C29690f) cVar.build(), ayVar.f340743b);
    }
}
