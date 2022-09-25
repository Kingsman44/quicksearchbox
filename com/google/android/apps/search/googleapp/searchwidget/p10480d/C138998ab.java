package com.google.android.apps.search.googleapp.searchwidget.p10480d;

import android.content.res.Resources;
import android.util.SizeF;
import android.widget.RemoteViews;
import androidx.p060c.C0977g;
import com.google.android.googlequicksearchbox.R;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.d.ab */
/* compiled from: PG */
public final /* synthetic */ class C138998ab implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C139001ae f378004a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f378005b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f378006c;

    public /* synthetic */ C138998ab(C139001ae aeVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f378004a = aeVar;
        this.f378005b = cxVar;
        this.f378006c = cxVar2;
    }

    public final Object call() {
        C139001ae aeVar = this.f378004a;
        C60870cx cxVar = this.f378005b;
        C60870cx cxVar2 = this.f378006c;
        Resources resources = aeVar.f378016b.getResources();
        float integer = (float) resources.getInteger(R.integer.googleapp_min_widget_height_dp);
        SizeF sizeF = new SizeF((float) resources.getInteger(R.integer.googleapp_min_widget_width_zero_right_icons_dp), integer);
        SizeF sizeF2 = new SizeF((float) resources.getInteger(R.integer.googleapp_min_widget_width_one_right_icon_dp), integer);
        Optional optional = (Optional) C60856cj.m92909r(cxVar);
        Optional optional2 = (Optional) C60856cj.m92909r(cxVar2);
        C0977g gVar = new C0977g();
        if (optional.isPresent()) {
            gVar.put(sizeF, (RemoteViews) optional.get());
        }
        if (optional2.isPresent()) {
            gVar.put(sizeF2, (RemoteViews) optional2.get());
        }
        if (gVar.isEmpty()) {
            return Optional.empty();
        }
        return Optional.m71637of(new RemoteViews(gVar));
    }
}
