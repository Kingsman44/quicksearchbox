package com.google.android.apps.search.weather.p10681a.p10682a;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.apps.search.weather.p10685d.C142073b;
import com.google.android.apps.search.weather.p10688g.C142092a;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.weather.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C142048a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C142055h f385406a;

    /* renamed from: b */
    public final /* synthetic */ Fragment f385407b;

    public /* synthetic */ C142048a(C142055h hVar, Fragment fragment) {
        this.f385406a = hVar;
        this.f385407b = fragment;
    }

    public final void onClick(View view) {
        C142055h hVar = this.f385406a;
        Fragment fragment = this.f385407b;
        C142092a aVar = hVar.f385424h;
        fragment.requireView();
        Intent intent = new Intent();
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.putExtra("source", "and.gsa.weather.launcher.icon");
        C142073b.m230648b(intent);
        String string = aVar.f385502b.getResources().getString(R.string.weather_homescreen_shortcut_label);
        ((ShortcutManager) aVar.f385502b.getSystemService(ShortcutManager.class)).requestPinShortcut(new ShortcutInfo.Builder(aVar.f385502b, "WeatherHomescreenShortcut").setShortLabel(string).setLongLabel(string).setIcon(Icon.createWithResource(aVar.f385502b, R.mipmap.product_logo_weather_launcher_color_48)).setIntent(intent).build(), PendingIntent.getActivity(aVar.f385502b, 0, new Intent("android.intent.action.MAIN").addFlags(268435456).addCategory("android.intent.category.HOME"), 1140850688).getIntentSender());
    }
}
