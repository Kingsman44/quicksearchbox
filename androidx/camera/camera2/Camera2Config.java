package androidx.camera.camera2;

import androidx.camera.core.C1401ab;
import androidx.camera.core.C1402ac;
import androidx.camera.core.C1403ad;
import androidx.camera.core.p069a.C1339bz;
import androidx.camera.core.p069a.C1343cc;

/* compiled from: PG */
public final class Camera2Config {

    /* compiled from: PG */
    public final class DefaultProvider implements C1402ac {
        public C1403ad getCameraXConfig() {
            return Camera2Config.m2984a();
        }
    }

    /* renamed from: a */
    public static C1403ad m2984a() {
        C0987a aVar = C0987a.f3130a;
        C0993b bVar = C0993b.f3141a;
        C1224c cVar = C1224c.f3603a;
        C1401ab abVar = new C1401ab(C1339bz.m3625g());
        abVar.f3942a.mo4216c(C1403ad.f3943a, C1339bz.f3819a, aVar);
        abVar.f3942a.mo4216c(C1403ad.f3944b, C1339bz.f3819a, bVar);
        abVar.f3942a.mo4216c(C1403ad.f3945c, C1339bz.f3819a, cVar);
        return new C1403ad(C1343cc.m3633m(abVar.f3942a));
    }
}
