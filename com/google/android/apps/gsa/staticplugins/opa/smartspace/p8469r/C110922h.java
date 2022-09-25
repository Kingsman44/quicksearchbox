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

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.r.h */
/* compiled from: PG */
public final /* synthetic */ class C110922h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C110925k f308987a;

    /* renamed from: b */
    public final /* synthetic */ RemoteViews f308988b;

    /* renamed from: c */
    public final /* synthetic */ C92113i f308989c;

    public /* synthetic */ C110922h(C110925k kVar, RemoteViews remoteViews, C92113i iVar) {
        this.f308987a = kVar;
        this.f308988b = remoteViews;
        this.f308989c = iVar;
    }

    public final C60870cx apply(Object obj) {
        C110925k kVar = this.f308987a;
        RemoteViews remoteViews = this.f308988b;
        C92113i iVar = this.f308989c;
        C118826c cVar = (C118826c) obj;
        C58833ax a = kVar.mo98933a();
        if (!a.mo56113h()) {
            ((C58970a) ((C58970a) kVar.f309001c.mo56224b()).mo56372aa(26887)).mo56386p("height could not be determined");
        } else if (((float) ((Integer) a.mo56107c()).intValue()) < 94.0f) {
            ((C58970a) ((C58970a) kVar.f309001c.mo56224b()).mo56372aa(26886)).mo56386p("resizeDoubleLineForWidget Widget height is small. Readjusting");
            Resources resources = kVar.f309003e.getResources();
            RemoteViews remoteViews2 = remoteViews;
            remoteViews2.setViewPadding(R.id.top_line, 0, 0, 0, resources.getDimensionPixelSize(R.dimen.sm_contextual_title_bottom_margin));
            remoteViews2.setViewPadding(R.id.context_chip_container, resources.getDimensionPixelSize(R.dimen.cw_chip_margin), resources.getDimensionPixelSize(R.dimen.sm_cw_chip_margin_top_bottom), resources.getDimensionPixelSize(R.dimen.cw_chip_margin), resources.getDimensionPixelSize(R.dimen.sm_cw_chip_margin_top_bottom));
            remoteViews2.setViewPadding(R.id.situational_chip_container, resources.getDimensionPixelSize(R.dimen.cw_chip_margin), resources.getDimensionPixelSize(R.dimen.sm_cw_chip_margin_top_bottom), resources.getDimensionPixelSize(R.dimen.cw_chip_margin), resources.getDimensionPixelSize(R.dimen.sm_cw_chip_margin_top_bottom));
            remoteViews2.setViewPadding(R.id.feedback_chip_container, resources.getDimensionPixelSize(R.dimen.cw_chip_margin), resources.getDimensionPixelSize(R.dimen.sm_cw_chip_margin_top_bottom), resources.getDimensionPixelSize(R.dimen.cw_chip_margin), resources.getDimensionPixelSize(R.dimen.sm_cw_chip_margin_top_bottom));
        }
        kVar.mo98937e(remoteViews, a);
        if (a.mo56113h()) {
            kVar.f309002d.mo77192a(C118569b.SMARTSPACE_WIDGET_SIZE_DIP, (long) ((Integer) a.mo56107c()).intValue());
            ((C58970a) ((C58970a) kVar.f309001c.mo56224b()).mo56372aa(26875)).mo56389s("Widget height with card %d", a.mo56107c());
        } else {
            ((C58970a) ((C58970a) kVar.f309001c.mo56224b()).mo56372aa(26874)).mo56386p("could not determine the height for widget with card");
        }
        return kVar.mo98935c(iVar, remoteViews, R.id.subtitle_weather_content, R.id.subtitle_weather_icon, R.id.subtitle_weather_text);
    }
}
