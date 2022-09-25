package androidx.camera.core.p069a;

import android.util.ArrayMap;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.camera.core.a.cx */
/* compiled from: PG */
public class C1364cx {

    /* renamed from: a */
    public static final C1364cx f3852a = new C1364cx(new ArrayMap());

    /* renamed from: b */
    protected final Map f3853b;

    protected C1364cx(Map map) {
        this.f3853b = map;
    }

    /* renamed from: c */
    public static C1364cx m3727c(C1364cx cxVar) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : cxVar.mo4258e()) {
            arrayMap.put(str, cxVar.mo4257d(str));
        }
        return new C1364cx(arrayMap);
    }

    /* renamed from: d */
    public final Object mo4257d(String str) {
        return this.f3853b.get(str);
    }

    /* renamed from: e */
    public final Set mo4258e() {
        return this.f3853b.keySet();
    }

    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}
