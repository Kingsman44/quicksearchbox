package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17266e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3921j.C52431rm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66626cx;
import java.util.concurrent.Executor;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.x */
/* compiled from: PG */
final class C120382x implements C17266e {

    /* renamed from: a */
    public static final C59071e f334883a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.e.b.a.x");

    /* renamed from: b */
    public final C60870cx f334884b;

    /* renamed from: c */
    public final C60870cx f334885c;

    /* renamed from: d */
    private final Executor f334886d;

    public C120382x(C60870cx cxVar, C60870cx cxVar2, Executor executor) {
        this.f334884b = cxVar;
        this.f334885c = cxVar2;
        this.f334886d = executor;
    }

    /* renamed from: b */
    public static C66626cx m199405b(String str) {
        if (str.equals(C52431rm.ANDROID_THINGS_CUBE.name()) || str.equals(C52431rm.ANDROID_THINGS_JASPER.name()) || str.equals(C52431rm.CHROMECAST_MANHATTAN.name())) {
            return C66626cx.DRAGONGLASS;
        }
        if (str.equals(C52431rm.OPA_ANDROID_TABLET.name())) {
            return C66626cx.TABLET;
        }
        if (str.equals(C52431rm.OPA_ANDROID_SMART_DISPLAY.name())) {
            return C66626cx.SMART_DISPLAY_ANDROID;
        }
        if (str.equals(C52431rm.GOOGLE_HOME.name())) {
            return C66626cx.CHIRP;
        }
        if (str.equals(C52431rm.ANDROID_TV.name()) || str.equals(C52431rm.ANDROID_TV_KIDS.name())) {
            return C66626cx.TV;
        }
        if (str.equals(C52431rm.ANDROID_WEAR.name())) {
            return C66626cx.WATCH;
        }
        return C66626cx.PHONE;
    }

    /* renamed from: a */
    public final C60870cx mo23245a() {
        C59104x b = f334883a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
        ((C59052c) ((C59052c) b).mo56372aa(34679)).mo56386p("#createInitialRequestMutator for cloud arbitration");
        return C47638k.m84753d(this.f334884b, this.f334885c).mo51520a(new C120380v(this), this.f334886d);
    }

    /* renamed from: c */
    public final /* synthetic */ C60870cx mo23246c(Consumer consumer) {
        return C60866ct.f164955a;
    }
}
