package com.google.android.libraries.componentview.components.elements;

import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.view.View;
import com.google.android.libraries.componentview.components.base.C20061bs;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.elements.p1696a.C20395t;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.componentview.components.elements.be */
/* compiled from: PG */
public class C20431be extends C20061bs {

    /* renamed from: a */
    private static final float f57451a = ((float) Math.toDegrees(Math.atan(1.7194719314575195d)));

    public C20431be(Context context, C56425d dVar, C20601ca caVar, C20566at atVar) {
        super(context, dVar, caVar);
    }

    /* renamed from: e */
    public final View mo25110e(Context context) {
        View view = new View(context);
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        RectF rectF = new RectF(-6.0f, 0.0f, 6.0f, 12.0f);
        float f = f57451a;
        path.arcTo(rectF, 270.0f, f, false);
        path.lineTo(24.0f, 36.0f);
        path.lineTo(5.21f, 68.97f);
        path.arcTo(new RectF(-6.0f, 60.0f, 6.0f, 72.0f), 90.0f - f, f, false);
        path.lineTo(0.0f, 0.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new PathShape(path, 24.0f, 72.0f));
        shapeDrawable.getPaint().setColor(-649951756);
        view.setBackground(shapeDrawable);
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20395t.f57362d);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C20395t tVar = (C20395t) obj;
        if ((tVar.f57364a & 1) != 0) {
            C19916aq aqVar = tVar.f57365b;
            if (aqVar == null) {
                aqVar = C19916aq.f55703s;
            }
            mo25249w(aqVar);
        }
    }
}
