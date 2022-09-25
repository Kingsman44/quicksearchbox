package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8469r;

import android.content.res.Resources;
import android.widget.RemoteViews;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.r.g */
/* compiled from: PG */
public final /* synthetic */ class C110921g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C110925k f308984a;

    /* renamed from: b */
    public final /* synthetic */ RemoteViews f308985b;

    /* renamed from: c */
    public final /* synthetic */ C92113i f308986c;

    public /* synthetic */ C110921g(C110925k kVar, RemoteViews remoteViews, C92113i iVar) {
        this.f308984a = kVar;
        this.f308985b = remoteViews;
        this.f308986c = iVar;
    }

    public final C60870cx apply(Object obj) {
        C110925k kVar = this.f308984a;
        RemoteViews remoteViews = this.f308985b;
        C92113i iVar = this.f308986c;
        C118826c cVar = (C118826c) obj;
        C58833ax a = kVar.mo98933a();
        if (!a.mo56113h()) {
            ((C58970a) ((C58970a) kVar.f309001c.mo56224b()).mo56372aa(26889)).mo56386p("height could not be determined");
        } else if (((float) ((Integer) a.mo56107c()).intValue()) < 94.0f) {
            ((C58970a) ((C58970a) kVar.f309001c.mo56224b()).mo56372aa(26888)).mo56386p("resizeSingleLineForWidget Widget height is small. Readjusting");
            Resources resources = kVar.f309003e.getResources();
            remoteViews.setViewPadding(R.id.widget_title_layout, 0, resources.getDimensionPixelSize(R.dimen.sm_cw_title_line_margin), 0, resources.getDimensionPixelSize(R.dimen.sm_cw_title_line_margin));
        }
        kVar.mo98937e(remoteViews, a);
        if (a.mo56113h()) {
            ((C58970a) ((C58970a) kVar.f309001c.mo56224b()).mo56372aa(26873)).mo56389s("Widget height - date and weather %d", a.mo56107c());
            kVar.f309002d.mo77192a(C118569b.SMARTSPACE_WIDGET_SIZE_DIP, (long) ((Integer) a.mo56107c()).intValue());
        } else {
            ((C58970a) ((C58970a) kVar.f309001c.mo56224b()).mo56372aa(26872)).mo56386p("could not determine the widget height - date and weather");
        }
        return kVar.mo98935c(iVar, remoteViews, R.id.title_weather_content, R.id.title_weather_icon, R.id.title_weather_text);
    }
}
