package com.google.android.libraries.lens.view.p2178x;

import android.graphics.PointF;
import android.util.SizeF;
import com.google.android.libraries.lens.view.gleam.C26441a;
import com.google.android.libraries.lens.view.gleam.C26460as;
import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.x.m */
/* compiled from: PG */
public final /* synthetic */ class C28219m implements C28209c {

    /* renamed from: a */
    public static final /* synthetic */ C28219m f76830a = new C28219m();

    private /* synthetic */ C28219m() {
    }

    /* renamed from: a */
    public final void mo33723a(List list) {
        C58801sm G = ((C58485gu) list).listIterator(0);
        while (G.hasNext()) {
            C26460as asVar = (C26460as) G.next();
            C26441a aVar = asVar.f72062h;
            if (aVar != null) {
                C25349y a = C25349y.m46667a(aVar.f71963a.f68848i);
                if (a == null) {
                    a = C25349y.UNRECOGNIZED;
                }
                C25349y yVar = C25349y.PRE_GLEAM;
                C25349y a2 = C25349y.m46667a(aVar.f71963a.f68848i);
                if (a2 == null) {
                    a2 = C25349y.UNRECOGNIZED;
                }
                C25349y yVar2 = C25349y.THINKING_GLEAM;
                if (a == yVar || a2 == yVar2) {
                    SizeF sizeF = aVar.f71968f;
                    PointF pointF = aVar.f71965c;
                    PointF pointF2 = asVar.f72057c;
                    float width = (pointF2.x * sizeF.getWidth()) / 2.0f;
                    float height = (pointF2.y * sizeF.getHeight()) / 2.0f;
                    double a3 = (double) aVar.mo31651a();
                    double cos = Math.cos(a3);
                    double sin = Math.sin(a3);
                    float f = pointF.x;
                    double sin2 = Math.sin(a3);
                    double cos2 = Math.cos(a3);
                    float f2 = pointF.y;
                    C58801sm smVar = G;
                    PointF pointF3 = new PointF(((((((float) cos) * width) - (((float) sin) * height)) + f) - asVar.f72055a.x) * 0.07f, ((((((float) sin2) * width) + (((float) cos2) * height)) + f2) - asVar.f72055a.y) * 0.07f);
                    if (pointF3.length() > 20.0f) {
                        asVar.f72060f = true;
                    } else {
                        asVar.f72056b.offset(pointF3.x, pointF3.y);
                    }
                    G = smVar;
                }
            }
        }
    }
}
