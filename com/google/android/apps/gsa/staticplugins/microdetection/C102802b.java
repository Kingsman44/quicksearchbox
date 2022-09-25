package com.google.android.apps.gsa.staticplugins.microdetection;

import android.content.Context;
import android.os.PowerManager;
import com.google.android.apps.gsa.shared.util.p7158b.C90747d;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.hotword.C92354c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.Future;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.b */
/* compiled from: PG */
public final class C102802b extends C90888av {

    /* renamed from: a */
    public static final C59071e f287052a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.microdetection.b");

    /* renamed from: b */
    public final C90747d f287053b = C90748e.m148223a(false);

    /* renamed from: c */
    volatile C102792ac f287054c;

    /* renamed from: d */
    public Future f287055d;

    /* renamed from: e */
    private final Context f287056e;

    /* renamed from: f */
    private final C90931ca f287057f;

    /* renamed from: g */
    private final C22871g f287058g;

    /* renamed from: h */
    private final PowerManager f287059h;

    public C102802b(Context context, C90931ca caVar, C22871g gVar) {
        super("HotwordDeviceStateChecker", 2, 16);
        this.f287056e = context;
        this.f287057f = caVar;
        this.f287058g = gVar;
        this.f287059h = (PowerManager) context.getSystemService("power");
    }

    /* renamed from: b */
    public final void mo93459b(C102792ac acVar) {
        this.f287053b.mo85091a();
        this.f287054c = acVar;
        Future future = this.f287055d;
        if (future != null) {
            future.cancel(true);
        }
        this.f287055d = this.f287057f.mo85139d(this);
    }

    public final void run() {
        this.f287054c.getClass();
        while (this.f287054c.mo93456d()) {
            try {
                Thread.sleep(180000);
                boolean isScreenOn = this.f287059h.isScreenOn();
                boolean d = C92354c.m151658d(this.f287056e);
                C59071e eVar = f287052a;
                ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(21040)).mo56358K("screenOn: %b, isCharging: %b", isScreenOn, d);
                if (this.f287054c.mo93456d() && !isScreenOn && !d) {
                    ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(21041)).mo56386p("Force stopping micro detector.");
                    this.f287058g.mo28212l("ForceStopMicroDetector", new C102785a(this));
                    return;
                }
            } catch (InterruptedException unused) {
                ((C59052c) ((C59052c) f287052a.mo56225c()).mo56372aa(21042)).mo56386p("DeviceStateChecker cancelled");
                return;
            }
        }
        ((C59052c) ((C59052c) f287052a.mo56226d()).mo56372aa(21039)).mo56386p("stopped because hotword detection is stopped but cancel is not called.");
    }
}
