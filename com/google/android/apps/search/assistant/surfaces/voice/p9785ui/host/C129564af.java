package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host;

import android.app.KeyguardManager;
import android.os.PowerManager;
import androidx.core.p094f.C1888a;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.af */
/* compiled from: PG */
public final class C129564af {

    /* renamed from: a */
    private final KeyguardManager f355637a;

    /* renamed from: b */
    private final PowerManager f355638b;

    public C129564af(KeyguardManager keyguardManager, PowerManager powerManager) {
        C69664n.m101061g(keyguardManager, "keyguardManager");
        C69664n.m101061g(powerManager, "powerManager");
        this.f355637a = keyguardManager;
        this.f355638b = powerManager;
    }

    /* renamed from: a */
    public final C129541aa mo109104a() {
        C129691y yVar = (C129691y) C129541aa.f355591c.createBuilder();
        C69664n.m101060f(yVar, "newBuilder()");
        C129563ae a = C69664n.m101061g(yVar, "builder");
        if ((!this.f355638b.isInteractive() || this.f355637a.isKeyguardLocked()) && !C1888a.m5150d()) {
            C129685s sVar = (C129685s) C129688v.f355911c.createBuilder();
            C69664n.m101060f(sVar, "newBuilder()");
            C129543ac a2 = C69664n.m101061g(sVar, "builder");
            a2.mo109085b(C129687u.TRANSIENT_ACTIVITY);
            a.mo109103b(a2.mo109084a());
        } else {
            C129689w wVar = (C129689w) C129690x.f355915a.createBuilder();
            C69664n.m101060f(wVar, "newBuilder()");
            C69664n.m101061g(wVar, "builder");
            C62942bv build = wVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C129690x xVar = (C129690x) build;
            C69664n.m101061g(xVar, "value");
            C129691y yVar2 = a.f355636a;
            yVar2.copyOnWrite();
            C129541aa aaVar = (C129541aa) yVar2.instance;
            xVar.getClass();
            aaVar.f355594b = xVar;
            aaVar.f355593a = 2;
        }
        return a.mo109102a();
    }
}
