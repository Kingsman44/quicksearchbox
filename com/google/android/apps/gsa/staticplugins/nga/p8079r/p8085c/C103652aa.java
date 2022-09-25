package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w;
import com.google.android.apps.gsa.nga.shared.p6345h.p6346a.C81123bz;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.aa */
/* compiled from: PG */
public final /* synthetic */ class C103652aa implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C103656ae f288730a;

    public /* synthetic */ C103652aa(C103656ae aeVar) {
        this.f288730a = aeVar;
    }

    public final Object apply(Object obj) {
        int i;
        int i2;
        int i3;
        String str;
        C103656ae aeVar = this.f288730a;
        C58976aa aaVar = C58975e.f156826a;
        boolean equals = C9855w.ENABLED.equals((C9855w) obj);
        PendingIntent b = aeVar.mo93824b(aeVar.f288735c.mo79758x(C90126fx.f251511kG));
        if (equals) {
            str = "com.google.android.googlequicksearchbox.action.ACTION_OPEN_LOCKSCREEN_SETTINGS";
            i3 = R.string.handsfree_bluetooth_setting_deprecated_aol_on_notification_title;
            i2 = R.string.handsfree_bluetooth_setting_deprecated_aol_on_notification_body;
            i = R.string.handsfree_headset_setting_deprecated_aol_on_notification_affirmative_action_label;
        } else {
            str = "com.google.android.googlequicksearchbox.action.ACTION_ENABLE_AOL";
            i3 = R.string.handsfree_bluetooth_setting_deprecated_aol_off_notification_title;
            i2 = R.string.handsfree_bluetooth_setting_deprecated_aol_off_notification_body;
            i = R.string.handsfree_headset_setting_deprecated_aol_off_notification_affirmative_action_label;
        }
        C1839z c = aeVar.mo93825c(i3, i2, b);
        Intent addFlags = new Intent().setComponent(new ComponentName(aeVar.f288734b, "com.google.android.apps.gsa.handsfree.components.HandsFreeNotificationActivity")).setAction(str).putExtra("extra_notification_id", C89885b.GWS_UNKNOWN_EXCEPTION_VALUE).addFlags(268468224);
        if (equals) {
            addFlags.putExtra("extra_assistant_settings_entry_source", "handsfree_headset_settings_deprecation_notification");
        }
        String string = aeVar.f288734b.getString(i);
        PendingIntent activity = PendingIntent.getActivity(aeVar.f288734b, 0, C147798a.m240896b(addFlags, 1275068416, 0), 1275068416);
        activity.getClass();
        c.mo5016e(0, string, activity);
        c.mo5016e(0, aeVar.f288734b.getString(R.string.handsfree_headset_setting_deprecated_notification_negative_action_label), b);
        aeVar.f288736d.notify("hf", C89885b.GWS_UNKNOWN_EXCEPTION_VALUE, c.mo5013a());
        C118826c.m197213c(aeVar.f288738f.f222251a.mo46039a(new C81123bz(), C60826bg.f164896a));
        return true;
    }
}
