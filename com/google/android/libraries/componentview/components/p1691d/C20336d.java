package com.google.android.libraries.componentview.components.p1691d;

import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.google.android.libraries.componentview.components.p1691d.p1692a.C20327b;
import com.google.android.libraries.componentview.components.p1691d.p1692a.C20329d;
import com.google.android.libraries.componentview.p1675a.p1677b.C19744c;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.p1649b.p1651b.C19618h;

/* renamed from: com.google.android.libraries.componentview.components.d.d */
/* compiled from: PG */
final class C20336d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ View f57149a;

    /* renamed from: b */
    final /* synthetic */ C20337e f57150b;

    public C20336d(C20337e eVar, View view) {
        this.f57150b = eVar;
        this.f57149a = view;
    }

    public final void onGlobalLayout() {
        this.f57149a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        C20337e eVar = this.f57150b;
        C20327b bVar = eVar.f57151a;
        if ((bVar.f57128a & 1) != 0) {
            C20329d dVar = bVar.f57129b;
            if (dVar == null) {
                dVar = C20329d.f57130d;
            }
            String str = null;
            if ((dVar.f57132a & 1) != 0) {
                float a = C20482m.m38433a(eVar.f57157g);
                int ceil = (int) Math.ceil((double) (((float) ((ImageView) eVar.f56305p).getWidth()) / a));
                int ceil2 = (int) Math.ceil((double) (((float) ((ImageView) eVar.f56305p).getHeight()) / a));
                int i = dVar.f57134c;
                if (i <= 0) {
                    i = (int) Math.floor((double) C20482m.m38433a(eVar.f57157g));
                }
                if (ceil > 0) {
                    i = Math.min(i, 2048 / ceil);
                }
                int max = Math.max(1, i);
                String str2 = dVar.f57133b;
                if (ceil > eVar.f57154d || ceil2 > eVar.f57155e || max != eVar.f57153c || !str2.equals(eVar.f57152b)) {
                    if (ceil <= 0 || ceil2 <= 0 || max <= 0) {
                        C20520h.m38497b(6, "RasterMapLayerComp", (Throwable) null, "Invalid width, height or scale, using base URL: " + ceil + " | " + ceil2 + " | " + max, new Object[0]);
                    } else {
                        Uri f = C20482m.m38438f(C20482m.m38438f(C20482m.m38438f(Uri.parse(str2), "w", Integer.toString(ceil)), C19618h.f54585a, Integer.toString(ceil2)), "scale", Integer.toString(max));
                        eVar.f57153c = max;
                        str = f.toString();
                    }
                    if (str == null) {
                        if (!str2.equals(eVar.f57152b)) {
                            str = str2;
                        } else {
                            eVar.f57158h.mo57356n(new C19744c());
                            return;
                        }
                    }
                    eVar.f57158h.mo57358p(eVar.f57156f.mo25455c(str, (ImageView) eVar.f56305p, false, false));
                    eVar.f57154d = ceil;
                    eVar.f57155e = ceil2;
                    eVar.f57152b = str2;
                    return;
                }
                return;
            }
            C20520h.m38497b(5, "RasterMapLayerComp", (Throwable) null, "Base URL on update is null.", new Object[0]);
            eVar.f57158h.mo57356n(new C19744c());
        }
    }
}
