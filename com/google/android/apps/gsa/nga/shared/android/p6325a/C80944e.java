package com.google.android.apps.gsa.nga.shared.android.p6325a;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import androidx.core.app.C1793aj;
import androidx.core.app.C1794ak;
import androidx.core.app.C1795al;
import androidx.core.app.C1800aq;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.shared.p6974ae.C89094c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.shared.android.a.e */
/* compiled from: PG */
public final class C80944e {

    /* renamed from: a */
    public static final C58485gu f221931a = C58485gu.m89832B(C89094c.NGA_ANDROID_VERSION, C89094c.NGA_SODA, C89094c.NGA_RUNNING, C89094c.NGA_SURVEY, C89094c.NGA_ABNORMAL_MEMORY, C89094c.NGA_INITIAL_DOWNLOAD, C89094c.NGA_SCREENSHOT, C89094c.NGA_PIE_TRIGGER, C89094c.NGA_APPFLOW_ERROR_OCCURRED, C89094c.NGA_WARMACTIONS);

    /* renamed from: b */
    private static final C58974d f221932b = C58974d.m91136j();

    /* renamed from: c */
    private static final int f221933c = R.drawable.ic_assistant;

    /* renamed from: d */
    private static final int f221934d = R.string.nga_notification_default_title;

    /* renamed from: e */
    private static final int f221935e = R.string.nga_notification_channel_group;

    /* renamed from: f */
    private final Context f221936f;

    /* renamed from: g */
    private final C1800aq f221937g;

    /* renamed from: h */
    private final C91142g f221938h;

    public C80944e(Context context, C91142g gVar) {
        this.f221936f = context;
        this.f221937g = new C1800aq(context);
        this.f221938h = gVar;
    }

    /* renamed from: a */
    public final void mo74728a(C89094c cVar) {
        C1800aq aqVar = this.f221937g;
        aqVar.f5622a.cancel((String) null, cVar.f241522aD);
    }

    /* renamed from: b */
    public final boolean mo74729b(C80942c cVar) {
        NotificationChannelGroup a;
        if (!cVar.f221930i.f221919b || this.f221938h.mo85405j(C90126fx.f251172dm)) {
            if ((cVar.ordinal() != 0 || this.f221938h.mo85405j(C90126fx.f251341gw)) && C1793aj.m4937b(this.f221937g.f5622a) && ((a = C1795al.m4949a(this.f221937g.f5622a, "nga_notification_channels")) == null || !a.isBlocked())) {
                C1800aq aqVar = this.f221937g;
                NotificationChannel a2 = C1794ak.m4938a(aqVar.f5622a, cVar.name());
                if (a2 == null || a2.getImportance() != 0) {
                    return true;
                }
            }
            return false;
        }
        ((C58970a) ((C58970a) f221932b.mo56226d()).mo56372aa(5797)).mo56386p("Not displaying debug notification");
        return false;
    }

    /* renamed from: c */
    public final boolean mo74730c(C89094c cVar, C80942c cVar2, C80943d dVar) {
        if (!mo74729b(cVar2)) {
            return false;
        }
        C1800aq aqVar = this.f221937g;
        if (C1794ak.m4938a(aqVar.f5622a, cVar2.name()) == null) {
            List d = C1794ak.m4941d(this.f221937g.f5622a);
            if (d != null) {
                Iterator it = d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((NotificationChannelGroup) it.next()).getId().equals("nga_notification_channels")) {
                            break;
                        }
                    } else {
                        C1800aq aqVar2 = this.f221937g;
                        C1794ak.m4944g(aqVar2.f5622a, new NotificationChannelGroup("nga_notification_channels", this.f221936f.getString(f221935e)));
                        break;
                    }
                }
            }
            NotificationChannel notificationChannel = new NotificationChannel(cVar2.name(), cVar2.f221930i.mo74727b(this.f221936f), cVar2.f221930i.f221918a);
            notificationChannel.setDescription(cVar2.f221930i.mo74726a(this.f221936f));
            notificationChannel.setGroup("nga_notification_channels");
            C1794ak.m4943f(this.f221937g.f5622a, notificationChannel);
        }
        C1839z zVar = new C1839z(this.f221936f, (String) null);
        zVar.f5679J.icon = f221933c;
        zVar.f5705y = "status";
        zVar.f5685e = C1839z.m5037c(this.f221936f.getString(f221934d));
        zVar.mo5015d(2, true);
        dVar.mo71377a(zVar);
        zVar.f5675F = cVar2.name();
        this.f221937g.mo5003b((String) null, cVar.f241522aD, zVar.mo5013a());
        return true;
    }
}
