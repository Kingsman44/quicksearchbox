package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Size;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.p4522b.C58485gu;
import com.google.protos.p4985f.p4988b.p4992c.C64756d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.dm */
/* compiled from: PG */
public final /* synthetic */ class C115745dm implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C115791fe f321011a;

    public /* synthetic */ C115745dm(C115791fe feVar) {
        this.f321011a = feVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C115791fe feVar = this.f321011a;
        C58485gu guVar = (C58485gu) obj;
        if (feVar.f321099j != null) {
            if (guVar.isEmpty()) {
                C115732d dVar = feVar.f321074F;
                if (dVar != null) {
                    dVar.f320998e = null;
                    dVar.invalidateSelf();
                    return;
                }
                return;
            }
            if (feVar.f321074F == null) {
                feVar.f321074F = new C115732d(feVar.f321208b);
                feVar.f321099j.setBackground(feVar.f321074F);
            }
            Size size = new Size(feVar.f321099j.getWidth(), feVar.f321099j.getHeight());
            C115732d dVar2 = feVar.f321074F;
            Path path = new Path();
            int size2 = guVar.size();
            int i = 0;
            while (i < size2) {
                C64756d dVar3 = (C64756d) guVar.get(i);
                RectF rectF = new RectF((float) ((int) (dVar3.f175540b * ((float) size.getWidth()))), (float) ((int) (dVar3.f175539a * ((float) size.getHeight()))), (float) ((int) ((dVar3.f175540b + dVar3.f175541c) * ((float) size.getWidth()))), (float) ((int) ((dVar3.f175539a + dVar3.f175542d) * ((float) size.getHeight()))));
                C115705c cVar = dVar2.f320996c;
                float f = dVar3.f175543e;
                Matrix matrix = new Matrix();
                RectF rectF2 = new RectF();
                Path path2 = new Path();
                rectF2.set(rectF.left - ((float) cVar.f320904a), rectF.top - ((float) cVar.f320905b), rectF.right + ((float) cVar.f320904a), rectF.bottom + ((float) cVar.f320905b));
                float f2 = (float) cVar.f320906c;
                path2.addRoundRect(rectF2, f2, f2, Path.Direction.CW);
                if (f != 0.0f) {
                    matrix.reset();
                    matrix.postRotate(f, rectF2.centerX(), rectF2.centerY());
                    path2.transform(matrix);
                }
                path.addPath(path2);
                i++;
            }
            dVar2.f320998e = path;
            dVar2.f320997d = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            dVar2.f320997d.addUpdateListener(new C115651a(dVar2));
            dVar2.f320997d.addListener(new C115678b(dVar2));
            dVar2.f320997d.start();
        }
    }
}
