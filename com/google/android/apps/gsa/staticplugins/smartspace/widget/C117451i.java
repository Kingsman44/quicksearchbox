package com.google.android.apps.gsa.staticplugins.smartspace.widget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6690db.C85287a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.widget.i */
/* compiled from: PG */
public final class C117451i extends C86734a implements C85287a {

    /* renamed from: a */
    private final C117448f f326006a;

    /* renamed from: b */
    private final Context f326007b;

    /* renamed from: c */
    private final C86124t f326008c;

    /* renamed from: f */
    private final C117450h f326009f;

    public C117451i(C117448f fVar, Context context, C86124t tVar, C117450h hVar) {
        super(C118575h.WORKER_SMARTSPACE_WIDGET, "smartspacewidget");
        this.f326006a = fVar;
        this.f326007b = context;
        this.f326008c = tVar;
        this.f326009f = hVar;
    }

    /* renamed from: a */
    public final C60870cx mo78847a(Intent intent) {
        C117448f fVar = this.f326006a;
        C58976aa aaVar = C58975e.f156826a;
        String action = intent.getAction();
        if ("android.appwidget.action.APPWIDGET_UPDATE".equals(action) || ("android.appwidget.action.APPWIDGET_UPDATE_OPTIONS".equals(action) && fVar.f325992e.mo79746e(C90017bw.f247861C))) {
            if (fVar.f325991d.getLong("smartspace_widget_last_daily_update", -1) + C117448f.f325988a < fVar.f325993f.mo26870b()) {
                C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar.copyOnWrite();
                C60555uf ufVar = (C60555uf) tzVar.instance;
                ufVar.f164093a |= 2;
                ufVar.f164258m = 1306;
                C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                C86337q b = fVar.f325991d.mo80076b();
                b.mo80072g("smartspace_widget_last_daily_update", fVar.f325993f.mo26870b());
                b.apply();
            }
            return fVar.f325990c.mo78854g("smartspace_widget_listener", true);
        } else if ("android.appwidget.action.APPWIDGET_ENABLED".equals(action)) {
            if (!fVar.f325991d.getBoolean("smartspace_widget_present", false)) {
                C60548tz tzVar2 = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar2.copyOnWrite();
                C60555uf ufVar2 = (C60555uf) tzVar2.instance;
                ufVar2.f164093a |= 2;
                ufVar2.f164258m = 1207;
                C89949q.m146525j((C60555uf) tzVar2.build(), (C60321oe) null, (C63196b) null, (String) null);
                C86337q b2 = fVar.f325991d.mo80076b();
                b2.mo80067b("smartspace_widget_present", true);
                b2.apply();
                fVar.f325994g.mo77148d();
            }
            if (fVar.f325992e.mo79746e(C90017bw.f247897aL)) {
                Intent intent2 = new Intent("com.google.android.googlequicksearchbox.AA_ACTION_REFRESH");
                intent2.setPackage(fVar.f325989b.getPackageName());
                fVar.f325989b.sendBroadcast(intent2);
            }
            return C118826c.f331423b;
        } else if (!"android.appwidget.action.APPWIDGET_DISABLED".equals(action)) {
            return C118826c.f331423b;
        } else {
            if (fVar.f325991d.getBoolean("smartspace_widget_present", false)) {
                C60548tz tzVar3 = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar3.copyOnWrite();
                C60555uf ufVar3 = (C60555uf) tzVar3.instance;
                ufVar3.f164093a |= 2;
                ufVar3.f164258m = 1208;
                C89949q.m146525j((C60555uf) tzVar3.build(), (C60321oe) null, (C63196b) null, (String) null);
            }
            C86337q b3 = fVar.f325991d.mo80076b();
            b3.mo80067b("smartspace_widget_present", false);
            b3.apply();
            if (fVar.f325992e.mo79746e(C90017bw.f247897aL)) {
                Intent intent3 = new Intent("com.google.android.googlequicksearchbox.AA_ACTION_REFRESH");
                intent3.setPackage(fVar.f325989b.getPackageName());
                fVar.f325989b.sendBroadcast(intent3);
            }
            return fVar.f325990c.mo78854g("smartspace_widget_listener", false);
        }
    }

    /* renamed from: b */
    public final C60870cx mo78848b() {
        int length = AppWidgetManager.getInstance(this.f326007b).getAppWidgetIds(SmartspaceWidgetProvider.f325979f).length;
        boolean e = this.f326008c.mo79746e(C89985ax.f246675aB);
        if (length <= 0) {
            this.f326007b.getPackageManager().setComponentEnabledSetting(SmartspaceWidgetProvider.f325979f, true != e ? 2 : 1, 1);
        } else if (!e) {
            this.f326009f.mo103307h();
        }
        return C118826c.f331423b;
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
