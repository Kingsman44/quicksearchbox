package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import android.content.Context;
import android.widget.RemoteViews;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p10908a.p10911c.p10914c.C146644b;
import p5462h.p5473f.p5474a.C69626l;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ab */
/* compiled from: PG */
public final /* synthetic */ class C132583ab implements C69626l {

    /* renamed from: a */
    public final /* synthetic */ Context f361813a;

    /* renamed from: b */
    public final /* synthetic */ C132589ah f361814b;

    /* renamed from: c */
    public final /* synthetic */ int f361815c;

    /* renamed from: d */
    public final /* synthetic */ int f361816d;

    /* renamed from: e */
    public final /* synthetic */ C132586ae f361817e;

    /* renamed from: f */
    public final /* synthetic */ int f361818f;

    public /* synthetic */ C132583ab(Context context, C132589ah ahVar, int i, int i2, int i3, C132586ae aeVar) {
        this.f361813a = context;
        this.f361814b = ahVar;
        this.f361818f = i;
        this.f361815c = i2;
        this.f361816d = i3;
        this.f361817e = aeVar;
    }

    /* renamed from: a */
    public final Object mo5761a(Object obj) {
        boolean z;
        int i;
        Context context = this.f361813a;
        C132589ah ahVar = this.f361814b;
        int i2 = this.f361818f;
        int i3 = this.f361815c;
        int i4 = this.f361816d;
        C132586ae aeVar = this.f361817e;
        C146644b bVar = (C146644b) obj;
        C132588ag b = C132590ai.m215558b(bVar, context, ahVar.f361851a);
        if (i2 == 2) {
            z = C132590ai.m215563g(context, bVar);
        } else {
            z = b == C132588ag.MINI;
        }
        String packageName = context.getPackageName();
        if (i2 == 2) {
            i = true != C132590ai.m215563g(context, bVar) ? R.layout.assistant_weather_freeform_widget : R.layout.assistant_weather_freeform_widget_mini;
        } else {
            i = b.f361850i;
        }
        RemoteViews remoteViews = new RemoteViews(packageName, i);
        C132590ai.m215561e(remoteViews, 8);
        if (i2 == 2 && !z) {
            float min = (float) Math.min(Math.min(bVar.f396087a, bVar.f396088b), i3);
            remoteViews.setViewLayoutWidth(16908288, min, 0);
            remoteViews.setViewLayoutHeight(16908288, min, 0);
            remoteViews.setViewLayoutWidth(R.id.assistant_weather_widget_background, min, 0);
            remoteViews.setViewLayoutHeight(R.id.assistant_weather_widget_background, min, 0);
        } else if (i2 == 1) {
            int min2 = Math.min(bVar.f396087a, context.getResources().getDimensionPixelSize(b.f361846e));
            int min3 = Math.min(bVar.f396088b, context.getResources().getDimensionPixelSize(b.f361847f));
            remoteViews.setViewLayoutWidth(16908288, (float) min2, 0);
            remoteViews.setViewLayoutHeight(16908288, (float) min3, 0);
        }
        C132590ai.m215562f(context, remoteViews, i4, z, aeVar);
        return remoteViews;
    }
}
