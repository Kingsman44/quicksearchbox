package com.google.android.apps.gsa.search.core.preferences.notification;

import android.content.Intent;
import android.preference.PreferenceActivity;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.settingsui.C88992g;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7066m.C90081ef;
import com.google.android.apps.gsa.velvet.p8863ui.settings.C118651e;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.notification.d */
/* compiled from: PG */
public final class C86329d implements C88992g {

    /* renamed from: a */
    private final C86124t f233415a;

    /* renamed from: b */
    private final String f233416b;

    /* renamed from: c */
    private final C84474e f233417c;

    public C86329d(C86124t tVar, C84474e eVar, String str) {
        this.f233415a = tVar;
        this.f233417c = eVar;
        this.f233416b = str;
    }

    /* renamed from: a */
    public final C58495hd mo17755a() {
        String str;
        if (this.f233417c.mo78080Y()) {
            str = NotificationSnoPatrolSettingsFragment.class.getName();
        } else {
            int i = NowNotificationSettingsFragment.f233404g;
            str = NotificationOPlusSettingsFragment.class.getName();
        }
        C86124t tVar = this.f233415a;
        C58480gp e = C58485gu.m89837e();
        if (tVar.mo79746e(C89985ax.f246669W)) {
            e.mo55395g(Integer.valueOf(R.xml.searchbox_effects_preferences));
        }
        if (tVar.mo79746e(C90081ef.f249843l)) {
            e.mo55395g(Integer.valueOf(R.xml.notification_snobell_preference));
        }
        e.mo55395g(Integer.valueOf(R.xml.notification_post_o_settings));
        C58485gu f = e.mo55394f();
        C58490gz gzVar = new C58490gz(4);
        int i2 = ((C58724pq) f).f156474d;
        for (int i3 = 0; i3 < i2; i3++) {
            gzVar.mo55429h((Integer) f.get(i3), str);
        }
        return gzVar.mo55427f(false);
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo17756b() {
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ List mo17757c() {
        return C58485gu.m89845m();
    }

    /* renamed from: d */
    public final List mo17758d(C118651e eVar) {
        List<PreferenceActivity.Header> a = eVar.mo103835a(R.xml.notification_preference_header);
        for (PreferenceActivity.Header header : a) {
            if (header.id == 2131433765) {
                if (this.f233417c.mo78080Y()) {
                    header.fragment = NotificationSnoPatrolSettingsFragment.class.getName();
                } else if (this.f233415a.mo79746e(C90081ef.f249853v) || this.f233415a.mo79746e(C90081ef.f249843l)) {
                    int i = NowNotificationSettingsFragment.f233404g;
                    header.fragment = NotificationOPlusSettingsFragment.class.getName();
                } else {
                    header.intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").addFlags(268435456).putExtra("android.provider.extra.APP_PACKAGE", this.f233416b);
                }
            }
        }
        return a;
    }
}
