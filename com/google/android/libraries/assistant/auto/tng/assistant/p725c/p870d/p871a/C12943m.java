package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p870d.p871a;

import android.content.Context;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b.p774a.p775a.C12226a;
import com.google.android.libraries.assistant.auto.tng.common.p922k.p923a.C13274a;
import com.google.android.libraries.assistant.auto.tng.common.p922k.p923a.C13276c;
import com.google.android.libraries.assistant.auto.tng.p1028l.p1029a.C13715a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1158c.C15689a;
import com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1301m.p1302a.C16597a;
import com.google.apps.tiktok.p3674l.p3676b.C47378i;
import com.google.apps.tiktok.p3674l.p3676b.C47380k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.CancellationException;
import org.chromium.net.NetworkException;
import p5488io.grpc.C70761fa;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.d.a.m */
/* compiled from: PG */
public final /* synthetic */ class C12943m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C12945o f40289a;

    public /* synthetic */ C12943m(C12945o oVar) {
        this.f40289a = oVar;
    }

    public final C60870cx apply(Object obj) {
        C12945o oVar = this.f40289a;
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            return C60866ct.f164955a;
        }
        ((C59052c) ((C59052c) ((C59052c) C12945o.f40297a.mo56226d()).mo56382g(th)).mo56372aa(44540)).mo56386p("handleFailure");
        C47380k b = oVar.f40298b.f123099a.mo51243b(th);
        C58485gu guVar = b.f123106c;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            ((Runnable) ((C58847bk) C58833ax.m90834k(((C47378i) guVar.get(i2)).f123101b.f123108a)).f156646a).run();
        }
        String obj2 = b.f123104a.toString();
        if (obj2.isEmpty()) {
            return C60866ct.f164955a;
        }
        int i3 = ((th instanceof NetworkException) || (th instanceof C12226a) || (th instanceof C13715a) || (th instanceof C15689a) || ((th instanceof C70761fa) && (th.getCause() instanceof C16597a))) ? 3 : 4;
        C60870cx b2 = oVar.f40301e.mo23063b();
        C13276c cVar = oVar.f40302f;
        Context context = cVar.f40968a;
        C60870cx g = C60922j.m93044g(cVar.mo21005a(), C47810es.m84963c(new C13274a(context)), cVar.f40969b);
        return C47638k.m84753d(b2, g).mo51521b(new C12944n(oVar, b2, g, b, obj2, th, i3), oVar.f40299c);
    }
}
