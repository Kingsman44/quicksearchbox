package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.p063b.p064a.C1068k;
import androidx.camera.camera2.p063b.p064a.p067c.C1056n;
import androidx.camera.core.C1477bw;
import androidx.camera.core.p069a.C1347cg;
import androidx.camera.core.p069a.C1364cx;
import androidx.camera.core.p069a.C1387n;
import androidx.camera.core.p069a.C1388o;
import androidx.camera.core.p069a.C1389p;
import com.google.common.util.concurrent.C60870cx;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.b.br */
/* compiled from: PG */
final class C1122br {

    /* renamed from: g */
    private static final Set f3328g = Collections.unmodifiableSet(EnumSet.of(C1388o.PASSIVE_FOCUSED, C1388o.PASSIVE_NOT_FOCUSED, C1388o.LOCKED_FOCUSED, C1388o.LOCKED_NOT_FOCUSED));

    /* renamed from: h */
    private static final Set f3329h = Collections.unmodifiableSet(EnumSet.of(C1389p.CONVERGED, C1389p.UNKNOWN));

    /* renamed from: i */
    private static final Set f3330i;

    /* renamed from: j */
    private static final Set f3331j;

    /* renamed from: a */
    public final C1217t f3332a;

    /* renamed from: b */
    public final C1056n f3333b;

    /* renamed from: c */
    public final C1347cg f3334c;

    /* renamed from: d */
    public final Executor f3335d;

    /* renamed from: e */
    public final boolean f3336e;

    /* renamed from: f */
    public int f3337f = 1;

    static {
        Set unmodifiableSet = Collections.unmodifiableSet(EnumSet.of(C1387n.CONVERGED, C1387n.FLASH_REQUIRED, C1387n.UNKNOWN));
        f3330i = unmodifiableSet;
        EnumSet copyOf = EnumSet.copyOf(unmodifiableSet);
        copyOf.remove(C1387n.FLASH_REQUIRED);
        copyOf.remove(C1387n.UNKNOWN);
        f3331j = Collections.unmodifiableSet(copyOf);
    }

    public C1122br(C1217t tVar, C1068k kVar, C1347cg cgVar, Executor executor) {
        boolean z = true;
        this.f3332a = tVar;
        Integer num = (Integer) kVar.mo3785a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f3336e = (num == null || num.intValue() != 2) ? false : z;
        this.f3335d = executor;
        this.f3334c = cgVar;
        this.f3333b = new C1056n(cgVar);
    }

    /* renamed from: a */
    static C60870cx m3143a(long j, C1217t tVar, C1115bk bkVar) {
        C1116bl blVar = new C1116bl(j, bkVar);
        tVar.f3562a.mo4029a(blVar);
        return blVar.f3315b;
    }

    /* renamed from: b */
    static boolean m3144b(TotalCaptureResult totalCaptureResult, boolean z) {
        boolean z2;
        if (totalCaptureResult == null) {
            return false;
        }
        C1131c cVar = new C1131c(C1364cx.f3852a, totalCaptureResult);
        boolean z3 = cVar.mo3896e() == 2 || cVar.mo3896e() == 1 || f3328g.contains(cVar.mo3894c());
        int intValue = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue();
        boolean z4 = !z ? intValue == 0 || f3330i.contains(cVar.mo3893b()) : intValue == 0 || f3331j.contains(cVar.mo3893b());
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_MODE)).intValue() != 0 && !f3329h.contains(cVar.mo3895d())) {
            z2 = false;
        } else {
            z2 = true;
        }
        C1477bw.m3978a("Camera2CapturePipeline", "checkCaptureResult, AE=" + cVar.mo3893b() + " AF =" + cVar.mo3894c() + " AWB=" + cVar.mo3895d());
        if (!z3 || !z4 || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    static boolean m3145c(int i, TotalCaptureResult totalCaptureResult) {
        if (i == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            return num != null && num.intValue() == 4;
        } else if (i == 1) {
            return true;
        } else {
            if (i == 2) {
                return false;
            }
            throw new AssertionError(i);
        }
    }
}
