package com.google.android.apps.gsa.assistant.settings;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.shared.h.a;
import com.google.android.apps.gsa.assistant.settings.shared.h.b;
import com.google.android.apps.gsa.assistant.settings.shared.h.c;
import com.google.android.apps.gsa.assistant.settings.shared.h.e;
import com.google.android.apps.gsa.assistant.settings.shared.p5797h.C73755h;
import com.google.android.apps.gsa.assistant.settings.shared.p5797h.C73757j;
import com.google.common.base.C58831av;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.c */
/* compiled from: PG */
public final class C9515c {

    /* renamed from: a */
    private static final C59071e f32995a = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.c");

    /* renamed from: a */
    public static C73757j m24144a(Activity activity) {
        String str;
        String str2;
        Intent intent = activity.getIntent();
        intent.getClass();
        Uri data = intent.getData();
        if (data != null && data.isOpaque()) {
            C59104x c = f32995a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ASAModule");
            ((C59052c) ((C59052c) c).mo56372aa(292)).mo56389s("invalid uri %s", data);
            activity.finish();
        }
        if ((data != null ? data.getScheme() : BuildConfig.FLAVOR).equals("assistant-settings")) {
            w.b(data, "account_name", intent, "account_name");
            w.b(data, "assistant_device_id", intent, "assistant_device_id");
            w.b(data, "assistant_home_automation_provider_id", intent, "assistant_home_automation_provider_id");
            w.b(data, "feature", intent, "assistant_settings_feature");
            w.b(data, "feature_action", intent, "assistant_settings_feature_action");
            w.b(data, "feature_secondary_action", intent, "assistant_settings_feature_secondary_action");
            w.b(data, "device_info_extras", intent, "assistant_settings_device_info_extras");
            w.b(data, "assistant_locale", intent, "assistant_settings_locale");
            w.b(data, "assistant_settings_version_info", intent, "assistant_settings_version_info");
            w.b(data, "assistant_settings_devices_not_enrolled", intent, "assistant_settings_devices_not_enrolled");
            w.b(data, "assistant_entry_source", intent, "extra_assistant_settings_entry_source");
            String queryParameter = data.getQueryParameter("surface");
            if (queryParameter != null) {
                try {
                    intent.putExtra("assistant_surface", Integer.parseInt(queryParameter));
                } catch (NumberFormatException e) {
                    C59104x d = w.a.mo56226d();
                    str2 = BuildConfig.FLAVOR;
                    str = "account_name";
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(318)).mo56389s("Bad surface value: %s", queryParameter);
                }
            }
        }
        str2 = BuildConfig.FLAVOR;
        str = "account_name";
        if (intent.hasExtra("assistant_surface")) {
            intent.putExtra("surface", intent.getIntExtra("assistant_surface", 0));
        }
        if (intent.hasExtra("assistant_settings_feature_action")) {
            intent.putExtra("feature_action", intent.getStringExtra("assistant_settings_feature_action"));
        }
        if (intent.hasExtra("assistant_settings_locale")) {
            intent.putExtra("assistant_locale", intent.getStringExtra("assistant_settings_locale"));
        }
        if (intent.hasExtra("assistant_settings_device_info_extras")) {
            intent.putParcelableArrayListExtra("device_info_extras", intent.getParcelableArrayListExtra("assistant_settings_device_info_extras"));
        }
        if (intent.hasExtra(":settings:fragment_args_key")) {
            intent.putExtra("assistant_settings_feature", intent.getStringExtra(":settings:fragment_args_key"));
            intent.putExtra("extra_assistant_settings_entry_source", "android_search");
        }
        Intent intent2 = activity.getIntent();
        Uri data2 = intent2.getData();
        if (data2 != null && !data2.isOpaque()) {
            String scheme = data2.getScheme();
            if ("http".equals(scheme) || "https".equals(scheme)) {
                return new c(data2);
            }
        }
        Bundle bundle = (Bundle) C58831av.m90830c(intent2.getExtras(), Bundle.EMPTY);
        e g = C73755h.m108312g();
        String str3 = str2;
        g.b(bundle.getString(str, str3));
        String string = bundle.getString("extra_assistant_settings_entry_source", str3);
        if (string != null) {
            e eVar = g;
            eVar.b = string;
            g.d(bundle.getString(":assistantsettings:show_fragment", str3));
            g.e(bundle.getString(":assistantsettings:show_fragment_title", str3));
            g.f(bundle.getInt(":assistantsettings:show_fragment_title_resid", 0));
            Bundle bundle2 = bundle.getBundle(":assistantsettings:show_fragment_args");
            if (bundle2 != null) {
                eVar.d = bundle2;
            }
            C73755h a = g.a();
            if (!a.mo65231e().isEmpty()) {
                a.getClass();
                return new b(a);
            }
            intent2.getClass();
            return new a(intent2);
        }
        throw new NullPointerException("Null entrySource");
    }
}
