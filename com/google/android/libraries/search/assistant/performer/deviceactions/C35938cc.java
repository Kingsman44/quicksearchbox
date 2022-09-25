package com.google.android.libraries.search.assistant.performer.deviceactions;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.app.C1839z;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.C35973h;
import com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.C35977l;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.cc */
/* compiled from: PG */
public final /* synthetic */ class C35938cc implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35940ce f94098a;

    public /* synthetic */ C35938cc(C35940ce ceVar) {
        this.f94098a = ceVar;
    }

    public final C60870cx apply(Object obj) {
        C35940ce ceVar = this.f94098a;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            ((C59052c) ((C59052c) C35940ce.f94101a.mo56226d()).mo56372aa(51862)).mo56386p("screenshot fetched");
            C35973h hVar = ceVar.f94106f;
            C35977l lVar = ceVar.f94104d;
            C1839z zVar = new C1839z((Context) lVar.f94160a.mo17428b(), "com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.ScreenshotNotificationChannel");
            zVar.f5679J.icon = R.drawable.ma_screenshot_clientop_notification_icon;
            zVar.f5705y = "recommendation";
            zVar.f5685e = C1839z.m5037c(((Context) lVar.f94160a.mo17428b()).getString(R.string.ma_screenshot_saving_title));
            zVar.mo5015d(2, false);
            zVar.mo5015d(16, true);
            hVar.mo39912b(zVar.mo5013a());
            return C47633f.m84733g(ceVar.f94103c.mo39910b(bitmap)).mo51515h(new C35939cd(ceVar, bitmap), ceVar.f94102b);
        }
        ((C59052c) ((C59052c) C35940ce.f94101a.mo56226d()).mo56372aa(51861)).mo56386p("screenshot is null");
        return C60856cj.m92900i(C36180b.m64579c(C52235kf.INTERNAL, "Error occur while taking screenshot: Got null screenshot"));
    }
}
