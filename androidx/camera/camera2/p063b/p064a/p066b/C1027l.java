package androidx.camera.camera2.p063b.p064a.p066b;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.p069a.C1347cg;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: androidx.camera.camera2.b.a.b.l */
/* compiled from: PG */
public final class C1027l {

    /* renamed from: a */
    public static final C1347cg f3156a;

    static {
        ArrayList arrayList = new ArrayList();
        if (C1035t.f3166a.contains(Build.MODEL) && "Google".equals(Build.MANUFACTURER)) {
            arrayList.add(new C1035t());
        }
        if (C1029n.m3026a()) {
            arrayList.add(new C1029n());
        }
        C1039x.m3030a();
        if (C1028m.m3024b() || C1028m.m3025c() || C1028m.m3023a()) {
            arrayList.add(new C1028m());
        }
        if (C1026k.f3155a.contains(Build.MODEL.toUpperCase(Locale.US))) {
            arrayList.add(new C1026k());
        }
        if (C1041z.m3031a()) {
            arrayList.add(new C1041z());
        }
        if ("SAMSUNG".equals(Build.MANUFACTURER.toUpperCase(Locale.US)) && Build.MODEL.toUpperCase(Locale.US).startsWith("SM-A716")) {
            arrayList.add(new C1012ab());
        }
        if (C1030o.m3028a() || C1030o.m3029b()) {
            arrayList.add(new C1030o());
        }
        if (C1031p.f3161a.contains(new Pair(Build.MANUFACTURER.toLowerCase(Locale.US), Build.MODEL.toLowerCase(Locale.US)))) {
            arrayList.add(new C1031p());
        }
        if (C1011aa.m3021a()) {
            arrayList.add(new C1011aa());
        }
        if (C1014ad.f3152a.contains(Build.MODEL.toLowerCase(Locale.US))) {
            arrayList.add(new C1014ad());
        }
        f3156a = new C1347cg(arrayList);
    }
}
