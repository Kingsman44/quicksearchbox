package com.google.android.libraries.componentview.components.elements.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import com.google.android.libraries.componentview.components.elements.C20442e;
import com.google.android.libraries.componentview.components.elements.C20443f;
import com.google.android.libraries.componentview.components.elements.C20444g;
import com.google.android.libraries.componentview.components.elements.C20446i;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20614e;
import com.google.p4271bq.C56429h;
import java.util.Map;

/* compiled from: PG */
public class CarouselView extends HorizontalScrollView {

    /* renamed from: a */
    public C20601ca f57546a;

    /* renamed from: b */
    public C20444g f57547b;

    public CarouselView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C20444g gVar = this.f57547b;
        if (gVar != null && i != i3) {
            try {
                C20446i iVar = gVar.f57482c;
                iVar.f57498v = i;
                if (gVar.f57480a && !iVar.f57496m && Math.abs(i - iVar.f57495l) > ((int) (C20482m.m38433a(gVar.f57482c.f56304o) * 50.0f))) {
                    C20446i iVar2 = gVar.f57482c;
                    iVar2.f57496m = true;
                    C20601ca caVar = iVar2.f57490g;
                    C56429h hVar = gVar.f57481b;
                    caVar.mo25489d(hVar.f150556h, (String) null, hVar.f150557i, (Map) null);
                }
                C20446i iVar3 = gVar.f57482c;
                iVar3.f57489c.execute(new C20442e(gVar, iVar3.f57490g, C19742a.VISIBILITY_LOGGING_ERROR, i));
                C20446i iVar4 = gVar.f57482c;
                if (!iVar4.f57497u) {
                    iVar4.f57489c.execute(new C20443f(gVar, iVar4.f57490g, C19742a.IMAGE_LOADING_ERROR));
                    gVar.f57482c.f57497u = true;
                }
                gVar.f57482c.mo25394D(i);
            } catch (Exception e) {
                C20601ca caVar2 = this.f57546a;
                if (caVar2 != null) {
                    C20614e eVar = new C20614e();
                    eVar.mo25535e(C19742a.ON_SCROLL_CHANGE_EXCEPTION);
                    eVar.f57821a = e;
                    caVar2.mo25487b(eVar.mo25531a());
                }
            }
        }
    }

    public CarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
    }
}
