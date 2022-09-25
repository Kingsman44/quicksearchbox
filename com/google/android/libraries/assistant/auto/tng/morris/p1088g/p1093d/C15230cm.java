package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.widget.RemoteViews;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16753c;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16754d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.cm */
/* compiled from: PG */
public final class C15230cm extends AppWidgetHostView {

    /* renamed from: a */
    public C15221cd f45697a;

    public C15230cm(Context context) {
        super(context);
    }

    public final void updateAppWidget(RemoteViews remoteViews) {
        super.updateAppWidget(remoteViews);
        C15221cd cdVar = this.f45697a;
        if (cdVar != null) {
            AppWidgetManager.getInstance(getContext());
            getAppWidgetId();
            C15231cn cnVar = cdVar.f45684a;
            C16754d dVar = cdVar.f45685b;
            String string = cnVar.f45708k.getString("appActionsSpeechResponse");
            C16753c cVar = dVar.f49027c;
            if (cVar == null) {
                cVar = C16753c.f49018d;
            }
            String str = cVar.f49021b;
            PackageManager packageManager = cnVar.f45710m.getPackageManager();
            ApplicationInfo applicationInfo = new ApplicationInfo();
            try {
                applicationInfo = packageManager.getApplicationInfo(str, 0);
            } catch (PackageManager.NameNotFoundException e) {
                C59104x d = C15231cn.f45698a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "Morris.OneShotWgtRndr");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(46024)).mo56389s("Could not find application label for widget provider package %s", str);
            }
            String obj = packageManager.getApplicationLabel(applicationInfo).toString();
            String string2 = cnVar.f45710m.getString(R.string.widget_default_text, new Object[]{obj});
            if (string != null) {
                string2 = cnVar.f45710m.getString(R.string.widget_provided_text, new Object[]{obj, string});
            }
            cnVar.mo22110d(cnVar.f45708k.getString("appActionsSpeechLanguage", "en-US"), string2);
            this.f45697a = null;
        }
    }
}
