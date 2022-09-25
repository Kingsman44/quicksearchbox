package com.google.android.apps.search.googleapp.notifications.settings;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.notifications.p10365d.C136770a;
import com.google.android.apps.search.googleapp.p10536x.C139858a;
import com.google.android.apps.search.xblend.p10707b.C142269a;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.notifications.settings.c */
/* compiled from: PG */
public final class C136781c implements C139858a {

    /* renamed from: a */
    private final Context f372333a;

    /* renamed from: b */
    private final C142269a f372334b;

    /* renamed from: c */
    private final boolean f372335c;

    public C136781c(Context context, C142269a aVar, boolean z, AccountId accountId) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(accountId, "accountId");
        this.f372333a = context;
        this.f372334b = aVar;
        this.f372335c = z;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 136055;
    }

    /* renamed from: b */
    public final int mo111854b() {
        return R.drawable.quantum_gm_ic_notifications_vd_theme_24;
    }

    /* renamed from: g */
    public final String mo111457g() {
        if (!this.f372335c) {
            return BuildConfig.FLAVOR;
        }
        String string = this.f372333a.getString(R.string.googleapp_notifications_enabled_summary);
        C69664n.m101060f(string, "context.getString(R.stri…ications_enabled_summary)");
        return string;
    }

    /* renamed from: j */
    public final String mo111460j() {
        String string = this.f372333a.getResources().getString(R.string.googleapp_notifications_settings_title);
        C69664n.m101060f(string, "context.resources.getStr…fications_settings_title)");
        return string;
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return true;
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return false;
    }

    /* renamed from: o */
    public final C60870cx mo111855o() {
        C136770a.m222372a(this.f372334b);
        return C60866ct.f164955a;
    }
}
