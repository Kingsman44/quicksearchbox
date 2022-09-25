package com.google.android.apps.gsa.staticplugins.opa.ambient.p8278k;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.opa.smartspace.C83802r;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6974ae.C89095d;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.util.p7171i.C91042a;
import com.google.android.apps.gsa.smartspace.C92033ac;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.proactive.C36335p;
import com.google.assistant.p3886c.C50738bc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.k.a */
/* compiled from: PG */
public final class C107124a implements C92033ac {

    /* renamed from: a */
    private final Context f298200a;

    /* renamed from: b */
    private final C86124t f298201b;

    public C107124a(Context context, C86124t tVar) {
        this.f298200a = context;
        this.f298201b = tVar;
    }

    /* renamed from: c */
    private static C58833ax m177844c(int i, List list) {
        if (list.size() <= i) {
            return C58836b.f156633a;
        }
        C83802r rVar = (C83802r) list.get(i);
        return (!rVar.mo77093c().mo56113h() || !rVar.mo77094d().mo56113h()) ? C58836b.f156633a : C58833ax.m90834k(rVar);
    }

    /* renamed from: a */
    public final C60870cx mo86686a(C92113i[] iVarArr, C58833ax axVar) {
        if (!axVar.mo56113h() || !this.f298201b.mo79746e(C90017bw.f248025cy)) {
            ((NotificationManager) this.f298200a.getApplicationContext().getSystemService("notification")).cancel("SmartspaceUpdateNotific", C91042a.m148717a("SmartspaceUpdateNotification"));
            return C118826c.f331423b;
        }
        C58833ax c = m177844c(0, (List) axVar.mo56107c());
        C58833ax c2 = m177844c(1, (List) axVar.mo56107c());
        if (c.mo56113h() || c2.mo56113h()) {
            C1839z a = C89095d.m144923a(this.f298200a, C36335p.OPA_MISC.name());
            a.f5679J.icon = R.drawable.opa_logo;
            a.f5685e = C1839z.m5037c(this.f298200a.getString(R.string.chip_notification_title));
            a.f5686f = C1839z.m5037c(this.f298200a.getString(R.string.chip_notification_content));
            a.f5690j = -1;
            a.mo5015d(2, true);
            if (c.mo56113h()) {
                a.mo5016e(0, ((C50738bc) ((C83802r) c.mo56107c()).mo77094d().mo56107c()).f132037d, (PendingIntent) ((C83802r) c.mo56107c()).mo77093c().mo56107c());
            }
            if (c2.mo56113h()) {
                a.mo5016e(0, ((C50738bc) ((C83802r) c2.mo56107c()).mo77094d().mo56107c()).f132037d, (PendingIntent) ((C83802r) c2.mo56107c()).mo77093c().mo56107c());
            }
            NotificationManager notificationManager = (NotificationManager) this.f298200a.getSystemService("notification");
            notificationManager.createNotificationChannel(new NotificationChannel("SMARTSPACE_UPDATE_CHANNEL_ID", "Smartspace Update Notification", 2));
            a.f5675F = "SMARTSPACE_UPDATE_CHANNEL_ID";
            notificationManager.notify("SmartspaceUpdateNotific", C91042a.m148717a("SmartspaceUpdateNotification"), a.mo5013a());
        }
        return C118826c.f331423b;
    }

    /* renamed from: b */
    public final C60870cx mo86687b(C92113i[] iVarArr) {
        return C118826c.f331423b;
    }
}
