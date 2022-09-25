package com.google.android.libraries.lens.view.p2070an.p2072b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.p2113h.p2120c.C26724a;
import com.google.android.libraries.lens.view.p2113h.p2120c.C26725b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.an.b.o */
/* compiled from: PG */
public final class C25417o {

    /* renamed from: g */
    private static final C59071e f69264g = C59071e.m91332i("com.google.android.libraries.lens.view.an.b.o");

    /* renamed from: a */
    public final C26244b f69265a;

    /* renamed from: b */
    public final C25408f f69266b;

    /* renamed from: c */
    public final Context f69267c;

    /* renamed from: d */
    public final C26724a f69268d;

    /* renamed from: e */
    public final C26725b f69269e;

    /* renamed from: f */
    public final C21370a f69270f;

    /* renamed from: h */
    private final C60887da f69271h;

    /* renamed from: i */
    private final Executor f69272i;

    public C25417o(Context context, C26244b bVar, C25408f fVar, C26724a aVar, C60887da daVar, Executor executor, C26725b bVar2, C21370a aVar2) {
        this.f69267c = context;
        this.f69265a = bVar;
        this.f69266b = fVar;
        this.f69268d = aVar;
        this.f69271h = daVar;
        this.f69272i = executor;
        this.f69269e = bVar2;
        this.f69270f = aVar2;
    }

    /* renamed from: b */
    public static final Rect m46835b(Size size, RectF rectF) {
        Size size2 = new Size(m46836c(size.getWidth(), rectF.left, rectF.width(), false), m46836c(size.getHeight(), rectF.top, rectF.height(), true));
        if (size2.equals(size)) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        int round = Math.round(((float) size.getWidth()) * rectF.left);
        int round2 = Math.round(((float) size.getHeight()) * rectF.top);
        return new Rect(round, round2, size2.getWidth() + round, size2.getHeight() + round2);
    }

    /* renamed from: c */
    private static int m46836c(int i, float f, float f2, boolean z) {
        float f3 = (float) i;
        int round = Math.round(f3 * f);
        int round2 = Math.round(f3 * f2);
        int i2 = i - round;
        if (round2 <= i2) {
            return round2;
        }
        C59104x c = f69264g.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ServerImagePreprocessor");
        C59052c cVar = (C59052c) c;
        cVar.mo56378ag(C38505d.f101864b, 202135713);
        cVar.mo56380ai(C58979ad.FULL);
        ((C59052c) cVar.mo56372aa(49878)).mo56361N(true != z ? "Had to clamp. userVisibleRegion=(left=%s, width=%s), Original cropped width=%s, bitmap x offset=%s, bitmap width=%s" : "Had to clamp. userVisibleRegion=(top=%s, height=%s), Original cropped height=%s, bitmap y offset=%s, bitmap height=%s", C61301b.m93812a(Float.valueOf(f)), C61301b.m93812a(Float.valueOf(f2)), C61301b.m93812a(Integer.valueOf(i2)), C61301b.m93812a(Integer.valueOf(round)), C61301b.m93812a(Integer.valueOf(i)));
        return i2;
    }

    /* renamed from: d */
    private final C60870cx m46837d(Bitmap bitmap, Rect rect) {
        C25414l lVar = new C25414l(bitmap, rect);
        return C60856cj.m92904m(C47810es.m84978r(lVar), this.f69271h);
    }

    /* renamed from: a */
    public final C60870cx mo30471a(Bitmap bitmap, RectF rectF) {
        Size size;
        C60870cx cxVar;
        Rect rect;
        Bitmap bitmap2 = bitmap;
        RectF rectF2 = rectF;
        C58976aa aaVar = C58975e.f156826a;
        bitmap.getWidth();
        bitmap.getHeight();
        rectF.width();
        rectF.height();
        if (this.f69265a.mo31462g(C26239a.ENABLE_MOBILE_STARBURST_V5_WITHOUT_BYTES_IN_LENS_REQUEST)) {
            Size size2 = new Size(bitmap.getWidth(), bitmap.getHeight());
            Rect b = m46835b(size2, rectF2);
            boolean equals = size2.equals(new Size(b.width(), b.height()));
            long e = this.f69270f.mo26873e();
            if (!equals) {
                cxVar = m46837d(bitmap2, b);
                size = size2;
            } else {
                int width = b.width();
                float height = (float) b.height();
                double a = this.f69265a.mo31455a(C26239a.f71320P);
                if (((double) (height / ((float) width))) < a) {
                    size = size2;
                    rect = b;
                } else {
                    int i = b.left;
                    int i2 = b.right;
                    int i3 = (int) (height * 0.4f);
                    int i4 = b.top;
                    size = size2;
                    double d = (double) width;
                    Double.isNaN(d);
                    int i5 = ((int) (a * d)) / 2;
                    rect = new Rect(i, Math.max(i4, i3 - i5), i2, Math.min(b.bottom, i3 + i5));
                }
                cxVar = m46837d(bitmap2, rect);
            }
            long e2 = this.f69270f.mo26873e();
            C60870cx b2 = C47638k.m84751b(cxVar, this.f69269e.mo32036b()).mo51521b(new C25415m(this, e2, cxVar), this.f69271h);
            return C47638k.m84751b(cxVar, b2).mo51520a(new C25412j(this, b2, size, e, cxVar, b), this.f69272i);
        }
        C25413k kVar = new C25413k(this, bitmap2, rectF2);
        return C60856cj.m92904m(C47810es.m84978r(kVar), this.f69272i);
    }
}
