package androidx.camera.camera2.p063b.p064a.p066b;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.p063b.p064a.C1068k;
import androidx.camera.core.p069a.C1347cg;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: androidx.camera.camera2.b.a.b.g */
/* compiled from: PG */
public final class C1022g {
    /* renamed from: a */
    public static C1347cg m3022a(C1068k kVar) {
        ArrayList arrayList = new ArrayList();
        Integer num = (Integer) kVar.mo3785a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null && num.intValue() == 2) {
            arrayList.add(new C1010a(kVar));
        }
        Integer num2 = (Integer) kVar.mo3785a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num2 != null) {
            num2.intValue();
        }
        if (C1038w.f3169a.contains(Build.DEVICE.toLowerCase(Locale.US))) {
            arrayList.add(new C1038w());
        }
        Integer num3 = (Integer) kVar.mo3785a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num3 != null && num3.intValue() == 2) {
            arrayList.add(new C1020e(kVar));
        }
        if (C1036u.f3167a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) kVar.mo3785a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            arrayList.add(new C1036u());
        }
        if (C1021f.f3154a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) kVar.mo3785a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            arrayList.add(new C1021f());
        }
        if (("motorola".equalsIgnoreCase(Build.BRAND) && "MotoG3".equalsIgnoreCase(Build.MODEL)) || (("samsung".equalsIgnoreCase(Build.BRAND) && "SM-G532F".equalsIgnoreCase(Build.MODEL)) || ("samsung".equalsIgnoreCase(Build.BRAND) && "SM-J700F".equalsIgnoreCase(Build.MODEL)))) {
            arrayList.add(new C1016af());
        }
        if (C1032q.f3162a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) kVar.mo3785a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            arrayList.add(new C1032q());
        }
        if (Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) kVar.mo3785a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            arrayList.add(new C1017b());
        }
        Integer num4 = (Integer) kVar.mo3785a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num4 != null && num4.intValue() == 2) {
            arrayList.add(new C1025j());
        }
        Integer num5 = (Integer) kVar.mo3785a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num5 != null && num5.intValue() == 2) {
            arrayList.add(new C1040y());
        }
        Integer num6 = (Integer) kVar.mo3785a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num6 != null && num6.intValue() == 2) {
            arrayList.add(new C1024i());
        }
        boolean z = false;
        if (C1034s.f3165b.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) kVar.mo3785a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            z = true;
        }
        boolean contains = C1034s.f3164a.contains(Build.MODEL.toLowerCase(Locale.US));
        if (z || contains) {
            arrayList.add(new C1034s());
        }
        if (C1037v.f3168a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) kVar.mo3785a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            arrayList.add(new C1037v());
        }
        if (C1033r.f3163a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) kVar.mo3785a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            arrayList.add(new C1033r());
        }
        return new C1347cg(arrayList);
    }
}
