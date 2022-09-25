package com.google.android.apps.gsa.staticplugins.opa.widget.impl;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* compiled from: PG */
public class OpaWidgetProvider extends C114248a {
    public final void onReceive(Context context, Intent intent) {
        C74507e.m120467c(34);
        super.onReceive(context, intent);
    }

    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        for (int updateAppWidget : iArr) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.opa_entrypointwidget);
            C87565h hVar = new C87565h();
            hVar.f236560f = 2;
            hVar.f236523a = "and.opa.widget.mic";
            hVar.f236556b = e.x;
            hVar.f236512P = 335544320;
            hVar.f236558d = 1;
            Bundle a = hVar.mo81685a();
            Intent intent = new Intent();
            intent.setClassName(context, "com.google.android.apps.gsa.staticplugins.opa.EnterOpaActivityFromMicWidget");
            intent.addFlags(268468224);
            intent.putExtras(a);
            remoteViews.setOnClickPendingIntent(R.id.opa_icon, PendingIntent.getActivity(context, 0, intent, 201326592));
            appWidgetManager.updateAppWidget(updateAppWidget, remoteViews);
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 1509;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
    }
}
