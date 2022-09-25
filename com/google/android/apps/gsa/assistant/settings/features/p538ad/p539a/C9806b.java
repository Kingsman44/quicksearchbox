package com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9856x;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9857y;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.storage.protostore.C43019v;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ad.a.b */
/* compiled from: PG */
public final class C9806b implements C43019v {

    /* renamed from: a */
    private final Context f33790a;

    /* renamed from: b */
    private final C89994f f33791b;

    /* renamed from: c */
    private final C86124t f33792c;

    public C9806b(Context context, C89994f fVar, C86124t tVar) {
        this.f33790a = context;
        this.f33791b = fVar;
        this.f33792c = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo18054a() {
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo18055b(MessageLite messageLite) {
        C9857y yVar = (C9857y) messageLite;
        if ((yVar.f33885a & 1) != 0) {
            C9855w a = C9855w.m24617a(yVar.f33886b);
            if (a == null) {
                a = C9855w.STANDBY;
            }
            if (a != C9855w.STANDBY) {
                C58976aa aaVar = C58975e.f156826a;
                return C60856cj.m92900i(yVar);
            }
        }
        if (!this.f33791b.mo83835A()) {
            C58976aa aaVar2 = C58975e.f156826a;
            return C60856cj.m92900i(yVar);
        }
        C58976aa aaVar3 = C58975e.f156826a;
        C89994f fVar = this.f33791b;
        EventForDump.m147676e(26, "LockscreenMigration");
        fVar.mo83837C(false);
        PendingIntent activity = PendingIntent.getActivity(this.f33790a, C89885b.OKHTTP_CANNOT_BUFFER_BODY_VALUE, new Intent("android.intent.action.VIEW", Uri.parse(this.f33792c.mo79758x(C90014bt.f247392gL))), 335544320);
        C1839z zVar = new C1839z(this.f33790a, (String) null);
        zVar.f5679J.icon = R.drawable.opa_logo;
        zVar.f5685e = C1839z.m5037c(this.f33790a.getString(R.string.lockscreen_notification_title));
        zVar.f5686f = C1839z.m5037c(this.f33790a.getString(R.string.lockscreen_notification_content));
        zVar.f5690j = 2;
        zVar.mo5015d(16, true);
        zVar.f5687g = activity;
        zVar.mo5016e(0, this.f33790a.getString(R.string.lockscreen_notification_learn_more), activity);
        NotificationManager notificationManager = (NotificationManager) this.f33790a.getSystemService("notification");
        notificationManager.createNotificationChannel(new NotificationChannel("Assistant on Lockscreen notification", this.f33790a.getString(R.string.lockscreen_notification_channel_name), 2));
        zVar.f5675F = "Assistant on Lockscreen notification";
        notificationManager.notify("os", C89885b.OKHTTP_CANNOT_BUFFER_BODY_VALUE, zVar.mo5013a());
        C9856x xVar = (C9856x) yVar.toBuilder();
        C9855w wVar = C9855w.ENABLED;
        xVar.copyOnWrite();
        C9857y yVar2 = (C9857y) xVar.instance;
        yVar2.f33886b = wVar.f33882d;
        yVar2.f33885a |= 1;
        return C60856cj.m92900i((C9857y) xVar.build());
    }

    /* renamed from: c */
    public final C60870cx mo18056c() {
        C58976aa aaVar = C58975e.f156826a;
        return C60856cj.m92900i(Boolean.valueOf(this.f33792c.mo79746e(C90059dk.f249055aR)));
    }
}
