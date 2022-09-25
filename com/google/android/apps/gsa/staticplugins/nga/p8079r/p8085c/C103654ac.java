package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import android.app.PendingIntent;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.nga.shared.p6345h.p6346a.C81125ca;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.ac */
/* compiled from: PG */
final class C103654ac implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C103656ae f288732a;

    public C103654ac(C103656ae aeVar) {
        this.f288732a = aeVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C103656ae.f288733a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "HfSettingsNotifHandler");
        ((C58970a) ((C58970a) ((C58970a) d).mo56382g(th)).mo56372aa(21623)).mo56386p("Failure.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            C59104x b = C103656ae.f288733a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "HfSettingsNotifHandler");
            ((C58970a) ((C58970a) b).mo56372aa(21624)).mo56386p("Sending BAR deprecation notification.");
            C103656ae aeVar = this.f288732a;
            PendingIntent b2 = aeVar.mo93824b(aeVar.f288735c.mo79758x(C90126fx.f250954G));
            C1839z c = aeVar.mo93825c(R.string.handsfree_settings_bar_deprecated_notification_title, R.string.handsfree_settings_bar_deprecated_notification_body, b2);
            c.mo5016e(0, aeVar.f288734b.getString(R.string.handsfree_settings_bar_deprecated_learn_more), b2);
            aeVar.f288736d.notify("hf", C89885b.GWS_FILE_NOT_FOUND_VALUE, c.mo5013a());
            C118826c.m197213c(this.f288732a.f288738f.f222251a.mo46039a(new C81125ca(), C60826bg.f164896a));
        }
    }
}
