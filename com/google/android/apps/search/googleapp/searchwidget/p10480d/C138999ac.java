package com.google.android.apps.search.googleapp.searchwidget.p10480d;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.d.ac */
/* compiled from: PG */
public final /* synthetic */ class C138999ac implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C139001ae f378007a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f378008b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f378009c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f378010d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f378011e;

    public /* synthetic */ C138999ac(C139001ae aeVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, Bundle bundle) {
        this.f378007a = aeVar;
        this.f378008b = cxVar;
        this.f378009c = cxVar2;
        this.f378010d = cxVar3;
        this.f378011e = bundle;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C139001ae aeVar = this.f378007a;
        C60870cx cxVar = this.f378008b;
        C60870cx cxVar2 = this.f378009c;
        C60870cx cxVar3 = this.f378010d;
        Bundle bundle = this.f378011e;
        C139006f fVar = (C139006f) C60856cj.m92909r(cxVar);
        C139010j jVar = (C139010j) C60856cj.m92909r(cxVar2);
        C139012l lVar = (C139012l) C60856cj.m92909r(cxVar3);
        if (fVar != null && !fVar.equals(C139006f.f378037e)) {
            int i = fVar.f378039a;
            if (!((i & 1) == 0 || (i & 2) == 0)) {
                C139008h hVar = fVar.f378041c;
                if (hVar == null) {
                    hVar = C139008h.f378043h;
                }
                if (!((hVar.f378045a & 32) == 0 || jVar.equals(C139010j.f378052d) || (jVar.f378054a & 2) == 0)) {
                    String packageName = aeVar.f378016b.getPackageName();
                    if (Build.VERSION.SDK_INT < 31) {
                        int i2 = bundle.getInt("appWidgetMinWidth");
                        Resources resources = aeVar.f378016b.getResources();
                        if (i2 < resources.getInteger(R.integer.googleapp_min_widget_width_zero_right_icons_dp)) {
                            return aeVar.mo114653b(packageName, fVar, jVar, lVar);
                        }
                        return i2 < resources.getInteger(R.integer.googleapp_min_widget_width_one_right_icon_dp) ? aeVar.mo114654c(packageName, fVar, jVar) : aeVar.mo114653b(packageName, fVar, jVar, lVar);
                    }
                    C60870cx c = aeVar.mo114654c(packageName, fVar, jVar);
                    C60870cx b = aeVar.mo114653b(packageName, fVar, jVar, lVar);
                    return C47638k.m84751b(c, b).mo51520a(new C138998ab(aeVar, c, b), aeVar.f378017c);
                }
            }
        }
        ((C59052c) ((C59052c) C139001ae.f378015a.mo56226d()).mo56372aa(41348)).mo56386p("Cannot build RemoteViews as third party provider data is missing.");
        return C60856cj.m92900i(Optional.empty());
    }
}
