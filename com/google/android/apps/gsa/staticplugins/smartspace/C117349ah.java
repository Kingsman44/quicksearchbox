package com.google.android.apps.gsa.staticplugins.smartspace;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.widget.RemoteViews;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7159c.C90953s;
import com.google.android.apps.gsa.smartspace.C92035ae;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.ah */
/* compiled from: PG */
final class C117349ah extends C90953s {

    /* renamed from: a */
    final /* synthetic */ C117350ai f325728a;

    /* renamed from: b */
    private final C92035ae f325729b;

    /* renamed from: c */
    private final SettableFuture f325730c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117349ah(C117350ai aiVar, C92035ae aeVar, SettableFuture settableFuture) {
        super("SmartspaceWorker");
        this.f325728a = aiVar;
        this.f325729b = aeVar;
        this.f325730c = settableFuture;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo76757c(Object obj) {
        String str;
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            C59071e eVar = C117350ai.f325731a;
            C58976aa aaVar = C58975e.f156826a;
            C92035ae aeVar = this.f325729b;
            int i = aeVar.f256572a;
            boolean z = aeVar.f256573b;
            String str2 = aeVar.f256574c;
            String str3 = aeVar.f256575d;
            aeVar.f256576e = ((BitmapDrawable) drawable).getBitmap();
            if (this.f325728a.f325757g.f232790a.mo79722a().getBoolean("weather_widget_enabled", false)) {
                C117350ai aiVar = this.f325728a;
                C92035ae aeVar2 = this.f325729b;
                Intent b = aiVar.f325759i.mo86768b();
                RemoteViews remoteViews = new RemoteViews(aiVar.f325755c.getPackageName(), R.layout.weather_widget);
                if (aeVar2.f256573b) {
                    str = aiVar.f325755c.getString(R.string.temp_unit_celsius);
                } else {
                    str = aiVar.f325755c.getString(R.string.temp_unit_fahrenheit);
                }
                int i2 = aeVar2.f256572a;
                remoteViews.setTextViewText(R.id.weather_widget_temperature, i2 + str);
                remoteViews.setImageViewBitmap(R.id.weather_widget_icon, aeVar2.f256576e);
                if (!TextUtils.isEmpty(aeVar2.f256575d)) {
                    remoteViews.setContentDescription(R.id.weather_widget_icon, aeVar2.f256575d);
                } else {
                    remoteViews.setContentDescription(R.id.weather_widget_icon, (CharSequence) null);
                }
                Intent intent = new Intent();
                intent.setClassName(aiVar.f325755c, "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver");
                intent.setAction("com.google.android.apps.gsa.weatherwidget.WEATHER_CLICK");
                intent.putExtra("com.google.android.apps.gsa.weatherwidget.extra.WEATHER_ACTIVITY", b);
                remoteViews.setOnClickPendingIntent(R.id.weather_launcher_widget_container, PendingIntent.getBroadcast(aiVar.f325755c, 0, intent, 201326592));
                String bestDateTimePattern = DateFormat.getBestDateTimePattern(aiVar.f325755c.getResources().getConfiguration().getLocales().get(0), "EEEEMMMMd");
                remoteViews.setCharSequence(R.id.weather_widget_time, "setFormat24Hour", bestDateTimePattern);
                remoteViews.setCharSequence(R.id.weather_widget_time, "setFormat12Hour", bestDateTimePattern);
                RemoteViews remoteViews2 = new RemoteViews(remoteViews, remoteViews);
                Intent intent2 = new Intent();
                intent2.setPackage(aiVar.f325757g.f232790a.mo79722a().getString("weather_widget_target_package_name", "com.google.android.apps.nexuslauncher"));
                intent2.setAction("com.google.android.apps.nexuslauncher.updateweather");
                intent2.putExtra("com.google.android.apps.nexuslauncher.weather_view", remoteViews2);
                intent2.addFlags(268435456);
                aiVar.f325755c.sendBroadcast(intent2);
            }
            this.f325730c.mo57356n(C118826c.f331422a);
            return;
        }
        this.f325730c.mo57356n(C118826c.f331422a);
    }
}
