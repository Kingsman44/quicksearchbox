package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e;

import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.widget.RemoteViews;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.C16782d;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16753c;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16754d;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16769s;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1320d.C16786d;
import com.google.assistant.p3897e.p3921j.C51805du;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.ai */
/* compiled from: PG */
public final class C16800ai extends AppWidgetHostView {

    /* renamed from: a */
    C16797af f49190a;

    public C16800ai(Context context) {
        super(context);
    }

    public final void updateAppWidget(RemoteViews remoteViews) {
        super.updateAppWidget(remoteViews);
        C16797af afVar = this.f49190a;
        if (afVar != null) {
            AppWidgetManager.getInstance(getContext());
            getAppWidgetId();
            C16801aj ajVar = afVar.f49186a;
            C16754d dVar = afVar.f49187b;
            C12991i iVar = afVar.f49188c;
            String string = ajVar.f49201k.getString("appActionsSpeechResponse");
            if (string == null) {
                C16753c cVar = dVar.f49027c;
                if (cVar == null) {
                    cVar = C16753c.f49018d;
                }
                String str = cVar.f49021b;
                PackageManager packageManager = ajVar.f49192b.getContext().getPackageManager();
                try {
                    string = "Here it is from ".concat(String.valueOf(String.valueOf(packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)))));
                } catch (PackageManager.NameNotFoundException unused) {
                    string = "Here it is";
                }
            }
            C51805du b = C16786d.m33819b(string, ajVar.f49201k.getString("appActionsSpeechLanguage", "en-US"), C16786d.f49121a);
            C16782d dVar2 = ajVar.f49193c;
            C16769s sVar = (C16769s) C16770t.f49073f.createBuilder();
            sVar.copyOnWrite();
            C16770t tVar = (C16770t) sVar.instance;
            b.getClass();
            tVar.f49077c = b;
            tVar.f49076b = 2;
            sVar.copyOnWrite();
            C16770t tVar2 = (C16770t) sVar.instance;
            iVar.getClass();
            tVar2.f49078d = iVar;
            tVar2.f49075a |= 32;
            dVar2.mo20958g((C16770t) sVar.build());
            this.f49190a = null;
        }
    }
}
