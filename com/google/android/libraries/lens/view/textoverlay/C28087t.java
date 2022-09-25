package com.google.android.libraries.lens.view.textoverlay;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Size;
import android.view.View;
import androidx.lifecycle.C2333ah;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.common.p1998a.C24096d;
import com.google.android.libraries.lens.p2014e.p2015a.C24195n;
import com.google.android.libraries.lens.p2014e.p2015a.C24197p;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.lens.view.textoverlay.t */
/* compiled from: PG */
public final /* synthetic */ class C28087t implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C28093z f76442a;

    public /* synthetic */ C28087t(C28093z zVar) {
        this.f76442a = zVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C28093z zVar = this.f76442a;
        C58485gu guVar = (C58485gu) obj;
        View findViewById = zVar.f76449b.requireView().findViewById(R.id.lens_text_to_speech_highlights);
        if (findViewById != null) {
            if (guVar.isEmpty()) {
                C28067ab abVar = zVar.f76463p;
                if (abVar != null) {
                    abVar.mo33525a();
                    return;
                }
                return;
            }
            if (zVar.f76463p == null) {
                zVar.f76463p = new C28067ab(zVar.f76449b.getContext());
                findViewById.setBackground(zVar.f76463p);
            }
            Size size = new Size(findViewById.getWidth(), findViewById.getHeight());
            C28067ab abVar2 = zVar.f76463p;
            if (!C58597ky.m90218i(abVar2.f76387b, guVar)) {
                abVar2.f76387b = guVar;
                Path path = new Path();
                C58485gu guVar2 = abVar2.f76387b;
                int size2 = guVar2.size();
                int i = 0;
                while (i < size2) {
                    C24197p pVar = (C24197p) guVar2.get(i);
                    C24195n nVar = pVar.f66137b;
                    if (nVar == null) {
                        nVar = C24195n.f66127f;
                    }
                    RectF rectF = new RectF((float) ((int) (nVar.f66129a * ((float) size.getWidth()))), (float) ((int) (nVar.f66130b * ((float) size.getHeight()))), (float) ((int) (nVar.f66131c * ((float) size.getWidth()))), (float) ((int) (nVar.f66132d * ((float) size.getHeight()))));
                    C24096d dVar = abVar2.f76386a;
                    C24195n nVar2 = pVar.f66137b;
                    if (nVar2 == null) {
                        nVar2 = C24195n.f66127f;
                    }
                    float f = nVar2.f66133e;
                    Matrix matrix = new Matrix();
                    RectF rectF2 = new RectF();
                    Path path2 = new Path();
                    rectF2.set(rectF.left - ((float) dVar.f65804a), rectF.top - ((float) dVar.f65805b), rectF.right + ((float) dVar.f65804a), rectF.bottom + ((float) dVar.f65805b));
                    float f2 = (float) dVar.f65806c;
                    path2.addRoundRect(rectF2, f2, f2, Path.Direction.CW);
                    if (f != 0.0f) {
                        matrix.reset();
                        matrix.postRotate(f, rectF2.centerX(), rectF2.centerY());
                        path2.transform(matrix);
                    }
                    path.addPath(path2);
                    i++;
                }
                abVar2.f76388c = path;
                abVar2.invalidateSelf();
            }
        }
    }
}
