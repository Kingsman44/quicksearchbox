package com.google.android.libraries.search.assistant.performer.deviceactions;

import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.adc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.br */
/* compiled from: PG */
public final class C35922br implements C35472h {

    /* renamed from: a */
    public static final C59071e f94076a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.br");

    /* renamed from: b */
    private final C35470f f94077b;

    /* renamed from: c */
    private final Executor f94078c;

    public C35922br(Executor executor, C35470f fVar) {
        this.f94077b = fVar;
        this.f94078c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        ((C59052c) ((C59052c) f94076a.mo56224b()).mo56372aa(51855)).mo56386p("TNG OpenUrlPerformer");
        if (dyVar.f135936b.equals("url.OPEN")) {
            adc adc = (adc) C36183e.m64584b(dyVar, "open_url_args", adc.f134873c.getParserForType());
            if ((adc.f134875a & 1) == 0) {
                return C60856cj.m92900i(C36180b.m64579c(C52235kf.INVALID_ARGUMENT, "Unable to open url: no url found."));
            }
            if (!URLUtil.isValidUrl(adc.f134876b)) {
                return C60856cj.m92900i(C36180b.m64579c(C52235kf.INVALID_ARGUMENT, "Unable to open url: invalid url found."));
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(adc.f134876b));
            return C47633f.m84733g(this.f94077b.mo20101f(intent)).mo51515h(C35920bp.f94074a, this.f94078c).mo51513e(Exception.class, new C35921bq(intent), this.f94078c);
        }
        throw new C35471g(String.format("ClientOp name is incorrect. Expected %1$s but instead got %2$s", new Object[]{"url.OPEN", dyVar.f135936b}));
    }
}
