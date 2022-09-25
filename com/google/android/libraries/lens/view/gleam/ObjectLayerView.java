package com.google.android.libraries.lens.view.gleam;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.libraries.lens.common.p2002e.C24107a;
import com.google.android.libraries.lens.common.p2002e.C24108b;
import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.android.libraries.lens.view.p2177w.C28185a;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import p3186j$.util.Collection;

/* compiled from: PG */
public final class ObjectLayerView extends FrameLayout implements C24108b {

    /* renamed from: d */
    private static final C58528ij f71940d = C58528ij.m90015O(C25349y.GLEAM, C25349y.NONE, C25349y.DOCUMENT_GLEAM, C25349y.BARCODE_GLEAM, C25349y.PLANAR_GLEAM, C25349y.OUTDOOR_GLEAM, C25349y.OBJECT_REGION_GLEAM, C25349y.MATH_GLEAM);

    /* renamed from: a */
    public C26576ew f71941a;

    /* renamed from: b */
    public boolean f71942b;

    /* renamed from: c */
    public C26457ap f71943c;

    /* renamed from: e */
    private final GestureDetector f71944e;

    /* renamed from: com.google.android.libraries.lens.view.gleam.ObjectLayerView$a */
    /* compiled from: PG */
    final class C26440a implements C47388b {

        /* renamed from: a */
        public final C26441a f71945a;

        /* renamed from: b */
        public final PointF f71946b;

        public C26440a(C26441a aVar, PointF pointF) {
            this.f71945a = aVar;
            this.f71946b = pointF;
        }
    }

    public ObjectLayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f71944e = new GestureDetector(context, new C26572es(this));
    }

    /* renamed from: a */
    public final View mo29503a() {
        return this;
    }

    /* renamed from: b */
    public final C24107a mo29504b() {
        return C24107a.OBJECTS;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C58833ax mo31647c(MotionEvent motionEvent) {
        if (!this.f71942b || this.f71943c == null) {
            return C58836b.f156633a;
        }
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        RectF rectF = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        C26457ap apVar = this.f71943c;
        apVar.getClass();
        C58526ih ihVar = new C58526ih();
        C58800sl lA = ((C58528ij) Collection.EL.stream(apVar.f72053b).filter(C26454am.f72049a).filter(C26455an.f72050a).filter(new C26456ao(pointF)).collect(C58370cn.f155947b)).iterator();
        while (lA.hasNext()) {
            C26447af afVar = (C26447af) lA.next();
            C25349y a = C25349y.m46667a(afVar.f71963a.f68848i);
            if (a == null) {
                a = C25349y.UNRECOGNIZED;
            }
            if (f71940d.contains(a) && rectF.contains(afVar.f71967e) && !C28185a.m52696n(afVar.f71967e, rectF)) {
                ihVar.mo55373c(afVar);
            }
        }
        C58528ij f = ihVar.mo55486f();
        C26576ew ewVar = this.f71941a;
        ewVar.getClass();
        if (f.isEmpty()) {
            return C58836b.f156633a;
        }
        return ewVar.mo31833a((C58528ij) Collection.EL.stream(f).filter(C26575ev.f72435a).collect(C58370cn.f155947b)).mo56105a(ewVar.mo31833a(f));
    }

    /* renamed from: d */
    public final boolean mo29505d(MotionEvent motionEvent) {
        return this.f71944e.onTouchEvent(motionEvent);
    }
}
