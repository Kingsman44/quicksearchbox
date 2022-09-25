package androidx.camera.camera2.p063b.p064a.p066b;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.camera.camera2.p063b.p064a.C1068k;
import androidx.camera.core.p069a.C1346cf;

/* renamed from: androidx.camera.camera2.b.a.b.a */
/* compiled from: PG */
public final class C1010a implements C1346cf {

    /* renamed from: a */
    public final Range f3151a;

    public C1010a(C1068k kVar) {
        Range[] rangeArr = (Range[]) kVar.mo3785a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        Range range = null;
        if (!(rangeArr == null || (r1 = rangeArr.length) == 0)) {
            for (Range range2 : rangeArr) {
                Range range3 = new Range(Integer.valueOf(((Integer) range2.getLower()).intValue() >= 1000 ? ((Integer) range2.getLower()).intValue() / 1000 : ((Integer) range2.getLower()).intValue()), Integer.valueOf(((Integer) range2.getUpper()).intValue() >= 1000 ? ((Integer) range2.getUpper()).intValue() / 1000 : ((Integer) range2.getUpper()).intValue()));
                if (((Integer) range3.getUpper()).intValue() == 30 && (range == null || ((Integer) range3.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
                    range = range3;
                }
            }
        }
        this.f3151a = range;
    }
}
