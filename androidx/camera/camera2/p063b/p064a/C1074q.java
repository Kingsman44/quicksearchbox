package androidx.camera.camera2.p063b.p064a;

import android.content.Context;
import android.util.ArrayMap;
import java.util.Map;

/* renamed from: androidx.camera.camera2.b.a.q */
/* compiled from: PG */
public final class C1074q {

    /* renamed from: a */
    public final C1077t f3211a;

    /* renamed from: b */
    private final Map f3212b = new ArrayMap(4);

    private C1074q(C1077t tVar) {
        this.f3211a = tVar;
    }

    /* renamed from: b */
    public static C1074q m3045b(Context context) {
        return new C1074q(new C1076s(context));
    }

    /* renamed from: a */
    public final C1068k mo3787a(String str) {
        C1068k kVar;
        synchronized (this.f3212b) {
            kVar = (C1068k) this.f3212b.get(str);
            if (kVar == null) {
                try {
                    C1068k kVar2 = new C1068k(this.f3211a.mo3788a(str));
                    this.f3212b.put(str, kVar2);
                    kVar = kVar2;
                } catch (AssertionError e) {
                    throw new C1062e(e.getMessage(), e);
                }
            }
        }
        return kVar;
    }
}
