package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.p063b.p064a.C1068k;
import androidx.camera.camera2.p063b.p064a.C1074q;
import androidx.camera.camera2.p063b.p064a.p066b.C1020e;
import androidx.camera.camera2.p063b.p064a.p066b.C1022g;
import androidx.camera.core.C1477bw;
import androidx.camera.core.C1557g;
import androidx.camera.core.C1571u;
import androidx.camera.core.p069a.C1347cg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: androidx.camera.camera2.b.aq */
/* compiled from: PG */
public final class C1094aq {

    /* renamed from: a */
    public final String f3271a;

    /* renamed from: b */
    public final C1068k f3272b;

    /* renamed from: c */
    public final Object f3273c = new Object();

    /* renamed from: d */
    public final C1093ap f3274d;

    /* renamed from: e */
    public final C1347cg f3275e;

    public C1094aq(String str, C1074q qVar) {
        str.getClass();
        this.f3271a = str;
        C1068k a = qVar.mo3787a(str);
        this.f3272b = a;
        this.f3275e = C1022g.m3022a(a);
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            C1477bw.m3983f("Camera2CamcorderProfileProvider", "Camera id is not an integer: " + str + ", unable to create CamcorderProfileProvider");
        }
        C1020e eVar = (C1020e) C1022g.m3022a(a).mo4225a(C1020e.class);
        if (eVar != null) {
            new HashSet(new ArrayList(eVar.f3153a));
        } else {
            Collections.emptySet();
        }
        this.f3274d = new C1093ap(new C1557g(5, (C1571u) null));
    }

    /* renamed from: a */
    public final Integer mo3844a() {
        Integer num = (Integer) this.f3272b.mo3785a(CameraCharacteristics.LENS_FACING);
        num.getClass();
        int intValue = num.intValue();
        if (intValue != 0) {
            return intValue != 1 ? null : 1;
        }
        return 0;
    }
}
