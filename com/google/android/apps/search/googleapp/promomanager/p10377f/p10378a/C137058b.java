package com.google.android.apps.search.googleapp.promomanager.p10377f.p10378a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.weather.p10685d.C142073b;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63943g;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63944h;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.f.a.b */
/* compiled from: PG */
final class C137058b implements C137057a {

    /* renamed from: a */
    private static final C59071e f372992a = C59071e.m91332i("com.google.android.apps.search.googleapp.promomanager.f.a.b");

    /* renamed from: b */
    private final Context f372993b;

    public C137058b(Fragment fragment) {
        this.f372993b = fragment.getContext();
    }

    /* renamed from: a */
    public final boolean mo113483a(C63944h hVar) {
        C59052c cVar = (C59052c) ((C59052c) f372992a.mo56224b()).mo56372aa(40918);
        C63943g a = C63943g.m96323a(hVar.f172935a);
        if (a == null) {
            a = C63943g.TYPE_UNSPECIFIED;
        }
        cVar.mo56389s("#executeAction(%s)", a.name());
        Intent intent = new Intent();
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        C142073b.m230648b(intent);
        intent.putExtra("source", "and.gsa.weather.launcher.icon");
        String string = this.f372993b.getResources().getString(R.string.googleapp_weather_hsi_query);
        return ((ShortcutManager) this.f372993b.getSystemService(ShortcutManager.class)).requestPinShortcut(new ShortcutInfo.Builder(this.f372993b, "WeatherHomescreenShortcut").setShortLabel(string).setLongLabel(string).setIcon(Icon.createWithResource(this.f372993b, R.mipmap.product_logo_weather_launcher_color_48)).setIntent(intent).build(), PendingIntent.getActivity(this.f372993b, 0, new Intent("android.intent.action.MAIN").addFlags(268435456).addCategory("android.intent.category.HOME"), 1140850688).getIntentSender());
    }
}
