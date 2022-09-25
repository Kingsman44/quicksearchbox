package com.google.android.apps.search.googleapp.notifications.settings;

import android.content.Context;
import android.content.Intent;
import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6507ag.p6510c.C84490c;
import com.google.android.apps.search.googleapp.notifications.p10365d.C136770a;
import com.google.android.apps.search.googleapp.notifications.settings.p10366a.C136778a;
import com.google.android.apps.search.googleapp.notifications.settings.p10366a.C136779b;
import com.google.android.apps.search.googleapp.p10536x.C139858a;
import com.google.android.apps.search.googleapp.p10536x.C139870f;
import com.google.android.apps.search.xblend.p10707b.C142269a;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.notifications.settings.a */
/* compiled from: PG */
public final class C136777a implements C139858a, C139870f {

    /* renamed from: a */
    public final C84490c f372317a;

    /* renamed from: b */
    private final Context f372318b;

    /* renamed from: c */
    private final Fragment f372319c;

    /* renamed from: d */
    private final C136779b f372320d;

    /* renamed from: e */
    private final boolean f372321e;

    /* renamed from: f */
    private final boolean f372322f;

    /* renamed from: g */
    private final C142269a f372323g;

    public C136777a(Context context, Fragment fragment, C84490c cVar, C136779b bVar, boolean z, boolean z2, C142269a aVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(fragment, "fragment");
        C69664n.m101061g(cVar, "legacyNowSyncScheduler");
        this.f372318b = context;
        this.f372319c = fragment;
        this.f372317a = cVar;
        this.f372320d = bVar;
        this.f372321e = z;
        this.f372322f = z2;
        this.f372323g = aVar;
        fragment.getLifecycle().mo5790b(new NotificationsChannelsSettingsUiElement$1(this));
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 136119;
    }

    /* renamed from: b */
    public final int mo111854b() {
        return -1;
    }

    /* renamed from: d */
    public final C46689ag mo111454d() {
        C136779b bVar = this.f372320d;
        return new C46719bc(bVar.f372328d, new C136778a(bVar), C136779b.f372325a);
    }

    /* renamed from: g */
    public final String mo111457g() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: j */
    public final String mo111460j() {
        String string = this.f372318b.getResources().getString(R.string.googleapp_notifications_enabled_header);
        C69664n.m101060f(string, "context.resources.getStr…fications_enabled_header)");
        return string;
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return !this.f372321e;
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return false;
    }

    /* renamed from: o */
    public final C60870cx mo111855o() {
        if (this.f372322f) {
            C136770a.m222372a(this.f372323g);
            return C60866ct.f164955a;
        }
        Context context = this.f372318b;
        C69664n.m101061g(context, "context");
        Intent putExtra = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").addFlags(268468224).putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        C69664n.m101060f(putExtra, "Intent(Settings.ACTION_A…AGE, context.packageName)");
        C47810es.m84979s(context, putExtra);
        return C60866ct.f164955a;
    }
}
