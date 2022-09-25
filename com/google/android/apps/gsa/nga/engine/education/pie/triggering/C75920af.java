package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import android.graphics.BitmapFactory;
import androidx.core.app.C1831r;
import androidx.core.app.C1837x;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.nga.engine.education.pie.triggering.notificationreceiver.PieNotificationReceiver;
import com.google.android.apps.gsa.nga.shared.android.p6325a.C80943d;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81374h;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58471gg;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.af */
/* compiled from: PG */
public final /* synthetic */ class C75920af implements C80943d {

    /* renamed from: a */
    public final /* synthetic */ C75924aj f210644a;

    /* renamed from: b */
    public final /* synthetic */ Locale f210645b;

    /* renamed from: c */
    public final /* synthetic */ C81374h f210646c;

    public /* synthetic */ C75920af(C75924aj ajVar, Locale locale, C81374h hVar) {
        this.f210644a = ajVar;
        this.f210645b = locale;
        this.f210646c = hVar;
    }

    /* renamed from: a */
    public final void mo71377a(C1839z zVar) {
        C75924aj ajVar = this.f210644a;
        Locale locale = this.f210645b;
        C81374h hVar = this.f210646c;
        zVar.f5670A = ajVar.f210653a.getColor(R.color.nga_pie_notification_highlight);
        zVar.mo5015d(8, true);
        zVar.mo5015d(2, false);
        zVar.f5688h = BitmapFactory.decodeResource(ajVar.f210653a.getResources(), R.drawable.product_logo_assistant_color_48);
        zVar.f5694n = C1839z.m5037c(ajVar.f210654b.mo75121a(locale).getString(R.string.nga_pie_notification_subtext, new Object[0]));
        C81515c cVar = ajVar.f210654b;
        zVar.f5685e = C1839z.m5037c(cVar.mo75121a(locale).getString(hVar.mo75028b(), hVar.mo75031e().toArray(C58471gg.f156097c)));
        C81515c cVar2 = ajVar.f210654b;
        zVar.f5686f = C1839z.m5037c(cVar2.mo75121a(locale).getString(hVar.mo75027a(), hVar.mo75030d().toArray(C58471gg.f156097c)));
        zVar.f5687g = PieNotificationReceiver.m122507a(ajVar.f210653a, "com.google.android.apps.gsa.nga.engine.education.pie.triggering.notificationreceiver.PIE_NOTIFICATION_TAPPED", hVar.mo75029c());
        zVar.mo5017f(new C1831r(0, ajVar.f210654b.mo75121a(locale).getString(R.string.nga_pie_notification_begin_button_text_2, new Object[0]), PieNotificationReceiver.m122507a(ajVar.f210653a, "com.google.android.apps.gsa.nga.engine.education.pie.triggering.notificationreceiver.PIE_NOTIFICATION_BUTTON", hVar.mo75029c())).mo5008a());
        zVar.f5679J.deleteIntent = PieNotificationReceiver.m122507a(ajVar.f210653a, "com.google.android.apps.gsa.nga.engine.education.pie.triggering.notificationreceiver.PIE_NOTIFICATION_DISMISSED", hVar.mo75029c());
        zVar.mo5022k(new C1837x());
    }
}
