package com.google.android.libraries.p10908a.p10911c.p10914c;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.SizeF;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5477g.C69678a;

/* renamed from: com.google.android.libraries.a.c.c.c */
/* compiled from: PG */
public final class C146645c {
    /* renamed from: a */
    public static final RemoteViews m238881a(Context context, AppWidgetManager appWidgetManager, int i, C69626l lVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(appWidgetManager, "appWidgetManager");
        C69664n.m101061g(lVar, "buildRemoteViews");
        Resources resources = context.getResources();
        Bundle appWidgetOptions = appWidgetManager.getAppWidgetOptions(i);
        C69664n.m101060f(appWidgetOptions, "appWidgetManager.getAppWidgetOptions(widgetId)");
        ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 31 ? appWidgetOptions.getParcelableArrayList("appWidgetSizes") : null;
        if (Build.VERSION.SDK_INT < 31 || parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            C69664n.m101060f(resources, "resources");
            return new RemoteViews((RemoteViews) lVar.mo5761a(m238882b(appWidgetOptions, false)), (RemoteViews) lVar.mo5761a(m238882b(appWidgetOptions, true)));
        }
        int b = C69505av.m100860b(C69540x.m100804k(parcelableArrayList, 10));
        if (b < 16) {
            b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b);
        for (Object next : parcelableArrayList) {
            SizeF sizeF = (SizeF) next;
            float width = sizeF.getWidth();
            float height = sizeF.getHeight();
            Log.i("AppWidgetLayoutHelper", "Creating layout for the following size(dp) width:" + width + " and height:" + height);
            C69664n.m101060f(sizeF, "requestedSizeDp");
            linkedHashMap.put(next, (RemoteViews) lVar.mo5761a(C146643a.m238880a(C69678a.m101088a(sizeF.getWidth()), C69678a.m101088a(sizeF.getHeight()))));
        }
        return new RemoteViews(linkedHashMap);
    }

    /* renamed from: b */
    private static final C146644b m238882b(Bundle bundle, boolean z) {
        C69685i iVar = z ? new C69685i("appWidgetMinWidth", "appWidgetMaxHeight") : new C69685i("appWidgetMaxWidth", "appWidgetMinHeight");
        int i = bundle.getInt((String) iVar.f186052a);
        int i2 = bundle.getInt((String) iVar.f186053b);
        String str = true != z ? "landscape" : "portrait";
        Log.i("AppWidgetLayoutHelper", "Creating " + str + " for the following size(dp) width:" + i + " and height:" + i2);
        return C146643a.m238880a(i, i2);
    }
}
