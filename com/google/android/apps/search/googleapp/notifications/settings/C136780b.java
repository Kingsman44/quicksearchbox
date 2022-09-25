package com.google.android.apps.search.googleapp.notifications.settings;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.search.googleapp.notifications.webuisettings.C136808g;
import com.google.android.apps.search.googleapp.p10536x.C139858a;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.notifications.settings.b */
/* compiled from: PG */
public final class C136780b implements C139858a {

    /* renamed from: a */
    private final Context f372329a;

    /* renamed from: b */
    private final String f372330b;

    /* renamed from: c */
    private final boolean f372331c;

    /* renamed from: d */
    private final AccountId f372332d;

    public C136780b(Context context, String str, boolean z, AccountId accountId) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(accountId, "accountId");
        this.f372329a = context;
        this.f372330b = str;
        this.f372331c = z;
        this.f372332d = accountId;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 136120;
    }

    /* renamed from: b */
    public final int mo111854b() {
        return -1;
    }

    /* renamed from: g */
    public final String mo111457g() {
        String string = this.f372329a.getResources().getString(R.string.googleapp_notification_subscriptions_summary);
        C69664n.m101060f(string, "context.resources.getStr…on_subscriptions_summary)");
        return string;
    }

    /* renamed from: j */
    public final String mo111460j() {
        String string = this.f372329a.getResources().getString(R.string.googleapp_notification_subscriptions_header);
        C69664n.m101060f(string, "context.resources.getStr…ion_subscriptions_header)");
        return string;
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return !this.f372331c;
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return false;
    }

    /* renamed from: o */
    public final C60870cx mo111855o() {
        Context context = this.f372329a;
        String str = this.f372330b;
        AccountId accountId = this.f372332d;
        C69664n.m101061g(context, "context");
        C69664n.m101061g(accountId, "accountId");
        Intent a = C136808g.m222483a(context, str, accountId);
        a.setFlags(268468224);
        C47810es.m84979s(context, a);
        return C60866ct.f164955a;
    }
}
