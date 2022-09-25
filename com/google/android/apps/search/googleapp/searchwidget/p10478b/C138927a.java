package com.google.android.apps.search.googleapp.searchwidget.p10478b;

import android.widget.RemoteViews;
import com.google.android.apps.search.googleapp.searchwidget.C139031i;
import com.google.android.apps.search.googleapp.searchwidget.C139135z;
import com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139080be;
import com.google.android.googlequicksearchbox.R;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.b.a */
/* compiled from: PG */
public final /* synthetic */ class C138927a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C138928b f377862a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f377863b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f377864c;

    /* renamed from: d */
    public final /* synthetic */ RemoteViews f377865d;

    /* renamed from: e */
    public final /* synthetic */ boolean f377866e;

    public /* synthetic */ C138927a(C138928b bVar, C60870cx cxVar, C60870cx cxVar2, RemoteViews remoteViews, boolean z) {
        this.f377862a = bVar;
        this.f377863b = cxVar;
        this.f377864c = cxVar2;
        this.f377865d = remoteViews;
        this.f377866e = z;
    }

    public final Object call() {
        C138928b bVar = this.f377862a;
        C60870cx cxVar = this.f377863b;
        C60870cx cxVar2 = this.f377864c;
        RemoteViews remoteViews = this.f377865d;
        boolean z = this.f377866e;
        C139080be beVar = (C139080be) C60856cj.m92909r(cxVar);
        C139031i iVar = (C139031i) C60856cj.m92909r(cxVar2);
        Optional f = C139135z.m226020f(bVar.f377867a, beVar);
        if (f.isPresent()) {
            int intValue = ((Integer) f.get()).intValue();
            remoteViews.setInt(R.id.googleapp_search_widget_background, "setColorFilter", intValue);
            remoteViews.setInt(R.id.googleapp_search_widget_background_protection, "setColorFilter", intValue);
        } else {
            remoteViews.setInt(R.id.googleapp_search_widget_background, "setColorFilter", 0);
            remoteViews.setInt(R.id.googleapp_search_widget_background_protection, "setColorFilter", 0);
        }
        int i = true != C138928b.m225761b(beVar, z) ? R.id.googleapp_search_widget_google_logo : R.id.googleapp_search_widget_google_logo_full;
        Optional e = C139135z.m226019e(bVar.f377867a, beVar);
        if (e.isPresent()) {
            int intValue2 = ((Integer) e.get()).intValue();
            remoteViews.setInt(i, "setColorFilter", intValue2);
            remoteViews.setInt(R.id.googleapp_search_widget_voice_btn, "setColorFilter", intValue2);
            remoteViews.setInt(R.id.googleapp_search_widget_lens_btn, "setColorFilter", intValue2);
        } else {
            remoteViews.setInt(i, "setColorFilter", 0);
            remoteViews.setInt(R.id.googleapp_search_widget_voice_btn, "setColorFilter", 0);
            remoteViews.setInt(R.id.googleapp_search_widget_lens_btn, "setColorFilter", 0);
        }
        if (C138928b.m225761b(beVar, z)) {
            remoteViews.setViewVisibility(R.id.googleapp_search_widget_google_logo_full, 0);
            remoteViews.setViewVisibility(R.id.googleapp_search_widget_doodle, 8);
            remoteViews.setViewVisibility(R.id.googleapp_search_widget_google_logo, 8);
            remoteViews.setOnClickPendingIntent(R.id.googleapp_search_widget_google_logo_full, bVar.f377869c.mo114636a(bVar.f377867a));
        } else if (!bVar.f377868b.booleanValue() || (iVar.f378100a & 2) == 0) {
            remoteViews.setViewVisibility(R.id.googleapp_search_widget_google_logo_full, 8);
            remoteViews.setViewVisibility(R.id.googleapp_search_widget_doodle, 8);
            remoteViews.setViewVisibility(R.id.googleapp_search_widget_google_logo, 0);
        } else {
            remoteViews.setViewVisibility(R.id.googleapp_search_widget_google_logo_full, 8);
            remoteViews.setViewVisibility(R.id.googleapp_search_widget_doodle, 0);
            remoteViews.setViewVisibility(R.id.googleapp_search_widget_google_logo, 8);
        }
        remoteViews.setImageViewResource(R.id.googleapp_search_widget_background, C139135z.m226016b(beVar));
        remoteViews.setImageViewResource(R.id.googleapp_search_widget_background_protection, C139135z.m226015a(beVar));
        remoteViews.setInt(R.id.googleapp_search_widget_two_right_icons, "setBackgroundResource", C139135z.m226017c(beVar));
        int i2 = beVar.f378252c;
        remoteViews.setInt(R.id.googleapp_search_widget_background, "setImageAlpha", i2);
        remoteViews.setInt(R.id.googleapp_search_widget_background_protection, "setImageAlpha", i2);
        return remoteViews;
    }
}
