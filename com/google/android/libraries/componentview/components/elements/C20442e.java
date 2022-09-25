package com.google.android.libraries.componentview.components.elements;

import android.graphics.Point;
import android.view.Display;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.componentview.components.elements.views.CarouselView;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1699f.C20519g;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.common.p4522b.C58485gu;
import com.google.p4271bq.C56429h;

/* renamed from: com.google.android.libraries.componentview.components.elements.e */
/* compiled from: PG */
public final class C20442e extends C20519g {

    /* renamed from: a */
    final /* synthetic */ int f57477a;

    /* renamed from: b */
    final /* synthetic */ C20444g f57478b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20442e(C20444g gVar, C20601ca caVar, C19742a aVar, int i) {
        super(caVar, aVar);
        this.f57478b = gVar;
        this.f57477a = i;
    }

    /* renamed from: a */
    public final void mo25126a() {
        C20446i iVar = this.f57478b.f57482c;
        int i = this.f57477a;
        CarouselView carouselView = iVar.f57494k;
        int width = iVar.f57491h.getWidth() / iVar.f57491h.getChildCount();
        Display display = carouselView.getDisplay();
        Point point = new Point();
        if (display != null) {
            display.getSize(point);
            int i2 = point.x;
            int min = Math.min((i + i2) / width, iVar.f57491h.getChildCount());
            C58485gu j = C58485gu.m89842j(iVar.f56324d);
            C56429h H = iVar.mo25419H();
            String str = H != null ? H.f150556h : BuildConfig.FLAVOR;
            for (int i3 = i / width; i3 < min; i3++) {
                C20470a aVar = (C20470a) j.get(i3);
                if (aVar instanceof C20466w) {
                    iVar.mo25395m((C20466w) aVar, str);
                } else {
                    C58485gu K = aVar.mo25422K(C20466w.class);
                    int size = K.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        iVar.mo25395m((C20466w) K.get(i4), str);
                    }
                }
            }
        }
    }
}
