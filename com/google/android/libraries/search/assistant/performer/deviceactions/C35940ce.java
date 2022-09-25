package com.google.android.libraries.search.assistant.performer.deviceactions;

import com.google.android.libraries.search.assistant.invocation.assistdata.p2596b.C33547u;
import com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.C35966a;
import com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.C35973h;
import com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.C35977l;
import com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.C35979n;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.ce */
/* compiled from: PG */
public final class C35940ce implements C35472h {

    /* renamed from: a */
    public static final C59071e f94101a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.ce");

    /* renamed from: b */
    public final Executor f94102b;

    /* renamed from: c */
    public final C35966a f94103c;

    /* renamed from: d */
    public final C35977l f94104d;

    /* renamed from: e */
    public final C35979n f94105e;

    /* renamed from: f */
    public final C35973h f94106f;

    /* renamed from: g */
    private final C60887da f94107g;

    /* renamed from: h */
    private final C33547u f94108h;

    public C35940ce(Executor executor, C60887da daVar, C35973h hVar, C35966a aVar, C35977l lVar, C35979n nVar, C33547u uVar) {
        this.f94108h = uVar;
        this.f94107g = daVar;
        this.f94102b = executor;
        this.f94103c = aVar;
        this.f94106f = hVar;
        this.f94104d = lVar;
        this.f94105e = nVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        ((C59052c) ((C59052c) f94101a.mo56224b()).mo56372aa(51863)).mo56386p("TNG ScreenshotPerformer");
        if (dyVar.f135936b.equals("device.TAKE_SCREENSHOT")) {
            return C47633f.m84733g(this.f94108h.mo38974b()).mo51516i(new C35938cc(this), this.f94107g);
        }
        throw new C35471g(String.format("ClientOp name is incorrect. Expected %1$s but instead got %2$s", new Object[]{"device.TAKE_SCREENSHOT", dyVar.f135936b}));
    }
}
