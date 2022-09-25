package com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp;

import android.app.PendingIntent;
import androidx.core.app.C1831r;
import androidx.core.app.C1839z;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;
import p3186j$.util.OptionalLong;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.x */
/* compiled from: PG */
public final /* synthetic */ class C122372x implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122348an f339280a;

    /* renamed from: b */
    public final /* synthetic */ OptionalLong f339281b;

    public /* synthetic */ C122372x(C122348an anVar, OptionalLong optionalLong) {
        this.f339280a = anVar;
        this.f339281b = optionalLong;
    }

    public final C60870cx apply(Object obj) {
        String str;
        C122348an anVar = this.f339280a;
        OptionalLong optionalLong = this.f339281b;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            ((C59052c) ((C59052c) C122348an.f339226a.mo56226d()).mo56372aa(34762)).mo56386p("Can't create download intent, not showing prompt.");
            return C60866ct.f164955a;
        }
        C122360l lVar = anVar.f339233h;
        PendingIntent pendingIntent = (PendingIntent) optional.get();
        C1839z zVar = new C1839z(lVar.f339255b, "DOWNLOAD_PROMPT_NOTIFICATION");
        zVar.f5679J.icon = 17301543;
        zVar.f5705y = "status";
        zVar.f5685e = C1839z.m5037c(lVar.f339255b.getString(R.string.assistant_tmp_notification_title));
        zVar.mo5015d(2, false);
        if (optionalLong.isPresent()) {
            str = lVar.f339255b.getString(R.string.assistant_tmp_notification_prompt, new Object[]{C122360l.m201847c(optionalLong.getAsLong(), Math.max(2, C122360l.m201846a(optionalLong.getAsLong())), 0)});
        } else {
            str = lVar.f339255b.getString(R.string.assistant_tmp_notification_prompt_no_data);
        }
        zVar.f5686f = C1839z.m5037c(str);
        zVar.mo5017f(new C1831r(0, lVar.f339255b.getString(R.string.assistant_tmp_notification_download_action), pendingIntent).mo5008a());
        lVar.mo105605d(zVar, false);
        return C60866ct.f164955a;
    }
}
