package com.google.android.apps.search.googleapp.searchwidget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.provider.Settings;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.search.logging.p3034a.C38745ah;
import com.google.android.libraries.search.logging.p3034a.C38750am;
import com.google.apps.tiktok.p3663j.C47352j;
import com.google.common.p4552o.C60459qv;
import com.google.common.p4552o.C60460qw;
import com.google.common.p4552o.C60462qy;
import com.google.common.p4552o.C60509sn;
import com.google.common.p4552o.C60511sp;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.f */
/* compiled from: PG */
public final class C139028f implements C47352j {

    /* renamed from: a */
    private final C139033k f378093a;

    /* renamed from: b */
    private final Context f378094b;

    /* renamed from: c */
    private final C139135z f378095c;

    /* renamed from: d */
    private final C139032j f378096d;

    public C139028f(C139033k kVar, Context context, C139135z zVar, C139032j jVar) {
        this.f378093a = kVar;
        this.f378094b = context;
        this.f378095c = zVar;
        this.f378096d = jVar;
    }

    /* renamed from: b */
    public final C60870cx mo19293b() {
        int[] p = this.f378095c.mo114766p();
        int length = p.length;
        boolean z = length > 0;
        if (z) {
            C139033k kVar = this.f378093a;
            Context context = this.f378094b;
            kVar.onUpdate(context, AppWidgetManager.getInstance(context), p);
        }
        this.f378095c.mo114761j(z);
        C139032j jVar = this.f378096d;
        C38750am amVar = jVar.f378111b;
        PackageManager packageManager = jVar.f378110a.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
        String str = null;
        if (!(resolveActivity == null || resolveActivity.activityInfo == null)) {
            str = resolveActivity.activityInfo.packageName;
        }
        C60459qv qvVar = (C60459qv) C60460qw.f163615i.createBuilder();
        C60462qy qyVar = C60462qy.WIDGET_STATE;
        qvVar.copyOnWrite();
        C60460qw qwVar = (C60460qw) qvVar.instance;
        qwVar.f163619c = qyVar.f163634h;
        qwVar.f163617a |= 2;
        qvVar.copyOnWrite();
        C60460qw qwVar2 = (C60460qw) qvVar.instance;
        qwVar2.f163617a |= 128;
        qwVar2.f163624h = length;
        if (str != null) {
            qvVar.copyOnWrite();
            C60460qw qwVar3 = (C60460qw) qvVar.instance;
            qwVar3.f163617a |= 4;
            qwVar3.f163620d = str;
        }
        C59743a aVar = C59743a.APP_WIDGET_LIFE_CYCLE_EVENT;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 462;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        C60460qw qwVar4 = (C60460qw) qvVar.build();
        qwVar4.getClass();
        ufVar2.f164139at = qwVar4;
        ufVar2.f164249d |= C89885b.S3REQUEST_VALUE;
        ((C38745ah) amVar).mo41602n(aVar, tzVar);
        if (this.f378095c.mo114763l()) {
            C139032j jVar2 = this.f378096d;
            String string = Settings.Secure.getString(jVar2.f378114e.f378400b.getContentResolver(), "selected_search_engine_aga");
            if (string == null) {
                string = "com.google.android.googlequicksearchbox";
            }
            C38750am amVar2 = jVar2.f378112c;
            C59743a aVar2 = C59743a.DEFAULT_SEARCH_PROVIDER_EVENT;
            C60548tz tzVar2 = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar2.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar2.instance;
            ufVar3.f164093a |= 2;
            ufVar3.f164258m = 1448;
            C60509sn snVar = (C60509sn) C60511sp.f163810d.createBuilder();
            snVar.copyOnWrite();
            C60511sp spVar = (C60511sp) snVar.instance;
            spVar.f163813b = 2;
            spVar.f163812a = 1 | spVar.f163812a;
            snVar.copyOnWrite();
            C60511sp spVar2 = (C60511sp) snVar.instance;
            spVar2.f163812a |= 2;
            spVar2.f163814c = string;
            tzVar2.copyOnWrite();
            C60555uf ufVar4 = (C60555uf) tzVar2.instance;
            C60511sp spVar3 = (C60511sp) snVar.build();
            spVar3.getClass();
            ufVar4.f164202cC = spVar3;
            ufVar4.f164255j |= 4194304;
            ((C38745ah) amVar2).mo41602n(aVar2, tzVar2);
        }
        return C60866ct.f164955a;
    }
}
